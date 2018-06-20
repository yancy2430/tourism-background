package com.tdeado.tourism.service.impl;

import com.google.gson.Gson;
import com.tdeado.tourism.dao.AreaMapper;
import com.tdeado.tourism.dao.SettingMapper;
import com.tdeado.tourism.entity.Setting;
import com.tdeado.tourism.service.SettingService;
import com.tdeado.tourism.source.SettingData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CacheConfig(cacheNames = "roncooCache")
@Service
public class SettingServiceImpl implements SettingService {

    @Autowired
    private SettingMapper settingMapper;

    @CachePut(key = "'setting'")
    @Transactional
    @Override
    public SettingData SaveSetting(SettingData settingData) {
        Field[] fields = settingData.getClass().getDeclaredFields();
        for (int i = 0, len = fields.length; i < len; i++) {
            // 对于每个属性，获取属性名
            String varName = fields[i].getName();
            try {
                // 获取原来的访问控制权限
                boolean accessFlag = fields[i].isAccessible();
                // 修改访问控制权限
                fields[i].setAccessible(true);
                // 获取在对象f中属性fields[i]对应的对象中的变量
                Object o;
                try {
                    o = fields[i].get(settingData);
                    if (null != o) {
                        System.err.println("传入的对象中包含一个如下的变量：" + varName + " = " + o.toString());
                        Map<String, String> map = new HashMap<String, String>();
                        map.put("settingValue", o.toString());
                        map.put("settingName", varName);
                        settingMapper.upSetting(map);
                    }
                } catch (IllegalAccessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    throw new RuntimeException("更新数据库错误" + e.getMessage());
                }
                // 恢复访问控制权限
                fields[i].setAccessible(accessFlag);
            } catch (IllegalArgumentException ex) {
                ex.printStackTrace();
                throw new RuntimeException("更新数据库错误" + ex.getMessage());
            }
        }
        return settingData;
    }

    @Cacheable(key = "'setting'")
    @Override
    public SettingData getSetting() {
        System.err.println("没有走缓存！");
        SettingData settingData = new SettingData();
        List<Setting> settings = settingMapper.querySetting(null);
        //转成MAP
        Map<String, String> stringStringMap = new HashMap<>();
        for (Setting setting : settings) {
            stringStringMap.put(setting.getSettingName(), setting.getSettingValue());
        }
        Field[] fields = settingData.getClass().getDeclaredFields();
        for (int i = 0, len = fields.length; i < len; i++) {
            // 对于每个属性，获取属性名
            String varName = fields[i].getName();
            try {
                // 获取原来的访问控制权限
                boolean accessFlag = fields[i].isAccessible();
                // 修改访问控制权限
                fields[i].setAccessible(true);
                // 获取在对象f中属性fields[i]对应的对象中的变量
                try {
                    fields[i].set(settingData, stringStringMap.get(varName).toString());
                } catch (IllegalAccessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    throw new RuntimeException("更新数据库错误" + e.getMessage());
                }
                // 恢复访问控制权限
                fields[i].setAccessible(accessFlag);
            } catch (IllegalArgumentException ex) {
                ex.printStackTrace();
                throw new RuntimeException("更新数据库错误" + ex.getMessage());
            }
        }

        return settingData;
    }

    @CachePut(key = "'setting_'+#name")
    @Override
    public Setting updateSetting(String name, String json) {
        Map<String, String> map = new HashMap<>();
        map.put("settingName", name);
        map.put("settingValue", json);
        settingMapper.upSetting(map);
        return new Setting(name, json);
    }

    @Cacheable(key = "'setting_'+#name")
    @Override
    public Setting getSettingByName(String name) {
        System.err.println("没有走缓存！");
        Setting setting = new Setting();
        setting.setSettingName(name);
        Setting setting1 = settingMapper.querySettingLimit1(setting);
        return setting1;
    }
}
