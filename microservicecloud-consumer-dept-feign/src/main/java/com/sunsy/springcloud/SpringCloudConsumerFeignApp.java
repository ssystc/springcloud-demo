package com.sunsy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.sunsy.springcloud"})
//@ComponentScan("com.sunsy.springcloud")
public class SpringCloudConsumerFeignApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerFeignApp.class, args);
	}
	
}