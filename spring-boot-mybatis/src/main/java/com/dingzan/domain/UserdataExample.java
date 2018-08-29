package com.dingzan.domain;

import java.util.ArrayList;
import java.util.List;

public class UserdataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserdataExample() {
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

        public Criteria andDateintervalIsNull() {
            addCriterion("dateInterval is null");
            return (Criteria) this;
        }

        public Criteria andDateintervalIsNotNull() {
            addCriterion("dateInterval is not null");
            return (Criteria) this;
        }

        public Criteria andDateintervalEqualTo(String value) {
            addCriterion("dateInterval =", value, "dateinterval");
            return (Criteria) this;
        }

        public Criteria andDateintervalNotEqualTo(String value) {
            addCriterion("dateInterval <>", value, "dateinterval");
            return (Criteria) this;
        }

        public Criteria andDateintervalGreaterThan(String value) {
            addCriterion("dateInterval >", value, "dateinterval");
            return (Criteria) this;
        }

        public Criteria andDateintervalGreaterThanOrEqualTo(String value) {
            addCriterion("dateInterval >=", value, "dateinterval");
            return (Criteria) this;
        }

        public Criteria andDateintervalLessThan(String value) {
            addCriterion("dateInterval <", value, "dateinterval");
            return (Criteria) this;
        }

        public Criteria andDateintervalLessThanOrEqualTo(String value) {
            addCriterion("dateInterval <=", value, "dateinterval");
            return (Criteria) this;
        }

        public Criteria andDateintervalLike(String value) {
            addCriterion("dateInterval like", value, "dateinterval");
            return (Criteria) this;
        }

        public Criteria andDateintervalNotLike(String value) {
            addCriterion("dateInterval not like", value, "dateinterval");
            return (Criteria) this;
        }

        public Criteria andDateintervalIn(List<String> values) {
            addCriterion("dateInterval in", values, "dateinterval");
            return (Criteria) this;
        }

        public Criteria andDateintervalNotIn(List<String> values) {
            addCriterion("dateInterval not in", values, "dateinterval");
            return (Criteria) this;
        }

        public Criteria andDateintervalBetween(String value1, String value2) {
            addCriterion("dateInterval between", value1, value2, "dateinterval");
            return (Criteria) this;
        }

        public Criteria andDateintervalNotBetween(String value1, String value2) {
            addCriterion("dateInterval not between", value1, value2, "dateinterval");
            return (Criteria) this;
        }

        public Criteria andZoneIsNull() {
            addCriterion("zone is null");
            return (Criteria) this;
        }

        public Criteria andZoneIsNotNull() {
            addCriterion("zone is not null");
            return (Criteria) this;
        }

