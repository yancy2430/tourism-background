package com.tdeado.tourism.service;

import com.tdeado.tourism.entity.Setting;
import com.tdeado.tourism.source.SettingData;

import java.util.List;

public interface SettingService {



    SettingData SaveSetting(SettingData settingData);
    Setting updateSetting(String name,String json);
    SettingData getSetting();
    Setting getSettingByName(String name);

}
