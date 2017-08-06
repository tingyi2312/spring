package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService;

public class MyTest {

	public static void main(String[] args) {
		//方法1：我们先使用传统的方法，来调用userService的sayHelllo方法
		/*UserService userService = new UserService();
		userService.setName("顺平");
		userService.sayHello();*/
		
		//方法2：我们现在使用spring来完成上面的任务
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us = (UserService) ac.getBean("userService");
		us.sayHello();

	}

}
