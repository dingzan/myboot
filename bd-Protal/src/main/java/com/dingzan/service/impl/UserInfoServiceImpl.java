package com.dingzan.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dingzan.dao.UserinfoMapper;
import com.dingzan.domain.Userinfo;
import com.dingzan.service.UserInfoService;
import com.dingzan.utils.LayGridResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Transactional
@Service
public class UserInfoServiceImpl implements UserInfoService {


	@Autowired
	private UserinfoMapper UserinfoMapper;
	
	@Override
	public LayGridResult findAll(int page,int limit) {
		//设置分页信息
		PageHelper.startPage(page, limit);
		List<Userinfo> list = UserinfoMapper.selectByExample(null);
		//创建返回值对象
		LayGridResult result = null;
		if (list.size()==0) {
			return new LayGridResult(1, "error");
		}
		result = new LayGridResult(0, "success");
		result.setData(list);
		//取分页结果
		PageInfo<Userinfo> pageInfo = new PageInfo<>(list);
		result.setCount(pageInfo.getTotal());
		return result;
	}
}
