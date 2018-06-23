package com.tdeado.tourism.web.app;

import com.github.pagehelper.Page;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tdeado.tourism.entity.Notice;
import com.tdeado.tourism.entity.Product;
import com.tdeado.tourism.entity.ProductCollect;
import com.tdeado.tourism.entity.User;
import com.tdeado.tourism.service.*;
import com.tdeado.tourism.source.Place;
import com.tdeado.tourism.source.ProductData;
import com.tdeado.tourism.utils.CookieUtils;
import com.tdeado.tourism.utils.StringUtils;
import com.tdeado.tourism.utils.ToKenUtils;
import com.tdeado.tourism.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/product")
public class AppProductController extends BaseController{

    @Autowired
    private ProductService productService;
    @Autowired
    private CollectService collectService;
    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private NoticeService noticeService;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    private Map<String ,Object> list(HttpServletRequest request,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        Gson gson = new Gson();
        String page = request.getParameter("page");
        String size = request.getParameter("size");
        verifyParam(page,size);
        Product product = new Product();
        List<Product> products = productService.getProductList(Integer.parseInt(page),Integer.parseInt(size),product);
        for (int i = 0; i < products.size(); i++) {
           List<String> imgs = gson.fromJson(products.get(i).getImages(),new TypeToken<List<String>>() {}.getType());
           if (imgs.size()>0){
               products.get(i).setImages(imgs.get(0));
           }else {

               products.get(i).setImages("");
           }
            if (StringUtils.isEmpty(products.get(i).getSecurity()))
            products.get(i).setSecurityList(products.get(i).getSecurity().split("\\|"));
            if (StringUtils.isEmpty(products.get(i).getProductTag()))
            products.get(i).setProductTagList(products.get(i).getProductTag().split("\\|"));



        }
        Page productPage = (Page) products;
        return retData(products,productPage.getTotal());
    }
    @RequestMapping(value = "item",method = RequestMethod.GET)
    private Map<String ,Object> item(HttpServletRequest request,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        String product_id = request.getParameter("product_id");
        verifyParam(product_id);
        Product product = new Product();
        product.setProductId(Integer.parseInt(product_id));
        ProductData p = productService.getProduct(product);
        if (StringUtils.isEmpty(p.getProductinfo().getSecurity()))
            p.getProductinfo().setSecurityList(p.getProductinfo().getSecurity().split("\\|"));
        if (StringUtils.isEmpty(p.getProductinfo().getProduct_tag()))
            p.getProductinfo().setProductTags(p.getProductinfo().getProduct_tag().split("\\|"));


        return retData(p);
    }

    @RequestMapping(value = "collect",method = RequestMethod.GET)
    private Map<String ,Object> collect(HttpServletRequest request,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        String product_id = request.getParameter("product_id");
        verifyParam(product_id);
        User user = getUser(request);
        return retData(collectService.addCollect(user.getUserId(),Integer.parseInt(product_id)));
    }
    @RequestMapping(value = "isCollect",method = RequestMethod.GET)
    private Map<String ,Object> isCollect(HttpServletRequest request){
        String product_id = request.getParameter("product_id");
        verifyParam(product_id);
        User user = getUser(request);
        if (collectService.queryCollect(user.getUserId(),Integer.parseInt(product_id))){
            return retData(true);
        }else {
            return retData(false);
        }
    }
    @RequestMapping(value = "addOrder",method = RequestMethod.POST)
    private Map<String ,Object> addOrder(HttpServletRequest request){
        String reqData = request.getParameter("reqData");
        verifyParam(reqData);
        Place place = new Gson().fromJson(reqData,Place.class);
        int order_id = orderService.apiAddOrder(place);
        User user = getUser(request);
        noticeService.addNotice(new Notice(user.getUserId(),1,"订单下单成功","亲，您的出行订单下单成功，请在出行前联系客服人员",0, LocalDateTime.now()));
        return retData(order_id);
    }

}
