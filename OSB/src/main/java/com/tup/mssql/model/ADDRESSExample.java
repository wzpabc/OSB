package com.tup.mssql.model;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ADDRESSExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ADDRESSExample() {
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

        public Criteria andAban8IsNull() {
            addCriterion("ABAN8 is null");
            return (Criteria) this;
        }

        public Criteria andAban8IsNotNull() {
            addCriterion("ABAN8 is not null");
            return (Criteria) this;
        }

        public Criteria andAban8EqualTo(Integer value) {
            addCriterion("ABAN8 =", value, "aban8");
            return (Criteria) this;
        }

        public Criteria andAban8NotEqualTo(Integer value) {
            addCriterion("ABAN8 <>", value, "aban8");
            return (Criteria) this;
        }

        public Criteria andAban8GreaterThan(Integer value) {
            addCriterion("ABAN8 >", value, "aban8");
            return (Criteria) this;
        }

        public Criteria andAban8GreaterThanOrEqualTo(Integer value) {
            addCriterion("ABAN8 >=", value, "aban8");
            return (Criteria) this;
        }

        public Criteria andAban8LessThan(Integer value) {
            addCriterion("ABAN8 <", value, "aban8");
            return (Criteria) this;
        }

        public Criteria andAban8LessThanOrEqualTo(Integer value) {
            addCriterion("ABAN8 <=", value, "aban8");
            return (Criteria) this;
        }

        public Criteria andAban8In(List<Integer> values) {
            addCriterion("ABAN8 in", values, "aban8");
            return (Criteria) this;
        }

        public Criteria andAban8NotIn(List<Integer> values) {
            addCriterion("ABAN8 not in", values, "aban8");
            return (Criteria) this;
        }

        public Criteria andAban8Between(Integer value1, Integer value2) {
            addCriterion("ABAN8 between", value1, value2, "aban8");
            return (Criteria) this;
        }

        public Criteria andAban8NotBetween(Integer value1, Integer value2) {
            addCriterion("ABAN8 not between", value1, value2, "aban8");
            return (Criteria) this;
        }

        public Criteria andAbalkyIsNull() {
            addCriterion("ABALKY is null");
            return (Criteria) this;
        }

        public Criteria andAbalkyIsNotNull() {
            addCriterion("ABALKY is not null");
            return (Criteria) this;
        }

        public Criteria andAbalkyEqualTo(String value) {
            addCriterion("ABALKY =", value, "abalky");
            return (Criteria) this;
        }

        public Criteria andAbalkyNotEqualTo(String value) {
            addCriterion("ABALKY <>", value, "abalky");
            return (Criteria) this;
        }

        public Criteria andAbalkyGreaterThan(String value) {
            addCriterion("ABALKY >", value, "abalky");
            return (Criteria) this;
        }

        public Criteria andAbalkyGreaterThanOrEqualTo(String value) {
            addCriterion("ABALKY >=", value, "abalky");
            return (Criteria) this;
        }

        public Criteria andAbalkyLessThan(String value) {
            addCriterion("ABALKY <", value, "abalky");
            return (Criteria) this;
        }

        public Criteria andAbalkyLessThanOrEqualTo(String value) {
            addCriterion("ABALKY <=", value, "abalky");
            return (Criteria) this;
        }

        public Criteria andAbalkyLike(String value) {
            addCriterion("ABALKY like", value, "abalky");
            return (Criteria) this;
        }

        public Criteria andAbalkyNotLike(String value) {
            addCriterion("ABALKY not like", value, "abalky");
            return (Criteria) this;
        }

        public Criteria andAbalkyIn(List<String> values) {
            addCriterion("ABALKY in", values, "abalky");
            return (Criteria) this;
        }

        public Criteria andAbalkyNotIn(List<String> values) {
            addCriterion("ABALKY not in", values, "abalky");
            return (Criteria) this;
        }

        public Criteria andAbalkyBetween(String value1, String value2) {
            addCriterion("ABALKY between", value1, value2, "abalky");
            return (Criteria) this;
        }

        public Criteria andAbalkyNotBetween(String value1, String value2) {
            addCriterion("ABALKY not between", value1, value2, "abalky");
            return (Criteria) this;
        }

        public Criteria andAbalphIsNull() {
            addCriterion("ABALPH is null");
            return (Criteria) this;
        }

        public Criteria andAbalphIsNotNull() {
            addCriterion("ABALPH is not null");
            return (Criteria) this;
        }

        public Criteria andAbalphEqualTo(String value) {
            addCriterion("ABALPH =", value, "abalph");
            return (Criteria) this;
        }

        public Criteria andAbalphNotEqualTo(String value) {
            addCriterion("ABALPH <>", value, "abalph");
            return (Criteria) this;
        }

        public Criteria andAbalphGreaterThan(String value) {
            addCriterion("ABALPH >", value, "abalph");
            return (Criteria) this;
        }

        public Criteria andAbalphGreaterThanOrEqualTo(String value) {
            addCriterion("ABALPH >=", value, "abalph");
            return (Criteria) this;
        }

        public Criteria andAbalphLessThan(String value) {
            addCriterion("ABALPH <", value, "abalph");
            return (Criteria) this;
        }

        public Criteria andAbalphLessThanOrEqualTo(String value) {
            addCriterion("ABALPH <=", value, "abalph");
            return (Criteria) this;
        }

        public Criteria andAbalphIn(List<String> values) {
            addCriterion("ABALPH in", values, "abalph");
            return (Criteria) this;
        }

        public Criteria andAbalphNotIn(List<String> values) {
            addCriterion("ABALPH not in", values, "abalph");
            return (Criteria) this;
        }

        public Criteria andAbalphBetween(String value1, String value2) {
            addCriterion("ABALPH between", value1, value2, "abalph");
            return (Criteria) this;
        }

        public Criteria andAbalphNotBetween(String value1, String value2) {
            addCriterion("ABALPH not between", value1, value2, "abalph");
            return (Criteria) this;
        }

        public Criteria andMapa8IsNull() {
            addCriterion("MAPA8 is null");
            return (Criteria) this;
        }

        public Criteria andMapa8IsNotNull() {
            addCriterion("MAPA8 is not null");
            return (Criteria) this;
        }

        public Criteria andMapa8EqualTo(Integer value) {
            addCriterion("MAPA8 =", value, "mapa8");
            return (Criteria) this;
        }

        public Criteria andMapa8NotEqualTo(Integer value) {
            addCriterion("MAPA8 <>", value, "mapa8");
            return (Criteria) this;
        }

        public Criteria andMapa8GreaterThan(Integer value) {
            addCriterion("MAPA8 >", value, "mapa8");
            return (Criteria) this;
        }

        public Criteria andMapa8GreaterThanOrEqualTo(Integer value) {
            addCriterion("MAPA8 >=", value, "mapa8");
            return (Criteria) this;
        }

        public Criteria andMapa8LessThan(Integer value) {
            addCriterion("MAPA8 <", value, "mapa8");
            return (Criteria) this;
        }

        public Criteria andMapa8LessThanOrEqualTo(Integer value) {
            addCriterion("MAPA8 <=", value, "mapa8");
            return (Criteria) this;
        }

        public Criteria andMapa8In(List<Integer> values) {
            addCriterion("MAPA8 in", values, "mapa8");
            return (Criteria) this;
        }

        public Criteria andMapa8NotIn(List<Integer> values) {
            addCriterion("MAPA8 not in", values, "mapa8");
            return (Criteria) this;
        }

        public Criteria andMapa8Between(Integer value1, Integer value2) {
            addCriterion("MAPA8 between", value1, value2, "mapa8");
            return (Criteria) this;
        }

        public Criteria andMapa8NotBetween(Integer value1, Integer value2) {
            addCriterion("MAPA8 not between", value1, value2, "mapa8");
            return (Criteria) this;
        }

        public Criteria andAbmcuIsNull() {
            addCriterion("ABMCU is null");
            return (Criteria) this;
        }

        public Criteria andAbmcuIsNotNull() {
            addCriterion("ABMCU is not null");
            return (Criteria) this;
        }

        public Criteria andAbmcuEqualTo(String value) {
            addCriterion("ABMCU =", value, "abmcu");
            return (Criteria) this;
        }

        public Criteria andAbmcuNotEqualTo(String value) {
            addCriterion("ABMCU <>", value, "abmcu");
            return (Criteria) this;
        }

        public Criteria andAbmcuGreaterThan(String value) {
            addCriterion("ABMCU >", value, "abmcu");
            return (Criteria) this;
        }

        public Criteria andAbmcuGreaterThanOrEqualTo(String value) {
            addCriterion("ABMCU >=", value, "abmcu");
            return (Criteria) this;
        }

        public Criteria andAbmcuLessThan(String value) {
            addCriterion("ABMCU <", value, "abmcu");
            return (Criteria) this;
        }

        public Criteria andAbmcuLessThanOrEqualTo(String value) {
            addCriterion("ABMCU <=", value, "abmcu");
            return (Criteria) this;
        }

        public Criteria andAbmcuLike(String value) {
            addCriterion("ABMCU like", value, "abmcu");
            return (Criteria) this;
        }

        public Criteria andAbmcuNotLike(String value) {
            addCriterion("ABMCU not like", value, "abmcu");
            return (Criteria) this;
        }

        public Criteria andAbmcuIn(List<String> values) {
            addCriterion("ABMCU in", values, "abmcu");
            return (Criteria) this;
        }

        public Criteria andAbmcuNotIn(List<String> values) {
            addCriterion("ABMCU not in", values, "abmcu");
            return (Criteria) this;
        }

        public Criteria andAbmcuBetween(String value1, String value2) {
            addCriterion("ABMCU between", value1, value2, "abmcu");
            return (Criteria) this;
        }

        public Criteria andAbmcuNotBetween(String value1, String value2) {
            addCriterion("ABMCU not between", value1, value2, "abmcu");
            return (Criteria) this;
        }

        public Criteria andAlcty1IsNull() {
            addCriterion("ALCTY1 is null");
            return (Criteria) this;
        }

        public Criteria andAlcty1IsNotNull() {
            addCriterion("ALCTY1 is not null");
            return (Criteria) this;
        }

        public Criteria andAlcty1EqualTo(String value) {
            addCriterion("ALCTY1 =", value, "alcty1");
            return (Criteria) this;
        }

        public Criteria andAlcty1NotEqualTo(String value) {
            addCriterion("ALCTY1 <>", value, "alcty1");
            return (Criteria) this;
        }

        public Criteria andAlcty1GreaterThan(String value) {
            addCriterion("ALCTY1 >", value, "alcty1");
            return (Criteria) this;
        }

        public Criteria andAlcty1GreaterThanOrEqualTo(String value) {
            addCriterion("ALCTY1 >=", value, "alcty1");
            return (Criteria) this;
        }

        public Criteria andAlcty1LessThan(String value) {
            addCriterion("ALCTY1 <", value, "alcty1");
            return (Criteria) this;
        }

        public Criteria andAlcty1LessThanOrEqualTo(String value) {
            addCriterion("ALCTY1 <=", value, "alcty1");
            return (Criteria) this;
        }

        public Criteria andAlcty1In(List<String> values) {
            addCriterion("ALCTY1 in", values, "alcty1");
            return (Criteria) this;
        }

        public Criteria andAlcty1NotIn(List<String> values) {
            addCriterion("ALCTY1 not in", values, "alcty1");
            return (Criteria) this;
        }

        public Criteria andAlcty1Between(String value1, String value2) {
            addCriterion("ALCTY1 between", value1, value2, "alcty1");
            return (Criteria) this;
        }

        public Criteria andAlcty1NotBetween(String value1, String value2) {
            addCriterion("ALCTY1 not between", value1, value2, "alcty1");
            return (Criteria) this;
        }

        public Criteria andAladd1IsNull() {
            addCriterion("ALADD1 is null");
            return (Criteria) this;
        }

        public Criteria andAladd1IsNotNull() {
            addCriterion("ALADD1 is not null");
            return (Criteria) this;
        }

        public Criteria andAladd1EqualTo(String value) {
            addCriterion("ALADD1 =", value, "aladd1");
            return (Criteria) this;
        }

        public Criteria andAladd1NotEqualTo(String value) {
            addCriterion("ALADD1 <>", value, "aladd1");
            return (Criteria) this;
        }

        public Criteria andAladd1GreaterThan(String value) {
            addCriterion("ALADD1 >", value, "aladd1");
            return (Criteria) this;
        }

        public Criteria andAladd1GreaterThanOrEqualTo(String value) {
            addCriterion("ALADD1 >=", value, "aladd1");
            return (Criteria) this;
        }

        public Criteria andAladd1LessThan(String value) {
            addCriterion("ALADD1 <", value, "aladd1");
            return (Criteria) this;
        }

        public Criteria andAladd1LessThanOrEqualTo(String value) {
            addCriterion("ALADD1 <=", value, "aladd1");
            return (Criteria) this;
        }

        public Criteria andAladd1In(List<String> values) {
            addCriterion("ALADD1 in", values, "aladd1");
            return (Criteria) this;
        }

        public Criteria andAladd1NotIn(List<String> values) {
            addCriterion("ALADD1 not in", values, "aladd1");
            return (Criteria) this;
        }

        public Criteria andAladd1Between(String value1, String value2) {
            addCriterion("ALADD1 between", value1, value2, "aladd1");
            return (Criteria) this;
        }

        public Criteria andAladd1NotBetween(String value1, String value2) {
            addCriterion("ALADD1 not between", value1, value2, "aladd1");
            return (Criteria) this;
        }

        public Criteria andAladd2IsNull() {
            addCriterion("ALADD2 is null");
            return (Criteria) this;
        }

        public Criteria andAladd2IsNotNull() {
            addCriterion("ALADD2 is not null");
            return (Criteria) this;
        }

        public Criteria andAladd2EqualTo(String value) {
            addCriterion("ALADD2 =", value, "aladd2");
            return (Criteria) this;
        }

        public Criteria andAladd2NotEqualTo(String value) {
            addCriterion("ALADD2 <>", value, "aladd2");
            return (Criteria) this;
        }

        public Criteria andAladd2GreaterThan(String value) {
            addCriterion("ALADD2 >", value, "aladd2");
            return (Criteria) this;
        }

        public Criteria andAladd2GreaterThanOrEqualTo(String value) {
            addCriterion("ALADD2 >=", value, "aladd2");
            return (Criteria) this;
        }

        public Criteria andAladd2LessThan(String value) {
            addCriterion("ALADD2 <", value, "aladd2");
            return (Criteria) this;
        }

        public Criteria andAladd2LessThanOrEqualTo(String value) {
            addCriterion("ALADD2 <=", value, "aladd2");
            return (Criteria) this;
        }

        public Criteria andAladd2In(List<String> values) {
            addCriterion("ALADD2 in", values, "aladd2");
            return (Criteria) this;
        }

        public Criteria andAladd2NotIn(List<String> values) {
            addCriterion("ALADD2 not in", values, "aladd2");
            return (Criteria) this;
        }

        public Criteria andAladd2Between(String value1, String value2) {
            addCriterion("ALADD2 between", value1, value2, "aladd2");
            return (Criteria) this;
        }

        public Criteria andAladd2NotBetween(String value1, String value2) {
            addCriterion("ALADD2 not between", value1, value2, "aladd2");
            return (Criteria) this;
        }

        public Criteria andAladd3IsNull() {
            addCriterion("ALADD3 is null");
            return (Criteria) this;
        }

        public Criteria andAladd3IsNotNull() {
            addCriterion("ALADD3 is not null");
            return (Criteria) this;
        }

        public Criteria andAladd3EqualTo(String value) {
            addCriterion("ALADD3 =", value, "aladd3");
            return (Criteria) this;
        }

        public Criteria andAladd3NotEqualTo(String value) {
            addCriterion("ALADD3 <>", value, "aladd3");
            return (Criteria) this;
        }

        public Criteria andAladd3GreaterThan(String value) {
            addCriterion("ALADD3 >", value, "aladd3");
            return (Criteria) this;
        }

        public Criteria andAladd3GreaterThanOrEqualTo(String value) {
            addCriterion("ALADD3 >=", value, "aladd3");
            return (Criteria) this;
        }

        public Criteria andAladd3LessThan(String value) {
            addCriterion("ALADD3 <", value, "aladd3");
            return (Criteria) this;
        }

        public Criteria andAladd3LessThanOrEqualTo(String value) {
            addCriterion("ALADD3 <=", value, "aladd3");
            return (Criteria) this;
        }

        public Criteria andAladd3In(List<String> values) {
            addCriterion("ALADD3 in", values, "aladd3");
            return (Criteria) this;
        }

        public Criteria andAladd3NotIn(List<String> values) {
            addCriterion("ALADD3 not in", values, "aladd3");
            return (Criteria) this;
        }

        public Criteria andAladd3Between(String value1, String value2) {
            addCriterion("ALADD3 between", value1, value2, "aladd3");
            return (Criteria) this;
        }

        public Criteria andAladd3NotBetween(String value1, String value2) {
            addCriterion("ALADD3 not between", value1, value2, "aladd3");
            return (Criteria) this;
        }

        public Criteria andAladd4IsNull() {
            addCriterion("ALADD4 is null");
            return (Criteria) this;
        }

        public Criteria andAladd4IsNotNull() {
            addCriterion("ALADD4 is not null");
            return (Criteria) this;
        }

        public Criteria andAladd4EqualTo(String value) {
            addCriterion("ALADD4 =", value, "aladd4");
            return (Criteria) this;
        }

        public Criteria andAladd4NotEqualTo(String value) {
            addCriterion("ALADD4 <>", value, "aladd4");
            return (Criteria) this;
        }

        public Criteria andAladd4GreaterThan(String value) {
            addCriterion("ALADD4 >", value, "aladd4");
            return (Criteria) this;
        }

        public Criteria andAladd4GreaterThanOrEqualTo(String value) {
            addCriterion("ALADD4 >=", value, "aladd4");
            return (Criteria) this;
        }

        public Criteria andAladd4LessThan(String value) {
            addCriterion("ALADD4 <", value, "aladd4");
            return (Criteria) this;
        }

        public Criteria andAladd4LessThanOrEqualTo(String value) {
            addCriterion("ALADD4 <=", value, "aladd4");
            return (Criteria) this;
        }

        public Criteria andAladd4In(List<String> values) {
            addCriterion("ALADD4 in", values, "aladd4");
            return (Criteria) this;
        }

        public Criteria andAladd4NotIn(List<String> values) {
            addCriterion("ALADD4 not in", values, "aladd4");
            return (Criteria) this;
        }

        public Criteria andAladd4Between(String value1, String value2) {
            addCriterion("ALADD4 between", value1, value2, "aladd4");
            return (Criteria) this;
        }

        public Criteria andAladd4NotBetween(String value1, String value2) {
            addCriterion("ALADD4 not between", value1, value2, "aladd4");
            return (Criteria) this;
        }

        public Criteria andAladdzIsNull() {
            addCriterion("ALADDZ is null");
            return (Criteria) this;
        }

        public Criteria andAladdzIsNotNull() {
            addCriterion("ALADDZ is not null");
            return (Criteria) this;
        }

        public Criteria andAladdzEqualTo(Integer value) {
            addCriterion("ALADDZ =", value, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAladdzNotEqualTo(Integer value) {
            addCriterion("ALADDZ <>", value, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAladdzGreaterThan(Integer value) {
            addCriterion("ALADDZ >", value, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAladdzGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALADDZ >=", value, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAladdzLessThan(Integer value) {
            addCriterion("ALADDZ <", value, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAladdzLessThanOrEqualTo(Integer value) {
            addCriterion("ALADDZ <=", value, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAladdzIn(List<Integer> values) {
            addCriterion("ALADDZ in", values, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAladdzNotIn(List<Integer> values) {
            addCriterion("ALADDZ not in", values, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAladdzBetween(Integer value1, Integer value2) {
            addCriterion("ALADDZ between", value1, value2, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAladdzNotBetween(Integer value1, Integer value2) {
            addCriterion("ALADDZ not between", value1, value2, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAbuserIsNull() {
            addCriterion("ABUSER is null");
            return (Criteria) this;
        }

        public Criteria andAbuserIsNotNull() {
            addCriterion("ABUSER is not null");
            return (Criteria) this;
        }

        public Criteria andAbuserEqualTo(String value) {
            addCriterion("ABUSER =", value, "abuser");
            return (Criteria) this;
        }

        public Criteria andAbuserNotEqualTo(String value) {
            addCriterion("ABUSER <>", value, "abuser");
            return (Criteria) this;
        }

        public Criteria andAbuserGreaterThan(String value) {
            addCriterion("ABUSER >", value, "abuser");
            return (Criteria) this;
        }

        public Criteria andAbuserGreaterThanOrEqualTo(String value) {
            addCriterion("ABUSER >=", value, "abuser");
            return (Criteria) this;
        }

        public Criteria andAbuserLessThan(String value) {
            addCriterion("ABUSER <", value, "abuser");
            return (Criteria) this;
        }

        public Criteria andAbuserLessThanOrEqualTo(String value) {
            addCriterion("ABUSER <=", value, "abuser");
            return (Criteria) this;
        }

        public Criteria andAbuserLike(String value) {
            addCriterion("ABUSER like", value, "abuser");
            return (Criteria) this;
        }

        public Criteria andAbuserNotLike(String value) {
            addCriterion("ABUSER not like", value, "abuser");
            return (Criteria) this;
        }

        public Criteria andAbuserIn(List<String> values) {
            addCriterion("ABUSER in", values, "abuser");
            return (Criteria) this;
        }

        public Criteria andAbuserNotIn(List<String> values) {
            addCriterion("ABUSER not in", values, "abuser");
            return (Criteria) this;
        }

        public Criteria andAbuserBetween(String value1, String value2) {
            addCriterion("ABUSER between", value1, value2, "abuser");
            return (Criteria) this;
        }

        public Criteria andAbuserNotBetween(String value1, String value2) {
            addCriterion("ABUSER not between", value1, value2, "abuser");
            return (Criteria) this;
        }

        public Criteria andAbupmjIsNull() {
            addCriterion("ABUPMJ is null");
            return (Criteria) this;
        }

        public Criteria andAbupmjIsNotNull() {
            addCriterion("ABUPMJ is not null");
            return (Criteria) this;
        }

        public Criteria andAbupmjEqualTo(Date value) {
            addCriterion("ABUPMJ =", value, "abupmj");
            return (Criteria) this;
        }

        public Criteria andAbupmjNotEqualTo(Date value) {
            addCriterion("ABUPMJ <>", value, "abupmj");
            return (Criteria) this;
        }

        public Criteria andAbupmjGreaterThan(Date value) {
            addCriterion("ABUPMJ >", value, "abupmj");
            return (Criteria) this;
        }

        public Criteria andAbupmjGreaterThanOrEqualTo(Date value) {
            addCriterion("ABUPMJ >=", value, "abupmj");
            return (Criteria) this;
        }

        public Criteria andAbupmjLessThan(Date value) {
            addCriterion("ABUPMJ <", value, "abupmj");
            return (Criteria) this;
        }

        public Criteria andAbupmjLessThanOrEqualTo(Date value) {
            addCriterion("ABUPMJ <=", value, "abupmj");
            return (Criteria) this;
        }

        public Criteria andAbupmjIn(List<Date> values) {
            addCriterion("ABUPMJ in", values, "abupmj");
            return (Criteria) this;
        }

        public Criteria andAbupmjNotIn(List<Date> values) {
            addCriterion("ABUPMJ not in", values, "abupmj");
            return (Criteria) this;
        }

        public Criteria andAbupmjBetween(Date value1, Date value2) {
            addCriterion("ABUPMJ between", value1, value2, "abupmj");
            return (Criteria) this;
        }

        public Criteria andAbupmjNotBetween(Date value1, Date value2) {
            addCriterion("ABUPMJ not between", value1, value2, "abupmj");
            return (Criteria) this;
        }

        public Criteria andAiaclIsNull() {
            addCriterion("AIACL is null");
            return (Criteria) this;
        }

        public Criteria andAiaclIsNotNull() {
            addCriterion("AIACL is not null");
            return (Criteria) this;
        }

        public Criteria andAiaclEqualTo(BigDecimal value) {
            addCriterion("AIACL =", value, "aiacl");
            return (Criteria) this;
        }

        public Criteria andAiaclNotEqualTo(BigDecimal value) {
            addCriterion("AIACL <>", value, "aiacl");
            return (Criteria) this;
        }

        public Criteria andAiaclGreaterThan(BigDecimal value) {
            addCriterion("AIACL >", value, "aiacl");
            return (Criteria) this;
        }

        public Criteria andAiaclGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AIACL >=", value, "aiacl");
            return (Criteria) this;
        }

        public Criteria andAiaclLessThan(BigDecimal value) {
            addCriterion("AIACL <", value, "aiacl");
            return (Criteria) this;
        }

        public Criteria andAiaclLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AIACL <=", value, "aiacl");
            return (Criteria) this;
        }

        public Criteria andAiaclIn(List<BigDecimal> values) {
            addCriterion("AIACL in", values, "aiacl");
            return (Criteria) this;
        }

        public Criteria andAiaclNotIn(List<BigDecimal> values) {
            addCriterion("AIACL not in", values, "aiacl");
            return (Criteria) this;
        }

        public Criteria andAiaclBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AIACL between", value1, value2, "aiacl");
            return (Criteria) this;
        }

        public Criteria andAiaclNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AIACL not between", value1, value2, "aiacl");
            return (Criteria) this;
        }

        public Criteria andAitxa1IsNull() {
            addCriterion("AITXA1 is null");
            return (Criteria) this;
        }

        public Criteria andAitxa1IsNotNull() {
            addCriterion("AITXA1 is not null");
            return (Criteria) this;
        }

        public Criteria andAitxa1EqualTo(String value) {
            addCriterion("AITXA1 =", value, "aitxa1");
            return (Criteria) this;
        }

        public Criteria andAitxa1NotEqualTo(String value) {
            addCriterion("AITXA1 <>", value, "aitxa1");
            return (Criteria) this;
        }

        public Criteria andAitxa1GreaterThan(String value) {
            addCriterion("AITXA1 >", value, "aitxa1");
            return (Criteria) this;
        }

        public Criteria andAitxa1GreaterThanOrEqualTo(String value) {
            addCriterion("AITXA1 >=", value, "aitxa1");
            return (Criteria) this;
        }

        public Criteria andAitxa1LessThan(String value) {
            addCriterion("AITXA1 <", value, "aitxa1");
            return (Criteria) this;
        }

        public Criteria andAitxa1LessThanOrEqualTo(String value) {
            addCriterion("AITXA1 <=", value, "aitxa1");
            return (Criteria) this;
        }

        public Criteria andAitxa1Like(String value) {
            addCriterion("AITXA1 like", value, "aitxa1");
            return (Criteria) this;
        }

        public Criteria andAitxa1NotLike(String value) {
            addCriterion("AITXA1 not like", value, "aitxa1");
            return (Criteria) this;
        }

        public Criteria andAitxa1In(List<String> values) {
            addCriterion("AITXA1 in", values, "aitxa1");
            return (Criteria) this;
        }

        public Criteria andAitxa1NotIn(List<String> values) {
            addCriterion("AITXA1 not in", values, "aitxa1");
            return (Criteria) this;
        }

        public Criteria andAitxa1Between(String value1, String value2) {
            addCriterion("AITXA1 between", value1, value2, "aitxa1");
            return (Criteria) this;
        }

        public Criteria andAitxa1NotBetween(String value1, String value2) {
            addCriterion("AITXA1 not between", value1, value2, "aitxa1");
            return (Criteria) this;
        }

        public Criteria andWwmlnmIsNull() {
            addCriterion("WWMLNM is null");
            return (Criteria) this;
        }

        public Criteria andWwmlnmIsNotNull() {
            addCriterion("WWMLNM is not null");
            return (Criteria) this;
        }

        public Criteria andWwmlnmEqualTo(String value) {
            addCriterion("WWMLNM =", value, "wwmlnm");
            return (Criteria) this;
        }

        public Criteria andWwmlnmNotEqualTo(String value) {
            addCriterion("WWMLNM <>", value, "wwmlnm");
            return (Criteria) this;
        }

        public Criteria andWwmlnmGreaterThan(String value) {
            addCriterion("WWMLNM >", value, "wwmlnm");
            return (Criteria) this;
        }

        public Criteria andWwmlnmGreaterThanOrEqualTo(String value) {
            addCriterion("WWMLNM >=", value, "wwmlnm");
            return (Criteria) this;
        }

        public Criteria andWwmlnmLessThan(String value) {
            addCriterion("WWMLNM <", value, "wwmlnm");
            return (Criteria) this;
        }

        public Criteria andWwmlnmLessThanOrEqualTo(String value) {
            addCriterion("WWMLNM <=", value, "wwmlnm");
            return (Criteria) this;
        }

        public Criteria andWwmlnmIn(List<String> values) {
            addCriterion("WWMLNM in", values, "wwmlnm");
            return (Criteria) this;
        }

        public Criteria andWwmlnmNotIn(List<String> values) {
            addCriterion("WWMLNM not in", values, "wwmlnm");
            return (Criteria) this;
        }

        public Criteria andWwmlnmBetween(String value1, String value2) {
            addCriterion("WWMLNM between", value1, value2, "wwmlnm");
            return (Criteria) this;
        }

        public Criteria andWwmlnmNotBetween(String value1, String value2) {
            addCriterion("WWMLNM not between", value1, value2, "wwmlnm");
            return (Criteria) this;
        }

        public Criteria andAbat1IsNull() {
            addCriterion("ABAT1 is null");
            return (Criteria) this;
        }

        public Criteria andAbat1IsNotNull() {
            addCriterion("ABAT1 is not null");
            return (Criteria) this;
        }

        public Criteria andAbat1EqualTo(String value) {
            addCriterion("ABAT1 =", value, "abat1");
            return (Criteria) this;
        }

        public Criteria andAbat1NotEqualTo(String value) {
            addCriterion("ABAT1 <>", value, "abat1");
            return (Criteria) this;
        }

        public Criteria andAbat1GreaterThan(String value) {
            addCriterion("ABAT1 >", value, "abat1");
            return (Criteria) this;
        }

        public Criteria andAbat1GreaterThanOrEqualTo(String value) {
            addCriterion("ABAT1 >=", value, "abat1");
            return (Criteria) this;
        }

        public Criteria andAbat1LessThan(String value) {
            addCriterion("ABAT1 <", value, "abat1");
            return (Criteria) this;
        }

        public Criteria andAbat1LessThanOrEqualTo(String value) {
            addCriterion("ABAT1 <=", value, "abat1");
            return (Criteria) this;
        }

        public Criteria andAbat1Like(String value) {
            addCriterion("ABAT1 like", value, "abat1");
            return (Criteria) this;
        }

        public Criteria andAbat1NotLike(String value) {
            addCriterion("ABAT1 not like", value, "abat1");
            return (Criteria) this;
        }

        public Criteria andAbat1In(List<String> values) {
            addCriterion("ABAT1 in", values, "abat1");
            return (Criteria) this;
        }

        public Criteria andAbat1NotIn(List<String> values) {
            addCriterion("ABAT1 not in", values, "abat1");
            return (Criteria) this;
        }

        public Criteria andAbat1Between(String value1, String value2) {
            addCriterion("ABAT1 between", value1, value2, "abat1");
            return (Criteria) this;
        }

        public Criteria andAbat1NotBetween(String value1, String value2) {
            addCriterion("ABAT1 not between", value1, value2, "abat1");
            return (Criteria) this;
        }

        public Criteria andAbeftbIsNull() {
            addCriterion("ABEFTB is null");
            return (Criteria) this;
        }

        public Criteria andAbeftbIsNotNull() {
            addCriterion("ABEFTB is not null");
            return (Criteria) this;
        }

        public Criteria andAbeftbEqualTo(Date value) {
            addCriterionForJDBCDate("ABEFTB =", value, "abeftb");
            return (Criteria) this;
        }

        public Criteria andAbeftbNotEqualTo(Date value) {
            addCriterionForJDBCDate("ABEFTB <>", value, "abeftb");
            return (Criteria) this;
        }

        public Criteria andAbeftbGreaterThan(Date value) {
            addCriterionForJDBCDate("ABEFTB >", value, "abeftb");
            return (Criteria) this;
        }

        public Criteria andAbeftbGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ABEFTB >=", value, "abeftb");
            return (Criteria) this;
        }

        public Criteria andAbeftbLessThan(Date value) {
            addCriterionForJDBCDate("ABEFTB <", value, "abeftb");
            return (Criteria) this;
        }

        public Criteria andAbeftbLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ABEFTB <=", value, "abeftb");
            return (Criteria) this;
        }

        public Criteria andAbeftbIn(List<Date> values) {
            addCriterionForJDBCDate("ABEFTB in", values, "abeftb");
            return (Criteria) this;
        }

        public Criteria andAbeftbNotIn(List<Date> values) {
            addCriterionForJDBCDate("ABEFTB not in", values, "abeftb");
            return (Criteria) this;
        }

        public Criteria andAbeftbBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ABEFTB between", value1, value2, "abeftb");
            return (Criteria) this;
        }

        public Criteria andAbeftbNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ABEFTB not between", value1, value2, "abeftb");
            return (Criteria) this;
        }

        public Criteria andAbac01IsNull() {
            addCriterion("ABAC01 is null");
            return (Criteria) this;
        }

        public Criteria andAbac01IsNotNull() {
            addCriterion("ABAC01 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac01EqualTo(String value) {
            addCriterion("ABAC01 =", value, "abac01");
            return (Criteria) this;
        }

        public Criteria andAbac01NotEqualTo(String value) {
            addCriterion("ABAC01 <>", value, "abac01");
            return (Criteria) this;
        }

        public Criteria andAbac01GreaterThan(String value) {
            addCriterion("ABAC01 >", value, "abac01");
            return (Criteria) this;
        }

        public Criteria andAbac01GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC01 >=", value, "abac01");
            return (Criteria) this;
        }

        public Criteria andAbac01LessThan(String value) {
            addCriterion("ABAC01 <", value, "abac01");
            return (Criteria) this;
        }

        public Criteria andAbac01LessThanOrEqualTo(String value) {
            addCriterion("ABAC01 <=", value, "abac01");
            return (Criteria) this;
        }

        public Criteria andAbac01Like(String value) {
            addCriterion("ABAC01 like", value, "abac01");
            return (Criteria) this;
        }

        public Criteria andAbac01NotLike(String value) {
            addCriterion("ABAC01 not like", value, "abac01");
            return (Criteria) this;
        }

        public Criteria andAbac01In(List<String> values) {
            addCriterion("ABAC01 in", values, "abac01");
            return (Criteria) this;
        }

        public Criteria andAbac01NotIn(List<String> values) {
            addCriterion("ABAC01 not in", values, "abac01");
            return (Criteria) this;
        }

        public Criteria andAbac01Between(String value1, String value2) {
            addCriterion("ABAC01 between", value1, value2, "abac01");
            return (Criteria) this;
        }

        public Criteria andAbac01NotBetween(String value1, String value2) {
            addCriterion("ABAC01 not between", value1, value2, "abac01");
            return (Criteria) this;
        }

        public Criteria andAbac02IsNull() {
            addCriterion("ABAC02 is null");
            return (Criteria) this;
        }

        public Criteria andAbac02IsNotNull() {
            addCriterion("ABAC02 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac02EqualTo(String value) {
            addCriterion("ABAC02 =", value, "abac02");
            return (Criteria) this;
        }

        public Criteria andAbac02NotEqualTo(String value) {
            addCriterion("ABAC02 <>", value, "abac02");
            return (Criteria) this;
        }

        public Criteria andAbac02GreaterThan(String value) {
            addCriterion("ABAC02 >", value, "abac02");
            return (Criteria) this;
        }

        public Criteria andAbac02GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC02 >=", value, "abac02");
            return (Criteria) this;
        }

        public Criteria andAbac02LessThan(String value) {
            addCriterion("ABAC02 <", value, "abac02");
            return (Criteria) this;
        }

        public Criteria andAbac02LessThanOrEqualTo(String value) {
            addCriterion("ABAC02 <=", value, "abac02");
            return (Criteria) this;
        }

        public Criteria andAbac02Like(String value) {
            addCriterion("ABAC02 like", value, "abac02");
            return (Criteria) this;
        }

        public Criteria andAbac02NotLike(String value) {
            addCriterion("ABAC02 not like", value, "abac02");
            return (Criteria) this;
        }

        public Criteria andAbac02In(List<String> values) {
            addCriterion("ABAC02 in", values, "abac02");
            return (Criteria) this;
        }

        public Criteria andAbac02NotIn(List<String> values) {
            addCriterion("ABAC02 not in", values, "abac02");
            return (Criteria) this;
        }

        public Criteria andAbac02Between(String value1, String value2) {
            addCriterion("ABAC02 between", value1, value2, "abac02");
            return (Criteria) this;
        }

        public Criteria andAbac02NotBetween(String value1, String value2) {
            addCriterion("ABAC02 not between", value1, value2, "abac02");
            return (Criteria) this;
        }

        public Criteria andAbac03IsNull() {
            addCriterion("ABAC03 is null");
            return (Criteria) this;
        }

        public Criteria andAbac03IsNotNull() {
            addCriterion("ABAC03 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac03EqualTo(String value) {
            addCriterion("ABAC03 =", value, "abac03");
            return (Criteria) this;
        }

        public Criteria andAbac03NotEqualTo(String value) {
            addCriterion("ABAC03 <>", value, "abac03");
            return (Criteria) this;
        }

        public Criteria andAbac03GreaterThan(String value) {
            addCriterion("ABAC03 >", value, "abac03");
            return (Criteria) this;
        }

        public Criteria andAbac03GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC03 >=", value, "abac03");
            return (Criteria) this;
        }

        public Criteria andAbac03LessThan(String value) {
            addCriterion("ABAC03 <", value, "abac03");
            return (Criteria) this;
        }

        public Criteria andAbac03LessThanOrEqualTo(String value) {
            addCriterion("ABAC03 <=", value, "abac03");
            return (Criteria) this;
        }

        public Criteria andAbac03Like(String value) {
            addCriterion("ABAC03 like", value, "abac03");
            return (Criteria) this;
        }

        public Criteria andAbac03NotLike(String value) {
            addCriterion("ABAC03 not like", value, "abac03");
            return (Criteria) this;
        }

        public Criteria andAbac03In(List<String> values) {
            addCriterion("ABAC03 in", values, "abac03");
            return (Criteria) this;
        }

        public Criteria andAbac03NotIn(List<String> values) {
            addCriterion("ABAC03 not in", values, "abac03");
            return (Criteria) this;
        }

        public Criteria andAbac03Between(String value1, String value2) {
            addCriterion("ABAC03 between", value1, value2, "abac03");
            return (Criteria) this;
        }

        public Criteria andAbac03NotBetween(String value1, String value2) {
            addCriterion("ABAC03 not between", value1, value2, "abac03");
            return (Criteria) this;
        }

        public Criteria andAbac04IsNull() {
            addCriterion("ABAC04 is null");
            return (Criteria) this;
        }

        public Criteria andAbac04IsNotNull() {
            addCriterion("ABAC04 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac04EqualTo(String value) {
            addCriterion("ABAC04 =", value, "abac04");
            return (Criteria) this;
        }

        public Criteria andAbac04NotEqualTo(String value) {
            addCriterion("ABAC04 <>", value, "abac04");
            return (Criteria) this;
        }

        public Criteria andAbac04GreaterThan(String value) {
            addCriterion("ABAC04 >", value, "abac04");
            return (Criteria) this;
        }

        public Criteria andAbac04GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC04 >=", value, "abac04");
            return (Criteria) this;
        }

        public Criteria andAbac04LessThan(String value) {
            addCriterion("ABAC04 <", value, "abac04");
            return (Criteria) this;
        }

        public Criteria andAbac04LessThanOrEqualTo(String value) {
            addCriterion("ABAC04 <=", value, "abac04");
            return (Criteria) this;
        }

        public Criteria andAbac04Like(String value) {
            addCriterion("ABAC04 like", value, "abac04");
            return (Criteria) this;
        }

        public Criteria andAbac04NotLike(String value) {
            addCriterion("ABAC04 not like", value, "abac04");
            return (Criteria) this;
        }

        public Criteria andAbac04In(List<String> values) {
            addCriterion("ABAC04 in", values, "abac04");
            return (Criteria) this;
        }

        public Criteria andAbac04NotIn(List<String> values) {
            addCriterion("ABAC04 not in", values, "abac04");
            return (Criteria) this;
        }

        public Criteria andAbac04Between(String value1, String value2) {
            addCriterion("ABAC04 between", value1, value2, "abac04");
            return (Criteria) this;
        }

        public Criteria andAbac04NotBetween(String value1, String value2) {
            addCriterion("ABAC04 not between", value1, value2, "abac04");
            return (Criteria) this;
        }

        public Criteria andAbac05IsNull() {
            addCriterion("ABAC05 is null");
            return (Criteria) this;
        }

        public Criteria andAbac05IsNotNull() {
            addCriterion("ABAC05 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac05EqualTo(String value) {
            addCriterion("ABAC05 =", value, "abac05");
            return (Criteria) this;
        }

        public Criteria andAbac05NotEqualTo(String value) {
            addCriterion("ABAC05 <>", value, "abac05");
            return (Criteria) this;
        }

        public Criteria andAbac05GreaterThan(String value) {
            addCriterion("ABAC05 >", value, "abac05");
            return (Criteria) this;
        }

        public Criteria andAbac05GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC05 >=", value, "abac05");
            return (Criteria) this;
        }

        public Criteria andAbac05LessThan(String value) {
            addCriterion("ABAC05 <", value, "abac05");
            return (Criteria) this;
        }

        public Criteria andAbac05LessThanOrEqualTo(String value) {
            addCriterion("ABAC05 <=", value, "abac05");
            return (Criteria) this;
        }

        public Criteria andAbac05Like(String value) {
            addCriterion("ABAC05 like", value, "abac05");
            return (Criteria) this;
        }

        public Criteria andAbac05NotLike(String value) {
            addCriterion("ABAC05 not like", value, "abac05");
            return (Criteria) this;
        }

        public Criteria andAbac05In(List<String> values) {
            addCriterion("ABAC05 in", values, "abac05");
            return (Criteria) this;
        }

        public Criteria andAbac05NotIn(List<String> values) {
            addCriterion("ABAC05 not in", values, "abac05");
            return (Criteria) this;
        }

        public Criteria andAbac05Between(String value1, String value2) {
            addCriterion("ABAC05 between", value1, value2, "abac05");
            return (Criteria) this;
        }

        public Criteria andAbac05NotBetween(String value1, String value2) {
            addCriterion("ABAC05 not between", value1, value2, "abac05");
            return (Criteria) this;
        }

        public Criteria andAbac06IsNull() {
            addCriterion("ABAC06 is null");
            return (Criteria) this;
        }

        public Criteria andAbac06IsNotNull() {
            addCriterion("ABAC06 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac06EqualTo(String value) {
            addCriterion("ABAC06 =", value, "abac06");
            return (Criteria) this;
        }

        public Criteria andAbac06NotEqualTo(String value) {
            addCriterion("ABAC06 <>", value, "abac06");
            return (Criteria) this;
        }

        public Criteria andAbac06GreaterThan(String value) {
            addCriterion("ABAC06 >", value, "abac06");
            return (Criteria) this;
        }

        public Criteria andAbac06GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC06 >=", value, "abac06");
            return (Criteria) this;
        }

        public Criteria andAbac06LessThan(String value) {
            addCriterion("ABAC06 <", value, "abac06");
            return (Criteria) this;
        }

        public Criteria andAbac06LessThanOrEqualTo(String value) {
            addCriterion("ABAC06 <=", value, "abac06");
            return (Criteria) this;
        }

        public Criteria andAbac06Like(String value) {
            addCriterion("ABAC06 like", value, "abac06");
            return (Criteria) this;
        }

        public Criteria andAbac06NotLike(String value) {
            addCriterion("ABAC06 not like", value, "abac06");
            return (Criteria) this;
        }

        public Criteria andAbac06In(List<String> values) {
            addCriterion("ABAC06 in", values, "abac06");
            return (Criteria) this;
        }

        public Criteria andAbac06NotIn(List<String> values) {
            addCriterion("ABAC06 not in", values, "abac06");
            return (Criteria) this;
        }

        public Criteria andAbac06Between(String value1, String value2) {
            addCriterion("ABAC06 between", value1, value2, "abac06");
            return (Criteria) this;
        }

        public Criteria andAbac06NotBetween(String value1, String value2) {
            addCriterion("ABAC06 not between", value1, value2, "abac06");
            return (Criteria) this;
        }

        public Criteria andAbac07IsNull() {
            addCriterion("ABAC07 is null");
            return (Criteria) this;
        }

        public Criteria andAbac07IsNotNull() {
            addCriterion("ABAC07 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac07EqualTo(String value) {
            addCriterion("ABAC07 =", value, "abac07");
            return (Criteria) this;
        }

        public Criteria andAbac07NotEqualTo(String value) {
            addCriterion("ABAC07 <>", value, "abac07");
            return (Criteria) this;
        }

        public Criteria andAbac07GreaterThan(String value) {
            addCriterion("ABAC07 >", value, "abac07");
            return (Criteria) this;
        }

        public Criteria andAbac07GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC07 >=", value, "abac07");
            return (Criteria) this;
        }

        public Criteria andAbac07LessThan(String value) {
            addCriterion("ABAC07 <", value, "abac07");
            return (Criteria) this;
        }

        public Criteria andAbac07LessThanOrEqualTo(String value) {
            addCriterion("ABAC07 <=", value, "abac07");
            return (Criteria) this;
        }

        public Criteria andAbac07Like(String value) {
            addCriterion("ABAC07 like", value, "abac07");
            return (Criteria) this;
        }

        public Criteria andAbac07NotLike(String value) {
            addCriterion("ABAC07 not like", value, "abac07");
            return (Criteria) this;
        }

        public Criteria andAbac07In(List<String> values) {
            addCriterion("ABAC07 in", values, "abac07");
            return (Criteria) this;
        }

        public Criteria andAbac07NotIn(List<String> values) {
            addCriterion("ABAC07 not in", values, "abac07");
            return (Criteria) this;
        }

        public Criteria andAbac07Between(String value1, String value2) {
            addCriterion("ABAC07 between", value1, value2, "abac07");
            return (Criteria) this;
        }

        public Criteria andAbac07NotBetween(String value1, String value2) {
            addCriterion("ABAC07 not between", value1, value2, "abac07");
            return (Criteria) this;
        }

        public Criteria andAbac08IsNull() {
            addCriterion("ABAC08 is null");
            return (Criteria) this;
        }

        public Criteria andAbac08IsNotNull() {
            addCriterion("ABAC08 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac08EqualTo(String value) {
            addCriterion("ABAC08 =", value, "abac08");
            return (Criteria) this;
        }

        public Criteria andAbac08NotEqualTo(String value) {
            addCriterion("ABAC08 <>", value, "abac08");
            return (Criteria) this;
        }

        public Criteria andAbac08GreaterThan(String value) {
            addCriterion("ABAC08 >", value, "abac08");
            return (Criteria) this;
        }

        public Criteria andAbac08GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC08 >=", value, "abac08");
            return (Criteria) this;
        }

        public Criteria andAbac08LessThan(String value) {
            addCriterion("ABAC08 <", value, "abac08");
            return (Criteria) this;
        }

        public Criteria andAbac08LessThanOrEqualTo(String value) {
            addCriterion("ABAC08 <=", value, "abac08");
            return (Criteria) this;
        }

        public Criteria andAbac08Like(String value) {
            addCriterion("ABAC08 like", value, "abac08");
            return (Criteria) this;
        }

        public Criteria andAbac08NotLike(String value) {
            addCriterion("ABAC08 not like", value, "abac08");
            return (Criteria) this;
        }

        public Criteria andAbac08In(List<String> values) {
            addCriterion("ABAC08 in", values, "abac08");
            return (Criteria) this;
        }

        public Criteria andAbac08NotIn(List<String> values) {
            addCriterion("ABAC08 not in", values, "abac08");
            return (Criteria) this;
        }

        public Criteria andAbac08Between(String value1, String value2) {
            addCriterion("ABAC08 between", value1, value2, "abac08");
            return (Criteria) this;
        }

        public Criteria andAbac08NotBetween(String value1, String value2) {
            addCriterion("ABAC08 not between", value1, value2, "abac08");
            return (Criteria) this;
        }

        public Criteria andAbac09IsNull() {
            addCriterion("ABAC09 is null");
            return (Criteria) this;
        }

        public Criteria andAbac09IsNotNull() {
            addCriterion("ABAC09 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac09EqualTo(String value) {
            addCriterion("ABAC09 =", value, "abac09");
            return (Criteria) this;
        }

        public Criteria andAbac09NotEqualTo(String value) {
            addCriterion("ABAC09 <>", value, "abac09");
            return (Criteria) this;
        }

        public Criteria andAbac09GreaterThan(String value) {
            addCriterion("ABAC09 >", value, "abac09");
            return (Criteria) this;
        }

        public Criteria andAbac09GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC09 >=", value, "abac09");
            return (Criteria) this;
        }

        public Criteria andAbac09LessThan(String value) {
            addCriterion("ABAC09 <", value, "abac09");
            return (Criteria) this;
        }

        public Criteria andAbac09LessThanOrEqualTo(String value) {
            addCriterion("ABAC09 <=", value, "abac09");
            return (Criteria) this;
        }

        public Criteria andAbac09Like(String value) {
            addCriterion("ABAC09 like", value, "abac09");
            return (Criteria) this;
        }

        public Criteria andAbac09NotLike(String value) {
            addCriterion("ABAC09 not like", value, "abac09");
            return (Criteria) this;
        }

        public Criteria andAbac09In(List<String> values) {
            addCriterion("ABAC09 in", values, "abac09");
            return (Criteria) this;
        }

        public Criteria andAbac09NotIn(List<String> values) {
            addCriterion("ABAC09 not in", values, "abac09");
            return (Criteria) this;
        }

        public Criteria andAbac09Between(String value1, String value2) {
            addCriterion("ABAC09 between", value1, value2, "abac09");
            return (Criteria) this;
        }

        public Criteria andAbac09NotBetween(String value1, String value2) {
            addCriterion("ABAC09 not between", value1, value2, "abac09");
            return (Criteria) this;
        }

        public Criteria andAbac10IsNull() {
            addCriterion("ABAC10 is null");
            return (Criteria) this;
        }

        public Criteria andAbac10IsNotNull() {
            addCriterion("ABAC10 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac10EqualTo(String value) {
            addCriterion("ABAC10 =", value, "abac10");
            return (Criteria) this;
        }

        public Criteria andAbac10NotEqualTo(String value) {
            addCriterion("ABAC10 <>", value, "abac10");
            return (Criteria) this;
        }

        public Criteria andAbac10GreaterThan(String value) {
            addCriterion("ABAC10 >", value, "abac10");
            return (Criteria) this;
        }

        public Criteria andAbac10GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC10 >=", value, "abac10");
            return (Criteria) this;
        }

        public Criteria andAbac10LessThan(String value) {
            addCriterion("ABAC10 <", value, "abac10");
            return (Criteria) this;
        }

        public Criteria andAbac10LessThanOrEqualTo(String value) {
            addCriterion("ABAC10 <=", value, "abac10");
            return (Criteria) this;
        }

        public Criteria andAbac10Like(String value) {
            addCriterion("ABAC10 like", value, "abac10");
            return (Criteria) this;
        }

        public Criteria andAbac10NotLike(String value) {
            addCriterion("ABAC10 not like", value, "abac10");
            return (Criteria) this;
        }

        public Criteria andAbac10In(List<String> values) {
            addCriterion("ABAC10 in", values, "abac10");
            return (Criteria) this;
        }

        public Criteria andAbac10NotIn(List<String> values) {
            addCriterion("ABAC10 not in", values, "abac10");
            return (Criteria) this;
        }

        public Criteria andAbac10Between(String value1, String value2) {
            addCriterion("ABAC10 between", value1, value2, "abac10");
            return (Criteria) this;
        }

        public Criteria andAbac10NotBetween(String value1, String value2) {
            addCriterion("ABAC10 not between", value1, value2, "abac10");
            return (Criteria) this;
        }

        public Criteria andAbac11IsNull() {
            addCriterion("ABAC11 is null");
            return (Criteria) this;
        }

        public Criteria andAbac11IsNotNull() {
            addCriterion("ABAC11 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac11EqualTo(String value) {
            addCriterion("ABAC11 =", value, "abac11");
            return (Criteria) this;
        }

        public Criteria andAbac11NotEqualTo(String value) {
            addCriterion("ABAC11 <>", value, "abac11");
            return (Criteria) this;
        }

        public Criteria andAbac11GreaterThan(String value) {
            addCriterion("ABAC11 >", value, "abac11");
            return (Criteria) this;
        }

        public Criteria andAbac11GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC11 >=", value, "abac11");
            return (Criteria) this;
        }

        public Criteria andAbac11LessThan(String value) {
            addCriterion("ABAC11 <", value, "abac11");
            return (Criteria) this;
        }

        public Criteria andAbac11LessThanOrEqualTo(String value) {
            addCriterion("ABAC11 <=", value, "abac11");
            return (Criteria) this;
        }

        public Criteria andAbac11Like(String value) {
            addCriterion("ABAC11 like", value, "abac11");
            return (Criteria) this;
        }

        public Criteria andAbac11NotLike(String value) {
            addCriterion("ABAC11 not like", value, "abac11");
            return (Criteria) this;
        }

        public Criteria andAbac11In(List<String> values) {
            addCriterion("ABAC11 in", values, "abac11");
            return (Criteria) this;
        }

        public Criteria andAbac11NotIn(List<String> values) {
            addCriterion("ABAC11 not in", values, "abac11");
            return (Criteria) this;
        }

        public Criteria andAbac11Between(String value1, String value2) {
            addCriterion("ABAC11 between", value1, value2, "abac11");
            return (Criteria) this;
        }

        public Criteria andAbac11NotBetween(String value1, String value2) {
            addCriterion("ABAC11 not between", value1, value2, "abac11");
            return (Criteria) this;
        }

        public Criteria andAbac12IsNull() {
            addCriterion("ABAC12 is null");
            return (Criteria) this;
        }

        public Criteria andAbac12IsNotNull() {
            addCriterion("ABAC12 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac12EqualTo(String value) {
            addCriterion("ABAC12 =", value, "abac12");
            return (Criteria) this;
        }

        public Criteria andAbac12NotEqualTo(String value) {
            addCriterion("ABAC12 <>", value, "abac12");
            return (Criteria) this;
        }

        public Criteria andAbac12GreaterThan(String value) {
            addCriterion("ABAC12 >", value, "abac12");
            return (Criteria) this;
        }

        public Criteria andAbac12GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC12 >=", value, "abac12");
            return (Criteria) this;
        }

        public Criteria andAbac12LessThan(String value) {
            addCriterion("ABAC12 <", value, "abac12");
            return (Criteria) this;
        }

        public Criteria andAbac12LessThanOrEqualTo(String value) {
            addCriterion("ABAC12 <=", value, "abac12");
            return (Criteria) this;
        }

        public Criteria andAbac12Like(String value) {
            addCriterion("ABAC12 like", value, "abac12");
            return (Criteria) this;
        }

        public Criteria andAbac12NotLike(String value) {
            addCriterion("ABAC12 not like", value, "abac12");
            return (Criteria) this;
        }

        public Criteria andAbac12In(List<String> values) {
            addCriterion("ABAC12 in", values, "abac12");
            return (Criteria) this;
        }

        public Criteria andAbac12NotIn(List<String> values) {
            addCriterion("ABAC12 not in", values, "abac12");
            return (Criteria) this;
        }

        public Criteria andAbac12Between(String value1, String value2) {
            addCriterion("ABAC12 between", value1, value2, "abac12");
            return (Criteria) this;
        }

        public Criteria andAbac12NotBetween(String value1, String value2) {
            addCriterion("ABAC12 not between", value1, value2, "abac12");
            return (Criteria) this;
        }

        public Criteria andAbac13IsNull() {
            addCriterion("ABAC13 is null");
            return (Criteria) this;
        }

        public Criteria andAbac13IsNotNull() {
            addCriterion("ABAC13 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac13EqualTo(String value) {
            addCriterion("ABAC13 =", value, "abac13");
            return (Criteria) this;
        }

        public Criteria andAbac13NotEqualTo(String value) {
            addCriterion("ABAC13 <>", value, "abac13");
            return (Criteria) this;
        }

        public Criteria andAbac13GreaterThan(String value) {
            addCriterion("ABAC13 >", value, "abac13");
            return (Criteria) this;
        }

        public Criteria andAbac13GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC13 >=", value, "abac13");
            return (Criteria) this;
        }

        public Criteria andAbac13LessThan(String value) {
            addCriterion("ABAC13 <", value, "abac13");
            return (Criteria) this;
        }

        public Criteria andAbac13LessThanOrEqualTo(String value) {
            addCriterion("ABAC13 <=", value, "abac13");
            return (Criteria) this;
        }

        public Criteria andAbac13Like(String value) {
            addCriterion("ABAC13 like", value, "abac13");
            return (Criteria) this;
        }

        public Criteria andAbac13NotLike(String value) {
            addCriterion("ABAC13 not like", value, "abac13");
            return (Criteria) this;
        }

        public Criteria andAbac13In(List<String> values) {
            addCriterion("ABAC13 in", values, "abac13");
            return (Criteria) this;
        }

        public Criteria andAbac13NotIn(List<String> values) {
            addCriterion("ABAC13 not in", values, "abac13");
            return (Criteria) this;
        }

        public Criteria andAbac13Between(String value1, String value2) {
            addCriterion("ABAC13 between", value1, value2, "abac13");
            return (Criteria) this;
        }

        public Criteria andAbac13NotBetween(String value1, String value2) {
            addCriterion("ABAC13 not between", value1, value2, "abac13");
            return (Criteria) this;
        }

        public Criteria andAbac14IsNull() {
            addCriterion("ABAC14 is null");
            return (Criteria) this;
        }

        public Criteria andAbac14IsNotNull() {
            addCriterion("ABAC14 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac14EqualTo(String value) {
            addCriterion("ABAC14 =", value, "abac14");
            return (Criteria) this;
        }

        public Criteria andAbac14NotEqualTo(String value) {
            addCriterion("ABAC14 <>", value, "abac14");
            return (Criteria) this;
        }

        public Criteria andAbac14GreaterThan(String value) {
            addCriterion("ABAC14 >", value, "abac14");
            return (Criteria) this;
        }

        public Criteria andAbac14GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC14 >=", value, "abac14");
            return (Criteria) this;
        }

        public Criteria andAbac14LessThan(String value) {
            addCriterion("ABAC14 <", value, "abac14");
            return (Criteria) this;
        }

        public Criteria andAbac14LessThanOrEqualTo(String value) {
            addCriterion("ABAC14 <=", value, "abac14");
            return (Criteria) this;
        }

        public Criteria andAbac14Like(String value) {
            addCriterion("ABAC14 like", value, "abac14");
            return (Criteria) this;
        }

        public Criteria andAbac14NotLike(String value) {
            addCriterion("ABAC14 not like", value, "abac14");
            return (Criteria) this;
        }

        public Criteria andAbac14In(List<String> values) {
            addCriterion("ABAC14 in", values, "abac14");
            return (Criteria) this;
        }

        public Criteria andAbac14NotIn(List<String> values) {
            addCriterion("ABAC14 not in", values, "abac14");
            return (Criteria) this;
        }

        public Criteria andAbac14Between(String value1, String value2) {
            addCriterion("ABAC14 between", value1, value2, "abac14");
            return (Criteria) this;
        }

        public Criteria andAbac14NotBetween(String value1, String value2) {
            addCriterion("ABAC14 not between", value1, value2, "abac14");
            return (Criteria) this;
        }

        public Criteria andAbac15IsNull() {
            addCriterion("ABAC15 is null");
            return (Criteria) this;
        }

        public Criteria andAbac15IsNotNull() {
            addCriterion("ABAC15 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac15EqualTo(String value) {
            addCriterion("ABAC15 =", value, "abac15");
            return (Criteria) this;
        }

        public Criteria andAbac15NotEqualTo(String value) {
            addCriterion("ABAC15 <>", value, "abac15");
            return (Criteria) this;
        }

        public Criteria andAbac15GreaterThan(String value) {
            addCriterion("ABAC15 >", value, "abac15");
            return (Criteria) this;
        }

        public Criteria andAbac15GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC15 >=", value, "abac15");
            return (Criteria) this;
        }

        public Criteria andAbac15LessThan(String value) {
            addCriterion("ABAC15 <", value, "abac15");
            return (Criteria) this;
        }

        public Criteria andAbac15LessThanOrEqualTo(String value) {
            addCriterion("ABAC15 <=", value, "abac15");
            return (Criteria) this;
        }

        public Criteria andAbac15Like(String value) {
            addCriterion("ABAC15 like", value, "abac15");
            return (Criteria) this;
        }

        public Criteria andAbac15NotLike(String value) {
            addCriterion("ABAC15 not like", value, "abac15");
            return (Criteria) this;
        }

        public Criteria andAbac15In(List<String> values) {
            addCriterion("ABAC15 in", values, "abac15");
            return (Criteria) this;
        }

        public Criteria andAbac15NotIn(List<String> values) {
            addCriterion("ABAC15 not in", values, "abac15");
            return (Criteria) this;
        }

        public Criteria andAbac15Between(String value1, String value2) {
            addCriterion("ABAC15 between", value1, value2, "abac15");
            return (Criteria) this;
        }

        public Criteria andAbac15NotBetween(String value1, String value2) {
            addCriterion("ABAC15 not between", value1, value2, "abac15");
            return (Criteria) this;
        }

        public Criteria andAbac16IsNull() {
            addCriterion("ABAC16 is null");
            return (Criteria) this;
        }

        public Criteria andAbac16IsNotNull() {
            addCriterion("ABAC16 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac16EqualTo(String value) {
            addCriterion("ABAC16 =", value, "abac16");
            return (Criteria) this;
        }

        public Criteria andAbac16NotEqualTo(String value) {
            addCriterion("ABAC16 <>", value, "abac16");
            return (Criteria) this;
        }

        public Criteria andAbac16GreaterThan(String value) {
            addCriterion("ABAC16 >", value, "abac16");
            return (Criteria) this;
        }

        public Criteria andAbac16GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC16 >=", value, "abac16");
            return (Criteria) this;
        }

        public Criteria andAbac16LessThan(String value) {
            addCriterion("ABAC16 <", value, "abac16");
            return (Criteria) this;
        }

        public Criteria andAbac16LessThanOrEqualTo(String value) {
            addCriterion("ABAC16 <=", value, "abac16");
            return (Criteria) this;
        }

        public Criteria andAbac16Like(String value) {
            addCriterion("ABAC16 like", value, "abac16");
            return (Criteria) this;
        }

        public Criteria andAbac16NotLike(String value) {
            addCriterion("ABAC16 not like", value, "abac16");
            return (Criteria) this;
        }

        public Criteria andAbac16In(List<String> values) {
            addCriterion("ABAC16 in", values, "abac16");
            return (Criteria) this;
        }

        public Criteria andAbac16NotIn(List<String> values) {
            addCriterion("ABAC16 not in", values, "abac16");
            return (Criteria) this;
        }

        public Criteria andAbac16Between(String value1, String value2) {
            addCriterion("ABAC16 between", value1, value2, "abac16");
            return (Criteria) this;
        }

        public Criteria andAbac16NotBetween(String value1, String value2) {
            addCriterion("ABAC16 not between", value1, value2, "abac16");
            return (Criteria) this;
        }

        public Criteria andAbac17IsNull() {
            addCriterion("ABAC17 is null");
            return (Criteria) this;
        }

        public Criteria andAbac17IsNotNull() {
            addCriterion("ABAC17 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac17EqualTo(String value) {
            addCriterion("ABAC17 =", value, "abac17");
            return (Criteria) this;
        }

        public Criteria andAbac17NotEqualTo(String value) {
            addCriterion("ABAC17 <>", value, "abac17");
            return (Criteria) this;
        }

        public Criteria andAbac17GreaterThan(String value) {
            addCriterion("ABAC17 >", value, "abac17");
            return (Criteria) this;
        }

        public Criteria andAbac17GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC17 >=", value, "abac17");
            return (Criteria) this;
        }

        public Criteria andAbac17LessThan(String value) {
            addCriterion("ABAC17 <", value, "abac17");
            return (Criteria) this;
        }

        public Criteria andAbac17LessThanOrEqualTo(String value) {
            addCriterion("ABAC17 <=", value, "abac17");
            return (Criteria) this;
        }

        public Criteria andAbac17Like(String value) {
            addCriterion("ABAC17 like", value, "abac17");
            return (Criteria) this;
        }

        public Criteria andAbac17NotLike(String value) {
            addCriterion("ABAC17 not like", value, "abac17");
            return (Criteria) this;
        }

        public Criteria andAbac17In(List<String> values) {
            addCriterion("ABAC17 in", values, "abac17");
            return (Criteria) this;
        }

        public Criteria andAbac17NotIn(List<String> values) {
            addCriterion("ABAC17 not in", values, "abac17");
            return (Criteria) this;
        }

        public Criteria andAbac17Between(String value1, String value2) {
            addCriterion("ABAC17 between", value1, value2, "abac17");
            return (Criteria) this;
        }

        public Criteria andAbac17NotBetween(String value1, String value2) {
            addCriterion("ABAC17 not between", value1, value2, "abac17");
            return (Criteria) this;
        }

        public Criteria andAbac18IsNull() {
            addCriterion("ABAC18 is null");
            return (Criteria) this;
        }

        public Criteria andAbac18IsNotNull() {
            addCriterion("ABAC18 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac18EqualTo(String value) {
            addCriterion("ABAC18 =", value, "abac18");
            return (Criteria) this;
        }

        public Criteria andAbac18NotEqualTo(String value) {
            addCriterion("ABAC18 <>", value, "abac18");
            return (Criteria) this;
        }

        public Criteria andAbac18GreaterThan(String value) {
            addCriterion("ABAC18 >", value, "abac18");
            return (Criteria) this;
        }

        public Criteria andAbac18GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC18 >=", value, "abac18");
            return (Criteria) this;
        }

        public Criteria andAbac18LessThan(String value) {
            addCriterion("ABAC18 <", value, "abac18");
            return (Criteria) this;
        }

        public Criteria andAbac18LessThanOrEqualTo(String value) {
            addCriterion("ABAC18 <=", value, "abac18");
            return (Criteria) this;
        }

        public Criteria andAbac18Like(String value) {
            addCriterion("ABAC18 like", value, "abac18");
            return (Criteria) this;
        }

        public Criteria andAbac18NotLike(String value) {
            addCriterion("ABAC18 not like", value, "abac18");
            return (Criteria) this;
        }

        public Criteria andAbac18In(List<String> values) {
            addCriterion("ABAC18 in", values, "abac18");
            return (Criteria) this;
        }

        public Criteria andAbac18NotIn(List<String> values) {
            addCriterion("ABAC18 not in", values, "abac18");
            return (Criteria) this;
        }

        public Criteria andAbac18Between(String value1, String value2) {
            addCriterion("ABAC18 between", value1, value2, "abac18");
            return (Criteria) this;
        }

        public Criteria andAbac18NotBetween(String value1, String value2) {
            addCriterion("ABAC18 not between", value1, value2, "abac18");
            return (Criteria) this;
        }

        public Criteria andAbac19IsNull() {
            addCriterion("ABAC19 is null");
            return (Criteria) this;
        }

        public Criteria andAbac19IsNotNull() {
            addCriterion("ABAC19 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac19EqualTo(String value) {
            addCriterion("ABAC19 =", value, "abac19");
            return (Criteria) this;
        }

        public Criteria andAbac19NotEqualTo(String value) {
            addCriterion("ABAC19 <>", value, "abac19");
            return (Criteria) this;
        }

        public Criteria andAbac19GreaterThan(String value) {
            addCriterion("ABAC19 >", value, "abac19");
            return (Criteria) this;
        }

        public Criteria andAbac19GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC19 >=", value, "abac19");
            return (Criteria) this;
        }

        public Criteria andAbac19LessThan(String value) {
            addCriterion("ABAC19 <", value, "abac19");
            return (Criteria) this;
        }

        public Criteria andAbac19LessThanOrEqualTo(String value) {
            addCriterion("ABAC19 <=", value, "abac19");
            return (Criteria) this;
        }

        public Criteria andAbac19Like(String value) {
            addCriterion("ABAC19 like", value, "abac19");
            return (Criteria) this;
        }

        public Criteria andAbac19NotLike(String value) {
            addCriterion("ABAC19 not like", value, "abac19");
            return (Criteria) this;
        }

        public Criteria andAbac19In(List<String> values) {
            addCriterion("ABAC19 in", values, "abac19");
            return (Criteria) this;
        }

        public Criteria andAbac19NotIn(List<String> values) {
            addCriterion("ABAC19 not in", values, "abac19");
            return (Criteria) this;
        }

        public Criteria andAbac19Between(String value1, String value2) {
            addCriterion("ABAC19 between", value1, value2, "abac19");
            return (Criteria) this;
        }

        public Criteria andAbac19NotBetween(String value1, String value2) {
            addCriterion("ABAC19 not between", value1, value2, "abac19");
            return (Criteria) this;
        }

        public Criteria andAbac20IsNull() {
            addCriterion("ABAC20 is null");
            return (Criteria) this;
        }

        public Criteria andAbac20IsNotNull() {
            addCriterion("ABAC20 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac20EqualTo(String value) {
            addCriterion("ABAC20 =", value, "abac20");
            return (Criteria) this;
        }

        public Criteria andAbac20NotEqualTo(String value) {
            addCriterion("ABAC20 <>", value, "abac20");
            return (Criteria) this;
        }

        public Criteria andAbac20GreaterThan(String value) {
            addCriterion("ABAC20 >", value, "abac20");
            return (Criteria) this;
        }

        public Criteria andAbac20GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC20 >=", value, "abac20");
            return (Criteria) this;
        }

        public Criteria andAbac20LessThan(String value) {
            addCriterion("ABAC20 <", value, "abac20");
            return (Criteria) this;
        }

        public Criteria andAbac20LessThanOrEqualTo(String value) {
            addCriterion("ABAC20 <=", value, "abac20");
            return (Criteria) this;
        }

        public Criteria andAbac20Like(String value) {
            addCriterion("ABAC20 like", value, "abac20");
            return (Criteria) this;
        }

        public Criteria andAbac20NotLike(String value) {
            addCriterion("ABAC20 not like", value, "abac20");
            return (Criteria) this;
        }

        public Criteria andAbac20In(List<String> values) {
            addCriterion("ABAC20 in", values, "abac20");
            return (Criteria) this;
        }

        public Criteria andAbac20NotIn(List<String> values) {
            addCriterion("ABAC20 not in", values, "abac20");
            return (Criteria) this;
        }

        public Criteria andAbac20Between(String value1, String value2) {
            addCriterion("ABAC20 between", value1, value2, "abac20");
            return (Criteria) this;
        }

        public Criteria andAbac20NotBetween(String value1, String value2) {
            addCriterion("ABAC20 not between", value1, value2, "abac20");
            return (Criteria) this;
        }

        public Criteria andAbac21IsNull() {
            addCriterion("ABAC21 is null");
            return (Criteria) this;
        }

        public Criteria andAbac21IsNotNull() {
            addCriterion("ABAC21 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac21EqualTo(String value) {
            addCriterion("ABAC21 =", value, "abac21");
            return (Criteria) this;
        }

        public Criteria andAbac21NotEqualTo(String value) {
            addCriterion("ABAC21 <>", value, "abac21");
            return (Criteria) this;
        }

        public Criteria andAbac21GreaterThan(String value) {
            addCriterion("ABAC21 >", value, "abac21");
            return (Criteria) this;
        }

        public Criteria andAbac21GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC21 >=", value, "abac21");
            return (Criteria) this;
        }

        public Criteria andAbac21LessThan(String value) {
            addCriterion("ABAC21 <", value, "abac21");
            return (Criteria) this;
        }

        public Criteria andAbac21LessThanOrEqualTo(String value) {
            addCriterion("ABAC21 <=", value, "abac21");
            return (Criteria) this;
        }

        public Criteria andAbac21Like(String value) {
            addCriterion("ABAC21 like", value, "abac21");
            return (Criteria) this;
        }

        public Criteria andAbac21NotLike(String value) {
            addCriterion("ABAC21 not like", value, "abac21");
            return (Criteria) this;
        }

        public Criteria andAbac21In(List<String> values) {
            addCriterion("ABAC21 in", values, "abac21");
            return (Criteria) this;
        }

        public Criteria andAbac21NotIn(List<String> values) {
            addCriterion("ABAC21 not in", values, "abac21");
            return (Criteria) this;
        }

        public Criteria andAbac21Between(String value1, String value2) {
            addCriterion("ABAC21 between", value1, value2, "abac21");
            return (Criteria) this;
        }

        public Criteria andAbac21NotBetween(String value1, String value2) {
            addCriterion("ABAC21 not between", value1, value2, "abac21");
            return (Criteria) this;
        }

        public Criteria andAbac22IsNull() {
            addCriterion("ABAC22 is null");
            return (Criteria) this;
        }

        public Criteria andAbac22IsNotNull() {
            addCriterion("ABAC22 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac22EqualTo(String value) {
            addCriterion("ABAC22 =", value, "abac22");
            return (Criteria) this;
        }

        public Criteria andAbac22NotEqualTo(String value) {
            addCriterion("ABAC22 <>", value, "abac22");
            return (Criteria) this;
        }

        public Criteria andAbac22GreaterThan(String value) {
            addCriterion("ABAC22 >", value, "abac22");
            return (Criteria) this;
        }

        public Criteria andAbac22GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC22 >=", value, "abac22");
            return (Criteria) this;
        }

        public Criteria andAbac22LessThan(String value) {
            addCriterion("ABAC22 <", value, "abac22");
            return (Criteria) this;
        }

        public Criteria andAbac22LessThanOrEqualTo(String value) {
            addCriterion("ABAC22 <=", value, "abac22");
            return (Criteria) this;
        }

        public Criteria andAbac22Like(String value) {
            addCriterion("ABAC22 like", value, "abac22");
            return (Criteria) this;
        }

        public Criteria andAbac22NotLike(String value) {
            addCriterion("ABAC22 not like", value, "abac22");
            return (Criteria) this;
        }

        public Criteria andAbac22In(List<String> values) {
            addCriterion("ABAC22 in", values, "abac22");
            return (Criteria) this;
        }

        public Criteria andAbac22NotIn(List<String> values) {
            addCriterion("ABAC22 not in", values, "abac22");
            return (Criteria) this;
        }

        public Criteria andAbac22Between(String value1, String value2) {
            addCriterion("ABAC22 between", value1, value2, "abac22");
            return (Criteria) this;
        }

        public Criteria andAbac22NotBetween(String value1, String value2) {
            addCriterion("ABAC22 not between", value1, value2, "abac22");
            return (Criteria) this;
        }

        public Criteria andAbac23IsNull() {
            addCriterion("ABAC23 is null");
            return (Criteria) this;
        }

        public Criteria andAbac23IsNotNull() {
            addCriterion("ABAC23 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac23EqualTo(String value) {
            addCriterion("ABAC23 =", value, "abac23");
            return (Criteria) this;
        }

        public Criteria andAbac23NotEqualTo(String value) {
            addCriterion("ABAC23 <>", value, "abac23");
            return (Criteria) this;
        }

        public Criteria andAbac23GreaterThan(String value) {
            addCriterion("ABAC23 >", value, "abac23");
            return (Criteria) this;
        }

        public Criteria andAbac23GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC23 >=", value, "abac23");
            return (Criteria) this;
        }

        public Criteria andAbac23LessThan(String value) {
            addCriterion("ABAC23 <", value, "abac23");
            return (Criteria) this;
        }

        public Criteria andAbac23LessThanOrEqualTo(String value) {
            addCriterion("ABAC23 <=", value, "abac23");
            return (Criteria) this;
        }

        public Criteria andAbac23Like(String value) {
            addCriterion("ABAC23 like", value, "abac23");
            return (Criteria) this;
        }

        public Criteria andAbac23NotLike(String value) {
            addCriterion("ABAC23 not like", value, "abac23");
            return (Criteria) this;
        }

        public Criteria andAbac23In(List<String> values) {
            addCriterion("ABAC23 in", values, "abac23");
            return (Criteria) this;
        }

        public Criteria andAbac23NotIn(List<String> values) {
            addCriterion("ABAC23 not in", values, "abac23");
            return (Criteria) this;
        }

        public Criteria andAbac23Between(String value1, String value2) {
            addCriterion("ABAC23 between", value1, value2, "abac23");
            return (Criteria) this;
        }

        public Criteria andAbac23NotBetween(String value1, String value2) {
            addCriterion("ABAC23 not between", value1, value2, "abac23");
            return (Criteria) this;
        }

        public Criteria andAbac24IsNull() {
            addCriterion("ABAC24 is null");
            return (Criteria) this;
        }

        public Criteria andAbac24IsNotNull() {
            addCriterion("ABAC24 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac24EqualTo(String value) {
            addCriterion("ABAC24 =", value, "abac24");
            return (Criteria) this;
        }

        public Criteria andAbac24NotEqualTo(String value) {
            addCriterion("ABAC24 <>", value, "abac24");
            return (Criteria) this;
        }

        public Criteria andAbac24GreaterThan(String value) {
            addCriterion("ABAC24 >", value, "abac24");
            return (Criteria) this;
        }

        public Criteria andAbac24GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC24 >=", value, "abac24");
            return (Criteria) this;
        }

        public Criteria andAbac24LessThan(String value) {
            addCriterion("ABAC24 <", value, "abac24");
            return (Criteria) this;
        }

        public Criteria andAbac24LessThanOrEqualTo(String value) {
            addCriterion("ABAC24 <=", value, "abac24");
            return (Criteria) this;
        }

        public Criteria andAbac24Like(String value) {
            addCriterion("ABAC24 like", value, "abac24");
            return (Criteria) this;
        }

        public Criteria andAbac24NotLike(String value) {
            addCriterion("ABAC24 not like", value, "abac24");
            return (Criteria) this;
        }

        public Criteria andAbac24In(List<String> values) {
            addCriterion("ABAC24 in", values, "abac24");
            return (Criteria) this;
        }

        public Criteria andAbac24NotIn(List<String> values) {
            addCriterion("ABAC24 not in", values, "abac24");
            return (Criteria) this;
        }

        public Criteria andAbac24Between(String value1, String value2) {
            addCriterion("ABAC24 between", value1, value2, "abac24");
            return (Criteria) this;
        }

        public Criteria andAbac24NotBetween(String value1, String value2) {
            addCriterion("ABAC24 not between", value1, value2, "abac24");
            return (Criteria) this;
        }

        public Criteria andAbac25IsNull() {
            addCriterion("ABAC25 is null");
            return (Criteria) this;
        }

        public Criteria andAbac25IsNotNull() {
            addCriterion("ABAC25 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac25EqualTo(String value) {
            addCriterion("ABAC25 =", value, "abac25");
            return (Criteria) this;
        }

        public Criteria andAbac25NotEqualTo(String value) {
            addCriterion("ABAC25 <>", value, "abac25");
            return (Criteria) this;
        }

        public Criteria andAbac25GreaterThan(String value) {
            addCriterion("ABAC25 >", value, "abac25");
            return (Criteria) this;
        }

        public Criteria andAbac25GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC25 >=", value, "abac25");
            return (Criteria) this;
        }

        public Criteria andAbac25LessThan(String value) {
            addCriterion("ABAC25 <", value, "abac25");
            return (Criteria) this;
        }

        public Criteria andAbac25LessThanOrEqualTo(String value) {
            addCriterion("ABAC25 <=", value, "abac25");
            return (Criteria) this;
        }

        public Criteria andAbac25Like(String value) {
            addCriterion("ABAC25 like", value, "abac25");
            return (Criteria) this;
        }

        public Criteria andAbac25NotLike(String value) {
            addCriterion("ABAC25 not like", value, "abac25");
            return (Criteria) this;
        }

        public Criteria andAbac25In(List<String> values) {
            addCriterion("ABAC25 in", values, "abac25");
            return (Criteria) this;
        }

        public Criteria andAbac25NotIn(List<String> values) {
            addCriterion("ABAC25 not in", values, "abac25");
            return (Criteria) this;
        }

        public Criteria andAbac25Between(String value1, String value2) {
            addCriterion("ABAC25 between", value1, value2, "abac25");
            return (Criteria) this;
        }

        public Criteria andAbac25NotBetween(String value1, String value2) {
            addCriterion("ABAC25 not between", value1, value2, "abac25");
            return (Criteria) this;
        }

        public Criteria andAbac26IsNull() {
            addCriterion("ABAC26 is null");
            return (Criteria) this;
        }

        public Criteria andAbac26IsNotNull() {
            addCriterion("ABAC26 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac26EqualTo(String value) {
            addCriterion("ABAC26 =", value, "abac26");
            return (Criteria) this;
        }

        public Criteria andAbac26NotEqualTo(String value) {
            addCriterion("ABAC26 <>", value, "abac26");
            return (Criteria) this;
        }

        public Criteria andAbac26GreaterThan(String value) {
            addCriterion("ABAC26 >", value, "abac26");
            return (Criteria) this;
        }

        public Criteria andAbac26GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC26 >=", value, "abac26");
            return (Criteria) this;
        }

        public Criteria andAbac26LessThan(String value) {
            addCriterion("ABAC26 <", value, "abac26");
            return (Criteria) this;
        }

        public Criteria andAbac26LessThanOrEqualTo(String value) {
            addCriterion("ABAC26 <=", value, "abac26");
            return (Criteria) this;
        }

        public Criteria andAbac26Like(String value) {
            addCriterion("ABAC26 like", value, "abac26");
            return (Criteria) this;
        }

        public Criteria andAbac26NotLike(String value) {
            addCriterion("ABAC26 not like", value, "abac26");
            return (Criteria) this;
        }

        public Criteria andAbac26In(List<String> values) {
            addCriterion("ABAC26 in", values, "abac26");
            return (Criteria) this;
        }

        public Criteria andAbac26NotIn(List<String> values) {
            addCriterion("ABAC26 not in", values, "abac26");
            return (Criteria) this;
        }

        public Criteria andAbac26Between(String value1, String value2) {
            addCriterion("ABAC26 between", value1, value2, "abac26");
            return (Criteria) this;
        }

        public Criteria andAbac26NotBetween(String value1, String value2) {
            addCriterion("ABAC26 not between", value1, value2, "abac26");
            return (Criteria) this;
        }

        public Criteria andAbac27IsNull() {
            addCriterion("ABAC27 is null");
            return (Criteria) this;
        }

        public Criteria andAbac27IsNotNull() {
            addCriterion("ABAC27 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac27EqualTo(String value) {
            addCriterion("ABAC27 =", value, "abac27");
            return (Criteria) this;
        }

        public Criteria andAbac27NotEqualTo(String value) {
            addCriterion("ABAC27 <>", value, "abac27");
            return (Criteria) this;
        }

        public Criteria andAbac27GreaterThan(String value) {
            addCriterion("ABAC27 >", value, "abac27");
            return (Criteria) this;
        }

        public Criteria andAbac27GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC27 >=", value, "abac27");
            return (Criteria) this;
        }

        public Criteria andAbac27LessThan(String value) {
            addCriterion("ABAC27 <", value, "abac27");
            return (Criteria) this;
        }

        public Criteria andAbac27LessThanOrEqualTo(String value) {
            addCriterion("ABAC27 <=", value, "abac27");
            return (Criteria) this;
        }

        public Criteria andAbac27Like(String value) {
            addCriterion("ABAC27 like", value, "abac27");
            return (Criteria) this;
        }

        public Criteria andAbac27NotLike(String value) {
            addCriterion("ABAC27 not like", value, "abac27");
            return (Criteria) this;
        }

        public Criteria andAbac27In(List<String> values) {
            addCriterion("ABAC27 in", values, "abac27");
            return (Criteria) this;
        }

        public Criteria andAbac27NotIn(List<String> values) {
            addCriterion("ABAC27 not in", values, "abac27");
            return (Criteria) this;
        }

        public Criteria andAbac27Between(String value1, String value2) {
            addCriterion("ABAC27 between", value1, value2, "abac27");
            return (Criteria) this;
        }

        public Criteria andAbac27NotBetween(String value1, String value2) {
            addCriterion("ABAC27 not between", value1, value2, "abac27");
            return (Criteria) this;
        }

        public Criteria andAbac28IsNull() {
            addCriterion("ABAC28 is null");
            return (Criteria) this;
        }

        public Criteria andAbac28IsNotNull() {
            addCriterion("ABAC28 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac28EqualTo(String value) {
            addCriterion("ABAC28 =", value, "abac28");
            return (Criteria) this;
        }

        public Criteria andAbac28NotEqualTo(String value) {
            addCriterion("ABAC28 <>", value, "abac28");
            return (Criteria) this;
        }

        public Criteria andAbac28GreaterThan(String value) {
            addCriterion("ABAC28 >", value, "abac28");
            return (Criteria) this;
        }

        public Criteria andAbac28GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC28 >=", value, "abac28");
            return (Criteria) this;
        }

        public Criteria andAbac28LessThan(String value) {
            addCriterion("ABAC28 <", value, "abac28");
            return (Criteria) this;
        }

        public Criteria andAbac28LessThanOrEqualTo(String value) {
            addCriterion("ABAC28 <=", value, "abac28");
            return (Criteria) this;
        }

        public Criteria andAbac28Like(String value) {
            addCriterion("ABAC28 like", value, "abac28");
            return (Criteria) this;
        }

        public Criteria andAbac28NotLike(String value) {
            addCriterion("ABAC28 not like", value, "abac28");
            return (Criteria) this;
        }

        public Criteria andAbac28In(List<String> values) {
            addCriterion("ABAC28 in", values, "abac28");
            return (Criteria) this;
        }

        public Criteria andAbac28NotIn(List<String> values) {
            addCriterion("ABAC28 not in", values, "abac28");
            return (Criteria) this;
        }

        public Criteria andAbac28Between(String value1, String value2) {
            addCriterion("ABAC28 between", value1, value2, "abac28");
            return (Criteria) this;
        }

        public Criteria andAbac28NotBetween(String value1, String value2) {
            addCriterion("ABAC28 not between", value1, value2, "abac28");
            return (Criteria) this;
        }

        public Criteria andAbac29IsNull() {
            addCriterion("ABAC29 is null");
            return (Criteria) this;
        }

        public Criteria andAbac29IsNotNull() {
            addCriterion("ABAC29 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac29EqualTo(String value) {
            addCriterion("ABAC29 =", value, "abac29");
            return (Criteria) this;
        }

        public Criteria andAbac29NotEqualTo(String value) {
            addCriterion("ABAC29 <>", value, "abac29");
            return (Criteria) this;
        }

        public Criteria andAbac29GreaterThan(String value) {
            addCriterion("ABAC29 >", value, "abac29");
            return (Criteria) this;
        }

        public Criteria andAbac29GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC29 >=", value, "abac29");
            return (Criteria) this;
        }

        public Criteria andAbac29LessThan(String value) {
            addCriterion("ABAC29 <", value, "abac29");
            return (Criteria) this;
        }

        public Criteria andAbac29LessThanOrEqualTo(String value) {
            addCriterion("ABAC29 <=", value, "abac29");
            return (Criteria) this;
        }

        public Criteria andAbac29Like(String value) {
            addCriterion("ABAC29 like", value, "abac29");
            return (Criteria) this;
        }

        public Criteria andAbac29NotLike(String value) {
            addCriterion("ABAC29 not like", value, "abac29");
            return (Criteria) this;
        }

        public Criteria andAbac29In(List<String> values) {
            addCriterion("ABAC29 in", values, "abac29");
            return (Criteria) this;
        }

        public Criteria andAbac29NotIn(List<String> values) {
            addCriterion("ABAC29 not in", values, "abac29");
            return (Criteria) this;
        }

        public Criteria andAbac29Between(String value1, String value2) {
            addCriterion("ABAC29 between", value1, value2, "abac29");
            return (Criteria) this;
        }

        public Criteria andAbac29NotBetween(String value1, String value2) {
            addCriterion("ABAC29 not between", value1, value2, "abac29");
            return (Criteria) this;
        }

        public Criteria andAbac30IsNull() {
            addCriterion("ABAC30 is null");
            return (Criteria) this;
        }

        public Criteria andAbac30IsNotNull() {
            addCriterion("ABAC30 is not null");
            return (Criteria) this;
        }

        public Criteria andAbac30EqualTo(String value) {
            addCriterion("ABAC30 =", value, "abac30");
            return (Criteria) this;
        }

        public Criteria andAbac30NotEqualTo(String value) {
            addCriterion("ABAC30 <>", value, "abac30");
            return (Criteria) this;
        }

        public Criteria andAbac30GreaterThan(String value) {
            addCriterion("ABAC30 >", value, "abac30");
            return (Criteria) this;
        }

        public Criteria andAbac30GreaterThanOrEqualTo(String value) {
            addCriterion("ABAC30 >=", value, "abac30");
            return (Criteria) this;
        }

        public Criteria andAbac30LessThan(String value) {
            addCriterion("ABAC30 <", value, "abac30");
            return (Criteria) this;
        }

        public Criteria andAbac30LessThanOrEqualTo(String value) {
            addCriterion("ABAC30 <=", value, "abac30");
            return (Criteria) this;
        }

        public Criteria andAbac30Like(String value) {
            addCriterion("ABAC30 like", value, "abac30");
            return (Criteria) this;
        }

        public Criteria andAbac30NotLike(String value) {
            addCriterion("ABAC30 not like", value, "abac30");
            return (Criteria) this;
        }

        public Criteria andAbac30In(List<String> values) {
            addCriterion("ABAC30 in", values, "abac30");
            return (Criteria) this;
        }

        public Criteria andAbac30NotIn(List<String> values) {
            addCriterion("ABAC30 not in", values, "abac30");
            return (Criteria) this;
        }

        public Criteria andAbac30Between(String value1, String value2) {
            addCriterion("ABAC30 between", value1, value2, "abac30");
            return (Criteria) this;
        }

        public Criteria andAbac30NotBetween(String value1, String value2) {
            addCriterion("ABAC30 not between", value1, value2, "abac30");
            return (Criteria) this;
        }

        public Criteria andAicustsIsNull() {
            addCriterion("AICUSTS is null");
            return (Criteria) this;
        }

        public Criteria andAicustsIsNotNull() {
            addCriterion("AICUSTS is not null");
            return (Criteria) this;
        }

        public Criteria andAicustsEqualTo(String value) {
            addCriterion("AICUSTS =", value, "aicusts");
            return (Criteria) this;
        }

        public Criteria andAicustsNotEqualTo(String value) {
            addCriterion("AICUSTS <>", value, "aicusts");
            return (Criteria) this;
        }

        public Criteria andAicustsGreaterThan(String value) {
            addCriterion("AICUSTS >", value, "aicusts");
            return (Criteria) this;
        }

        public Criteria andAicustsGreaterThanOrEqualTo(String value) {
            addCriterion("AICUSTS >=", value, "aicusts");
            return (Criteria) this;
        }

        public Criteria andAicustsLessThan(String value) {
            addCriterion("AICUSTS <", value, "aicusts");
            return (Criteria) this;
        }

        public Criteria andAicustsLessThanOrEqualTo(String value) {
            addCriterion("AICUSTS <=", value, "aicusts");
            return (Criteria) this;
        }

        public Criteria andAicustsLike(String value) {
            addCriterion("AICUSTS like", value, "aicusts");
            return (Criteria) this;
        }

        public Criteria andAicustsNotLike(String value) {
            addCriterion("AICUSTS not like", value, "aicusts");
            return (Criteria) this;
        }

        public Criteria andAicustsIn(List<String> values) {
            addCriterion("AICUSTS in", values, "aicusts");
            return (Criteria) this;
        }

        public Criteria andAicustsNotIn(List<String> values) {
            addCriterion("AICUSTS not in", values, "aicusts");
            return (Criteria) this;
        }

        public Criteria andAicustsBetween(String value1, String value2) {
            addCriterion("AICUSTS between", value1, value2, "aicusts");
            return (Criteria) this;
        }

        public Criteria andAicustsNotBetween(String value1, String value2) {
            addCriterion("AICUSTS not between", value1, value2, "aicusts");
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

        public Criteria andTaxIsNull() {
            addCriterion("TAX is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("TAX is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(String value) {
            addCriterion("TAX =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(String value) {
            addCriterion("TAX <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(String value) {
            addCriterion("TAX >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(String value) {
            addCriterion("TAX >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(String value) {
            addCriterion("TAX <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(String value) {
            addCriterion("TAX <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<String> values) {
            addCriterion("TAX in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<String> values) {
            addCriterion("TAX not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(String value1, String value2) {
            addCriterion("TAX between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(String value1, String value2) {
            addCriterion("TAX not between", value1, value2, "tax");
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