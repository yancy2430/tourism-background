package com.tdeado.tourism.service.impl;

import com.github.pagehelper.PageHelper;
import com.tdeado.tourism.dao.ProductCateMapper;
import com.tdeado.tourism.dao.ProductMapper;
import com.tdeado.tourism.entity.Product;
import com.tdeado.tourism.entity.ProductCate;
import com.tdeado.tourism.service.CateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CateServiceImpl implements CateService {
    @Autowired
    private ProductCateMapper productCateMapper;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<ProductCate> getCateList() {
        return productCateMapper.queryProductCate(null);
    }

    @Override
    public ProductCate getCate(int id) {
        ProductCate.QueryBuilder cate = ProductCate.QueryBuild();
        cate.cateId(id);
        ProductCate productCate = productCateMapper.queryProductCateLimit1(cate);
        if (null!=productCate && !"".equals(productCate.getCateName())){
            return productCate;
        }else {
            throw new RuntimeException("分类不存在");
        }
    }

    @Override
    public boolean updataCate(ProductCate productCate) {
        int i = productCateMapper.updateProductCate(productCate);
        System.out.printf(i+"==="+productCate.toString()+"==="+productCate.QueryBuild().toString());
        if (0<i){
            return true;
        }
        throw new RuntimeException("编辑分类失败");
    }

    @Override
    public boolean deleteCate(int id) {
        List<Product> products =productMapper.queryProduct(Product.QueryBuild().productCate(id));
        if (products.size()>0){
            throw new RuntimeException("删除失败，请先删除分类下产品");
        }
        if (0<productCateMapper.deleteProductCate(id)){
            return true;
        }
        throw new RuntimeException("删除失败，分类不存在");
    }

    @Override
    public ProductCate addCate(ProductCate cate) {
        int i=productCateMapper.insertProductCate(cate);
        if (i>0){
            return cate;
        }
        throw new RuntimeException("添加分类失败");
    }
}
