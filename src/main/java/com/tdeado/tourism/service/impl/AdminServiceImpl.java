package com.tdeado.tourism.service.impl;

import com.tdeado.tourism.dao.AdminMapper;
import com.tdeado.tourism.dao.AreaMapper;
import com.tdeado.tourism.entity.Admin;
import com.tdeado.tourism.entity.Area;
import com.tdeado.tourism.service.AdminService;
import com.tdeado.tourism.service.AreaService;
import com.tdeado.tourism.utils.StringText;
import com.tdeado.tourism.utils.ToKenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Transactional
    @Override
    public Admin login(String username, String password) {
        Admin admin = new Admin();
        admin.setUsername(username);
        admin.QueryBuild().username(username);
        Admin ad = adminMapper.queryAdminLimit1(admin);
        if (null!=ad){
            ad.setToken(ToKenUtils.createToKen());
            adminMapper.updateAdmin(ad);
            if (ad.getPassword().equals(password)){
                return ad;
            }else {
                throw new RuntimeException("密码错误");
            }
        }else {
            throw new RuntimeException("用户名不存在");
        }

    }
}
