package com.demo;

import com.demo.controller.TestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpServletRequest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {

	@Autowired
	TestController testController;
	@Test
	public void getStr() {
		System.out.println("kkkkkkkkkk:"+testController.getStr(null,"nihao"));
	}

}
