package com.emotion.em.Controller;

import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@RestController @RequiredArgsConstructor

출처: https://yoon0120.tistory.com/53 [재미있는 개발공부]
public class AccountController {

    private final InMemoryUserDetailsManager inMemoryUserDetailsManager; 
    
    @GetMapping("/account/inmemory/{role}/{username}/{password}") 
    public Account joinInMemory(@ModelAttribute Account account) { 
        inMemoryUserDetailsManager.createUser(new UserAccount(account)); 
        return account; 
    }  
    
}
