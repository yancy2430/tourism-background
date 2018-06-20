package com.tdeado.tourism.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.Product;
/**
*  @author author
*/
public interface ProductBaseMapper {

    int insertProduct(Product object);

    int updateProduct(Product object);

    List<Product> queryProduct(Product object);

    Product queryProductLimit1(Product object);

}