package com.emotion.em.service;

import com.emotion.em.Entity.Account;

import org.springframework.security.core.userdetails.User;

import lombok.Getter;

@Getter
public class UserAccount extends User {
    private Account account;

    public UserAccount(Account account) {
        super(account.getUsername(), account.getPassword(),
                List.of(new SimpleGrantedAuthority("ROLE_" + account.getRole())));
        this.account = account;
    }
}

