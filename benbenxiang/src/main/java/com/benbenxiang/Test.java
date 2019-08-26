package com.benbenxiang;

import com.benbenxiang.app.AppConfig;
import com.benbenxiang.dao.UserDao;
import com.benbenxiang.service.CityService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args){
		AnnotationConfigApplicationContext ac =
				new AnnotationConfigApplicationContext(AppConfig.class);
		/*ac.register(UserDao.class);
		ac.refresh();
		UserDao userDao = ac.getBean(UserDao.class);
		userDao.query();*/

		System.out.println(ac.getBean(CityService.class));



	}
}
