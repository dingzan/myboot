package com.dingzan.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dingzan.dao.UserdataMapper;
import com.dingzan.domain.Userdata;
import com.dingzan.domain.UserdataExample;
import com.dingzan.domain.UserdataExample.Criteria;


@RestController
@RequestMapping("/api")
public class UserDataController {
	
    private final Logger logger = LoggerFactory.getLogger(getClass());
    
	
	@Autowired
	private UserdataMapper UserdataMapper;
	
	
	@GetMapping("/test/getUserData/{id}")
	public List<Userdata> getUserData(@PathVariable("id")Long id) {
		logger.info("===========条件查询=============");
		//根据主键查询
		UserdataExample example = new UserdataExample();
		Criteria criteria = example.createCriteria();
		//设置查询条件
		criteria.andIdEqualTo(id);
		//执行查询
		List<Userdata> list = UserdataMapper.selectByExample(example);
		
		return list;
	}
	
    
    
}