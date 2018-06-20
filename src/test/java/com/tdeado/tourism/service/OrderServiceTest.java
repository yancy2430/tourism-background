package com.tdeado.tourism.service;

import com.tdeado.tourism.source.OrderInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTest {
    @Autowired
    private OrderService orderService;
    @Test
    public void getOrder() {
//        OrderInfo order= orderService.getOrder(2);
//        System.err.println(order.toString());
    }
}