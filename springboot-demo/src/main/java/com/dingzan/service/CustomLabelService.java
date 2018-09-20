package com.dingzan.service;

import com.dingzan.domain.CustomLabel;
import com.dingzan.utils.DataGridResult;

public interface CustomLabelService {

	DataGridResult list(CustomLabel customlabel,Integer pageNo, Integer rows);
}
