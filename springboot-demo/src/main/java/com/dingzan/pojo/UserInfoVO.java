package com.dingzan.pojo;

import com.dingzan.domain.Userinfo;

public class UserInfoVO extends Userinfo{
	
	
	private int pageNo;
	
	private int rows;

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public UserInfoVO() {
		super();
	}
	
	
}
