package com.tup.mssql.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ItemGLClassOverrideExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemGLClassOverrideExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIblitmIsNull() {
            addCriterion("IBLITM is null");
            return (Criteria) this;
        }

        public Criteria andIblitmIsNotNull() {
            addCriterion("IBLITM is not null");
            return (Criteria) this;
        }

        public Criteria andIblitmEqualTo(String value) {
            addCriterion("IBLITM =", value, "iblitm");
            return (Criteria) this;
        }

        public Criteria andIblitmNotEqualTo(String value) {
            addCriterion("IBLITM <>", value, "iblitm");
            return (Criteria) this;
        }

        public Criteria andIblitmGreaterThan(String value) {
            addCriterion("IBLITM >", value, "iblitm");
            return (Criteria) this;
        }

        public Criteria andIblitmGreaterThanOrEqualTo(String value) {
            addCriterion("IBLITM >=", value, "iblitm");
            return (Criteria) this;
        }

        public Criteria andIblitmLessThan(String value) {
            addCriterion("IBLITM <", value, "iblitm");
            return (Criteria) this;
        }

        public Criteria andIblitmLessThanOrEqualTo(String value) {
            addCriterion("IBLITM <=", value, "iblitm");
            return (Criteria) this;
        }

        public Criteria andIblitmLike(String value) {
            addCriterion("IBLITM like", value, "iblitm");
            return (Criteria) this;
        }

        public Criteria andIblitmNotLike(String value) {
            addCriterion("IBLITM not like", value, "iblitm");
            return (Criteria) this;
        }

        public Criteria andIblitmIn(List<String> values) {
            addCriterion("IBLITM in", values, "iblitm");
            return (Criteria) this;
        }

        public Criteria andIblitmNotIn(List<String> values) {
            addCriterion("IBLITM not in", values, "iblitm");
            return (Criteria) this;
        }

        public Criteria andIblitmBetween(String value1, String value2) {
            addCriterion("IBLITM between", value1, value2, "iblitm");
            return (Criteria) this;
        }

        public Criteria andIblitmNotBetween(String value1, String value2) {
            addCriterion("IBLITM not between", value1, value2, "iblitm");
            return (Criteria) this;
        }

        public Criteria andIbglptIsNull() {
            addCriterion("IBGLPT is null");
            return (Criteria) this;
        }

        public Criteria andIbglptIsNotNull() {
            addCriterion("IBGLPT is not null");
            return (Criteria) this;
        }

        public Criteria andIbglptEqualTo(String value) {
            addCriterion("IBGLPT =", value, "ibglpt");
            return (Criteria) this;
        }

        public Criteria andIbglptNotEqualTo(String value) {
            addCriterion("IBGLPT <>", value, "ibglpt");
            return (Criteria) this;
        }

        public Criteria andIbglptGreaterThan(String value) {
            addCriterion("IBGLPT >", value, "ibglpt");
            return (Criteria) this;
        }

        public Criteria andIbglptGreaterThanOrEqualTo(String value) {
            addCriterion("IBGLPT >=", value, "ibglpt");
            return (Criteria) this;
        }

        public Criteria andIbglptLessThan(String value) {
            addCriterion("IBGLPT <", value, "ibglpt");
            return (Criteria) this;
        }

        public Criteria andIbglptLessThanOrEqualTo(String value) {
            addCriterion("IBGLPT <=", value, "ibglpt");
            return (Criteria) this;
        }

        public Criteria andIbglptLike(String value) {
            addCriterion("IBGLPT like", value, "ibglpt");
            return (Criteria) this;
        }

        public Criteria andIbglptNotLike(String value) {
            addCriterion("IBGLPT not like", value, "ibglpt");
            return (Criteria) this;
        }

        public Criteria andIbglptIn(List<String> values) {
            addCriterion("IBGLPT in", values, "ibglpt");
            return (Criteria) this;
        }

        public Criteria andIbglptNotIn(List<String> values) {
            addCriterion("IBGLPT not in", values, "ibglpt");
            return (Criteria) this;
        }

        public Criteria andIbglptBetween(String value1, String value2) {
            addCriterion("IBGLPT between", value1, value2, "ibglpt");
            return (Criteria) this;
        }

        public Criteria andIbglptNotBetween(String value1, String value2) {
            addCriterion("IBGLPT not between", value1, value2, "ibglpt");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIsNull() {
            addCriterion("Member_Level is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIsNotNull() {
            addCriterion("Member_Level is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelEqualTo(String value) {
            addCriterion("Member_Level =", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotEqualTo(String value) {
            addCriterion("Member_Level <>", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelGreaterThan(String value) {
            addCriterion("Member_Level >", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelGreaterThanOrEqualTo(String value) {
            addCriterion("Member_Level >=", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLessThan(String value) {
            addCriterion("Member_Level <", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLessThanOrEqualTo(String value) {
            addCriterion("Member_Level <=", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLike(String value) {
            addCriterion("Member_Level like", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotLike(String value) {
            addCriterion("Member_Level not like", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIn(List<String> values) {
            addCriterion("Member_Level in", values, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotIn(List<String> values) {
            addCriterion("Member_Level not in", values, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelBetween(String value1, String value2) {
            addCriterion("Member_Level between", value1, value2, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotBetween(String value1, String value2) {
            addCriterion("Member_Level not between", value1, value2, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andLastupdateIsNull() {
            addCriterion("lastupdate is null");
            return (Criteria) this;
        }

        public Criteria andLastupdateIsNotNull() {
            addCriterion("lastupdate is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdateEqualTo(Date value) {
            addCriterionForJDBCDate("lastupdate =", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("lastupdate <>", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateGreaterThan(Date value) {
            addCriterionForJDBCDate("lastupdate >", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lastupdate >=", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateLessThan(Date value) {
            addCriterionForJDBCDate("lastupdate <", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lastupdate <=", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateIn(List<Date> values) {
            addCriterionForJDBCDate("lastupdate in", values, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("lastupdate not in", values, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lastupdate between", value1, value2, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lastupdate not between", value1, value2, "lastupdate");
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