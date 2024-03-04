package com.nhnacademy.edu.springboot.account.service;

import com.nhnacademy.edu.springboot.account.domain.Account;

import java.util.List;

interface AccountService {
    List<Account> getAccounts();
}
