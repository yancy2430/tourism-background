package com.tdeado.tourism.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.BalanceLog;
/**
*  @author 
*/
public interface BalanceLogBaseMapper {

    int insertBalanceLog(BalanceLog object);

    int updateBalanceLog(BalanceLog object);

    List<BalanceLog> queryBalanceLog(BalanceLog object);

    BalanceLog queryBalanceLogLimit1(BalanceLog object);

}