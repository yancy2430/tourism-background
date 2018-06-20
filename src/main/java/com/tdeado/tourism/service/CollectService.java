package com.tdeado.tourism.service;

import com.tdeado.tourism.entity.Area;
import com.tdeado.tourism.entity.ProductCollect;

import java.util.List;

public interface CollectService {

    boolean addCollect(int userId,int productId);
    boolean delCollect(int userId,int productId);
    boolean queryCollect(int userId,int productId);
    List<ProductCollect> queryUserCollectList(int userId);
    int queryProductCollectTotal(int productId);

}
