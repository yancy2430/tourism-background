package com.tdeado.tourism.source;

import com.tdeado.tourism.entity.Order;
import com.tdeado.tourism.entity.OrderOperate;
import com.tdeado.tourism.entity.OrderPay;

import java.util.List;

/**
 * 代下单data
 */
public class OrderInfo {

    private Order order;
    private OrderPay orderPay;
    private List<OrderOperate> orderOperate;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderPay getOrderPay() {
        return orderPay;
    }

    public void setOrderPay(OrderPay orderPay) {
        this.orderPay = orderPay;
    }

    public List<OrderOperate> getOrderOperate() {
        return orderOperate;
    }

    public void setOrderOperate(List<OrderOperate> orderOperate) {
        this.orderOperate = orderOperate;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "order=" + order +
                ", orderPay=" + orderPay +
                ", orderOperate=" + orderOperate +
                '}';
    }
}
