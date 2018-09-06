package com.dingzan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dingzan.service.KylinHttpService;
import com.dingzan.util.R;

@RestController
@RequestMapping("/kylin/api")
public class KylinController {

	@Autowired
	private KylinHttpService kylinHttpService;
	
	@RequestMapping("/query")
	public R query(String sql,String projectName){
		//接收参数json列表(kylin只接受json格式数据)
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("sql", sql);
		jsonObject.put("offset", 0);
		jsonObject.put("limit", 100);
		jsonObject.put("project", projectName);
		
		String queryResult = kylinHttpService.query(jsonObject.toJSONString());
		JSONObject parseObject = JSON.parseObject(queryResult);
		Object results = parseObject.get("results");
		return R.ok().put("data", results);
	}
}
