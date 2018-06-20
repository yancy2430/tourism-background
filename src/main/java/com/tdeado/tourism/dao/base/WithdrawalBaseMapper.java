package com.tdeado.tourism.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.Withdrawal;
/**
*  @author author
*/
public interface WithdrawalBaseMapper {

    int insertWithdrawal(Withdrawal object);

    int updateWithdrawal(Withdrawal object);

    List<Withdrawal> queryWithdrawal(Withdrawal object);

    Withdrawal queryWithdrawalLimit1(Withdrawal object);

}