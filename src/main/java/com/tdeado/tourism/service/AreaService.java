package com.tdeado.tourism.service;

import com.tdeado.tourism.entity.Area;

import java.util.List;

public interface AreaService {
    /**
     * 取出所有城市列表
     */
    List<Area> getAreaAll();

    /**
     * 通过ID 获取城市
     */

    Area getAreaId(int areaId);

    /**
     * 更新城市信息
     * @param area
     * @return
     */
    boolean updataArea(Area area);

    /**
     * 删除城市信息
     * @param areaId
     * @return
     */
    boolean deleteArea(int areaId);

    /**
     * 插入城市信息
     * @param area
     * @return
     */
    boolean addArea(Area area);


}
