package com.dingzan.pojo;

import com.dingzan.domain.AccountInfo;

public class AccountInfoVO extends AccountInfo{
	
	private int pageNo;
	
	private int rows;
	
	public AccountInfoVO() {
		super();
	}

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

}
