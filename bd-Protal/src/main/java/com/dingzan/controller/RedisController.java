package com.dingzan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dingzan.domain.Userinfo;
import com.dingzan.service.RedisService;

@RestController
@RequestMapping("/api")
public class RedisController {

	@Autowired
	private RedisService redisService;

	/**
	 * 设置Redis数据
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	@GetMapping("/setRedis")
	public String setRedis(String key, String value) {
		boolean set = redisService.set(key, value);
		return "添加缓存"+set;
	}

	@GetMapping("/setObjRedis")
	public String setObjRedis() {
		Userinfo userinfo = new Userinfo();
		userinfo.setId((long) 1);
		userinfo.setActionType("主页");
		userinfo.setClientip("127.0.0.1");
		boolean set = redisService.set("userinfo", userinfo);
		return "添加缓存"+set;
	}
	
	@GetMapping("/setListRedis")
	public String setListRedis() {
		Userinfo userinfo = new Userinfo();
		userinfo.setId((long) 1);
		userinfo.setActionType("主页");
		userinfo.setClientip("127.0.0.1");
		Userinfo userinfo2 = new Userinfo();
		userinfo2.setId((long) 2);
		userinfo2.setActionType("主页2");
		userinfo2.setClientip("127.0.0.1");
		List<Userinfo> list = new ArrayList<>();
		list.add(userinfo);
		list.add(userinfo2);
		boolean set = redisService.set("userinfos", list);
		return "添加缓存"+set;
	}
	
	
	/**
	 * 根据key删除Redis数据
	 * 
	 * @param key
	 * @return
	 */
	@GetMapping("/delRedis")
	public String delRedis(String key) {
		redisService.remove(key);
		return "删除成功";
	}

	/**
	 * 根据key获取Redis数据
	 * 
	 * @param key
	 * @return
	 */
	@GetMapping("/getRedis")
	public Object getRedis(String key) {
		Object value = redisService.get(key);
		//String beanToJson = JSONUtils.beanToJson(value);
		return value;
	}
}
