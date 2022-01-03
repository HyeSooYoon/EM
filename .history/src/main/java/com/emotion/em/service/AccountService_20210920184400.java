package com.emotion.em.service;

import java.util.Optional;

import javax.transaction.Transactional;

import com.emotion.em.Entity.Account;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor 
public class AccountService implements UserDetailsService { 
    private final AccountRepository accountRepository; 
    private final PasswordEncoder passwordEncoder; //loadUserByUsername 에서 UserDetails type 의 구현체를 반환 
    
    @Override 
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { 
        final Account account = accountRepository.findByUsername(username); 
        return Optional.ofNullable(account) .map(UserAccount::new) .orElseThrow(() -> new UsernameNotFoundException(username)); 
    } // user 를 영속계층에 저장 
    
    @Transactional 
    public Account createNew(Account account) { 
        account.encodePassword(passwordEncoder); 
        return accountRepository.save(account); 
    }

    }


