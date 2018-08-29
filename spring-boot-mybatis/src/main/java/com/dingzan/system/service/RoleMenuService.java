package com.dingzan.system.service;

import java.util.List;

public interface RoleMenuService {

	void deleteByRoleId(Long roleId);
	
	void saveOrUpdate(Long roleId, List<Long> menuIdList);

	List<Long> selectMenuIdByRoleId(Long roleId);
}
