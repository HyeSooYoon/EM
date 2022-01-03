package com.emotion.em.Controller;

import java.util.List;

import com.emotion.em.Entity.TbDiaryTitle;
import com.emotion.em.service.EmDiarySaveService;
import com.google.gson.Gson;

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

    @GetMapping(value="/login")
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/login");
        return mv;
    }
 
}
