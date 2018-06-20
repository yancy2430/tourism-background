package com.tdeado.tourism.web.admin;

import com.github.pagehelper.Page;
import com.tdeado.tourism.entity.Admin;
import com.tdeado.tourism.entity.User;
import com.tdeado.tourism.service.AdminService;
import com.tdeado.tourism.service.CateService;
import com.tdeado.tourism.service.ProductService;
import com.tdeado.tourism.service.UserService;
import com.tdeado.tourism.utils.CookieUtils;
import com.tdeado.tourism.utils.StringText;
import com.tdeado.tourism.utils.StringUtils;
import com.tdeado.tourism.utils.ToKenUtils;
import com.tdeado.tourism.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Date;
import java.util.Map;

/**
 * 后台管理
 */
@RestController
@RequestMapping("/admin")
public class AdminController extends BaseController {


    /**
     * 文件上传具体实现方法;
     *
     * @param file
     * @return
     */
    @RequestMapping("/upload")
    @ResponseBody
    public Map<String, Object> handleFileUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String filePath;
        if (!file.isEmpty()) {
            try {
                /*
                 * 这段代码执行完毕之后，图片上传到了工程的跟路径； 大家自己扩散下思维，如果我们想把图片上传到
                 * d:/files大家是否能实现呢？ 等等;
                 * 这里只是简单一个例子,请自行参考，融入到实际中可能需要大家自己做一些思考，比如： 1、文件路径； 2、文件名；
                 * 3、文件格式; 4、文件大小的限制;
                 */
                //获取路径
                // 获取文件名
                String fileName = file.getOriginalFilename();
                // 获取文件的后缀名
                String suffixName = fileName.substring(fileName.lastIndexOf("."));
                // 文件上传后的路径
                filePath = location+"images/"+ToKenUtils.getMD5(new Date().toString())+suffixName;;
                // 解决中文问题，liunx下中文路径，图片显示问题
                // fileName = UUID.randomUUID() + suffixName;
                //组合成图片路径
                File dest = new File(directory+filePath);
                // 检测是否存在目录 没有则创建
                if (!dest.getParentFile().exists()) {
                    dest.getParentFile().mkdirs();
                }
                //创建输入流
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
                System.out.println(file.getName());
                out.write(file.getBytes());//写入文件
                out.flush();
                out.close();//关闭
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return retData("上传失败");
            } catch (IOException e) {
                e.printStackTrace();
                return retData("上传失败");
            }
            class Img {
                private String src;

                public String getSrc() {
                    return src;
                }

                public void setSrc(String src) {
                    this.src = src;
                }
            }
            Img img = new Img();
            img.setSrc(filePath);
            return retData(img,"上传成功");
        } else {
            return retData("上传失败");
        }
    }





}
