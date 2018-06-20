package com.tdeado.tourism.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.Area;
/**
*  @author 
*/
public interface AreaBaseMapper {

    int insertArea(Area object);

    int updateArea(Area object);

    List<Area> queryArea(Area object);

    Area queryAreaLimit1(Area object);

}