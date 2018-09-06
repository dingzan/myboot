package com.dingzan.system.service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dingzan.system.domain.Menu;
import com.dingzan.system.service.MenuService;
import com.dingzan.utils.Tree;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MenuServiceTest {

	@Autowired
	private MenuService menuService;
	
	@Test
	public void listTest(){
		List<Menu> list = menuService.list();
		list.forEach(x -> System.out.println(x.toString()));
	}
	
	@Test
	public void treeListTest(){
		Tree<Menu> tree = menuService.getTree();
		System.out.println(tree);
	}
	
	@Test
	public void treeListByidTest(){
		List<Tree<Menu>> listMenuTree = menuService.listMenuTree((long) 127);
		listMenuTree.forEach(x -> System.out.println(x.toString()));
	}
}
