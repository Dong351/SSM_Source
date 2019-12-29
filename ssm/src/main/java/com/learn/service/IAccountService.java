package com.learn.service;

import com.learn.domain.Account;

import java.util.List;

public interface IAccountService {
    List<Account> findAll();

    void save(Account account);
}
