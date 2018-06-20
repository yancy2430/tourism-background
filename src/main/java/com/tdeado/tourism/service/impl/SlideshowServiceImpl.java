package com.tdeado.tourism.service.impl;

import com.github.pagehelper.PageHelper;
import com.tdeado.tourism.dao.SlideshowMapper;
import com.tdeado.tourism.entity.Slideshow;
import com.tdeado.tourism.service.SlideshowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SlideshowServiceImpl implements SlideshowService {

    @Autowired
    SlideshowMapper slideshowMapper;
    @Override
    public boolean addSlideshow(Slideshow slideshow) {
        int i = slideshowMapper.insertSlideshow(slideshow);
        if (i>0){
            return true;
        }
        throw new RuntimeException("数据库添加幻灯片失败");
    }

    @Override
    public List<Slideshow> getSlideshow() {
        return slideshowMapper.querySlideshow(null);
    }

    @Override
    public boolean editSlideshow(Slideshow slideshow) {
        int i = slideshowMapper.updateSlideshow(slideshow);
        return true;
    }
    @Override
    public boolean delSlideshow(int id) {
        int i = slideshowMapper.delSlideshow(id);
        if (i>0){
            return true;
        }
        return false;
    }

    @Override
    public Slideshow getSlide(int id) {
        Slideshow slideshow = new Slideshow();
        slideshow.setSlideId(id);
        slideshow.QueryBuild().slideId(id);
        return slideshowMapper.querySlideshowLimit1(slideshow);
    }
}
