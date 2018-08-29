package com.dingzan.system.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.dingzan.system.domain.Menu;
import com.dingzan.utils.Tree;


@Service
public interface MenuService {
	Tree<Menu> getMenuTree(Long id);
	
	List<Tree<Menu>> listMenuTree(Long id);
	
	Tree<Menu> getTree();
	
	Tree<Menu> getTree(Long id);
	
	List<Menu> list();
	
	int remove(Long id);
	
	int save(Menu menu);
	
	int update(Menu menu);
	
	Menu get(Long id);
	
	Set<String> listPerms(Long userId);
}
