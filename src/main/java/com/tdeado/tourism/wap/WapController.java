package com.tdeado.tourism.wap;

import com.google.gson.reflect.TypeToken;
import com.tdeado.tourism.entity.*;
import com.tdeado.tourism.service.*;
import com.tdeado.tourism.source.HomeIconData;
import com.tdeado.tourism.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Controller
@RequestMapping("/")
public class WapController extends BaseController {
    @Autowired
    private SlideshowService slideshowService;
    @Autowired
    private SettingService settingService;
    @Autowired
    private CollectService collectService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductService productService;
    /**
     * @return
     */
    @RequestMapping(value = "/index.html",method = RequestMethod.GET)
    public String index(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("css","index");
        model.addAttribute("js","index");
        List<Slideshow> slides = slideshowService.getSlideshow();
        model.addAttribute("slides",slides);
        Setting setting = settingService.getSettingByName("home_icon");
        List<HomeIconData> persons = gson.fromJson(setting.getSettingValue(), new TypeToken<List<HomeIconData>>() {}.getType());
        model.addAttribute("homeIcons",persons);
        Order order = new Order();
        order.setStatus(1);
        List<Order> list = orderService.getOrderList(1,20,order);
        model.addAttribute("orderlist",list);
        List<Product> products = productService.getProductList(1,5,new Product());
        model.addAttribute("products",products);
        System.err.println(products.toArray());
        return "index";
    }
    /**
     * @return
     */
    @RequestMapping(value = "/search_section.html",method = RequestMethod.GET)
    public String search_section(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("css", "search_section");
        model.addAttribute("js", "search_section");
        Setting search_key = settingService.getSettingByName("search_key");
        String[] strings = search_key.getSettingValue().split(",");
        model.addAttribute("keys",strings);
        return "search_section";
    }

    @RequestMapping(value = "/productlist_section.html",method = RequestMethod.GET)
    public String productlist_section(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("css", "productlist_section");
        model.addAttribute("js", "productlist_section");
        return "productlist_section";
    }

    @RequestMapping(value = "/product_details_section.html",method = RequestMethod.GET)
    public String product_details_section(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("css", "product_details_section");
        model.addAttribute("js", "product_details_section");
        model.addAttribute("params",getParams(request));
        String product_id = request.getParameter("product_id");
        verifyParam(product_id);
        if (isLogin(request)){
            User user = getUser(request);
            if (null!=user){
                if (collectService.queryCollect(user.getUserId(),Integer.parseInt(product_id))){
                    model.addAttribute("isCollect","1");
                }else {
                    model.addAttribute("isCollect","0");
                }
            }else {
                model.addAttribute("isCollect","0");
            }
        }else {
            model.addAttribute("isCollect","0");
        }

        return "product_details_section";
    }


    @RequestMapping(value = "/date_select_section.html",method = RequestMethod.GET)
    public String date_select_section(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("css", "date_select_section");
        model.addAttribute("js", "date_select_section");
        return "date_select_section";
    }
    @RequestMapping(value = "/place_order_section.html",method = RequestMethod.GET)
    public String place_order_section(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("css", "place_order_section");
        model.addAttribute("js", "place_order_section");
        return "place_order_section";
    }
    @RequestMapping(value = "/place_order_succeed_section.html",method ={ RequestMethod.POST, RequestMethod.GET})
    public String place_order_succeed_section(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("css", "place_order_succeed_section");
        model.addAttribute("js", "place_order_succeed_section");
        return "place_order_succeed_section";
    }
    @RequestMapping(value = "/user_order_section.html",method ={ RequestMethod.POST, RequestMethod.GET})
    public String user_order_section(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("css", "user_order_section");
        model.addAttribute("js", "user_order_section");
        if (isLogin(request)){
            return "user_order_section";
        }else {
            model.addAttribute("css", "login_section");
            model.addAttribute("js", "login_section");
            return "login_section";
        }
    }

    @RequestMapping(value = "/login.html",method ={ RequestMethod.POST, RequestMethod.GET})
    public String login(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("css", "login_section");
        model.addAttribute("js", "login_section");
        return "login_section";
    }
    @RequestMapping(value = "/notice_section.html",method ={RequestMethod.GET})
    public String notice_section(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("css", "notice_section");
        model.addAttribute("js", "notice_section");
        User user = getUser(request);
        model.addAttribute("js", "notice_section");

        return "notice_section";
    }
    @RequestMapping(value = "/custom_service_section.html",method ={RequestMethod.GET})
    public String custom_service(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("css", "custom_service_section");
        model.addAttribute("js", "custom_service_section");
        User user = getUser(request);
        model.addAttribute("js", "custom_service_section");

        return "custom_service_section";
    }





    private Map<String,String> getParams(HttpServletRequest request){
        Map<String,String> stringMap = new HashMap<>();
        Enumeration em = request.getParameterNames();
        while (em.hasMoreElements()) {
            String name = (String) em.nextElement();
            String value = request.getParameter(name);
            stringMap.put(name,value);
        }
        return stringMap;
    }



}
