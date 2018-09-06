package com.dingzan.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dingzan.system.dao.UserRoleMapper;
import com.dingzan.system.domain.UserRole;
import com.dingzan.system.domain.UserRoleExample;
import com.dingzan.system.service.UserRoleService;

@Transactional
@Service
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	UserRoleMapper userRoleMapper;
	
	@Autowired
	UserRoleService userRoleService;
	
	@Override
	public List<Long> selectRoleIdsByUserId(Long userId) {
		List<Long> roleIds = userRoleMapper.selectRoleIdsByUserId(userId);
		return roleIds;
	}
	/**
	 * 根据用户id删除用户角色映射表
	 */
	@Override
	public void deleteByUserId(Long userId){
		UserRoleExample example = new UserRoleExample();
		UserRoleExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		userRoleMapper.deleteByExample(example);
	}
	
	/**
	 * 保存或更新映射表
	 * @param userId
	 * @param roleIdList
	 */
	public void saveOrUpdate(Long userId, List<Long> roleIdList) {
		//先删除用户与角色关系
		userRoleService.deleteByUserId(userId);

		if(roleIdList == null || roleIdList.size() == 0){
			return ;
		}
		//保存用户角色映射表
		for (Long roleId : roleIdList) {
			UserRole ur = new UserRole();
			ur.setUserId(userId);
			ur.setRoleId(roleId);
			userRoleMapper.insertSelective(ur);
		}
		
	}

}
