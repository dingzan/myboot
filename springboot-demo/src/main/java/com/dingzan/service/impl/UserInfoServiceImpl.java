package com.dingzan.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dingzan.dao.UserinfoMapper;
import com.dingzan.domain.Userinfo;
import com.dingzan.domain.UserinfoExample;
import com.dingzan.service.UserInfoService;
import com.dingzan.utils.DataGridResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Transactional
@Service
public class UserInfoServiceImpl implements UserInfoService {


	@Autowired
	private UserinfoMapper UserinfoMapper;
	
	@Override
	public DataGridResult list(Integer page, Integer limit) {
		
		//设置分页信息
		PageHelper.startPage(page, limit);
		//执行查询
		UserinfoExample userinfoExample = new UserinfoExample();
		List<Userinfo> list = UserinfoMapper.selectByExample(userinfoExample);
		//创建返回值对象
		DataGridResult DataGridResult = new DataGridResult();
		DataGridResult.setRows(list);
		//取分页结果
		PageInfo<Userinfo> pageInfo = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		DataGridResult.setTotal(total);
		
		return DataGridResult;

	}

	@Override
	public List<Userinfo> listByExample(UserinfoExample example) {
		
		List<Userinfo> list = UserinfoMapper.selectByExample(example);
		
		return list;
	}
}
