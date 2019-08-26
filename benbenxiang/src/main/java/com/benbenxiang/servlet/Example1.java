package com.benbenxiang.servlet;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Scope
public class Example1 {
	public Example1(){
		System.out.println("init example1");
	}
}
