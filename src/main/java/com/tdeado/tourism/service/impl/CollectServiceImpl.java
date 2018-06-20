package com.tdeado.tourism.service.impl;

import com.tdeado.tourism.dao.AreaMapper;
import com.tdeado.tourism.dao.ProductCollectMapper;
import com.tdeado.tourism.entity.Area;
import com.tdeado.tourism.entity.ProductCollect;
import com.tdeado.tourism.service.AreaService;
import com.tdeado.tourism.service.CollectService;
import com.tdeado.tourism.utils.StringText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class CollectServiceImpl implements CollectService {

    @Autowired
    private ProductCollectMapper collectMapper;

    @Override
    public boolean addCollect(int userId, int productId) {
        ProductCollect productCollect = new ProductCollect();
        productCollect.setProductId(productId);
        productCollect.setUserId(userId);
        productCollect.setAddtime(LocalDateTime.now());
        if (queryCollect(userId,productId)){
            if (delCollect(userId,productId)){
                return false;
            }else {
                throw new RuntimeException("取消收藏失败");
            }
        }else {
            if (0<collectMapper.insertProductCollect(productCollect)){
                return true;
            }else {
                throw new RuntimeException("添加收藏失败");
            }
        }
    }

    @Override
    public boolean delCollect(int userId, int productId) {
        Map<String,Integer> map = new HashMap<>();
        map.put("productId",productId);
        map.put("userId",userId);

        if (0<collectMapper.delCollect(map)){
            return true;
        }
        return false;
    }

    @Override
    public boolean queryCollect(int userId, int productId) {
        ProductCollect productCollect = new ProductCollect();
        productCollect.setUserId(userId);
        productCollect.setProductId(productId);
        ProductCollect collect = collectMapper.queryProductCollectLimit1(productCollect);
        if (null!=collect){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<ProductCollect> queryUserCollectList(int userId) {
        ProductCollect productCollect = new ProductCollect();
        productCollect.setUserId(userId);
        return collectMapper.queryProductCollect(productCollect);
    }

    @Override
    public int queryProductCollectTotal(int productId) {
        return 0;
    }
}
