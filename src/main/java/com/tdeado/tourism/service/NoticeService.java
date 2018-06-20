package com.tdeado.tourism.service;

import com.tdeado.tourism.entity.Notice;
import com.tdeado.tourism.entity.ProductCate;

import java.util.List;

public interface NoticeService {
    /**
     * 获取通知列表
     * @return
     */
    List<Notice> getNoticeList(int page, int size, Notice notice);

    /**
     * 获取一个分类
     * @return
     */
    Notice getNotice(int id);

    /**
     * 获取一个分类
     * @return
     */
    boolean addNotice(Notice notice);
}
