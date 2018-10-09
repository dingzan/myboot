package com.dingzan.pojo;

public class CustomerInfoVO {

	private Long cusId;

    private String cusName;

    private String cusType;

    private String cusAccount;

    private String idType;

    private String idNumber;

    private String[] cusLabel;

	public CustomerInfoVO() {
		super();
	}

	public Long getCusId() {
		return cusId;
	}

	public void setCusId(Long cusId) {
		this.cusId = cusId;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getCusType() {
		return cusType;
	}

	public void setCusType(String cusType) {
		this.cusType = cusType;
	}

	public String getCusAccount() {
		return cusAccount;
	}

	public void setCusAccount(String cusAccount) {
		this.cusAccount = cusAccount;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String[] getCusLabel() {
		return cusLabel;
	}

	public void setCusLabel(String[] cusLabel) {
		this.cusLabel = cusLabel;
	}
    
}
