package com.dingzan.service;

import java.util.List;

import com.dingzan.domain.Userinfo;
import com.dingzan.domain.UserinfoExample;
import com.dingzan.utils.DataGridResult;

public interface UserInfoService {

	DataGridResult list(Integer page, Integer limit);
	
	List<Userinfo> listByExample(UserinfoExample example);
}
