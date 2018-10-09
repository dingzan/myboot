package com.dingzan.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.dingzan.system.dao.UserMapper;
import com.dingzan.system.domain.*;
import com.dingzan.system.domain.UserExample.Criteria;
import com.dingzan.system.service.UserRoleService;
import com.dingzan.system.service.UserService;
import com.dingzan.utils.DataGridResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Transactional
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	UserRoleService userRoleService;
	
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	/**
	 * 查询用户列表(模糊查询)
	 * 分页
	 */
	@Override
	public DataGridResult list(String keyworld,Integer page, Integer limit) {
		logger.info("根据用户名分页查询用户列表");
		//设置分页信息
		PageHelper.startPage(page, limit);
		//执行查询
		UserExample example = new UserExample();
		List<User> list = new ArrayList<>();
		
		if (StringUtils.isEmpty(keyworld)) {
			list = userMapper.selectByExample(example);
		}else {
			Criteria criteria = example.createCriteria();
			criteria.andNameLike("%"+keyworld+"%");
			list = userMapper.selectByExample(example);
		}
		
		//创建返回值对象
		DataGridResult DataGridResult = new DataGridResult();
		DataGridResult.setRows(list);
		//取分页结果
		PageInfo<User> pageInfo = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		DataGridResult.setTotal(total);
		
		return DataGridResult;
		
	}
	
	/**
	 * 通过id获取用户详情
	 */
	@Override
	public User get(Long userId) {
		User user = userMapper.selectByPrimaryKey(userId);
		return user;
	}


	/**
	 * 保存用户
	 */
	@Override
	public int save(User user) {
		//1,保存用户表
		int count = userMapper.insertSelective(user);
		
		//获取userId
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(user.getUsername());
		Long userId = userMapper.selectByExample(example).get(0).getUserId();
		
		//2,保存映射表
		userRoleService.saveOrUpdate(userId,user.getRoleIds());
		return count;
	}

	/**
	 * 修改用户
	 */
	@Override
	public int update(User user) {
		//1,直接update用户表
		int count = userMapper.updateByPrimaryKeySelective(user);
		
		//2,更新映射表
		userRoleService.saveOrUpdate(user.getUserId(),user.getRoleIds());
		
		return count;
	}

	/**
	 * 删除用户
	 */
	@Override
	public int remove(Long userId) {
		//按主键删除用户表
		int count = userMapper.deleteByPrimaryKey(userId);
		//删除用户角色映射表
		userRoleService.deleteByUserId(userId);
		return count;
	}


	/**
	 * 重置密码
	 */
	@Override
	public int resetPwd(User user) {
		int r = userMapper.updateByPrimaryKeySelective(user);
		return r;
	}

	

}
