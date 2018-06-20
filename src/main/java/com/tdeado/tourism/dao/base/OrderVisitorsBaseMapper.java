package com.tdeado.tourism.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.OrderVisitors;
/**
*  @author author
*/
public interface OrderVisitorsBaseMapper {

    int insertOrderVisitors(OrderVisitors object);

    int updateOrderVisitors(OrderVisitors object);

    List<OrderVisitors> queryOrderVisitors(OrderVisitors object);

    OrderVisitors queryOrderVisitorsLimit1(OrderVisitors object);

}