package com.dingzan.utils;

import java.io.Serializable;
import java.util.List;

public class LayGridResult implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// 总记录数
	private long count;
	// 列表数据
	private List<?> data;
	//code 返回码
	private int code;
	//msg 返回信息
	private String msg;
	
	public LayGridResult() {
		super();
	}

	public LayGridResult(long count, List<?> data, int code, String msg) {
		super();
		this.count = count;
		this.data = data;
		this.code = code;
		this.msg = msg;
	}
	
	public LayGridResult(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
