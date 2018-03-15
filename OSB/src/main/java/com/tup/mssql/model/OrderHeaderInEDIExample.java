package com.tup.mssql.model;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderHeaderInEDIExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderHeaderInEDIExample() {
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

        public Criteria andSykcooIsNull() {
            addCriterion("SYKCOO is null");
            return (Criteria) this;
        }

        public Criteria andSykcooIsNotNull() {
            addCriterion("SYKCOO is not null");
            return (Criteria) this;
        }

        public Criteria andSykcooEqualTo(String value) {
            addCriterion("SYKCOO =", value, "sykcoo");
            return (Criteria) this;
        }

        public Criteria andSykcooNotEqualTo(String value) {
            addCriterion("SYKCOO <>", value, "sykcoo");
            return (Criteria) this;
        }

        public Criteria andSykcooGreaterThan(String value) {
            addCriterion("SYKCOO >", value, "sykcoo");
            return (Criteria) this;
        }

        public Criteria andSykcooGreaterThanOrEqualTo(String value) {
            addCriterion("SYKCOO >=", value, "sykcoo");
            return (Criteria) this;
        }

        public Criteria andSykcooLessThan(String value) {
            addCriterion("SYKCOO <", value, "sykcoo");
            return (Criteria) this;
        }

        public Criteria andSykcooLessThanOrEqualTo(String value) {
            addCriterion("SYKCOO <=", value, "sykcoo");
            return (Criteria) this;
        }

        public Criteria andSykcooLike(String value) {
            addCriterion("SYKCOO like", value, "sykcoo");
            return (Criteria) this;
        }

        public Criteria andSykcooNotLike(String value) {
            addCriterion("SYKCOO not like", value, "sykcoo");
            return (Criteria) this;
        }

        public Criteria andSykcooIn(List<String> values) {
            addCriterion("SYKCOO in", values, "sykcoo");
            return (Criteria) this;
        }

        public Criteria andSykcooNotIn(List<String> values) {
            addCriterion("SYKCOO not in", values, "sykcoo");
            return (Criteria) this;
        }

        public Criteria andSykcooBetween(String value1, String value2) {
            addCriterion("SYKCOO between", value1, value2, "sykcoo");
            return (Criteria) this;
        }

        public Criteria andSykcooNotBetween(String value1, String value2) {
            addCriterion("SYKCOO not between", value1, value2, "sykcoo");
            return (Criteria) this;
        }

        public Criteria andSydctoIsNull() {
            addCriterion("SYDCTO is null");
            return (Criteria) this;
        }

        public Criteria andSydctoIsNotNull() {
            addCriterion("SYDCTO is not null");
            return (Criteria) this;
        }

        public Criteria andSydctoEqualTo(String value) {
            addCriterion("SYDCTO =", value, "sydcto");
            return (Criteria) this;
        }

        public Criteria andSydctoNotEqualTo(String value) {
            addCriterion("SYDCTO <>", value, "sydcto");
            return (Criteria) this;
        }

        public Criteria andSydctoGreaterThan(String value) {
            addCriterion("SYDCTO >", value, "sydcto");
            return (Criteria) this;
        }

        public Criteria andSydctoGreaterThanOrEqualTo(String value) {
            addCriterion("SYDCTO >=", value, "sydcto");
            return (Criteria) this;
        }

        public Criteria andSydctoLessThan(String value) {
            addCriterion("SYDCTO <", value, "sydcto");
            return (Criteria) this;
        }

        public Criteria andSydctoLessThanOrEqualTo(String value) {
            addCriterion("SYDCTO <=", value, "sydcto");
            return (Criteria) this;
        }

        public Criteria andSydctoLike(String value) {
            addCriterion("SYDCTO like", value, "sydcto");
            return (Criteria) this;
        }

        public Criteria andSydctoNotLike(String value) {
            addCriterion("SYDCTO not like", value, "sydcto");
            return (Criteria) this;
        }

        public Criteria andSydctoIn(List<String> values) {
            addCriterion("SYDCTO in", values, "sydcto");
            return (Criteria) this;
        }

        public Criteria andSydctoNotIn(List<String> values) {
            addCriterion("SYDCTO not in", values, "sydcto");
            return (Criteria) this;
        }

        public Criteria andSydctoBetween(String value1, String value2) {
            addCriterion("SYDCTO between", value1, value2, "sydcto");
            return (Criteria) this;
        }

        public Criteria andSydctoNotBetween(String value1, String value2) {
            addCriterion("SYDCTO not between", value1, value2, "sydcto");
            return (Criteria) this;
        }

        public Criteria andSymcuIsNull() {
            addCriterion("SYMCU is null");
            return (Criteria) this;
        }

        public Criteria andSymcuIsNotNull() {
            addCriterion("SYMCU is not null");
            return (Criteria) this;
        }

        public Criteria andSymcuEqualTo(String value) {
            addCriterion("SYMCU =", value, "symcu");
            return (Criteria) this;
        }

        public Criteria andSymcuNotEqualTo(String value) {
            addCriterion("SYMCU <>", value, "symcu");
            return (Criteria) this;
        }

        public Criteria andSymcuGreaterThan(String value) {
            addCriterion("SYMCU >", value, "symcu");
            return (Criteria) this;
        }

        public Criteria andSymcuGreaterThanOrEqualTo(String value) {
            addCriterion("SYMCU >=", value, "symcu");
            return (Criteria) this;
        }

        public Criteria andSymcuLessThan(String value) {
            addCriterion("SYMCU <", value, "symcu");
            return (Criteria) this;
        }

        public Criteria andSymcuLessThanOrEqualTo(String value) {
            addCriterion("SYMCU <=", value, "symcu");
            return (Criteria) this;
        }

        public Criteria andSymcuLike(String value) {
            addCriterion("SYMCU like", value, "symcu");
            return (Criteria) this;
        }

        public Criteria andSymcuNotLike(String value) {
            addCriterion("SYMCU not like", value, "symcu");
            return (Criteria) this;
        }

        public Criteria andSymcuIn(List<String> values) {
            addCriterion("SYMCU in", values, "symcu");
            return (Criteria) this;
        }

        public Criteria andSymcuNotIn(List<String> values) {
            addCriterion("SYMCU not in", values, "symcu");
            return (Criteria) this;
        }

        public Criteria andSymcuBetween(String value1, String value2) {
            addCriterion("SYMCU between", value1, value2, "symcu");
            return (Criteria) this;
        }

        public Criteria andSymcuNotBetween(String value1, String value2) {
            addCriterion("SYMCU not between", value1, value2, "symcu");
            return (Criteria) this;
        }

        public Criteria andSycoIsNull() {
            addCriterion("SYCO is null");
            return (Criteria) this;
        }

        public Criteria andSycoIsNotNull() {
            addCriterion("SYCO is not null");
            return (Criteria) this;
        }

        public Criteria andSycoEqualTo(String value) {
            addCriterion("SYCO =", value, "syco");
            return (Criteria) this;
        }

        public Criteria andSycoNotEqualTo(String value) {
            addCriterion("SYCO <>", value, "syco");
            return (Criteria) this;
        }

        public Criteria andSycoGreaterThan(String value) {
            addCriterion("SYCO >", value, "syco");
            return (Criteria) this;
        }

        public Criteria andSycoGreaterThanOrEqualTo(String value) {
            addCriterion("SYCO >=", value, "syco");
            return (Criteria) this;
        }

        public Criteria andSycoLessThan(String value) {
            addCriterion("SYCO <", value, "syco");
            return (Criteria) this;
        }

        public Criteria andSycoLessThanOrEqualTo(String value) {
            addCriterion("SYCO <=", value, "syco");
            return (Criteria) this;
        }

        public Criteria andSycoLike(String value) {
            addCriterion("SYCO like", value, "syco");
            return (Criteria) this;
        }

        public Criteria andSycoNotLike(String value) {
            addCriterion("SYCO not like", value, "syco");
            return (Criteria) this;
        }

        public Criteria andSycoIn(List<String> values) {
            addCriterion("SYCO in", values, "syco");
            return (Criteria) this;
        }

        public Criteria andSycoNotIn(List<String> values) {
            addCriterion("SYCO not in", values, "syco");
            return (Criteria) this;
        }

        public Criteria andSycoBetween(String value1, String value2) {
            addCriterion("SYCO between", value1, value2, "syco");
            return (Criteria) this;
        }

        public Criteria andSycoNotBetween(String value1, String value2) {
            addCriterion("SYCO not between", value1, value2, "syco");
            return (Criteria) this;
        }

        public Criteria andSyan8IsNull() {
            addCriterion("SYAN8 is null");
            return (Criteria) this;
        }

        public Criteria andSyan8IsNotNull() {
            addCriterion("SYAN8 is not null");
            return (Criteria) this;
        }

        public Criteria andSyan8EqualTo(Integer value) {
            addCriterion("SYAN8 =", value, "syan8");
            return (Criteria) this;
        }

        public Criteria andSyan8NotEqualTo(Integer value) {
            addCriterion("SYAN8 <>", value, "syan8");
            return (Criteria) this;
        }

        public Criteria andSyan8GreaterThan(Integer value) {
            addCriterion("SYAN8 >", value, "syan8");
            return (Criteria) this;
        }

        public Criteria andSyan8GreaterThanOrEqualTo(Integer value) {
            addCriterion("SYAN8 >=", value, "syan8");
            return (Criteria) this;
        }

        public Criteria andSyan8LessThan(Integer value) {
            addCriterion("SYAN8 <", value, "syan8");
            return (Criteria) this;
        }

        public Criteria andSyan8LessThanOrEqualTo(Integer value) {
            addCriterion("SYAN8 <=", value, "syan8");
            return (Criteria) this;
        }

        public Criteria andSyan8In(List<Integer> values) {
            addCriterion("SYAN8 in", values, "syan8");
            return (Criteria) this;
        }

        public Criteria andSyan8NotIn(List<Integer> values) {
            addCriterion("SYAN8 not in", values, "syan8");
            return (Criteria) this;
        }

        public Criteria andSyan8Between(Integer value1, Integer value2) {
            addCriterion("SYAN8 between", value1, value2, "syan8");
            return (Criteria) this;
        }

        public Criteria andSyan8NotBetween(Integer value1, Integer value2) {
            addCriterion("SYAN8 not between", value1, value2, "syan8");
            return (Criteria) this;
        }

        public Criteria andSyshanIsNull() {
            addCriterion("SYSHAN is null");
            return (Criteria) this;
        }

        public Criteria andSyshanIsNotNull() {
            addCriterion("SYSHAN is not null");
            return (Criteria) this;
        }

        public Criteria andSyshanEqualTo(Integer value) {
            addCriterion("SYSHAN =", value, "syshan");
            return (Criteria) this;
        }

        public Criteria andSyshanNotEqualTo(Integer value) {
            addCriterion("SYSHAN <>", value, "syshan");
            return (Criteria) this;
        }

        public Criteria andSyshanGreaterThan(Integer value) {
            addCriterion("SYSHAN >", value, "syshan");
            return (Criteria) this;
        }

        public Criteria andSyshanGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYSHAN >=", value, "syshan");
            return (Criteria) this;
        }

        public Criteria andSyshanLessThan(Integer value) {
            addCriterion("SYSHAN <", value, "syshan");
            return (Criteria) this;
        }

        public Criteria andSyshanLessThanOrEqualTo(Integer value) {
            addCriterion("SYSHAN <=", value, "syshan");
            return (Criteria) this;
        }

        public Criteria andSyshanIn(List<Integer> values) {
            addCriterion("SYSHAN in", values, "syshan");
            return (Criteria) this;
        }

        public Criteria andSyshanNotIn(List<Integer> values) {
            addCriterion("SYSHAN not in", values, "syshan");
            return (Criteria) this;
        }

        public Criteria andSyshanBetween(Integer value1, Integer value2) {
            addCriterion("SYSHAN between", value1, value2, "syshan");
            return (Criteria) this;
        }

        public Criteria andSyshanNotBetween(Integer value1, Integer value2) {
            addCriterion("SYSHAN not between", value1, value2, "syshan");
            return (Criteria) this;
        }

        public Criteria andSytrdjIsNull() {
            addCriterion("SYTRDJ is null");
            return (Criteria) this;
        }

        public Criteria andSytrdjIsNotNull() {
            addCriterion("SYTRDJ is not null");
            return (Criteria) this;
        }

        public Criteria andSytrdjEqualTo(Integer value) {
            addCriterion("SYTRDJ =", value, "sytrdj");
            return (Criteria) this;
        }

        public Criteria andSytrdjNotEqualTo(Integer value) {
            addCriterion("SYTRDJ <>", value, "sytrdj");
            return (Criteria) this;
        }

        public Criteria andSytrdjGreaterThan(Integer value) {
            addCriterion("SYTRDJ >", value, "sytrdj");
            return (Criteria) this;
        }

        public Criteria andSytrdjGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYTRDJ >=", value, "sytrdj");
            return (Criteria) this;
        }

        public Criteria andSytrdjLessThan(Integer value) {
            addCriterion("SYTRDJ <", value, "sytrdj");
            return (Criteria) this;
        }

        public Criteria andSytrdjLessThanOrEqualTo(Integer value) {
            addCriterion("SYTRDJ <=", value, "sytrdj");
            return (Criteria) this;
        }

        public Criteria andSytrdjIn(List<Integer> values) {
            addCriterion("SYTRDJ in", values, "sytrdj");
            return (Criteria) this;
        }

        public Criteria andSytrdjNotIn(List<Integer> values) {
            addCriterion("SYTRDJ not in", values, "sytrdj");
            return (Criteria) this;
        }

        public Criteria andSytrdjBetween(Integer value1, Integer value2) {
            addCriterion("SYTRDJ between", value1, value2, "sytrdj");
            return (Criteria) this;
        }

        public Criteria andSytrdjNotBetween(Integer value1, Integer value2) {
            addCriterion("SYTRDJ not between", value1, value2, "sytrdj");
            return (Criteria) this;
        }

        public Criteria andSydrqjIsNull() {
            addCriterion("SYDRQJ is null");
            return (Criteria) this;
        }

        public Criteria andSydrqjIsNotNull() {
            addCriterion("SYDRQJ is not null");
            return (Criteria) this;
        }

        public Criteria andSydrqjEqualTo(Integer value) {
            addCriterion("SYDRQJ =", value, "sydrqj");
            return (Criteria) this;
        }

        public Criteria andSydrqjNotEqualTo(Integer value) {
            addCriterion("SYDRQJ <>", value, "sydrqj");
            return (Criteria) this;
        }

        public Criteria andSydrqjGreaterThan(Integer value) {
            addCriterion("SYDRQJ >", value, "sydrqj");
            return (Criteria) this;
        }

        public Criteria andSydrqjGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYDRQJ >=", value, "sydrqj");
            return (Criteria) this;
        }

        public Criteria andSydrqjLessThan(Integer value) {
            addCriterion("SYDRQJ <", value, "sydrqj");
            return (Criteria) this;
        }

        public Criteria andSydrqjLessThanOrEqualTo(Integer value) {
            addCriterion("SYDRQJ <=", value, "sydrqj");
            return (Criteria) this;
        }

        public Criteria andSydrqjIn(List<Integer> values) {
            addCriterion("SYDRQJ in", values, "sydrqj");
            return (Criteria) this;
        }

        public Criteria andSydrqjNotIn(List<Integer> values) {
            addCriterion("SYDRQJ not in", values, "sydrqj");
            return (Criteria) this;
        }

        public Criteria andSydrqjBetween(Integer value1, Integer value2) {
            addCriterion("SYDRQJ between", value1, value2, "sydrqj");
            return (Criteria) this;
        }

        public Criteria andSydrqjNotBetween(Integer value1, Integer value2) {
            addCriterion("SYDRQJ not between", value1, value2, "sydrqj");
            return (Criteria) this;
        }

        public Criteria andSypddjIsNull() {
            addCriterion("SYPDDJ is null");
            return (Criteria) this;
        }

        public Criteria andSypddjIsNotNull() {
            addCriterion("SYPDDJ is not null");
            return (Criteria) this;
        }

        public Criteria andSypddjEqualTo(Integer value) {
            addCriterion("SYPDDJ =", value, "sypddj");
            return (Criteria) this;
        }

        public Criteria andSypddjNotEqualTo(Integer value) {
            addCriterion("SYPDDJ <>", value, "sypddj");
            return (Criteria) this;
        }

        public Criteria andSypddjGreaterThan(Integer value) {
            addCriterion("SYPDDJ >", value, "sypddj");
            return (Criteria) this;
        }

        public Criteria andSypddjGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYPDDJ >=", value, "sypddj");
            return (Criteria) this;
        }

        public Criteria andSypddjLessThan(Integer value) {
            addCriterion("SYPDDJ <", value, "sypddj");
            return (Criteria) this;
        }

        public Criteria andSypddjLessThanOrEqualTo(Integer value) {
            addCriterion("SYPDDJ <=", value, "sypddj");
            return (Criteria) this;
        }

        public Criteria andSypddjIn(List<Integer> values) {
            addCriterion("SYPDDJ in", values, "sypddj");
            return (Criteria) this;
        }

        public Criteria andSypddjNotIn(List<Integer> values) {
            addCriterion("SYPDDJ not in", values, "sypddj");
            return (Criteria) this;
        }

        public Criteria andSypddjBetween(Integer value1, Integer value2) {
            addCriterion("SYPDDJ between", value1, value2, "sypddj");
            return (Criteria) this;
        }

        public Criteria andSypddjNotBetween(Integer value1, Integer value2) {
            addCriterion("SYPDDJ not between", value1, value2, "sypddj");
            return (Criteria) this;
        }

        public Criteria andSydrqtIsNull() {
            addCriterion("SYDRQT is null");
            return (Criteria) this;
        }

        public Criteria andSydrqtIsNotNull() {
            addCriterion("SYDRQT is not null");
            return (Criteria) this;
        }

        public Criteria andSydrqtEqualTo(Integer value) {
            addCriterion("SYDRQT =", value, "sydrqt");
            return (Criteria) this;
        }

        public Criteria andSydrqtNotEqualTo(Integer value) {
            addCriterion("SYDRQT <>", value, "sydrqt");
            return (Criteria) this;
        }

        public Criteria andSydrqtGreaterThan(Integer value) {
            addCriterion("SYDRQT >", value, "sydrqt");
            return (Criteria) this;
        }

        public Criteria andSydrqtGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYDRQT >=", value, "sydrqt");
            return (Criteria) this;
        }

        public Criteria andSydrqtLessThan(Integer value) {
            addCriterion("SYDRQT <", value, "sydrqt");
            return (Criteria) this;
        }

        public Criteria andSydrqtLessThanOrEqualTo(Integer value) {
            addCriterion("SYDRQT <=", value, "sydrqt");
            return (Criteria) this;
        }

        public Criteria andSydrqtIn(List<Integer> values) {
            addCriterion("SYDRQT in", values, "sydrqt");
            return (Criteria) this;
        }

        public Criteria andSydrqtNotIn(List<Integer> values) {
            addCriterion("SYDRQT not in", values, "sydrqt");
            return (Criteria) this;
        }

        public Criteria andSydrqtBetween(Integer value1, Integer value2) {
            addCriterion("SYDRQT between", value1, value2, "sydrqt");
            return (Criteria) this;
        }

        public Criteria andSydrqtNotBetween(Integer value1, Integer value2) {
            addCriterion("SYDRQT not between", value1, value2, "sydrqt");
            return (Criteria) this;
        }

        public Criteria andSyvr01IsNull() {
            addCriterion("SYVR01 is null");
            return (Criteria) this;
        }

        public Criteria andSyvr01IsNotNull() {
            addCriterion("SYVR01 is not null");
            return (Criteria) this;
        }

        public Criteria andSyvr01EqualTo(String value) {
            addCriterion("SYVR01 =", value, "syvr01");
            return (Criteria) this;
        }

        public Criteria andSyvr01NotEqualTo(String value) {
            addCriterion("SYVR01 <>", value, "syvr01");
            return (Criteria) this;
        }

        public Criteria andSyvr01GreaterThan(String value) {
            addCriterion("SYVR01 >", value, "syvr01");
            return (Criteria) this;
        }

        public Criteria andSyvr01GreaterThanOrEqualTo(String value) {
            addCriterion("SYVR01 >=", value, "syvr01");
            return (Criteria) this;
        }

        public Criteria andSyvr01LessThan(String value) {
            addCriterion("SYVR01 <", value, "syvr01");
            return (Criteria) this;
        }

        public Criteria andSyvr01LessThanOrEqualTo(String value) {
            addCriterion("SYVR01 <=", value, "syvr01");
            return (Criteria) this;
        }

        public Criteria andSyvr01Like(String value) {
            addCriterion("SYVR01 like", value, "syvr01");
            return (Criteria) this;
        }

        public Criteria andSyvr01NotLike(String value) {
            addCriterion("SYVR01 not like", value, "syvr01");
            return (Criteria) this;
        }

        public Criteria andSyvr01In(List<String> values) {
            addCriterion("SYVR01 in", values, "syvr01");
            return (Criteria) this;
        }

        public Criteria andSyvr01NotIn(List<String> values) {
            addCriterion("SYVR01 not in", values, "syvr01");
            return (Criteria) this;
        }

        public Criteria andSyvr01Between(String value1, String value2) {
            addCriterion("SYVR01 between", value1, value2, "syvr01");
            return (Criteria) this;
        }

        public Criteria andSyvr01NotBetween(String value1, String value2) {
            addCriterion("SYVR01 not between", value1, value2, "syvr01");
            return (Criteria) this;
        }

        public Criteria andSydel1IsNull() {
            addCriterion("SYDEL1 is null");
            return (Criteria) this;
        }

        public Criteria andSydel1IsNotNull() {
            addCriterion("SYDEL1 is not null");
            return (Criteria) this;
        }

        public Criteria andSydel1EqualTo(String value) {
            addCriterion("SYDEL1 =", value, "sydel1");
            return (Criteria) this;
        }

        public Criteria andSydel1NotEqualTo(String value) {
            addCriterion("SYDEL1 <>", value, "sydel1");
            return (Criteria) this;
        }

        public Criteria andSydel1GreaterThan(String value) {
            addCriterion("SYDEL1 >", value, "sydel1");
            return (Criteria) this;
        }

        public Criteria andSydel1GreaterThanOrEqualTo(String value) {
            addCriterion("SYDEL1 >=", value, "sydel1");
            return (Criteria) this;
        }

        public Criteria andSydel1LessThan(String value) {
            addCriterion("SYDEL1 <", value, "sydel1");
            return (Criteria) this;
        }

        public Criteria andSydel1LessThanOrEqualTo(String value) {
            addCriterion("SYDEL1 <=", value, "sydel1");
            return (Criteria) this;
        }

        public Criteria andSydel1Like(String value) {
            addCriterion("SYDEL1 like", value, "sydel1");
            return (Criteria) this;
        }

        public Criteria andSydel1NotLike(String value) {
            addCriterion("SYDEL1 not like", value, "sydel1");
            return (Criteria) this;
        }

        public Criteria andSydel1In(List<String> values) {
            addCriterion("SYDEL1 in", values, "sydel1");
            return (Criteria) this;
        }

        public Criteria andSydel1NotIn(List<String> values) {
            addCriterion("SYDEL1 not in", values, "sydel1");
            return (Criteria) this;
        }

        public Criteria andSydel1Between(String value1, String value2) {
            addCriterion("SYDEL1 between", value1, value2, "sydel1");
            return (Criteria) this;
        }

        public Criteria andSydel1NotBetween(String value1, String value2) {
            addCriterion("SYDEL1 not between", value1, value2, "sydel1");
            return (Criteria) this;
        }

        public Criteria andSydel2IsNull() {
            addCriterion("SYDEL2 is null");
            return (Criteria) this;
        }

        public Criteria andSydel2IsNotNull() {
            addCriterion("SYDEL2 is not null");
            return (Criteria) this;
        }

        public Criteria andSydel2EqualTo(String value) {
            addCriterion("SYDEL2 =", value, "sydel2");
            return (Criteria) this;
        }

        public Criteria andSydel2NotEqualTo(String value) {
            addCriterion("SYDEL2 <>", value, "sydel2");
            return (Criteria) this;
        }

        public Criteria andSydel2GreaterThan(String value) {
            addCriterion("SYDEL2 >", value, "sydel2");
            return (Criteria) this;
        }

        public Criteria andSydel2GreaterThanOrEqualTo(String value) {
            addCriterion("SYDEL2 >=", value, "sydel2");
            return (Criteria) this;
        }

        public Criteria andSydel2LessThan(String value) {
            addCriterion("SYDEL2 <", value, "sydel2");
            return (Criteria) this;
        }

        public Criteria andSydel2LessThanOrEqualTo(String value) {
            addCriterion("SYDEL2 <=", value, "sydel2");
            return (Criteria) this;
        }

        public Criteria andSydel2Like(String value) {
            addCriterion("SYDEL2 like", value, "sydel2");
            return (Criteria) this;
        }

        public Criteria andSydel2NotLike(String value) {
            addCriterion("SYDEL2 not like", value, "sydel2");
            return (Criteria) this;
        }

        public Criteria andSydel2In(List<String> values) {
            addCriterion("SYDEL2 in", values, "sydel2");
            return (Criteria) this;
        }

        public Criteria andSydel2NotIn(List<String> values) {
            addCriterion("SYDEL2 not in", values, "sydel2");
            return (Criteria) this;
        }

        public Criteria andSydel2Between(String value1, String value2) {
            addCriterion("SYDEL2 between", value1, value2, "sydel2");
            return (Criteria) this;
        }

        public Criteria andSydel2NotBetween(String value1, String value2) {
            addCriterion("SYDEL2 not between", value1, value2, "sydel2");
            return (Criteria) this;
        }

        public Criteria andSyurcdIsNull() {
            addCriterion("SYURCD is null");
            return (Criteria) this;
        }

        public Criteria andSyurcdIsNotNull() {
            addCriterion("SYURCD is not null");
            return (Criteria) this;
        }

        public Criteria andSyurcdEqualTo(String value) {
            addCriterion("SYURCD =", value, "syurcd");
            return (Criteria) this;
        }

        public Criteria andSyurcdNotEqualTo(String value) {
            addCriterion("SYURCD <>", value, "syurcd");
            return (Criteria) this;
        }

        public Criteria andSyurcdGreaterThan(String value) {
            addCriterion("SYURCD >", value, "syurcd");
            return (Criteria) this;
        }

        public Criteria andSyurcdGreaterThanOrEqualTo(String value) {
            addCriterion("SYURCD >=", value, "syurcd");
            return (Criteria) this;
        }

        public Criteria andSyurcdLessThan(String value) {
            addCriterion("SYURCD <", value, "syurcd");
            return (Criteria) this;
        }

        public Criteria andSyurcdLessThanOrEqualTo(String value) {
            addCriterion("SYURCD <=", value, "syurcd");
            return (Criteria) this;
        }

        public Criteria andSyurcdLike(String value) {
            addCriterion("SYURCD like", value, "syurcd");
            return (Criteria) this;
        }

        public Criteria andSyurcdNotLike(String value) {
            addCriterion("SYURCD not like", value, "syurcd");
            return (Criteria) this;
        }

        public Criteria andSyurcdIn(List<String> values) {
            addCriterion("SYURCD in", values, "syurcd");
            return (Criteria) this;
        }

        public Criteria andSyurcdNotIn(List<String> values) {
            addCriterion("SYURCD not in", values, "syurcd");
            return (Criteria) this;
        }

        public Criteria andSyurcdBetween(String value1, String value2) {
            addCriterion("SYURCD between", value1, value2, "syurcd");
            return (Criteria) this;
        }

        public Criteria andSyurcdNotBetween(String value1, String value2) {
            addCriterion("SYURCD not between", value1, value2, "syurcd");
            return (Criteria) this;
        }

        public Criteria andSyurdtIsNull() {
            addCriterion("SYURDT is null");
            return (Criteria) this;
        }

        public Criteria andSyurdtIsNotNull() {
            addCriterion("SYURDT is not null");
            return (Criteria) this;
        }

        public Criteria andSyurdtEqualTo(Integer value) {
            addCriterion("SYURDT =", value, "syurdt");
            return (Criteria) this;
        }

        public Criteria andSyurdtNotEqualTo(Integer value) {
            addCriterion("SYURDT <>", value, "syurdt");
            return (Criteria) this;
        }

        public Criteria andSyurdtGreaterThan(Integer value) {
            addCriterion("SYURDT >", value, "syurdt");
            return (Criteria) this;
        }

        public Criteria andSyurdtGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYURDT >=", value, "syurdt");
            return (Criteria) this;
        }

        public Criteria andSyurdtLessThan(Integer value) {
            addCriterion("SYURDT <", value, "syurdt");
            return (Criteria) this;
        }

        public Criteria andSyurdtLessThanOrEqualTo(Integer value) {
            addCriterion("SYURDT <=", value, "syurdt");
            return (Criteria) this;
        }

        public Criteria andSyurdtIn(List<Integer> values) {
            addCriterion("SYURDT in", values, "syurdt");
            return (Criteria) this;
        }

        public Criteria andSyurdtNotIn(List<Integer> values) {
            addCriterion("SYURDT not in", values, "syurdt");
            return (Criteria) this;
        }

        public Criteria andSyurdtBetween(Integer value1, Integer value2) {
            addCriterion("SYURDT between", value1, value2, "syurdt");
            return (Criteria) this;
        }

        public Criteria andSyurdtNotBetween(Integer value1, Integer value2) {
            addCriterion("SYURDT not between", value1, value2, "syurdt");
            return (Criteria) this;
        }

        public Criteria andSyuratIsNull() {
            addCriterion("SYURAT is null");
            return (Criteria) this;
        }

        public Criteria andSyuratIsNotNull() {
            addCriterion("SYURAT is not null");
            return (Criteria) this;
        }

        public Criteria andSyuratEqualTo(BigDecimal value) {
            addCriterion("SYURAT =", value, "syurat");
            return (Criteria) this;
        }

        public Criteria andSyuratNotEqualTo(BigDecimal value) {
            addCriterion("SYURAT <>", value, "syurat");
            return (Criteria) this;
        }

        public Criteria andSyuratGreaterThan(BigDecimal value) {
            addCriterion("SYURAT >", value, "syurat");
            return (Criteria) this;
        }

        public Criteria andSyuratGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SYURAT >=", value, "syurat");
            return (Criteria) this;
        }

        public Criteria andSyuratLessThan(BigDecimal value) {
            addCriterion("SYURAT <", value, "syurat");
            return (Criteria) this;
        }

        public Criteria andSyuratLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SYURAT <=", value, "syurat");
            return (Criteria) this;
        }

        public Criteria andSyuratIn(List<BigDecimal> values) {
            addCriterion("SYURAT in", values, "syurat");
            return (Criteria) this;
        }

        public Criteria andSyuratNotIn(List<BigDecimal> values) {
            addCriterion("SYURAT not in", values, "syurat");
            return (Criteria) this;
        }

        public Criteria andSyuratBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYURAT between", value1, value2, "syurat");
            return (Criteria) this;
        }

        public Criteria andSyuratNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYURAT not between", value1, value2, "syurat");
            return (Criteria) this;
        }

        public Criteria andSyurabIsNull() {
            addCriterion("SYURAB is null");
            return (Criteria) this;
        }

        public Criteria andSyurabIsNotNull() {
            addCriterion("SYURAB is not null");
            return (Criteria) this;
        }

        public Criteria andSyurabEqualTo(Integer value) {
            addCriterion("SYURAB =", value, "syurab");
            return (Criteria) this;
        }

        public Criteria andSyurabNotEqualTo(Integer value) {
            addCriterion("SYURAB <>", value, "syurab");
            return (Criteria) this;
        }

        public Criteria andSyurabGreaterThan(Integer value) {
            addCriterion("SYURAB >", value, "syurab");
            return (Criteria) this;
        }

        public Criteria andSyurabGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYURAB >=", value, "syurab");
            return (Criteria) this;
        }

        public Criteria andSyurabLessThan(Integer value) {
            addCriterion("SYURAB <", value, "syurab");
            return (Criteria) this;
        }

        public Criteria andSyurabLessThanOrEqualTo(Integer value) {
            addCriterion("SYURAB <=", value, "syurab");
            return (Criteria) this;
        }

        public Criteria andSyurabIn(List<Integer> values) {
            addCriterion("SYURAB in", values, "syurab");
            return (Criteria) this;
        }

        public Criteria andSyurabNotIn(List<Integer> values) {
            addCriterion("SYURAB not in", values, "syurab");
            return (Criteria) this;
        }

        public Criteria andSyurabBetween(Integer value1, Integer value2) {
            addCriterion("SYURAB between", value1, value2, "syurab");
            return (Criteria) this;
        }

        public Criteria andSyurabNotBetween(Integer value1, Integer value2) {
            addCriterion("SYURAB not between", value1, value2, "syurab");
            return (Criteria) this;
        }

        public Criteria andSyurrfIsNull() {
            addCriterion("SYURRF is null");
            return (Criteria) this;
        }

        public Criteria andSyurrfIsNotNull() {
            addCriterion("SYURRF is not null");
            return (Criteria) this;
        }

        public Criteria andSyurrfEqualTo(String value) {
            addCriterion("SYURRF =", value, "syurrf");
            return (Criteria) this;
        }

        public Criteria andSyurrfNotEqualTo(String value) {
            addCriterion("SYURRF <>", value, "syurrf");
            return (Criteria) this;
        }

        public Criteria andSyurrfGreaterThan(String value) {
            addCriterion("SYURRF >", value, "syurrf");
            return (Criteria) this;
        }

        public Criteria andSyurrfGreaterThanOrEqualTo(String value) {
            addCriterion("SYURRF >=", value, "syurrf");
            return (Criteria) this;
        }

        public Criteria andSyurrfLessThan(String value) {
            addCriterion("SYURRF <", value, "syurrf");
            return (Criteria) this;
        }

        public Criteria andSyurrfLessThanOrEqualTo(String value) {
            addCriterion("SYURRF <=", value, "syurrf");
            return (Criteria) this;
        }

        public Criteria andSyurrfLike(String value) {
            addCriterion("SYURRF like", value, "syurrf");
            return (Criteria) this;
        }

        public Criteria andSyurrfNotLike(String value) {
            addCriterion("SYURRF not like", value, "syurrf");
            return (Criteria) this;
        }

        public Criteria andSyurrfIn(List<String> values) {
            addCriterion("SYURRF in", values, "syurrf");
            return (Criteria) this;
        }

        public Criteria andSyurrfNotIn(List<String> values) {
            addCriterion("SYURRF not in", values, "syurrf");
            return (Criteria) this;
        }

        public Criteria andSyurrfBetween(String value1, String value2) {
            addCriterion("SYURRF between", value1, value2, "syurrf");
            return (Criteria) this;
        }

        public Criteria andSyurrfNotBetween(String value1, String value2) {
            addCriterion("SYURRF not between", value1, value2, "syurrf");
            return (Criteria) this;
        }

        public Criteria andSamlnmIsNull() {
            addCriterion("SAMLNM is null");
            return (Criteria) this;
        }

        public Criteria andSamlnmIsNotNull() {
            addCriterion("SAMLNM is not null");
            return (Criteria) this;
        }

        public Criteria andSamlnmEqualTo(String value) {
            addCriterion("SAMLNM =", value, "samlnm");
            return (Criteria) this;
        }

        public Criteria andSamlnmNotEqualTo(String value) {
            addCriterion("SAMLNM <>", value, "samlnm");
            return (Criteria) this;
        }

        public Criteria andSamlnmGreaterThan(String value) {
            addCriterion("SAMLNM >", value, "samlnm");
            return (Criteria) this;
        }

        public Criteria andSamlnmGreaterThanOrEqualTo(String value) {
            addCriterion("SAMLNM >=", value, "samlnm");
            return (Criteria) this;
        }

        public Criteria andSamlnmLessThan(String value) {
            addCriterion("SAMLNM <", value, "samlnm");
            return (Criteria) this;
        }

        public Criteria andSamlnmLessThanOrEqualTo(String value) {
            addCriterion("SAMLNM <=", value, "samlnm");
            return (Criteria) this;
        }

        public Criteria andSamlnmIn(List<String> values) {
            addCriterion("SAMLNM in", values, "samlnm");
            return (Criteria) this;
        }

        public Criteria andSamlnmNotIn(List<String> values) {
            addCriterion("SAMLNM not in", values, "samlnm");
            return (Criteria) this;
        }

        public Criteria andSamlnmBetween(String value1, String value2) {
            addCriterion("SAMLNM between", value1, value2, "samlnm");
            return (Criteria) this;
        }

        public Criteria andSamlnmNotBetween(String value1, String value2) {
            addCriterion("SAMLNM not between", value1, value2, "samlnm");
            return (Criteria) this;
        }

        public Criteria andSaadd1IsNull() {
            addCriterion("SAADD1 is null");
            return (Criteria) this;
        }

        public Criteria andSaadd1IsNotNull() {
            addCriterion("SAADD1 is not null");
            return (Criteria) this;
        }

        public Criteria andSaadd1EqualTo(String value) {
            addCriterion("SAADD1 =", value, "saadd1");
            return (Criteria) this;
        }

        public Criteria andSaadd1NotEqualTo(String value) {
            addCriterion("SAADD1 <>", value, "saadd1");
            return (Criteria) this;
        }

        public Criteria andSaadd1GreaterThan(String value) {
            addCriterion("SAADD1 >", value, "saadd1");
            return (Criteria) this;
        }

        public Criteria andSaadd1GreaterThanOrEqualTo(String value) {
            addCriterion("SAADD1 >=", value, "saadd1");
            return (Criteria) this;
        }

        public Criteria andSaadd1LessThan(String value) {
            addCriterion("SAADD1 <", value, "saadd1");
            return (Criteria) this;
        }

        public Criteria andSaadd1LessThanOrEqualTo(String value) {
            addCriterion("SAADD1 <=", value, "saadd1");
            return (Criteria) this;
        }

        public Criteria andSaadd1In(List<String> values) {
            addCriterion("SAADD1 in", values, "saadd1");
            return (Criteria) this;
        }

        public Criteria andSaadd1NotIn(List<String> values) {
            addCriterion("SAADD1 not in", values, "saadd1");
            return (Criteria) this;
        }

        public Criteria andSaadd1Between(String value1, String value2) {
            addCriterion("SAADD1 between", value1, value2, "saadd1");
            return (Criteria) this;
        }

        public Criteria andSaadd1NotBetween(String value1, String value2) {
            addCriterion("SAADD1 not between", value1, value2, "saadd1");
            return (Criteria) this;
        }

        public Criteria andSaadd2IsNull() {
            addCriterion("SAADD2 is null");
            return (Criteria) this;
        }

        public Criteria andSaadd2IsNotNull() {
            addCriterion("SAADD2 is not null");
            return (Criteria) this;
        }

        public Criteria andSaadd2EqualTo(String value) {
            addCriterion("SAADD2 =", value, "saadd2");
            return (Criteria) this;
        }

        public Criteria andSaadd2NotEqualTo(String value) {
            addCriterion("SAADD2 <>", value, "saadd2");
            return (Criteria) this;
        }

        public Criteria andSaadd2GreaterThan(String value) {
            addCriterion("SAADD2 >", value, "saadd2");
            return (Criteria) this;
        }

        public Criteria andSaadd2GreaterThanOrEqualTo(String value) {
            addCriterion("SAADD2 >=", value, "saadd2");
            return (Criteria) this;
        }

        public Criteria andSaadd2LessThan(String value) {
            addCriterion("SAADD2 <", value, "saadd2");
            return (Criteria) this;
        }

        public Criteria andSaadd2LessThanOrEqualTo(String value) {
            addCriterion("SAADD2 <=", value, "saadd2");
            return (Criteria) this;
        }

        public Criteria andSaadd2In(List<String> values) {
            addCriterion("SAADD2 in", values, "saadd2");
            return (Criteria) this;
        }

        public Criteria andSaadd2NotIn(List<String> values) {
            addCriterion("SAADD2 not in", values, "saadd2");
            return (Criteria) this;
        }

        public Criteria andSaadd2Between(String value1, String value2) {
            addCriterion("SAADD2 between", value1, value2, "saadd2");
            return (Criteria) this;
        }

        public Criteria andSaadd2NotBetween(String value1, String value2) {
            addCriterion("SAADD2 not between", value1, value2, "saadd2");
            return (Criteria) this;
        }

        public Criteria andSaadd3IsNull() {
            addCriterion("SAADD3 is null");
            return (Criteria) this;
        }

        public Criteria andSaadd3IsNotNull() {
            addCriterion("SAADD3 is not null");
            return (Criteria) this;
        }

        public Criteria andSaadd3EqualTo(String value) {
            addCriterion("SAADD3 =", value, "saadd3");
            return (Criteria) this;
        }

        public Criteria andSaadd3NotEqualTo(String value) {
            addCriterion("SAADD3 <>", value, "saadd3");
            return (Criteria) this;
        }

        public Criteria andSaadd3GreaterThan(String value) {
            addCriterion("SAADD3 >", value, "saadd3");
            return (Criteria) this;
        }

        public Criteria andSaadd3GreaterThanOrEqualTo(String value) {
            addCriterion("SAADD3 >=", value, "saadd3");
            return (Criteria) this;
        }

        public Criteria andSaadd3LessThan(String value) {
            addCriterion("SAADD3 <", value, "saadd3");
            return (Criteria) this;
        }

        public Criteria andSaadd3LessThanOrEqualTo(String value) {
            addCriterion("SAADD3 <=", value, "saadd3");
            return (Criteria) this;
        }

        public Criteria andSaadd3In(List<String> values) {
            addCriterion("SAADD3 in", values, "saadd3");
            return (Criteria) this;
        }

        public Criteria andSaadd3NotIn(List<String> values) {
            addCriterion("SAADD3 not in", values, "saadd3");
            return (Criteria) this;
        }

        public Criteria andSaadd3Between(String value1, String value2) {
            addCriterion("SAADD3 between", value1, value2, "saadd3");
            return (Criteria) this;
        }

        public Criteria andSaadd3NotBetween(String value1, String value2) {
            addCriterion("SAADD3 not between", value1, value2, "saadd3");
            return (Criteria) this;
        }

        public Criteria andSaadd4IsNull() {
            addCriterion("SAADD4 is null");
            return (Criteria) this;
        }

        public Criteria andSaadd4IsNotNull() {
            addCriterion("SAADD4 is not null");
            return (Criteria) this;
        }

        public Criteria andSaadd4EqualTo(String value) {
            addCriterion("SAADD4 =", value, "saadd4");
            return (Criteria) this;
        }

        public Criteria andSaadd4NotEqualTo(String value) {
            addCriterion("SAADD4 <>", value, "saadd4");
            return (Criteria) this;
        }

        public Criteria andSaadd4GreaterThan(String value) {
            addCriterion("SAADD4 >", value, "saadd4");
            return (Criteria) this;
        }

        public Criteria andSaadd4GreaterThanOrEqualTo(String value) {
            addCriterion("SAADD4 >=", value, "saadd4");
            return (Criteria) this;
        }

        public Criteria andSaadd4LessThan(String value) {
            addCriterion("SAADD4 <", value, "saadd4");
            return (Criteria) this;
        }

        public Criteria andSaadd4LessThanOrEqualTo(String value) {
            addCriterion("SAADD4 <=", value, "saadd4");
            return (Criteria) this;
        }

        public Criteria andSaadd4In(List<String> values) {
            addCriterion("SAADD4 in", values, "saadd4");
            return (Criteria) this;
        }

        public Criteria andSaadd4NotIn(List<String> values) {
            addCriterion("SAADD4 not in", values, "saadd4");
            return (Criteria) this;
        }

        public Criteria andSaadd4Between(String value1, String value2) {
            addCriterion("SAADD4 between", value1, value2, "saadd4");
            return (Criteria) this;
        }

        public Criteria andSaadd4NotBetween(String value1, String value2) {
            addCriterion("SAADD4 not between", value1, value2, "saadd4");
            return (Criteria) this;
        }

        public Criteria andShmlnmIsNull() {
            addCriterion("SHMLNM is null");
            return (Criteria) this;
        }

        public Criteria andShmlnmIsNotNull() {
            addCriterion("SHMLNM is not null");
            return (Criteria) this;
        }

        public Criteria andShmlnmEqualTo(String value) {
            addCriterion("SHMLNM =", value, "shmlnm");
            return (Criteria) this;
        }

        public Criteria andShmlnmNotEqualTo(String value) {
            addCriterion("SHMLNM <>", value, "shmlnm");
            return (Criteria) this;
        }

        public Criteria andShmlnmGreaterThan(String value) {
            addCriterion("SHMLNM >", value, "shmlnm");
            return (Criteria) this;
        }

        public Criteria andShmlnmGreaterThanOrEqualTo(String value) {
            addCriterion("SHMLNM >=", value, "shmlnm");
            return (Criteria) this;
        }

        public Criteria andShmlnmLessThan(String value) {
            addCriterion("SHMLNM <", value, "shmlnm");
            return (Criteria) this;
        }

        public Criteria andShmlnmLessThanOrEqualTo(String value) {
            addCriterion("SHMLNM <=", value, "shmlnm");
            return (Criteria) this;
        }

        public Criteria andShmlnmIn(List<String> values) {
            addCriterion("SHMLNM in", values, "shmlnm");
            return (Criteria) this;
        }

        public Criteria andShmlnmNotIn(List<String> values) {
            addCriterion("SHMLNM not in", values, "shmlnm");
            return (Criteria) this;
        }

        public Criteria andShmlnmBetween(String value1, String value2) {
            addCriterion("SHMLNM between", value1, value2, "shmlnm");
            return (Criteria) this;
        }

        public Criteria andShmlnmNotBetween(String value1, String value2) {
            addCriterion("SHMLNM not between", value1, value2, "shmlnm");
            return (Criteria) this;
        }

        public Criteria andShadd1IsNull() {
            addCriterion("SHADD1 is null");
            return (Criteria) this;
        }

        public Criteria andShadd1IsNotNull() {
            addCriterion("SHADD1 is not null");
            return (Criteria) this;
        }

        public Criteria andShadd1EqualTo(String value) {
            addCriterion("SHADD1 =", value, "shadd1");
            return (Criteria) this;
        }

        public Criteria andShadd1NotEqualTo(String value) {
            addCriterion("SHADD1 <>", value, "shadd1");
            return (Criteria) this;
        }

        public Criteria andShadd1GreaterThan(String value) {
            addCriterion("SHADD1 >", value, "shadd1");
            return (Criteria) this;
        }

        public Criteria andShadd1GreaterThanOrEqualTo(String value) {
            addCriterion("SHADD1 >=", value, "shadd1");
            return (Criteria) this;
        }

        public Criteria andShadd1LessThan(String value) {
            addCriterion("SHADD1 <", value, "shadd1");
            return (Criteria) this;
        }

        public Criteria andShadd1LessThanOrEqualTo(String value) {
            addCriterion("SHADD1 <=", value, "shadd1");
            return (Criteria) this;
        }

        public Criteria andShadd1In(List<String> values) {
            addCriterion("SHADD1 in", values, "shadd1");
            return (Criteria) this;
        }

        public Criteria andShadd1NotIn(List<String> values) {
            addCriterion("SHADD1 not in", values, "shadd1");
            return (Criteria) this;
        }

        public Criteria andShadd1Between(String value1, String value2) {
            addCriterion("SHADD1 between", value1, value2, "shadd1");
            return (Criteria) this;
        }

        public Criteria andShadd1NotBetween(String value1, String value2) {
            addCriterion("SHADD1 not between", value1, value2, "shadd1");
            return (Criteria) this;
        }

        public Criteria andShadd2IsNull() {
            addCriterion("SHADD2 is null");
            return (Criteria) this;
        }

        public Criteria andShadd2IsNotNull() {
            addCriterion("SHADD2 is not null");
            return (Criteria) this;
        }

        public Criteria andShadd2EqualTo(String value) {
            addCriterion("SHADD2 =", value, "shadd2");
            return (Criteria) this;
        }

        public Criteria andShadd2NotEqualTo(String value) {
            addCriterion("SHADD2 <>", value, "shadd2");
            return (Criteria) this;
        }

        public Criteria andShadd2GreaterThan(String value) {
            addCriterion("SHADD2 >", value, "shadd2");
            return (Criteria) this;
        }

        public Criteria andShadd2GreaterThanOrEqualTo(String value) {
            addCriterion("SHADD2 >=", value, "shadd2");
            return (Criteria) this;
        }

        public Criteria andShadd2LessThan(String value) {
            addCriterion("SHADD2 <", value, "shadd2");
            return (Criteria) this;
        }

        public Criteria andShadd2LessThanOrEqualTo(String value) {
            addCriterion("SHADD2 <=", value, "shadd2");
            return (Criteria) this;
        }

        public Criteria andShadd2In(List<String> values) {
            addCriterion("SHADD2 in", values, "shadd2");
            return (Criteria) this;
        }

        public Criteria andShadd2NotIn(List<String> values) {
            addCriterion("SHADD2 not in", values, "shadd2");
            return (Criteria) this;
        }

        public Criteria andShadd2Between(String value1, String value2) {
            addCriterion("SHADD2 between", value1, value2, "shadd2");
            return (Criteria) this;
        }

        public Criteria andShadd2NotBetween(String value1, String value2) {
            addCriterion("SHADD2 not between", value1, value2, "shadd2");
            return (Criteria) this;
        }

        public Criteria andShadd3IsNull() {
            addCriterion("SHADD3 is null");
            return (Criteria) this;
        }

        public Criteria andShadd3IsNotNull() {
            addCriterion("SHADD3 is not null");
            return (Criteria) this;
        }

        public Criteria andShadd3EqualTo(String value) {
            addCriterion("SHADD3 =", value, "shadd3");
            return (Criteria) this;
        }

        public Criteria andShadd3NotEqualTo(String value) {
            addCriterion("SHADD3 <>", value, "shadd3");
            return (Criteria) this;
        }

        public Criteria andShadd3GreaterThan(String value) {
            addCriterion("SHADD3 >", value, "shadd3");
            return (Criteria) this;
        }

        public Criteria andShadd3GreaterThanOrEqualTo(String value) {
            addCriterion("SHADD3 >=", value, "shadd3");
            return (Criteria) this;
        }

        public Criteria andShadd3LessThan(String value) {
            addCriterion("SHADD3 <", value, "shadd3");
            return (Criteria) this;
        }

        public Criteria andShadd3LessThanOrEqualTo(String value) {
            addCriterion("SHADD3 <=", value, "shadd3");
            return (Criteria) this;
        }

        public Criteria andShadd3In(List<String> values) {
            addCriterion("SHADD3 in", values, "shadd3");
            return (Criteria) this;
        }

        public Criteria andShadd3NotIn(List<String> values) {
            addCriterion("SHADD3 not in", values, "shadd3");
            return (Criteria) this;
        }

        public Criteria andShadd3Between(String value1, String value2) {
            addCriterion("SHADD3 between", value1, value2, "shadd3");
            return (Criteria) this;
        }

        public Criteria andShadd3NotBetween(String value1, String value2) {
            addCriterion("SHADD3 not between", value1, value2, "shadd3");
            return (Criteria) this;
        }

        public Criteria andShadd4IsNull() {
            addCriterion("SHADD4 is null");
            return (Criteria) this;
        }

        public Criteria andShadd4IsNotNull() {
            addCriterion("SHADD4 is not null");
            return (Criteria) this;
        }

        public Criteria andShadd4EqualTo(String value) {
            addCriterion("SHADD4 =", value, "shadd4");
            return (Criteria) this;
        }

        public Criteria andShadd4NotEqualTo(String value) {
            addCriterion("SHADD4 <>", value, "shadd4");
            return (Criteria) this;
        }

        public Criteria andShadd4GreaterThan(String value) {
            addCriterion("SHADD4 >", value, "shadd4");
            return (Criteria) this;
        }

        public Criteria andShadd4GreaterThanOrEqualTo(String value) {
            addCriterion("SHADD4 >=", value, "shadd4");
            return (Criteria) this;
        }

        public Criteria andShadd4LessThan(String value) {
            addCriterion("SHADD4 <", value, "shadd4");
            return (Criteria) this;
        }

        public Criteria andShadd4LessThanOrEqualTo(String value) {
            addCriterion("SHADD4 <=", value, "shadd4");
            return (Criteria) this;
        }

        public Criteria andShadd4In(List<String> values) {
            addCriterion("SHADD4 in", values, "shadd4");
            return (Criteria) this;
        }

        public Criteria andShadd4NotIn(List<String> values) {
            addCriterion("SHADD4 not in", values, "shadd4");
            return (Criteria) this;
        }

        public Criteria andShadd4Between(String value1, String value2) {
            addCriterion("SHADD4 between", value1, value2, "shadd4");
            return (Criteria) this;
        }

        public Criteria andShadd4NotBetween(String value1, String value2) {
            addCriterion("SHADD4 not between", value1, value2, "shadd4");
            return (Criteria) this;
        }

        public Criteria andJdeStatusIsNull() {
            addCriterion("JDE_Status is null");
            return (Criteria) this;
        }

        public Criteria andJdeStatusIsNotNull() {
            addCriterion("JDE_Status is not null");
            return (Criteria) this;
        }

        public Criteria andJdeStatusEqualTo(String value) {
            addCriterion("JDE_Status =", value, "jdeStatus");
            return (Criteria) this;
        }

        public Criteria andJdeStatusNotEqualTo(String value) {
            addCriterion("JDE_Status <>", value, "jdeStatus");
            return (Criteria) this;
        }

        public Criteria andJdeStatusGreaterThan(String value) {
            addCriterion("JDE_Status >", value, "jdeStatus");
            return (Criteria) this;
        }

        public Criteria andJdeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("JDE_Status >=", value, "jdeStatus");
            return (Criteria) this;
        }

        public Criteria andJdeStatusLessThan(String value) {
            addCriterion("JDE_Status <", value, "jdeStatus");
            return (Criteria) this;
        }

        public Criteria andJdeStatusLessThanOrEqualTo(String value) {
            addCriterion("JDE_Status <=", value, "jdeStatus");
            return (Criteria) this;
        }

        public Criteria andJdeStatusLike(String value) {
            addCriterion("JDE_Status like", value, "jdeStatus");
            return (Criteria) this;
        }

        public Criteria andJdeStatusNotLike(String value) {
            addCriterion("JDE_Status not like", value, "jdeStatus");
            return (Criteria) this;
        }

        public Criteria andJdeStatusIn(List<String> values) {
            addCriterion("JDE_Status in", values, "jdeStatus");
            return (Criteria) this;
        }

        public Criteria andJdeStatusNotIn(List<String> values) {
            addCriterion("JDE_Status not in", values, "jdeStatus");
            return (Criteria) this;
        }

        public Criteria andJdeStatusBetween(String value1, String value2) {
            addCriterion("JDE_Status between", value1, value2, "jdeStatus");
            return (Criteria) this;
        }

        public Criteria andJdeStatusNotBetween(String value1, String value2) {
            addCriterion("JDE_Status not between", value1, value2, "jdeStatus");
            return (Criteria) this;
        }

        public Criteria andJdeInsertdateIsNull() {
            addCriterion("JDE_InsertDate is null");
            return (Criteria) this;
        }

        public Criteria andJdeInsertdateIsNotNull() {
            addCriterion("JDE_InsertDate is not null");
            return (Criteria) this;
        }

        public Criteria andJdeInsertdateEqualTo(Date value) {
            addCriterion("JDE_InsertDate =", value, "jdeInsertdate");
            return (Criteria) this;
        }

        public Criteria andJdeInsertdateNotEqualTo(Date value) {
            addCriterion("JDE_InsertDate <>", value, "jdeInsertdate");
            return (Criteria) this;
        }

        public Criteria andJdeInsertdateGreaterThan(Date value) {
            addCriterion("JDE_InsertDate >", value, "jdeInsertdate");
            return (Criteria) this;
        }

        public Criteria andJdeInsertdateGreaterThanOrEqualTo(Date value) {
            addCriterion("JDE_InsertDate >=", value, "jdeInsertdate");
            return (Criteria) this;
        }

        public Criteria andJdeInsertdateLessThan(Date value) {
            addCriterion("JDE_InsertDate <", value, "jdeInsertdate");
            return (Criteria) this;
        }

        public Criteria andJdeInsertdateLessThanOrEqualTo(Date value) {
            addCriterion("JDE_InsertDate <=", value, "jdeInsertdate");
            return (Criteria) this;
        }

        public Criteria andJdeInsertdateIn(List<Date> values) {
            addCriterion("JDE_InsertDate in", values, "jdeInsertdate");
            return (Criteria) this;
        }

        public Criteria andJdeInsertdateNotIn(List<Date> values) {
            addCriterion("JDE_InsertDate not in", values, "jdeInsertdate");
            return (Criteria) this;
        }

        public Criteria andJdeInsertdateBetween(Date value1, Date value2) {
            addCriterion("JDE_InsertDate between", value1, value2, "jdeInsertdate");
            return (Criteria) this;
        }

        public Criteria andJdeInsertdateNotBetween(Date value1, Date value2) {
            addCriterion("JDE_InsertDate not between", value1, value2, "jdeInsertdate");
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

        public Criteria andJdeOrdernumberIsNull() {
            addCriterion("JDE_OrderNumber is null");
            return (Criteria) this;
        }

        public Criteria andJdeOrdernumberIsNotNull() {
            addCriterion("JDE_OrderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andJdeOrdernumberEqualTo(Long value) {
            addCriterion("JDE_OrderNumber =", value, "jdeOrdernumber");
            return (Criteria) this;
        }

        public Criteria andJdeOrdernumberNotEqualTo(Long value) {
            addCriterion("JDE_OrderNumber <>", value, "jdeOrdernumber");
            return (Criteria) this;
        }

        public Criteria andJdeOrdernumberGreaterThan(Long value) {
            addCriterion("JDE_OrderNumber >", value, "jdeOrdernumber");
            return (Criteria) this;
        }

        public Criteria andJdeOrdernumberGreaterThanOrEqualTo(Long value) {
            addCriterion("JDE_OrderNumber >=", value, "jdeOrdernumber");
            return (Criteria) this;
        }

        public Criteria andJdeOrdernumberLessThan(Long value) {
            addCriterion("JDE_OrderNumber <", value, "jdeOrdernumber");
            return (Criteria) this;
        }

        public Criteria andJdeOrdernumberLessThanOrEqualTo(Long value) {
            addCriterion("JDE_OrderNumber <=", value, "jdeOrdernumber");
            return (Criteria) this;
        }

        public Criteria andJdeOrdernumberIn(List<Long> values) {
            addCriterion("JDE_OrderNumber in", values, "jdeOrdernumber");
            return (Criteria) this;
        }

        public Criteria andJdeOrdernumberNotIn(List<Long> values) {
            addCriterion("JDE_OrderNumber not in", values, "jdeOrdernumber");
            return (Criteria) this;
        }

        public Criteria andJdeOrdernumberBetween(Long value1, Long value2) {
            addCriterion("JDE_OrderNumber between", value1, value2, "jdeOrdernumber");
            return (Criteria) this;
        }

        public Criteria andJdeOrdernumberNotBetween(Long value1, Long value2) {
            addCriterion("JDE_OrderNumber not between", value1, value2, "jdeOrdernumber");
            return (Criteria) this;
        }

        public Criteria andJdeProccesslogIsNull() {
            addCriterion("JDE_ProccessLog is null");
            return (Criteria) this;
        }

        public Criteria andJdeProccesslogIsNotNull() {
            addCriterion("JDE_ProccessLog is not null");
            return (Criteria) this;
        }

        public Criteria andJdeProccesslogEqualTo(String value) {
            addCriterion("JDE_ProccessLog =", value, "jdeProccesslog");
            return (Criteria) this;
        }

        public Criteria andJdeProccesslogNotEqualTo(String value) {
            addCriterion("JDE_ProccessLog <>", value, "jdeProccesslog");
            return (Criteria) this;
        }

        public Criteria andJdeProccesslogGreaterThan(String value) {
            addCriterion("JDE_ProccessLog >", value, "jdeProccesslog");
            return (Criteria) this;
        }

        public Criteria andJdeProccesslogGreaterThanOrEqualTo(String value) {
            addCriterion("JDE_ProccessLog >=", value, "jdeProccesslog");
            return (Criteria) this;
        }

        public Criteria andJdeProccesslogLessThan(String value) {
            addCriterion("JDE_ProccessLog <", value, "jdeProccesslog");
            return (Criteria) this;
        }

        public Criteria andJdeProccesslogLessThanOrEqualTo(String value) {
            addCriterion("JDE_ProccessLog <=", value, "jdeProccesslog");
            return (Criteria) this;
        }

        public Criteria andJdeProccesslogLike(String value) {
            addCriterion("JDE_ProccessLog like", value, "jdeProccesslog");
            return (Criteria) this;
        }

        public Criteria andJdeProccesslogNotLike(String value) {
            addCriterion("JDE_ProccessLog not like", value, "jdeProccesslog");
            return (Criteria) this;
        }

        public Criteria andJdeProccesslogIn(List<String> values) {
            addCriterion("JDE_ProccessLog in", values, "jdeProccesslog");
            return (Criteria) this;
        }

        public Criteria andJdeProccesslogNotIn(List<String> values) {
            addCriterion("JDE_ProccessLog not in", values, "jdeProccesslog");
            return (Criteria) this;
        }

        public Criteria andJdeProccesslogBetween(String value1, String value2) {
            addCriterion("JDE_ProccessLog between", value1, value2, "jdeProccesslog");
            return (Criteria) this;
        }

        public Criteria andJdeProccesslogNotBetween(String value1, String value2) {
            addCriterion("JDE_ProccessLog not between", value1, value2, "jdeProccesslog");
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

        public Criteria andSydocoIsNull() {
            addCriterion("SYDOCO is null");
            return (Criteria) this;
        }

        public Criteria andSydocoIsNotNull() {
            addCriterion("SYDOCO is not null");
            return (Criteria) this;
        }

        public Criteria andSydocoEqualTo(Long value) {
            addCriterion("SYDOCO =", value, "sydoco");
            return (Criteria) this;
        }

        public Criteria andSydocoNotEqualTo(Long value) {
            addCriterion("SYDOCO <>", value, "sydoco");
            return (Criteria) this;
        }

        public Criteria andSydocoGreaterThan(Long value) {
            addCriterion("SYDOCO >", value, "sydoco");
            return (Criteria) this;
        }

        public Criteria andSydocoGreaterThanOrEqualTo(Long value) {
            addCriterion("SYDOCO >=", value, "sydoco");
            return (Criteria) this;
        }

        public Criteria andSydocoLessThan(Long value) {
            addCriterion("SYDOCO <", value, "sydoco");
            return (Criteria) this;
        }

        public Criteria andSydocoLessThanOrEqualTo(Long value) {
            addCriterion("SYDOCO <=", value, "sydoco");
            return (Criteria) this;
        }

        public Criteria andSydocoIn(List<Long> values) {
            addCriterion("SYDOCO in", values, "sydoco");
            return (Criteria) this;
        }

        public Criteria andSydocoNotIn(List<Long> values) {
            addCriterion("SYDOCO not in", values, "sydoco");
            return (Criteria) this;
        }

        public Criteria andSydocoBetween(Long value1, Long value2) {
            addCriterion("SYDOCO between", value1, value2, "sydoco");
            return (Criteria) this;
        }

        public Criteria andSydocoNotBetween(Long value1, Long value2) {
            addCriterion("SYDOCO not between", value1, value2, "sydoco");
            return (Criteria) this;
        }

        public Criteria andSyedlnIsNull() {
            addCriterion("SYEDLN is null");
            return (Criteria) this;
        }

        public Criteria andSyedlnIsNotNull() {
            addCriterion("SYEDLN is not null");
            return (Criteria) this;
        }

        public Criteria andSyedlnEqualTo(BigDecimal value) {
            addCriterion("SYEDLN =", value, "syedln");
            return (Criteria) this;
        }

        public Criteria andSyedlnNotEqualTo(BigDecimal value) {
            addCriterion("SYEDLN <>", value, "syedln");
            return (Criteria) this;
        }

        public Criteria andSyedlnGreaterThan(BigDecimal value) {
            addCriterion("SYEDLN >", value, "syedln");
            return (Criteria) this;
        }

        public Criteria andSyedlnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SYEDLN >=", value, "syedln");
            return (Criteria) this;
        }

        public Criteria andSyedlnLessThan(BigDecimal value) {
            addCriterion("SYEDLN <", value, "syedln");
            return (Criteria) this;
        }

        public Criteria andSyedlnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SYEDLN <=", value, "syedln");
            return (Criteria) this;
        }

        public Criteria andSyedlnIn(List<BigDecimal> values) {
            addCriterion("SYEDLN in", values, "syedln");
            return (Criteria) this;
        }

        public Criteria andSyedlnNotIn(List<BigDecimal> values) {
            addCriterion("SYEDLN not in", values, "syedln");
            return (Criteria) this;
        }

        public Criteria andSyedlnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYEDLN between", value1, value2, "syedln");
            return (Criteria) this;
        }

        public Criteria andSyedlnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYEDLN not between", value1, value2, "syedln");
            return (Criteria) this;
        }

        public Criteria andSyedstIsNull() {
            addCriterion("SYEDST is null");
            return (Criteria) this;
        }

        public Criteria andSyedstIsNotNull() {
            addCriterion("SYEDST is not null");
            return (Criteria) this;
        }

        public Criteria andSyedstEqualTo(String value) {
            addCriterion("SYEDST =", value, "syedst");
            return (Criteria) this;
        }

        public Criteria andSyedstNotEqualTo(String value) {
            addCriterion("SYEDST <>", value, "syedst");
            return (Criteria) this;
        }

        public Criteria andSyedstGreaterThan(String value) {
            addCriterion("SYEDST >", value, "syedst");
            return (Criteria) this;
        }

        public Criteria andSyedstGreaterThanOrEqualTo(String value) {
            addCriterion("SYEDST >=", value, "syedst");
            return (Criteria) this;
        }

        public Criteria andSyedstLessThan(String value) {
            addCriterion("SYEDST <", value, "syedst");
            return (Criteria) this;
        }

        public Criteria andSyedstLessThanOrEqualTo(String value) {
            addCriterion("SYEDST <=", value, "syedst");
            return (Criteria) this;
        }

        public Criteria andSyedstLike(String value) {
            addCriterion("SYEDST like", value, "syedst");
            return (Criteria) this;
        }

        public Criteria andSyedstNotLike(String value) {
            addCriterion("SYEDST not like", value, "syedst");
            return (Criteria) this;
        }

        public Criteria andSyedstIn(List<String> values) {
            addCriterion("SYEDST in", values, "syedst");
            return (Criteria) this;
        }

        public Criteria andSyedstNotIn(List<String> values) {
            addCriterion("SYEDST not in", values, "syedst");
            return (Criteria) this;
        }

        public Criteria andSyedstBetween(String value1, String value2) {
            addCriterion("SYEDST between", value1, value2, "syedst");
            return (Criteria) this;
        }

        public Criteria andSyedstNotBetween(String value1, String value2) {
            addCriterion("SYEDST not between", value1, value2, "syedst");
            return (Criteria) this;
        }

        public Criteria andSyederIsNull() {
            addCriterion("SYEDER is null");
            return (Criteria) this;
        }

        public Criteria andSyederIsNotNull() {
            addCriterion("SYEDER is not null");
            return (Criteria) this;
        }

        public Criteria andSyederEqualTo(String value) {
            addCriterion("SYEDER =", value, "syeder");
            return (Criteria) this;
        }

        public Criteria andSyederNotEqualTo(String value) {
            addCriterion("SYEDER <>", value, "syeder");
            return (Criteria) this;
        }

        public Criteria andSyederGreaterThan(String value) {
            addCriterion("SYEDER >", value, "syeder");
            return (Criteria) this;
        }

        public Criteria andSyederGreaterThanOrEqualTo(String value) {
            addCriterion("SYEDER >=", value, "syeder");
            return (Criteria) this;
        }

        public Criteria andSyederLessThan(String value) {
            addCriterion("SYEDER <", value, "syeder");
            return (Criteria) this;
        }

        public Criteria andSyederLessThanOrEqualTo(String value) {
            addCriterion("SYEDER <=", value, "syeder");
            return (Criteria) this;
        }

        public Criteria andSyederLike(String value) {
            addCriterion("SYEDER like", value, "syeder");
            return (Criteria) this;
        }

        public Criteria andSyederNotLike(String value) {
            addCriterion("SYEDER not like", value, "syeder");
            return (Criteria) this;
        }

        public Criteria andSyederIn(List<String> values) {
            addCriterion("SYEDER in", values, "syeder");
            return (Criteria) this;
        }

        public Criteria andSyederNotIn(List<String> values) {
            addCriterion("SYEDER not in", values, "syeder");
            return (Criteria) this;
        }

        public Criteria andSyederBetween(String value1, String value2) {
            addCriterion("SYEDER between", value1, value2, "syeder");
            return (Criteria) this;
        }

        public Criteria andSyederNotBetween(String value1, String value2) {
            addCriterion("SYEDER not between", value1, value2, "syeder");
            return (Criteria) this;
        }

        public Criteria andSyeddlIsNull() {
            addCriterion("SYEDDL is null");
            return (Criteria) this;
        }

        public Criteria andSyeddlIsNotNull() {
            addCriterion("SYEDDL is not null");
            return (Criteria) this;
        }

        public Criteria andSyeddlEqualTo(Integer value) {
            addCriterion("SYEDDL =", value, "syeddl");
            return (Criteria) this;
        }

        public Criteria andSyeddlNotEqualTo(Integer value) {
            addCriterion("SYEDDL <>", value, "syeddl");
            return (Criteria) this;
        }

        public Criteria andSyeddlGreaterThan(Integer value) {
            addCriterion("SYEDDL >", value, "syeddl");
            return (Criteria) this;
        }

        public Criteria andSyeddlGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYEDDL >=", value, "syeddl");
            return (Criteria) this;
        }

        public Criteria andSyeddlLessThan(Integer value) {
            addCriterion("SYEDDL <", value, "syeddl");
            return (Criteria) this;
        }

        public Criteria andSyeddlLessThanOrEqualTo(Integer value) {
            addCriterion("SYEDDL <=", value, "syeddl");
            return (Criteria) this;
        }

        public Criteria andSyeddlIn(List<Integer> values) {
            addCriterion("SYEDDL in", values, "syeddl");
            return (Criteria) this;
        }

        public Criteria andSyeddlNotIn(List<Integer> values) {
            addCriterion("SYEDDL not in", values, "syeddl");
            return (Criteria) this;
        }

        public Criteria andSyeddlBetween(Integer value1, Integer value2) {
            addCriterion("SYEDDL between", value1, value2, "syeddl");
            return (Criteria) this;
        }

        public Criteria andSyeddlNotBetween(Integer value1, Integer value2) {
            addCriterion("SYEDDL not between", value1, value2, "syeddl");
            return (Criteria) this;
        }

        public Criteria andSytpurIsNull() {
            addCriterion("SYTPUR is null");
            return (Criteria) this;
        }

        public Criteria andSytpurIsNotNull() {
            addCriterion("SYTPUR is not null");
            return (Criteria) this;
        }

        public Criteria andSytpurEqualTo(String value) {
            addCriterion("SYTPUR =", value, "sytpur");
            return (Criteria) this;
        }

        public Criteria andSytpurNotEqualTo(String value) {
            addCriterion("SYTPUR <>", value, "sytpur");
            return (Criteria) this;
        }

        public Criteria andSytpurGreaterThan(String value) {
            addCriterion("SYTPUR >", value, "sytpur");
            return (Criteria) this;
        }

        public Criteria andSytpurGreaterThanOrEqualTo(String value) {
            addCriterion("SYTPUR >=", value, "sytpur");
            return (Criteria) this;
        }

        public Criteria andSytpurLessThan(String value) {
            addCriterion("SYTPUR <", value, "sytpur");
            return (Criteria) this;
        }

        public Criteria andSytpurLessThanOrEqualTo(String value) {
            addCriterion("SYTPUR <=", value, "sytpur");
            return (Criteria) this;
        }

        public Criteria andSytpurLike(String value) {
            addCriterion("SYTPUR like", value, "sytpur");
            return (Criteria) this;
        }

        public Criteria andSytpurNotLike(String value) {
            addCriterion("SYTPUR not like", value, "sytpur");
            return (Criteria) this;
        }

        public Criteria andSytpurIn(List<String> values) {
            addCriterion("SYTPUR in", values, "sytpur");
            return (Criteria) this;
        }

        public Criteria andSytpurNotIn(List<String> values) {
            addCriterion("SYTPUR not in", values, "sytpur");
            return (Criteria) this;
        }

        public Criteria andSytpurBetween(String value1, String value2) {
            addCriterion("SYTPUR between", value1, value2, "sytpur");
            return (Criteria) this;
        }

        public Criteria andSytpurNotBetween(String value1, String value2) {
            addCriterion("SYTPUR not between", value1, value2, "sytpur");
            return (Criteria) this;
        }

        public Criteria andSyedctIsNull() {
            addCriterion("SYEDCT is null");
            return (Criteria) this;
        }

        public Criteria andSyedctIsNotNull() {
            addCriterion("SYEDCT is not null");
            return (Criteria) this;
        }

        public Criteria andSyedctEqualTo(String value) {
            addCriterion("SYEDCT =", value, "syedct");
            return (Criteria) this;
        }

        public Criteria andSyedctNotEqualTo(String value) {
            addCriterion("SYEDCT <>", value, "syedct");
            return (Criteria) this;
        }

        public Criteria andSyedctGreaterThan(String value) {
            addCriterion("SYEDCT >", value, "syedct");
            return (Criteria) this;
        }

        public Criteria andSyedctGreaterThanOrEqualTo(String value) {
            addCriterion("SYEDCT >=", value, "syedct");
            return (Criteria) this;
        }

        public Criteria andSyedctLessThan(String value) {
            addCriterion("SYEDCT <", value, "syedct");
            return (Criteria) this;
        }

        public Criteria andSyedctLessThanOrEqualTo(String value) {
            addCriterion("SYEDCT <=", value, "syedct");
            return (Criteria) this;
        }

        public Criteria andSyedctLike(String value) {
            addCriterion("SYEDCT like", value, "syedct");
            return (Criteria) this;
        }

        public Criteria andSyedctNotLike(String value) {
            addCriterion("SYEDCT not like", value, "syedct");
            return (Criteria) this;
        }

        public Criteria andSyedctIn(List<String> values) {
            addCriterion("SYEDCT in", values, "syedct");
            return (Criteria) this;
        }

        public Criteria andSyedctNotIn(List<String> values) {
            addCriterion("SYEDCT not in", values, "syedct");
            return (Criteria) this;
        }

        public Criteria andSyedctBetween(String value1, String value2) {
            addCriterion("SYEDCT between", value1, value2, "syedct");
            return (Criteria) this;
        }

        public Criteria andSyedctNotBetween(String value1, String value2) {
            addCriterion("SYEDCT not between", value1, value2, "syedct");
            return (Criteria) this;
        }

        public Criteria andSyedtyIsNull() {
            addCriterion("SYEDTY is null");
            return (Criteria) this;
        }

        public Criteria andSyedtyIsNotNull() {
            addCriterion("SYEDTY is not null");
            return (Criteria) this;
        }

        public Criteria andSyedtyEqualTo(String value) {
            addCriterion("SYEDTY =", value, "syedty");
            return (Criteria) this;
        }

        public Criteria andSyedtyNotEqualTo(String value) {
            addCriterion("SYEDTY <>", value, "syedty");
            return (Criteria) this;
        }

        public Criteria andSyedtyGreaterThan(String value) {
            addCriterion("SYEDTY >", value, "syedty");
            return (Criteria) this;
        }

        public Criteria andSyedtyGreaterThanOrEqualTo(String value) {
            addCriterion("SYEDTY >=", value, "syedty");
            return (Criteria) this;
        }

        public Criteria andSyedtyLessThan(String value) {
            addCriterion("SYEDTY <", value, "syedty");
            return (Criteria) this;
        }

        public Criteria andSyedtyLessThanOrEqualTo(String value) {
            addCriterion("SYEDTY <=", value, "syedty");
            return (Criteria) this;
        }

        public Criteria andSyedtyLike(String value) {
            addCriterion("SYEDTY like", value, "syedty");
            return (Criteria) this;
        }

        public Criteria andSyedtyNotLike(String value) {
            addCriterion("SYEDTY not like", value, "syedty");
            return (Criteria) this;
        }

        public Criteria andSyedtyIn(List<String> values) {
            addCriterion("SYEDTY in", values, "syedty");
            return (Criteria) this;
        }

        public Criteria andSyedtyNotIn(List<String> values) {
            addCriterion("SYEDTY not in", values, "syedty");
            return (Criteria) this;
        }

        public Criteria andSyedtyBetween(String value1, String value2) {
            addCriterion("SYEDTY between", value1, value2, "syedty");
            return (Criteria) this;
        }

        public Criteria andSyedtyNotBetween(String value1, String value2) {
            addCriterion("SYEDTY not between", value1, value2, "syedty");
            return (Criteria) this;
        }

        public Criteria andSyedspIsNull() {
            addCriterion("SYEDSP is null");
            return (Criteria) this;
        }

        public Criteria andSyedspIsNotNull() {
            addCriterion("SYEDSP is not null");
            return (Criteria) this;
        }

        public Criteria andSyedspEqualTo(String value) {
            addCriterion("SYEDSP =", value, "syedsp");
            return (Criteria) this;
        }

        public Criteria andSyedspNotEqualTo(String value) {
            addCriterion("SYEDSP <>", value, "syedsp");
            return (Criteria) this;
        }

        public Criteria andSyedspGreaterThan(String value) {
            addCriterion("SYEDSP >", value, "syedsp");
            return (Criteria) this;
        }

        public Criteria andSyedspGreaterThanOrEqualTo(String value) {
            addCriterion("SYEDSP >=", value, "syedsp");
            return (Criteria) this;
        }

        public Criteria andSyedspLessThan(String value) {
            addCriterion("SYEDSP <", value, "syedsp");
            return (Criteria) this;
        }

        public Criteria andSyedspLessThanOrEqualTo(String value) {
            addCriterion("SYEDSP <=", value, "syedsp");
            return (Criteria) this;
        }

        public Criteria andSyedspLike(String value) {
            addCriterion("SYEDSP like", value, "syedsp");
            return (Criteria) this;
        }

        public Criteria andSyedspNotLike(String value) {
            addCriterion("SYEDSP not like", value, "syedsp");
            return (Criteria) this;
        }

        public Criteria andSyedspIn(List<String> values) {
            addCriterion("SYEDSP in", values, "syedsp");
            return (Criteria) this;
        }

        public Criteria andSyedspNotIn(List<String> values) {
            addCriterion("SYEDSP not in", values, "syedsp");
            return (Criteria) this;
        }

        public Criteria andSyedspBetween(String value1, String value2) {
            addCriterion("SYEDSP between", value1, value2, "syedsp");
            return (Criteria) this;
        }

        public Criteria andSyedspNotBetween(String value1, String value2) {
            addCriterion("SYEDSP not between", value1, value2, "syedsp");
            return (Criteria) this;
        }

        public Criteria andSyedocIsNull() {
            addCriterion("SYEDOC is null");
            return (Criteria) this;
        }

        public Criteria andSyedocIsNotNull() {
            addCriterion("SYEDOC is not null");
            return (Criteria) this;
        }

        public Criteria andSyedocEqualTo(Long value) {
            addCriterion("SYEDOC =", value, "syedoc");
            return (Criteria) this;
        }

        public Criteria andSyedocNotEqualTo(Long value) {
            addCriterion("SYEDOC <>", value, "syedoc");
            return (Criteria) this;
        }

        public Criteria andSyedocGreaterThan(Long value) {
            addCriterion("SYEDOC >", value, "syedoc");
            return (Criteria) this;
        }

        public Criteria andSyedocGreaterThanOrEqualTo(Long value) {
            addCriterion("SYEDOC >=", value, "syedoc");
            return (Criteria) this;
        }

        public Criteria andSyedocLessThan(Long value) {
            addCriterion("SYEDOC <", value, "syedoc");
            return (Criteria) this;
        }

        public Criteria andSyedocLessThanOrEqualTo(Long value) {
            addCriterion("SYEDOC <=", value, "syedoc");
            return (Criteria) this;
        }

        public Criteria andSyedocIn(List<Long> values) {
            addCriterion("SYEDOC in", values, "syedoc");
            return (Criteria) this;
        }

        public Criteria andSyedocNotIn(List<Long> values) {
            addCriterion("SYEDOC not in", values, "syedoc");
            return (Criteria) this;
        }

        public Criteria andSyedocBetween(Long value1, Long value2) {
            addCriterion("SYEDOC between", value1, value2, "syedoc");
            return (Criteria) this;
        }

        public Criteria andSyedocNotBetween(Long value1, Long value2) {
            addCriterion("SYEDOC not between", value1, value2, "syedoc");
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