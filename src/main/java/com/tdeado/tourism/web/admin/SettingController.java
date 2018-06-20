package com.tdeado.tourism.web.admin;

import com.google.gson.Gson;
import com.tdeado.tourism.entity.Slideshow;
import com.tdeado.tourism.entity.User;
import com.tdeado.tourism.service.*;
import com.tdeado.tourism.source.SettingData;
import com.tdeado.tourism.utils.StringUtils;
import com.tdeado.tourism.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class SettingController extends BaseController {

    @Autowired
    private SettingService settingService;
    @Autowired
    private SlideshowService slideshowService;

    /**
     * 更新站点设置
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "setting/updataSite", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> updataSite(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String setting = request.getParameter("setting");
        SettingData settingData = new Gson().fromJson(setting, SettingData.class);
        if (settingService.SaveSetting(settingData) != null) {
            return retData("保存成功！", "保存成功！");
        }
        throw new RuntimeException("保存失败");
    }

    /**
     * 更新短信设置
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "setting/updataSiteItem", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> updataSiteItem(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String name = request.getParameter("name");
        String json = request.getParameter("json");
        verifyParam(name,json);
        settingService.updateSetting(name, json);
        return retData("保存成功！", "保存成功！");
    }

    /**
     *
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "setting/getSiteItem", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> getSiteItem(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String name = request.getParameter("name");
        return retData(settingService.getSettingByName(name), "保存成功！");
    }

    @RequestMapping(value = "setting/getSiteInfo", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> getSiteInfo(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        return retData(settingService.getSetting());
    }

    @RequestMapping(value = "setting/addSlide", method = RequestMethod.POST)
    private Map<String, Object> addSlide(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String url = request.getParameter("url");
        String image = request.getParameter("image");
        String starttime = request.getParameter("starttime");
        String endtime = request.getParameter("endtime");
        String isshow = request.getParameter("isshow");
        String sort = request.getParameter("sort");
        if (null == isshow || "".equals(isshow)) {
            isshow = "0";
        }
        verifyParam(name, url, image, starttime, endtime, sort, isshow);
        try {
            DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            Slideshow slideshow = new Slideshow();
            slideshow.setName(name);
            slideshow.setUrl(url);
            slideshow.setImage(image);
            slideshow.setStarttime(LocalDateTime.parse(starttime, df));
            slideshow.setEndtime(LocalDateTime.parse(endtime, df));
            slideshow.setIsshow(Integer.parseInt(isshow));
            slideshow.setSort(Integer.parseInt(sort));
            if (slideshowService.addSlideshow(slideshow)) {
                return retData("添加成功");
            } else {
                throw new RuntimeException("数据库添加失败");
            }
        } catch (Exception e) {
            throw new RuntimeException("数据结构异常");
        }
    }

    @RequestMapping(value = "setting/getSlideList", method = RequestMethod.GET)
    private Map<String, Object> getSlideList(HttpServletRequest request, HttpServletResponse response) {
        List<Slideshow> slideshows = slideshowService.getSlideshow();
        return retData(slideshows);
    }

    @RequestMapping(value = "setting/delSlide", method = RequestMethod.GET)
    private Map<String, Object> delSlide(HttpServletRequest request, HttpServletResponse response) {
        String slideId = request.getParameter("slideId");
        if (slideshowService.delSlideshow(Integer.parseInt(slideId))) {
            return retData("删除成功");
        }
        throw new RuntimeException("删除失败");
    }

    @RequestMapping(value = "setting/editSlide", method = RequestMethod.POST)
    private Map<String, Object> editSlide(HttpServletRequest request, HttpServletResponse response) {
        String slideId = request.getParameter("slideId");
        String name = request.getParameter("name");
        String url = request.getParameter("url");
        String image = request.getParameter("image");
        String starttime = request.getParameter("starttime");
        String endtime = request.getParameter("endtime");
        String isshow = request.getParameter("isshow");
        String sort = request.getParameter("sort");
        if (null == isshow || "".equals(isshow)) {
            isshow = "0";
        }
        verifyParam(slideId, name, url, image, starttime, endtime, sort, isshow);
        try {
            DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            Slideshow slideshow = new Slideshow();
            slideshow.QueryBuild().slideId(Integer.parseInt(slideId));
            slideshow.setSlideId(Integer.parseInt(slideId));
            slideshow.setName(name);
            slideshow.setUrl(url);
            slideshow.setImage(image);
            slideshow.setStarttime(LocalDateTime.parse(starttime, df));
            slideshow.setEndtime(LocalDateTime.parse(endtime, df));
            slideshow.setIsshow(Integer.parseInt(isshow));
            slideshow.setSort(Integer.parseInt(sort));
            if (slideshowService.editSlideshow(slideshow)) {
                return retData("编辑成功");
            } else {
                throw new RuntimeException("数据库编辑失败");
            }
        } catch (Exception e) {
            throw new RuntimeException("数据结构异常" + e.getMessage());
        }
    }

    @RequestMapping(value = "setting/getSlide", method = RequestMethod.GET)
    private Map<String, Object> getSlide(HttpServletRequest request, HttpServletResponse response) {
        String slideId = request.getParameter("slideId");
        verifyParam(slideId);
        Slideshow slideshow = slideshowService.getSlide(Integer.parseInt(slideId));
        if (null != slideshow && !slideshow.getName().equals("")) {
            return retData(slideshow);
        }
        throw new RuntimeException("查询失败，内容不存在");
    }

}
