package com.tdeado.tourism.service;

import com.tdeado.tourism.entity.Custom;
import com.tdeado.tourism.entity.Setting;
import com.tdeado.tourism.source.SettingData;

import java.util.List;

public interface CustomService {



    boolean addCustom(Custom custom);

    Custom getCustom(int id);

    List<Custom> getCustomList(int page,int size,Custom custom);

    boolean updateCustom(Custom custom);


    boolean delCustom(int id);

}
