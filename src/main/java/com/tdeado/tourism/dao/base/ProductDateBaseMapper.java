package com.tdeado.tourism.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.ProductDate;
/**
*  @author author
*/
public interface ProductDateBaseMapper {

    int insertProductDate(ProductDate object);

    int updateProductDate(ProductDate object);

    List<ProductDate> queryProductDate(ProductDate object);

    ProductDate queryProductDateLimit1(ProductDate object);

}