package com.dingzan.system.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dingzan.system.domain.User;
import com.dingzan.system.service.UserRoleService;
import com.dingzan.system.service.UserService;
import com.dingzan.utils.DataGridResult;
import com.dingzan.utils.R;

@RestController
@RequestMapping("/sys/user")
public class SysUserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRoleService userRoleService;
	
	/**
	 * 所有用户列表
	 */
	@RequestMapping("/list")
	//@RequiresPermissions("sys:user:list")
	public R list(String keyworld,Integer page, Integer limit){
		DataGridResult list = userService.list(keyworld, page, limit);
		return R.ok().put("users", list);
	}
	
	/**
	 * 用户信息
	 */
	@RequestMapping("/info/{userId}")
	//@RequiresPermissions("sys:user:info")
	public R info(@PathVariable("userId") Long userId){
		//获取用户信息
		User user = userService.get(userId);
		//获取用户所属的角色列表
		List<Long> roleIdList = userRoleService.selectRoleIdsByUserId(userId);
		user.setRoleIds(roleIdList);
		
		return R.ok().put("user", user);
	}
	
}
