package com.tdeado.tourism.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.Slideshow;
/**
*  @author author
*/
public interface SlideshowBaseMapper {

    int insertSlideshow(Slideshow object);

    int updateSlideshow(Slideshow object);

    List<Slideshow> querySlideshow(Slideshow object);

    Slideshow querySlideshowLimit1(Slideshow object);

}