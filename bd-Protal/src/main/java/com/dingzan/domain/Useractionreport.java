package com.dingzan.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Useractionreport {
    private String demension;

    private Long pv;

    private Long uv;

    private Long access;

    private Long outAccess;

    private Long android;

    private Long ios;

    private Long avgTime;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createday;

    public String getDemension() {
        return demension;
    }

    public void setDemension(String demension) {
        this.demension = demension == null ? null : demension.trim();
    }

    public Long getPv() {
        return pv;
    }

    public void setPv(Long pv) {
        this.pv = pv;
    }

    public Long getUv() {
        return uv;
    }

    public void setUv(Long uv) {
        this.uv = uv;
    }

    public Long getAccess() {
        return access;
    }

    public void setAccess(Long access) {
        this.access = access;
    }

    public Long getOutAccess() {
        return outAccess;
    }

    public void setOutAccess(Long outAccess) {
        this.outAccess = outAccess;
    }

    public Long getAndroid() {
        return android;
    }

    public void setAndroid(Long android) {
        this.android = android;
    }

    public Long getIos() {
        return ios;
    }

    public void setIos(Long ios) {
        this.ios = ios;
    }

    public Long getAvgTime() {
        return avgTime;
    }

    public void setAvgTime(Long avgTime) {
        this.avgTime = avgTime;
    }

    public Date getCreateday() {
        return createday;
    }

    public void setCreateday(Date createday) {
        this.createday = createday;
    }
}