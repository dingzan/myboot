package com.dingzan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dingzan.domain.Category;
import com.dingzan.domain.CustomLabel;
import com.dingzan.pojo.CustomLabelVO;
import com.dingzan.service.CategoryService;
import com.dingzan.service.CustomLabelService;
import com.dingzan.utils.DataGridResult;
import com.dingzan.utils.R;

@RestController
@RequestMapping("/api/label")
public class CustomLabelController {
	
	@Autowired
	private CustomLabelService customLabelService;
	
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/query")
	public R query(@RequestBody CustomLabelVO vo){
		DataGridResult list = customLabelService.list(vo);
		return R.ok().put("data",list);
		
	}
	
	@GetMapping("/get/{id}")
	public R getLabel(@PathVariable Long id){
		CustomLabel customLabel = customLabelService.get(id);
		return R.ok().put("data", customLabel);
		
	}
	
	@PostMapping("/add")
	public R add(@RequestBody CustomLabel customLabel){
		int i = customLabelService.add(customLabel);
		if (i==0) {
			return R.error(1, "添加标签失败");
		}
		return R.ok();
	}
	
	@PostMapping("/edit")
	public R edit(@RequestBody CustomLabel customLabel){
		int count = customLabelService.update(customLabel);
		if (count==0) {
			return R.error(1, "修改标签失败");
		}
		return R.ok();
	}

	@GetMapping("/remove/{id}")
	public R removeLabel(@PathVariable Long id){
		int count = customLabelService.remove(id);
		if (count==0) {
			return R.error(1, "删除标签失败");
		}
		return R.ok();
	}
	
	@GetMapping("/category/{parentid}")
	public R category(@PathVariable Long parentid){
		List<Category> list = categoryService.get(parentid);
		if (list.size()==0) {
			return R.error(1, "加载失败！");
		}
		return R.ok().put("data", list);
	}
	
	
    
}