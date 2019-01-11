package com.sunsy.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sunsy.springcloud.entity.Dept;
import com.sunsy.springcloud.service.DeptClientService;

@RestController
public class DeptConsumerController {

	@Autowired
	private DeptClientService service;
	
	@RequestMapping(value="/consumer/dept/list")
	public List<Dept> list(){
		return service.list();
	}
	
}
