package com.emotion.em.RestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class EMViewController {

    @GetMapping(value="/em")
    public ModelAndView EMMain() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/em");
        return mv;
    }
 
}
