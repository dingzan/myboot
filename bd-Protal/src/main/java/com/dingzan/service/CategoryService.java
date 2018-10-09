package com.dingzan.service;

import java.util.List;

import com.dingzan.domain.Category;

public interface CategoryService {

	List<Category> get(Long parentId);
	
	int add(Category category);
	
	int remove(Long id);

	int update(Category category);
}
