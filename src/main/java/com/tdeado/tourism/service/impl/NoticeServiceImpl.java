package com.tdeado.tourism.service.impl;

import com.github.pagehelper.PageHelper;
import com.tdeado.tourism.dao.NoticeMapper;
import com.tdeado.tourism.entity.Notice;
import com.tdeado.tourism.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl  implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;
    @Override
    public List<Notice> getNoticeList(int page, int size, Notice notice) {
        PageHelper.startPage(page,size);
        return noticeMapper.queryNotice(notice);
    }

    @Override
    public Notice getNotice(int id) {
        Notice notice = new Notice();
        notice.setId(id);
        return noticeMapper.queryNoticeLimit1(notice);
    }

    @Override
    public boolean addNotice(Notice notice) {
        int i =noticeMapper.insertNotice(notice);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }
}
