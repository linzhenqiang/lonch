package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/")
    public String index(){
        System.out.println("欢迎欢迎!");
        return "/index";
    }
}
