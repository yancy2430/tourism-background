package com.tdeado.tourism.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.ProductCollect;
/**
*  @author author
*/
public interface ProductCollectBaseMapper {

    int insertProductCollect(ProductCollect object);

    int updateProductCollect(ProductCollect object);

    List<ProductCollect> queryProductCollect(ProductCollect object);

    ProductCollect queryProductCollectLimit1(ProductCollect object);

}