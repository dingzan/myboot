package com.dingzan.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.dingzan.system.dao.RoleMapper;
import com.dingzan.system.dao.RoleMenuMapper;
import com.dingzan.system.domain.Role;
import com.dingzan.system.domain.RoleExample;
import com.dingzan.system.domain.RoleExample.Criteria;
import com.dingzan.system.service.RoleMenuService;
import com.dingzan.system.service.RoleService;
import com.dingzan.system.service.UserRoleService;
import com.dingzan.system.service.UserService;
import com.dingzan.utils.DataGridResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Transactional
@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleMapper roleMapper;
	@Autowired
	RoleMenuMapper roleMenuMapper;
	
	@Autowired
	UserRoleService userRoleService;
	
	@Autowired
	RoleMenuService roleMenuService;

	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	/**
	 * 查询所有角色信息(带模糊查询)
	 */
	@Override
	public DataGridResult list(String keyworld,Integer page, Integer limit) {
		logger.info("根据角色名分页查询角色列表");
		//设置分页信息
		PageHelper.startPage(page, limit);
		//执行查询
		RoleExample example = new RoleExample();
		
		List<Role> roles = new ArrayList<>();
		
		if(StringUtils.isEmpty(keyworld)){
			roles = roleMapper.selectByExample(example);
		}else{
			Criteria criteria = example.createCriteria();
			criteria.andRoleNameLike("%"+keyworld+"%");
			roles = roleMapper.selectByExample(example);
		}
		
		//创建返回值对象
		DataGridResult DataGridResult = new DataGridResult();
		DataGridResult.setRows(roles);
		//取分页结果
		PageInfo<Role> pageInfo = new PageInfo<>(roles);
		//取总记录数
		long total = pageInfo.getTotal();
		DataGridResult.setTotal(total);
		
		return DataGridResult;
	}
	
	/**
	 * 根据roleId获取角色信息
	 * @param id
	 * @return
	 */
	@Override
	public Role get(Long roleId) {
		Role Role = roleMapper.selectByPrimaryKey(roleId);
		return Role;
	}


	/**
	 * 通过userId查询role
	 */
	@Override
	public List<Role> list(Long userId) {
		//通过用户id获取rolesIds
		List<Long> rolesIds = userRoleService.selectRoleIdsByUserId(userId);
		//根据roleID查询role
		List<Role> roles = new ArrayList<Role>();
		for (Long roleId : rolesIds) {
			Role role = roleMapper.selectByPrimaryKey(roleId);
			roles.add(role);
		}
		return roles;
	}

	/**
	 * 新增角色
	 */
	@Override
	public int save(Role role) {
		//保存角色表
		int count = roleMapper.insert(role);
		
		//获取roleId
		RoleExample example = new RoleExample();
		Criteria criteria = example.createCriteria();
		criteria.andRoleNameEqualTo(role.getRoleName());
		Long roleId = roleMapper.selectByExample(example).get(0).getRoleId();
		
		//保存映射表
		roleMenuService.saveOrUpdate(roleId, role.getMenuIds());
		return count;
	}
	
	/**
	 * 修改角色信息
	 * @param role
	 * @param menuIds
	 * @return
	 */
	@Override
	public int update(Role role) {
		//保存角色表
		int count = roleMapper.updateByPrimaryKey(role);
		
		//更新映射表
		roleMenuService.saveOrUpdate(role.getRoleId(), role.getMenuIds());
		
		return count;
	}

	/**
	 * 删除角色
	 */
	@Override
	public int remove(Long roleId) {
		int count = roleMapper.deleteByPrimaryKey(roleId);
		//删除映射表
		roleMenuService.deleteByRoleId(roleId);
		
		return count;
	}


}
