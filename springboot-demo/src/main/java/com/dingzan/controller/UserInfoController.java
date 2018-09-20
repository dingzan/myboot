package com.dingzan.controller;


import java.util.List;

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
import com.dingzan.utils.QueryVO;

@RestController
@RequestMapping("/api/userinfo")
public class UserInfoController {
	
    
	@Autowired
	private UserInfoService UserInfoService;

	
	@PostMapping("/page")
	public DataGridResult getUserInfoList(QueryVO vo) {
		
		//调用服务查询分页列表
		DataGridResult userInfoList = UserInfoService.list(vo.getPageNo(), vo.getRows());
		
		return userInfoList;
	}
	
	@GetMapping("/get/{id}")
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
	
	@PostMapping("/query")
	public List<Userinfo> getUserInfoBy(Userinfo userinfo) {
		
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