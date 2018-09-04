package com.demo.config;

import com.demo.controller.BusinessController;
import com.demo.domain.WechatOauth;
import io.lettuce.core.dynamic.annotation.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Order(value = 1)//值越小,越先执行
public class MyCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(MyCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        //初始化操作
        log.info("==金钥匙出世==");
    }
}
