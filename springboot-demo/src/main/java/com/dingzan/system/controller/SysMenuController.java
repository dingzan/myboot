package com.dingzan.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dingzan.system.domain.Menu;
import com.dingzan.system.service.MenuService;
import com.dingzan.utils.R;
import com.dingzan.utils.Tree;

@RestController
@RequestMapping("/api/menu")
public class SysMenuController {

	@Autowired
	private MenuService menuService;
	
	@RequestMapping("/getTree")
	public R list(){
		
		Tree<Menu> tree = menuService.getTree();
		return R.ok().put("tree", tree);
	}
	
	@RequestMapping("/info/{roleId}")
	public R info(@PathVariable("roleId") Long roleId){
		Tree<Menu> tree = menuService.getTree(roleId);
		return R.ok().put("tree", tree);
		
	}

}
