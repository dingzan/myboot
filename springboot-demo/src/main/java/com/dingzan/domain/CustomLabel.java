package com.dingzan.domain;

public class CustomLabel {
    private Long id;

    private String name;

    private String firstcategory;

    private String secondcategory;

    private String thirdcategory;

    private String comment;

    
    public CustomLabel() {
		super();
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFirstcategory() {
        return firstcategory;
    }

    public void setFirstcategory(String firstcategory) {
        this.firstcategory = firstcategory == null ? null : firstcategory.trim();
    }

    public String getSecondcategory() {
        return secondcategory;
    }

    public void setSecondcategory(String secondcategory) {
        this.secondcategory = secondcategory == null ? null : secondcategory.trim();
    }

    public String getThirdcategory() {
        return thirdcategory;
    }

    public void setThirdcategory(String thirdcategory) {
        this.thirdcategory = thirdcategory == null ? null : thirdcategory.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}