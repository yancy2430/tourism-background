package com.tdeado.tourism.web.admin;

import com.github.pagehelper.Page;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.tdeado.tourism.entity.Custom;
import com.tdeado.tourism.entity.Order;
import com.tdeado.tourism.service.CustomService;
import com.tdeado.tourism.service.OrderService;
import com.tdeado.tourism.source.OrderData;
import com.tdeado.tourism.source.OrderInfo;
import com.tdeado.tourism.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class OrderController extends BaseController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private CustomService customService;

    @RequestMapping(value = "order/addOrder", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> addOrder(HttpServletRequest request, HttpServletResponse response) {
        String orderinfo = request.getParameter("orderinfo");
        verifyParam(orderinfo);
        OrderData orderData = new Gson().fromJson(orderinfo, OrderData.class);
        if (orderService.addOrder(orderData)) {
            return retData(true);
        }
        throw new JsonSyntaxException("数据结构错误");
    }

    @RequestMapping(value = "order/getOrderList", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> getOrderList(HttpServletRequest request, HttpServletResponse response) {
        String page = request.getParameter("page");
        String limit = request.getParameter("limit");
        String pay_status = request.getParameter("pay_status");
        String pay_type = request.getParameter("pay_type");
        String order_status = request.getParameter("status");
        String order_id = request.getParameter("order_id");
        verifyParam(page, limit);
        Order.QueryBuilder order = new Order().QueryBuild();
        if (!"".equals(pay_type) && null != pay_type) {
            order.payType(Integer.parseInt(pay_type));
        }
        if (!"".equals(pay_status) && null != pay_status) {
            order.payStatus(Integer.parseInt(pay_status));
        }
        if (!"".equals(order_status) && null != order_status) {
            order.status(Integer.parseInt(order_status));
        }
        if (!"".equals(order_id) && null != order_id) {
            order.orderId(Integer.parseInt(order_id));
        }
        List<Order> orders = orderService.getOrderList(Integer.parseInt(page), Integer.parseInt(limit), order);
        Page p = (Page) orders;
        return retData(orders, p.getTotal());
    }

    @RequestMapping(value = "order/getOrder", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> getOrder(HttpServletRequest request, HttpServletResponse response) {
        String orderId = request.getParameter("orderId");
        verifyParam(orderId);
        OrderInfo order= orderService.getOrder(Integer.parseInt(orderId));
        return retData(order);
    }

    @RequestMapping(value = "order/getCustomOrderList", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> getCustomOrderList(HttpServletRequest request, HttpServletResponse response) {
        String page = request.getParameter("page");
        String limit = request.getParameter("limit");
        verifyParam(page, limit);
        Custom.QueryBuilder order = new Custom().QueryBuild();
        List<Custom> orders = customService.getCustomList(Integer.parseInt(page),Integer.parseInt(limit),order);
        Page p = (Page) orders;
        return retData(orders, p.getTotal());
    }
}
