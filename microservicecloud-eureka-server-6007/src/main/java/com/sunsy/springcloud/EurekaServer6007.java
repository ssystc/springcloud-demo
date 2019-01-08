package com.sunsy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer6007 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer6007.class, args);
	}
	
}
