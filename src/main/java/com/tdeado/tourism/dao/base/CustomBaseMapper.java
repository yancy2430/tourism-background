package com.tdeado.tourism.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.Custom;
/**
*  @author author
*/
public interface CustomBaseMapper {

    int insertCustom(Custom object);

    int updateCustom(Custom object);

    List<Custom> queryCustom(Custom object);

    Custom queryCustomLimit1(Custom object);

}