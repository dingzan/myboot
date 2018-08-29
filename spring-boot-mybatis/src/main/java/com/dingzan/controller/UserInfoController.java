package com.dingzan.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dingzan.domain.Userinfo;
import com.dingzan.domain.UserinfoExample;
import com.dingzan.domain.UserinfoExample.Criteria;
import com.dingzan.service.UserInfoService;
import com.dingzan.utils.DataGridResult;


@RestController
public class UserInfoController {
	
    private final Logger logger = LoggerFactory.getLogger(getClass());
    
	@Autowired
	private UserInfoService UserInfoService;
	
	
	@RequestMapping("/test")
	public String Hello() {
		return "welcome!";
	}
	
	@RequestMapping("/test/pagelist")
	public DataGridResult getUserInfoList(Integer page, Integer limit) {
		logger.info("==========分页查询==========");
		//调用服务查询分页列表
		DataGridResult userInfoList = UserInfoService.list(page, limit);
		
		return userInfoList;
	}
	
	@RequestMapping("/test/getUserInfo")
	public List<Userinfo> getUserInfoBy(String idCode,long sessionCount) {
		//根据主键查询
		UserinfoExample example = new UserinfoExample();
		Criteria criteria = example.createCriteria();
		//设置查询条件
		criteria.andIdcodeEqualTo(idCode);
		criteria.andSessioncountEqualTo(sessionCount);
		//执行查询
		List<Userinfo> list = UserInfoService.listByExample(example);
		
		return list;
	}
	
    
    
}