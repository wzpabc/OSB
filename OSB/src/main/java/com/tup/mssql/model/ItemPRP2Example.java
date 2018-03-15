package com.tup.mssql.model;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ItemPRP2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemPRP2Example() {
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

        public Criteria andItemClsnoIsNull() {
            addCriterion("item_clsno is null");
            return (Criteria) this;
        }

        public Criteria andItemClsnoIsNotNull() {
            addCriterion("item_clsno is not null");
            return (Criteria) this;
        }

        public Criteria andItemClsnoEqualTo(String value) {
            addCriterion("item_clsno =", value, "itemClsno");
            return (Criteria) this;
        }

        public Criteria andItemClsnoNotEqualTo(String value) {
            addCriterion("item_clsno <>", value, "itemClsno");
            return (Criteria) this;
        }

        public Criteria andItemClsnoGreaterThan(String value) {
            addCriterion("item_clsno >", value, "itemClsno");
            return (Criteria) this;
        }

        public Criteria andItemClsnoGreaterThanOrEqualTo(String value) {
            addCriterion("item_clsno >=", value, "itemClsno");
            return (Criteria) this;
        }

        public Criteria andItemClsnoLessThan(String value) {
            addCriterion("item_clsno <", value, "itemClsno");
            return (Criteria) this;
        }

        public Criteria andItemClsnoLessThanOrEqualTo(String value) {
            addCriterion("item_clsno <=", value, "itemClsno");
            return (Criteria) this;
        }

        public Criteria andItemClsnoLike(String value) {
            addCriterion("item_clsno like", value, "itemClsno");
            return (Criteria) this;
        }

        public Criteria andItemClsnoNotLike(String value) {
            addCriterion("item_clsno not like", value, "itemClsno");
            return (Criteria) this;
        }

        public Criteria andItemClsnoIn(List<String> values) {
            addCriterion("item_clsno in", values, "itemClsno");
            return (Criteria) this;
        }

        public Criteria andItemClsnoNotIn(List<String> values) {
            addCriterion("item_clsno not in", values, "itemClsno");
            return (Criteria) this;
        }

        public Criteria andItemClsnoBetween(String value1, String value2) {
            addCriterion("item_clsno between", value1, value2, "itemClsno");
            return (Criteria) this;
        }

        public Criteria andItemClsnoNotBetween(String value1, String value2) {
            addCriterion("item_clsno not between", value1, value2, "itemClsno");
            return (Criteria) this;
        }

        public Criteria andItemClsnameIsNull() {
            addCriterion("item_clsname is null");
            return (Criteria) this;
        }

        public Criteria andItemClsnameIsNotNull() {
            addCriterion("item_clsname is not null");
            return (Criteria) this;
        }

        public Criteria andItemClsnameEqualTo(String value) {
            addCriterion("item_clsname =", value, "itemClsname");
            return (Criteria) this;
        }

        public Criteria andItemClsnameNotEqualTo(String value) {
            addCriterion("item_clsname <>", value, "itemClsname");
            return (Criteria) this;
        }

        public Criteria andItemClsnameGreaterThan(String value) {
            addCriterion("item_clsname >", value, "itemClsname");
            return (Criteria) this;
        }

        public Criteria andItemClsnameGreaterThanOrEqualTo(String value) {
            addCriterion("item_clsname >=", value, "itemClsname");
            return (Criteria) this;
        }

        public Criteria andItemClsnameLessThan(String value) {
            addCriterion("item_clsname <", value, "itemClsname");
            return (Criteria) this;
        }

        public Criteria andItemClsnameLessThanOrEqualTo(String value) {
            addCriterion("item_clsname <=", value, "itemClsname");
            return (Criteria) this;
        }

        public Criteria andItemClsnameLike(String value) {
            addCriterion("item_clsname like", value, "itemClsname");
            return (Criteria) this;
        }

        public Criteria andItemClsnameNotLike(String value) {
            addCriterion("item_clsname not like", value, "itemClsname");
            return (Criteria) this;
        }

        public Criteria andItemClsnameIn(List<String> values) {
            addCriterion("item_clsname in", values, "itemClsname");
            return (Criteria) this;
        }

        public Criteria andItemClsnameNotIn(List<String> values) {
            addCriterion("item_clsname not in", values, "itemClsname");
            return (Criteria) this;
        }

        public Criteria andItemClsnameBetween(String value1, String value2) {
            addCriterion("item_clsname between", value1, value2, "itemClsname");
            return (Criteria) this;
        }

        public Criteria andItemClsnameNotBetween(String value1, String value2) {
            addCriterion("item_clsname not between", value1, value2, "itemClsname");
            return (Criteria) this;
        }

        public Criteria andPItemClsnoIsNull() {
            addCriterion("p_item_clsno is null");
            return (Criteria) this;
        }

        public Criteria andPItemClsnoIsNotNull() {
            addCriterion("p_item_clsno is not null");
            return (Criteria) this;
        }

        public Criteria andPItemClsnoEqualTo(String value) {
            addCriterion("p_item_clsno =", value, "pItemClsno");
            return (Criteria) this;
        }

        public Criteria andPItemClsnoNotEqualTo(String value) {
            addCriterion("p_item_clsno <>", value, "pItemClsno");
            return (Criteria) this;
        }

        public Criteria andPItemClsnoGreaterThan(String value) {
            addCriterion("p_item_clsno >", value, "pItemClsno");
            return (Criteria) this;
        }

        public Criteria andPItemClsnoGreaterThanOrEqualTo(String value) {
            addCriterion("p_item_clsno >=", value, "pItemClsno");
            return (Criteria) this;
        }

        public Criteria andPItemClsnoLessThan(String value) {
            addCriterion("p_item_clsno <", value, "pItemClsno");
            return (Criteria) this;
        }

        public Criteria andPItemClsnoLessThanOrEqualTo(String value) {
            addCriterion("p_item_clsno <=", value, "pItemClsno");
            return (Criteria) this;
        }

        public Criteria andPItemClsnoLike(String value) {
            addCriterion("p_item_clsno like", value, "pItemClsno");
            return (Criteria) this;
        }

        public Criteria andPItemClsnoNotLike(String value) {
            addCriterion("p_item_clsno not like", value, "pItemClsno");
            return (Criteria) this;
        }

        public Criteria andPItemClsnoIn(List<String> values) {
            addCriterion("p_item_clsno in", values, "pItemClsno");
            return (Criteria) this;
        }

        public Criteria andPItemClsnoNotIn(List<String> values) {
            addCriterion("p_item_clsno not in", values, "pItemClsno");
            return (Criteria) this;
        }

        public Criteria andPItemClsnoBetween(String value1, String value2) {
            addCriterion("p_item_clsno between", value1, value2, "pItemClsno");
            return (Criteria) this;
        }

        public Criteria andPItemClsnoNotBetween(String value1, String value2) {
            addCriterion("p_item_clsno not between", value1, value2, "pItemClsno");
            return (Criteria) this;
        }

        public Criteria andManagerNoIsNull() {
            addCriterion("manager_no is null");
            return (Criteria) this;
        }

        public Criteria andManagerNoIsNotNull() {
            addCriterion("manager_no is not null");
            return (Criteria) this;
        }

        public Criteria andManagerNoEqualTo(String value) {
            addCriterion("manager_no =", value, "managerNo");
            return (Criteria) this;
        }

        public Criteria andManagerNoNotEqualTo(String value) {
            addCriterion("manager_no <>", value, "managerNo");
            return (Criteria) this;
        }

        public Criteria andManagerNoGreaterThan(String value) {
            addCriterion("manager_no >", value, "managerNo");
            return (Criteria) this;
        }

        public Criteria andManagerNoGreaterThanOrEqualTo(String value) {
            addCriterion("manager_no >=", value, "managerNo");
            return (Criteria) this;
        }

        public Criteria andManagerNoLessThan(String value) {
            addCriterion("manager_no <", value, "managerNo");
            return (Criteria) this;
        }

        public Criteria andManagerNoLessThanOrEqualTo(String value) {
            addCriterion("manager_no <=", value, "managerNo");
            return (Criteria) this;
        }

        public Criteria andManagerNoLike(String value) {
            addCriterion("manager_no like", value, "managerNo");
            return (Criteria) this;
        }

        public Criteria andManagerNoNotLike(String value) {
            addCriterion("manager_no not like", value, "managerNo");
            return (Criteria) this;
        }

        public Criteria andManagerNoIn(List<String> values) {
            addCriterion("manager_no in", values, "managerNo");
            return (Criteria) this;
        }

        public Criteria andManagerNoNotIn(List<String> values) {
            addCriterion("manager_no not in", values, "managerNo");
            return (Criteria) this;
        }

        public Criteria andManagerNoBetween(String value1, String value2) {
            addCriterion("manager_no between", value1, value2, "managerNo");
            return (Criteria) this;
        }

        public Criteria andManagerNoNotBetween(String value1, String value2) {
            addCriterion("manager_no not between", value1, value2, "managerNo");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andProfitRange1IsNull() {
            addCriterion("profit_range1 is null");
            return (Criteria) this;
        }

        public Criteria andProfitRange1IsNotNull() {
            addCriterion("profit_range1 is not null");
            return (Criteria) this;
        }

        public Criteria andProfitRange1EqualTo(BigDecimal value) {
            addCriterion("profit_range1 =", value, "profitRange1");
            return (Criteria) this;
        }

        public Criteria andProfitRange1NotEqualTo(BigDecimal value) {
            addCriterion("profit_range1 <>", value, "profitRange1");
            return (Criteria) this;
        }

        public Criteria andProfitRange1GreaterThan(BigDecimal value) {
            addCriterion("profit_range1 >", value, "profitRange1");
            return (Criteria) this;
        }

        public Criteria andProfitRange1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_range1 >=", value, "profitRange1");
            return (Criteria) this;
        }

        public Criteria andProfitRange1LessThan(BigDecimal value) {
            addCriterion("profit_range1 <", value, "profitRange1");
            return (Criteria) this;
        }

        public Criteria andProfitRange1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_range1 <=", value, "profitRange1");
            return (Criteria) this;
        }

        public Criteria andProfitRange1In(List<BigDecimal> values) {
            addCriterion("profit_range1 in", values, "profitRange1");
            return (Criteria) this;
        }

        public Criteria andProfitRange1NotIn(List<BigDecimal> values) {
            addCriterion("profit_range1 not in", values, "profitRange1");
            return (Criteria) this;
        }

        public Criteria andProfitRange1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_range1 between", value1, value2, "profitRange1");
            return (Criteria) this;
        }

        public Criteria andProfitRange1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_range1 not between", value1, value2, "profitRange1");
            return (Criteria) this;
        }

        public Criteria andProfitRange2IsNull() {
            addCriterion("profit_range2 is null");
            return (Criteria) this;
        }

        public Criteria andProfitRange2IsNotNull() {
            addCriterion("profit_range2 is not null");
            return (Criteria) this;
        }

        public Criteria andProfitRange2EqualTo(BigDecimal value) {
            addCriterion("profit_range2 =", value, "profitRange2");
            return (Criteria) this;
        }

        public Criteria andProfitRange2NotEqualTo(BigDecimal value) {
            addCriterion("profit_range2 <>", value, "profitRange2");
            return (Criteria) this;
        }

        public Criteria andProfitRange2GreaterThan(BigDecimal value) {
            addCriterion("profit_range2 >", value, "profitRange2");
            return (Criteria) this;
        }

        public Criteria andProfitRange2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_range2 >=", value, "profitRange2");
            return (Criteria) this;
        }

        public Criteria andProfitRange2LessThan(BigDecimal value) {
            addCriterion("profit_range2 <", value, "profitRange2");
            return (Criteria) this;
        }

        public Criteria andProfitRange2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_range2 <=", value, "profitRange2");
            return (Criteria) this;
        }

        public Criteria andProfitRange2In(List<BigDecimal> values) {
            addCriterion("profit_range2 in", values, "profitRange2");
            return (Criteria) this;
        }

        public Criteria andProfitRange2NotIn(List<BigDecimal> values) {
            addCriterion("profit_range2 not in", values, "profitRange2");
            return (Criteria) this;
        }

        public Criteria andProfitRange2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_range2 between", value1, value2, "profitRange2");
            return (Criteria) this;
        }

        public Criteria andProfitRange2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_range2 not between", value1, value2, "profitRange2");
            return (Criteria) this;
        }

        public Criteria andMaxNoIsNull() {
            addCriterion("max_no is null");
            return (Criteria) this;
        }

        public Criteria andMaxNoIsNotNull() {
            addCriterion("max_no is not null");
            return (Criteria) this;
        }

        public Criteria andMaxNoEqualTo(Integer value) {
            addCriterion("max_no =", value, "maxNo");
            return (Criteria) this;
        }

        public Criteria andMaxNoNotEqualTo(Integer value) {
            addCriterion("max_no <>", value, "maxNo");
            return (Criteria) this;
        }

        public Criteria andMaxNoGreaterThan(Integer value) {
            addCriterion("max_no >", value, "maxNo");
            return (Criteria) this;
        }

        public Criteria andMaxNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_no >=", value, "maxNo");
            return (Criteria) this;
        }

        public Criteria andMaxNoLessThan(Integer value) {
            addCriterion("max_no <", value, "maxNo");
            return (Criteria) this;
        }

        public Criteria andMaxNoLessThanOrEqualTo(Integer value) {
            addCriterion("max_no <=", value, "maxNo");
            return (Criteria) this;
        }

        public Criteria andMaxNoIn(List<Integer> values) {
            addCriterion("max_no in", values, "maxNo");
            return (Criteria) this;
        }

        public Criteria andMaxNoNotIn(List<Integer> values) {
            addCriterion("max_no not in", values, "maxNo");
            return (Criteria) this;
        }

        public Criteria andMaxNoBetween(Integer value1, Integer value2) {
            addCriterion("max_no between", value1, value2, "maxNo");
            return (Criteria) this;
        }

        public Criteria andMaxNoNotBetween(Integer value1, Integer value2) {
            addCriterion("max_no not between", value1, value2, "maxNo");
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