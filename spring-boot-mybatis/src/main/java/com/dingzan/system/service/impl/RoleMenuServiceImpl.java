package com.dingzan.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dingzan.system.dao.RoleMenuMapper;
import com.dingzan.system.domain.RoleMenu;
import com.dingzan.system.domain.RoleMenuExample;
import com.dingzan.system.domain.RoleMenuExample.Criteria;
import com.dingzan.system.service.RoleMenuService;

@Transactional
@Service
public class RoleMenuServiceImpl implements RoleMenuService {

	@Autowired
	RoleMenuMapper roleMenuMapper;
	
	
	@Override
	public void deleteByRoleId(Long roleId) {
		RoleMenuExample example = new RoleMenuExample();
		Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(roleId);
		roleMenuMapper.deleteByExample(example);
	}


	@Override
	public void saveOrUpdate(Long roleId, List<Long> menuIdList) {
		//先删除 角色权限映射表
		this.deleteByRoleId(roleId);
		
		//保存角色权限映射    
		for (Long menuId : menuIdList) {
			RoleMenu rm = new RoleMenu();
			rm.setRoleId(roleId);
			rm.setMenuId(menuId);
			roleMenuMapper.insertSelective(rm);
		}
		
	}


	@Override
	public List<Long> selectMenuIdByRoleId(Long roleId) {
		List<Long> menuId = roleMenuMapper.selectMenuIdByRoleId(roleId);
		return menuId;
	}

}
