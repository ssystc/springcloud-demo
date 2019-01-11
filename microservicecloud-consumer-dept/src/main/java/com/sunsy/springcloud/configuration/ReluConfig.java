package com.sunsy.springcloud.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.sunsy.springcloud.relu.OwnRelu;

@Configuration
public class ReluConfig {
	
	@Bean
	public IRule ownRule() {
		return new OwnRelu();
	}

}
