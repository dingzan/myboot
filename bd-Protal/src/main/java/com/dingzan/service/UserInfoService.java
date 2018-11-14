package com.dingzan.service;

import com.dingzan.utils.LayGridResult;

public interface UserInfoService {

	LayGridResult findAll(int page, int limit);
}
