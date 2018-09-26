package com.dingzan.domain;

public class CustomerInfo {
    private Long cusId;

    private String cusName;

    private String mobile;

    private String comment;

    private String cusType;

    private String cusAccount;

    private String idType;

    private String idNumber;

    private String cusLabel;

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
        this.cusName = cusName == null ? null : cusName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getCusType() {
        return cusType;
    }

    public void setCusType(String cusType) {
        this.cusType = cusType == null ? null : cusType.trim();
    }

    public String getCusAccount() {
        return cusAccount;
    }

    public void setCusAccount(String cusAccount) {
        this.cusAccount = cusAccount == null ? null : cusAccount.trim();
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getCusLabel() {
        return cusLabel;
    }

    public void setCusLabel(String cusLabel) {
        this.cusLabel = cusLabel == null ? null : cusLabel.trim();
    }
}