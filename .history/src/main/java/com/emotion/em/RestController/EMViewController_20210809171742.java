package com.emotion.em.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@RestController
public class EMViewController {

    @GetMapping(value="/test")
    public String EMMain() {
        return "hello world";
    }
 
}
