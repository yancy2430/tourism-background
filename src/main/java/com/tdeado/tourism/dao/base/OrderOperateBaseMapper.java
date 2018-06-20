package com.tdeado.tourism.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.OrderOperate;
/**
*  @author author
*/
public interface OrderOperateBaseMapper {

    int insertOrderOperate(OrderOperate object);

    int updateOrderOperate(OrderOperate object);

    List<OrderOperate> queryOrderOperate(OrderOperate object);

    OrderOperate queryOrderOperateLimit1(OrderOperate object);

}