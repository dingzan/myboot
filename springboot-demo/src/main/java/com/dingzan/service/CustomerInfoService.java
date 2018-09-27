package com.dingzan.service;

import com.dingzan.pojo.CustomerInfoVO;
import com.dingzan.pojo.QueryVO;
import com.dingzan.utils.DataGridResult;

public interface CustomerInfoService {

	DataGridResult list(QueryVO vo);
	
	CustomerInfoVO getinfo(Long id);
	
	DataGridResult getaccount(int pageNo, int rows, Long cusId);
	
}
