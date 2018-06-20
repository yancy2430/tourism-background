package com.tdeado.tourism.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.Order;
/**
*  @author author
*/
public interface OrderBaseMapper {

    int insertOrder(Order object);

    int updateOrder(Order object);

    List<Order> queryOrder(Order object);

    Order queryOrderLimit1(Order object);

}