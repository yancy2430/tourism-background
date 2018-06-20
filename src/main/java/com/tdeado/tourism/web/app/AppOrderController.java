package com.tdeado.tourism.web.app;

import com.github.pagehelper.Page;
import com.google.gson.Gson;
import com.tdeado.tourism.entity.Order;
import com.tdeado.tourism.entity.Product;
import com.tdeado.tourism.entity.User;
import com.tdeado.tourism.service.CollectService;
import com.tdeado.tourism.service.OrderService;
import com.tdeado.tourism.service.ProductService;
import com.tdeado.tourism.service.UserService;
import com.tdeado.tourism.source.Place;
import com.tdeado.tourism.source.ProductData;
import com.tdeado.tourism.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/order")
public class AppOrderController extends BaseController{

    @Autowired
    private ProductService productService;
    @Autowired
    private CollectService collectService;
    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    private Map<String ,Object> list(HttpServletRequest request){
        String page = request.getParameter("page");
        String size = request.getParameter("size");
        String status = request.getParameter("status");
        verifyParam(page,size);
        User user = getUser(request);
        Order order = new Order();
        if (null!=status && !"".equals(status)){
            order.setStatus(Integer.parseInt(status));
        }
        order.setUserId(user.getUserId());
        List<Order> orders = orderService.getOrderList(Integer.parseInt(page),Integer.parseInt(size),order);
        Page pages = (Page) orders;
        return retData(orders,pages.getTotal());
    }
    @RequestMapping(value = "addOrder",method = RequestMethod.POST)
    private Map<String ,Object> addOrder(HttpServletRequest request){
        String reqData = request.getParameter("reqData");
        verifyParam(reqData);
        Place place = new Gson().fromJson(reqData,Place.class);
        int order_id = orderService.apiAddOrder(place);
        return retData(order_id);
    }

}
