package com.benbenxiang.bean.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

//@Component
public class BenBenXiangBeanFactoryProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		GenericBeanDefinition beanDefinition = (GenericBeanDefinition)beanFactory.getBeanDefinition("example1");
//		beanDefinition.getBeanClassName();
//		beanDefinition.setBeanClass(Example2.class);
	}
}
