package com.tdeado.tourism.web.app;


import com.tdeado.tourism.entity.User;
import com.tdeado.tourism.service.UserService;
import com.tdeado.tourism.utils.CookieUtils;
import com.tdeado.tourism.utils.StringUtils;
import com.tdeado.tourism.utils.ToKenUtils;
import com.tdeado.tourism.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class AppUserController extends BaseController {
    private Map<String,Object> modelMap;

    public AppUserController() {
        this.modelMap = new HashMap<>();

    }
    @Autowired
    private UserService userService;

    @RequestMapping(value = "userlist",method = RequestMethod.GET)
    private Map<String ,Object> userlist(HttpServletRequest request){

        System.out.println(
                CookieUtils.getCookieFromCookies(request.getCookies(),"login").getValue());
        String str = CookieUtils.getCookieFromCookies(request.getCookies(),"login").getValue();
        User user = (User) request.getSession().getAttribute(str);
        if (user!=null && user.getUserName()!=null && !"".equals(user.getUserName())){
            return retData(user);
        }else {
            throw new RuntimeException("您还没有登录，请先登录！");
        }
    }

    @RequestMapping(value = "register",method = RequestMethod.GET)
    public Map<String,Object> register(HttpServletRequest request, HttpServletResponse response){

        String smscode = request.getParameter("smscode");
        if (StringUtils.isEmpty(smscode) && !smscode.equals(request.getSession().getAttribute("sms"))){
            throw new RuntimeException("短信验证码错误");
        }

        User user = new User();
        user.setAvater("https://img2.mukewang.com/54f4294d0001537001000100-100-100.jpg");
        user.setUserName(request.getParameter("username"));
        user.setUserMobile(String.valueOf(new Date().getTime()));
        user.setPassword("123456");
        user.setRandcode("wwww");
        user.setRegtime(LocalDateTime.now());
        user.setUserCate(1);
        user.setToken(ToKenUtils.createToKen());
        user = userService.addUser(user);

        String jarkey = ToKenUtils.getMD5(user.getToken()+new Date().getTime());
        request.getSession().setAttribute(jarkey, user);
        CookieUtils.setCookie(response,"jarkey",jarkey);


        return retData(user,"注册成功");
    }
    @RequestMapping(value = "login",method = {RequestMethod.GET,RequestMethod.POST})
    public Map<String,Object> login(HttpServletRequest request,HttpServletResponse response){
        request.getSession(true);
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = userService.login(username,password);
        String token = ToKenUtils.getMD5(user.getToken()+new Date().getTime());
        request.getSession().setAttribute(token, user);
        CookieUtils.setCookie(response,"token",token);
        return retData(user,"登录成功");
    }
    @RequestMapping(value = "getSmsCode",method = RequestMethod.GET)
    public Map<String,Object> getSmsCode(HttpServletRequest request,HttpServletResponse response){
        String smsCode=new Date().getTime()+"";
        request.getSession().setAttribute("sms",smsCode);
        return retData(smsCode);
    }

}
