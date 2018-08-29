package com.dingzan.domain;

public class Userdata {
    private Long id;

    private String dateinterval;

    private String zone;

    private Long pv;

    private Long uv;

    private Long activeuser;

    private Long newuser;

    private Double avgtime;

    private Long sessioncount;

    private Double userstickiness;

    private Double bouncerate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDateinterval() {
        return dateinterval;
    }

    public void setDateinterval(String dateinterval) {
        this.dateinterval = dateinterval == null ? null : dateinterval.trim();
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone == null ? null : zone.trim();
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

    public Long getActiveuser() {
        return activeuser;
    }

    public void setActiveuser(Long activeuser) {
        this.activeuser = activeuser;
    }

    public Long getNewuser() {
        return newuser;
    }

    public void setNewuser(Long newuser) {
        this.newuser = newuser;
    }

    public Double getAvgtime() {
        return avgtime;
    }

    public void setAvgtime(Double avgtime) {
        this.avgtime = avgtime;
    }

    public Long getSessioncount() {
        return sessioncount;
    }

    public void setSessioncount(Long sessioncount) {
        this.sessioncount = sessioncount;
    }

    public Double getUserstickiness() {
        return userstickiness;
    }

    public void setUserstickiness(Double userstickiness) {
        this.userstickiness = userstickiness;
    }

    public Double getBouncerate() {
        return bouncerate;
    }

    public void setBouncerate(Double bouncerate) {
        this.bouncerate = bouncerate;
    }
}