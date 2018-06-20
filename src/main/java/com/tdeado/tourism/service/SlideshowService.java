package com.tdeado.tourism.service;

import com.tdeado.tourism.entity.Slideshow;

import java.util.List;

public interface SlideshowService {
    /**
     * 添加
     * @param slideshow
     * @return
     */
    boolean addSlideshow(Slideshow slideshow);

    /**
     * 查询
     * @return
     */
    List<Slideshow> getSlideshow();


    Slideshow getSlide(int id);

    /**
     * 编辑
     * @param slideshow
     * @return
     */
    boolean editSlideshow(Slideshow slideshow);

    /**
     * 删除
     * @param id
     * @return
     */
    boolean delSlideshow(int id);

}
