package com.benbenxiang.service;

import org.springframework.stereotype.Component;

@Component
public class CityService {
	public CityService(){
		System.out.println("init cityService");
	}
	public void queryAll(){
		System.out.println("service");
	}
}
