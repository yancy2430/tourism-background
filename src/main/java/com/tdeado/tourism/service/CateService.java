package com.tdeado.tourism.service;

import com.tdeado.tourism.entity.ProductCate;
import com.tdeado.tourism.entity.User;

import java.util.List;

public interface CateService {

    /**
     * 获取所有的分类
     * @return
     */
    List<ProductCate> getCateList();


    /**
     * 获取一个分类
     * @return
     */
    ProductCate getCate(int id);

    /**
     * 更新分类
     * @param cate
     * @return
     */
    boolean updataCate(ProductCate cate);

    /**
     * 删除分类
     */
    boolean deleteCate(int id);

    /**
     * 添加分类
     * @param cate
     * @return
     */
    ProductCate addCate(ProductCate cate);
}
