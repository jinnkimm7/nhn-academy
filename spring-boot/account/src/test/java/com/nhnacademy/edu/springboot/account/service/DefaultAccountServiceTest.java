package com.nhnacademy.edu.springboot.account.service;

import com.nhnacademy.edu.springboot.account.domain.Account;
import com.nhnacademy.edu.springboot.account.repository.AccountRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class DefaultAccountServiceTest {
    @Autowired
    private AccountService accountService;
    @Test
    void testGetAccounts() {
        List<Account> actual = accountService.getAccounts();
        assertThat(actual).hasSize(2);
    }
}