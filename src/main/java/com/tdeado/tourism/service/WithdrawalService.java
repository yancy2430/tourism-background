package com.tdeado.tourism.service;

import com.tdeado.tourism.entity.User;
import com.tdeado.tourism.entity.Withdrawal;

import java.util.List;

public interface WithdrawalService {

    /**
     * 新增提现
     * @param withdrawal
     * @return
     */
    Withdrawal addWithdrawal(Withdrawal withdrawal);
    /**
     * 获取记录列表
     * @param withdrawal
     * @return
     */
    List<Withdrawal> getWithdrawalList(int page,int size,Withdrawal withdrawal);

    /**
     * 新增提现
     * @param withdrawal
     * @return
     */
    Withdrawal getWithdrawal(Withdrawal withdrawal);

}
