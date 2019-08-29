package com.benbenxiang.servlet;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

//@Component
public class BeanPostProcessorTest implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof Example1)
			System.out.println("before");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean '" + beanName + "' created : " + bean.toString());
		if(bean instanceof Example1)
			System.out.println("after");
		return bean;
	}
}
