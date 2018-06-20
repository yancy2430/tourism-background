package com.tdeado.tourism.web.admin;

import com.github.pagehelper.Page;
import com.google.gson.Gson;
import com.tdeado.tourism.entity.Product;
import com.tdeado.tourism.entity.ProductCate;
import com.tdeado.tourism.service.CateService;
import com.tdeado.tourism.service.ProductService;
import com.tdeado.tourism.source.ProductData;
import com.tdeado.tourism.utils.StringUtils;
import com.tdeado.tourism.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * 后台产品管理
 */
@RestController
@RequestMapping("/admin")
public class ProductController  extends BaseController{
    @Autowired
    private ProductService productService;

    @Autowired
    private CateService cateService;

/*****************************************产品******************************/
    /**
     * 获取产品分类列表
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "product/getProductCateList", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> getProductCateList(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");

        List<ProductCate> productCates = cateService.getCateList();
        return retData(productCates, "分类获取成功");
    }

    /**
     * 获取单个产品分类
     */
    @RequestMapping(value = "product/getProductCate", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> getProductCate(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String cateId = request.getParameter("cateId");
        if (StringUtils.isEmpty(cateId)) {
            ProductCate productCate = cateService.getCate(Integer.parseInt(cateId));
            return retData(productCate, "分类获取成功");
        } else {
            throw new RuntimeException("cateId参数错误");
        }
    }

    /**
     * 更新分类
     */
    @RequestMapping(value = "product/updataProductCate", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> updataProductCate(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String cateId = request.getParameter("cateId");
        String cateName = request.getParameter("cateName");
        String sort = request.getParameter("sort");
        String cateUpid = request.getParameter("cateUpid");
        verifyParam(cateId, cateName);
        ProductCate productCate = new ProductCate();
        productCate.setCateName(cateName);
        productCate.setCateId(Integer.parseInt(cateId));
        if (StringUtils.isEmpty(cateUpid))
            productCate.setCateUpid(Integer.parseInt(cateUpid));
        if (StringUtils.isEmpty(sort))
            productCate.setSort(Integer.parseInt(sort));
        productCate.QueryBuild().cateId(Integer.parseInt(cateId));
        if (cateService.updataCate(productCate)) {
            return retData(true, "更新成功");
        } else {
            throw new RuntimeException("更新失败");
        }
    }

    /**
     * 添加分类
     */
    @RequestMapping(value = "product/addProductCate", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> addProductCate(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String cateName = request.getParameter("cateName");
        verifyParam(cateName);

        ProductCate productCate = new ProductCate();
        productCate.setCateName(cateName);
        ProductCate cate = cateService.addCate(productCate);
        return retData(cate, "分类添加成功");
    }

    /**
     * 删除分类
     */
    @RequestMapping(value = "product/delProductCate", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> delProductCate(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String cateId = request.getParameter("cateId");
        verifyParam(cateId);
        if (cateService.deleteCate(Integer.parseInt(cateId))) {
            return retData(true, "删除成功");
        }
        throw new RuntimeException("删除失败");
    }

    /**
     * 添加产品
     */
    @RequestMapping(value = "product/addproduct", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> addproduct(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String product = request.getParameter("product");
        try {
            ProductData productData = new Gson().fromJson(product,ProductData.class);
            verifyParam(product);
            if (productService.addProduct(productData)){
                return retData(null,"添加成功");
            }
            throw new RuntimeException("添加失败");
        }catch (Exception e){
            throw new RuntimeException("数据结构错误，请填写完整");
        }
    }
    /**
     * 编辑产品
     */
    @RequestMapping(value = "product/editproduct", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> editproduct(HttpServletRequest request, HttpServletResponse response) {
        String product = request.getParameter("product");
        String product_id = request.getParameter("product_id");
        verifyParam(product_id,product);
        try {
            ProductData productData = new Gson().fromJson(product,ProductData.class);
            if (productService.editProduct(productData,Integer.parseInt(product_id))){
                return retData(null,"编辑成功");
            }
            throw new RuntimeException("编辑失败");
        }catch (Exception e){
            throw new RuntimeException("编辑失败"+e.getMessage());
        }
    }
    /**
     * 产品列表
     */
    @RequestMapping(value = "product/productlist", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> productlist(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String product_cate = request.getParameter("product_cate");
        String isshow = request.getParameter("isshow");
        String product_no = request.getParameter("product_no");
        String product_name = request.getParameter("product_name");
        String page = request.getParameter("page");
        String limit = request.getParameter("limit");
        Product.QueryBuilder product = Product.QueryBuild();
        verifyParam(page,limit);

        if (StringUtils.isEmpty(isshow)){
            product.isshow(Integer.parseInt(isshow));
        }
        if (StringUtils.isEmpty(product_cate)){
            product.productCate(Integer.parseInt(product_cate));
        }
        if (StringUtils.isEmpty(product_no)){
            product.fuzzyProductNo(product_no);
        }
        if (StringUtils.isEmpty(product_name)){
            product.fuzzyProductName(product_name);
        }

        List<Product> list = productService.getProductList(Integer.parseInt(page),Integer.parseInt(limit),product);

        Page p = (Page) list;
        return retData(list,p.getTotal());
    }

    /**
     * 改变状态
     */
    @RequestMapping(value = "product/updateStatus", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> updateStatus(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String productId = request.getParameter("product_id");
        String isshow = request.getParameter("isshow");
        verifyParam(productId,isshow);

        Product.QueryBuilder product = Product.QueryBuild();
        product.setIsshow(Integer.parseInt(isshow));
        product.productId(Integer.parseInt(productId));

        if (productService.updateProduct(product)){
            return retData("改变状态成功");
        }
        throw new RuntimeException("改变状态失败");

    }

    @RequestMapping(value = "product/delProduct", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> delProduct(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String productId = request.getParameter("product_id");
        verifyParam(productId);
        Product.QueryBuilder product = Product.QueryBuild();
        product.productId(Integer.parseInt(productId));
        product.setIsdel(1);
        if (productService.updateProduct(product)){
            return retData("删除成功");
        }
        throw new RuntimeException("删除失败");
    }
    @RequestMapping(value = "product/getProduct", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> getProduct(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String productId = request.getParameter("product_id");
        verifyParam(productId);
        Product p = new Product();
        p.setProductId(Integer.parseInt(productId));
        ProductData productData = productService.getProduct(p);
        if (null!=productData){
            return retData(productData);
        }
        throw new RuntimeException("删除失败");
    }


}
