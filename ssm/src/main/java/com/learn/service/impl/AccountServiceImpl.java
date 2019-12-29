package com.learn.service.impl;

import com.learn.dao.IAccountDao;
import com.learn.domain.Account;
import com.learn.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所用账户信息");
        return accountDao.findAll();
    }

    @Override
    public void save(Account account) {
        System.out.println("业务层：保存用户信息");
        accountDao.save(account);
    }
}
