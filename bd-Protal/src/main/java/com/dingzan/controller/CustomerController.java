package com.dingzan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dingzan.pojo.CustomerInfoVO;
import com.dingzan.pojo.QueryVO;
import com.dingzan.service.CustomerInfoService;
import com.dingzan.utils.DataGridResult;
import com.dingzan.utils.R;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
	private CustomerInfoService CustomerInfoService;
	
	@PostMapping("/query")
	public R query(@RequestBody QueryVO vo){
		
		DataGridResult dataGridResult = CustomerInfoService.list(vo);
		return R.ok().put("data", dataGridResult);
	}
	
	@GetMapping("/get/{cusId}")
	public R getinfo(@PathVariable Long cusId){
		CustomerInfoVO customerInfoVO = CustomerInfoService.getinfo(cusId);
		return R.ok().put("data", customerInfoVO);
	}
	
	@GetMapping("/account")
	public R getaccount(int pageNo,int rows,Long cusId){
		
		DataGridResult dataGridResult = CustomerInfoService.getaccount(pageNo,rows,cusId);
		
		return R.ok().put("data",dataGridResult);
	}
	
	
    
}