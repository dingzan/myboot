package com.dingzan.service;

import com.dingzan.domain.CustomLabel;
import com.dingzan.pojo.CustomLabelVO;
import com.dingzan.utils.DataGridResult;

public interface CustomLabelService {

	DataGridResult list(CustomLabelVO vo);

	CustomLabel get(Long id);
	
	int add(CustomLabel customLabel);
	
	int remove(Long id);

	int update(CustomLabel customLabel);
	
}
