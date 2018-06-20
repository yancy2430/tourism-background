package com.tdeado.tourism.service.impl;

import com.tdeado.tourism.dao.AreaMapper;
import com.tdeado.tourism.entity.Area;
import com.tdeado.tourism.service.AreaService;
import com.tdeado.tourism.utils.StringText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;


    @Override
    public List<Area> getAreaAll() {
        List<Area> area = areaMapper.queryArea(null);
        if (null!=area){
            return area;
        }else {
            throw new RuntimeException(StringText.DATA_GET_FAIL);
        }
    }

    @Override
    public Area getAreaId(int areaId) {
//        Area area = areaMapper.findByAreaId(areaId);
//        if (null!=area && area.getArea_id()>0){
//            return area;
//        }else {
//            throw new RuntimeException(StringText.DATA_GET_FAIL);
//        }
        return null;
    }

    @Override
    public boolean updataArea(Area area) {
        int num = areaMapper.updateArea(area);
        if (num>0){
            return true;
        }else {
            throw new RuntimeException(StringText.DELETE_AREA_FAIL);
        }
    }

    @Override
    public boolean deleteArea(int areaId) {
        int num = areaMapper.updateArea(null);
        if (num>0){
            return true;
        }else {
            throw new RuntimeException(StringText.DELETE_AREA_FAIL);
        }
    }

    @Override
    public boolean addArea(Area area) {
        int num = areaMapper.insertArea(area);
        if (num>0){
            return true;
        }else {
            throw new RuntimeException(StringText.ADD_AREA_FAIL);
        }
    }
}
