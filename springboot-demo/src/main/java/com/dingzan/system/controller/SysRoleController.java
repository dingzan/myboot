package com.dingzan.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dingzan.system.service.RoleService;
import com.dingzan.utils.DataGridResult;
import com.dingzan.utils.R;

@RestController
@RequestMapping("/api/role")
public class SysRoleController {

	@Autowired
	RoleService roleService;
	
	/**
	 * 所有角色列表
	 */
	@GetMapping("/list")
	//@RequiresPermissions("sys:role:list")
	public R list(String keyworld,Integer page, Integer limit){
		DataGridResult list = roleService.list(keyworld, page, limit);
		
		return R.ok().put("DataGridResult", list);
	}
}
