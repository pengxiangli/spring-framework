package com.benbenxiang;

import com.benbenxiang.app.AppConfig;
import com.benbenxiang.service.CityService;
import com.benbenxiang.servlet.Example1;
import com.benbenxiang.servlet.Example2;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class Test {
	public static void main(String[] args){

		/** init spring context（环境、上下文、spring容器） **/
		AnnotationConfigApplicationContext ac =
				new AnnotationConfigApplicationContext(AppConfig.class);
		Assert.hasText("null", "");
//		for {
//			GenericBeanDefinition gbd = new GenericBeanDefinition();//用来描述bean的对象
//			gbd.setBeanClassName("example1");
//			gbd.setScope("singleton");
//			gbd.setLazyInit(false);
//			gbd.setBeanClass(Example1.class);
//			...
//			this.beanDefinitionMap.put(beanName, beanDefinition);
//			map.put("example1", gbd);
//			2
//			map.put("userService", gbd);
//		}




//		ClassPathXmlApplicationContext cc =
//				new ClassPathXmlApplicationContext("spring.xml");
		/*ac.register(UserDao.class);
		ac.refresh();
		UserDao userDao = ac.getBean(UserDao.class);
		userDao.query();*/

		System.out.println(ac.getBean(Example1.class));



	}
}
