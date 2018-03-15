package com.tup.mssql.model;


import java.util.ArrayList;
import java.util.List;

public class AddressRegionMapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressRegionMapExample() {
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

        public Criteria andOldnoIsNull() {
            addCriterion("OldNo is null");
            return (Criteria) this;
        }

        public Criteria andOldnoIsNotNull() {
            addCriterion("OldNo is not null");
            return (Criteria) this;
        }

        public Criteria andOldnoEqualTo(String value) {
            addCriterion("OldNo =", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoNotEqualTo(String value) {
            addCriterion("OldNo <>", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoGreaterThan(String value) {
            addCriterion("OldNo >", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoGreaterThanOrEqualTo(String value) {
            addCriterion("OldNo >=", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoLessThan(String value) {
            addCriterion("OldNo <", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoLessThanOrEqualTo(String value) {
            addCriterion("OldNo <=", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoLike(String value) {
            addCriterion("OldNo like", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoNotLike(String value) {
            addCriterion("OldNo not like", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoIn(List<String> values) {
            addCriterion("OldNo in", values, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoNotIn(List<String> values) {
            addCriterion("OldNo not in", values, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoBetween(String value1, String value2) {
            addCriterion("OldNo between", value1, value2, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoNotBetween(String value1, String value2) {
            addCriterion("OldNo not between", value1, value2, "oldno");
            return (Criteria) this;
        }

        public Criteria andNewnoIsNull() {
            addCriterion("NewNo is null");
            return (Criteria) this;
        }

        public Criteria andNewnoIsNotNull() {
            addCriterion("NewNo is not null");
            return (Criteria) this;
        }

        public Criteria andNewnoEqualTo(String value) {
            addCriterion("NewNo =", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoNotEqualTo(String value) {
            addCriterion("NewNo <>", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoGreaterThan(String value) {
            addCriterion("NewNo >", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoGreaterThanOrEqualTo(String value) {
            addCriterion("NewNo >=", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoLessThan(String value) {
            addCriterion("NewNo <", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoLessThanOrEqualTo(String value) {
            addCriterion("NewNo <=", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoLike(String value) {
            addCriterion("NewNo like", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoNotLike(String value) {
            addCriterion("NewNo not like", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoIn(List<String> values) {
            addCriterion("NewNo in", values, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoNotIn(List<String> values) {
            addCriterion("NewNo not in", values, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoBetween(String value1, String value2) {
            addCriterion("NewNo between", value1, value2, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoNotBetween(String value1, String value2) {
            addCriterion("NewNo not between", value1, value2, "newno");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOldbuIsNull() {
            addCriterion("OldBU is null");
            return (Criteria) this;
        }

        public Criteria andOldbuIsNotNull() {
            addCriterion("OldBU is not null");
            return (Criteria) this;
        }

        public Criteria andOldbuEqualTo(String value) {
            addCriterion("OldBU =", value, "oldbu");
            return (Criteria) this;
        }

        public Criteria andOldbuNotEqualTo(String value) {
            addCriterion("OldBU <>", value, "oldbu");
            return (Criteria) this;
        }

        public Criteria andOldbuGreaterThan(String value) {
            addCriterion("OldBU >", value, "oldbu");
            return (Criteria) this;
        }

        public Criteria andOldbuGreaterThanOrEqualTo(String value) {
            addCriterion("OldBU >=", value, "oldbu");
            return (Criteria) this;
        }

        public Criteria andOldbuLessThan(String value) {
            addCriterion("OldBU <", value, "oldbu");
            return (Criteria) this;
        }

        public Criteria andOldbuLessThanOrEqualTo(String value) {
            addCriterion("OldBU <=", value, "oldbu");
            return (Criteria) this;
        }

        public Criteria andOldbuLike(String value) {
            addCriterion("OldBU like", value, "oldbu");
            return (Criteria) this;
        }

        public Criteria andOldbuNotLike(String value) {
            addCriterion("OldBU not like", value, "oldbu");
            return (Criteria) this;
        }

        public Criteria andOldbuIn(List<String> values) {
            addCriterion("OldBU in", values, "oldbu");
            return (Criteria) this;
        }

        public Criteria andOldbuNotIn(List<String> values) {
            addCriterion("OldBU not in", values, "oldbu");
            return (Criteria) this;
        }

        public Criteria andOldbuBetween(String value1, String value2) {
            addCriterion("OldBU between", value1, value2, "oldbu");
            return (Criteria) this;
        }

        public Criteria andOldbuNotBetween(String value1, String value2) {
            addCriterion("OldBU not between", value1, value2, "oldbu");
            return (Criteria) this;
        }

        public Criteria andNewbuIsNull() {
            addCriterion("NewBU is null");
            return (Criteria) this;
        }

        public Criteria andNewbuIsNotNull() {
            addCriterion("NewBU is not null");
            return (Criteria) this;
        }

        public Criteria andNewbuEqualTo(String value) {
            addCriterion("NewBU =", value, "newbu");
            return (Criteria) this;
        }

        public Criteria andNewbuNotEqualTo(String value) {
            addCriterion("NewBU <>", value, "newbu");
            return (Criteria) this;
        }

        public Criteria andNewbuGreaterThan(String value) {
            addCriterion("NewBU >", value, "newbu");
            return (Criteria) this;
        }

        public Criteria andNewbuGreaterThanOrEqualTo(String value) {
            addCriterion("NewBU >=", value, "newbu");
            return (Criteria) this;
        }

        public Criteria andNewbuLessThan(String value) {
            addCriterion("NewBU <", value, "newbu");
            return (Criteria) this;
        }

        public Criteria andNewbuLessThanOrEqualTo(String value) {
            addCriterion("NewBU <=", value, "newbu");
            return (Criteria) this;
        }

        public Criteria andNewbuLike(String value) {
            addCriterion("NewBU like", value, "newbu");
            return (Criteria) this;
        }

        public Criteria andNewbuNotLike(String value) {
            addCriterion("NewBU not like", value, "newbu");
            return (Criteria) this;
        }

        public Criteria andNewbuIn(List<String> values) {
            addCriterion("NewBU in", values, "newbu");
            return (Criteria) this;
        }

        public Criteria andNewbuNotIn(List<String> values) {
            addCriterion("NewBU not in", values, "newbu");
            return (Criteria) this;
        }

        public Criteria andNewbuBetween(String value1, String value2) {
            addCriterion("NewBU between", value1, value2, "newbu");
            return (Criteria) this;
        }

        public Criteria andNewbuNotBetween(String value1, String value2) {
            addCriterion("NewBU not between", value1, value2, "newbu");
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