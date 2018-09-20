package com.dingzan.system.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dingzan.system.domain.User;
import com.dingzan.system.service.UserRoleService;
import com.dingzan.system.service.UserService;
import com.dingzan.utils.DataGridResult;
import com.dingzan.utils.QueryVO;
import com.dingzan.utils.R;

@RestController
@RequestMapping("/api/user")
public class SysUserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRoleService userRoleService;
	
	/**
	 * 所有用户列表
	 */
	@PostMapping("/list")
	//@RequiresPermissions("sys:user:list")
	public R list(QueryVO vo){
		DataGridResult list = 
				userService.list(vo.getUser().getName(), vo.getPageNo(), vo.getRows());
		return R.ok().put("users", list);
	}
	
	/**
	 * 用户信息
	 */
	@GetMapping("/info/{userId}")
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
