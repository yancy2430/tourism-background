package com.tdeado.tourism.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.ProductCate;
import com.tdeado.tourism.dao.base.ProductCateBaseMapper;
/**
*  @author 
*/
public interface ProductCateMapper extends ProductCateBaseMapper{

    int deleteProductCate(int id);
}