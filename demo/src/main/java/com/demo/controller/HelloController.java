package com.demo.controller;

import com.demo.domain.Business;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/")
    public ModelAndView index(ModelMap map){
        System.out.println("欢迎欢迎!");
        map.put("ceshi","lalalalla");
        Business business=new Business();
        business.setCompanyName("公司测试");
        map.put("object",business);
        return  new ModelAndView("/index",map);
    }
}
