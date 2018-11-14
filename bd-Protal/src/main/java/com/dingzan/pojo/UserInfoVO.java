package com.dingzan.pojo;

import com.dingzan.domain.Userinfo;

public class UserInfoVO extends Userinfo{
	
	
	private int page;
	
	private int limit;

	

	public int getPage() {
		return page;
	}



	public void setPage(int page) {
		this.page = page;
	}



	public int getLimit() {
		return limit;
	}



	public void setLimit(int limit) {
		this.limit = limit;
	}



	public UserInfoVO() {
		super();
	}
	
	
}
