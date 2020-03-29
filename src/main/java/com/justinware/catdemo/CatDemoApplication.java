package com.justinware.catdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.justinware")
public class CatDemoApplication {

	public static void main(String[] args) {
		System.setProperty("devMode","true");
		SpringApplication.run(CatDemoApplication.class, args);
	}

}
