package com.benbenxiang.factory;

import com.benbenxiang.servlet.Example1;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

//@Component(value = "testFactory")
public class Example1Factory implements FactoryBean<Example1> {
	@Override
	public Example1 getObject() throws Exception {
		return new Example1();
	}

	@Override
	public Class<?> getObjectType() {
		return Example1.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
