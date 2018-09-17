package com.dingzan.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UseractionreportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UseractionreportExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andDemensionIsNull() {
            addCriterion("demension is null");
            return (Criteria) this;
        }

        public Criteria andDemensionIsNotNull() {
            addCriterion("demension is not null");
            return (Criteria) this;
        }

        public Criteria andDemensionEqualTo(String value) {
            addCriterion("demension =", value, "demension");
            return (Criteria) this;
        }

        public Criteria andDemensionNotEqualTo(String value) {
            addCriterion("demension <>", value, "demension");
            return (Criteria) this;
        }

        public Criteria andDemensionGreaterThan(String value) {
            addCriterion("demension >", value, "demension");
            return (Criteria) this;
        }

        public Criteria andDemensionGreaterThanOrEqualTo(String value) {
            addCriterion("demension >=", value, "demension");
            return (Criteria) this;
        }

        public Criteria andDemensionLessThan(String value) {
            addCriterion("demension <", value, "demension");
            return (Criteria) this;
        }

        public Criteria andDemensionLessThanOrEqualTo(String value) {
            addCriterion("demension <=", value, "demension");
            return (Criteria) this;
        }

        public Criteria andDemensionLike(String value) {
            addCriterion("demension like", value, "demension");
            return (Criteria) this;
        }

        public Criteria andDemensionNotLike(String value) {
            addCriterion("demension not like", value, "demension");
            return (Criteria) this;
        }

        public Criteria andDemensionIn(List<String> values) {
            addCriterion("demension in", values, "demension");
            return (Criteria) this;
        }

        public Criteria andDemensionNotIn(List<String> values) {
            addCriterion("demension not in", values, "demension");
            return (Criteria) this;
        }

        public Criteria andDemensionBetween(String value1, String value2) {
            addCriterion("demension between", value1, value2, "demension");
            return (Criteria) this;
        }

        public Criteria andDemensionNotBetween(String value1, String value2) {
            addCriterion("demension not between", value1, value2, "demension");
            return (Criteria) this;
        }

        public Criteria andPvIsNull() {
            addCriterion("pv is null");
            return (Criteria) this;
        }

        public Criteria andPvIsNotNull() {
            addCriterion("pv is not null");
            return (Criteria) this;
        }

        public Criteria andPvEqualTo(Long value) {
            addCriterion("pv =", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotEqualTo(Long value) {
            addCriterion("pv <>", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThan(Long value) {
            addCriterion("pv >", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThanOrEqualTo(Long value) {
            addCriterion("pv >=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThan(Long value) {
            addCriterion("pv <", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThanOrEqualTo(Long value) {
            addCriterion("pv <=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvIn(List<Long> values) {
            addCriterion("pv in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotIn(List<Long> values) {
            addCriterion("pv not in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvBetween(Long value1, Long value2) {
            addCriterion("pv between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotBetween(Long value1, Long value2) {
            addCriterion("pv not between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andUvIsNull() {
            addCriterion("uv is null");
            return (Criteria) this;
        }

        public Criteria andUvIsNotNull() {
            addCriterion("uv is not null");
            return (Criteria) this;
        }

        public Criteria andUvEqualTo(Long value) {
            addCriterion("uv =", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotEqualTo(Long value) {
            addCriterion("uv <>", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvGreaterThan(Long value) {
            addCriterion("uv >", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvGreaterThanOrEqualTo(Long value) {
            addCriterion("uv >=", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvLessThan(Long value) {
            addCriterion("uv <", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvLessThanOrEqualTo(Long value) {
            addCriterion("uv <=", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvIn(List<Long> values) {
            addCriterion("uv in", values, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotIn(List<Long> values) {
            addCriterion("uv not in", values, "uv");
            return (Criteria) this;
        }

        public Criteria andUvBetween(Long value1, Long value2) {
            addCriterion("uv between", value1, value2, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotBetween(Long value1, Long value2) {
            addCriterion("uv not between", value1, value2, "uv");
            return (Criteria) this;
        }

        public Criteria andAccessIsNull() {
            addCriterion("access is null");
            return (Criteria) this;
        }

        public Criteria andAccessIsNotNull() {
            addCriterion("access is not null");
            return (Criteria) this;
        }

        public Criteria andAccessEqualTo(Long value) {
            addCriterion("access =", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessNotEqualTo(Long value) {
            addCriterion("access <>", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessGreaterThan(Long value) {
            addCriterion("access >", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessGreaterThanOrEqualTo(Long value) {
            addCriterion("access >=", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessLessThan(Long value) {
            addCriterion("access <", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessLessThanOrEqualTo(Long value) {
            addCriterion("access <=", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessIn(List<Long> values) {
            addCriterion("access in", values, "access");
            return (Criteria) this;
        }

        public Criteria andAccessNotIn(List<Long> values) {
            addCriterion("access not in", values, "access");
            return (Criteria) this;
        }

        public Criteria andAccessBetween(Long value1, Long value2) {
            addCriterion("access between", value1, value2, "access");
            return (Criteria) this;
        }

        public Criteria andAccessNotBetween(Long value1, Long value2) {
            addCriterion("access not between", value1, value2, "access");
            return (Criteria) this;
        }

        public Criteria andOutAccessIsNull() {
            addCriterion("out_access is null");
            return (Criteria) this;
        }

        public Criteria andOutAccessIsNotNull() {
            addCriterion("out_access is not null");
            return (Criteria) this;
        }

        public Criteria andOutAccessEqualTo(Long value) {
            addCriterion("out_access =", value, "outAccess");
            return (Criteria) this;
        }

        public Criteria andOutAccessNotEqualTo(Long value) {
            addCriterion("out_access <>", value, "outAccess");
            return (Criteria) this;
        }

        public Criteria andOutAccessGreaterThan(Long value) {
            addCriterion("out_access >", value, "outAccess");
            return (Criteria) this;
        }

        public Criteria andOutAccessGreaterThanOrEqualTo(Long value) {
            addCriterion("out_access >=", value, "outAccess");
            return (Criteria) this;
        }

        public Criteria andOutAccessLessThan(Long value) {
            addCriterion("out_access <", value, "outAccess");
            return (Criteria) this;
        }

        public Criteria andOutAccessLessThanOrEqualTo(Long value) {
            addCriterion("out_access <=", value, "outAccess");
            return (Criteria) this;
        }

        public Criteria andOutAccessIn(List<Long> values) {
            addCriterion("out_access in", values, "outAccess");
            return (Criteria) this;
        }

        public Criteria andOutAccessNotIn(List<Long> values) {
            addCriterion("out_access not in", values, "outAccess");
            return (Criteria) this;
        }

        public Criteria andOutAccessBetween(Long value1, Long value2) {
            addCriterion("out_access between", value1, value2, "outAccess");
            return (Criteria) this;
        }

        public Criteria andOutAccessNotBetween(Long value1, Long value2) {
            addCriterion("out_access not between", value1, value2, "outAccess");
            return (Criteria) this;
        }

        public Criteria andAndroidIsNull() {
            addCriterion("Android is null");
            return (Criteria) this;
        }

        public Criteria andAndroidIsNotNull() {
            addCriterion("Android is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidEqualTo(Long value) {
            addCriterion("Android =", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidNotEqualTo(Long value) {
            addCriterion("Android <>", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidGreaterThan(Long value) {
            addCriterion("Android >", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidGreaterThanOrEqualTo(Long value) {
            addCriterion("Android >=", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidLessThan(Long value) {
            addCriterion("Android <", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidLessThanOrEqualTo(Long value) {
            addCriterion("Android <=", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidIn(List<Long> values) {
            addCriterion("Android in", values, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidNotIn(List<Long> values) {
            addCriterion("Android not in", values, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidBetween(Long value1, Long value2) {
            addCriterion("Android between", value1, value2, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidNotBetween(Long value1, Long value2) {
            addCriterion("Android not between", value1, value2, "android");
            return (Criteria) this;
        }

        public Criteria andIosIsNull() {
            addCriterion("IOS is null");
            return (Criteria) this;
        }

        public Criteria andIosIsNotNull() {
            addCriterion("IOS is not null");
            return (Criteria) this;
        }

        public Criteria andIosEqualTo(Long value) {
            addCriterion("IOS =", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosNotEqualTo(Long value) {
            addCriterion("IOS <>", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosGreaterThan(Long value) {
            addCriterion("IOS >", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosGreaterThanOrEqualTo(Long value) {
            addCriterion("IOS >=", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosLessThan(Long value) {
            addCriterion("IOS <", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosLessThanOrEqualTo(Long value) {
            addCriterion("IOS <=", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosIn(List<Long> values) {
            addCriterion("IOS in", values, "ios");
            return (Criteria) this;
        }

        public Criteria andIosNotIn(List<Long> values) {
            addCriterion("IOS not in", values, "ios");
            return (Criteria) this;
        }

        public Criteria andIosBetween(Long value1, Long value2) {
            addCriterion("IOS between", value1, value2, "ios");
            return (Criteria) this;
        }

        public Criteria andIosNotBetween(Long value1, Long value2) {
            addCriterion("IOS not between", value1, value2, "ios");
            return (Criteria) this;
        }

        public Criteria andAvgTimeIsNull() {
            addCriterion("avg_time is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimeIsNotNull() {
            addCriterion("avg_time is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimeEqualTo(Long value) {
            addCriterion("avg_time =", value, "avgTime");
            return (Criteria) this;
        }

        public Criteria andAvgTimeNotEqualTo(Long value) {
            addCriterion("avg_time <>", value, "avgTime");
            return (Criteria) this;
        }

        public Criteria andAvgTimeGreaterThan(Long value) {
            addCriterion("avg_time >", value, "avgTime");
            return (Criteria) this;
        }

        public Criteria andAvgTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("avg_time >=", value, "avgTime");
            return (Criteria) this;
        }

        public Criteria andAvgTimeLessThan(Long value) {
            addCriterion("avg_time <", value, "avgTime");
            return (Criteria) this;
        }

        public Criteria andAvgTimeLessThanOrEqualTo(Long value) {
            addCriterion("avg_time <=", value, "avgTime");
            return (Criteria) this;
        }

        public Criteria andAvgTimeIn(List<Long> values) {
            addCriterion("avg_time in", values, "avgTime");
            return (Criteria) this;
        }

        public Criteria andAvgTimeNotIn(List<Long> values) {
            addCriterion("avg_time not in", values, "avgTime");
            return (Criteria) this;
        }

        public Criteria andAvgTimeBetween(Long value1, Long value2) {
            addCriterion("avg_time between", value1, value2, "avgTime");
            return (Criteria) this;
        }

        public Criteria andAvgTimeNotBetween(Long value1, Long value2) {
            addCriterion("avg_time not between", value1, value2, "avgTime");
            return (Criteria) this;
        }

        public Criteria andCreatedayIsNull() {
            addCriterion("createday is null");
            return (Criteria) this;
        }

        public Criteria andCreatedayIsNotNull() {
            addCriterion("createday is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedayEqualTo(Date value) {
            addCriterionForJDBCDate("createday =", value, "createday");
            return (Criteria) this;
        }

        public Criteria andCreatedayNotEqualTo(Date value) {
            addCriterionForJDBCDate("createday <>", value, "createday");
            return (Criteria) this;
        }

        public Criteria andCreatedayGreaterThan(Date value) {
            addCriterionForJDBCDate("createday >", value, "createday");
            return (Criteria) this;
        }

        public Criteria andCreatedayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createday >=", value, "createday");
            return (Criteria) this;
        }

        public Criteria andCreatedayLessThan(Date value) {
            addCriterionForJDBCDate("createday <", value, "createday");
            return (Criteria) this;
        }

        public Criteria andCreatedayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createday <=", value, "createday");
            return (Criteria) this;
        }

        public Criteria andCreatedayIn(List<Date> values) {
            addCriterionForJDBCDate("createday in", values, "createday");
            return (Criteria) this;
        }

        public Criteria andCreatedayNotIn(List<Date> values) {
            addCriterionForJDBCDate("createday not in", values, "createday");
            return (Criteria) this;
        }

        public Criteria andCreatedayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createday between", value1, value2, "createday");
            return (Criteria) this;
        }

        public Criteria andCreatedayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createday not between", value1, value2, "createday");
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