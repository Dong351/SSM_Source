package com.learn.test;

import com.learn.domain.Account;
import com.learn.service.impl.AccountServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void testIoc(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountServiceImpl accountService = (AccountServiceImpl) ac.getBean("accountService");

        accountService.findAll();
    }
}
