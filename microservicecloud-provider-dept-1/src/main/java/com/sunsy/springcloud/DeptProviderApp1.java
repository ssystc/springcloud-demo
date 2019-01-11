package com.sunsy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptProviderApp1 {
	public static void main(String[] args) {
		SpringApplication.run(DeptProviderApp1.class, args);
	}
}
