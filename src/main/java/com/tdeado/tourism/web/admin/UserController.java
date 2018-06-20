package com.tdeado.tourism.web.admin;

import com.github.pagehelper.Page;
import com.tdeado.tourism.entity.Admin;
import com.tdeado.tourism.entity.User;
import com.tdeado.tourism.entity.Withdrawal;
import com.tdeado.tourism.service.*;
import com.tdeado.tourism.utils.CookieUtils;
import com.tdeado.tourism.utils.StringText;
import com.tdeado.tourism.utils.StringUtils;
import com.tdeado.tourism.utils.ToKenUtils;
import com.tdeado.tourism.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;

/**
 * 后台管理
 */
@RestController
@RequestMapping("/admin")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private ProductService productService;
    @Autowired
    private CateService cateService;
    @Autowired
    private WithdrawalService withdrawalService;


    @RequestMapping(value = "login",method = {RequestMethod.POST, RequestMethod.GET})
    public Map<String,Object> login(HttpServletRequest request,HttpServletResponse response){
        request.getSession(true);
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Admin admin = adminService.login(username,password);
        String jarkey = ToKenUtils.getMD5(admin.getToken()+new Date().getTime());
        request.getSession().setAttribute(jarkey, admin);
        CookieUtils.setCookie(response,"jarkey",jarkey);
        return retData("登录成功");
    }
    @RequestMapping(value = "islogin",method = {RequestMethod.POST, RequestMethod.GET})
    public Map<String,Object> islogin(HttpServletRequest request,HttpServletResponse response){
        try {
            Cookie cookie = CookieUtils.getCookieFromCookies(request.getCookies(), "jarkey");
            if (null != cookie && !"".equals(cookie.getValue())) {
                Object obj = request.getSession().getAttribute(cookie.getValue());
                if (null != obj) {
                    return retData(obj);
                } else {
                    throw new RuntimeException(StringText.YOU_HAVE_NOT_LOGIN);
                }
            } else {
                throw new RuntimeException(StringText.YOU_HAVE_NOT_LOGIN);
            }

        }catch (Exception e){
            throw new RuntimeException(StringText.YOU_HAVE_NOT_LOGIN);
        }
    }
    /**
     * 获取提现记录列表
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "user/getWithdrawalList", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> getWithdrawalList(HttpServletRequest request, HttpServletResponse response) {
        String page = request.getParameter("page");
        String limit = request.getParameter("limit");
        String key = request.getParameter("key");
        verifyParam(page,limit);
        Withdrawal.QueryBuilder withdrawal = Withdrawal.QueryBuild();
        Page<Withdrawal> withdrawals = (Page<Withdrawal>) withdrawalService.getWithdrawalList(Integer.parseInt(page), Integer.parseInt(limit), withdrawal);
        return retData(withdrawals, withdrawals.getTotal(), "获取用户成功");
    }
    /**
     *更改提现状态
     * id
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "user/withdrawalSuccess", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> withdrawalSuccess(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        verifyParam(id);
        Withdrawal.QueryBuilder withdrawal = Withdrawal.QueryBuild();
        withdrawal.id(Integer.parseInt(id));
        Withdrawal wit = withdrawalService.getWithdrawal(withdrawal);
        if (null!=wit){
            User user = getUser(request);
            wit.setOperatorTime(LocalDateTime.now());
            wit.setOperatorId(user.getUserId());
            wit.setOperatorName(user.getUserName());
            return retData("提现成功");
        }else {
            errorRet("提现失败");
            return null;
        }
    }
    /**
     * 获取一个用户
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "user/getUser", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> getUser(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String userId = request.getParameter("userId");
        User.QueryBuilder user = User.QueryBuild();
        if (StringUtils.isEmpty(userId)) {
            user.userId(Integer.parseInt(userId));
        }
        User u = userService.getUser(user);
        if (null != u && StringUtils.isEmpty(u.getUserName())) {
            return retData(u);
        }
        throw new RuntimeException("获取用户信息失败");
    }

    /**
     * 更新用户资料
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "user/updataUser", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> updataUser(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String userName = request.getParameter("userName");
        String sex = request.getParameter("sex");
        String mobile = request.getParameter("mobile");
        String email = request.getParameter("email");
        String pass = request.getParameter("password");
        String userId = request.getParameter("userId");
        User.QueryBuilder user = User.QueryBuild();
        if (!StringUtils.isEmpty(userId)) {
            throw new RuntimeException("userId参数错误" + userId);
        }
        user.userId(Integer.parseInt(userId));
        if (StringUtils.isEmpty(userName)) {
            user.setUserName(userName);
        }
        if (StringUtils.isEmpty(sex)) {
            user.setSex(Integer.parseInt(sex));
        }
        if (StringUtils.isEmpty(mobile)) {
            user.setUserMobile(mobile);
        }
        if (StringUtils.isEmpty(email)) {
            user.setEmail(email);
        }
        if (StringUtils.isEmpty(pass)) {
            user.setPassword(pass);
        }
        if (userService.updataUser(user)) {
            return retData(true, "编辑成功");
        }
        throw new RuntimeException("编辑失败");
    }

    /**
     * 删除用户
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "user/deleteUser", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> deleteUser(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String userId = request.getParameter("userId");
        if (StringUtils.isEmpty(userId)) {
            userService.deleteUser(Integer.parseInt(userId));
            return retData(true);
        }
        throw new RuntimeException("删除失败");
    }


    /**
     * 获取用户列表
     * 参数
     * page 当前页面
     * limit 每页条数
     * key 名字关键词搜索
     * cate 用户组 1普通用户 2同行
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "user/getUserList", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> getUserList(HttpServletRequest request, HttpServletResponse response) {
        String page = request.getParameter("page");
        String limit = request.getParameter("limit");
        String key = request.getParameter("key");
        //1是普通会员 2是同行
        String cate = request.getParameter("cate");
        if (!StringUtils.isEmpty(page) || !StringUtils.isEmpty(limit)) {
            throw new RuntimeException("page或limit参数错误");
        }
        User.QueryBuilder user = User.QueryBuild();
        if (StringUtils.isEmpty(key)) {
            user.fuzzyUserName(key);
        }
        if (StringUtils.isEmpty(cate)) {
            user.userCate(Integer.parseInt(cate));
        }
        user.isdelete(0);
        Page<User> users = (Page<User>) userService.getUserList(Integer.parseInt(page), Integer.parseInt(limit), user);
        return retData(users, users.getTotal(), "获取用户成功");
    }

}
