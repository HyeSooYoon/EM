package com.emotion.em.Controller;

import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController 
@RequiredArgsConstructor
public class AccountController {

    private final InMemoryUserDetailsManager inMemoryUserDetailsManager; 
    
    @GetMapping("/account/inmemory/{role}/{username}/{password}") 
    public Account joinInMemory(@ModelAttribute Account account) { 
        inMemoryUserDetailsManager.createUser(new UserAccount(account)); 
        return account; 
    }  
    
}
