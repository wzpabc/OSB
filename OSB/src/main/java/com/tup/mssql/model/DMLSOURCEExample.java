package com.tup.mssql.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DMLSOURCEExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DMLSOURCEExample() {
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

        public Criteria andDmlIdIsNull() {
            addCriterion("DML_ID is null");
            return (Criteria) this;
        }

        public Criteria andDmlIdIsNotNull() {
            addCriterion("DML_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDmlIdEqualTo(Integer value) {
            addCriterion("DML_ID =", value, "dmlId");
            return (Criteria) this;
        }

        public Criteria andDmlIdNotEqualTo(Integer value) {
            addCriterion("DML_ID <>", value, "dmlId");
            return (Criteria) this;
        }

        public Criteria andDmlIdGreaterThan(Integer value) {
            addCriterion("DML_ID >", value, "dmlId");
            return (Criteria) this;
        }

        public Criteria andDmlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DML_ID >=", value, "dmlId");
            return (Criteria) this;
        }

        public Criteria andDmlIdLessThan(Integer value) {
            addCriterion("DML_ID <", value, "dmlId");
            return (Criteria) this;
        }

        public Criteria andDmlIdLessThanOrEqualTo(Integer value) {
            addCriterion("DML_ID <=", value, "dmlId");
            return (Criteria) this;
        }

        public Criteria andDmlIdIn(List<Integer> values) {
            addCriterion("DML_ID in", values, "dmlId");
            return (Criteria) this;
        }

        public Criteria andDmlIdNotIn(List<Integer> values) {
            addCriterion("DML_ID not in", values, "dmlId");
            return (Criteria) this;
        }

        public Criteria andDmlIdBetween(Integer value1, Integer value2) {
            addCriterion("DML_ID between", value1, value2, "dmlId");
            return (Criteria) this;
        }

        public Criteria andDmlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DML_ID not between", value1, value2, "dmlId");
            return (Criteria) this;
        }

        public Criteria andDmlCurrentUserIsNull() {
            addCriterion("DML_CURRENT_USER is null");
            return (Criteria) this;
        }

        public Criteria andDmlCurrentUserIsNotNull() {
            addCriterion("DML_CURRENT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andDmlCurrentUserEqualTo(String value) {
            addCriterion("DML_CURRENT_USER =", value, "dmlCurrentUser");
            return (Criteria) this;
        }

        public Criteria andDmlCurrentUserNotEqualTo(String value) {
            addCriterion("DML_CURRENT_USER <>", value, "dmlCurrentUser");
            return (Criteria) this;
        }

        public Criteria andDmlCurrentUserGreaterThan(String value) {
            addCriterion("DML_CURRENT_USER >", value, "dmlCurrentUser");
            return (Criteria) this;
        }

        public Criteria andDmlCurrentUserGreaterThanOrEqualTo(String value) {
            addCriterion("DML_CURRENT_USER >=", value, "dmlCurrentUser");
            return (Criteria) this;
        }

        public Criteria andDmlCurrentUserLessThan(String value) {
            addCriterion("DML_CURRENT_USER <", value, "dmlCurrentUser");
            return (Criteria) this;
        }

        public Criteria andDmlCurrentUserLessThanOrEqualTo(String value) {
            addCriterion("DML_CURRENT_USER <=", value, "dmlCurrentUser");
            return (Criteria) this;
        }

        public Criteria andDmlCurrentUserIn(List<String> values) {
            addCriterion("DML_CURRENT_USER in", values, "dmlCurrentUser");
            return (Criteria) this;
        }

        public Criteria andDmlCurrentUserNotIn(List<String> values) {
            addCriterion("DML_CURRENT_USER not in", values, "dmlCurrentUser");
            return (Criteria) this;
        }

        public Criteria andDmlCurrentUserBetween(String value1, String value2) {
            addCriterion("DML_CURRENT_USER between", value1, value2, "dmlCurrentUser");
            return (Criteria) this;
        }

        public Criteria andDmlCurrentUserNotBetween(String value1, String value2) {
            addCriterion("DML_CURRENT_USER not between", value1, value2, "dmlCurrentUser");
            return (Criteria) this;
        }

        public Criteria andDmlSpidIsNull() {
            addCriterion("DML_SPID is null");
            return (Criteria) this;
        }

        public Criteria andDmlSpidIsNotNull() {
            addCriterion("DML_SPID is not null");
            return (Criteria) this;
        }

        public Criteria andDmlSpidEqualTo(Integer value) {
            addCriterion("DML_SPID =", value, "dmlSpid");
            return (Criteria) this;
        }

        public Criteria andDmlSpidNotEqualTo(Integer value) {
            addCriterion("DML_SPID <>", value, "dmlSpid");
            return (Criteria) this;
        }

        public Criteria andDmlSpidGreaterThan(Integer value) {
            addCriterion("DML_SPID >", value, "dmlSpid");
            return (Criteria) this;
        }

        public Criteria andDmlSpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DML_SPID >=", value, "dmlSpid");
            return (Criteria) this;
        }

        public Criteria andDmlSpidLessThan(Integer value) {
            addCriterion("DML_SPID <", value, "dmlSpid");
            return (Criteria) this;
        }

        public Criteria andDmlSpidLessThanOrEqualTo(Integer value) {
            addCriterion("DML_SPID <=", value, "dmlSpid");
            return (Criteria) this;
        }

        public Criteria andDmlSpidIn(List<Integer> values) {
            addCriterion("DML_SPID in", values, "dmlSpid");
            return (Criteria) this;
        }

        public Criteria andDmlSpidNotIn(List<Integer> values) {
            addCriterion("DML_SPID not in", values, "dmlSpid");
            return (Criteria) this;
        }

        public Criteria andDmlSpidBetween(Integer value1, Integer value2) {
            addCriterion("DML_SPID between", value1, value2, "dmlSpid");
            return (Criteria) this;
        }

        public Criteria andDmlSpidNotBetween(Integer value1, Integer value2) {
            addCriterion("DML_SPID not between", value1, value2, "dmlSpid");
            return (Criteria) this;
        }

        public Criteria andDmlHostNameIsNull() {
            addCriterion("DML_HOST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDmlHostNameIsNotNull() {
            addCriterion("DML_HOST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDmlHostNameEqualTo(String value) {
            addCriterion("DML_HOST_NAME =", value, "dmlHostName");
            return (Criteria) this;
        }

        public Criteria andDmlHostNameNotEqualTo(String value) {
            addCriterion("DML_HOST_NAME <>", value, "dmlHostName");
            return (Criteria) this;
        }

        public Criteria andDmlHostNameGreaterThan(String value) {
            addCriterion("DML_HOST_NAME >", value, "dmlHostName");
            return (Criteria) this;
        }

        public Criteria andDmlHostNameGreaterThanOrEqualTo(String value) {
            addCriterion("DML_HOST_NAME >=", value, "dmlHostName");
            return (Criteria) this;
        }

        public Criteria andDmlHostNameLessThan(String value) {
            addCriterion("DML_HOST_NAME <", value, "dmlHostName");
            return (Criteria) this;
        }

        public Criteria andDmlHostNameLessThanOrEqualTo(String value) {
            addCriterion("DML_HOST_NAME <=", value, "dmlHostName");
            return (Criteria) this;
        }

        public Criteria andDmlHostNameIn(List<String> values) {
            addCriterion("DML_HOST_NAME in", values, "dmlHostName");
            return (Criteria) this;
        }

        public Criteria andDmlHostNameNotIn(List<String> values) {
            addCriterion("DML_HOST_NAME not in", values, "dmlHostName");
            return (Criteria) this;
        }

        public Criteria andDmlHostNameBetween(String value1, String value2) {
            addCriterion("DML_HOST_NAME between", value1, value2, "dmlHostName");
            return (Criteria) this;
        }

        public Criteria andDmlHostNameNotBetween(String value1, String value2) {
            addCriterion("DML_HOST_NAME not between", value1, value2, "dmlHostName");
            return (Criteria) this;
        }

        public Criteria andDmlAppnameIsNull() {
            addCriterion("DML_APPNAME is null");
            return (Criteria) this;
        }

        public Criteria andDmlAppnameIsNotNull() {
            addCriterion("DML_APPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDmlAppnameEqualTo(String value) {
            addCriterion("DML_APPNAME =", value, "dmlAppname");
            return (Criteria) this;
        }

        public Criteria andDmlAppnameNotEqualTo(String value) {
            addCriterion("DML_APPNAME <>", value, "dmlAppname");
            return (Criteria) this;
        }

        public Criteria andDmlAppnameGreaterThan(String value) {
            addCriterion("DML_APPNAME >", value, "dmlAppname");
            return (Criteria) this;
        }

        public Criteria andDmlAppnameGreaterThanOrEqualTo(String value) {
            addCriterion("DML_APPNAME >=", value, "dmlAppname");
            return (Criteria) this;
        }

        public Criteria andDmlAppnameLessThan(String value) {
            addCriterion("DML_APPNAME <", value, "dmlAppname");
            return (Criteria) this;
        }

        public Criteria andDmlAppnameLessThanOrEqualTo(String value) {
            addCriterion("DML_APPNAME <=", value, "dmlAppname");
            return (Criteria) this;
        }

        public Criteria andDmlAppnameIn(List<String> values) {
            addCriterion("DML_APPNAME in", values, "dmlAppname");
            return (Criteria) this;
        }

        public Criteria andDmlAppnameNotIn(List<String> values) {
            addCriterion("DML_APPNAME not in", values, "dmlAppname");
            return (Criteria) this;
        }

        public Criteria andDmlAppnameBetween(String value1, String value2) {
            addCriterion("DML_APPNAME between", value1, value2, "dmlAppname");
            return (Criteria) this;
        }

        public Criteria andDmlAppnameNotBetween(String value1, String value2) {
            addCriterion("DML_APPNAME not between", value1, value2, "dmlAppname");
            return (Criteria) this;
        }

        public Criteria andDmlDateIsNull() {
            addCriterion("DML_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDmlDateIsNotNull() {
            addCriterion("DML_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDmlDateEqualTo(Date value) {
            addCriterion("DML_DATE =", value, "dmlDate");
            return (Criteria) this;
        }

        public Criteria andDmlDateNotEqualTo(Date value) {
            addCriterion("DML_DATE <>", value, "dmlDate");
            return (Criteria) this;
        }

        public Criteria andDmlDateGreaterThan(Date value) {
            addCriterion("DML_DATE >", value, "dmlDate");
            return (Criteria) this;
        }

        public Criteria andDmlDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DML_DATE >=", value, "dmlDate");
            return (Criteria) this;
        }

        public Criteria andDmlDateLessThan(Date value) {
            addCriterion("DML_DATE <", value, "dmlDate");
            return (Criteria) this;
        }

        public Criteria andDmlDateLessThanOrEqualTo(Date value) {
            addCriterion("DML_DATE <=", value, "dmlDate");
            return (Criteria) this;
        }

        public Criteria andDmlDateIn(List<Date> values) {
            addCriterion("DML_DATE in", values, "dmlDate");
            return (Criteria) this;
        }

        public Criteria andDmlDateNotIn(List<Date> values) {
            addCriterion("DML_DATE not in", values, "dmlDate");
            return (Criteria) this;
        }

        public Criteria andDmlDateBetween(Date value1, Date value2) {
            addCriterion("DML_DATE between", value1, value2, "dmlDate");
            return (Criteria) this;
        }

        public Criteria andDmlDateNotBetween(Date value1, Date value2) {
            addCriterion("DML_DATE not between", value1, value2, "dmlDate");
            return (Criteria) this;
        }

        public Criteria andDmlTsqlIsNull() {
            addCriterion("DML_TSQL is null");
            return (Criteria) this;
        }

        public Criteria andDmlTsqlIsNotNull() {
            addCriterion("DML_TSQL is not null");
            return (Criteria) this;
        }

        public Criteria andDmlTsqlEqualTo(String value) {
            addCriterion("DML_TSQL =", value, "dmlTsql");
            return (Criteria) this;
        }

        public Criteria andDmlTsqlNotEqualTo(String value) {
            addCriterion("DML_TSQL <>", value, "dmlTsql");
            return (Criteria) this;
        }

        public Criteria andDmlTsqlGreaterThan(String value) {
            addCriterion("DML_TSQL >", value, "dmlTsql");
            return (Criteria) this;
        }

        public Criteria andDmlTsqlGreaterThanOrEqualTo(String value) {
            addCriterion("DML_TSQL >=", value, "dmlTsql");
            return (Criteria) this;
        }

        public Criteria andDmlTsqlLessThan(String value) {
            addCriterion("DML_TSQL <", value, "dmlTsql");
            return (Criteria) this;
        }

        public Criteria andDmlTsqlLessThanOrEqualTo(String value) {
            addCriterion("DML_TSQL <=", value, "dmlTsql");
            return (Criteria) this;
        }

        public Criteria andDmlTsqlIn(List<String> values) {
            addCriterion("DML_TSQL in", values, "dmlTsql");
            return (Criteria) this;
        }

        public Criteria andDmlTsqlNotIn(List<String> values) {
            addCriterion("DML_TSQL not in", values, "dmlTsql");
            return (Criteria) this;
        }

        public Criteria andDmlTsqlBetween(String value1, String value2) {
            addCriterion("DML_TSQL between", value1, value2, "dmlTsql");
            return (Criteria) this;
        }

        public Criteria andDmlTsqlNotBetween(String value1, String value2) {
            addCriterion("DML_TSQL not between", value1, value2, "dmlTsql");
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