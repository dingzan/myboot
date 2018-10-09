package com.dingzan.domain;

import java.util.Date;

public class AccountInfo {
    private Long id;

    private Long cusId;

    private String primaryAccount;

    private String productName;

    private String bankName;

    private String tradeAmount;

    private Date tradeTime;

    private String tradeWay;

    private String tradeTerminal;

    private String tradeDirection;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCusId() {
        return cusId;
    }

    public void setCusId(Long cusId) {
        this.cusId = cusId;
    }

    public String getPrimaryAccount() {
        return primaryAccount;
    }

    public void setPrimaryAccount(String primaryAccount) {
        this.primaryAccount = primaryAccount == null ? null : primaryAccount.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount == null ? null : tradeAmount.trim();
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getTradeWay() {
        return tradeWay;
    }

    public void setTradeWay(String tradeWay) {
        this.tradeWay = tradeWay == null ? null : tradeWay.trim();
    }

    public String getTradeTerminal() {
        return tradeTerminal;
    }

    public void setTradeTerminal(String tradeTerminal) {
        this.tradeTerminal = tradeTerminal == null ? null : tradeTerminal.trim();
    }

    public String getTradeDirection() {
        return tradeDirection;
    }

    public void setTradeDirection(String tradeDirection) {
        this.tradeDirection = tradeDirection == null ? null : tradeDirection.trim();
    }
}