        public Criteria andZoneEqualTo(String value) {
            addCriterion("zone =", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotEqualTo(String value) {
            addCriterion("zone <>", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneGreaterThan(String value) {
            addCriterion("zone >", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneGreaterThanOrEqualTo(String value) {
            addCriterion("zone >=", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLessThan(String value) {
            addCriterion("zone <", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLessThanOrEqualTo(String value) {
            addCriterion("zone <=", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLike(String value) {
            addCriterion("zone like", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotLike(String value) {
            addCriterion("zone not like", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneIn(List<String> values) {
            addCriterion("zone in", values, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotIn(List<String> values) {
            addCriterion("zone not in", values, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneBetween(String value1, String value2) {
            addCriterion("zone between", value1, value2, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotBetween(String value1, String value2) {
            addCriterion("zone not between", value1, value2, "zone");
            return (Criteria) this;
        }

        public Criteria andPvIsNull() {
            addCriterion("PV is null");
            return (Criteria) this;
        }

        public Criteria andPvIsNotNull() {
            addCriterion("PV is not null");
            return (Criteria) this;
        }

        public Criteria andPvEqualTo(Long value) {
            addCriterion("PV =", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotEqualTo(Long value) {
            addCriterion("PV <>", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThan(Long value) {
            addCriterion("PV >", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThanOrEqualTo(Long value) {
            addCriterion("PV >=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThan(Long value) {
            addCriterion("PV <", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThanOrEqualTo(Long value) {
            addCriterion("PV <=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvIn(List<Long> values) {
            addCriterion("PV in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotIn(List<Long> values) {
            addCriterion("PV not in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvBetween(Long value1, Long value2) {
            addCriterion("PV between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotBetween(Long value1, Long value2) {
            addCriterion("PV not between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andUvIsNull() {
            addCriterion("UV is null");
            return (Criteria) this;
        }

        public Criteria andUvIsNotNull() {
            addCriterion("UV is not null");
            return (Criteria) this;
        }

        public Criteria andUvEqualTo(Long value) {
            addCriterion("UV =", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotEqualTo(Long value) {
            addCriterion("UV <>", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvGreaterThan(Long value) {
            addCriterion("UV >", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvGreaterThanOrEqualTo(Long value) {
            addCriterion("UV >=", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvLessThan(Long value) {
            addCriterion("UV <", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvLessThanOrEqualTo(Long value) {
            addCriterion("UV <=", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvIn(List<Long> values) {
            addCriterion("UV in", values, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotIn(List<Long> values) {
            addCriterion("UV not in", values, "uv");
            return (Criteria) this;
        }

        public Criteria andUvBetween(Long value1, Long value2) {
            addCriterion("UV between", value1, value2, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotBetween(Long value1, Long value2) {
            addCriterion("UV not between", value1, value2, "uv");
            return (Criteria) this;
        }

        public Criteria andActiveuserIsNull() {
            addCriterion("activeUser is null");
            return (Criteria) this;
        }

        public Criteria andActiveuserIsNotNull() {
            addCriterion("activeUser is not null");
            return (Criteria) this;
        }

        public Criteria andActiveuserEqualTo(Long value) {
            addCriterion("activeUser =", value, "activeuser");
            return (Criteria) this;
        }

        public Criteria andActiveuserNotEqualTo(Long value) {
            addCriterion("activeUser <>", value, "activeuser");
            return (Criteria) this;
        }

        public Criteria andActiveuserGreaterThan(Long value) {
            addCriterion("activeUser >", value, "activeuser");
            return (Criteria) this;
        }

        public Criteria andActiveuserGreaterThanOrEqualTo(Long value) {
            addCriterion("activeUser >=", value, "activeuser");
            return (Criteria) this;
        }

        public Criteria andActiveuserLessThan(Long value) {
            addCriterion("activeUser <", value, "activeuser");
            return (Criteria) this;
        }

        public Criteria andActiveuserLessThanOrEqualTo(Long value) {
            addCriterion("activeUser <=", value, "activeuser");
            return (Criteria) this;
        }

        public Criteria andActiveuserIn(List<Long> values) {
            addCriterion("activeUser in", values, "activeuser");
            return (Criteria) this;
        }

        public Criteria andActiveuserNotIn(List<Long> values) {
            addCriterion("activeUser not in", values, "activeuser");
            return (Criteria) this;
        }

        public Criteria andActiveuserBetween(Long value1, Long value2) {
            addCriterion("activeUser between", value1, value2, "activeuser");
            return (Criteria) this;
        }

        public Criteria andActiveuserNotBetween(Long value1, Long value2) {
            addCriterion("activeUser not between", value1, value2, "activeuser");
            return (Criteria) this;
        }

        public Criteria andNewuserIsNull() {
            addCriterion("newUser is null");
            return (Criteria) this;
        }

        public Criteria andNewuserIsNotNull() {
            addCriterion("newUser is not null");
            return (Criteria) this;
        }

        public Criteria andNewuserEqualTo(Long value) {
            addCriterion("newUser =", value, "newuser");
            return (Criteria) this;
        }

        public Criteria andNewuserNotEqualTo(Long value) {
            addCriterion("newUser <>", value, "newuser");
            return (Criteria) this;
        }

        public Criteria andNewuserGreaterThan(Long value) {
            addCriterion("newUser >", value, "newuser");
            return (Criteria) this;
        }

        public Criteria andNewuserGreaterThanOrEqualTo(Long value) {
            addCriterion("newUser >=", value, "newuser");
            return (Criteria) this;
        }

        public Criteria andNewuserLessThan(Long value) {
            addCriterion("newUser <", value, "newuser");
            return (Criteria) this;
        }

        public Criteria andNewuserLessThanOrEqualTo(Long value) {
            addCriterion("newUser <=", value, "newuser");
            return (Criteria) this;
        }

        public Criteria andNewuserIn(List<Long> values) {
            addCriterion("newUser in", values, "newuser");
            return (Criteria) this;
        }

        public Criteria andNewuserNotIn(List<Long> values) {
            addCriterion("newUser not in", values, "newuser");
            return (Criteria) this;
        }

        public Criteria andNewuserBetween(Long value1, Long value2) {
            addCriterion("newUser between", value1, value2, "newuser");
            return (Criteria) this;
        }

        public Criteria andNewuserNotBetween(Long value1, Long value2) {
            addCriterion("newUser not between", value1, value2, "newuser");
            return (Criteria) this;
        }

        public Criteria andAvgtimeIsNull() {
            addCriterion("avgTime is null");
            return (Criteria) this;
        }

        public Criteria andAvgtimeIsNotNull() {
            addCriterion("avgTime is not null");
            return (Criteria) this;
        }

        public Criteria andAvgtimeEqualTo(Double value) {
            addCriterion("avgTime =", value, "avgtime");
            return (Criteria) this;
        }

        public Criteria andAvgtimeNotEqualTo(Double value) {
            addCriterion("avgTime <>", value, "avgtime");
            return (Criteria) this;
        }

        public Criteria andAvgtimeGreaterThan(Double value) {
            addCriterion("avgTime >", value, "avgtime");
            return (Criteria) this;
        }

        public Criteria andAvgtimeGreaterThanOrEqualTo(Double value) {
            addCriterion("avgTime >=", value, "avgtime");
            return (Criteria) this;
        }

        public Criteria andAvgtimeLessThan(Double value) {
            addCriterion("avgTime <", value, "avgtime");
            return (Criteria) this;
        }

        public Criteria andAvgtimeLessThanOrEqualTo(Double value) {
            addCriterion("avgTime <=", value, "avgtime");
            return (Criteria) this;
        }

        public Criteria andAvgtimeIn(List<Double> values) {
            addCriterion("avgTime in", values, "avgtime");
            return (Criteria) this;
        }

        public Criteria andAvgtimeNotIn(List<Double> values) {
            addCriterion("avgTime not in", values, "avgtime");
            return (Criteria) this;
        }

        public Criteria andAvgtimeBetween(Double value1, Double value2) {
            addCriterion("avgTime between", value1, value2, "avgtime");
            return (Criteria) this;
        }

        public Criteria andAvgtimeNotBetween(Double value1, Double value2) {
            addCriterion("avgTime not between", value1, value2, "avgtime");
            return (Criteria) this;
        }

        public Criteria andSessioncountIsNull() {
            addCriterion("sessionCount is null");
            return (Criteria) this;
        }

        public Criteria andSessioncountIsNotNull() {
            addCriterion("sessionCount is not null");
            return (Criteria) this;
        }

        public Criteria andSessioncountEqualTo(Long value) {
            addCriterion("sessionCount =", value, "sessioncount");
            return (Criteria) this;
        }

        public Criteria andSessioncountNotEqualTo(Long value) {
            addCriterion("sessionCount <>", value, "sessioncount");
            return (Criteria) this;
        }

        public Criteria andSessioncountGreaterThan(Long value) {
            addCriterion("sessionCount >", value, "sessioncount");
            return (Criteria) this;
        }

        public Criteria andSessioncountGreaterThanOrEqualTo(Long value) {
            addCriterion("sessionCount >=", value, "sessioncount");
            return (Criteria) this;
        }

        public Criteria andSessioncountLessThan(Long value) {
            addCriterion("sessionCount <", value, "sessioncount");
            return (Criteria) this;
        }

        public Criteria andSessioncountLessThanOrEqualTo(Long value) {
            addCriterion("sessionCount <=", value, "sessioncount");
            return (Criteria) this;
        }

        public Criteria andSessioncountIn(List<Long> values) {
            addCriterion("sessionCount in", values, "sessioncount");
            return (Criteria) this;
        }

        public Criteria andSessioncountNotIn(List<Long> values) {
            addCriterion("sessionCount not in", values, "sessioncount");
            return (Criteria) this;
        }

        public Criteria andSessioncountBetween(Long value1, Long value2) {
            addCriterion("sessionCount between", value1, value2, "sessioncount");
            return (Criteria) this;
        }

        public Criteria andSessioncountNotBetween(Long value1, Long value2) {
            addCriterion("sessionCount not between", value1, value2, "sessioncount");
            return (Criteria) this;
        }

        public Criteria andUserstickinessIsNull() {
            addCriterion("userStickiness is null");
            return (Criteria) this;
        }

        public Criteria andUserstickinessIsNotNull() {
            addCriterion("userStickiness is not null");
            return (Criteria) this;
        }

        public Criteria andUserstickinessEqualTo(Double value) {
            addCriterion("userStickiness =", value, "userstickiness");
            return (Criteria) this;
        }

        public Criteria andUserstickinessNotEqualTo(Double value) {
            addCriterion("userStickiness <>", value, "userstickiness");
            return (Criteria) this;
        }

        public Criteria andUserstickinessGreaterThan(Double value) {
            addCriterion("userStickiness >", value, "userstickiness");
            return (Criteria) this;
        }

        public Criteria andUserstickinessGreaterThanOrEqualTo(Double value) {
            addCriterion("userStickiness >=", value, "userstickiness");
            return (Criteria) this;
        }

        public Criteria andUserstickinessLessThan(Double value) {
            addCriterion("userStickiness <", value, "userstickiness");
            return (Criteria) this;
        }

        public Criteria andUserstickinessLessThanOrEqualTo(Double value) {
            addCriterion("userStickiness <=", value, "userstickiness");
            return (Criteria) this;
        }

        public Criteria andUserstickinessIn(List<Double> values) {
            addCriterion("userStickiness in", values, "userstickiness");
            return (Criteria) this;
        }

        public Criteria andUserstickinessNotIn(List<Double> values) {
            addCriterion("userStickiness not in", values, "userstickiness");
            return (Criteria) this;
        }

        public Criteria andUserstickinessBetween(Double value1, Double value2) {
            addCriterion("userStickiness between", value1, value2, "userstickiness");
            return (Criteria) this;
        }

        public Criteria andUserstickinessNotBetween(Double value1, Double value2) {
            addCriterion("userStickiness not between", value1, value2, "userstickiness");
            return (Criteria) this;
        }

        public Criteria andBouncerateIsNull() {
            addCriterion("bounceRate is null");
            return (Criteria) this;
        }

        public Criteria andBouncerateIsNotNull() {
            addCriterion("bounceRate is not null");
            return (Criteria) this;
        }

        public Criteria andBouncerateEqualTo(Double value) {
            addCriterion("bounceRate =", value, "bouncerate");
            return (Criteria) this;
        }

        public Criteria andBouncerateNotEqualTo(Double value) {
            addCriterion("bounceRate <>", value, "bouncerate");
            return (Criteria) this;
        }

        public Criteria andBouncerateGreaterThan(Double value) {
            addCriterion("bounceRate >", value, "bouncerate");
            return (Criteria) this;
        }

        public Criteria andBouncerateGreaterThanOrEqualTo(Double value) {
            addCriterion("bounceRate >=", value, "bouncerate");
            return (Criteria) this;
        }

        public Criteria andBouncerateLessThan(Double value) {
            addCriterion("bounceRate <", value, "bouncerate");
            return (Criteria) this;
        }

        public Criteria andBouncerateLessThanOrEqualTo(Double value) {
            addCriterion("bounceRate <=", value, "bouncerate");
            return (Criteria) this;
        }

        public Criteria andBouncerateIn(List<Double> values) {
            addCriterion("bounceRate in", values, "bouncerate");
            return (Criteria) this;
        }

        public Criteria andBouncerateNotIn(List<Double> values) {
            addCriterion("bounceRate not in", values, "bouncerate");
            return (Criteria) this;
        }

        public Criteria andBouncerateBetween(Double value1, Double value2) {
            addCriterion("bounceRate between", value1, value2, "bouncerate");
            return (Criteria) this;
        }

        public Criteria andBouncerateNotBetween(Double value1, Double value2) {
            addCriterion("bounceRate not between", value1, value2, "bouncerate");
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