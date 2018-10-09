package com.dingzan.domain;

import java.util.ArrayList;
import java.util.List;

public class CustomLabelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomLabelExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFirstcategoryIsNull() {
            addCriterion("firstCategory is null");
            return (Criteria) this;
        }

        public Criteria andFirstcategoryIsNotNull() {
            addCriterion("firstCategory is not null");
            return (Criteria) this;
        }

        public Criteria andFirstcategoryEqualTo(String value) {
            addCriterion("firstCategory =", value, "firstcategory");
            return (Criteria) this;
        }

        public Criteria andFirstcategoryNotEqualTo(String value) {
            addCriterion("firstCategory <>", value, "firstcategory");
            return (Criteria) this;
        }

        public Criteria andFirstcategoryGreaterThan(String value) {
            addCriterion("firstCategory >", value, "firstcategory");
            return (Criteria) this;
        }

        public Criteria andFirstcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("firstCategory >=", value, "firstcategory");
            return (Criteria) this;
        }

        public Criteria andFirstcategoryLessThan(String value) {
            addCriterion("firstCategory <", value, "firstcategory");
            return (Criteria) this;
        }

        public Criteria andFirstcategoryLessThanOrEqualTo(String value) {
            addCriterion("firstCategory <=", value, "firstcategory");
            return (Criteria) this;
        }

        public Criteria andFirstcategoryLike(String value) {
            addCriterion("firstCategory like", value, "firstcategory");
            return (Criteria) this;
        }

        public Criteria andFirstcategoryNotLike(String value) {
            addCriterion("firstCategory not like", value, "firstcategory");
            return (Criteria) this;
        }

        public Criteria andFirstcategoryIn(List<String> values) {
            addCriterion("firstCategory in", values, "firstcategory");
            return (Criteria) this;
        }

        public Criteria andFirstcategoryNotIn(List<String> values) {
            addCriterion("firstCategory not in", values, "firstcategory");
            return (Criteria) this;
        }

        public Criteria andFirstcategoryBetween(String value1, String value2) {
            addCriterion("firstCategory between", value1, value2, "firstcategory");
            return (Criteria) this;
        }

        public Criteria andFirstcategoryNotBetween(String value1, String value2) {
            addCriterion("firstCategory not between", value1, value2, "firstcategory");
            return (Criteria) this;
        }

        public Criteria andSecondcategoryIsNull() {
            addCriterion("secondCategory is null");
            return (Criteria) this;
        }

        public Criteria andSecondcategoryIsNotNull() {
            addCriterion("secondCategory is not null");
            return (Criteria) this;
        }

        public Criteria andSecondcategoryEqualTo(String value) {
            addCriterion("secondCategory =", value, "secondcategory");
            return (Criteria) this;
        }

        public Criteria andSecondcategoryNotEqualTo(String value) {
            addCriterion("secondCategory <>", value, "secondcategory");
            return (Criteria) this;
        }

        public Criteria andSecondcategoryGreaterThan(String value) {
            addCriterion("secondCategory >", value, "secondcategory");
            return (Criteria) this;
        }

        public Criteria andSecondcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("secondCategory >=", value, "secondcategory");
            return (Criteria) this;
        }

        public Criteria andSecondcategoryLessThan(String value) {
            addCriterion("secondCategory <", value, "secondcategory");
            return (Criteria) this;
        }

        public Criteria andSecondcategoryLessThanOrEqualTo(String value) {
            addCriterion("secondCategory <=", value, "secondcategory");
            return (Criteria) this;
        }

        public Criteria andSecondcategoryLike(String value) {
            addCriterion("secondCategory like", value, "secondcategory");
            return (Criteria) this;
        }

        public Criteria andSecondcategoryNotLike(String value) {
            addCriterion("secondCategory not like", value, "secondcategory");
            return (Criteria) this;
        }

        public Criteria andSecondcategoryIn(List<String> values) {
            addCriterion("secondCategory in", values, "secondcategory");
            return (Criteria) this;
        }

        public Criteria andSecondcategoryNotIn(List<String> values) {
            addCriterion("secondCategory not in", values, "secondcategory");
            return (Criteria) this;
        }

        public Criteria andSecondcategoryBetween(String value1, String value2) {
            addCriterion("secondCategory between", value1, value2, "secondcategory");
            return (Criteria) this;
        }

        public Criteria andSecondcategoryNotBetween(String value1, String value2) {
            addCriterion("secondCategory not between", value1, value2, "secondcategory");
            return (Criteria) this;
        }

        public Criteria andThirdcategoryIsNull() {
            addCriterion("ThirdCategory is null");
            return (Criteria) this;
        }

        public Criteria andThirdcategoryIsNotNull() {
            addCriterion("ThirdCategory is not null");
            return (Criteria) this;
        }

        public Criteria andThirdcategoryEqualTo(String value) {
            addCriterion("ThirdCategory =", value, "thirdcategory");
            return (Criteria) this;
        }

        public Criteria andThirdcategoryNotEqualTo(String value) {
            addCriterion("ThirdCategory <>", value, "thirdcategory");
            return (Criteria) this;
        }

        public Criteria andThirdcategoryGreaterThan(String value) {
            addCriterion("ThirdCategory >", value, "thirdcategory");
            return (Criteria) this;
        }

        public Criteria andThirdcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("ThirdCategory >=", value, "thirdcategory");
            return (Criteria) this;
        }

        public Criteria andThirdcategoryLessThan(String value) {
            addCriterion("ThirdCategory <", value, "thirdcategory");
            return (Criteria) this;
        }

        public Criteria andThirdcategoryLessThanOrEqualTo(String value) {
            addCriterion("ThirdCategory <=", value, "thirdcategory");
            return (Criteria) this;
        }

        public Criteria andThirdcategoryLike(String value) {
            addCriterion("ThirdCategory like", value, "thirdcategory");
            return (Criteria) this;
        }

        public Criteria andThirdcategoryNotLike(String value) {
            addCriterion("ThirdCategory not like", value, "thirdcategory");
            return (Criteria) this;
        }

        public Criteria andThirdcategoryIn(List<String> values) {
            addCriterion("ThirdCategory in", values, "thirdcategory");
            return (Criteria) this;
        }

        public Criteria andThirdcategoryNotIn(List<String> values) {
            addCriterion("ThirdCategory not in", values, "thirdcategory");
            return (Criteria) this;
        }

        public Criteria andThirdcategoryBetween(String value1, String value2) {
            addCriterion("ThirdCategory between", value1, value2, "thirdcategory");
            return (Criteria) this;
        }

        public Criteria andThirdcategoryNotBetween(String value1, String value2) {
            addCriterion("ThirdCategory not between", value1, value2, "thirdcategory");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}