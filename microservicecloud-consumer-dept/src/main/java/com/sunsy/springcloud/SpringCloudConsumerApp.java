package com.sunsy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.sunsy.springcloud.configuration.ReluConfig;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MICROSERVICECLOUD-DEPT", configuration=ReluConfig.class)
public class SpringCloudConsumerApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerApp.class, args);
	}
	
}
