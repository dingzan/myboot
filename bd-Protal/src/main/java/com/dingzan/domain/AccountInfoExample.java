package com.dingzan.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountInfoExample() {
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

        public Criteria andCusIdIsNull() {
            addCriterion("cus_id is null");
            return (Criteria) this;
        }

        public Criteria andCusIdIsNotNull() {
            addCriterion("cus_id is not null");
            return (Criteria) this;
        }

        public Criteria andCusIdEqualTo(Long value) {
            addCriterion("cus_id =", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotEqualTo(Long value) {
            addCriterion("cus_id <>", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdGreaterThan(Long value) {
            addCriterion("cus_id >", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cus_id >=", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdLessThan(Long value) {
            addCriterion("cus_id <", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdLessThanOrEqualTo(Long value) {
            addCriterion("cus_id <=", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdIn(List<Long> values) {
            addCriterion("cus_id in", values, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotIn(List<Long> values) {
            addCriterion("cus_id not in", values, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdBetween(Long value1, Long value2) {
            addCriterion("cus_id between", value1, value2, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotBetween(Long value1, Long value2) {
            addCriterion("cus_id not between", value1, value2, "cusId");
            return (Criteria) this;
        }

        public Criteria andPrimaryAccountIsNull() {
            addCriterion("primary_account is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryAccountIsNotNull() {
            addCriterion("primary_account is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryAccountEqualTo(String value) {
            addCriterion("primary_account =", value, "primaryAccount");
            return (Criteria) this;
        }

        public Criteria andPrimaryAccountNotEqualTo(String value) {
            addCriterion("primary_account <>", value, "primaryAccount");
            return (Criteria) this;
        }

        public Criteria andPrimaryAccountGreaterThan(String value) {
            addCriterion("primary_account >", value, "primaryAccount");
            return (Criteria) this;
        }

        public Criteria andPrimaryAccountGreaterThanOrEqualTo(String value) {
            addCriterion("primary_account >=", value, "primaryAccount");
            return (Criteria) this;
        }

        public Criteria andPrimaryAccountLessThan(String value) {
            addCriterion("primary_account <", value, "primaryAccount");
            return (Criteria) this;
        }

        public Criteria andPrimaryAccountLessThanOrEqualTo(String value) {
            addCriterion("primary_account <=", value, "primaryAccount");
            return (Criteria) this;
        }

        public Criteria andPrimaryAccountLike(String value) {
            addCriterion("primary_account like", value, "primaryAccount");
            return (Criteria) this;
        }

        public Criteria andPrimaryAccountNotLike(String value) {
            addCriterion("primary_account not like", value, "primaryAccount");
            return (Criteria) this;
        }

        public Criteria andPrimaryAccountIn(List<String> values) {
            addCriterion("primary_account in", values, "primaryAccount");
            return (Criteria) this;
        }

        public Criteria andPrimaryAccountNotIn(List<String> values) {
            addCriterion("primary_account not in", values, "primaryAccount");
            return (Criteria) this;
        }

        public Criteria andPrimaryAccountBetween(String value1, String value2) {
            addCriterion("primary_account between", value1, value2, "primaryAccount");
            return (Criteria) this;
        }

        public Criteria andPrimaryAccountNotBetween(String value1, String value2) {
            addCriterion("primary_account not between", value1, value2, "primaryAccount");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNull() {
            addCriterion("trade_amount is null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNotNull() {
            addCriterion("trade_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountEqualTo(String value) {
            addCriterion("trade_amount =", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotEqualTo(String value) {
            addCriterion("trade_amount <>", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThan(String value) {
            addCriterion("trade_amount >", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThanOrEqualTo(String value) {
            addCriterion("trade_amount >=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThan(String value) {
            addCriterion("trade_amount <", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThanOrEqualTo(String value) {
            addCriterion("trade_amount <=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLike(String value) {
            addCriterion("trade_amount like", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotLike(String value) {
            addCriterion("trade_amount not like", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIn(List<String> values) {
            addCriterion("trade_amount in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotIn(List<String> values) {
            addCriterion("trade_amount not in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountBetween(String value1, String value2) {
            addCriterion("trade_amount between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotBetween(String value1, String value2) {
            addCriterion("trade_amount not between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIsNull() {
            addCriterion("trade_time is null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIsNotNull() {
            addCriterion("trade_time is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeEqualTo(Date value) {
            addCriterion("trade_time =", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotEqualTo(Date value) {
            addCriterion("trade_time <>", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThan(Date value) {
            addCriterion("trade_time >", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trade_time >=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThan(Date value) {
            addCriterion("trade_time <", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanOrEqualTo(Date value) {
            addCriterion("trade_time <=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIn(List<Date> values) {
            addCriterion("trade_time in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotIn(List<Date> values) {
            addCriterion("trade_time not in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeBetween(Date value1, Date value2) {
            addCriterion("trade_time between", value1, value2, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotBetween(Date value1, Date value2) {
            addCriterion("trade_time not between", value1, value2, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeWayIsNull() {
            addCriterion("trade_way is null");
            return (Criteria) this;
        }

        public Criteria andTradeWayIsNotNull() {
            addCriterion("trade_way is not null");
            return (Criteria) this;
        }

        public Criteria andTradeWayEqualTo(String value) {
            addCriterion("trade_way =", value, "tradeWay");
            return (Criteria) this;
        }

        public Criteria andTradeWayNotEqualTo(String value) {
            addCriterion("trade_way <>", value, "tradeWay");
            return (Criteria) this;
        }

        public Criteria andTradeWayGreaterThan(String value) {
            addCriterion("trade_way >", value, "tradeWay");
            return (Criteria) this;
        }

        public Criteria andTradeWayGreaterThanOrEqualTo(String value) {
            addCriterion("trade_way >=", value, "tradeWay");
            return (Criteria) this;
        }

        public Criteria andTradeWayLessThan(String value) {
            addCriterion("trade_way <", value, "tradeWay");
            return (Criteria) this;
        }

        public Criteria andTradeWayLessThanOrEqualTo(String value) {
            addCriterion("trade_way <=", value, "tradeWay");
            return (Criteria) this;
        }

        public Criteria andTradeWayLike(String value) {
            addCriterion("trade_way like", value, "tradeWay");
            return (Criteria) this;
        }

        public Criteria andTradeWayNotLike(String value) {
            addCriterion("trade_way not like", value, "tradeWay");
            return (Criteria) this;
        }

        public Criteria andTradeWayIn(List<String> values) {
            addCriterion("trade_way in", values, "tradeWay");
            return (Criteria) this;
        }

        public Criteria andTradeWayNotIn(List<String> values) {
            addCriterion("trade_way not in", values, "tradeWay");
            return (Criteria) this;
        }

        public Criteria andTradeWayBetween(String value1, String value2) {
            addCriterion("trade_way between", value1, value2, "tradeWay");
            return (Criteria) this;
        }

        public Criteria andTradeWayNotBetween(String value1, String value2) {
            addCriterion("trade_way not between", value1, value2, "tradeWay");
            return (Criteria) this;
        }

        public Criteria andTradeTerminalIsNull() {
            addCriterion("trade_terminal is null");
            return (Criteria) this;
        }

        public Criteria andTradeTerminalIsNotNull() {
            addCriterion("trade_terminal is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTerminalEqualTo(String value) {
            addCriterion("trade_terminal =", value, "tradeTerminal");
            return (Criteria) this;
        }

        public Criteria andTradeTerminalNotEqualTo(String value) {
            addCriterion("trade_terminal <>", value, "tradeTerminal");
            return (Criteria) this;
        }

        public Criteria andTradeTerminalGreaterThan(String value) {
            addCriterion("trade_terminal >", value, "tradeTerminal");
            return (Criteria) this;
        }

        public Criteria andTradeTerminalGreaterThanOrEqualTo(String value) {
            addCriterion("trade_terminal >=", value, "tradeTerminal");
            return (Criteria) this;
        }

        public Criteria andTradeTerminalLessThan(String value) {
            addCriterion("trade_terminal <", value, "tradeTerminal");
            return (Criteria) this;
        }

        public Criteria andTradeTerminalLessThanOrEqualTo(String value) {
            addCriterion("trade_terminal <=", value, "tradeTerminal");
            return (Criteria) this;
        }

        public Criteria andTradeTerminalLike(String value) {
            addCriterion("trade_terminal like", value, "tradeTerminal");
            return (Criteria) this;
        }

        public Criteria andTradeTerminalNotLike(String value) {
            addCriterion("trade_terminal not like", value, "tradeTerminal");
            return (Criteria) this;
        }

        public Criteria andTradeTerminalIn(List<String> values) {
            addCriterion("trade_terminal in", values, "tradeTerminal");
            return (Criteria) this;
        }

        public Criteria andTradeTerminalNotIn(List<String> values) {
            addCriterion("trade_terminal not in", values, "tradeTerminal");
            return (Criteria) this;
        }

        public Criteria andTradeTerminalBetween(String value1, String value2) {
            addCriterion("trade_terminal between", value1, value2, "tradeTerminal");
            return (Criteria) this;
        }

        public Criteria andTradeTerminalNotBetween(String value1, String value2) {
            addCriterion("trade_terminal not between", value1, value2, "tradeTerminal");
            return (Criteria) this;
        }

        public Criteria andTradeDirectionIsNull() {
            addCriterion("trade_direction is null");
            return (Criteria) this;
        }

        public Criteria andTradeDirectionIsNotNull() {
            addCriterion("trade_direction is not null");
            return (Criteria) this;
        }

        public Criteria andTradeDirectionEqualTo(String value) {
            addCriterion("trade_direction =", value, "tradeDirection");
            return (Criteria) this;
        }

        public Criteria andTradeDirectionNotEqualTo(String value) {
            addCriterion("trade_direction <>", value, "tradeDirection");
            return (Criteria) this;
        }

        public Criteria andTradeDirectionGreaterThan(String value) {
            addCriterion("trade_direction >", value, "tradeDirection");
            return (Criteria) this;
        }

        public Criteria andTradeDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("trade_direction >=", value, "tradeDirection");
            return (Criteria) this;
        }

        public Criteria andTradeDirectionLessThan(String value) {
            addCriterion("trade_direction <", value, "tradeDirection");
            return (Criteria) this;
        }

        public Criteria andTradeDirectionLessThanOrEqualTo(String value) {
            addCriterion("trade_direction <=", value, "tradeDirection");
            return (Criteria) this;
        }

        public Criteria andTradeDirectionLike(String value) {
            addCriterion("trade_direction like", value, "tradeDirection");
            return (Criteria) this;
        }

        public Criteria andTradeDirectionNotLike(String value) {
            addCriterion("trade_direction not like", value, "tradeDirection");
            return (Criteria) this;
        }

        public Criteria andTradeDirectionIn(List<String> values) {
            addCriterion("trade_direction in", values, "tradeDirection");
            return (Criteria) this;
        }

        public Criteria andTradeDirectionNotIn(List<String> values) {
            addCriterion("trade_direction not in", values, "tradeDirection");
            return (Criteria) this;
        }

        public Criteria andTradeDirectionBetween(String value1, String value2) {
            addCriterion("trade_direction between", value1, value2, "tradeDirection");
            return (Criteria) this;
        }

        public Criteria andTradeDirectionNotBetween(String value1, String value2) {
            addCriterion("trade_direction not between", value1, value2, "tradeDirection");
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