package com.tup.mssql.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AddressAlternateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressAlternateExample() {
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

        public Criteria andWlidlnIsNull() {
            addCriterion("WLIDLN is null");
            return (Criteria) this;
        }

        public Criteria andWlidlnIsNotNull() {
            addCriterion("WLIDLN is not null");
            return (Criteria) this;
        }

        public Criteria andWlidlnEqualTo(Integer value) {
            addCriterion("WLIDLN =", value, "wlidln");
            return (Criteria) this;
        }

        public Criteria andWlidlnNotEqualTo(Integer value) {
            addCriterion("WLIDLN <>", value, "wlidln");
            return (Criteria) this;
        }

        public Criteria andWlidlnGreaterThan(Integer value) {
            addCriterion("WLIDLN >", value, "wlidln");
            return (Criteria) this;
        }

        public Criteria andWlidlnGreaterThanOrEqualTo(Integer value) {
            addCriterion("WLIDLN >=", value, "wlidln");
            return (Criteria) this;
        }

        public Criteria andWlidlnLessThan(Integer value) {
            addCriterion("WLIDLN <", value, "wlidln");
            return (Criteria) this;
        }

        public Criteria andWlidlnLessThanOrEqualTo(Integer value) {
            addCriterion("WLIDLN <=", value, "wlidln");
            return (Criteria) this;
        }

        public Criteria andWlidlnIn(List<Integer> values) {
            addCriterion("WLIDLN in", values, "wlidln");
            return (Criteria) this;
        }

        public Criteria andWlidlnNotIn(List<Integer> values) {
            addCriterion("WLIDLN not in", values, "wlidln");
            return (Criteria) this;
        }

        public Criteria andWlidlnBetween(Integer value1, Integer value2) {
            addCriterion("WLIDLN between", value1, value2, "wlidln");
            return (Criteria) this;
        }

        public Criteria andWlidlnNotBetween(Integer value1, Integer value2) {
            addCriterion("WLIDLN not between", value1, value2, "wlidln");
            return (Criteria) this;
        }

        public Criteria andAtan8IsNull() {
            addCriterion("ATAN8 is null");
            return (Criteria) this;
        }

        public Criteria andAtan8IsNotNull() {
            addCriterion("ATAN8 is not null");
            return (Criteria) this;
        }

        public Criteria andAtan8EqualTo(Integer value) {
            addCriterion("ATAN8 =", value, "atan8");
            return (Criteria) this;
        }

        public Criteria andAtan8NotEqualTo(Integer value) {
            addCriterion("ATAN8 <>", value, "atan8");
            return (Criteria) this;
        }

        public Criteria andAtan8GreaterThan(Integer value) {
            addCriterion("ATAN8 >", value, "atan8");
            return (Criteria) this;
        }

        public Criteria andAtan8GreaterThanOrEqualTo(Integer value) {
            addCriterion("ATAN8 >=", value, "atan8");
            return (Criteria) this;
        }

        public Criteria andAtan8LessThan(Integer value) {
            addCriterion("ATAN8 <", value, "atan8");
            return (Criteria) this;
        }

        public Criteria andAtan8LessThanOrEqualTo(Integer value) {
            addCriterion("ATAN8 <=", value, "atan8");
            return (Criteria) this;
        }

        public Criteria andAtan8In(List<Integer> values) {
            addCriterion("ATAN8 in", values, "atan8");
            return (Criteria) this;
        }

        public Criteria andAtan8NotIn(List<Integer> values) {
            addCriterion("ATAN8 not in", values, "atan8");
            return (Criteria) this;
        }

        public Criteria andAtan8Between(Integer value1, Integer value2) {
            addCriterion("ATAN8 between", value1, value2, "atan8");
            return (Criteria) this;
        }

        public Criteria andAtan8NotBetween(Integer value1, Integer value2) {
            addCriterion("ATAN8 not between", value1, value2, "atan8");
            return (Criteria) this;
        }

        public Criteria andEftbIsNull() {
            addCriterion("EFTB is null");
            return (Criteria) this;
        }

        public Criteria andEftbIsNotNull() {
            addCriterion("EFTB is not null");
            return (Criteria) this;
        }

        public Criteria andEftbEqualTo(Date value) {
            addCriterion("EFTB =", value, "eftb");
            return (Criteria) this;
        }

        public Criteria andEftbNotEqualTo(Date value) {
            addCriterion("EFTB <>", value, "eftb");
            return (Criteria) this;
        }

        public Criteria andEftbGreaterThan(Date value) {
            addCriterion("EFTB >", value, "eftb");
            return (Criteria) this;
        }

        public Criteria andEftbGreaterThanOrEqualTo(Date value) {
            addCriterion("EFTB >=", value, "eftb");
            return (Criteria) this;
        }

        public Criteria andEftbLessThan(Date value) {
            addCriterion("EFTB <", value, "eftb");
            return (Criteria) this;
        }

        public Criteria andEftbLessThanOrEqualTo(Date value) {
            addCriterion("EFTB <=", value, "eftb");
            return (Criteria) this;
        }

        public Criteria andEftbIn(List<Date> values) {
            addCriterion("EFTB in", values, "eftb");
            return (Criteria) this;
        }

        public Criteria andEftbNotIn(List<Date> values) {
            addCriterion("EFTB not in", values, "eftb");
            return (Criteria) this;
        }

        public Criteria andEftbBetween(Date value1, Date value2) {
            addCriterion("EFTB between", value1, value2, "eftb");
            return (Criteria) this;
        }

        public Criteria andEftbNotBetween(Date value1, Date value2) {
            addCriterion("EFTB not between", value1, value2, "eftb");
            return (Criteria) this;
        }

        public Criteria andAtypeIsNull() {
            addCriterion("ATYPE is null");
            return (Criteria) this;
        }

        public Criteria andAtypeIsNotNull() {
            addCriterion("ATYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAtypeEqualTo(String value) {
            addCriterion("ATYPE =", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeNotEqualTo(String value) {
            addCriterion("ATYPE <>", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeGreaterThan(String value) {
            addCriterion("ATYPE >", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ATYPE >=", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeLessThan(String value) {
            addCriterion("ATYPE <", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeLessThanOrEqualTo(String value) {
            addCriterion("ATYPE <=", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeIn(List<String> values) {
            addCriterion("ATYPE in", values, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeNotIn(List<String> values) {
            addCriterion("ATYPE not in", values, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeBetween(String value1, String value2) {
            addCriterion("ATYPE between", value1, value2, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeNotBetween(String value1, String value2) {
            addCriterion("ATYPE not between", value1, value2, "atype");
            return (Criteria) this;
        }

        public Criteria andAdd1IsNull() {
            addCriterion("ADD1 is null");
            return (Criteria) this;
        }

        public Criteria andAdd1IsNotNull() {
            addCriterion("ADD1 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd1EqualTo(String value) {
            addCriterion("ADD1 =", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1NotEqualTo(String value) {
            addCriterion("ADD1 <>", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1GreaterThan(String value) {
            addCriterion("ADD1 >", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1GreaterThanOrEqualTo(String value) {
            addCriterion("ADD1 >=", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1LessThan(String value) {
            addCriterion("ADD1 <", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1LessThanOrEqualTo(String value) {
            addCriterion("ADD1 <=", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1In(List<String> values) {
            addCriterion("ADD1 in", values, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1NotIn(List<String> values) {
            addCriterion("ADD1 not in", values, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1Between(String value1, String value2) {
            addCriterion("ADD1 between", value1, value2, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1NotBetween(String value1, String value2) {
            addCriterion("ADD1 not between", value1, value2, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd2IsNull() {
            addCriterion("ADD2 is null");
            return (Criteria) this;
        }

        public Criteria andAdd2IsNotNull() {
            addCriterion("ADD2 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd2EqualTo(String value) {
            addCriterion("ADD2 =", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2NotEqualTo(String value) {
            addCriterion("ADD2 <>", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2GreaterThan(String value) {
            addCriterion("ADD2 >", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2GreaterThanOrEqualTo(String value) {
            addCriterion("ADD2 >=", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2LessThan(String value) {
            addCriterion("ADD2 <", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2LessThanOrEqualTo(String value) {
            addCriterion("ADD2 <=", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2In(List<String> values) {
            addCriterion("ADD2 in", values, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2NotIn(List<String> values) {
            addCriterion("ADD2 not in", values, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2Between(String value1, String value2) {
            addCriterion("ADD2 between", value1, value2, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2NotBetween(String value1, String value2) {
            addCriterion("ADD2 not between", value1, value2, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd3IsNull() {
            addCriterion("ADD3 is null");
            return (Criteria) this;
        }

        public Criteria andAdd3IsNotNull() {
            addCriterion("ADD3 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd3EqualTo(String value) {
            addCriterion("ADD3 =", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3NotEqualTo(String value) {
            addCriterion("ADD3 <>", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3GreaterThan(String value) {
            addCriterion("ADD3 >", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3GreaterThanOrEqualTo(String value) {
            addCriterion("ADD3 >=", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3LessThan(String value) {
            addCriterion("ADD3 <", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3LessThanOrEqualTo(String value) {
            addCriterion("ADD3 <=", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3In(List<String> values) {
            addCriterion("ADD3 in", values, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3NotIn(List<String> values) {
            addCriterion("ADD3 not in", values, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3Between(String value1, String value2) {
            addCriterion("ADD3 between", value1, value2, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3NotBetween(String value1, String value2) {
            addCriterion("ADD3 not between", value1, value2, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd4IsNull() {
            addCriterion("ADD4 is null");
            return (Criteria) this;
        }

        public Criteria andAdd4IsNotNull() {
            addCriterion("ADD4 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd4EqualTo(String value) {
            addCriterion("ADD4 =", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4NotEqualTo(String value) {
            addCriterion("ADD4 <>", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4GreaterThan(String value) {
            addCriterion("ADD4 >", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4GreaterThanOrEqualTo(String value) {
            addCriterion("ADD4 >=", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4LessThan(String value) {
            addCriterion("ADD4 <", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4LessThanOrEqualTo(String value) {
            addCriterion("ADD4 <=", value, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4In(List<String> values) {
            addCriterion("ADD4 in", values, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4NotIn(List<String> values) {
            addCriterion("ADD4 not in", values, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4Between(String value1, String value2) {
            addCriterion("ADD4 between", value1, value2, "add4");
            return (Criteria) this;
        }

        public Criteria andAdd4NotBetween(String value1, String value2) {
            addCriterion("ADD4 not between", value1, value2, "add4");
            return (Criteria) this;
        }

        public Criteria andCty1IsNull() {
            addCriterion("CTY1 is null");
            return (Criteria) this;
        }

        public Criteria andCty1IsNotNull() {
            addCriterion("CTY1 is not null");
            return (Criteria) this;
        }

        public Criteria andCty1EqualTo(String value) {
            addCriterion("CTY1 =", value, "cty1");
            return (Criteria) this;
        }

        public Criteria andCty1NotEqualTo(String value) {
            addCriterion("CTY1 <>", value, "cty1");
            return (Criteria) this;
        }

        public Criteria andCty1GreaterThan(String value) {
            addCriterion("CTY1 >", value, "cty1");
            return (Criteria) this;
        }

        public Criteria andCty1GreaterThanOrEqualTo(String value) {
            addCriterion("CTY1 >=", value, "cty1");
            return (Criteria) this;
        }

        public Criteria andCty1LessThan(String value) {
            addCriterion("CTY1 <", value, "cty1");
            return (Criteria) this;
        }

        public Criteria andCty1LessThanOrEqualTo(String value) {
            addCriterion("CTY1 <=", value, "cty1");
            return (Criteria) this;
        }

        public Criteria andCty1In(List<String> values) {
            addCriterion("CTY1 in", values, "cty1");
            return (Criteria) this;
        }

        public Criteria andCty1NotIn(List<String> values) {
            addCriterion("CTY1 not in", values, "cty1");
            return (Criteria) this;
        }

        public Criteria andCty1Between(String value1, String value2) {
            addCriterion("CTY1 between", value1, value2, "cty1");
            return (Criteria) this;
        }

        public Criteria andCty1NotBetween(String value1, String value2) {
            addCriterion("CTY1 not between", value1, value2, "cty1");
            return (Criteria) this;
        }

        public Criteria andAddsIsNull() {
            addCriterion("ADDS is null");
            return (Criteria) this;
        }

        public Criteria andAddsIsNotNull() {
            addCriterion("ADDS is not null");
            return (Criteria) this;
        }

        public Criteria andAddsEqualTo(String value) {
            addCriterion("ADDS =", value, "adds");
            return (Criteria) this;
        }

        public Criteria andAddsNotEqualTo(String value) {
            addCriterion("ADDS <>", value, "adds");
            return (Criteria) this;
        }

        public Criteria andAddsGreaterThan(String value) {
            addCriterion("ADDS >", value, "adds");
            return (Criteria) this;
        }

        public Criteria andAddsGreaterThanOrEqualTo(String value) {
            addCriterion("ADDS >=", value, "adds");
            return (Criteria) this;
        }

        public Criteria andAddsLessThan(String value) {
            addCriterion("ADDS <", value, "adds");
            return (Criteria) this;
        }

        public Criteria andAddsLessThanOrEqualTo(String value) {
            addCriterion("ADDS <=", value, "adds");
            return (Criteria) this;
        }

        public Criteria andAddsIn(List<String> values) {
            addCriterion("ADDS in", values, "adds");
            return (Criteria) this;
        }

        public Criteria andAddsNotIn(List<String> values) {
            addCriterion("ADDS not in", values, "adds");
            return (Criteria) this;
        }

        public Criteria andAddsBetween(String value1, String value2) {
            addCriterion("ADDS between", value1, value2, "adds");
            return (Criteria) this;
        }

        public Criteria andAddsNotBetween(String value1, String value2) {
            addCriterion("ADDS not between", value1, value2, "adds");
            return (Criteria) this;
        }

        public Criteria andCounIsNull() {
            addCriterion("COUN is null");
            return (Criteria) this;
        }

        public Criteria andCounIsNotNull() {
            addCriterion("COUN is not null");
            return (Criteria) this;
        }

        public Criteria andCounEqualTo(String value) {
            addCriterion("COUN =", value, "coun");
            return (Criteria) this;
        }

        public Criteria andCounNotEqualTo(String value) {
            addCriterion("COUN <>", value, "coun");
            return (Criteria) this;
        }

        public Criteria andCounGreaterThan(String value) {
            addCriterion("COUN >", value, "coun");
            return (Criteria) this;
        }

        public Criteria andCounGreaterThanOrEqualTo(String value) {
            addCriterion("COUN >=", value, "coun");
            return (Criteria) this;
        }

        public Criteria andCounLessThan(String value) {
            addCriterion("COUN <", value, "coun");
            return (Criteria) this;
        }

        public Criteria andCounLessThanOrEqualTo(String value) {
            addCriterion("COUN <=", value, "coun");
            return (Criteria) this;
        }

        public Criteria andCounIn(List<String> values) {
            addCriterion("COUN in", values, "coun");
            return (Criteria) this;
        }

        public Criteria andCounNotIn(List<String> values) {
            addCriterion("COUN not in", values, "coun");
            return (Criteria) this;
        }

        public Criteria andCounBetween(String value1, String value2) {
            addCriterion("COUN between", value1, value2, "coun");
            return (Criteria) this;
        }

        public Criteria andCounNotBetween(String value1, String value2) {
            addCriterion("COUN not between", value1, value2, "coun");
            return (Criteria) this;
        }

        public Criteria andCtrIsNull() {
            addCriterion("CTR is null");
            return (Criteria) this;
        }

        public Criteria andCtrIsNotNull() {
            addCriterion("CTR is not null");
            return (Criteria) this;
        }

        public Criteria andCtrEqualTo(String value) {
            addCriterion("CTR =", value, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrNotEqualTo(String value) {
            addCriterion("CTR <>", value, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrGreaterThan(String value) {
            addCriterion("CTR >", value, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrGreaterThanOrEqualTo(String value) {
            addCriterion("CTR >=", value, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrLessThan(String value) {
            addCriterion("CTR <", value, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrLessThanOrEqualTo(String value) {
            addCriterion("CTR <=", value, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrIn(List<String> values) {
            addCriterion("CTR in", values, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrNotIn(List<String> values) {
            addCriterion("CTR not in", values, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrBetween(String value1, String value2) {
            addCriterion("CTR between", value1, value2, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrNotBetween(String value1, String value2) {
            addCriterion("CTR not between", value1, value2, "ctr");
            return (Criteria) this;
        }

        public Criteria andAddzIsNull() {
            addCriterion("ADDZ is null");
            return (Criteria) this;
        }

        public Criteria andAddzIsNotNull() {
            addCriterion("ADDZ is not null");
            return (Criteria) this;
        }

        public Criteria andAddzEqualTo(String value) {
            addCriterion("ADDZ =", value, "addz");
            return (Criteria) this;
        }

        public Criteria andAddzNotEqualTo(String value) {
            addCriterion("ADDZ <>", value, "addz");
            return (Criteria) this;
        }

        public Criteria andAddzGreaterThan(String value) {
            addCriterion("ADDZ >", value, "addz");
            return (Criteria) this;
        }

        public Criteria andAddzGreaterThanOrEqualTo(String value) {
            addCriterion("ADDZ >=", value, "addz");
            return (Criteria) this;
        }

        public Criteria andAddzLessThan(String value) {
            addCriterion("ADDZ <", value, "addz");
            return (Criteria) this;
        }

        public Criteria andAddzLessThanOrEqualTo(String value) {
            addCriterion("ADDZ <=", value, "addz");
            return (Criteria) this;
        }

        public Criteria andAddzIn(List<String> values) {
            addCriterion("ADDZ in", values, "addz");
            return (Criteria) this;
        }

        public Criteria andAddzNotIn(List<String> values) {
            addCriterion("ADDZ not in", values, "addz");
            return (Criteria) this;
        }

        public Criteria andAddzBetween(String value1, String value2) {
            addCriterion("ADDZ between", value1, value2, "addz");
            return (Criteria) this;
        }

        public Criteria andAddzNotBetween(String value1, String value2) {
            addCriterion("ADDZ not between", value1, value2, "addz");
            return (Criteria) this;
        }

        public Criteria andMainaIsNull() {
            addCriterion("MAINA is null");
            return (Criteria) this;
        }

        public Criteria andMainaIsNotNull() {
            addCriterion("MAINA is not null");
            return (Criteria) this;
        }

        public Criteria andMainaEqualTo(Integer value) {
            addCriterion("MAINA =", value, "maina");
            return (Criteria) this;
        }

        public Criteria andMainaNotEqualTo(Integer value) {
            addCriterion("MAINA <>", value, "maina");
            return (Criteria) this;
        }

        public Criteria andMainaGreaterThan(Integer value) {
            addCriterion("MAINA >", value, "maina");
            return (Criteria) this;
        }

        public Criteria andMainaGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAINA >=", value, "maina");
            return (Criteria) this;
        }

        public Criteria andMainaLessThan(Integer value) {
            addCriterion("MAINA <", value, "maina");
            return (Criteria) this;
        }

        public Criteria andMainaLessThanOrEqualTo(Integer value) {
            addCriterion("MAINA <=", value, "maina");
            return (Criteria) this;
        }

        public Criteria andMainaIn(List<Integer> values) {
            addCriterion("MAINA in", values, "maina");
            return (Criteria) this;
        }

        public Criteria andMainaNotIn(List<Integer> values) {
            addCriterion("MAINA not in", values, "maina");
            return (Criteria) this;
        }

        public Criteria andMainaBetween(Integer value1, Integer value2) {
            addCriterion("MAINA between", value1, value2, "maina");
            return (Criteria) this;
        }

        public Criteria andMainaNotBetween(Integer value1, Integer value2) {
            addCriterion("MAINA not between", value1, value2, "maina");
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