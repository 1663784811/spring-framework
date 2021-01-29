package com.cyyaw.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest001 {


	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

		User bean = context.getBean(User.class);





	}


}
