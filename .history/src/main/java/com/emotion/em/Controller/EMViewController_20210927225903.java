package com.emotion.em.Controller;

import com.emotion.em.service.EmDiarySaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView; 
 
@Controller
public class EMViewController {

    @Autowired
    EmDiarySaveService emDiarySaveService; 
    
    @PostMapping(value="/em")
    public ModelAndView EMMain() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/em");
        return mv;
    }

    @PostMapping(value="/em")
    public ModelAndView EMLogin() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/em");
        return mv;
    }

    @GetMapping(value="/login")
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/login");
        return mv;
    }
 
}
