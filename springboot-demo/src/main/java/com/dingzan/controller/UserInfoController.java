package com.dingzan.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dingzan.domain.Userinfo;
import com.dingzan.domain.UserinfoExample;
import com.dingzan.domain.UserinfoExample.Criteria;
import com.dingzan.service.UserInfoService;
import com.dingzan.utils.DataGridResult;

@RestController
@RequestMapping("/api")
public class UserInfoController {
	
    private final Logger logger = LoggerFactory.getLogger(getClass());
    
	@Autowired
	private UserInfoService UserInfoService;

	
	@GetMapping("/test/pagelist")
	public DataGridResult getUserInfoList(Integer page, Integer limit) {
		logger.info("==========分页查询==========");
		//调用服务查询分页列表
		DataGridResult userInfoList = UserInfoService.list(page, limit);
		
		return userInfoList;
	}
	
	@GetMapping("/test/getUserInfo/{id}")
	public List<Userinfo> getUserInfoById(@PathVariable("id")Long id) {
		//根据主键查询
		UserinfoExample example = new UserinfoExample();
		Criteria criteria = example.createCriteria();
		//设置查询条件
		criteria.andIdEqualTo(id);
		//执行查询
		List<Userinfo> list = UserInfoService.listByExample(example);
		return list;
	}
	
	@PostMapping("/test/getUserInfo")
	public List<Userinfo> getUserInfoBy(Userinfo userinfo) {
		//根据主键查询
		UserinfoExample example = new UserinfoExample();
		Criteria criteria = example.createCriteria();
		//设置查询条件
		criteria.andIdcodeEqualTo(userinfo.getIdcode());
		criteria.andSessioncountEqualTo(userinfo.getSessioncount());
		//执行查询
		List<Userinfo> list = UserInfoService.listByExample(example);
		
		return list;
	}
	
    
    
}