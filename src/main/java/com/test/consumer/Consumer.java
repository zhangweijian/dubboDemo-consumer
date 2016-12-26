package com.test.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.service.SayHello;

public class Consumer {

	 public static void main(String[] args) throws Exception {
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
	        context.start();
	 
	        SayHello hello = (SayHello)context.getBean("sayHello"); // 获取远程服务代理
	       hello.hello();
	 
	    }
}
