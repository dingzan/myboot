package com.dingzan.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dingzan.system.domain.User;
import com.dingzan.system.service.UserService;
import com.dingzan.utils.MD5Utils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

	@Autowired
	private UserService UserService;
	
	@Test
	public void getTest() {
		User userPojo = UserService.get((long) 1);
		System.out.println(userPojo.toString());
	}
	
	@Test
	public void resetPwdTest() {
		User user = new User();
		user.setUserId((long) 127);
		
		user.setPassword(MD5Utils.encrypt("admin", "admin"));
		
		int i = UserService.resetPwd(user);
		System.out.println(i);
	}
	
	@Test
	public void saveTest() {
		User user = new User();
		user.setUsername("test1");
		user.setPassword(MD5Utils.encrypt("test1", "test1"));
		List<Long> roleIds = new ArrayList<Long>();
		roleIds.add((long) 48);
		roleIds.add((long) 49);
		user.setRoleIds(roleIds);
		UserService.save(user);
		System.out.println();
	}
	
	@Test
	public void updateTest() {
		User user = new User();
		user.setUserId((long) 136);
		user.setName("测试用户");
		List<Long> roleIds = new ArrayList<Long>();
		roleIds.add((long) 49);
		user.setRoleIds(roleIds);
		UserService.update(user);
	}
	
	@Test
	public void removeTest(){
		UserService.remove((long) 136);
	}
}
