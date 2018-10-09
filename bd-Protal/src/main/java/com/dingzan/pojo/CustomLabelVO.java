package com.dingzan.pojo;

import com.dingzan.domain.CustomLabel;

public class CustomLabelVO extends CustomLabel{
	
	
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

	public CustomLabelVO() {
		super();
	}
	
	
}
