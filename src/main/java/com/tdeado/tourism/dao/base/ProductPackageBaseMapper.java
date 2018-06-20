package com.tdeado.tourism.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.ProductPackage;
/**
*  @author author
*/
public interface ProductPackageBaseMapper {

    int insertProductPackage(ProductPackage object);

    int updateProductPackage(ProductPackage object);

    List<ProductPackage> queryProductPackage(ProductPackage object);

    ProductPackage queryProductPackageLimit1(ProductPackage object);

}