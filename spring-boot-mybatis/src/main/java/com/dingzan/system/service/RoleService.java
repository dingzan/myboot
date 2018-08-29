package com.dingzan.system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dingzan.system.domain.Role;
import com.dingzan.utils.DataGridResult;

@Service
public interface RoleService {
	
	Role get(Long id);
	
	DataGridResult list(String keyworld, Integer page, Integer limit);
	
	List<Role> list(Long userId);
	
	
	int remove(Long id);
	
	
	int save(Role role);

	int update(Role role);


}
