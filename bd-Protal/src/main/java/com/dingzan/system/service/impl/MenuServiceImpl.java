package com.dingzan.system.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.dingzan.system.dao.MenuMapper;
import com.dingzan.system.domain.Menu;
import com.dingzan.system.domain.MenuExample;
import com.dingzan.system.service.MenuService;
import com.dingzan.system.service.RoleMenuService;
import com.dingzan.utils.BuildTree;
import com.dingzan.utils.Tree;

@Transactional
@Service
public class MenuServiceImpl implements MenuService {
	@Autowired
	private MenuMapper menuMapper;
	@Autowired
	private RoleMenuService roleMenuService;

	/**
	 * @param 用户ID
	 * @return 树形菜单
	 */
	@Override
	public Tree<Menu> getMenuTree(Long user_id) {
		List<Tree<Menu>> trees = new ArrayList<Tree<Menu>>();
		List<Menu> Menus = menuMapper.listMenuByUserId(user_id);
		for (Menu sysMenu : Menus) {
			Tree<Menu> tree = new Tree<Menu>();
			tree.setId(sysMenu.getMenuId().toString());
			tree.setParentId(sysMenu.getParentId().toString());
			tree.setText(sysMenu.getName());
			Map<String, Object> attributes = new HashMap<>();
			attributes.put("url", sysMenu.getUrl());
			attributes.put("icon", sysMenu.getIcon());
			tree.setAttributes(attributes);
			trees.add(tree);
		}
		// 默认顶级菜单为０，根据数据库实际情况调整
		Tree<Menu> t = BuildTree.build(trees);
		return t;
	}
	
	@Override
	public List<Tree<Menu>> listMenuTree(Long userId) {
		List<Tree<Menu>> trees = new ArrayList<Tree<Menu>>();
		List<Menu> Menus = menuMapper.listMenuByUserId(userId);
		for (Menu sysMenu : Menus) {
			Tree<Menu> tree = new Tree<Menu>();
			tree.setId(sysMenu.getMenuId().toString());
			tree.setParentId(sysMenu.getParentId().toString());
			tree.setText(sysMenu.getName());
			Map<String, Object> attributes = new HashMap<>();
			attributes.put("url", sysMenu.getUrl());
//			attributes.put("icon", sysMenu.getIcon());
			tree.setAttributes(attributes);
			trees.add(tree);
		}
		// 默认顶级菜单为０，根据数据库实际情况调整
		List<Tree<Menu>> list = BuildTree.buildList(trees,"0");
		return list;
	}
	/**
	 * @return 树形菜单
	 */
	@Override
	public Tree<Menu> getTree() {
		List<Tree<Menu>> trees = new ArrayList<Tree<Menu>>();
		MenuExample example = new MenuExample();
		List<Menu> Menus = menuMapper.selectByExample(example);
		
		for (Menu sysMenu : Menus) {
			Tree<Menu> tree = new Tree<Menu>();
			tree.setId(sysMenu.getMenuId().toString());
			tree.setParentId(sysMenu.getParentId().toString());
			tree.setText(sysMenu.getName());
			Map<String, Object> attribute = new HashMap<>();
			attribute.put("url", sysMenu.getUrl());
//			attribute.put("icon", sysMenu.getIcon());
//			List<Map<String, Object>> attributes = new ArrayList<>();
//			attributes.add(attribute);
			tree.setAttributes(attribute);
			trees.add(tree);
		}
		// 默认顶级菜单为０，根据数据库实际情况调整
		Tree<Menu> t = BuildTree.build(trees);
		return t;
	}

	/**
	 * @param roleID
	 * @return 树形菜单
	 */
	@Override
	public Tree<Menu> getTree(Long roleId) {
		// 根据roleId查询menuIds
		List<Long> menuIds = roleMenuService.selectMenuIdByRoleId(roleId);
		List<Tree<Menu>> trees = new ArrayList<Tree<Menu>>();
		
		MenuExample example = new MenuExample();
		List<Menu> Menus = menuMapper.selectByExample(example);
		for (Menu sysMenu : Menus) {
			Tree<Menu> tree = new Tree<Menu>();
			tree.setId(sysMenu.getMenuId().toString());
			tree.setParentId(sysMenu.getParentId().toString());
			tree.setText(sysMenu.getName());
			Map<String, Object> state = new HashMap<>();
			Long menuId = sysMenu.getMenuId();
			if (menuIds.contains(menuId)) {
				state.put("selected", true);
			} else {
				state.put("selected", false);
			}
			tree.setState(state);
			trees.add(tree);
		}
		// 默认顶级菜单为０，根据数据库实际情况调整
		Tree<Menu> tree = BuildTree.build(trees);
		return tree;
	}


	/**
	 * 获取菜单列表
	 */
	@Override
	public List<Menu> list() {
		MenuExample example = new MenuExample();
		List<Menu> menus = menuMapper.selectByExample(example);
		return menus;
	}

	/**
	 * 根据menu_id删除菜单
	 */
	@Override
	public int remove(Long menu_id) {
		int result = menuMapper.deleteByPrimaryKey(menu_id);
		return result;
	}

	/**
	 * 新增菜单
	 */
	@Override
	public int save(Menu menu) {
		int r = menuMapper.insertSelective(menu);
		return r;
	}

	/**
	 * 更新菜单
	 */
	@Override
	public int update(Menu menu) {
		int r = menuMapper.updateByPrimaryKey(menu);
		return r;
	}

	/**
	 * 根据menu_id查询菜单
	 */
	@Override
	public Menu get(Long id) {
		Menu Menu = menuMapper.selectByPrimaryKey(id);
		return Menu;
	}

	
	@Override
	public Set<String> listPerms(Long userId) {
		List<String> perms = menuMapper.listUserPerms(userId);
		Set<String> permsSet = new HashSet<>();
		for (String perm : perms) {
			if (!StringUtils.isEmpty(perm)) {
				permsSet.addAll(Arrays.asList(perm.trim().split(",")));
			}
		}
		return permsSet;
	}


}
