package com.tdeado.tourism.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.Admin;
/**
*  @author author
*/
public interface AdminBaseMapper {

    int insertAdmin(Admin object);

    int updateAdmin(Admin object);

    List<Admin> queryAdmin(Admin object);

    Admin queryAdminLimit1(Admin object);

}