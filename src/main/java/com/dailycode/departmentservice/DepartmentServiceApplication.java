package com.dailycode.departmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "application");
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
