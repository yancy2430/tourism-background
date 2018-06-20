package com.tdeado.tourism.web;

import com.tdeado.tourism.utils.ToKenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/uploadfile")
public class UploadController extends BaseController{


    /**
     * 文件上传具体实现方法;
     *
     * @param file
     * @return
     */
    @RequestMapping("/image")
    @ResponseBody
    public Map<String, Object> handleFileUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request, HttpServletResponse response) {
        String filePath;
        if (!file.isEmpty()) {

            try {
                //获取路径
                // 获取文件名
                String fileName = file.getOriginalFilename();
                // 获取文件的后缀名
                String suffixName = fileName.substring(fileName.lastIndexOf("."));
                // 文件上传后的路径
                filePath = location+"images/"+ ToKenUtils.getMD5(new Date().toString())+suffixName;;
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
