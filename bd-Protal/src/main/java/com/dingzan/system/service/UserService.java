package com.dingzan.system.service;


import org.springframework.stereotype.Service;

import com.dingzan.system.domain.User;
import com.dingzan.utils.DataGridResult;

@Service
public interface UserService {
	
	User get(Long id);
	
	DataGridResult list(String keyworld,Integer page, Integer limi);
	
	int remove(Long userId);
	
	int resetPwd(User user);

	int save(User user);

	int update(User user);
}
