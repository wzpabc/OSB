package com.tup.mssql.model;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDetailInEDIExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailInEDIExample() {
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

        public Criteria andHeaderidIsNull() {
            addCriterion("HeaderID is null");
            return (Criteria) this;
        }

        public Criteria andHeaderidIsNotNull() {
            addCriterion("HeaderID is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderidEqualTo(String value) {
            addCriterion("HeaderID =", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidNotEqualTo(String value) {
            addCriterion("HeaderID <>", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidGreaterThan(String value) {
            addCriterion("HeaderID >", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidGreaterThanOrEqualTo(String value) {
            addCriterion("HeaderID >=", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidLessThan(String value) {
            addCriterion("HeaderID <", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidLessThanOrEqualTo(String value) {
            addCriterion("HeaderID <=", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidLike(String value) {
            addCriterion("HeaderID like", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidNotLike(String value) {
            addCriterion("HeaderID not like", value, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidIn(List<String> values) {
            addCriterion("HeaderID in", values, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidNotIn(List<String> values) {
            addCriterion("HeaderID not in", values, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidBetween(String value1, String value2) {
            addCriterion("HeaderID between", value1, value2, "headerid");
            return (Criteria) this;
        }

        public Criteria andHeaderidNotBetween(String value1, String value2) {
            addCriterion("HeaderID not between", value1, value2, "headerid");
            return (Criteria) this;
        }

        public Criteria andSzkcooIsNull() {
            addCriterion("SZKCOO is null");
            return (Criteria) this;
        }

        public Criteria andSzkcooIsNotNull() {
            addCriterion("SZKCOO is not null");
            return (Criteria) this;
        }

        public Criteria andSzkcooEqualTo(String value) {
            addCriterion("SZKCOO =", value, "szkcoo");
            return (Criteria) this;
        }

        public Criteria andSzkcooNotEqualTo(String value) {
            addCriterion("SZKCOO <>", value, "szkcoo");
            return (Criteria) this;
        }

        public Criteria andSzkcooGreaterThan(String value) {
            addCriterion("SZKCOO >", value, "szkcoo");
            return (Criteria) this;
        }

        public Criteria andSzkcooGreaterThanOrEqualTo(String value) {
            addCriterion("SZKCOO >=", value, "szkcoo");
            return (Criteria) this;
        }

        public Criteria andSzkcooLessThan(String value) {
            addCriterion("SZKCOO <", value, "szkcoo");
            return (Criteria) this;
        }

        public Criteria andSzkcooLessThanOrEqualTo(String value) {
            addCriterion("SZKCOO <=", value, "szkcoo");
            return (Criteria) this;
        }

        public Criteria andSzkcooLike(String value) {
            addCriterion("SZKCOO like", value, "szkcoo");
            return (Criteria) this;
        }

        public Criteria andSzkcooNotLike(String value) {
            addCriterion("SZKCOO not like", value, "szkcoo");
            return (Criteria) this;
        }

        public Criteria andSzkcooIn(List<String> values) {
            addCriterion("SZKCOO in", values, "szkcoo");
            return (Criteria) this;
        }

        public Criteria andSzkcooNotIn(List<String> values) {
            addCriterion("SZKCOO not in", values, "szkcoo");
            return (Criteria) this;
        }

        public Criteria andSzkcooBetween(String value1, String value2) {
            addCriterion("SZKCOO between", value1, value2, "szkcoo");
            return (Criteria) this;
        }

        public Criteria andSzkcooNotBetween(String value1, String value2) {
            addCriterion("SZKCOO not between", value1, value2, "szkcoo");
            return (Criteria) this;
        }

        public Criteria andSzdctoIsNull() {
            addCriterion("SZDCTO is null");
            return (Criteria) this;
        }

        public Criteria andSzdctoIsNotNull() {
            addCriterion("SZDCTO is not null");
            return (Criteria) this;
        }

        public Criteria andSzdctoEqualTo(String value) {
            addCriterion("SZDCTO =", value, "szdcto");
            return (Criteria) this;
        }

        public Criteria andSzdctoNotEqualTo(String value) {
            addCriterion("SZDCTO <>", value, "szdcto");
            return (Criteria) this;
        }

        public Criteria andSzdctoGreaterThan(String value) {
            addCriterion("SZDCTO >", value, "szdcto");
            return (Criteria) this;
        }

        public Criteria andSzdctoGreaterThanOrEqualTo(String value) {
            addCriterion("SZDCTO >=", value, "szdcto");
            return (Criteria) this;
        }

        public Criteria andSzdctoLessThan(String value) {
            addCriterion("SZDCTO <", value, "szdcto");
            return (Criteria) this;
        }

        public Criteria andSzdctoLessThanOrEqualTo(String value) {
            addCriterion("SZDCTO <=", value, "szdcto");
            return (Criteria) this;
        }

        public Criteria andSzdctoLike(String value) {
            addCriterion("SZDCTO like", value, "szdcto");
            return (Criteria) this;
        }

        public Criteria andSzdctoNotLike(String value) {
            addCriterion("SZDCTO not like", value, "szdcto");
            return (Criteria) this;
        }

        public Criteria andSzdctoIn(List<String> values) {
            addCriterion("SZDCTO in", values, "szdcto");
            return (Criteria) this;
        }

        public Criteria andSzdctoNotIn(List<String> values) {
            addCriterion("SZDCTO not in", values, "szdcto");
            return (Criteria) this;
        }

        public Criteria andSzdctoBetween(String value1, String value2) {
            addCriterion("SZDCTO between", value1, value2, "szdcto");
            return (Criteria) this;
        }

        public Criteria andSzdctoNotBetween(String value1, String value2) {
            addCriterion("SZDCTO not between", value1, value2, "szdcto");
            return (Criteria) this;
        }

        public Criteria andSzlnidIsNull() {
            addCriterion("SZLNID is null");
            return (Criteria) this;
        }

        public Criteria andSzlnidIsNotNull() {
            addCriterion("SZLNID is not null");
            return (Criteria) this;
        }

        public Criteria andSzlnidEqualTo(BigDecimal value) {
            addCriterion("SZLNID =", value, "szlnid");
            return (Criteria) this;
        }

        public Criteria andSzlnidNotEqualTo(BigDecimal value) {
            addCriterion("SZLNID <>", value, "szlnid");
            return (Criteria) this;
        }

        public Criteria andSzlnidGreaterThan(BigDecimal value) {
            addCriterion("SZLNID >", value, "szlnid");
            return (Criteria) this;
        }

        public Criteria andSzlnidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SZLNID >=", value, "szlnid");
            return (Criteria) this;
        }

        public Criteria andSzlnidLessThan(BigDecimal value) {
            addCriterion("SZLNID <", value, "szlnid");
            return (Criteria) this;
        }

        public Criteria andSzlnidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SZLNID <=", value, "szlnid");
            return (Criteria) this;
        }

        public Criteria andSzlnidIn(List<BigDecimal> values) {
            addCriterion("SZLNID in", values, "szlnid");
            return (Criteria) this;
        }

        public Criteria andSzlnidNotIn(List<BigDecimal> values) {
            addCriterion("SZLNID not in", values, "szlnid");
            return (Criteria) this;
        }

        public Criteria andSzlnidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SZLNID between", value1, value2, "szlnid");
            return (Criteria) this;
        }

        public Criteria andSzlnidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SZLNID not between", value1, value2, "szlnid");
            return (Criteria) this;
        }

        public Criteria andSzmcuIsNull() {
            addCriterion("SZMCU is null");
            return (Criteria) this;
        }

        public Criteria andSzmcuIsNotNull() {
            addCriterion("SZMCU is not null");
            return (Criteria) this;
        }

        public Criteria andSzmcuEqualTo(String value) {
            addCriterion("SZMCU =", value, "szmcu");
            return (Criteria) this;
        }

        public Criteria andSzmcuNotEqualTo(String value) {
            addCriterion("SZMCU <>", value, "szmcu");
            return (Criteria) this;
        }

        public Criteria andSzmcuGreaterThan(String value) {
            addCriterion("SZMCU >", value, "szmcu");
            return (Criteria) this;
        }

        public Criteria andSzmcuGreaterThanOrEqualTo(String value) {
            addCriterion("SZMCU >=", value, "szmcu");
            return (Criteria) this;
        }

        public Criteria andSzmcuLessThan(String value) {
            addCriterion("SZMCU <", value, "szmcu");
            return (Criteria) this;
        }

        public Criteria andSzmcuLessThanOrEqualTo(String value) {
            addCriterion("SZMCU <=", value, "szmcu");
            return (Criteria) this;
        }

        public Criteria andSzmcuLike(String value) {
            addCriterion("SZMCU like", value, "szmcu");
            return (Criteria) this;
        }

        public Criteria andSzmcuNotLike(String value) {
            addCriterion("SZMCU not like", value, "szmcu");
            return (Criteria) this;
        }

        public Criteria andSzmcuIn(List<String> values) {
            addCriterion("SZMCU in", values, "szmcu");
            return (Criteria) this;
        }

        public Criteria andSzmcuNotIn(List<String> values) {
            addCriterion("SZMCU not in", values, "szmcu");
            return (Criteria) this;
        }

        public Criteria andSzmcuBetween(String value1, String value2) {
            addCriterion("SZMCU between", value1, value2, "szmcu");
            return (Criteria) this;
        }

        public Criteria andSzmcuNotBetween(String value1, String value2) {
            addCriterion("SZMCU not between", value1, value2, "szmcu");
            return (Criteria) this;
        }

        public Criteria andStmcuIsNull() {
            addCriterion("STMCU is null");
            return (Criteria) this;
        }

        public Criteria andStmcuIsNotNull() {
            addCriterion("STMCU is not null");
            return (Criteria) this;
        }

        public Criteria andStmcuEqualTo(String value) {
            addCriterion("STMCU =", value, "stmcu");
            return (Criteria) this;
        }

        public Criteria andStmcuNotEqualTo(String value) {
            addCriterion("STMCU <>", value, "stmcu");
            return (Criteria) this;
        }

        public Criteria andStmcuGreaterThan(String value) {
            addCriterion("STMCU >", value, "stmcu");
            return (Criteria) this;
        }

        public Criteria andStmcuGreaterThanOrEqualTo(String value) {
            addCriterion("STMCU >=", value, "stmcu");
            return (Criteria) this;
        }

        public Criteria andStmcuLessThan(String value) {
            addCriterion("STMCU <", value, "stmcu");
            return (Criteria) this;
        }

        public Criteria andStmcuLessThanOrEqualTo(String value) {
            addCriterion("STMCU <=", value, "stmcu");
            return (Criteria) this;
        }

        public Criteria andStmcuLike(String value) {
            addCriterion("STMCU like", value, "stmcu");
            return (Criteria) this;
        }

        public Criteria andStmcuNotLike(String value) {
            addCriterion("STMCU not like", value, "stmcu");
            return (Criteria) this;
        }

        public Criteria andStmcuIn(List<String> values) {
            addCriterion("STMCU in", values, "stmcu");
            return (Criteria) this;
        }

        public Criteria andStmcuNotIn(List<String> values) {
            addCriterion("STMCU not in", values, "stmcu");
            return (Criteria) this;
        }

        public Criteria andStmcuBetween(String value1, String value2) {
            addCriterion("STMCU between", value1, value2, "stmcu");
            return (Criteria) this;
        }

        public Criteria andStmcuNotBetween(String value1, String value2) {
            addCriterion("STMCU not between", value1, value2, "stmcu");
            return (Criteria) this;
        }

        public Criteria andSzcoIsNull() {
            addCriterion("SZCO is null");
            return (Criteria) this;
        }

        public Criteria andSzcoIsNotNull() {
            addCriterion("SZCO is not null");
            return (Criteria) this;
        }

        public Criteria andSzcoEqualTo(String value) {
            addCriterion("SZCO =", value, "szco");
            return (Criteria) this;
        }

        public Criteria andSzcoNotEqualTo(String value) {
            addCriterion("SZCO <>", value, "szco");
            return (Criteria) this;
        }

        public Criteria andSzcoGreaterThan(String value) {
            addCriterion("SZCO >", value, "szco");
            return (Criteria) this;
        }

        public Criteria andSzcoGreaterThanOrEqualTo(String value) {
            addCriterion("SZCO >=", value, "szco");
            return (Criteria) this;
        }

        public Criteria andSzcoLessThan(String value) {
            addCriterion("SZCO <", value, "szco");
            return (Criteria) this;
        }

        public Criteria andSzcoLessThanOrEqualTo(String value) {
            addCriterion("SZCO <=", value, "szco");
            return (Criteria) this;
        }

        public Criteria andSzcoLike(String value) {
            addCriterion("SZCO like", value, "szco");
            return (Criteria) this;
        }

        public Criteria andSzcoNotLike(String value) {
            addCriterion("SZCO not like", value, "szco");
            return (Criteria) this;
        }

        public Criteria andSzcoIn(List<String> values) {
            addCriterion("SZCO in", values, "szco");
            return (Criteria) this;
        }

        public Criteria andSzcoNotIn(List<String> values) {
            addCriterion("SZCO not in", values, "szco");
            return (Criteria) this;
        }

        public Criteria andSzcoBetween(String value1, String value2) {
            addCriterion("SZCO between", value1, value2, "szco");
            return (Criteria) this;
        }

        public Criteria andSzcoNotBetween(String value1, String value2) {
            addCriterion("SZCO not between", value1, value2, "szco");
            return (Criteria) this;
        }

        public Criteria andSzan8IsNull() {
            addCriterion("SZAN8 is null");
            return (Criteria) this;
        }

        public Criteria andSzan8IsNotNull() {
            addCriterion("SZAN8 is not null");
            return (Criteria) this;
        }

        public Criteria andSzan8EqualTo(Integer value) {
            addCriterion("SZAN8 =", value, "szan8");
            return (Criteria) this;
        }

        public Criteria andSzan8NotEqualTo(Integer value) {
            addCriterion("SZAN8 <>", value, "szan8");
            return (Criteria) this;
        }

        public Criteria andSzan8GreaterThan(Integer value) {
            addCriterion("SZAN8 >", value, "szan8");
            return (Criteria) this;
        }

        public Criteria andSzan8GreaterThanOrEqualTo(Integer value) {
            addCriterion("SZAN8 >=", value, "szan8");
            return (Criteria) this;
        }

        public Criteria andSzan8LessThan(Integer value) {
            addCriterion("SZAN8 <", value, "szan8");
            return (Criteria) this;
        }

        public Criteria andSzan8LessThanOrEqualTo(Integer value) {
            addCriterion("SZAN8 <=", value, "szan8");
            return (Criteria) this;
        }

        public Criteria andSzan8In(List<Integer> values) {
            addCriterion("SZAN8 in", values, "szan8");
            return (Criteria) this;
        }

        public Criteria andSzan8NotIn(List<Integer> values) {
            addCriterion("SZAN8 not in", values, "szan8");
            return (Criteria) this;
        }

        public Criteria andSzan8Between(Integer value1, Integer value2) {
            addCriterion("SZAN8 between", value1, value2, "szan8");
            return (Criteria) this;
        }

        public Criteria andSzan8NotBetween(Integer value1, Integer value2) {
            addCriterion("SZAN8 not between", value1, value2, "szan8");
            return (Criteria) this;
        }

        public Criteria andSzshanIsNull() {
            addCriterion("SZSHAN is null");
            return (Criteria) this;
        }

        public Criteria andSzshanIsNotNull() {
            addCriterion("SZSHAN is not null");
            return (Criteria) this;
        }

        public Criteria andSzshanEqualTo(Integer value) {
            addCriterion("SZSHAN =", value, "szshan");
            return (Criteria) this;
        }

        public Criteria andSzshanNotEqualTo(Integer value) {
            addCriterion("SZSHAN <>", value, "szshan");
            return (Criteria) this;
        }

        public Criteria andSzshanGreaterThan(Integer value) {
            addCriterion("SZSHAN >", value, "szshan");
            return (Criteria) this;
        }

        public Criteria andSzshanGreaterThanOrEqualTo(Integer value) {
            addCriterion("SZSHAN >=", value, "szshan");
            return (Criteria) this;
        }

        public Criteria andSzshanLessThan(Integer value) {
            addCriterion("SZSHAN <", value, "szshan");
            return (Criteria) this;
        }

        public Criteria andSzshanLessThanOrEqualTo(Integer value) {
            addCriterion("SZSHAN <=", value, "szshan");
            return (Criteria) this;
        }

        public Criteria andSzshanIn(List<Integer> values) {
            addCriterion("SZSHAN in", values, "szshan");
            return (Criteria) this;
        }

        public Criteria andSzshanNotIn(List<Integer> values) {
            addCriterion("SZSHAN not in", values, "szshan");
            return (Criteria) this;
        }

        public Criteria andSzshanBetween(Integer value1, Integer value2) {
            addCriterion("SZSHAN between", value1, value2, "szshan");
            return (Criteria) this;
        }

        public Criteria andSzshanNotBetween(Integer value1, Integer value2) {
            addCriterion("SZSHAN not between", value1, value2, "szshan");
            return (Criteria) this;
        }

        public Criteria andSztrdjIsNull() {
            addCriterion("SZTRDJ is null");
            return (Criteria) this;
        }

        public Criteria andSztrdjIsNotNull() {
            addCriterion("SZTRDJ is not null");
            return (Criteria) this;
        }

        public Criteria andSztrdjEqualTo(Integer value) {
            addCriterion("SZTRDJ =", value, "sztrdj");
            return (Criteria) this;
        }

        public Criteria andSztrdjNotEqualTo(Integer value) {
            addCriterion("SZTRDJ <>", value, "sztrdj");
            return (Criteria) this;
        }

        public Criteria andSztrdjGreaterThan(Integer value) {
            addCriterion("SZTRDJ >", value, "sztrdj");
            return (Criteria) this;
        }

        public Criteria andSztrdjGreaterThanOrEqualTo(Integer value) {
            addCriterion("SZTRDJ >=", value, "sztrdj");
            return (Criteria) this;
        }

        public Criteria andSztrdjLessThan(Integer value) {
            addCriterion("SZTRDJ <", value, "sztrdj");
            return (Criteria) this;
        }

        public Criteria andSztrdjLessThanOrEqualTo(Integer value) {
            addCriterion("SZTRDJ <=", value, "sztrdj");
            return (Criteria) this;
        }

        public Criteria andSztrdjIn(List<Integer> values) {
            addCriterion("SZTRDJ in", values, "sztrdj");
            return (Criteria) this;
        }

        public Criteria andSztrdjNotIn(List<Integer> values) {
            addCriterion("SZTRDJ not in", values, "sztrdj");
            return (Criteria) this;
        }

        public Criteria andSztrdjBetween(Integer value1, Integer value2) {
            addCriterion("SZTRDJ between", value1, value2, "sztrdj");
            return (Criteria) this;
        }

        public Criteria andSztrdjNotBetween(Integer value1, Integer value2) {
            addCriterion("SZTRDJ not between", value1, value2, "sztrdj");
            return (Criteria) this;
        }

        public Criteria andSzdrqjIsNull() {
            addCriterion("SZDRQJ is null");
            return (Criteria) this;
        }

        public Criteria andSzdrqjIsNotNull() {
            addCriterion("SZDRQJ is not null");
            return (Criteria) this;
        }

        public Criteria andSzdrqjEqualTo(Integer value) {
            addCriterion("SZDRQJ =", value, "szdrqj");
            return (Criteria) this;
        }

        public Criteria andSzdrqjNotEqualTo(Integer value) {
            addCriterion("SZDRQJ <>", value, "szdrqj");
            return (Criteria) this;
        }

        public Criteria andSzdrqjGreaterThan(Integer value) {
            addCriterion("SZDRQJ >", value, "szdrqj");
            return (Criteria) this;
        }

        public Criteria andSzdrqjGreaterThanOrEqualTo(Integer value) {
            addCriterion("SZDRQJ >=", value, "szdrqj");
            return (Criteria) this;
        }

        public Criteria andSzdrqjLessThan(Integer value) {
            addCriterion("SZDRQJ <", value, "szdrqj");
            return (Criteria) this;
        }

        public Criteria andSzdrqjLessThanOrEqualTo(Integer value) {
            addCriterion("SZDRQJ <=", value, "szdrqj");
            return (Criteria) this;
        }

        public Criteria andSzdrqjIn(List<Integer> values) {
            addCriterion("SZDRQJ in", values, "szdrqj");
            return (Criteria) this;
        }

        public Criteria andSzdrqjNotIn(List<Integer> values) {
            addCriterion("SZDRQJ not in", values, "szdrqj");
            return (Criteria) this;
        }

        public Criteria andSzdrqjBetween(Integer value1, Integer value2) {
            addCriterion("SZDRQJ between", value1, value2, "szdrqj");
            return (Criteria) this;
        }

        public Criteria andSzdrqjNotBetween(Integer value1, Integer value2) {
            addCriterion("SZDRQJ not between", value1, value2, "szdrqj");
            return (Criteria) this;
        }

        public Criteria andSzpddjIsNull() {
            addCriterion("SZPDDJ is null");
            return (Criteria) this;
        }

        public Criteria andSzpddjIsNotNull() {
            addCriterion("SZPDDJ is not null");
            return (Criteria) this;
        }

        public Criteria andSzpddjEqualTo(Integer value) {
            addCriterion("SZPDDJ =", value, "szpddj");
            return (Criteria) this;
        }

        public Criteria andSzpddjNotEqualTo(Integer value) {
            addCriterion("SZPDDJ <>", value, "szpddj");
            return (Criteria) this;
        }

        public Criteria andSzpddjGreaterThan(Integer value) {
            addCriterion("SZPDDJ >", value, "szpddj");
            return (Criteria) this;
        }

        public Criteria andSzpddjGreaterThanOrEqualTo(Integer value) {
            addCriterion("SZPDDJ >=", value, "szpddj");
            return (Criteria) this;
        }

        public Criteria andSzpddjLessThan(Integer value) {
            addCriterion("SZPDDJ <", value, "szpddj");
            return (Criteria) this;
        }

        public Criteria andSzpddjLessThanOrEqualTo(Integer value) {
            addCriterion("SZPDDJ <=", value, "szpddj");
            return (Criteria) this;
        }

        public Criteria andSzpddjIn(List<Integer> values) {
            addCriterion("SZPDDJ in", values, "szpddj");
            return (Criteria) this;
        }

        public Criteria andSzpddjNotIn(List<Integer> values) {
            addCriterion("SZPDDJ not in", values, "szpddj");
            return (Criteria) this;
        }

        public Criteria andSzpddjBetween(Integer value1, Integer value2) {
            addCriterion("SZPDDJ between", value1, value2, "szpddj");
            return (Criteria) this;
        }

        public Criteria andSzpddjNotBetween(Integer value1, Integer value2) {
            addCriterion("SZPDDJ not between", value1, value2, "szpddj");
            return (Criteria) this;
        }

        public Criteria andSzdrqtIsNull() {
            addCriterion("SZDRQT is null");
            return (Criteria) this;
        }

        public Criteria andSzdrqtIsNotNull() {
            addCriterion("SZDRQT is not null");
            return (Criteria) this;
        }

        public Criteria andSzdrqtEqualTo(Integer value) {
            addCriterion("SZDRQT =", value, "szdrqt");
            return (Criteria) this;
        }

        public Criteria andSzdrqtNotEqualTo(Integer value) {
            addCriterion("SZDRQT <>", value, "szdrqt");
            return (Criteria) this;
        }

        public Criteria andSzdrqtGreaterThan(Integer value) {
            addCriterion("SZDRQT >", value, "szdrqt");
            return (Criteria) this;
        }

        public Criteria andSzdrqtGreaterThanOrEqualTo(Integer value) {
            addCriterion("SZDRQT >=", value, "szdrqt");
            return (Criteria) this;
        }

        public Criteria andSzdrqtLessThan(Integer value) {
            addCriterion("SZDRQT <", value, "szdrqt");
            return (Criteria) this;
        }

        public Criteria andSzdrqtLessThanOrEqualTo(Integer value) {
            addCriterion("SZDRQT <=", value, "szdrqt");
            return (Criteria) this;
        }

        public Criteria andSzdrqtIn(List<Integer> values) {
            addCriterion("SZDRQT in", values, "szdrqt");
            return (Criteria) this;
        }

        public Criteria andSzdrqtNotIn(List<Integer> values) {
            addCriterion("SZDRQT not in", values, "szdrqt");
            return (Criteria) this;
        }

        public Criteria andSzdrqtBetween(Integer value1, Integer value2) {
            addCriterion("SZDRQT between", value1, value2, "szdrqt");
            return (Criteria) this;
        }

        public Criteria andSzdrqtNotBetween(Integer value1, Integer value2) {
            addCriterion("SZDRQT not between", value1, value2, "szdrqt");
            return (Criteria) this;
        }

        public Criteria andSzvr01IsNull() {
            addCriterion("SZVR01 is null");
            return (Criteria) this;
        }

        public Criteria andSzvr01IsNotNull() {
            addCriterion("SZVR01 is not null");
            return (Criteria) this;
        }

        public Criteria andSzvr01EqualTo(String value) {
            addCriterion("SZVR01 =", value, "szvr01");
            return (Criteria) this;
        }

        public Criteria andSzvr01NotEqualTo(String value) {
            addCriterion("SZVR01 <>", value, "szvr01");
            return (Criteria) this;
        }

        public Criteria andSzvr01GreaterThan(String value) {
            addCriterion("SZVR01 >", value, "szvr01");
            return (Criteria) this;
        }

        public Criteria andSzvr01GreaterThanOrEqualTo(String value) {
            addCriterion("SZVR01 >=", value, "szvr01");
            return (Criteria) this;
        }

        public Criteria andSzvr01LessThan(String value) {
            addCriterion("SZVR01 <", value, "szvr01");
            return (Criteria) this;
        }

        public Criteria andSzvr01LessThanOrEqualTo(String value) {
            addCriterion("SZVR01 <=", value, "szvr01");
            return (Criteria) this;
        }

        public Criteria andSzvr01Like(String value) {
            addCriterion("SZVR01 like", value, "szvr01");
            return (Criteria) this;
        }

        public Criteria andSzvr01NotLike(String value) {
            addCriterion("SZVR01 not like", value, "szvr01");
            return (Criteria) this;
        }

        public Criteria andSzvr01In(List<String> values) {
            addCriterion("SZVR01 in", values, "szvr01");
            return (Criteria) this;
        }

        public Criteria andSzvr01NotIn(List<String> values) {
            addCriterion("SZVR01 not in", values, "szvr01");
            return (Criteria) this;
        }

        public Criteria andSzvr01Between(String value1, String value2) {
            addCriterion("SZVR01 between", value1, value2, "szvr01");
            return (Criteria) this;
        }

        public Criteria andSzvr01NotBetween(String value1, String value2) {
            addCriterion("SZVR01 not between", value1, value2, "szvr01");
            return (Criteria) this;
        }

        public Criteria andSzvr02IsNull() {
            addCriterion("SZVR02 is null");
            return (Criteria) this;
        }

        public Criteria andSzvr02IsNotNull() {
            addCriterion("SZVR02 is not null");
            return (Criteria) this;
        }

        public Criteria andSzvr02EqualTo(String value) {
            addCriterion("SZVR02 =", value, "szvr02");
            return (Criteria) this;
        }

        public Criteria andSzvr02NotEqualTo(String value) {
            addCriterion("SZVR02 <>", value, "szvr02");
            return (Criteria) this;
        }

        public Criteria andSzvr02GreaterThan(String value) {
            addCriterion("SZVR02 >", value, "szvr02");
            return (Criteria) this;
        }

        public Criteria andSzvr02GreaterThanOrEqualTo(String value) {
            addCriterion("SZVR02 >=", value, "szvr02");
            return (Criteria) this;
        }

        public Criteria andSzvr02LessThan(String value) {
            addCriterion("SZVR02 <", value, "szvr02");
            return (Criteria) this;
        }

        public Criteria andSzvr02LessThanOrEqualTo(String value) {
            addCriterion("SZVR02 <=", value, "szvr02");
            return (Criteria) this;
        }

        public Criteria andSzvr02Like(String value) {
            addCriterion("SZVR02 like", value, "szvr02");
            return (Criteria) this;
        }

        public Criteria andSzvr02NotLike(String value) {
            addCriterion("SZVR02 not like", value, "szvr02");
            return (Criteria) this;
        }

        public Criteria andSzvr02In(List<String> values) {
            addCriterion("SZVR02 in", values, "szvr02");
            return (Criteria) this;
        }

        public Criteria andSzvr02NotIn(List<String> values) {
            addCriterion("SZVR02 not in", values, "szvr02");
            return (Criteria) this;
        }

        public Criteria andSzvr02Between(String value1, String value2) {
            addCriterion("SZVR02 between", value1, value2, "szvr02");
            return (Criteria) this;
        }

        public Criteria andSzvr02NotBetween(String value1, String value2) {
            addCriterion("SZVR02 not between", value1, value2, "szvr02");
            return (Criteria) this;
        }

        public Criteria andSzglcIsNull() {
            addCriterion("SZGLC is null");
            return (Criteria) this;
        }

        public Criteria andSzglcIsNotNull() {
            addCriterion("SZGLC is not null");
            return (Criteria) this;
        }

        public Criteria andSzglcEqualTo(String value) {
            addCriterion("SZGLC =", value, "szglc");
            return (Criteria) this;
        }

        public Criteria andSzglcNotEqualTo(String value) {
            addCriterion("SZGLC <>", value, "szglc");
            return (Criteria) this;
        }

        public Criteria andSzglcGreaterThan(String value) {
            addCriterion("SZGLC >", value, "szglc");
            return (Criteria) this;
        }

        public Criteria andSzglcGreaterThanOrEqualTo(String value) {
            addCriterion("SZGLC >=", value, "szglc");
            return (Criteria) this;
        }

        public Criteria andSzglcLessThan(String value) {
            addCriterion("SZGLC <", value, "szglc");
            return (Criteria) this;
        }

        public Criteria andSzglcLessThanOrEqualTo(String value) {
            addCriterion("SZGLC <=", value, "szglc");
            return (Criteria) this;
        }

        public Criteria andSzglcLike(String value) {
            addCriterion("SZGLC like", value, "szglc");
            return (Criteria) this;
        }

        public Criteria andSzglcNotLike(String value) {
            addCriterion("SZGLC not like", value, "szglc");
            return (Criteria) this;
        }

        public Criteria andSzglcIn(List<String> values) {
            addCriterion("SZGLC in", values, "szglc");
            return (Criteria) this;
        }

        public Criteria andSzglcNotIn(List<String> values) {
            addCriterion("SZGLC not in", values, "szglc");
            return (Criteria) this;
        }

        public Criteria andSzglcBetween(String value1, String value2) {
            addCriterion("SZGLC between", value1, value2, "szglc");
            return (Criteria) this;
        }

        public Criteria andSzglcNotBetween(String value1, String value2) {
            addCriterion("SZGLC not between", value1, value2, "szglc");
            return (Criteria) this;
        }

        public Criteria andSzurcdIsNull() {
            addCriterion("SZURCD is null");
            return (Criteria) this;
        }

        public Criteria andSzurcdIsNotNull() {
            addCriterion("SZURCD is not null");
            return (Criteria) this;
        }

        public Criteria andSzurcdEqualTo(String value) {
            addCriterion("SZURCD =", value, "szurcd");
            return (Criteria) this;
        }

        public Criteria andSzurcdNotEqualTo(String value) {
            addCriterion("SZURCD <>", value, "szurcd");
            return (Criteria) this;
        }

        public Criteria andSzurcdGreaterThan(String value) {
            addCriterion("SZURCD >", value, "szurcd");
            return (Criteria) this;
        }

        public Criteria andSzurcdGreaterThanOrEqualTo(String value) {
            addCriterion("SZURCD >=", value, "szurcd");
            return (Criteria) this;
        }

        public Criteria andSzurcdLessThan(String value) {
            addCriterion("SZURCD <", value, "szurcd");
            return (Criteria) this;
        }

        public Criteria andSzurcdLessThanOrEqualTo(String value) {
            addCriterion("SZURCD <=", value, "szurcd");
            return (Criteria) this;
        }

        public Criteria andSzurcdLike(String value) {
            addCriterion("SZURCD like", value, "szurcd");
            return (Criteria) this;
        }

        public Criteria andSzurcdNotLike(String value) {
            addCriterion("SZURCD not like", value, "szurcd");
            return (Criteria) this;
        }

        public Criteria andSzurcdIn(List<String> values) {
            addCriterion("SZURCD in", values, "szurcd");
            return (Criteria) this;
        }

        public Criteria andSzurcdNotIn(List<String> values) {
            addCriterion("SZURCD not in", values, "szurcd");
            return (Criteria) this;
        }

        public Criteria andSzurcdBetween(String value1, String value2) {
            addCriterion("SZURCD between", value1, value2, "szurcd");
            return (Criteria) this;
        }

        public Criteria andSzurcdNotBetween(String value1, String value2) {
            addCriterion("SZURCD not between", value1, value2, "szurcd");
            return (Criteria) this;
        }

        public Criteria andSzurdtIsNull() {
            addCriterion("SZURDT is null");
            return (Criteria) this;
        }

        public Criteria andSzurdtIsNotNull() {
            addCriterion("SZURDT is not null");
            return (Criteria) this;
        }

        public Criteria andSzurdtEqualTo(Integer value) {
            addCriterion("SZURDT =", value, "szurdt");
            return (Criteria) this;
        }

        public Criteria andSzurdtNotEqualTo(Integer value) {
            addCriterion("SZURDT <>", value, "szurdt");
            return (Criteria) this;
        }

        public Criteria andSzurdtGreaterThan(Integer value) {
            addCriterion("SZURDT >", value, "szurdt");
            return (Criteria) this;
        }

        public Criteria andSzurdtGreaterThanOrEqualTo(Integer value) {
            addCriterion("SZURDT >=", value, "szurdt");
            return (Criteria) this;
        }

        public Criteria andSzurdtLessThan(Integer value) {
            addCriterion("SZURDT <", value, "szurdt");
            return (Criteria) this;
        }

        public Criteria andSzurdtLessThanOrEqualTo(Integer value) {
            addCriterion("SZURDT <=", value, "szurdt");
            return (Criteria) this;
        }

        public Criteria andSzurdtIn(List<Integer> values) {
            addCriterion("SZURDT in", values, "szurdt");
            return (Criteria) this;
        }

        public Criteria andSzurdtNotIn(List<Integer> values) {
            addCriterion("SZURDT not in", values, "szurdt");
            return (Criteria) this;
        }

        public Criteria andSzurdtBetween(Integer value1, Integer value2) {
            addCriterion("SZURDT between", value1, value2, "szurdt");
            return (Criteria) this;
        }

        public Criteria andSzurdtNotBetween(Integer value1, Integer value2) {
            addCriterion("SZURDT not between", value1, value2, "szurdt");
            return (Criteria) this;
        }

        public Criteria andSzuratIsNull() {
            addCriterion("SZURAT is null");
            return (Criteria) this;
        }

        public Criteria andSzuratIsNotNull() {
            addCriterion("SZURAT is not null");
            return (Criteria) this;
        }

        public Criteria andSzuratEqualTo(BigDecimal value) {
            addCriterion("SZURAT =", value, "szurat");
            return (Criteria) this;
        }

        public Criteria andSzuratNotEqualTo(BigDecimal value) {
            addCriterion("SZURAT <>", value, "szurat");
            return (Criteria) this;
        }

        public Criteria andSzuratGreaterThan(BigDecimal value) {
            addCriterion("SZURAT >", value, "szurat");
            return (Criteria) this;
        }

        public Criteria andSzuratGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SZURAT >=", value, "szurat");
            return (Criteria) this;
        }

        public Criteria andSzuratLessThan(BigDecimal value) {
            addCriterion("SZURAT <", value, "szurat");
            return (Criteria) this;
        }

        public Criteria andSzuratLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SZURAT <=", value, "szurat");
            return (Criteria) this;
        }

        public Criteria andSzuratIn(List<BigDecimal> values) {
            addCriterion("SZURAT in", values, "szurat");
            return (Criteria) this;
        }

        public Criteria andSzuratNotIn(List<BigDecimal> values) {
            addCriterion("SZURAT not in", values, "szurat");
            return (Criteria) this;
        }

        public Criteria andSzuratBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SZURAT between", value1, value2, "szurat");
            return (Criteria) this;
        }

        public Criteria andSzuratNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SZURAT not between", value1, value2, "szurat");
            return (Criteria) this;
        }

        public Criteria andSzurabIsNull() {
            addCriterion("SZURAB is null");
            return (Criteria) this;
        }

        public Criteria andSzurabIsNotNull() {
            addCriterion("SZURAB is not null");
            return (Criteria) this;
        }

        public Criteria andSzurabEqualTo(Integer value) {
            addCriterion("SZURAB =", value, "szurab");
            return (Criteria) this;
        }

        public Criteria andSzurabNotEqualTo(Integer value) {
            addCriterion("SZURAB <>", value, "szurab");
            return (Criteria) this;
        }

        public Criteria andSzurabGreaterThan(Integer value) {
            addCriterion("SZURAB >", value, "szurab");
            return (Criteria) this;
        }

        public Criteria andSzurabGreaterThanOrEqualTo(Integer value) {
            addCriterion("SZURAB >=", value, "szurab");
            return (Criteria) this;
        }

        public Criteria andSzurabLessThan(Integer value) {
            addCriterion("SZURAB <", value, "szurab");
            return (Criteria) this;
        }

        public Criteria andSzurabLessThanOrEqualTo(Integer value) {
            addCriterion("SZURAB <=", value, "szurab");
            return (Criteria) this;
        }

        public Criteria andSzurabIn(List<Integer> values) {
            addCriterion("SZURAB in", values, "szurab");
            return (Criteria) this;
        }

        public Criteria andSzurabNotIn(List<Integer> values) {
            addCriterion("SZURAB not in", values, "szurab");
            return (Criteria) this;
        }

        public Criteria andSzurabBetween(Integer value1, Integer value2) {
            addCriterion("SZURAB between", value1, value2, "szurab");
            return (Criteria) this;
        }

        public Criteria andSzurabNotBetween(Integer value1, Integer value2) {
            addCriterion("SZURAB not between", value1, value2, "szurab");
            return (Criteria) this;
        }

        public Criteria andSzurrfIsNull() {
            addCriterion("SZURRF is null");
            return (Criteria) this;
        }

        public Criteria andSzurrfIsNotNull() {
            addCriterion("SZURRF is not null");
            return (Criteria) this;
        }

        public Criteria andSzurrfEqualTo(String value) {
            addCriterion("SZURRF =", value, "szurrf");
            return (Criteria) this;
        }

        public Criteria andSzurrfNotEqualTo(String value) {
            addCriterion("SZURRF <>", value, "szurrf");
            return (Criteria) this;
        }

        public Criteria andSzurrfGreaterThan(String value) {
            addCriterion("SZURRF >", value, "szurrf");
            return (Criteria) this;
        }

        public Criteria andSzurrfGreaterThanOrEqualTo(String value) {
            addCriterion("SZURRF >=", value, "szurrf");
            return (Criteria) this;
        }

        public Criteria andSzurrfLessThan(String value) {
            addCriterion("SZURRF <", value, "szurrf");
            return (Criteria) this;
        }

        public Criteria andSzurrfLessThanOrEqualTo(String value) {
            addCriterion("SZURRF <=", value, "szurrf");
            return (Criteria) this;
        }

        public Criteria andSzurrfLike(String value) {
            addCriterion("SZURRF like", value, "szurrf");
            return (Criteria) this;
        }

        public Criteria andSzurrfNotLike(String value) {
            addCriterion("SZURRF not like", value, "szurrf");
            return (Criteria) this;
        }

        public Criteria andSzurrfIn(List<String> values) {
            addCriterion("SZURRF in", values, "szurrf");
            return (Criteria) this;
        }

        public Criteria andSzurrfNotIn(List<String> values) {
            addCriterion("SZURRF not in", values, "szurrf");
            return (Criteria) this;
        }

        public Criteria andSzurrfBetween(String value1, String value2) {
            addCriterion("SZURRF between", value1, value2, "szurrf");
            return (Criteria) this;
        }

        public Criteria andSzurrfNotBetween(String value1, String value2) {
            addCriterion("SZURRF not between", value1, value2, "szurrf");
            return (Criteria) this;
        }

        public Criteria andSzasnIsNull() {
            addCriterion("SZASN is null");
            return (Criteria) this;
        }

        public Criteria andSzasnIsNotNull() {
            addCriterion("SZASN is not null");
            return (Criteria) this;
        }

        public Criteria andSzasnEqualTo(String value) {
            addCriterion("SZASN =", value, "szasn");
            return (Criteria) this;
        }

        public Criteria andSzasnNotEqualTo(String value) {
            addCriterion("SZASN <>", value, "szasn");
            return (Criteria) this;
        }

        public Criteria andSzasnGreaterThan(String value) {
            addCriterion("SZASN >", value, "szasn");
            return (Criteria) this;
        }

        public Criteria andSzasnGreaterThanOrEqualTo(String value) {
            addCriterion("SZASN >=", value, "szasn");
            return (Criteria) this;
        }

        public Criteria andSzasnLessThan(String value) {
            addCriterion("SZASN <", value, "szasn");
            return (Criteria) this;
        }

        public Criteria andSzasnLessThanOrEqualTo(String value) {
            addCriterion("SZASN <=", value, "szasn");
            return (Criteria) this;
        }

        public Criteria andSzasnLike(String value) {
            addCriterion("SZASN like", value, "szasn");
            return (Criteria) this;
        }

        public Criteria andSzasnNotLike(String value) {
            addCriterion("SZASN not like", value, "szasn");
            return (Criteria) this;
        }

        public Criteria andSzasnIn(List<String> values) {
            addCriterion("SZASN in", values, "szasn");
            return (Criteria) this;
        }

        public Criteria andSzasnNotIn(List<String> values) {
            addCriterion("SZASN not in", values, "szasn");
            return (Criteria) this;
        }

        public Criteria andSzasnBetween(String value1, String value2) {
            addCriterion("SZASN between", value1, value2, "szasn");
            return (Criteria) this;
        }

        public Criteria andSzasnNotBetween(String value1, String value2) {
            addCriterion("SZASN not between", value1, value2, "szasn");
            return (Criteria) this;
        }

        public Criteria andSzeuseIsNull() {
            addCriterion("SZEUSE is null");
            return (Criteria) this;
        }

        public Criteria andSzeuseIsNotNull() {
            addCriterion("SZEUSE is not null");
            return (Criteria) this;
        }

        public Criteria andSzeuseEqualTo(String value) {
            addCriterion("SZEUSE =", value, "szeuse");
            return (Criteria) this;
        }

        public Criteria andSzeuseNotEqualTo(String value) {
            addCriterion("SZEUSE <>", value, "szeuse");
            return (Criteria) this;
        }

        public Criteria andSzeuseGreaterThan(String value) {
            addCriterion("SZEUSE >", value, "szeuse");
            return (Criteria) this;
        }

        public Criteria andSzeuseGreaterThanOrEqualTo(String value) {
            addCriterion("SZEUSE >=", value, "szeuse");
            return (Criteria) this;
        }

        public Criteria andSzeuseLessThan(String value) {
            addCriterion("SZEUSE <", value, "szeuse");
            return (Criteria) this;
        }

        public Criteria andSzeuseLessThanOrEqualTo(String value) {
            addCriterion("SZEUSE <=", value, "szeuse");
            return (Criteria) this;
        }

        public Criteria andSzeuseLike(String value) {
            addCriterion("SZEUSE like", value, "szeuse");
            return (Criteria) this;
        }

        public Criteria andSzeuseNotLike(String value) {
            addCriterion("SZEUSE not like", value, "szeuse");
            return (Criteria) this;
        }

        public Criteria andSzeuseIn(List<String> values) {
            addCriterion("SZEUSE in", values, "szeuse");
            return (Criteria) this;
        }

        public Criteria andSzeuseNotIn(List<String> values) {
            addCriterion("SZEUSE not in", values, "szeuse");
            return (Criteria) this;
        }

        public Criteria andSzeuseBetween(String value1, String value2) {
            addCriterion("SZEUSE between", value1, value2, "szeuse");
            return (Criteria) this;
        }

        public Criteria andSzeuseNotBetween(String value1, String value2) {
            addCriterion("SZEUSE not between", value1, value2, "szeuse");
            return (Criteria) this;
        }

        public Criteria andSzlitmIsNull() {
            addCriterion("SZLITM is null");
            return (Criteria) this;
        }

        public Criteria andSzlitmIsNotNull() {
            addCriterion("SZLITM is not null");
            return (Criteria) this;
        }

        public Criteria andSzlitmEqualTo(String value) {
            addCriterion("SZLITM =", value, "szlitm");
            return (Criteria) this;
        }

        public Criteria andSzlitmNotEqualTo(String value) {
            addCriterion("SZLITM <>", value, "szlitm");
            return (Criteria) this;
        }

        public Criteria andSzlitmGreaterThan(String value) {
            addCriterion("SZLITM >", value, "szlitm");
            return (Criteria) this;
        }

        public Criteria andSzlitmGreaterThanOrEqualTo(String value) {
            addCriterion("SZLITM >=", value, "szlitm");
            return (Criteria) this;
        }

        public Criteria andSzlitmLessThan(String value) {
            addCriterion("SZLITM <", value, "szlitm");
            return (Criteria) this;
        }

        public Criteria andSzlitmLessThanOrEqualTo(String value) {
            addCriterion("SZLITM <=", value, "szlitm");
            return (Criteria) this;
        }

        public Criteria andSzlitmLike(String value) {
            addCriterion("SZLITM like", value, "szlitm");
            return (Criteria) this;
        }

        public Criteria andSzlitmNotLike(String value) {
            addCriterion("SZLITM not like", value, "szlitm");
            return (Criteria) this;
        }

        public Criteria andSzlitmIn(List<String> values) {
            addCriterion("SZLITM in", values, "szlitm");
            return (Criteria) this;
        }

        public Criteria andSzlitmNotIn(List<String> values) {
            addCriterion("SZLITM not in", values, "szlitm");
            return (Criteria) this;
        }

        public Criteria andSzlitmBetween(String value1, String value2) {
            addCriterion("SZLITM between", value1, value2, "szlitm");
            return (Criteria) this;
        }

        public Criteria andSzlitmNotBetween(String value1, String value2) {
            addCriterion("SZLITM not between", value1, value2, "szlitm");
            return (Criteria) this;
        }

        public Criteria andSzprovIsNull() {
            addCriterion("SZPROV is null");
            return (Criteria) this;
        }

        public Criteria andSzprovIsNotNull() {
            addCriterion("SZPROV is not null");
            return (Criteria) this;
        }

        public Criteria andSzprovEqualTo(String value) {
            addCriterion("SZPROV =", value, "szprov");
            return (Criteria) this;
        }

        public Criteria andSzprovNotEqualTo(String value) {
            addCriterion("SZPROV <>", value, "szprov");
            return (Criteria) this;
        }

        public Criteria andSzprovGreaterThan(String value) {
            addCriterion("SZPROV >", value, "szprov");
            return (Criteria) this;
        }

        public Criteria andSzprovGreaterThanOrEqualTo(String value) {
            addCriterion("SZPROV >=", value, "szprov");
            return (Criteria) this;
        }

        public Criteria andSzprovLessThan(String value) {
            addCriterion("SZPROV <", value, "szprov");
            return (Criteria) this;
        }

        public Criteria andSzprovLessThanOrEqualTo(String value) {
            addCriterion("SZPROV <=", value, "szprov");
            return (Criteria) this;
        }

        public Criteria andSzprovLike(String value) {
            addCriterion("SZPROV like", value, "szprov");
            return (Criteria) this;
        }

        public Criteria andSzprovNotLike(String value) {
            addCriterion("SZPROV not like", value, "szprov");
            return (Criteria) this;
        }

        public Criteria andSzprovIn(List<String> values) {
            addCriterion("SZPROV in", values, "szprov");
            return (Criteria) this;
        }

        public Criteria andSzprovNotIn(List<String> values) {
            addCriterion("SZPROV not in", values, "szprov");
            return (Criteria) this;
        }

        public Criteria andSzprovBetween(String value1, String value2) {
            addCriterion("SZPROV between", value1, value2, "szprov");
            return (Criteria) this;
        }

        public Criteria andSzprovNotBetween(String value1, String value2) {
            addCriterion("SZPROV not between", value1, value2, "szprov");
            return (Criteria) this;
        }

        public Criteria andSzuprcIsNull() {
            addCriterion("SZUPRC is null");
            return (Criteria) this;
        }

        public Criteria andSzuprcIsNotNull() {
            addCriterion("SZUPRC is not null");
            return (Criteria) this;
        }

        public Criteria andSzuprcEqualTo(BigDecimal value) {
            addCriterion("SZUPRC =", value, "szuprc");
            return (Criteria) this;
        }

        public Criteria andSzuprcNotEqualTo(BigDecimal value) {
            addCriterion("SZUPRC <>", value, "szuprc");
            return (Criteria) this;
        }

        public Criteria andSzuprcGreaterThan(BigDecimal value) {
            addCriterion("SZUPRC >", value, "szuprc");
            return (Criteria) this;
        }

        public Criteria andSzuprcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SZUPRC >=", value, "szuprc");
            return (Criteria) this;
        }

        public Criteria andSzuprcLessThan(BigDecimal value) {
            addCriterion("SZUPRC <", value, "szuprc");
            return (Criteria) this;
        }

        public Criteria andSzuprcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SZUPRC <=", value, "szuprc");
            return (Criteria) this;
        }

        public Criteria andSzuprcIn(List<BigDecimal> values) {
            addCriterion("SZUPRC in", values, "szuprc");
            return (Criteria) this;
        }

        public Criteria andSzuprcNotIn(List<BigDecimal> values) {
            addCriterion("SZUPRC not in", values, "szuprc");
            return (Criteria) this;
        }

        public Criteria andSzuprcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SZUPRC between", value1, value2, "szuprc");
            return (Criteria) this;
        }

        public Criteria andSzuprcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SZUPRC not between", value1, value2, "szuprc");
            return (Criteria) this;
        }

        public Criteria andSzaexpIsNull() {
            addCriterion("SZAEXP is null");
            return (Criteria) this;
        }

        public Criteria andSzaexpIsNotNull() {
            addCriterion("SZAEXP is not null");
            return (Criteria) this;
        }

        public Criteria andSzaexpEqualTo(BigDecimal value) {
            addCriterion("SZAEXP =", value, "szaexp");
            return (Criteria) this;
        }

        public Criteria andSzaexpNotEqualTo(BigDecimal value) {
            addCriterion("SZAEXP <>", value, "szaexp");
            return (Criteria) this;
        }

        public Criteria andSzaexpGreaterThan(BigDecimal value) {
            addCriterion("SZAEXP >", value, "szaexp");
            return (Criteria) this;
        }

        public Criteria andSzaexpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SZAEXP >=", value, "szaexp");
            return (Criteria) this;
        }

        public Criteria andSzaexpLessThan(BigDecimal value) {
            addCriterion("SZAEXP <", value, "szaexp");
            return (Criteria) this;
        }

        public Criteria andSzaexpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SZAEXP <=", value, "szaexp");
            return (Criteria) this;
        }

        public Criteria andSzaexpIn(List<BigDecimal> values) {
            addCriterion("SZAEXP in", values, "szaexp");
            return (Criteria) this;
        }

        public Criteria andSzaexpNotIn(List<BigDecimal> values) {
            addCriterion("SZAEXP not in", values, "szaexp");
            return (Criteria) this;
        }

        public Criteria andSzaexpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SZAEXP between", value1, value2, "szaexp");
            return (Criteria) this;
        }

        public Criteria andSzaexpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SZAEXP not between", value1, value2, "szaexp");
            return (Criteria) this;
        }

        public Criteria andSzuorgIsNull() {
            addCriterion("SZUORG is null");
            return (Criteria) this;
        }

        public Criteria andSzuorgIsNotNull() {
            addCriterion("SZUORG is not null");
            return (Criteria) this;
        }

        public Criteria andSzuorgEqualTo(BigDecimal value) {
            addCriterion("SZUORG =", value, "szuorg");
            return (Criteria) this;
        }

        public Criteria andSzuorgNotEqualTo(BigDecimal value) {
            addCriterion("SZUORG <>", value, "szuorg");
            return (Criteria) this;
        }

        public Criteria andSzuorgGreaterThan(BigDecimal value) {
            addCriterion("SZUORG >", value, "szuorg");
            return (Criteria) this;
        }

        public Criteria andSzuorgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SZUORG >=", value, "szuorg");
            return (Criteria) this;
        }

        public Criteria andSzuorgLessThan(BigDecimal value) {
            addCriterion("SZUORG <", value, "szuorg");
            return (Criteria) this;
        }

        public Criteria andSzuorgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SZUORG <=", value, "szuorg");
            return (Criteria) this;
        }

        public Criteria andSzuorgIn(List<BigDecimal> values) {
            addCriterion("SZUORG in", values, "szuorg");
            return (Criteria) this;
        }

        public Criteria andSzuorgNotIn(List<BigDecimal> values) {
            addCriterion("SZUORG not in", values, "szuorg");
            return (Criteria) this;
        }

        public Criteria andSzuorgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SZUORG between", value1, value2, "szuorg");
            return (Criteria) this;
        }

        public Criteria andSzuorgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SZUORG not between", value1, value2, "szuorg");
            return (Criteria) this;
        }

        public Criteria andSzrcdIsNull() {
            addCriterion("SZRCD is null");
            return (Criteria) this;
        }

        public Criteria andSzrcdIsNotNull() {
            addCriterion("SZRCD is not null");
            return (Criteria) this;
        }

        public Criteria andSzrcdEqualTo(String value) {
            addCriterion("SZRCD =", value, "szrcd");
            return (Criteria) this;
        }

        public Criteria andSzrcdNotEqualTo(String value) {
            addCriterion("SZRCD <>", value, "szrcd");
            return (Criteria) this;
        }

        public Criteria andSzrcdGreaterThan(String value) {
            addCriterion("SZRCD >", value, "szrcd");
            return (Criteria) this;
        }

        public Criteria andSzrcdGreaterThanOrEqualTo(String value) {
            addCriterion("SZRCD >=", value, "szrcd");
            return (Criteria) this;
        }

        public Criteria andSzrcdLessThan(String value) {
            addCriterion("SZRCD <", value, "szrcd");
            return (Criteria) this;
        }

        public Criteria andSzrcdLessThanOrEqualTo(String value) {
            addCriterion("SZRCD <=", value, "szrcd");
            return (Criteria) this;
        }

        public Criteria andSzrcdLike(String value) {
            addCriterion("SZRCD like", value, "szrcd");
            return (Criteria) this;
        }

        public Criteria andSzrcdNotLike(String value) {
            addCriterion("SZRCD not like", value, "szrcd");
            return (Criteria) this;
        }

        public Criteria andSzrcdIn(List<String> values) {
            addCriterion("SZRCD in", values, "szrcd");
            return (Criteria) this;
        }

        public Criteria andSzrcdNotIn(List<String> values) {
            addCriterion("SZRCD not in", values, "szrcd");
            return (Criteria) this;
        }

        public Criteria andSzrcdBetween(String value1, String value2) {
            addCriterion("SZRCD between", value1, value2, "szrcd");
            return (Criteria) this;
        }

        public Criteria andSzrcdNotBetween(String value1, String value2) {
            addCriterion("SZRCD not between", value1, value2, "szrcd");
            return (Criteria) this;
        }

        public Criteria andSzuomIsNull() {
            addCriterion("SZUOM is null");
            return (Criteria) this;
        }

        public Criteria andSzuomIsNotNull() {
            addCriterion("SZUOM is not null");
            return (Criteria) this;
        }

        public Criteria andSzuomEqualTo(String value) {
            addCriterion("SZUOM =", value, "szuom");
            return (Criteria) this;
        }

        public Criteria andSzuomNotEqualTo(String value) {
            addCriterion("SZUOM <>", value, "szuom");
            return (Criteria) this;
        }

        public Criteria andSzuomGreaterThan(String value) {
            addCriterion("SZUOM >", value, "szuom");
            return (Criteria) this;
        }

        public Criteria andSzuomGreaterThanOrEqualTo(String value) {
            addCriterion("SZUOM >=", value, "szuom");
            return (Criteria) this;
        }

        public Criteria andSzuomLessThan(String value) {
            addCriterion("SZUOM <", value, "szuom");
            return (Criteria) this;
        }

        public Criteria andSzuomLessThanOrEqualTo(String value) {
            addCriterion("SZUOM <=", value, "szuom");
            return (Criteria) this;
        }

        public Criteria andSzuomLike(String value) {
            addCriterion("SZUOM like", value, "szuom");
            return (Criteria) this;
        }

        public Criteria andSzuomNotLike(String value) {
            addCriterion("SZUOM not like", value, "szuom");
            return (Criteria) this;
        }

        public Criteria andSzuomIn(List<String> values) {
            addCriterion("SZUOM in", values, "szuom");
            return (Criteria) this;
        }

        public Criteria andSzuomNotIn(List<String> values) {
            addCriterion("SZUOM not in", values, "szuom");
            return (Criteria) this;
        }

        public Criteria andSzuomBetween(String value1, String value2) {
            addCriterion("SZUOM between", value1, value2, "szuom");
            return (Criteria) this;
        }

        public Criteria andSzuomNotBetween(String value1, String value2) {
            addCriterion("SZUOM not between", value1, value2, "szuom");
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

        public Criteria andSzdocoIsNull() {
            addCriterion("SZDOCO is null");
            return (Criteria) this;
        }

        public Criteria andSzdocoIsNotNull() {
            addCriterion("SZDOCO is not null");
            return (Criteria) this;
        }

        public Criteria andSzdocoEqualTo(Long value) {
            addCriterion("SZDOCO =", value, "szdoco");
            return (Criteria) this;
        }

        public Criteria andSzdocoNotEqualTo(Long value) {
            addCriterion("SZDOCO <>", value, "szdoco");
            return (Criteria) this;
        }

        public Criteria andSzdocoGreaterThan(Long value) {
            addCriterion("SZDOCO >", value, "szdoco");
            return (Criteria) this;
        }

        public Criteria andSzdocoGreaterThanOrEqualTo(Long value) {
            addCriterion("SZDOCO >=", value, "szdoco");
            return (Criteria) this;
        }

        public Criteria andSzdocoLessThan(Long value) {
            addCriterion("SZDOCO <", value, "szdoco");
            return (Criteria) this;
        }

        public Criteria andSzdocoLessThanOrEqualTo(Long value) {
            addCriterion("SZDOCO <=", value, "szdoco");
            return (Criteria) this;
        }

        public Criteria andSzdocoIn(List<Long> values) {
            addCriterion("SZDOCO in", values, "szdoco");
            return (Criteria) this;
        }

        public Criteria andSzdocoNotIn(List<Long> values) {
            addCriterion("SZDOCO not in", values, "szdoco");
            return (Criteria) this;
        }

        public Criteria andSzdocoBetween(Long value1, Long value2) {
            addCriterion("SZDOCO between", value1, value2, "szdoco");
            return (Criteria) this;
        }

        public Criteria andSzdocoNotBetween(Long value1, Long value2) {
            addCriterion("SZDOCO not between", value1, value2, "szdoco");
            return (Criteria) this;
        }

        public Criteria andSzederIsNull() {
            addCriterion("SZEDER is null");
            return (Criteria) this;
        }

        public Criteria andSzederIsNotNull() {
            addCriterion("SZEDER is not null");
            return (Criteria) this;
        }

        public Criteria andSzederEqualTo(String value) {
            addCriterion("SZEDER =", value, "szeder");
            return (Criteria) this;
        }

        public Criteria andSzederNotEqualTo(String value) {
            addCriterion("SZEDER <>", value, "szeder");
            return (Criteria) this;
        }

        public Criteria andSzederGreaterThan(String value) {
            addCriterion("SZEDER >", value, "szeder");
            return (Criteria) this;
        }

        public Criteria andSzederGreaterThanOrEqualTo(String value) {
            addCriterion("SZEDER >=", value, "szeder");
            return (Criteria) this;
        }

        public Criteria andSzederLessThan(String value) {
            addCriterion("SZEDER <", value, "szeder");
            return (Criteria) this;
        }

        public Criteria andSzederLessThanOrEqualTo(String value) {
            addCriterion("SZEDER <=", value, "szeder");
            return (Criteria) this;
        }

        public Criteria andSzederLike(String value) {
            addCriterion("SZEDER like", value, "szeder");
            return (Criteria) this;
        }

        public Criteria andSzederNotLike(String value) {
            addCriterion("SZEDER not like", value, "szeder");
            return (Criteria) this;
        }

        public Criteria andSzederIn(List<String> values) {
            addCriterion("SZEDER in", values, "szeder");
            return (Criteria) this;
        }

        public Criteria andSzederNotIn(List<String> values) {
            addCriterion("SZEDER not in", values, "szeder");
            return (Criteria) this;
        }

        public Criteria andSzederBetween(String value1, String value2) {
            addCriterion("SZEDER between", value1, value2, "szeder");
            return (Criteria) this;
        }

        public Criteria andSzederNotBetween(String value1, String value2) {
            addCriterion("SZEDER not between", value1, value2, "szeder");
            return (Criteria) this;
        }

        public Criteria andSzedstIsNull() {
            addCriterion("SZEDST is null");
            return (Criteria) this;
        }

        public Criteria andSzedstIsNotNull() {
            addCriterion("SZEDST is not null");
            return (Criteria) this;
        }

        public Criteria andSzedstEqualTo(String value) {
            addCriterion("SZEDST =", value, "szedst");
            return (Criteria) this;
        }

        public Criteria andSzedstNotEqualTo(String value) {
            addCriterion("SZEDST <>", value, "szedst");
            return (Criteria) this;
        }

        public Criteria andSzedstGreaterThan(String value) {
            addCriterion("SZEDST >", value, "szedst");
            return (Criteria) this;
        }

        public Criteria andSzedstGreaterThanOrEqualTo(String value) {
            addCriterion("SZEDST >=", value, "szedst");
            return (Criteria) this;
        }

        public Criteria andSzedstLessThan(String value) {
            addCriterion("SZEDST <", value, "szedst");
            return (Criteria) this;
        }

        public Criteria andSzedstLessThanOrEqualTo(String value) {
            addCriterion("SZEDST <=", value, "szedst");
            return (Criteria) this;
        }

        public Criteria andSzedstLike(String value) {
            addCriterion("SZEDST like", value, "szedst");
            return (Criteria) this;
        }

        public Criteria andSzedstNotLike(String value) {
            addCriterion("SZEDST not like", value, "szedst");
            return (Criteria) this;
        }

        public Criteria andSzedstIn(List<String> values) {
            addCriterion("SZEDST in", values, "szedst");
            return (Criteria) this;
        }

        public Criteria andSzedstNotIn(List<String> values) {
            addCriterion("SZEDST not in", values, "szedst");
            return (Criteria) this;
        }

        public Criteria andSzedstBetween(String value1, String value2) {
            addCriterion("SZEDST between", value1, value2, "szedst");
            return (Criteria) this;
        }

        public Criteria andSzedstNotBetween(String value1, String value2) {
            addCriterion("SZEDST not between", value1, value2, "szedst");
            return (Criteria) this;
        }

        public Criteria andSzedctIsNull() {
            addCriterion("SZEDCT is null");
            return (Criteria) this;
        }

        public Criteria andSzedctIsNotNull() {
            addCriterion("SZEDCT is not null");
            return (Criteria) this;
        }

        public Criteria andSzedctEqualTo(String value) {
            addCriterion("SZEDCT =", value, "szedct");
            return (Criteria) this;
        }

        public Criteria andSzedctNotEqualTo(String value) {
            addCriterion("SZEDCT <>", value, "szedct");
            return (Criteria) this;
        }

        public Criteria andSzedctGreaterThan(String value) {
            addCriterion("SZEDCT >", value, "szedct");
            return (Criteria) this;
        }

        public Criteria andSzedctGreaterThanOrEqualTo(String value) {
            addCriterion("SZEDCT >=", value, "szedct");
            return (Criteria) this;
        }

        public Criteria andSzedctLessThan(String value) {
            addCriterion("SZEDCT <", value, "szedct");
            return (Criteria) this;
        }

        public Criteria andSzedctLessThanOrEqualTo(String value) {
            addCriterion("SZEDCT <=", value, "szedct");
            return (Criteria) this;
        }

        public Criteria andSzedctLike(String value) {
            addCriterion("SZEDCT like", value, "szedct");
            return (Criteria) this;
        }

        public Criteria andSzedctNotLike(String value) {
            addCriterion("SZEDCT not like", value, "szedct");
            return (Criteria) this;
        }

        public Criteria andSzedctIn(List<String> values) {
            addCriterion("SZEDCT in", values, "szedct");
            return (Criteria) this;
        }

        public Criteria andSzedctNotIn(List<String> values) {
            addCriterion("SZEDCT not in", values, "szedct");
            return (Criteria) this;
        }

        public Criteria andSzedctBetween(String value1, String value2) {
            addCriterion("SZEDCT between", value1, value2, "szedct");
            return (Criteria) this;
        }

        public Criteria andSzedctNotBetween(String value1, String value2) {
            addCriterion("SZEDCT not between", value1, value2, "szedct");
            return (Criteria) this;
        }

        public Criteria andSzedtyIsNull() {
            addCriterion("SZEDTY is null");
            return (Criteria) this;
        }

        public Criteria andSzedtyIsNotNull() {
            addCriterion("SZEDTY is not null");
            return (Criteria) this;
        }

        public Criteria andSzedtyEqualTo(String value) {
            addCriterion("SZEDTY =", value, "szedty");
            return (Criteria) this;
        }

        public Criteria andSzedtyNotEqualTo(String value) {
            addCriterion("SZEDTY <>", value, "szedty");
            return (Criteria) this;
        }

        public Criteria andSzedtyGreaterThan(String value) {
            addCriterion("SZEDTY >", value, "szedty");
            return (Criteria) this;
        }

        public Criteria andSzedtyGreaterThanOrEqualTo(String value) {
            addCriterion("SZEDTY >=", value, "szedty");
            return (Criteria) this;
        }

        public Criteria andSzedtyLessThan(String value) {
            addCriterion("SZEDTY <", value, "szedty");
            return (Criteria) this;
        }

        public Criteria andSzedtyLessThanOrEqualTo(String value) {
            addCriterion("SZEDTY <=", value, "szedty");
            return (Criteria) this;
        }

        public Criteria andSzedtyLike(String value) {
            addCriterion("SZEDTY like", value, "szedty");
            return (Criteria) this;
        }

        public Criteria andSzedtyNotLike(String value) {
            addCriterion("SZEDTY not like", value, "szedty");
            return (Criteria) this;
        }

        public Criteria andSzedtyIn(List<String> values) {
            addCriterion("SZEDTY in", values, "szedty");
            return (Criteria) this;
        }

        public Criteria andSzedtyNotIn(List<String> values) {
            addCriterion("SZEDTY not in", values, "szedty");
            return (Criteria) this;
        }

        public Criteria andSzedtyBetween(String value1, String value2) {
            addCriterion("SZEDTY between", value1, value2, "szedty");
            return (Criteria) this;
        }

        public Criteria andSzedtyNotBetween(String value1, String value2) {
            addCriterion("SZEDTY not between", value1, value2, "szedty");
            return (Criteria) this;
        }

        public Criteria andSzeddlIsNull() {
            addCriterion("SZEDDL is null");
            return (Criteria) this;
        }

        public Criteria andSzeddlIsNotNull() {
            addCriterion("SZEDDL is not null");
            return (Criteria) this;
        }

        public Criteria andSzeddlEqualTo(Integer value) {
            addCriterion("SZEDDL =", value, "szeddl");
            return (Criteria) this;
        }

        public Criteria andSzeddlNotEqualTo(Integer value) {
            addCriterion("SZEDDL <>", value, "szeddl");
            return (Criteria) this;
        }

        public Criteria andSzeddlGreaterThan(Integer value) {
            addCriterion("SZEDDL >", value, "szeddl");
            return (Criteria) this;
        }

        public Criteria andSzeddlGreaterThanOrEqualTo(Integer value) {
            addCriterion("SZEDDL >=", value, "szeddl");
            return (Criteria) this;
        }

        public Criteria andSzeddlLessThan(Integer value) {
            addCriterion("SZEDDL <", value, "szeddl");
            return (Criteria) this;
        }

        public Criteria andSzeddlLessThanOrEqualTo(Integer value) {
            addCriterion("SZEDDL <=", value, "szeddl");
            return (Criteria) this;
        }

        public Criteria andSzeddlIn(List<Integer> values) {
            addCriterion("SZEDDL in", values, "szeddl");
            return (Criteria) this;
        }

        public Criteria andSzeddlNotIn(List<Integer> values) {
            addCriterion("SZEDDL not in", values, "szeddl");
            return (Criteria) this;
        }

        public Criteria andSzeddlBetween(Integer value1, Integer value2) {
            addCriterion("SZEDDL between", value1, value2, "szeddl");
            return (Criteria) this;
        }

        public Criteria andSzeddlNotBetween(Integer value1, Integer value2) {
            addCriterion("SZEDDL not between", value1, value2, "szeddl");
            return (Criteria) this;
        }

        public Criteria andSzedspIsNull() {
            addCriterion("SZEDSP is null");
            return (Criteria) this;
        }

        public Criteria andSzedspIsNotNull() {
            addCriterion("SZEDSP is not null");
            return (Criteria) this;
        }

        public Criteria andSzedspEqualTo(String value) {
            addCriterion("SZEDSP =", value, "szedsp");
            return (Criteria) this;
        }

        public Criteria andSzedspNotEqualTo(String value) {
            addCriterion("SZEDSP <>", value, "szedsp");
            return (Criteria) this;
        }

        public Criteria andSzedspGreaterThan(String value) {
            addCriterion("SZEDSP >", value, "szedsp");
            return (Criteria) this;
        }

        public Criteria andSzedspGreaterThanOrEqualTo(String value) {
            addCriterion("SZEDSP >=", value, "szedsp");
            return (Criteria) this;
        }

        public Criteria andSzedspLessThan(String value) {
            addCriterion("SZEDSP <", value, "szedsp");
            return (Criteria) this;
        }

        public Criteria andSzedspLessThanOrEqualTo(String value) {
            addCriterion("SZEDSP <=", value, "szedsp");
            return (Criteria) this;
        }

        public Criteria andSzedspLike(String value) {
            addCriterion("SZEDSP like", value, "szedsp");
            return (Criteria) this;
        }

        public Criteria andSzedspNotLike(String value) {
            addCriterion("SZEDSP not like", value, "szedsp");
            return (Criteria) this;
        }

        public Criteria andSzedspIn(List<String> values) {
            addCriterion("SZEDSP in", values, "szedsp");
            return (Criteria) this;
        }

        public Criteria andSzedspNotIn(List<String> values) {
            addCriterion("SZEDSP not in", values, "szedsp");
            return (Criteria) this;
        }

        public Criteria andSzedspBetween(String value1, String value2) {
            addCriterion("SZEDSP between", value1, value2, "szedsp");
            return (Criteria) this;
        }

        public Criteria andSzedspNotBetween(String value1, String value2) {
            addCriterion("SZEDSP not between", value1, value2, "szedsp");
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