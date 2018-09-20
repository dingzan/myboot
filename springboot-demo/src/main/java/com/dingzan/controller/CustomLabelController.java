package com.dingzan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dingzan.service.CustomLabelService;
import com.dingzan.utils.DataGridResult;
import com.dingzan.utils.QueryVO;
import com.dingzan.utils.R;

@RestController
@RequestMapping("/api/label")
public class CustomLabelController {
	
	@Autowired
	private CustomLabelService customLabelService;
	
	@PostMapping("/query")
	public R query(QueryVO vo){
		
		DataGridResult list = customLabelService.list(vo.getCustomLabel(), vo.getPageNo(), vo.getRows());
		
		return R.ok().put("data",list);
		
	}
    
    
    
}