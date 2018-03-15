package com.tup.mssql.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AddressPhoneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressPhoneExample() {
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

        public Criteria andWpan8IsNull() {
            addCriterion("WPAN8 is null");
            return (Criteria) this;
        }

        public Criteria andWpan8IsNotNull() {
            addCriterion("WPAN8 is not null");
            return (Criteria) this;
        }

        public Criteria andWpan8EqualTo(Integer value) {
            addCriterion("WPAN8 =", value, "wpan8");
            return (Criteria) this;
        }

        public Criteria andWpan8NotEqualTo(Integer value) {
            addCriterion("WPAN8 <>", value, "wpan8");
            return (Criteria) this;
        }

        public Criteria andWpan8GreaterThan(Integer value) {
            addCriterion("WPAN8 >", value, "wpan8");
            return (Criteria) this;
        }

        public Criteria andWpan8GreaterThanOrEqualTo(Integer value) {
            addCriterion("WPAN8 >=", value, "wpan8");
            return (Criteria) this;
        }

        public Criteria andWpan8LessThan(Integer value) {
            addCriterion("WPAN8 <", value, "wpan8");
            return (Criteria) this;
        }

        public Criteria andWpan8LessThanOrEqualTo(Integer value) {
            addCriterion("WPAN8 <=", value, "wpan8");
            return (Criteria) this;
        }

        public Criteria andWpan8In(List<Integer> values) {
            addCriterion("WPAN8 in", values, "wpan8");
            return (Criteria) this;
        }

        public Criteria andWpan8NotIn(List<Integer> values) {
            addCriterion("WPAN8 not in", values, "wpan8");
            return (Criteria) this;
        }

        public Criteria andWpan8Between(Integer value1, Integer value2) {
            addCriterion("WPAN8 between", value1, value2, "wpan8");
            return (Criteria) this;
        }

        public Criteria andWpan8NotBetween(Integer value1, Integer value2) {
            addCriterion("WPAN8 not between", value1, value2, "wpan8");
            return (Criteria) this;
        }

        public Criteria andWpphtpIsNull() {
            addCriterion("WPPHTP is null");
            return (Criteria) this;
        }

        public Criteria andWpphtpIsNotNull() {
            addCriterion("WPPHTP is not null");
            return (Criteria) this;
        }

        public Criteria andWpphtpEqualTo(String value) {
            addCriterion("WPPHTP =", value, "wpphtp");
            return (Criteria) this;
        }

        public Criteria andWpphtpNotEqualTo(String value) {
            addCriterion("WPPHTP <>", value, "wpphtp");
            return (Criteria) this;
        }

        public Criteria andWpphtpGreaterThan(String value) {
            addCriterion("WPPHTP >", value, "wpphtp");
            return (Criteria) this;
        }

        public Criteria andWpphtpGreaterThanOrEqualTo(String value) {
            addCriterion("WPPHTP >=", value, "wpphtp");
            return (Criteria) this;
        }

        public Criteria andWpphtpLessThan(String value) {
            addCriterion("WPPHTP <", value, "wpphtp");
            return (Criteria) this;
        }

        public Criteria andWpphtpLessThanOrEqualTo(String value) {
            addCriterion("WPPHTP <=", value, "wpphtp");
            return (Criteria) this;
        }

        public Criteria andWpphtpLike(String value) {
            addCriterion("WPPHTP like", value, "wpphtp");
            return (Criteria) this;
        }

        public Criteria andWpphtpNotLike(String value) {
            addCriterion("WPPHTP not like", value, "wpphtp");
            return (Criteria) this;
        }

        public Criteria andWpphtpIn(List<String> values) {
            addCriterion("WPPHTP in", values, "wpphtp");
            return (Criteria) this;
        }

        public Criteria andWpphtpNotIn(List<String> values) {
            addCriterion("WPPHTP not in", values, "wpphtp");
            return (Criteria) this;
        }

        public Criteria andWpphtpBetween(String value1, String value2) {
            addCriterion("WPPHTP between", value1, value2, "wpphtp");
            return (Criteria) this;
        }

        public Criteria andWpphtpNotBetween(String value1, String value2) {
            addCriterion("WPPHTP not between", value1, value2, "wpphtp");
            return (Criteria) this;
        }

        public Criteria andWprck7IsNull() {
            addCriterion("WPRCK7 is null");
            return (Criteria) this;
        }

        public Criteria andWprck7IsNotNull() {
            addCriterion("WPRCK7 is not null");
            return (Criteria) this;
        }

        public Criteria andWprck7EqualTo(Integer value) {
            addCriterion("WPRCK7 =", value, "wprck7");
            return (Criteria) this;
        }

        public Criteria andWprck7NotEqualTo(Integer value) {
            addCriterion("WPRCK7 <>", value, "wprck7");
            return (Criteria) this;
        }

        public Criteria andWprck7GreaterThan(Integer value) {
            addCriterion("WPRCK7 >", value, "wprck7");
            return (Criteria) this;
        }

        public Criteria andWprck7GreaterThanOrEqualTo(Integer value) {
            addCriterion("WPRCK7 >=", value, "wprck7");
            return (Criteria) this;
        }

        public Criteria andWprck7LessThan(Integer value) {
            addCriterion("WPRCK7 <", value, "wprck7");
            return (Criteria) this;
        }

        public Criteria andWprck7LessThanOrEqualTo(Integer value) {
            addCriterion("WPRCK7 <=", value, "wprck7");
            return (Criteria) this;
        }

        public Criteria andWprck7In(List<Integer> values) {
            addCriterion("WPRCK7 in", values, "wprck7");
            return (Criteria) this;
        }

        public Criteria andWprck7NotIn(List<Integer> values) {
            addCriterion("WPRCK7 not in", values, "wprck7");
            return (Criteria) this;
        }

        public Criteria andWprck7Between(Integer value1, Integer value2) {
            addCriterion("WPRCK7 between", value1, value2, "wprck7");
            return (Criteria) this;
        }

        public Criteria andWprck7NotBetween(Integer value1, Integer value2) {
            addCriterion("WPRCK7 not between", value1, value2, "wprck7");
            return (Criteria) this;
        }

        public Criteria andWpph1IsNull() {
            addCriterion("WPPH1 is null");
            return (Criteria) this;
        }

        public Criteria andWpph1IsNotNull() {
            addCriterion("WPPH1 is not null");
            return (Criteria) this;
        }

        public Criteria andWpph1EqualTo(String value) {
            addCriterion("WPPH1 =", value, "wpph1");
            return (Criteria) this;
        }

        public Criteria andWpph1NotEqualTo(String value) {
            addCriterion("WPPH1 <>", value, "wpph1");
            return (Criteria) this;
        }

        public Criteria andWpph1GreaterThan(String value) {
            addCriterion("WPPH1 >", value, "wpph1");
            return (Criteria) this;
        }

        public Criteria andWpph1GreaterThanOrEqualTo(String value) {
            addCriterion("WPPH1 >=", value, "wpph1");
            return (Criteria) this;
        }

        public Criteria andWpph1LessThan(String value) {
            addCriterion("WPPH1 <", value, "wpph1");
            return (Criteria) this;
        }

        public Criteria andWpph1LessThanOrEqualTo(String value) {
            addCriterion("WPPH1 <=", value, "wpph1");
            return (Criteria) this;
        }

        public Criteria andWpph1In(List<String> values) {
            addCriterion("WPPH1 in", values, "wpph1");
            return (Criteria) this;
        }

        public Criteria andWpph1NotIn(List<String> values) {
            addCriterion("WPPH1 not in", values, "wpph1");
            return (Criteria) this;
        }

        public Criteria andWpph1Between(String value1, String value2) {
            addCriterion("WPPH1 between", value1, value2, "wpph1");
            return (Criteria) this;
        }

        public Criteria andWpph1NotBetween(String value1, String value2) {
            addCriterion("WPPH1 not between", value1, value2, "wpph1");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateIsNull() {
            addCriterion("JDE_UpdateDate is null");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateIsNotNull() {
            addCriterion("JDE_UpdateDate is not null");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateEqualTo(Date value) {
            addCriterion("JDE_UpdateDate =", value, "jdeUpdatedate");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateNotEqualTo(Date value) {
            addCriterion("JDE_UpdateDate <>", value, "jdeUpdatedate");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateGreaterThan(Date value) {
            addCriterion("JDE_UpdateDate >", value, "jdeUpdatedate");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("JDE_UpdateDate >=", value, "jdeUpdatedate");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateLessThan(Date value) {
            addCriterion("JDE_UpdateDate <", value, "jdeUpdatedate");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("JDE_UpdateDate <=", value, "jdeUpdatedate");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateIn(List<Date> values) {
            addCriterion("JDE_UpdateDate in", values, "jdeUpdatedate");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateNotIn(List<Date> values) {
            addCriterion("JDE_UpdateDate not in", values, "jdeUpdatedate");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateBetween(Date value1, Date value2) {
            addCriterion("JDE_UpdateDate between", value1, value2, "jdeUpdatedate");
            return (Criteria) this;
        }

        public Criteria andJdeUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("JDE_UpdateDate not between", value1, value2, "jdeUpdatedate");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateIsNull() {
            addCriterion("KT_ProcessDate is null");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateIsNotNull() {
            addCriterion("KT_ProcessDate is not null");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateEqualTo(Date value) {
            addCriterion("KT_ProcessDate =", value, "ktProcessdate");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateNotEqualTo(Date value) {
            addCriterion("KT_ProcessDate <>", value, "ktProcessdate");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateGreaterThan(Date value) {
            addCriterion("KT_ProcessDate >", value, "ktProcessdate");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateGreaterThanOrEqualTo(Date value) {
            addCriterion("KT_ProcessDate >=", value, "ktProcessdate");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateLessThan(Date value) {
            addCriterion("KT_ProcessDate <", value, "ktProcessdate");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateLessThanOrEqualTo(Date value) {
            addCriterion("KT_ProcessDate <=", value, "ktProcessdate");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateIn(List<Date> values) {
            addCriterion("KT_ProcessDate in", values, "ktProcessdate");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateNotIn(List<Date> values) {
            addCriterion("KT_ProcessDate not in", values, "ktProcessdate");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateBetween(Date value1, Date value2) {
            addCriterion("KT_ProcessDate between", value1, value2, "ktProcessdate");
            return (Criteria) this;
        }

        public Criteria andKtProcessdateNotBetween(Date value1, Date value2) {
            addCriterion("KT_ProcessDate not between", value1, value2, "ktProcessdate");
            return (Criteria) this;
        }

        public Criteria andKtFaildateIsNull() {
            addCriterion("KT_FailDate is null");
            return (Criteria) this;
        }

        public Criteria andKtFaildateIsNotNull() {
            addCriterion("KT_FailDate is not null");
            return (Criteria) this;
        }

        public Criteria andKtFaildateEqualTo(Date value) {
            addCriterion("KT_FailDate =", value, "ktFaildate");
            return (Criteria) this;
        }

        public Criteria andKtFaildateNotEqualTo(Date value) {
            addCriterion("KT_FailDate <>", value, "ktFaildate");
            return (Criteria) this;
        }

        public Criteria andKtFaildateGreaterThan(Date value) {
            addCriterion("KT_FailDate >", value, "ktFaildate");
            return (Criteria) this;
        }

        public Criteria andKtFaildateGreaterThanOrEqualTo(Date value) {
            addCriterion("KT_FailDate >=", value, "ktFaildate");
            return (Criteria) this;
        }

        public Criteria andKtFaildateLessThan(Date value) {
            addCriterion("KT_FailDate <", value, "ktFaildate");
            return (Criteria) this;
        }

        public Criteria andKtFaildateLessThanOrEqualTo(Date value) {
            addCriterion("KT_FailDate <=", value, "ktFaildate");
            return (Criteria) this;
        }

        public Criteria andKtFaildateIn(List<Date> values) {
            addCriterion("KT_FailDate in", values, "ktFaildate");
            return (Criteria) this;
        }

        public Criteria andKtFaildateNotIn(List<Date> values) {
            addCriterion("KT_FailDate not in", values, "ktFaildate");
            return (Criteria) this;
        }

        public Criteria andKtFaildateBetween(Date value1, Date value2) {
            addCriterion("KT_FailDate between", value1, value2, "ktFaildate");
            return (Criteria) this;
        }

        public Criteria andKtFaildateNotBetween(Date value1, Date value2) {
            addCriterion("KT_FailDate not between", value1, value2, "ktFaildate");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesIsNull() {
            addCriterion("KT_RetryTimes is null");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesIsNotNull() {
            addCriterion("KT_RetryTimes is not null");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesEqualTo(Integer value) {
            addCriterion("KT_RetryTimes =", value, "ktRetrytimes");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesNotEqualTo(Integer value) {
            addCriterion("KT_RetryTimes <>", value, "ktRetrytimes");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesGreaterThan(Integer value) {
            addCriterion("KT_RetryTimes >", value, "ktRetrytimes");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("KT_RetryTimes >=", value, "ktRetrytimes");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesLessThan(Integer value) {
            addCriterion("KT_RetryTimes <", value, "ktRetrytimes");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesLessThanOrEqualTo(Integer value) {
            addCriterion("KT_RetryTimes <=", value, "ktRetrytimes");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesIn(List<Integer> values) {
            addCriterion("KT_RetryTimes in", values, "ktRetrytimes");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesNotIn(List<Integer> values) {
            addCriterion("KT_RetryTimes not in", values, "ktRetrytimes");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesBetween(Integer value1, Integer value2) {
            addCriterion("KT_RetryTimes between", value1, value2, "ktRetrytimes");
            return (Criteria) this;
        }

        public Criteria andKtRetrytimesNotBetween(Integer value1, Integer value2) {
            addCriterion("KT_RetryTimes not between", value1, value2, "ktRetrytimes");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogIsNull() {
            addCriterion("KT_ErrorLog is null");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogIsNotNull() {
            addCriterion("KT_ErrorLog is not null");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogEqualTo(String value) {
            addCriterion("KT_ErrorLog =", value, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogNotEqualTo(String value) {
            addCriterion("KT_ErrorLog <>", value, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogGreaterThan(String value) {
            addCriterion("KT_ErrorLog >", value, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogGreaterThanOrEqualTo(String value) {
            addCriterion("KT_ErrorLog >=", value, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogLessThan(String value) {
            addCriterion("KT_ErrorLog <", value, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogLessThanOrEqualTo(String value) {
            addCriterion("KT_ErrorLog <=", value, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogLike(String value) {
            addCriterion("KT_ErrorLog like", value, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogNotLike(String value) {
            addCriterion("KT_ErrorLog not like", value, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogIn(List<String> values) {
            addCriterion("KT_ErrorLog in", values, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogNotIn(List<String> values) {
            addCriterion("KT_ErrorLog not in", values, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogBetween(String value1, String value2) {
            addCriterion("KT_ErrorLog between", value1, value2, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andKtErrorlogNotBetween(String value1, String value2) {
            addCriterion("KT_ErrorLog not between", value1, value2, "ktErrorlog");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateIsNull() {
            addCriterion("fms_process_date is null");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateIsNotNull() {
            addCriterion("fms_process_date is not null");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateEqualTo(Date value) {
            addCriterion("fms_process_date =", value, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateNotEqualTo(Date value) {
            addCriterion("fms_process_date <>", value, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateGreaterThan(Date value) {
            addCriterion("fms_process_date >", value, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateGreaterThanOrEqualTo(Date value) {
            addCriterion("fms_process_date >=", value, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateLessThan(Date value) {
            addCriterion("fms_process_date <", value, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateLessThanOrEqualTo(Date value) {
            addCriterion("fms_process_date <=", value, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateIn(List<Date> values) {
            addCriterion("fms_process_date in", values, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateNotIn(List<Date> values) {
            addCriterion("fms_process_date not in", values, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateBetween(Date value1, Date value2) {
            addCriterion("fms_process_date between", value1, value2, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateNotBetween(Date value1, Date value2) {
            addCriterion("fms_process_date not between", value1, value2, "fmsProcessDate");
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