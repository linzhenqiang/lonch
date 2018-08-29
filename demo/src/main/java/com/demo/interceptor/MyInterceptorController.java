package com.demo.interceptor;

import com.demo.controller.MedicinalBasicController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptorController implements HandlerInterceptor{

    private static final Logger log = LoggerFactory.getLogger(MedicinalBasicController.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("我是拦截器:怕不怕?");
       /* if(request.getRequestURI().contains("/login")){
            return true;
        }
        Object userId=request.getSession().getAttribute("userId");
        if (userId==null){
            response.sendRedirect("/test/login");
            return false;
        }*/
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
       // log.info("我是真的怕");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
       // log.info("走你..");
    }
}
