package com.nhnacademy.edu.springboot.account.repository;

import com.nhnacademy.edu.springboot.account.domain.Account;

import java.util.List;

public class DummyAccountRepository implements AccountRepository{
    @Override
    public List<Account> findAll() {
        return List.of(new Account("1", 10000), new Account("2", 20000));
    }
}
