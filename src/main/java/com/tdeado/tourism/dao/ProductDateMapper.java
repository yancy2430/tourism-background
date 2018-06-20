package com.tdeado.tourism.dao;

import java.util.List;

import com.tdeado.tourism.source.ProductData;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.ProductDate;
import com.tdeado.tourism.dao.base.ProductDateBaseMapper;
/**
*  @author 
*/
public interface ProductDateMapper extends ProductDateBaseMapper{
    int insertProductDateList(List<ProductData.GroupdateBean.ListBean> list);
    int deleteByProduct(int product_id);
}