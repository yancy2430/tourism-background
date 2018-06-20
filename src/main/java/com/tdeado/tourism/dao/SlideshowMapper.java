package com.tdeado.tourism.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.Slideshow;
import com.tdeado.tourism.dao.base.SlideshowBaseMapper;
/**
*  @author 
*/
public interface SlideshowMapper extends SlideshowBaseMapper{

    int delSlideshow(int id);
}