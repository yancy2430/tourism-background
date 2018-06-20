package com.tdeado.tourism.service.impl;

import com.github.pagehelper.PageHelper;
import com.tdeado.tourism.dao.CustomMapper;
import com.tdeado.tourism.dao.ProductCollectMapper;
import com.tdeado.tourism.entity.Custom;
import com.tdeado.tourism.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
public class CustomServiceImpl implements CustomService {

    @Autowired
    private CustomMapper customMapper;
    @Transactional
    @Override
    public boolean addCustom(Custom custom) {

        int i = customMapper.insertCustom(custom);
        if (i>0){
            return true;
        }else {
            throw new RuntimeException("添加数据库失败");
        }
    }

    @Override
    public Custom getCustom(int id) {
        System.out.println("查询功能，缓存找不到，直接读库, id=" + id);
        Custom custom = new Custom();
        custom.setId(id);
        return customMapper.queryCustomLimit1(custom);
    }
    @Override
    public List<Custom> getCustomList(int page, int size, Custom custom) {
        PageHelper.startPage(page,size);
        return customMapper.queryCustom(custom);
    }

    @Override
    public boolean updateCustom(Custom custom) {
        System.out.println("更新功能，更新缓存，直接写库, id=");
        if (customMapper.updateCustom(custom)>0){
            return true;
        }
        throw new RuntimeException("数据库更新失败");
    }
    @Override
    public boolean delCustom(int id) {
        Custom custom = new Custom();
        custom.setId(id);
        custom.setIsdel(1);
        if (customMapper.updateCustom(custom)>0){
            return true;
        }
        throw new RuntimeException("数据库删除失败");
    }
}
