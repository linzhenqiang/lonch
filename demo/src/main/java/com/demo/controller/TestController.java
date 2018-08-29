package com.demo.controller;

import com.demo.config.AppConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private AppConfig appConfig;

    @RequestMapping("/getStr")
    public String getStr(HttpServletRequest request, String s){
        System.out.println("前端传值:"+s);
        return appConfig.getName()+":heiha:"+appConfig.getPageSize();
    }

    @RequestMapping("/loginSuccess")
    public String loginSuccess(HttpServletRequest request, String userId){
        request.getSession().setAttribute("userId",userId);
        System.out.println(userId+":登录");
        return "hello";
    }
    @RequestMapping("/login")
    public String login(){
        return "你想登录?";
    }
}
