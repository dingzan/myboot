package com.dingzan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dingzan.pojo.CustomLabelVO;
import com.dingzan.service.CustomLabelService;
import com.dingzan.utils.DataGridResult;
import com.dingzan.utils.R;

@RestController
@RequestMapping("/api/label")
public class CustomLabelController {
	
	@Autowired
	private CustomLabelService customLabelService;
	
	@PostMapping("/query")
	public R query(@RequestBody CustomLabelVO vo){
		
		DataGridResult list = customLabelService.list(vo);
		
		return R.ok().put("data",list);
		
	}
    
    
}