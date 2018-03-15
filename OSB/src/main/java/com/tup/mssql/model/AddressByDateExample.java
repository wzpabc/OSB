package com.tup.mssql.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AddressByDateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressByDateExample() {
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

        public Criteria andAlan8IsNull() {
            addCriterion("ALAN8 is null");
            return (Criteria) this;
        }

        public Criteria andAlan8IsNotNull() {
            addCriterion("ALAN8 is not null");
            return (Criteria) this;
        }

        public Criteria andAlan8EqualTo(Integer value) {
            addCriterion("ALAN8 =", value, "alan8");
            return (Criteria) this;
        }

        public Criteria andAlan8NotEqualTo(Integer value) {
            addCriterion("ALAN8 <>", value, "alan8");
            return (Criteria) this;
        }

        public Criteria andAlan8GreaterThan(Integer value) {
            addCriterion("ALAN8 >", value, "alan8");
            return (Criteria) this;
        }

        public Criteria andAlan8GreaterThanOrEqualTo(Integer value) {
            addCriterion("ALAN8 >=", value, "alan8");
            return (Criteria) this;
        }

        public Criteria andAlan8LessThan(Integer value) {
            addCriterion("ALAN8 <", value, "alan8");
            return (Criteria) this;
        }

        public Criteria andAlan8LessThanOrEqualTo(Integer value) {
            addCriterion("ALAN8 <=", value, "alan8");
            return (Criteria) this;
        }

        public Criteria andAlan8In(List<Integer> values) {
            addCriterion("ALAN8 in", values, "alan8");
            return (Criteria) this;
        }

        public Criteria andAlan8NotIn(List<Integer> values) {
            addCriterion("ALAN8 not in", values, "alan8");
            return (Criteria) this;
        }

        public Criteria andAlan8Between(Integer value1, Integer value2) {
            addCriterion("ALAN8 between", value1, value2, "alan8");
            return (Criteria) this;
        }

        public Criteria andAlan8NotBetween(Integer value1, Integer value2) {
            addCriterion("ALAN8 not between", value1, value2, "alan8");
            return (Criteria) this;
        }

        public Criteria andAleftbIsNull() {
            addCriterion("ALEFTB is null");
            return (Criteria) this;
        }

        public Criteria andAleftbIsNotNull() {
            addCriterion("ALEFTB is not null");
            return (Criteria) this;
        }

        public Criteria andAleftbEqualTo(Date value) {
            addCriterionForJDBCDate("ALEFTB =", value, "aleftb");
            return (Criteria) this;
        }

        public Criteria andAleftbNotEqualTo(Date value) {
            addCriterionForJDBCDate("ALEFTB <>", value, "aleftb");
            return (Criteria) this;
        }

        public Criteria andAleftbGreaterThan(Date value) {
            addCriterionForJDBCDate("ALEFTB >", value, "aleftb");
            return (Criteria) this;
        }

        public Criteria andAleftbGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ALEFTB >=", value, "aleftb");
            return (Criteria) this;
        }

        public Criteria andAleftbLessThan(Date value) {
            addCriterionForJDBCDate("ALEFTB <", value, "aleftb");
            return (Criteria) this;
        }

        public Criteria andAleftbLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ALEFTB <=", value, "aleftb");
            return (Criteria) this;
        }

        public Criteria andAleftbIn(List<Date> values) {
            addCriterionForJDBCDate("ALEFTB in", values, "aleftb");
            return (Criteria) this;
        }

        public Criteria andAleftbNotIn(List<Date> values) {
            addCriterionForJDBCDate("ALEFTB not in", values, "aleftb");
            return (Criteria) this;
        }

        public Criteria andAleftbBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ALEFTB between", value1, value2, "aleftb");
            return (Criteria) this;
        }

        public Criteria andAleftbNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ALEFTB not between", value1, value2, "aleftb");
            return (Criteria) this;
        }

        public Criteria andAleftfIsNull() {
            addCriterion("ALEFTF is null");
            return (Criteria) this;
        }

        public Criteria andAleftfIsNotNull() {
            addCriterion("ALEFTF is not null");
            return (Criteria) this;
        }

        public Criteria andAleftfEqualTo(Date value) {
            addCriterionForJDBCDate("ALEFTF =", value, "aleftf");
            return (Criteria) this;
        }

        public Criteria andAleftfNotEqualTo(Date value) {
            addCriterionForJDBCDate("ALEFTF <>", value, "aleftf");
            return (Criteria) this;
        }

        public Criteria andAleftfGreaterThan(Date value) {
            addCriterionForJDBCDate("ALEFTF >", value, "aleftf");
            return (Criteria) this;
        }

        public Criteria andAleftfGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ALEFTF >=", value, "aleftf");
            return (Criteria) this;
        }

        public Criteria andAleftfLessThan(Date value) {
            addCriterionForJDBCDate("ALEFTF <", value, "aleftf");
            return (Criteria) this;
        }

        public Criteria andAleftfLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ALEFTF <=", value, "aleftf");
            return (Criteria) this;
        }

        public Criteria andAleftfIn(List<Date> values) {
            addCriterionForJDBCDate("ALEFTF in", values, "aleftf");
            return (Criteria) this;
        }

        public Criteria andAleftfNotIn(List<Date> values) {
            addCriterionForJDBCDate("ALEFTF not in", values, "aleftf");
            return (Criteria) this;
        }

        public Criteria andAleftfBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ALEFTF between", value1, value2, "aleftf");
            return (Criteria) this;
        }

        public Criteria andAleftfNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ALEFTF not between", value1, value2, "aleftf");
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

        public Criteria andAladdzEqualTo(String value) {
            addCriterion("ALADDZ =", value, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAladdzNotEqualTo(String value) {
            addCriterion("ALADDZ <>", value, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAladdzGreaterThan(String value) {
            addCriterion("ALADDZ >", value, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAladdzGreaterThanOrEqualTo(String value) {
            addCriterion("ALADDZ >=", value, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAladdzLessThan(String value) {
            addCriterion("ALADDZ <", value, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAladdzLessThanOrEqualTo(String value) {
            addCriterion("ALADDZ <=", value, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAladdzLike(String value) {
            addCriterion("ALADDZ like", value, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAladdzNotLike(String value) {
            addCriterion("ALADDZ not like", value, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAladdzIn(List<String> values) {
            addCriterion("ALADDZ in", values, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAladdzNotIn(List<String> values) {
            addCriterion("ALADDZ not in", values, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAladdzBetween(String value1, String value2) {
            addCriterion("ALADDZ between", value1, value2, "aladdz");
            return (Criteria) this;
        }

        public Criteria andAladdzNotBetween(String value1, String value2) {
            addCriterion("ALADDZ not between", value1, value2, "aladdz");
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

        public Criteria andAlcounIsNull() {
            addCriterion("ALCOUN is null");
            return (Criteria) this;
        }

        public Criteria andAlcounIsNotNull() {
            addCriterion("ALCOUN is not null");
            return (Criteria) this;
        }

        public Criteria andAlcounEqualTo(String value) {
            addCriterion("ALCOUN =", value, "alcoun");
            return (Criteria) this;
        }

        public Criteria andAlcounNotEqualTo(String value) {
            addCriterion("ALCOUN <>", value, "alcoun");
            return (Criteria) this;
        }

        public Criteria andAlcounGreaterThan(String value) {
            addCriterion("ALCOUN >", value, "alcoun");
            return (Criteria) this;
        }

        public Criteria andAlcounGreaterThanOrEqualTo(String value) {
            addCriterion("ALCOUN >=", value, "alcoun");
            return (Criteria) this;
        }

        public Criteria andAlcounLessThan(String value) {
            addCriterion("ALCOUN <", value, "alcoun");
            return (Criteria) this;
        }

        public Criteria andAlcounLessThanOrEqualTo(String value) {
            addCriterion("ALCOUN <=", value, "alcoun");
            return (Criteria) this;
        }

        public Criteria andAlcounIn(List<String> values) {
            addCriterion("ALCOUN in", values, "alcoun");
            return (Criteria) this;
        }

        public Criteria andAlcounNotIn(List<String> values) {
            addCriterion("ALCOUN not in", values, "alcoun");
            return (Criteria) this;
        }

        public Criteria andAlcounBetween(String value1, String value2) {
            addCriterion("ALCOUN between", value1, value2, "alcoun");
            return (Criteria) this;
        }

        public Criteria andAlcounNotBetween(String value1, String value2) {
            addCriterion("ALCOUN not between", value1, value2, "alcoun");
            return (Criteria) this;
        }

        public Criteria andAladdsIsNull() {
            addCriterion("ALADDS is null");
            return (Criteria) this;
        }

        public Criteria andAladdsIsNotNull() {
            addCriterion("ALADDS is not null");
            return (Criteria) this;
        }

        public Criteria andAladdsEqualTo(String value) {
            addCriterion("ALADDS =", value, "aladds");
            return (Criteria) this;
        }

        public Criteria andAladdsNotEqualTo(String value) {
            addCriterion("ALADDS <>", value, "aladds");
            return (Criteria) this;
        }

        public Criteria andAladdsGreaterThan(String value) {
            addCriterion("ALADDS >", value, "aladds");
            return (Criteria) this;
        }

        public Criteria andAladdsGreaterThanOrEqualTo(String value) {
            addCriterion("ALADDS >=", value, "aladds");
            return (Criteria) this;
        }

        public Criteria andAladdsLessThan(String value) {
            addCriterion("ALADDS <", value, "aladds");
            return (Criteria) this;
        }

        public Criteria andAladdsLessThanOrEqualTo(String value) {
            addCriterion("ALADDS <=", value, "aladds");
            return (Criteria) this;
        }

        public Criteria andAladdsLike(String value) {
            addCriterion("ALADDS like", value, "aladds");
            return (Criteria) this;
        }

        public Criteria andAladdsNotLike(String value) {
            addCriterion("ALADDS not like", value, "aladds");
            return (Criteria) this;
        }

        public Criteria andAladdsIn(List<String> values) {
            addCriterion("ALADDS in", values, "aladds");
            return (Criteria) this;
        }

        public Criteria andAladdsNotIn(List<String> values) {
            addCriterion("ALADDS not in", values, "aladds");
            return (Criteria) this;
        }

        public Criteria andAladdsBetween(String value1, String value2) {
            addCriterion("ALADDS between", value1, value2, "aladds");
            return (Criteria) this;
        }

        public Criteria andAladdsNotBetween(String value1, String value2) {
            addCriterion("ALADDS not between", value1, value2, "aladds");
            return (Criteria) this;
        }

        public Criteria andAlcrteIsNull() {
            addCriterion("ALCRTE is null");
            return (Criteria) this;
        }

        public Criteria andAlcrteIsNotNull() {
            addCriterion("ALCRTE is not null");
            return (Criteria) this;
        }

        public Criteria andAlcrteEqualTo(String value) {
            addCriterion("ALCRTE =", value, "alcrte");
            return (Criteria) this;
        }

        public Criteria andAlcrteNotEqualTo(String value) {
            addCriterion("ALCRTE <>", value, "alcrte");
            return (Criteria) this;
        }

        public Criteria andAlcrteGreaterThan(String value) {
            addCriterion("ALCRTE >", value, "alcrte");
            return (Criteria) this;
        }

        public Criteria andAlcrteGreaterThanOrEqualTo(String value) {
            addCriterion("ALCRTE >=", value, "alcrte");
            return (Criteria) this;
        }

        public Criteria andAlcrteLessThan(String value) {
            addCriterion("ALCRTE <", value, "alcrte");
            return (Criteria) this;
        }

        public Criteria andAlcrteLessThanOrEqualTo(String value) {
            addCriterion("ALCRTE <=", value, "alcrte");
            return (Criteria) this;
        }

        public Criteria andAlcrteLike(String value) {
            addCriterion("ALCRTE like", value, "alcrte");
            return (Criteria) this;
        }

        public Criteria andAlcrteNotLike(String value) {
            addCriterion("ALCRTE not like", value, "alcrte");
            return (Criteria) this;
        }

        public Criteria andAlcrteIn(List<String> values) {
            addCriterion("ALCRTE in", values, "alcrte");
            return (Criteria) this;
        }

        public Criteria andAlcrteNotIn(List<String> values) {
            addCriterion("ALCRTE not in", values, "alcrte");
            return (Criteria) this;
        }

        public Criteria andAlcrteBetween(String value1, String value2) {
            addCriterion("ALCRTE between", value1, value2, "alcrte");
            return (Criteria) this;
        }

        public Criteria andAlcrteNotBetween(String value1, String value2) {
            addCriterion("ALCRTE not between", value1, value2, "alcrte");
            return (Criteria) this;
        }

        public Criteria andAlbkmlIsNull() {
            addCriterion("ALBKML is null");
            return (Criteria) this;
        }

        public Criteria andAlbkmlIsNotNull() {
            addCriterion("ALBKML is not null");
            return (Criteria) this;
        }

        public Criteria andAlbkmlEqualTo(String value) {
            addCriterion("ALBKML =", value, "albkml");
            return (Criteria) this;
        }

        public Criteria andAlbkmlNotEqualTo(String value) {
            addCriterion("ALBKML <>", value, "albkml");
            return (Criteria) this;
        }

        public Criteria andAlbkmlGreaterThan(String value) {
            addCriterion("ALBKML >", value, "albkml");
            return (Criteria) this;
        }

        public Criteria andAlbkmlGreaterThanOrEqualTo(String value) {
            addCriterion("ALBKML >=", value, "albkml");
            return (Criteria) this;
        }

        public Criteria andAlbkmlLessThan(String value) {
            addCriterion("ALBKML <", value, "albkml");
            return (Criteria) this;
        }

        public Criteria andAlbkmlLessThanOrEqualTo(String value) {
            addCriterion("ALBKML <=", value, "albkml");
            return (Criteria) this;
        }

        public Criteria andAlbkmlLike(String value) {
            addCriterion("ALBKML like", value, "albkml");
            return (Criteria) this;
        }

        public Criteria andAlbkmlNotLike(String value) {
            addCriterion("ALBKML not like", value, "albkml");
            return (Criteria) this;
        }

        public Criteria andAlbkmlIn(List<String> values) {
            addCriterion("ALBKML in", values, "albkml");
            return (Criteria) this;
        }

        public Criteria andAlbkmlNotIn(List<String> values) {
            addCriterion("ALBKML not in", values, "albkml");
            return (Criteria) this;
        }

        public Criteria andAlbkmlBetween(String value1, String value2) {
            addCriterion("ALBKML between", value1, value2, "albkml");
            return (Criteria) this;
        }

        public Criteria andAlbkmlNotBetween(String value1, String value2) {
            addCriterion("ALBKML not between", value1, value2, "albkml");
            return (Criteria) this;
        }

        public Criteria andAlctrIsNull() {
            addCriterion("ALCTR is null");
            return (Criteria) this;
        }

        public Criteria andAlctrIsNotNull() {
            addCriterion("ALCTR is not null");
            return (Criteria) this;
        }

        public Criteria andAlctrEqualTo(String value) {
            addCriterion("ALCTR =", value, "alctr");
            return (Criteria) this;
        }

        public Criteria andAlctrNotEqualTo(String value) {
            addCriterion("ALCTR <>", value, "alctr");
            return (Criteria) this;
        }

        public Criteria andAlctrGreaterThan(String value) {
            addCriterion("ALCTR >", value, "alctr");
            return (Criteria) this;
        }

        public Criteria andAlctrGreaterThanOrEqualTo(String value) {
            addCriterion("ALCTR >=", value, "alctr");
            return (Criteria) this;
        }

        public Criteria andAlctrLessThan(String value) {
            addCriterion("ALCTR <", value, "alctr");
            return (Criteria) this;
        }

        public Criteria andAlctrLessThanOrEqualTo(String value) {
            addCriterion("ALCTR <=", value, "alctr");
            return (Criteria) this;
        }

        public Criteria andAlctrLike(String value) {
            addCriterion("ALCTR like", value, "alctr");
            return (Criteria) this;
        }

        public Criteria andAlctrNotLike(String value) {
            addCriterion("ALCTR not like", value, "alctr");
            return (Criteria) this;
        }

        public Criteria andAlctrIn(List<String> values) {
            addCriterion("ALCTR in", values, "alctr");
            return (Criteria) this;
        }

        public Criteria andAlctrNotIn(List<String> values) {
            addCriterion("ALCTR not in", values, "alctr");
            return (Criteria) this;
        }

        public Criteria andAlctrBetween(String value1, String value2) {
            addCriterion("ALCTR between", value1, value2, "alctr");
            return (Criteria) this;
        }

        public Criteria andAlctrNotBetween(String value1, String value2) {
            addCriterion("ALCTR not between", value1, value2, "alctr");
            return (Criteria) this;
        }

        public Criteria andAluserIsNull() {
            addCriterion("ALUSER is null");
            return (Criteria) this;
        }

        public Criteria andAluserIsNotNull() {
            addCriterion("ALUSER is not null");
            return (Criteria) this;
        }

        public Criteria andAluserEqualTo(String value) {
            addCriterion("ALUSER =", value, "aluser");
            return (Criteria) this;
        }

        public Criteria andAluserNotEqualTo(String value) {
            addCriterion("ALUSER <>", value, "aluser");
            return (Criteria) this;
        }

        public Criteria andAluserGreaterThan(String value) {
            addCriterion("ALUSER >", value, "aluser");
            return (Criteria) this;
        }

        public Criteria andAluserGreaterThanOrEqualTo(String value) {
            addCriterion("ALUSER >=", value, "aluser");
            return (Criteria) this;
        }

        public Criteria andAluserLessThan(String value) {
            addCriterion("ALUSER <", value, "aluser");
            return (Criteria) this;
        }

        public Criteria andAluserLessThanOrEqualTo(String value) {
            addCriterion("ALUSER <=", value, "aluser");
            return (Criteria) this;
        }

        public Criteria andAluserLike(String value) {
            addCriterion("ALUSER like", value, "aluser");
            return (Criteria) this;
        }

        public Criteria andAluserNotLike(String value) {
            addCriterion("ALUSER not like", value, "aluser");
            return (Criteria) this;
        }

        public Criteria andAluserIn(List<String> values) {
            addCriterion("ALUSER in", values, "aluser");
            return (Criteria) this;
        }

        public Criteria andAluserNotIn(List<String> values) {
            addCriterion("ALUSER not in", values, "aluser");
            return (Criteria) this;
        }

        public Criteria andAluserBetween(String value1, String value2) {
            addCriterion("ALUSER between", value1, value2, "aluser");
            return (Criteria) this;
        }

        public Criteria andAluserNotBetween(String value1, String value2) {
            addCriterion("ALUSER not between", value1, value2, "aluser");
            return (Criteria) this;
        }

        public Criteria andAlupmjIsNull() {
            addCriterion("ALUPMJ is null");
            return (Criteria) this;
        }

        public Criteria andAlupmjIsNotNull() {
            addCriterion("ALUPMJ is not null");
            return (Criteria) this;
        }

        public Criteria andAlupmjEqualTo(Date value) {
            addCriterion("ALUPMJ =", value, "alupmj");
            return (Criteria) this;
        }

        public Criteria andAlupmjNotEqualTo(Date value) {
            addCriterion("ALUPMJ <>", value, "alupmj");
            return (Criteria) this;
        }

        public Criteria andAlupmjGreaterThan(Date value) {
            addCriterion("ALUPMJ >", value, "alupmj");
            return (Criteria) this;
        }

        public Criteria andAlupmjGreaterThanOrEqualTo(Date value) {
            addCriterion("ALUPMJ >=", value, "alupmj");
            return (Criteria) this;
        }

        public Criteria andAlupmjLessThan(Date value) {
            addCriterion("ALUPMJ <", value, "alupmj");
            return (Criteria) this;
        }

        public Criteria andAlupmjLessThanOrEqualTo(Date value) {
            addCriterion("ALUPMJ <=", value, "alupmj");
            return (Criteria) this;
        }

        public Criteria andAlupmjIn(List<Date> values) {
            addCriterion("ALUPMJ in", values, "alupmj");
            return (Criteria) this;
        }

        public Criteria andAlupmjNotIn(List<Date> values) {
            addCriterion("ALUPMJ not in", values, "alupmj");
            return (Criteria) this;
        }

        public Criteria andAlupmjBetween(Date value1, Date value2) {
            addCriterion("ALUPMJ between", value1, value2, "alupmj");
            return (Criteria) this;
        }

        public Criteria andAlupmjNotBetween(Date value1, Date value2) {
            addCriterion("ALUPMJ not between", value1, value2, "alupmj");
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

        public Criteria andMssProcessdateIsNull() {
            addCriterion("MSS_ProcessDate is null");
            return (Criteria) this;
        }

        public Criteria andMssProcessdateIsNotNull() {
            addCriterion("MSS_ProcessDate is not null");
            return (Criteria) this;
        }

        public Criteria andMssProcessdateEqualTo(Date value) {
            addCriterion("MSS_ProcessDate =", value, "mssProcessdate");
            return (Criteria) this;
        }

        public Criteria andMssProcessdateNotEqualTo(Date value) {
            addCriterion("MSS_ProcessDate <>", value, "mssProcessdate");
            return (Criteria) this;
        }

        public Criteria andMssProcessdateGreaterThan(Date value) {
            addCriterion("MSS_ProcessDate >", value, "mssProcessdate");
            return (Criteria) this;
        }

        public Criteria andMssProcessdateGreaterThanOrEqualTo(Date value) {
            addCriterion("MSS_ProcessDate >=", value, "mssProcessdate");
            return (Criteria) this;
        }

        public Criteria andMssProcessdateLessThan(Date value) {
            addCriterion("MSS_ProcessDate <", value, "mssProcessdate");
            return (Criteria) this;
        }

        public Criteria andMssProcessdateLessThanOrEqualTo(Date value) {
            addCriterion("MSS_ProcessDate <=", value, "mssProcessdate");
            return (Criteria) this;
        }

        public Criteria andMssProcessdateIn(List<Date> values) {
            addCriterion("MSS_ProcessDate in", values, "mssProcessdate");
            return (Criteria) this;
        }

        public Criteria andMssProcessdateNotIn(List<Date> values) {
            addCriterion("MSS_ProcessDate not in", values, "mssProcessdate");
            return (Criteria) this;
        }

        public Criteria andMssProcessdateBetween(Date value1, Date value2) {
            addCriterion("MSS_ProcessDate between", value1, value2, "mssProcessdate");
            return (Criteria) this;
        }

        public Criteria andMssProcessdateNotBetween(Date value1, Date value2) {
            addCriterion("MSS_ProcessDate not between", value1, value2, "mssProcessdate");
            return (Criteria) this;
        }

        public Criteria andMssFaildateIsNull() {
            addCriterion("MSS_FailDate is null");
            return (Criteria) this;
        }

        public Criteria andMssFaildateIsNotNull() {
            addCriterion("MSS_FailDate is not null");
            return (Criteria) this;
        }

        public Criteria andMssFaildateEqualTo(Date value) {
            addCriterion("MSS_FailDate =", value, "mssFaildate");
            return (Criteria) this;
        }

        public Criteria andMssFaildateNotEqualTo(Date value) {
            addCriterion("MSS_FailDate <>", value, "mssFaildate");
            return (Criteria) this;
        }

        public Criteria andMssFaildateGreaterThan(Date value) {
            addCriterion("MSS_FailDate >", value, "mssFaildate");
            return (Criteria) this;
        }

        public Criteria andMssFaildateGreaterThanOrEqualTo(Date value) {
            addCriterion("MSS_FailDate >=", value, "mssFaildate");
            return (Criteria) this;
        }

        public Criteria andMssFaildateLessThan(Date value) {
            addCriterion("MSS_FailDate <", value, "mssFaildate");
            return (Criteria) this;
        }

        public Criteria andMssFaildateLessThanOrEqualTo(Date value) {
            addCriterion("MSS_FailDate <=", value, "mssFaildate");
            return (Criteria) this;
        }

        public Criteria andMssFaildateIn(List<Date> values) {
            addCriterion("MSS_FailDate in", values, "mssFaildate");
            return (Criteria) this;
        }

        public Criteria andMssFaildateNotIn(List<Date> values) {
            addCriterion("MSS_FailDate not in", values, "mssFaildate");
            return (Criteria) this;
        }

        public Criteria andMssFaildateBetween(Date value1, Date value2) {
            addCriterion("MSS_FailDate between", value1, value2, "mssFaildate");
            return (Criteria) this;
        }

        public Criteria andMssFaildateNotBetween(Date value1, Date value2) {
            addCriterion("MSS_FailDate not between", value1, value2, "mssFaildate");
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