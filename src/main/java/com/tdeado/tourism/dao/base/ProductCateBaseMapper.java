package com.tdeado.tourism.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.ProductCate;
/**
*  @author author
*/
public interface ProductCateBaseMapper {

    int insertProductCate(ProductCate object);

    int updateProductCate(ProductCate object);

    List<ProductCate> queryProductCate(ProductCate object);

    ProductCate queryProductCateLimit1(ProductCate object);

}