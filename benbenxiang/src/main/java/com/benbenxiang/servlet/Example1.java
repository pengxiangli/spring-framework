package com.benbenxiang.servlet;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Lazy
//@Scope
//@DependsOn
//@Configuration
public class Example1 /*implements InitializingBean, DisposableBean*/ {

	@PostConstruct
	public void initExample1(){
		System.out.println("postConstruct");
	}

	@PreDestroy
	public void destory(){
		System.out.println("preDestory");
	}

	public Example1(){
		System.out.println("init example1");
	}

	public void init() {
		System.out.println("left callback");
	}

	public void destroy(){
		System.out.println("接口：destroy");
	}
}
