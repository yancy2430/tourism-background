package com.tdeado.tourism.service;

import com.tdeado.tourism.entity.Product;
import com.tdeado.tourism.source.ProductData;

import java.util.List;

public interface ProductService {

    /**
     * 添加产品
     * @return
     */
    boolean addProduct(ProductData productData);

    /**
     * 获取产品列表
     * @param product
     * @return
     */
    List<Product> getProductList(int page, int pagesize, Product product);

    /**
     * 获取产品
     * @param product
     * @return
     */
    ProductData getProduct(Product product);


    boolean updateProduct(Product product);


    public boolean editProduct(ProductData productData, int productId);

}
