package com.tdeado.tourism.service.impl;

import com.github.pagehelper.PageHelper;
import com.tdeado.tourism.dao.WithdrawalMapper;
import com.tdeado.tourism.entity.Withdrawal;
import com.tdeado.tourism.service.WithdrawalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WithdrawalServiceImpl implements WithdrawalService {

    @Autowired
    private WithdrawalMapper withdrawalMapper;

    @Override
    public Withdrawal addWithdrawal(Withdrawal withdrawal) {
        withdrawalMapper.insertWithdrawal(withdrawal);
        return withdrawal;
    }
    @Override
    public List<Withdrawal> getWithdrawalList(int page, int size, Withdrawal withdrawal) {
        PageHelper.startPage(page,size);
        return withdrawalMapper.queryWithdrawal(withdrawal);
    }

    @Override
    public Withdrawal getWithdrawal(Withdrawal withdrawal) {
        return withdrawalMapper.queryWithdrawalLimit1(withdrawal);
    }
}
