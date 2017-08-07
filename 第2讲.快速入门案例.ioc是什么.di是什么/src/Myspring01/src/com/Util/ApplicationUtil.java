package com.Util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

final public class ApplicationUtil {
 private static ApplicationContext ac = null;
 
 private ApplicationUtil(){
 }
 
 static{
	 ac = new ClassPathXmlApplicationContext("applicationContext.xml");
 }
 
 public static ApplicationContext getApplicationContext(){
	 return ac;
 }
 
}
