package com.tdeado.tourism.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.Setting;
/**
*  @author author
*/
public interface SettingBaseMapper {

    int insertSetting(Setting object);

    int updateSetting(Setting object);

    List<Setting> querySetting(Setting object);

    Setting querySettingLimit1(Setting object);

}