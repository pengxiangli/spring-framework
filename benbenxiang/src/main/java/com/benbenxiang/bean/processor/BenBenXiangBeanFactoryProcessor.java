package com.benbenxiang.bean.processor;

import com.benbenxiang.servlet.Example1;
import com.benbenxiang.servlet.Example2;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

//@Component
public class BenBenXiangBeanFactoryProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		GenericBeanDefinition beanDefinition = (GenericBeanDefinition)beanFactory.getBeanDefinition("example1");
//		beanDefinition.getBeanClassName();
//		beanDefinition.setBeanClass(Example2.class);
	}
}
