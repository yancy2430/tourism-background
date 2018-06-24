package com.tdeado.tourism.service.impl;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.tdeado.tourism.dao.ProductDateMapper;
import com.tdeado.tourism.dao.ProductMapper;
import com.tdeado.tourism.dao.ProductPackageMapper;
import com.tdeado.tourism.entity.Product;
import com.tdeado.tourism.entity.ProductDate;
import com.tdeado.tourism.entity.ProductPackage;
import com.tdeado.tourism.service.ProductService;
import com.tdeado.tourism.source.ProductData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductDateMapper productDateMapper;
    @Autowired
    private ProductPackageMapper productPackageMapper;
    @Transactional
    @Override
    public boolean addProduct(ProductData productData) {
        Product product = new Product();
        product.setAddtime(LocalDateTime.now());
        product.setBuyfew(0);
        product.setComments(0);
        product.setCommissionRatio(0.00);
        product.setViews(0);
        product.setHotline(productData.getProductinfo().getHotline());
        product.setIsshow(Integer.parseInt(productData.getProductinfo().getIsshow()));
        product.setOperate(productData.getProductinfo().getOperate());
        product.setPrincipal(productData.getProductinfo().getPrincipal());
        product.setProductCate(Integer.parseInt(productData.getProductinfo().getProduct_cate()));
        product.setProductTag(productData.getProductinfo().getProduct_tag());
        product.setProductName(productData.getProductinfo().getProduct_name());
        product.setSketch(productData.getProductinfo().getSketch());
        product.setImages(new Gson().toJson(productData.getProductinfo().getImages()));
        product.setTrip(productData.getTripInfo());
        product.setOrigin(productData.getProductinfo().getOrigin());
        product.setDestination(productData.getProductinfo().getDestination());
        product.setNotmobile(Integer.parseInt(productData.getProductinfo().getNotmobile()));
        product.setProductNo(productData.getProductinfo().getProduct_no());
        product.setProductCateName(productData.getProductinfo().getProduct_cate_name());
        product.setContent(productData.getProductinfo().getContent());
        int id = 0;
        try {
            id = productMapper.insertProduct(product);
        }catch (Exception e){
            throw new RuntimeException("数据插入失败"+e.getMessage());
        }
        if (id < 1) {
            throw new RuntimeException("数据库添加产品失败");
        }
        for (ProductData.PackagelistBean packagelistBean : productData.getPackagelist()) {
            ProductPackage packageBean = new ProductPackage();
            packageBean.setContent(new Gson().toJson(packagelistBean.getContent()));
            packageBean.setIsshow(Integer.parseInt(packagelistBean.getIsshow()));
            packageBean.setNotchildren(Integer.parseInt(packagelistBean.getNotchildren()));
            packageBean.setPackageName(packagelistBean.getPackage_name());
            packageBean.setPackageNo(packagelistBean.getPackage_no());
            packageBean.setProductId(product.getProductId());
            int s = productPackageMapper.insertProductPackage(packageBean);
            if (s < 1) {
                throw new RuntimeException("数据库添加套餐失败");
            }
            System.out.printf(packageBean.getPackageNo() + "");
            List<ProductData.GroupdateBean.ListBean> list = new ArrayList<>();
            List<ProductData.GroupdateBean> groupdateBeans = productData.getGroupdate();
            for (int i = 0; i < groupdateBeans.size(); i++) {
                for (int i1 = 0; i1 < groupdateBeans.get(i).getList().size(); i1++) {
                    if (groupdateBeans.get(i).getList().get(i1).getPackage_name().equals(packageBean.getPackageName())){
                        ProductDate productDate = new ProductDate();
                        productDate.setAdultPrice(new BigDecimal(groupdateBeans.get(i).getList().get(i1).getAdult_price()));
                        productDate.setChildrenPrice(new BigDecimal(groupdateBeans.get(i).getList().get(i1).getChildren_price()));
                        productDate.setHousingPrice(new BigDecimal(groupdateBeans.get(i).getList().get(i1).getHousing_price()));
                        productDate.setPackageNo(packageBean.getPackageNo());
                        productDate.setProductId(product.getProductId());
                        productDate.setTeamtime(groupdateBeans.get(i).getList().get(i1).getTeamtime());
                        productDate.setPackageName(groupdateBeans.get(i).getList().get(i1).getPackage_name());
                        productDateMapper.insertProductDate(productDate);
                    }
                }
            }
        }
        return true;
    }
    @Transactional
    @Override
    public boolean editProduct(ProductData productData,int productId) {
        Product product = new Product();
        product.QueryBuild().productId(productId);
        product.setProductId(productId);
        product.setAddtime(LocalDateTime.now());
        product.setBuyfew(0);
        product.setComments(0);
        product.setCommissionRatio(0.00);
        product.setViews(0);
        product.setHotline(productData.getProductinfo().getHotline());
        product.setIsshow(Integer.parseInt(productData.getProductinfo().getIsshow()));
        product.setOperate(productData.getProductinfo().getOperate());
        product.setPrincipal(productData.getProductinfo().getPrincipal());
        product.setProductCate(Integer.parseInt(productData.getProductinfo().getProduct_cate()));
        product.setProductTag(productData.getProductinfo().getProduct_tag());
        product.setProductName(productData.getProductinfo().getProduct_name());
        product.setTrip(productData.getTripInfo());
        product.setOrigin(productData.getProductinfo().getOrigin());
        product.setDestination(productData.getProductinfo().getDestination());
        product.setSketch(productData.getProductinfo().getSketch());
        product.setImages(new Gson().toJson(productData.getProductinfo().getImages()));
        product.setNotmobile(Integer.parseInt(productData.getProductinfo().getNotmobile()));
        product.setProductNo(productData.getProductinfo().getProduct_no());
        product.setProductCateName(productData.getProductinfo().getProduct_cate_name());
        product.setPrice(productData.getProductinfo().getPrice());
        product.setSecurity(productData.getProductinfo().getSecurity());
        System.err.println(productData.getProductinfo().getContent());
        product.setContent(productData.getProductinfo().getContent());
        int id = productMapper.updateProduct(product);
        if (id < 1) {
            throw new RuntimeException("数据库编辑产品失败");
        }
        productPackageMapper.deleteByProduct(product.getProductId());
        productDateMapper.deleteByProduct(product.getProductId());
        for (ProductData.PackagelistBean packagelistBean : productData.getPackagelist()) {
            ProductPackage packageBean = new ProductPackage();
            packageBean.setContent(new Gson().toJson(packagelistBean.getContent()));
            packageBean.setIsshow(Integer.parseInt(packagelistBean.getIsshow()));
            packageBean.setNotchildren(Integer.parseInt(packagelistBean.getNotchildren()));
            packageBean.setPackageNo(packagelistBean.getPackage_no());
            packageBean.setProductId(product.getProductId());
            packageBean.setPackageName(packagelistBean.getPackage_name());
            int s = productPackageMapper.insertProductPackage(packageBean);
            if (s < 1) {
                throw new RuntimeException("数据库添加套餐失败");
            }
            System.out.printf(packageBean.getPackageNo() + "");
            List<ProductData.GroupdateBean.ListBean> list = new ArrayList<>();
            List<ProductData.GroupdateBean> groupdateBeans = productData.getGroupdate();
            for (int i = 0; i < groupdateBeans.size(); i++) {
                for (int i1 = 0; i1 < groupdateBeans.get(i).getList().size(); i1++) {
                    if (groupdateBeans.get(i).getList().get(i1).getPackage_name().equals(packageBean.getPackageName())){
                        ProductDate productDate = new ProductDate();
                        productDate.setAdultPrice(new BigDecimal(groupdateBeans.get(i).getList().get(i1).getAdult_price()));
                        productDate.setChildrenPrice(new BigDecimal(groupdateBeans.get(i).getList().get(i1).getChildren_price()));
                        productDate.setHousingPrice(new BigDecimal(groupdateBeans.get(i).getList().get(i1).getHousing_price()));
                        productDate.setPackageNo(packageBean.getPackageNo());
                        productDate.setTeamtime(groupdateBeans.get(i).getList().get(i1).getTeamtime());
                        productDate.setProductId(product.getProductId());
                        productDate.setPackageName(groupdateBeans.get(i).getList().get(i1).getPackage_name());
                        productDateMapper.insertProductDate(productDate);
                    }
                }
            }
        }
        return true;
    }

    @Override
    public List<Product> getProductList(int page, int pagesize, Product product) {
        product.setIsdel(0);
        PageHelper.startPage(page,pagesize);
        return productMapper.queryProduct(product);
    }


    @Override
    public ProductData getProduct(Product product) {
        ProductData productData = new ProductData();
        Product p =  productMapper.queryProductLimit1(product);
        ProductData.ProductinfoBean productinfoBean = new ProductData.ProductinfoBean();
        productinfoBean.setHotline(p.getHotline());
        productinfoBean.setIsshow(String.valueOf(p.getIsshow()));
        productinfoBean.setNotmobile(String.valueOf(p.getNotmobile()));
        productinfoBean.setOperate(p.getOperate());
        productinfoBean.setPrincipal(p.getPrincipal());
        productinfoBean.setProduct_cate(String.valueOf(p.getProductCate()));
        productinfoBean.setProduct_cate_name(String.valueOf(p.getProductCateName()));
        productinfoBean.setProduct_name(p.getProductName());
        productinfoBean.setProduct_no(p.getProductNo());
        productinfoBean.setProduct_tag(p.getProductTag());
        productinfoBean.setOrigin(p.getOrigin());
        productinfoBean.setDestination(p.getDestination());
        productinfoBean.setSketch(p.getSketch());
        productinfoBean.setPrice(p.getPrice());
        productinfoBean.setContent(p.getContent());
        System.err.println(p.getContent());
        productinfoBean.setSecurity(p.getSecurity());
        JsonParser parser = new JsonParser();
        //将JSON的String 转成一个JsonArray对象
        JsonArray jsonArray = parser.parse(p.getImages()).getAsJsonArray();
        List<String> images = new ArrayList<>();
        for (JsonElement jsonElement : jsonArray) {
            images.add(jsonElement.getAsString());
        }
        productinfoBean.setImages(images);
        productData.setProductinfo(productinfoBean);
        //获取套餐
        ProductPackage productPackage = new ProductPackage();
        productPackage.setProductId(p.getProductId());
        List<ProductPackage> packageList = productPackageMapper.queryProductPackage(productPackage);
        List<ProductData.PackagelistBean> packagelistBeans = new ArrayList<>();


        for (ProductPackage aPackage : packageList) {
            ProductData.PackagelistBean packagelistBean = new ProductData.PackagelistBean();
            packagelistBean.setIsshow(String.valueOf(aPackage.getIsshow()));
            packagelistBean.setNotchildren(String.valueOf(aPackage.getNotchildren()));
            packagelistBean.setPackage_name(aPackage.getPackageName());
            packagelistBean.setPackage_no(aPackage.getPackageNo());
            List<ProductData.PackagelistBean.ContentBean> persons =new Gson().fromJson(aPackage.getContent(), new TypeToken<List<ProductData.PackagelistBean.ContentBean>>() {}.getType());
            packagelistBean.setContent(persons);
            packagelistBeans.add(packagelistBean);

        }
        productData.setPackagelist(packagelistBeans);
        //团期转换
        List<ProductData.GroupdateBean> groupdateBeans = new ArrayList<>();
        ProductDate pd = new ProductDate();
        pd.setProductId(p.getProductId());
        pd.setProductId(p.getProductId());
        List<ProductDate> pdlist = productDateMapper.queryProductDate(pd);
        //用循环 + if判断
        Map<String,List<ProductData.GroupdateBean.ListBean>> map = new HashMap<>();
        for (ProductDate productDate : pdlist) {
            if (null!=map.get(productDate.getTeamtime())){
                ProductData.GroupdateBean.ListBean listBean = new ProductData.GroupdateBean.ListBean();
                listBean.setAdult_price(String.valueOf(productDate.getAdultPrice()));
                listBean.setChildren_price(String.valueOf(productDate.getChildrenPrice()));
                listBean.setHousing_price(String.valueOf(productDate.getHousingPrice()));
                listBean.setIsshow(String.valueOf(productDate.getIsshow()));
                listBean.setPackage_no(String.valueOf(productDate.getPackageNo()));
                listBean.setProduct_id(String.valueOf(productDate.getProductId()));
                listBean.setPackage_name(productDate.getPackageName());
                listBean.setTeamtime(productDate.getTeamtime());
                map.get(productDate.getTeamtime()).add(listBean);

            }else {
                List<ProductData.GroupdateBean.ListBean> listBeans = new ArrayList<>();
                ProductData.GroupdateBean.ListBean listBean = new ProductData.GroupdateBean.ListBean();
                listBean.setAdult_price(String.valueOf(productDate.getAdultPrice()));
                listBean.setChildren_price(String.valueOf(productDate.getChildrenPrice()));
                listBean.setHousing_price(String.valueOf(productDate.getHousingPrice()));
                listBean.setIsshow(String.valueOf(productDate.getIsshow()));
                listBean.setPackage_no(String.valueOf(productDate.getPackageNo()));
                listBean.setProduct_id(String.valueOf(productDate.getProductId()));
                listBean.setPackage_name(productDate.getPackageName());
                listBean.setTeamtime(productDate.getTeamtime());
                listBeans.add(listBean);
                map.put(productDate.getTeamtime(),listBeans);
            }
        }
        // 遍历方法二
        for (Map.Entry<String, List<ProductData.GroupdateBean.ListBean>> entry : map.entrySet()) {
            groupdateBeans.add(new ProductData.GroupdateBean(entry.getKey(),entry.getValue()));
        }

        //返回数据按照日期降序排
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Collections.sort(groupdateBeans, new Comparator<ProductData.GroupdateBean>(){
            @Override
            public int compare(ProductData.GroupdateBean arg0, ProductData.GroupdateBean arg1) {
                int mark = 1;
                try {
                    Date date0 = sdf.parse(arg0.getDate());
                    Date date1 = sdf.parse(arg1.getDate());
                    if(date0.getTime() < date1.getTime()){
                        mark =  -1;
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return mark;
            }
        });
        productData.setGroupdate(groupdateBeans);
        productData.setTripInfo(p.getTrip());
        return productData;
    }

    @Override
    public boolean updateProduct(Product product) {
        int i =productMapper.updateProduct(product);
        if (i>0){
            return true;
        }
        throw new RuntimeException("更新失败");
    }
}
