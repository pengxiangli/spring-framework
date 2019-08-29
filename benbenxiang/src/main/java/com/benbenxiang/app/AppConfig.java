package com.benbenxiang.app;

import com.benbenxiang.service.CityService;
import com.benbenxiang.servlet.Example1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.benbenxiang")
@Configuration
public class AppConfig {
/*
	@Bean
	public Example1 example1(){
		return new Example1();
	}

	@Bean
	public CityService cityService(){
		example1();
		return new CityService();
	}
	*/
}
