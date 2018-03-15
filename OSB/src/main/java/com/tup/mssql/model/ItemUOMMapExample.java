package com.tup.mssql.model;


import java.util.ArrayList;
import java.util.List;

public class ItemUOMMapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemUOMMapExample() {
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

        public Criteria andUomIsNull() {
            addCriterion("UOM is null");
            return (Criteria) this;
        }

        public Criteria andUomIsNotNull() {
            addCriterion("UOM is not null");
            return (Criteria) this;
        }

        public Criteria andUomEqualTo(String value) {
            addCriterion("UOM =", value, "uom");
            return (Criteria) this;
        }

        public Criteria andUomNotEqualTo(String value) {
            addCriterion("UOM <>", value, "uom");
            return (Criteria) this;
        }

        public Criteria andUomGreaterThan(String value) {
            addCriterion("UOM >", value, "uom");
            return (Criteria) this;
        }

        public Criteria andUomGreaterThanOrEqualTo(String value) {
            addCriterion("UOM >=", value, "uom");
            return (Criteria) this;
        }

        public Criteria andUomLessThan(String value) {
            addCriterion("UOM <", value, "uom");
            return (Criteria) this;
        }

        public Criteria andUomLessThanOrEqualTo(String value) {
            addCriterion("UOM <=", value, "uom");
            return (Criteria) this;
        }

        public Criteria andUomLike(String value) {
            addCriterion("UOM like", value, "uom");
            return (Criteria) this;
        }

        public Criteria andUomNotLike(String value) {
            addCriterion("UOM not like", value, "uom");
            return (Criteria) this;
        }

        public Criteria andUomIn(List<String> values) {
            addCriterion("UOM in", values, "uom");
            return (Criteria) this;
        }

        public Criteria andUomNotIn(List<String> values) {
            addCriterion("UOM not in", values, "uom");
            return (Criteria) this;
        }

        public Criteria andUomBetween(String value1, String value2) {
            addCriterion("UOM between", value1, value2, "uom");
            return (Criteria) this;
        }

        public Criteria andUomNotBetween(String value1, String value2) {
            addCriterion("UOM not between", value1, value2, "uom");
            return (Criteria) this;
        }

        public Criteria andUomcIsNull() {
            addCriterion("UOMC is null");
            return (Criteria) this;
        }

        public Criteria andUomcIsNotNull() {
            addCriterion("UOMC is not null");
            return (Criteria) this;
        }

        public Criteria andUomcEqualTo(String value) {
            addCriterion("UOMC =", value, "uomc");
            return (Criteria) this;
        }

        public Criteria andUomcNotEqualTo(String value) {
            addCriterion("UOMC <>", value, "uomc");
            return (Criteria) this;
        }

        public Criteria andUomcGreaterThan(String value) {
            addCriterion("UOMC >", value, "uomc");
            return (Criteria) this;
        }

        public Criteria andUomcGreaterThanOrEqualTo(String value) {
            addCriterion("UOMC >=", value, "uomc");
            return (Criteria) this;
        }

        public Criteria andUomcLessThan(String value) {
            addCriterion("UOMC <", value, "uomc");
            return (Criteria) this;
        }

        public Criteria andUomcLessThanOrEqualTo(String value) {
            addCriterion("UOMC <=", value, "uomc");
            return (Criteria) this;
        }

        public Criteria andUomcLike(String value) {
            addCriterion("UOMC like", value, "uomc");
            return (Criteria) this;
        }

        public Criteria andUomcNotLike(String value) {
            addCriterion("UOMC not like", value, "uomc");
            return (Criteria) this;
        }

        public Criteria andUomcIn(List<String> values) {
            addCriterion("UOMC in", values, "uomc");
            return (Criteria) this;
        }

        public Criteria andUomcNotIn(List<String> values) {
            addCriterion("UOMC not in", values, "uomc");
            return (Criteria) this;
        }

        public Criteria andUomcBetween(String value1, String value2) {
            addCriterion("UOMC between", value1, value2, "uomc");
            return (Criteria) this;
        }

        public Criteria andUomcNotBetween(String value1, String value2) {
            addCriterion("UOMC not between", value1, value2, "uomc");
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