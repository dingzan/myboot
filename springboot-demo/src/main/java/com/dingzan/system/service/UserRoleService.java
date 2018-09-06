package com.dingzan.system.service;

import java.util.List;

public interface UserRoleService {

	//根据用户id获取角色id
	List<Long> selectRoleIdsByUserId(Long userId);

	void deleteByUserId(Long userId);

	void saveOrUpdate(Long userId, List<Long> roleIds);
	
	
}
