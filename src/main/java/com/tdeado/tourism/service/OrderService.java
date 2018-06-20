package com.tdeado.tourism.service;

import com.tdeado.tourism.entity.Order;
import com.tdeado.tourism.source.OrderData;
import com.tdeado.tourism.source.OrderInfo;
import com.tdeado.tourism.source.Place;

import java.util.List;

public interface OrderService {

    boolean addOrder(OrderData orderData);

    List<Order> getOrderList(int page, int size, Order order);

    OrderInfo getOrder(int orderId);

    boolean updata(Order order);

    int apiAddOrder(Place place);


}
