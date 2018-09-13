package com.dingzan.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dingzan.system.domain.Role;
import com.dingzan.system.service.RoleService;
import com.dingzan.system.service.UserRoleService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleServiceTest {

	@Autowired
	private UserRoleService userRoleService;
	
	@Autowired 
	private RoleService RoleService;
	
	
	@Test
	public void selectRoleIdsByUserId(){
		Long userId = (long) 127;
		List<Long> RoleIds = userRoleService.selectRoleIdsByUserId(userId);
		System.out.println(RoleIds.toString());
	}
	
	@Test
	public void saveTest(){
		Role role = new Role();
		role.setRoleName("测试角色");
		List<Long> menuIds = new ArrayList<Long>();
		menuIds.add((long) 32);
		menuIds.add((long) 33);
		menuIds.add((long) 34);
		menuIds.add((long) 35);
		role.setMenuIds(menuIds);
		RoleService.save(role);
	}
	
	@Test
	public void updateTest(){
		Role role = new Role();
		role.setRoleId((long) 58);
		List<Long> menuIds = new ArrayList<Long>();
		menuIds.add((long) 32);
		menuIds.add((long) 33);
		role.setMenuIds(menuIds);
		RoleService.update(role);
	}
	
	@Test
	public void removeTest(){
		//RoleService.remove((long) 58);
	}
	
	@Test
	public void listByUserIdTest(){
		List<Role> list = RoleService.list((long)127);
		list.forEach(x -> System.out.println(x.toString()));
	}
	
}
