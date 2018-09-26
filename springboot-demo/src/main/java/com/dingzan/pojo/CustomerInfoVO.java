package com.dingzan.pojo;

import com.dingzan.domain.CustomerInfo;

public class CustomerInfoVO extends CustomerInfo{
	
	private int pageNo;
	
	private int rows;
	
	public CustomerInfoVO() {
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
