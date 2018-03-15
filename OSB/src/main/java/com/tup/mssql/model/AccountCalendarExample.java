package com.tup.mssql.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountCalendarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountCalendarExample() {
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

        public Criteria andAccountYearIsNull() {
            addCriterion("account_year is null");
            return (Criteria) this;
        }

        public Criteria andAccountYearIsNotNull() {
            addCriterion("account_year is not null");
            return (Criteria) this;
        }

        public Criteria andAccountYearEqualTo(Integer value) {
            addCriterion("account_year =", value, "accountYear");
            return (Criteria) this;
        }

        public Criteria andAccountYearNotEqualTo(Integer value) {
            addCriterion("account_year <>", value, "accountYear");
            return (Criteria) this;
        }

        public Criteria andAccountYearGreaterThan(Integer value) {
            addCriterion("account_year >", value, "accountYear");
            return (Criteria) this;
        }

        public Criteria andAccountYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_year >=", value, "accountYear");
            return (Criteria) this;
        }

        public Criteria andAccountYearLessThan(Integer value) {
            addCriterion("account_year <", value, "accountYear");
            return (Criteria) this;
        }

        public Criteria andAccountYearLessThanOrEqualTo(Integer value) {
            addCriterion("account_year <=", value, "accountYear");
            return (Criteria) this;
        }

        public Criteria andAccountYearIn(List<Integer> values) {
            addCriterion("account_year in", values, "accountYear");
            return (Criteria) this;
        }

        public Criteria andAccountYearNotIn(List<Integer> values) {
            addCriterion("account_year not in", values, "accountYear");
            return (Criteria) this;
        }

        public Criteria andAccountYearBetween(Integer value1, Integer value2) {
            addCriterion("account_year between", value1, value2, "accountYear");
            return (Criteria) this;
        }

        public Criteria andAccountYearNotBetween(Integer value1, Integer value2) {
            addCriterion("account_year not between", value1, value2, "accountYear");
            return (Criteria) this;
        }

        public Criteria andAccountMonthIsNull() {
            addCriterion("account_month is null");
            return (Criteria) this;
        }

        public Criteria andAccountMonthIsNotNull() {
            addCriterion("account_month is not null");
            return (Criteria) this;
        }

        public Criteria andAccountMonthEqualTo(Integer value) {
            addCriterion("account_month =", value, "accountMonth");
            return (Criteria) this;
        }

        public Criteria andAccountMonthNotEqualTo(Integer value) {
            addCriterion("account_month <>", value, "accountMonth");
            return (Criteria) this;
        }

        public Criteria andAccountMonthGreaterThan(Integer value) {
            addCriterion("account_month >", value, "accountMonth");
            return (Criteria) this;
        }

        public Criteria andAccountMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_month >=", value, "accountMonth");
            return (Criteria) this;
        }

        public Criteria andAccountMonthLessThan(Integer value) {
            addCriterion("account_month <", value, "accountMonth");
            return (Criteria) this;
        }

        public Criteria andAccountMonthLessThanOrEqualTo(Integer value) {
            addCriterion("account_month <=", value, "accountMonth");
            return (Criteria) this;
        }

        public Criteria andAccountMonthIn(List<Integer> values) {
            addCriterion("account_month in", values, "accountMonth");
            return (Criteria) this;
        }

        public Criteria andAccountMonthNotIn(List<Integer> values) {
            addCriterion("account_month not in", values, "accountMonth");
            return (Criteria) this;
        }

        public Criteria andAccountMonthBetween(Integer value1, Integer value2) {
            addCriterion("account_month between", value1, value2, "accountMonth");
            return (Criteria) this;
        }

        public Criteria andAccountMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("account_month not between", value1, value2, "accountMonth");
            return (Criteria) this;
        }

        public Criteria andAccountWeekIsNull() {
            addCriterion("account_week is null");
            return (Criteria) this;
        }

        public Criteria andAccountWeekIsNotNull() {
            addCriterion("account_week is not null");
            return (Criteria) this;
        }

        public Criteria andAccountWeekEqualTo(Integer value) {
            addCriterion("account_week =", value, "accountWeek");
            return (Criteria) this;
        }

        public Criteria andAccountWeekNotEqualTo(Integer value) {
            addCriterion("account_week <>", value, "accountWeek");
            return (Criteria) this;
        }

        public Criteria andAccountWeekGreaterThan(Integer value) {
            addCriterion("account_week >", value, "accountWeek");
            return (Criteria) this;
        }

        public Criteria andAccountWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_week >=", value, "accountWeek");
            return (Criteria) this;
        }

        public Criteria andAccountWeekLessThan(Integer value) {
            addCriterion("account_week <", value, "accountWeek");
            return (Criteria) this;
        }

        public Criteria andAccountWeekLessThanOrEqualTo(Integer value) {
            addCriterion("account_week <=", value, "accountWeek");
            return (Criteria) this;
        }

        public Criteria andAccountWeekIn(List<Integer> values) {
            addCriterion("account_week in", values, "accountWeek");
            return (Criteria) this;
        }

        public Criteria andAccountWeekNotIn(List<Integer> values) {
            addCriterion("account_week not in", values, "accountWeek");
            return (Criteria) this;
        }

        public Criteria andAccountWeekBetween(Integer value1, Integer value2) {
            addCriterion("account_week between", value1, value2, "accountWeek");
            return (Criteria) this;
        }

        public Criteria andAccountWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("account_week not between", value1, value2, "accountWeek");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
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