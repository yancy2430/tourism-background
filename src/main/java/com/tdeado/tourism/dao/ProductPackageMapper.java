package com.tdeado.tourism.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.ProductPackage;
import com.tdeado.tourism.dao.base.ProductPackageBaseMapper;
/**
*  @author 
*/
public interface ProductPackageMapper extends ProductPackageBaseMapper{

    int deleteByProduct(int product_id);

}