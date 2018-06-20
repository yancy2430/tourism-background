package com.tdeado.tourism.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.OrderPay;
/**
*  @author author
*/
public interface OrderPayBaseMapper {

    int insertOrderPay(OrderPay object);

    int updateOrderPay(OrderPay object);

    List<OrderPay> queryOrderPay(OrderPay object);

    OrderPay queryOrderPayLimit1(OrderPay object);

}