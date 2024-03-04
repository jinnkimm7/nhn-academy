package com.nhnacademy.edu.springboot.account.domain;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Account {
    private String number;
    private Integer balance;

    public Account(String number, Integer balance) {
        this.number = number;
        this.balance = balance;
    }
}
