package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService;

public class MyTest {

	public static void main(String[] args) {
		//����1��������ʹ�ô�ͳ�ķ�����������userService��sayHelllo����
		/*UserService userService = new UserService();
		userService.setName("˳ƽ");
		userService.sayHello();*/
		
		//����2����������ʹ��spring��������������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us = (UserService) ac.getBean("userService");
		us.sayHello();

	}

}
