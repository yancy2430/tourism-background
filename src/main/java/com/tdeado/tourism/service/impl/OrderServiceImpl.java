package com.tdeado.tourism.service.impl;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.tdeado.tourism.dao.*;
import com.tdeado.tourism.entity.*;
import com.tdeado.tourism.service.OrderService;
import com.tdeado.tourism.service.ProductService;
import com.tdeado.tourism.source.OrderData;
import com.tdeado.tourism.source.OrderInfo;
import com.tdeado.tourism.source.Place;
import com.tdeado.tourism.utils.DateTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductPackageMapper productPackageMapper;
    @Autowired
    private ProductDateMapper productDateMapper;
    @Autowired
    private OrderPayMapper orderPayMapper;
    @Autowired
    private OrderOperateMapper orderOperateMapper;
    @Autowired
    private OrderVisitorsMapper orderVisitorsMapper;

    @Transactional
    @Override
    public boolean addOrder(OrderData orderData) {
        Order order = new Order();
        order.setAddtime(LocalDateTime.now());
        order.setAdultNum(Integer.parseInt(orderData.getAdult_num()));
        order.setChildrenNum(Integer.parseInt(orderData.getChildren_num()));
        order.setHousingNum(Integer.parseInt(orderData.getHousing_num()));
        order.setContact(orderData.getContact());
        order.setContactMobile(orderData.getContact_mobile());
        order.setOrderName(orderData.getOrder_name());
        order.setPayType(Integer.parseInt(orderData.getPay_type()));
        order.setRemark(orderData.getRemark());
        order.setSalesman(orderData.getSalesman());
        order.setSalesmanMobile(orderData.getSalesman_mobile());
        order.setTeamdate(orderData.getStart());
        order.setWhatday(DateTools.dateToWeek(orderData.getStart()));

        ProductPackage productPackage = new ProductPackage();
        productPackage.setPackageNo(orderData.getPackage_id());
        productPackage.QueryBuild().packageNo(orderData.getPackage_id());
        productPackage = productPackageMapper.queryProductPackageLimit1(productPackage);

        order.setPackageId(orderData.getPackage_id());
        order.setPackageName(productPackage.getPackageName());
        order.setPackageInfo(new Gson().toJson(productPackage));
        order.setRallyingPoint(productPackage.getRallyingPoint());

        Product product = new Product();
        product.setProductId(Integer.parseInt(orderData.getProduct_id()));
        product.QueryBuild().productId(Integer.parseInt(orderData.getProduct_id()));
        product = productMapper.queryProductLimit1(product);
        order.setProductId(product.getProductId());
        order.setProductName(product.getProductName());
        order.setProductInfo(new Gson().toJson(product));

        ProductDate productDate = new ProductDate();
        productDate.setProductId(Integer.parseInt(orderData.getProduct_id()));
        productDate.QueryBuild().productId(Integer.parseInt(orderData.getProduct_id()));
        productDate.setPackageNo(orderData.getPackage_id());
        productDate.QueryBuild().packageNo(orderData.getPackage_id());
        productDate.setTeamtime(orderData.getStart());
        productDate.QueryBuild().teamtime(orderData.getStart());
        productDate = productDateMapper.queryProductDateLimit1(productDate);
        order.setDateInfo(new Gson().toJson(productDate));
        //计算订单价格
        double price = 0;
        price += Double.valueOf(orderData.getAdult_num())*productDate.getAdultPrice().doubleValue();
        price += Double.valueOf(orderData.getChildren_num())*productDate.getChildrenPrice().doubleValue();
        price += Double.valueOf(orderData.getHousing_num())*productDate.getHousingPrice().doubleValue();
        order.setOrderPrice(new BigDecimal(price));
        System.out.println("order=="+order.toString());
        if (0<orderMapper.insertOrder(order)){
            OrderPay orderPay = new OrderPay();
            orderPay.setOrderId(order.getOrderId());
            orderPay.setPayType(order.getPayType());
            orderPay.setProductId(order.getProductId());
            orderPayMapper.insertOrderPay(orderPay);
            return true;
        }
        throw new RuntimeException("数据库插入失败");
    }


    @Transactional
    @Override
    public int apiAddOrder(Place place) {

        OrderData orderData = new OrderData();

        orderData.setAdult_num(place.getAdultNum());
        orderData.setChildren_num(place.getChildrenNum());
        orderData.setHousing_num(place.getSingleNum());
        orderData.setContact(place.getContact());
        orderData.setContact_mobile(place.getMobile());
        orderData.setOrder_name(place.getProduct_name());
        orderData.setPackage_id(place.getPackage_no());
        orderData.setProduct_id(place.getProduct_id());
        orderData.setRemark(place.getRemark());
        orderData.setStart(place.getDatetime());

        Order order = new Order();
        order.setAddtime(LocalDateTime.now());
        order.setAdultNum(Integer.parseInt(orderData.getAdult_num()));
        order.setChildrenNum(Integer.parseInt(orderData.getChildren_num()));
        order.setHousingNum(Integer.parseInt(orderData.getHousing_num()));
        order.setContact(orderData.getContact());
        order.setContactMobile(orderData.getContact_mobile());
        order.setOrderName(orderData.getOrder_name());
        order.setRemark(orderData.getRemark());
        order.setSalesman(orderData.getSalesman());
        order.setSalesmanMobile(orderData.getSalesman_mobile());
        order.setTeamdate(orderData.getStart());
        order.setWhatday(DateTools.dateToWeek(orderData.getStart()));
        ProductPackage productPackage = new ProductPackage();
        productPackage.setPackageNo(orderData.getPackage_id());
        productPackage.QueryBuild().packageNo(orderData.getPackage_id());
        productPackage = productPackageMapper.queryProductPackageLimit1(productPackage);

        order.setPackageId(orderData.getPackage_id());
        order.setPackageName(productPackage.getPackageName());
        order.setPackageInfo(new Gson().toJson(productPackage));
        order.setRallyingPoint(productPackage.getRallyingPoint());
        Product product = new Product();
        product.setProductId(Integer.parseInt(orderData.getProduct_id()));
        product.QueryBuild().productId(Integer.parseInt(orderData.getProduct_id()));
        product = productMapper.queryProductLimit1(product);
        order.setProductId(product.getProductId());
        order.setProductName(product.getProductName());
        order.setProductInfo(new Gson().toJson(product));

        ProductDate productDate = new ProductDate();
        productDate.setProductId(Integer.parseInt(orderData.getProduct_id()));
        productDate.QueryBuild().productId(Integer.parseInt(orderData.getProduct_id()));
        productDate.setPackageNo(orderData.getPackage_id());
        productDate.QueryBuild().packageNo(orderData.getPackage_id());
        productDate.setTeamtime(orderData.getStart());
        productDate.QueryBuild().teamtime(orderData.getStart());
        productDate = productDateMapper.queryProductDateLimit1(productDate);
        order.setDateInfo(new Gson().toJson(productDate));
        //计算订单价格
        double price = 0;
        price += Double.valueOf(orderData.getAdult_num())*productDate.getAdultPrice().doubleValue();
        price += Double.valueOf(orderData.getChildren_num())*productDate.getChildrenPrice().doubleValue();
        price += Double.valueOf(orderData.getHousing_num())*productDate.getHousingPrice().doubleValue();
        order.setOrderPrice(new BigDecimal(price));
        System.out.println("order=="+order.toString());
        if (0<orderMapper.insertOrder(order)){
            OrderPay orderPay = new OrderPay();
            orderPay.setOrderId(order.getOrderId());
            orderPay.setProductId(order.getProductId());
            orderPayMapper.insertOrderPay(orderPay);
            for (int i = 0; i < place.getUsername().size(); i++) {
                OrderVisitors orderVisitors = new OrderVisitors();
                orderVisitors.setIdCard(place.getUserIdcard().get(i));
                orderVisitors.setName(place.getUsername().get(i));
                orderVisitors.setOrderId(order.getOrderId());
                orderVisitorsMapper.insertOrderVisitors(orderVisitors);
            }


            return order.getOrderId();
        }
        throw new RuntimeException("数据库插入失败");
    }
    @Override
    public List<Order> getOrderList(int page, int size, Order order) {
        PageHelper.startPage(page,size);
        return orderMapper.queryOrder(order);
    }

    @Override
    public OrderInfo getOrder(int orderId) {
        OrderInfo orderInfo = new OrderInfo();
        Order order = new Order();
        order.setOrderId(orderId);
        orderInfo.setOrder(orderMapper.queryOrderLimit1(order));

        OrderOperate orderOperate = new OrderOperate();
        orderOperate.setOrderId(orderId);
        List<OrderOperate> orderOperates= orderOperateMapper.queryOrderOperate(orderOperate);
        orderInfo.setOrderOperate(orderOperates);
        OrderPay orderPay = new OrderPay();
        orderPay.setOrderId(orderId);
        OrderPay orderPay1 = orderPayMapper.queryOrderPayLimit1(orderPay);
        orderInfo.setOrderPay(orderPay1);

        return orderInfo;
    }

    @Override
    public boolean updata(Order order) {
        return false;
    }
}
