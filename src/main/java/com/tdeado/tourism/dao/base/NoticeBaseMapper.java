package com.tdeado.tourism.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.Notice;
/**
*  @author author
*/
public interface NoticeBaseMapper {

    int insertNotice(Notice object);

    int updateNotice(Notice object);

    List<Notice> queryNotice(Notice object);

    Notice queryNoticeLimit1(Notice object);

}