package com.cyyaw.springtest;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	public MyAspect(){
		System.out.println("=========");
	}

	/**
	 * 前置通知
	 */
	@Before("execution(* com.cyyaw.springtest.User.*())")
	public void before(){
		System.out.println("前置通知....");
		System.out.println("前置通知....");
		System.out.println("前置通知....");
		System.out.println("前置通知....");
		System.out.println("前置通知....");
		System.out.println("前置通知....");
		System.out.println("前置通知....");
		System.out.println("前置通知....");
	}

}
