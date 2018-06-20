package com.tdeado.tourism.service.impl;

import com.tdeado.tourism.entity.Custom;
import com.tdeado.tourism.service.CustomService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomServiceImplTest {

    @Autowired
    public CustomService customService;

    @Test
    public void addCustom() {
        Custom custom = new Custom();
        custom.setIsdel(0);
        custom.setAddtime(LocalDateTime.now());
        custom.setAdultNum(5);
        custom.setBudget(new BigDecimal(1000.00));
        custom.setChildrenNum(2);
        custom.setContact("杨");
        custom.setDays(5);
        custom.setDepartureTime(LocalDateTime.now());
        custom.setMobile("18152733661");
        custom.setOrigin("长沙");
        custom.setRemark("备注");
        custom.setVisitCity("上海,南京,盐城");
        custom.setUserId(1);
        customService.addCustom(custom);
    }

    @Test
    public void getCustom() {
       Custom custom = customService.getCustom(2);
        System.err.println(custom.toString());
    }

    @Test
    public void getCustomList() {



    }

    @Test
    public void updateCustom() {
    }

    @Test
    public void delCustom() {
    }
}