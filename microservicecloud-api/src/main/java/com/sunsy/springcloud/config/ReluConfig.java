package com.sunsy.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class ReluConfig {
	
	@Bean
	public IRule ownRule() {
		return new OwnRelu();
	}

}

