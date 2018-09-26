package com.dingzan.controller;


import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dingzan.dao.AccountInfoMapper;
import com.dingzan.dao.CustomerInfoMapper;
import com.dingzan.domain.AccountInfo;
import com.dingzan.domain.AccountInfoExample;
import com.dingzan.domain.CustomerInfo;
import com.dingzan.domain.CustomerInfoExample;
import com.dingzan.domain.CustomerInfoExample.Criteria;
import com.dingzan.pojo.CustomerInfoVO;
import com.dingzan.utils.DataGridResult;
import com.dingzan.utils.R;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
	private CustomerInfoMapper customerInfoMapper;
	
	@Autowired
	private AccountInfoMapper accountInfoMapper;
	
	@PostMapping("/query")
	public R query(@RequestBody CustomerInfoVO vo){
		PageHelper.startPage(vo.getPageNo(), vo.getRows());
		CustomerInfoExample example = new CustomerInfoExample();
		Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(vo.getComment())) {
			criteria.andCommentLike("%"+vo.getComment()+"%");
		}
		List<CustomerInfo> list = customerInfoMapper.selectByExample(example);
		DataGridResult DataGridResult = new DataGridResult();
		DataGridResult.setRows(list);
		//取分页结果
		PageInfo<CustomerInfo> pageInfo = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		DataGridResult.setTotal(total);
		
		return R.ok().put("data", DataGridResult);
		
	}
	
	@GetMapping("/get/{cusId}")
	public R getinfo(@PathVariable Long cusId){
		CustomerInfo customerInfo = customerInfoMapper.selectByPrimaryKey(cusId);
		return R.ok().put("data", customerInfo);
	}
	
	@PostMapping("/account")
	public R getaccount(@RequestBody CustomerInfoVO vo){
		PageHelper.startPage(vo.getPageNo(), vo.getRows());
		AccountInfoExample example = new AccountInfoExample();
		if (vo.getCusId()!=null) {
			example.createCriteria().andCusIdEqualTo(vo.getCusId());
		}
		List<AccountInfo> list = accountInfoMapper.selectByExample(example);
		DataGridResult DataGridResult = new DataGridResult();
		DataGridResult.setRows(list);
		//取分页结果
		PageInfo<AccountInfo> pageInfo = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		DataGridResult.setTotal(total);
		
		return R.ok().put("data",DataGridResult);
	}
	
	
    
}