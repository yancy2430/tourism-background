package com.tdeado.tourism.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.ProductCollect;
import com.tdeado.tourism.dao.base.ProductCollectBaseMapper;
/**
*  @author author
*/
public interface ProductCollectMapper extends ProductCollectBaseMapper{
    int delCollect(Map<String,Integer> map);
}