package com.nhnacademy.edu.springboot.account.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Account {
    @Id @GeneratedValue
    private Long id;
    private String number;
    private Integer balance;

    public Account() {
    }

    public Account(String number, Integer balance) {
        this.number = number;
        this.balance = balance;
    }
}