package com.dingzan.controller;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dingzan.dao.UseractionreportMapper;
import com.dingzan.domain.Useractionreport;
import com.dingzan.domain.UseractionreportExample;
import com.dingzan.domain.UseractionreportExample.Criteria;
import com.dingzan.service.RedisService;
import com.dingzan.utils.DateUtils;
import com.dingzan.utils.R;


@RestController
@RequestMapping("/api/report")
public class UserActionReportController {
	
	@Autowired
	private UseractionreportMapper reportMapper;
	
	@Autowired
	private RedisService redisService;
	
	@GetMapping("/list/{demension}")
	public R getReport(@PathVariable("demension")String demension) {
		
		Date createday = null;
		try {
			createday = DateUtils.dateAdd(null, -1, false);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//先查询缓存
		Object object = redisService.get(createday+":"+demension);
		if (object!=null) {
			return R.ok().put("data", object);
		}
		
		//设置查询条件
		UseractionreportExample example = new UseractionreportExample();
		Criteria criteria = example.createCriteria();
		criteria.andDemensionEqualTo(demension);
		criteria.andCreatedayEqualTo(createday);
		//执行查询
		List<Useractionreport> list = reportMapper.selectByExample(example);
		if (list.isEmpty()) {
			return R.error(1, "没有符合条件的数据！");
		}
		//向缓存中添加数据
		redisService.set(createday+":"+demension, list);
		return R.ok().put("data", list);
	}
	
	@GetMapping("/detail/{demension}")
	public R getReportDetail(@PathVariable("demension")String demension) {
		
		List<Date> createdays = new ArrayList<Date>();
		Date yesterday = null;
		try {
			for (int i = 1; i <= Integer.parseInt(demension); i++) {
					  Date date = DateUtils.dateAdd(null, -i, false);
					  createdays.add(date);
			}
			yesterday = DateUtils.dateAdd(null, -1, false);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//先查询缓存
		Object object = redisService.get(yesterday+":detail"+demension);
		if (object!=null) {
			return R.ok().put("data", object);
		}
		
		//设置查询条件
		List<Useractionreport> list = reportMapper.selectBatch(createdays);
		if (list.isEmpty()) {
			return R.error(1, "没有符合条件的数据！");
		}
		//向缓存中添加数据
		redisService.set(yesterday+":detail"+demension, list);
		return R.ok().put("data", list);
	}
	
    
    
}