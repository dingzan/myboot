package com.dingzan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dingzan.dao.CategoryMapper;
import com.dingzan.domain.Category;
import com.dingzan.domain.CategoryExample;
import com.dingzan.domain.CategoryExample.Criteria;
import com.dingzan.service.CategoryService;

@Transactional
@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryMapper categoryMapper;
	
	@Override
	public List<Category> get(Long parentId) {
		CategoryExample example = new CategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentidEqualTo(parentId);
		return categoryMapper.selectByExample(example);
	}

	@Override
	public int add(Category category) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Category category) {
		// TODO Auto-generated method stub
		return 0;
	}

}
