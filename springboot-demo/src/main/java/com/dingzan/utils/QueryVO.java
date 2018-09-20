package com.dingzan.utils;

import com.dingzan.domain.CustomLabel;
import com.dingzan.system.domain.User;

/**
 * 分页条件查询模型
 * @author dingzan
 *
 */
public class QueryVO {
	
	private User user;
	
	private CustomLabel customLabel;
	
	private int pageNo;
	
	private int rows;

	public User getUser() {
		return user;
	}

	public CustomLabel getCustomLabel() {
		return customLabel;
	}

	public void setCustomLabel(CustomLabel customLabel) {
		this.customLabel = customLabel;
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

	public void setUser(User user) {
		this.user = user;
	}

	
}
