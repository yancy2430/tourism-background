package com.tdeado.tourism.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.Setting;
import com.tdeado.tourism.dao.base.SettingBaseMapper;
/**
*  @author author
*/
public interface SettingMapper extends SettingBaseMapper{
    int upSetting(Map<String,String> map);
}