package com.dingzan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dingzan.service.UserInfoService;
import com.dingzan.utils.LayGridResult;

@RestController
@RequestMapping("/api/userinfo")
public class UserInfoController {
	
    
	@Autowired
	private UserInfoService UserInfoService;

	@GetMapping("/all")
	public LayGridResult getUserInfoList(int page,int limit) {
		//调用服务查询分页列表
		LayGridResult result = UserInfoService.findAll(page,limit);
		return result;
	}
	
	
    
    
}