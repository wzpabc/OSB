package com.tup.mssql.model;


import java.util.ArrayList;
import java.util.List;

public class ImportBasePriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImportBasePriceExample() {
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

        public Criteria andBpitmIsNull() {
            addCriterion("BPITM is null");
            return (Criteria) this;
        }

        public Criteria andBpitmIsNotNull() {
            addCriterion("BPITM is not null");
            return (Criteria) this;
        }

        public Criteria andBpitmEqualTo(Double value) {
            addCriterion("BPITM =", value, "bpitm");
            return (Criteria) this;
        }

        public Criteria andBpitmNotEqualTo(Double value) {
            addCriterion("BPITM <>", value, "bpitm");
            return (Criteria) this;
        }

        public Criteria andBpitmGreaterThan(Double value) {
            addCriterion("BPITM >", value, "bpitm");
            return (Criteria) this;
        }

        public Criteria andBpitmGreaterThanOrEqualTo(Double value) {
            addCriterion("BPITM >=", value, "bpitm");
            return (Criteria) this;
        }

        public Criteria andBpitmLessThan(Double value) {
            addCriterion("BPITM <", value, "bpitm");
            return (Criteria) this;
        }

        public Criteria andBpitmLessThanOrEqualTo(Double value) {
            addCriterion("BPITM <=", value, "bpitm");
            return (Criteria) this;
        }

        public Criteria andBpitmIn(List<Double> values) {
            addCriterion("BPITM in", values, "bpitm");
            return (Criteria) this;
        }

        public Criteria andBpitmNotIn(List<Double> values) {
            addCriterion("BPITM not in", values, "bpitm");
            return (Criteria) this;
        }

        public Criteria andBpitmBetween(Double value1, Double value2) {
            addCriterion("BPITM between", value1, value2, "bpitm");
            return (Criteria) this;
        }

        public Criteria andBpitmNotBetween(Double value1, Double value2) {
            addCriterion("BPITM not between", value1, value2, "bpitm");
            return (Criteria) this;
        }

        public Criteria andBplitmIsNull() {
            addCriterion("BPLITM is null");
            return (Criteria) this;
        }

        public Criteria andBplitmIsNotNull() {
            addCriterion("BPLITM is not null");
            return (Criteria) this;
        }

        public Criteria andBplitmEqualTo(String value) {
            addCriterion("BPLITM =", value, "bplitm");
            return (Criteria) this;
        }

        public Criteria andBplitmNotEqualTo(String value) {
            addCriterion("BPLITM <>", value, "bplitm");
            return (Criteria) this;
        }

        public Criteria andBplitmGreaterThan(String value) {
            addCriterion("BPLITM >", value, "bplitm");
            return (Criteria) this;
        }

        public Criteria andBplitmGreaterThanOrEqualTo(String value) {
            addCriterion("BPLITM >=", value, "bplitm");
            return (Criteria) this;
        }

        public Criteria andBplitmLessThan(String value) {
            addCriterion("BPLITM <", value, "bplitm");
            return (Criteria) this;
        }

        public Criteria andBplitmLessThanOrEqualTo(String value) {
            addCriterion("BPLITM <=", value, "bplitm");
            return (Criteria) this;
        }

        public Criteria andBplitmIn(List<String> values) {
            addCriterion("BPLITM in", values, "bplitm");
            return (Criteria) this;
        }

        public Criteria andBplitmNotIn(List<String> values) {
            addCriterion("BPLITM not in", values, "bplitm");
            return (Criteria) this;
        }

        public Criteria andBplitmBetween(String value1, String value2) {
            addCriterion("BPLITM between", value1, value2, "bplitm");
            return (Criteria) this;
        }

        public Criteria andBplitmNotBetween(String value1, String value2) {
            addCriterion("BPLITM not between", value1, value2, "bplitm");
            return (Criteria) this;
        }

        public Criteria andBpaitmIsNull() {
            addCriterion("BPAITM is null");
            return (Criteria) this;
        }

        public Criteria andBpaitmIsNotNull() {
            addCriterion("BPAITM is not null");
            return (Criteria) this;
        }

        public Criteria andBpaitmEqualTo(String value) {
            addCriterion("BPAITM =", value, "bpaitm");
            return (Criteria) this;
        }

        public Criteria andBpaitmNotEqualTo(String value) {
            addCriterion("BPAITM <>", value, "bpaitm");
            return (Criteria) this;
        }

        public Criteria andBpaitmGreaterThan(String value) {
            addCriterion("BPAITM >", value, "bpaitm");
            return (Criteria) this;
        }

        public Criteria andBpaitmGreaterThanOrEqualTo(String value) {
            addCriterion("BPAITM >=", value, "bpaitm");
            return (Criteria) this;
        }

        public Criteria andBpaitmLessThan(String value) {
            addCriterion("BPAITM <", value, "bpaitm");
            return (Criteria) this;
        }

        public Criteria andBpaitmLessThanOrEqualTo(String value) {
            addCriterion("BPAITM <=", value, "bpaitm");
            return (Criteria) this;
        }

        public Criteria andBpaitmIn(List<String> values) {
            addCriterion("BPAITM in", values, "bpaitm");
            return (Criteria) this;
        }

        public Criteria andBpaitmNotIn(List<String> values) {
            addCriterion("BPAITM not in", values, "bpaitm");
            return (Criteria) this;
        }

        public Criteria andBpaitmBetween(String value1, String value2) {
            addCriterion("BPAITM between", value1, value2, "bpaitm");
            return (Criteria) this;
        }

        public Criteria andBpaitmNotBetween(String value1, String value2) {
            addCriterion("BPAITM not between", value1, value2, "bpaitm");
            return (Criteria) this;
        }

        public Criteria andBpmcuIsNull() {
            addCriterion("BPMCU is null");
            return (Criteria) this;
        }

        public Criteria andBpmcuIsNotNull() {
            addCriterion("BPMCU is not null");
            return (Criteria) this;
        }

        public Criteria andBpmcuEqualTo(String value) {
            addCriterion("BPMCU =", value, "bpmcu");
            return (Criteria) this;
        }

        public Criteria andBpmcuNotEqualTo(String value) {
            addCriterion("BPMCU <>", value, "bpmcu");
            return (Criteria) this;
        }

        public Criteria andBpmcuGreaterThan(String value) {
            addCriterion("BPMCU >", value, "bpmcu");
            return (Criteria) this;
        }

        public Criteria andBpmcuGreaterThanOrEqualTo(String value) {
            addCriterion("BPMCU >=", value, "bpmcu");
            return (Criteria) this;
        }

        public Criteria andBpmcuLessThan(String value) {
            addCriterion("BPMCU <", value, "bpmcu");
            return (Criteria) this;
        }

        public Criteria andBpmcuLessThanOrEqualTo(String value) {
            addCriterion("BPMCU <=", value, "bpmcu");
            return (Criteria) this;
        }

        public Criteria andBpmcuIn(List<String> values) {
            addCriterion("BPMCU in", values, "bpmcu");
            return (Criteria) this;
        }

        public Criteria andBpmcuNotIn(List<String> values) {
            addCriterion("BPMCU not in", values, "bpmcu");
            return (Criteria) this;
        }

        public Criteria andBpmcuBetween(String value1, String value2) {
            addCriterion("BPMCU between", value1, value2, "bpmcu");
            return (Criteria) this;
        }

        public Criteria andBpmcuNotBetween(String value1, String value2) {
            addCriterion("BPMCU not between", value1, value2, "bpmcu");
            return (Criteria) this;
        }

        public Criteria andBplocnIsNull() {
            addCriterion("BPLOCN is null");
            return (Criteria) this;
        }

        public Criteria andBplocnIsNotNull() {
            addCriterion("BPLOCN is not null");
            return (Criteria) this;
        }

        public Criteria andBplocnEqualTo(String value) {
            addCriterion("BPLOCN =", value, "bplocn");
            return (Criteria) this;
        }

        public Criteria andBplocnNotEqualTo(String value) {
            addCriterion("BPLOCN <>", value, "bplocn");
            return (Criteria) this;
        }

        public Criteria andBplocnGreaterThan(String value) {
            addCriterion("BPLOCN >", value, "bplocn");
            return (Criteria) this;
        }

        public Criteria andBplocnGreaterThanOrEqualTo(String value) {
            addCriterion("BPLOCN >=", value, "bplocn");
            return (Criteria) this;
        }

        public Criteria andBplocnLessThan(String value) {
            addCriterion("BPLOCN <", value, "bplocn");
            return (Criteria) this;
        }

        public Criteria andBplocnLessThanOrEqualTo(String value) {
            addCriterion("BPLOCN <=", value, "bplocn");
            return (Criteria) this;
        }

        public Criteria andBplocnIn(List<String> values) {
            addCriterion("BPLOCN in", values, "bplocn");
            return (Criteria) this;
        }

        public Criteria andBplocnNotIn(List<String> values) {
            addCriterion("BPLOCN not in", values, "bplocn");
            return (Criteria) this;
        }

        public Criteria andBplocnBetween(String value1, String value2) {
            addCriterion("BPLOCN between", value1, value2, "bplocn");
            return (Criteria) this;
        }

        public Criteria andBplocnNotBetween(String value1, String value2) {
            addCriterion("BPLOCN not between", value1, value2, "bplocn");
            return (Criteria) this;
        }

        public Criteria andBplotnIsNull() {
            addCriterion("BPLOTN is null");
            return (Criteria) this;
        }

        public Criteria andBplotnIsNotNull() {
            addCriterion("BPLOTN is not null");
            return (Criteria) this;
        }

        public Criteria andBplotnEqualTo(String value) {
            addCriterion("BPLOTN =", value, "bplotn");
            return (Criteria) this;
        }

        public Criteria andBplotnNotEqualTo(String value) {
            addCriterion("BPLOTN <>", value, "bplotn");
            return (Criteria) this;
        }

        public Criteria andBplotnGreaterThan(String value) {
            addCriterion("BPLOTN >", value, "bplotn");
            return (Criteria) this;
        }

        public Criteria andBplotnGreaterThanOrEqualTo(String value) {
            addCriterion("BPLOTN >=", value, "bplotn");
            return (Criteria) this;
        }

        public Criteria andBplotnLessThan(String value) {
            addCriterion("BPLOTN <", value, "bplotn");
            return (Criteria) this;
        }

        public Criteria andBplotnLessThanOrEqualTo(String value) {
            addCriterion("BPLOTN <=", value, "bplotn");
            return (Criteria) this;
        }

        public Criteria andBplotnIn(List<String> values) {
            addCriterion("BPLOTN in", values, "bplotn");
            return (Criteria) this;
        }

        public Criteria andBplotnNotIn(List<String> values) {
            addCriterion("BPLOTN not in", values, "bplotn");
            return (Criteria) this;
        }

        public Criteria andBplotnBetween(String value1, String value2) {
            addCriterion("BPLOTN between", value1, value2, "bplotn");
            return (Criteria) this;
        }

        public Criteria andBplotnNotBetween(String value1, String value2) {
            addCriterion("BPLOTN not between", value1, value2, "bplotn");
            return (Criteria) this;
        }

        public Criteria andBpan8IsNull() {
            addCriterion("BPAN8 is null");
            return (Criteria) this;
        }

        public Criteria andBpan8IsNotNull() {
            addCriterion("BPAN8 is not null");
            return (Criteria) this;
        }

        public Criteria andBpan8EqualTo(Double value) {
            addCriterion("BPAN8 =", value, "bpan8");
            return (Criteria) this;
        }

        public Criteria andBpan8NotEqualTo(Double value) {
            addCriterion("BPAN8 <>", value, "bpan8");
            return (Criteria) this;
        }

        public Criteria andBpan8GreaterThan(Double value) {
            addCriterion("BPAN8 >", value, "bpan8");
            return (Criteria) this;
        }

        public Criteria andBpan8GreaterThanOrEqualTo(Double value) {
            addCriterion("BPAN8 >=", value, "bpan8");
            return (Criteria) this;
        }

        public Criteria andBpan8LessThan(Double value) {
            addCriterion("BPAN8 <", value, "bpan8");
            return (Criteria) this;
        }

        public Criteria andBpan8LessThanOrEqualTo(Double value) {
            addCriterion("BPAN8 <=", value, "bpan8");
            return (Criteria) this;
        }

        public Criteria andBpan8In(List<Double> values) {
            addCriterion("BPAN8 in", values, "bpan8");
            return (Criteria) this;
        }

        public Criteria andBpan8NotIn(List<Double> values) {
            addCriterion("BPAN8 not in", values, "bpan8");
            return (Criteria) this;
        }

        public Criteria andBpan8Between(Double value1, Double value2) {
            addCriterion("BPAN8 between", value1, value2, "bpan8");
            return (Criteria) this;
        }

        public Criteria andBpan8NotBetween(Double value1, Double value2) {
            addCriterion("BPAN8 not between", value1, value2, "bpan8");
            return (Criteria) this;
        }

        public Criteria andBpigidIsNull() {
            addCriterion("BPIGID is null");
            return (Criteria) this;
        }

        public Criteria andBpigidIsNotNull() {
            addCriterion("BPIGID is not null");
            return (Criteria) this;
        }

        public Criteria andBpigidEqualTo(Double value) {
            addCriterion("BPIGID =", value, "bpigid");
            return (Criteria) this;
        }

        public Criteria andBpigidNotEqualTo(Double value) {
            addCriterion("BPIGID <>", value, "bpigid");
            return (Criteria) this;
        }

        public Criteria andBpigidGreaterThan(Double value) {
            addCriterion("BPIGID >", value, "bpigid");
            return (Criteria) this;
        }

        public Criteria andBpigidGreaterThanOrEqualTo(Double value) {
            addCriterion("BPIGID >=", value, "bpigid");
            return (Criteria) this;
        }

        public Criteria andBpigidLessThan(Double value) {
            addCriterion("BPIGID <", value, "bpigid");
            return (Criteria) this;
        }

        public Criteria andBpigidLessThanOrEqualTo(Double value) {
            addCriterion("BPIGID <=", value, "bpigid");
            return (Criteria) this;
        }

        public Criteria andBpigidIn(List<Double> values) {
            addCriterion("BPIGID in", values, "bpigid");
            return (Criteria) this;
        }

        public Criteria andBpigidNotIn(List<Double> values) {
            addCriterion("BPIGID not in", values, "bpigid");
            return (Criteria) this;
        }

        public Criteria andBpigidBetween(Double value1, Double value2) {
            addCriterion("BPIGID between", value1, value2, "bpigid");
            return (Criteria) this;
        }

        public Criteria andBpigidNotBetween(Double value1, Double value2) {
            addCriterion("BPIGID not between", value1, value2, "bpigid");
            return (Criteria) this;
        }

        public Criteria andBpcgidIsNull() {
            addCriterion("BPCGID is null");
            return (Criteria) this;
        }

        public Criteria andBpcgidIsNotNull() {
            addCriterion("BPCGID is not null");
            return (Criteria) this;
        }

        public Criteria andBpcgidEqualTo(Double value) {
            addCriterion("BPCGID =", value, "bpcgid");
            return (Criteria) this;
        }

        public Criteria andBpcgidNotEqualTo(Double value) {
            addCriterion("BPCGID <>", value, "bpcgid");
            return (Criteria) this;
        }

        public Criteria andBpcgidGreaterThan(Double value) {
            addCriterion("BPCGID >", value, "bpcgid");
            return (Criteria) this;
        }

        public Criteria andBpcgidGreaterThanOrEqualTo(Double value) {
            addCriterion("BPCGID >=", value, "bpcgid");
            return (Criteria) this;
        }

        public Criteria andBpcgidLessThan(Double value) {
            addCriterion("BPCGID <", value, "bpcgid");
            return (Criteria) this;
        }

        public Criteria andBpcgidLessThanOrEqualTo(Double value) {
            addCriterion("BPCGID <=", value, "bpcgid");
            return (Criteria) this;
        }

        public Criteria andBpcgidIn(List<Double> values) {
            addCriterion("BPCGID in", values, "bpcgid");
            return (Criteria) this;
        }

        public Criteria andBpcgidNotIn(List<Double> values) {
            addCriterion("BPCGID not in", values, "bpcgid");
            return (Criteria) this;
        }

        public Criteria andBpcgidBetween(Double value1, Double value2) {
            addCriterion("BPCGID between", value1, value2, "bpcgid");
            return (Criteria) this;
        }

        public Criteria andBpcgidNotBetween(Double value1, Double value2) {
            addCriterion("BPCGID not between", value1, value2, "bpcgid");
            return (Criteria) this;
        }

        public Criteria andBplotgIsNull() {
            addCriterion("BPLOTG is null");
            return (Criteria) this;
        }

        public Criteria andBplotgIsNotNull() {
            addCriterion("BPLOTG is not null");
            return (Criteria) this;
        }

        public Criteria andBplotgEqualTo(String value) {
            addCriterion("BPLOTG =", value, "bplotg");
            return (Criteria) this;
        }

        public Criteria andBplotgNotEqualTo(String value) {
            addCriterion("BPLOTG <>", value, "bplotg");
            return (Criteria) this;
        }

        public Criteria andBplotgGreaterThan(String value) {
            addCriterion("BPLOTG >", value, "bplotg");
            return (Criteria) this;
        }

        public Criteria andBplotgGreaterThanOrEqualTo(String value) {
            addCriterion("BPLOTG >=", value, "bplotg");
            return (Criteria) this;
        }

        public Criteria andBplotgLessThan(String value) {
            addCriterion("BPLOTG <", value, "bplotg");
            return (Criteria) this;
        }

        public Criteria andBplotgLessThanOrEqualTo(String value) {
            addCriterion("BPLOTG <=", value, "bplotg");
            return (Criteria) this;
        }

        public Criteria andBplotgIn(List<String> values) {
            addCriterion("BPLOTG in", values, "bplotg");
            return (Criteria) this;
        }

        public Criteria andBplotgNotIn(List<String> values) {
            addCriterion("BPLOTG not in", values, "bplotg");
            return (Criteria) this;
        }

        public Criteria andBplotgBetween(String value1, String value2) {
            addCriterion("BPLOTG between", value1, value2, "bplotg");
            return (Criteria) this;
        }

        public Criteria andBplotgNotBetween(String value1, String value2) {
            addCriterion("BPLOTG not between", value1, value2, "bplotg");
            return (Criteria) this;
        }

        public Criteria andBpfrmpIsNull() {
            addCriterion("BPFRMP is null");
            return (Criteria) this;
        }

        public Criteria andBpfrmpIsNotNull() {
            addCriterion("BPFRMP is not null");
            return (Criteria) this;
        }

        public Criteria andBpfrmpEqualTo(Double value) {
            addCriterion("BPFRMP =", value, "bpfrmp");
            return (Criteria) this;
        }

        public Criteria andBpfrmpNotEqualTo(Double value) {
            addCriterion("BPFRMP <>", value, "bpfrmp");
            return (Criteria) this;
        }

        public Criteria andBpfrmpGreaterThan(Double value) {
            addCriterion("BPFRMP >", value, "bpfrmp");
            return (Criteria) this;
        }

        public Criteria andBpfrmpGreaterThanOrEqualTo(Double value) {
            addCriterion("BPFRMP >=", value, "bpfrmp");
            return (Criteria) this;
        }

        public Criteria andBpfrmpLessThan(Double value) {
            addCriterion("BPFRMP <", value, "bpfrmp");
            return (Criteria) this;
        }

        public Criteria andBpfrmpLessThanOrEqualTo(Double value) {
            addCriterion("BPFRMP <=", value, "bpfrmp");
            return (Criteria) this;
        }

        public Criteria andBpfrmpIn(List<Double> values) {
            addCriterion("BPFRMP in", values, "bpfrmp");
            return (Criteria) this;
        }

        public Criteria andBpfrmpNotIn(List<Double> values) {
            addCriterion("BPFRMP not in", values, "bpfrmp");
            return (Criteria) this;
        }

        public Criteria andBpfrmpBetween(Double value1, Double value2) {
            addCriterion("BPFRMP between", value1, value2, "bpfrmp");
            return (Criteria) this;
        }

        public Criteria andBpfrmpNotBetween(Double value1, Double value2) {
            addCriterion("BPFRMP not between", value1, value2, "bpfrmp");
            return (Criteria) this;
        }

        public Criteria andBpcrcdIsNull() {
            addCriterion("BPCRCD is null");
            return (Criteria) this;
        }

        public Criteria andBpcrcdIsNotNull() {
            addCriterion("BPCRCD is not null");
            return (Criteria) this;
        }

        public Criteria andBpcrcdEqualTo(String value) {
            addCriterion("BPCRCD =", value, "bpcrcd");
            return (Criteria) this;
        }

        public Criteria andBpcrcdNotEqualTo(String value) {
            addCriterion("BPCRCD <>", value, "bpcrcd");
            return (Criteria) this;
        }

        public Criteria andBpcrcdGreaterThan(String value) {
            addCriterion("BPCRCD >", value, "bpcrcd");
            return (Criteria) this;
        }

        public Criteria andBpcrcdGreaterThanOrEqualTo(String value) {
            addCriterion("BPCRCD >=", value, "bpcrcd");
            return (Criteria) this;
        }

        public Criteria andBpcrcdLessThan(String value) {
            addCriterion("BPCRCD <", value, "bpcrcd");
            return (Criteria) this;
        }

        public Criteria andBpcrcdLessThanOrEqualTo(String value) {
            addCriterion("BPCRCD <=", value, "bpcrcd");
            return (Criteria) this;
        }

        public Criteria andBpcrcdIn(List<String> values) {
            addCriterion("BPCRCD in", values, "bpcrcd");
            return (Criteria) this;
        }

        public Criteria andBpcrcdNotIn(List<String> values) {
            addCriterion("BPCRCD not in", values, "bpcrcd");
            return (Criteria) this;
        }

        public Criteria andBpcrcdBetween(String value1, String value2) {
            addCriterion("BPCRCD between", value1, value2, "bpcrcd");
            return (Criteria) this;
        }

        public Criteria andBpcrcdNotBetween(String value1, String value2) {
            addCriterion("BPCRCD not between", value1, value2, "bpcrcd");
            return (Criteria) this;
        }

        public Criteria andBpuomIsNull() {
            addCriterion("BPUOM is null");
            return (Criteria) this;
        }

        public Criteria andBpuomIsNotNull() {
            addCriterion("BPUOM is not null");
            return (Criteria) this;
        }

        public Criteria andBpuomEqualTo(String value) {
            addCriterion("BPUOM =", value, "bpuom");
            return (Criteria) this;
        }

        public Criteria andBpuomNotEqualTo(String value) {
            addCriterion("BPUOM <>", value, "bpuom");
            return (Criteria) this;
        }

        public Criteria andBpuomGreaterThan(String value) {
            addCriterion("BPUOM >", value, "bpuom");
            return (Criteria) this;
        }

        public Criteria andBpuomGreaterThanOrEqualTo(String value) {
            addCriterion("BPUOM >=", value, "bpuom");
            return (Criteria) this;
        }

        public Criteria andBpuomLessThan(String value) {
            addCriterion("BPUOM <", value, "bpuom");
            return (Criteria) this;
        }

        public Criteria andBpuomLessThanOrEqualTo(String value) {
            addCriterion("BPUOM <=", value, "bpuom");
            return (Criteria) this;
        }

        public Criteria andBpuomIn(List<String> values) {
            addCriterion("BPUOM in", values, "bpuom");
            return (Criteria) this;
        }

        public Criteria andBpuomNotIn(List<String> values) {
            addCriterion("BPUOM not in", values, "bpuom");
            return (Criteria) this;
        }

        public Criteria andBpuomBetween(String value1, String value2) {
            addCriterion("BPUOM between", value1, value2, "bpuom");
            return (Criteria) this;
        }

        public Criteria andBpuomNotBetween(String value1, String value2) {
            addCriterion("BPUOM not between", value1, value2, "bpuom");
            return (Criteria) this;
        }

        public Criteria andBpeftjIsNull() {
            addCriterion("BPEFTJ is null");
            return (Criteria) this;
        }

        public Criteria andBpeftjIsNotNull() {
            addCriterion("BPEFTJ is not null");
            return (Criteria) this;
        }

        public Criteria andBpeftjEqualTo(Double value) {
            addCriterion("BPEFTJ =", value, "bpeftj");
            return (Criteria) this;
        }

        public Criteria andBpeftjNotEqualTo(Double value) {
            addCriterion("BPEFTJ <>", value, "bpeftj");
            return (Criteria) this;
        }

        public Criteria andBpeftjGreaterThan(Double value) {
            addCriterion("BPEFTJ >", value, "bpeftj");
            return (Criteria) this;
        }

        public Criteria andBpeftjGreaterThanOrEqualTo(Double value) {
            addCriterion("BPEFTJ >=", value, "bpeftj");
            return (Criteria) this;
        }

        public Criteria andBpeftjLessThan(Double value) {
            addCriterion("BPEFTJ <", value, "bpeftj");
            return (Criteria) this;
        }

        public Criteria andBpeftjLessThanOrEqualTo(Double value) {
            addCriterion("BPEFTJ <=", value, "bpeftj");
            return (Criteria) this;
        }

        public Criteria andBpeftjIn(List<Double> values) {
            addCriterion("BPEFTJ in", values, "bpeftj");
            return (Criteria) this;
        }

        public Criteria andBpeftjNotIn(List<Double> values) {
            addCriterion("BPEFTJ not in", values, "bpeftj");
            return (Criteria) this;
        }

        public Criteria andBpeftjBetween(Double value1, Double value2) {
            addCriterion("BPEFTJ between", value1, value2, "bpeftj");
            return (Criteria) this;
        }

        public Criteria andBpeftjNotBetween(Double value1, Double value2) {
            addCriterion("BPEFTJ not between", value1, value2, "bpeftj");
            return (Criteria) this;
        }

        public Criteria andBpexdjIsNull() {
            addCriterion("BPEXDJ is null");
            return (Criteria) this;
        }

        public Criteria andBpexdjIsNotNull() {
            addCriterion("BPEXDJ is not null");
            return (Criteria) this;
        }

        public Criteria andBpexdjEqualTo(Double value) {
            addCriterion("BPEXDJ =", value, "bpexdj");
            return (Criteria) this;
        }

        public Criteria andBpexdjNotEqualTo(Double value) {
            addCriterion("BPEXDJ <>", value, "bpexdj");
            return (Criteria) this;
        }

        public Criteria andBpexdjGreaterThan(Double value) {
            addCriterion("BPEXDJ >", value, "bpexdj");
            return (Criteria) this;
        }

        public Criteria andBpexdjGreaterThanOrEqualTo(Double value) {
            addCriterion("BPEXDJ >=", value, "bpexdj");
            return (Criteria) this;
        }

        public Criteria andBpexdjLessThan(Double value) {
            addCriterion("BPEXDJ <", value, "bpexdj");
            return (Criteria) this;
        }

        public Criteria andBpexdjLessThanOrEqualTo(Double value) {
            addCriterion("BPEXDJ <=", value, "bpexdj");
            return (Criteria) this;
        }

        public Criteria andBpexdjIn(List<Double> values) {
            addCriterion("BPEXDJ in", values, "bpexdj");
            return (Criteria) this;
        }

        public Criteria andBpexdjNotIn(List<Double> values) {
            addCriterion("BPEXDJ not in", values, "bpexdj");
            return (Criteria) this;
        }

        public Criteria andBpexdjBetween(Double value1, Double value2) {
            addCriterion("BPEXDJ between", value1, value2, "bpexdj");
            return (Criteria) this;
        }

        public Criteria andBpexdjNotBetween(Double value1, Double value2) {
            addCriterion("BPEXDJ not between", value1, value2, "bpexdj");
            return (Criteria) this;
        }

        public Criteria andBpuprcIsNull() {
            addCriterion("BPUPRC is null");
            return (Criteria) this;
        }

        public Criteria andBpuprcIsNotNull() {
            addCriterion("BPUPRC is not null");
            return (Criteria) this;
        }

        public Criteria andBpuprcEqualTo(Double value) {
            addCriterion("BPUPRC =", value, "bpuprc");
            return (Criteria) this;
        }

        public Criteria andBpuprcNotEqualTo(Double value) {
            addCriterion("BPUPRC <>", value, "bpuprc");
            return (Criteria) this;
        }

        public Criteria andBpuprcGreaterThan(Double value) {
            addCriterion("BPUPRC >", value, "bpuprc");
            return (Criteria) this;
        }

        public Criteria andBpuprcGreaterThanOrEqualTo(Double value) {
            addCriterion("BPUPRC >=", value, "bpuprc");
            return (Criteria) this;
        }

        public Criteria andBpuprcLessThan(Double value) {
            addCriterion("BPUPRC <", value, "bpuprc");
            return (Criteria) this;
        }

        public Criteria andBpuprcLessThanOrEqualTo(Double value) {
            addCriterion("BPUPRC <=", value, "bpuprc");
            return (Criteria) this;
        }

        public Criteria andBpuprcIn(List<Double> values) {
            addCriterion("BPUPRC in", values, "bpuprc");
            return (Criteria) this;
        }

        public Criteria andBpuprcNotIn(List<Double> values) {
            addCriterion("BPUPRC not in", values, "bpuprc");
            return (Criteria) this;
        }

        public Criteria andBpuprcBetween(Double value1, Double value2) {
            addCriterion("BPUPRC between", value1, value2, "bpuprc");
            return (Criteria) this;
        }

        public Criteria andBpuprcNotBetween(Double value1, Double value2) {
            addCriterion("BPUPRC not between", value1, value2, "bpuprc");
            return (Criteria) this;
        }

        public Criteria andBpacrdIsNull() {
            addCriterion("BPACRD is null");
            return (Criteria) this;
        }

        public Criteria andBpacrdIsNotNull() {
            addCriterion("BPACRD is not null");
            return (Criteria) this;
        }

        public Criteria andBpacrdEqualTo(Double value) {
            addCriterion("BPACRD =", value, "bpacrd");
            return (Criteria) this;
        }

        public Criteria andBpacrdNotEqualTo(Double value) {
            addCriterion("BPACRD <>", value, "bpacrd");
            return (Criteria) this;
        }

        public Criteria andBpacrdGreaterThan(Double value) {
            addCriterion("BPACRD >", value, "bpacrd");
            return (Criteria) this;
        }

        public Criteria andBpacrdGreaterThanOrEqualTo(Double value) {
            addCriterion("BPACRD >=", value, "bpacrd");
            return (Criteria) this;
        }

        public Criteria andBpacrdLessThan(Double value) {
            addCriterion("BPACRD <", value, "bpacrd");
            return (Criteria) this;
        }

        public Criteria andBpacrdLessThanOrEqualTo(Double value) {
            addCriterion("BPACRD <=", value, "bpacrd");
            return (Criteria) this;
        }

        public Criteria andBpacrdIn(List<Double> values) {
            addCriterion("BPACRD in", values, "bpacrd");
            return (Criteria) this;
        }

        public Criteria andBpacrdNotIn(List<Double> values) {
            addCriterion("BPACRD not in", values, "bpacrd");
            return (Criteria) this;
        }

        public Criteria andBpacrdBetween(Double value1, Double value2) {
            addCriterion("BPACRD between", value1, value2, "bpacrd");
            return (Criteria) this;
        }

        public Criteria andBpacrdNotBetween(Double value1, Double value2) {
            addCriterion("BPACRD not between", value1, value2, "bpacrd");
            return (Criteria) this;
        }

        public Criteria andBpbscdIsNull() {
            addCriterion("BPBSCD is null");
            return (Criteria) this;
        }

        public Criteria andBpbscdIsNotNull() {
            addCriterion("BPBSCD is not null");
            return (Criteria) this;
        }

        public Criteria andBpbscdEqualTo(String value) {
            addCriterion("BPBSCD =", value, "bpbscd");
            return (Criteria) this;
        }

        public Criteria andBpbscdNotEqualTo(String value) {
            addCriterion("BPBSCD <>", value, "bpbscd");
            return (Criteria) this;
        }

        public Criteria andBpbscdGreaterThan(String value) {
            addCriterion("BPBSCD >", value, "bpbscd");
            return (Criteria) this;
        }

        public Criteria andBpbscdGreaterThanOrEqualTo(String value) {
            addCriterion("BPBSCD >=", value, "bpbscd");
            return (Criteria) this;
        }

        public Criteria andBpbscdLessThan(String value) {
            addCriterion("BPBSCD <", value, "bpbscd");
            return (Criteria) this;
        }

        public Criteria andBpbscdLessThanOrEqualTo(String value) {
            addCriterion("BPBSCD <=", value, "bpbscd");
            return (Criteria) this;
        }

        public Criteria andBpbscdIn(List<String> values) {
            addCriterion("BPBSCD in", values, "bpbscd");
            return (Criteria) this;
        }

        public Criteria andBpbscdNotIn(List<String> values) {
            addCriterion("BPBSCD not in", values, "bpbscd");
            return (Criteria) this;
        }

        public Criteria andBpbscdBetween(String value1, String value2) {
            addCriterion("BPBSCD between", value1, value2, "bpbscd");
            return (Criteria) this;
        }

        public Criteria andBpbscdNotBetween(String value1, String value2) {
            addCriterion("BPBSCD not between", value1, value2, "bpbscd");
            return (Criteria) this;
        }

        public Criteria andBpledgIsNull() {
            addCriterion("BPLEDG is null");
            return (Criteria) this;
        }

        public Criteria andBpledgIsNotNull() {
            addCriterion("BPLEDG is not null");
            return (Criteria) this;
        }

        public Criteria andBpledgEqualTo(String value) {
            addCriterion("BPLEDG =", value, "bpledg");
            return (Criteria) this;
        }

        public Criteria andBpledgNotEqualTo(String value) {
            addCriterion("BPLEDG <>", value, "bpledg");
            return (Criteria) this;
        }

        public Criteria andBpledgGreaterThan(String value) {
            addCriterion("BPLEDG >", value, "bpledg");
            return (Criteria) this;
        }

        public Criteria andBpledgGreaterThanOrEqualTo(String value) {
            addCriterion("BPLEDG >=", value, "bpledg");
            return (Criteria) this;
        }

        public Criteria andBpledgLessThan(String value) {
            addCriterion("BPLEDG <", value, "bpledg");
            return (Criteria) this;
        }

        public Criteria andBpledgLessThanOrEqualTo(String value) {
            addCriterion("BPLEDG <=", value, "bpledg");
            return (Criteria) this;
        }

        public Criteria andBpledgIn(List<String> values) {
            addCriterion("BPLEDG in", values, "bpledg");
            return (Criteria) this;
        }

        public Criteria andBpledgNotIn(List<String> values) {
            addCriterion("BPLEDG not in", values, "bpledg");
            return (Criteria) this;
        }

        public Criteria andBpledgBetween(String value1, String value2) {
            addCriterion("BPLEDG between", value1, value2, "bpledg");
            return (Criteria) this;
        }

        public Criteria andBpledgNotBetween(String value1, String value2) {
            addCriterion("BPLEDG not between", value1, value2, "bpledg");
            return (Criteria) this;
        }

        public Criteria andBpfvtrIsNull() {
            addCriterion("BPFVTR is null");
            return (Criteria) this;
        }

        public Criteria andBpfvtrIsNotNull() {
            addCriterion("BPFVTR is not null");
            return (Criteria) this;
        }

        public Criteria andBpfvtrEqualTo(Double value) {
            addCriterion("BPFVTR =", value, "bpfvtr");
            return (Criteria) this;
        }

        public Criteria andBpfvtrNotEqualTo(Double value) {
            addCriterion("BPFVTR <>", value, "bpfvtr");
            return (Criteria) this;
        }

        public Criteria andBpfvtrGreaterThan(Double value) {
            addCriterion("BPFVTR >", value, "bpfvtr");
            return (Criteria) this;
        }

        public Criteria andBpfvtrGreaterThanOrEqualTo(Double value) {
            addCriterion("BPFVTR >=", value, "bpfvtr");
            return (Criteria) this;
        }

        public Criteria andBpfvtrLessThan(Double value) {
            addCriterion("BPFVTR <", value, "bpfvtr");
            return (Criteria) this;
        }

        public Criteria andBpfvtrLessThanOrEqualTo(Double value) {
            addCriterion("BPFVTR <=", value, "bpfvtr");
            return (Criteria) this;
        }

        public Criteria andBpfvtrIn(List<Double> values) {
            addCriterion("BPFVTR in", values, "bpfvtr");
            return (Criteria) this;
        }

        public Criteria andBpfvtrNotIn(List<Double> values) {
            addCriterion("BPFVTR not in", values, "bpfvtr");
            return (Criteria) this;
        }

        public Criteria andBpfvtrBetween(Double value1, Double value2) {
            addCriterion("BPFVTR between", value1, value2, "bpfvtr");
            return (Criteria) this;
        }

        public Criteria andBpfvtrNotBetween(Double value1, Double value2) {
            addCriterion("BPFVTR not between", value1, value2, "bpfvtr");
            return (Criteria) this;
        }

        public Criteria andBpfrmnIsNull() {
            addCriterion("BPFRMN is null");
            return (Criteria) this;
        }

        public Criteria andBpfrmnIsNotNull() {
            addCriterion("BPFRMN is not null");
            return (Criteria) this;
        }

        public Criteria andBpfrmnEqualTo(String value) {
            addCriterion("BPFRMN =", value, "bpfrmn");
            return (Criteria) this;
        }

        public Criteria andBpfrmnNotEqualTo(String value) {
            addCriterion("BPFRMN <>", value, "bpfrmn");
            return (Criteria) this;
        }

        public Criteria andBpfrmnGreaterThan(String value) {
            addCriterion("BPFRMN >", value, "bpfrmn");
            return (Criteria) this;
        }

        public Criteria andBpfrmnGreaterThanOrEqualTo(String value) {
            addCriterion("BPFRMN >=", value, "bpfrmn");
            return (Criteria) this;
        }

        public Criteria andBpfrmnLessThan(String value) {
            addCriterion("BPFRMN <", value, "bpfrmn");
            return (Criteria) this;
        }

        public Criteria andBpfrmnLessThanOrEqualTo(String value) {
            addCriterion("BPFRMN <=", value, "bpfrmn");
            return (Criteria) this;
        }

        public Criteria andBpfrmnIn(List<String> values) {
            addCriterion("BPFRMN in", values, "bpfrmn");
            return (Criteria) this;
        }

        public Criteria andBpfrmnNotIn(List<String> values) {
            addCriterion("BPFRMN not in", values, "bpfrmn");
            return (Criteria) this;
        }

        public Criteria andBpfrmnBetween(String value1, String value2) {
            addCriterion("BPFRMN between", value1, value2, "bpfrmn");
            return (Criteria) this;
        }

        public Criteria andBpfrmnNotBetween(String value1, String value2) {
            addCriterion("BPFRMN not between", value1, value2, "bpfrmn");
            return (Criteria) this;
        }

        public Criteria andBpurcdIsNull() {
            addCriterion("BPURCD is null");
            return (Criteria) this;
        }

        public Criteria andBpurcdIsNotNull() {
            addCriterion("BPURCD is not null");
            return (Criteria) this;
        }

        public Criteria andBpurcdEqualTo(String value) {
            addCriterion("BPURCD =", value, "bpurcd");
            return (Criteria) this;
        }

        public Criteria andBpurcdNotEqualTo(String value) {
            addCriterion("BPURCD <>", value, "bpurcd");
            return (Criteria) this;
        }

        public Criteria andBpurcdGreaterThan(String value) {
            addCriterion("BPURCD >", value, "bpurcd");
            return (Criteria) this;
        }

        public Criteria andBpurcdGreaterThanOrEqualTo(String value) {
            addCriterion("BPURCD >=", value, "bpurcd");
            return (Criteria) this;
        }

        public Criteria andBpurcdLessThan(String value) {
            addCriterion("BPURCD <", value, "bpurcd");
            return (Criteria) this;
        }

        public Criteria andBpurcdLessThanOrEqualTo(String value) {
            addCriterion("BPURCD <=", value, "bpurcd");
            return (Criteria) this;
        }

        public Criteria andBpurcdIn(List<String> values) {
            addCriterion("BPURCD in", values, "bpurcd");
            return (Criteria) this;
        }

        public Criteria andBpurcdNotIn(List<String> values) {
            addCriterion("BPURCD not in", values, "bpurcd");
            return (Criteria) this;
        }

        public Criteria andBpurcdBetween(String value1, String value2) {
            addCriterion("BPURCD between", value1, value2, "bpurcd");
            return (Criteria) this;
        }

        public Criteria andBpurcdNotBetween(String value1, String value2) {
            addCriterion("BPURCD not between", value1, value2, "bpurcd");
            return (Criteria) this;
        }

        public Criteria andBpurdtIsNull() {
            addCriterion("BPURDT is null");
            return (Criteria) this;
        }

        public Criteria andBpurdtIsNotNull() {
            addCriterion("BPURDT is not null");
            return (Criteria) this;
        }

        public Criteria andBpurdtEqualTo(Double value) {
            addCriterion("BPURDT =", value, "bpurdt");
            return (Criteria) this;
        }

        public Criteria andBpurdtNotEqualTo(Double value) {
            addCriterion("BPURDT <>", value, "bpurdt");
            return (Criteria) this;
        }

        public Criteria andBpurdtGreaterThan(Double value) {
            addCriterion("BPURDT >", value, "bpurdt");
            return (Criteria) this;
        }

        public Criteria andBpurdtGreaterThanOrEqualTo(Double value) {
            addCriterion("BPURDT >=", value, "bpurdt");
            return (Criteria) this;
        }

        public Criteria andBpurdtLessThan(Double value) {
            addCriterion("BPURDT <", value, "bpurdt");
            return (Criteria) this;
        }

        public Criteria andBpurdtLessThanOrEqualTo(Double value) {
            addCriterion("BPURDT <=", value, "bpurdt");
            return (Criteria) this;
        }

        public Criteria andBpurdtIn(List<Double> values) {
            addCriterion("BPURDT in", values, "bpurdt");
            return (Criteria) this;
        }

        public Criteria andBpurdtNotIn(List<Double> values) {
            addCriterion("BPURDT not in", values, "bpurdt");
            return (Criteria) this;
        }

        public Criteria andBpurdtBetween(Double value1, Double value2) {
            addCriterion("BPURDT between", value1, value2, "bpurdt");
            return (Criteria) this;
        }

        public Criteria andBpurdtNotBetween(Double value1, Double value2) {
            addCriterion("BPURDT not between", value1, value2, "bpurdt");
            return (Criteria) this;
        }

        public Criteria andBpuratIsNull() {
            addCriterion("BPURAT is null");
            return (Criteria) this;
        }

        public Criteria andBpuratIsNotNull() {
            addCriterion("BPURAT is not null");
            return (Criteria) this;
        }

        public Criteria andBpuratEqualTo(Double value) {
            addCriterion("BPURAT =", value, "bpurat");
            return (Criteria) this;
        }

        public Criteria andBpuratNotEqualTo(Double value) {
            addCriterion("BPURAT <>", value, "bpurat");
            return (Criteria) this;
        }

        public Criteria andBpuratGreaterThan(Double value) {
            addCriterion("BPURAT >", value, "bpurat");
            return (Criteria) this;
        }

        public Criteria andBpuratGreaterThanOrEqualTo(Double value) {
            addCriterion("BPURAT >=", value, "bpurat");
            return (Criteria) this;
        }

        public Criteria andBpuratLessThan(Double value) {
            addCriterion("BPURAT <", value, "bpurat");
            return (Criteria) this;
        }

        public Criteria andBpuratLessThanOrEqualTo(Double value) {
            addCriterion("BPURAT <=", value, "bpurat");
            return (Criteria) this;
        }

        public Criteria andBpuratIn(List<Double> values) {
            addCriterion("BPURAT in", values, "bpurat");
            return (Criteria) this;
        }

        public Criteria andBpuratNotIn(List<Double> values) {
            addCriterion("BPURAT not in", values, "bpurat");
            return (Criteria) this;
        }

        public Criteria andBpuratBetween(Double value1, Double value2) {
            addCriterion("BPURAT between", value1, value2, "bpurat");
            return (Criteria) this;
        }

        public Criteria andBpuratNotBetween(Double value1, Double value2) {
            addCriterion("BPURAT not between", value1, value2, "bpurat");
            return (Criteria) this;
        }

        public Criteria andBpurabIsNull() {
            addCriterion("BPURAB is null");
            return (Criteria) this;
        }

        public Criteria andBpurabIsNotNull() {
            addCriterion("BPURAB is not null");
            return (Criteria) this;
        }

        public Criteria andBpurabEqualTo(Double value) {
            addCriterion("BPURAB =", value, "bpurab");
            return (Criteria) this;
        }

        public Criteria andBpurabNotEqualTo(Double value) {
            addCriterion("BPURAB <>", value, "bpurab");
            return (Criteria) this;
        }

        public Criteria andBpurabGreaterThan(Double value) {
            addCriterion("BPURAB >", value, "bpurab");
            return (Criteria) this;
        }

        public Criteria andBpurabGreaterThanOrEqualTo(Double value) {
            addCriterion("BPURAB >=", value, "bpurab");
            return (Criteria) this;
        }

        public Criteria andBpurabLessThan(Double value) {
            addCriterion("BPURAB <", value, "bpurab");
            return (Criteria) this;
        }

        public Criteria andBpurabLessThanOrEqualTo(Double value) {
            addCriterion("BPURAB <=", value, "bpurab");
            return (Criteria) this;
        }

        public Criteria andBpurabIn(List<Double> values) {
            addCriterion("BPURAB in", values, "bpurab");
            return (Criteria) this;
        }

        public Criteria andBpurabNotIn(List<Double> values) {
            addCriterion("BPURAB not in", values, "bpurab");
            return (Criteria) this;
        }

        public Criteria andBpurabBetween(Double value1, Double value2) {
            addCriterion("BPURAB between", value1, value2, "bpurab");
            return (Criteria) this;
        }

        public Criteria andBpurabNotBetween(Double value1, Double value2) {
            addCriterion("BPURAB not between", value1, value2, "bpurab");
            return (Criteria) this;
        }

        public Criteria andBpurrfIsNull() {
            addCriterion("BPURRF is null");
            return (Criteria) this;
        }

        public Criteria andBpurrfIsNotNull() {
            addCriterion("BPURRF is not null");
            return (Criteria) this;
        }

        public Criteria andBpurrfEqualTo(String value) {
            addCriterion("BPURRF =", value, "bpurrf");
            return (Criteria) this;
        }

        public Criteria andBpurrfNotEqualTo(String value) {
            addCriterion("BPURRF <>", value, "bpurrf");
            return (Criteria) this;
        }

        public Criteria andBpurrfGreaterThan(String value) {
            addCriterion("BPURRF >", value, "bpurrf");
            return (Criteria) this;
        }

        public Criteria andBpurrfGreaterThanOrEqualTo(String value) {
            addCriterion("BPURRF >=", value, "bpurrf");
            return (Criteria) this;
        }

        public Criteria andBpurrfLessThan(String value) {
            addCriterion("BPURRF <", value, "bpurrf");
            return (Criteria) this;
        }

        public Criteria andBpurrfLessThanOrEqualTo(String value) {
            addCriterion("BPURRF <=", value, "bpurrf");
            return (Criteria) this;
        }

        public Criteria andBpurrfIn(List<String> values) {
            addCriterion("BPURRF in", values, "bpurrf");
            return (Criteria) this;
        }

        public Criteria andBpurrfNotIn(List<String> values) {
            addCriterion("BPURRF not in", values, "bpurrf");
            return (Criteria) this;
        }

        public Criteria andBpurrfBetween(String value1, String value2) {
            addCriterion("BPURRF between", value1, value2, "bpurrf");
            return (Criteria) this;
        }

        public Criteria andBpurrfNotBetween(String value1, String value2) {
            addCriterion("BPURRF not between", value1, value2, "bpurrf");
            return (Criteria) this;
        }

        public Criteria andBpaprsIsNull() {
            addCriterion("BPAPRS is null");
            return (Criteria) this;
        }

        public Criteria andBpaprsIsNotNull() {
            addCriterion("BPAPRS is not null");
            return (Criteria) this;
        }

        public Criteria andBpaprsEqualTo(String value) {
            addCriterion("BPAPRS =", value, "bpaprs");
            return (Criteria) this;
        }

        public Criteria andBpaprsNotEqualTo(String value) {
            addCriterion("BPAPRS <>", value, "bpaprs");
            return (Criteria) this;
        }

        public Criteria andBpaprsGreaterThan(String value) {
            addCriterion("BPAPRS >", value, "bpaprs");
            return (Criteria) this;
        }

        public Criteria andBpaprsGreaterThanOrEqualTo(String value) {
            addCriterion("BPAPRS >=", value, "bpaprs");
            return (Criteria) this;
        }

        public Criteria andBpaprsLessThan(String value) {
            addCriterion("BPAPRS <", value, "bpaprs");
            return (Criteria) this;
        }

        public Criteria andBpaprsLessThanOrEqualTo(String value) {
            addCriterion("BPAPRS <=", value, "bpaprs");
            return (Criteria) this;
        }

        public Criteria andBpaprsIn(List<String> values) {
            addCriterion("BPAPRS in", values, "bpaprs");
            return (Criteria) this;
        }

        public Criteria andBpaprsNotIn(List<String> values) {
            addCriterion("BPAPRS not in", values, "bpaprs");
            return (Criteria) this;
        }

        public Criteria andBpaprsBetween(String value1, String value2) {
            addCriterion("BPAPRS between", value1, value2, "bpaprs");
            return (Criteria) this;
        }

        public Criteria andBpaprsNotBetween(String value1, String value2) {
            addCriterion("BPAPRS not between", value1, value2, "bpaprs");
            return (Criteria) this;
        }

        public Criteria andBpuserIsNull() {
            addCriterion("BPUSER is null");
            return (Criteria) this;
        }

        public Criteria andBpuserIsNotNull() {
            addCriterion("BPUSER is not null");
            return (Criteria) this;
        }

        public Criteria andBpuserEqualTo(String value) {
            addCriterion("BPUSER =", value, "bpuser");
            return (Criteria) this;
        }

        public Criteria andBpuserNotEqualTo(String value) {
            addCriterion("BPUSER <>", value, "bpuser");
            return (Criteria) this;
        }

        public Criteria andBpuserGreaterThan(String value) {
            addCriterion("BPUSER >", value, "bpuser");
            return (Criteria) this;
        }

        public Criteria andBpuserGreaterThanOrEqualTo(String value) {
            addCriterion("BPUSER >=", value, "bpuser");
            return (Criteria) this;
        }

        public Criteria andBpuserLessThan(String value) {
            addCriterion("BPUSER <", value, "bpuser");
            return (Criteria) this;
        }

        public Criteria andBpuserLessThanOrEqualTo(String value) {
            addCriterion("BPUSER <=", value, "bpuser");
            return (Criteria) this;
        }

        public Criteria andBpuserIn(List<String> values) {
            addCriterion("BPUSER in", values, "bpuser");
            return (Criteria) this;
        }

        public Criteria andBpuserNotIn(List<String> values) {
            addCriterion("BPUSER not in", values, "bpuser");
            return (Criteria) this;
        }

        public Criteria andBpuserBetween(String value1, String value2) {
            addCriterion("BPUSER between", value1, value2, "bpuser");
            return (Criteria) this;
        }

        public Criteria andBpuserNotBetween(String value1, String value2) {
            addCriterion("BPUSER not between", value1, value2, "bpuser");
            return (Criteria) this;
        }

        public Criteria andBppidIsNull() {
            addCriterion("BPPID is null");
            return (Criteria) this;
        }

        public Criteria andBppidIsNotNull() {
            addCriterion("BPPID is not null");
            return (Criteria) this;
        }

        public Criteria andBppidEqualTo(String value) {
            addCriterion("BPPID =", value, "bppid");
            return (Criteria) this;
        }

        public Criteria andBppidNotEqualTo(String value) {
            addCriterion("BPPID <>", value, "bppid");
            return (Criteria) this;
        }

        public Criteria andBppidGreaterThan(String value) {
            addCriterion("BPPID >", value, "bppid");
            return (Criteria) this;
        }

        public Criteria andBppidGreaterThanOrEqualTo(String value) {
            addCriterion("BPPID >=", value, "bppid");
            return (Criteria) this;
        }

        public Criteria andBppidLessThan(String value) {
            addCriterion("BPPID <", value, "bppid");
            return (Criteria) this;
        }

        public Criteria andBppidLessThanOrEqualTo(String value) {
            addCriterion("BPPID <=", value, "bppid");
            return (Criteria) this;
        }

        public Criteria andBppidIn(List<String> values) {
            addCriterion("BPPID in", values, "bppid");
            return (Criteria) this;
        }

        public Criteria andBppidNotIn(List<String> values) {
            addCriterion("BPPID not in", values, "bppid");
            return (Criteria) this;
        }

        public Criteria andBppidBetween(String value1, String value2) {
            addCriterion("BPPID between", value1, value2, "bppid");
            return (Criteria) this;
        }

        public Criteria andBppidNotBetween(String value1, String value2) {
            addCriterion("BPPID not between", value1, value2, "bppid");
            return (Criteria) this;
        }

        public Criteria andBpjobnIsNull() {
            addCriterion("BPJOBN is null");
            return (Criteria) this;
        }

        public Criteria andBpjobnIsNotNull() {
            addCriterion("BPJOBN is not null");
            return (Criteria) this;
        }

        public Criteria andBpjobnEqualTo(String value) {
            addCriterion("BPJOBN =", value, "bpjobn");
            return (Criteria) this;
        }

        public Criteria andBpjobnNotEqualTo(String value) {
            addCriterion("BPJOBN <>", value, "bpjobn");
            return (Criteria) this;
        }

        public Criteria andBpjobnGreaterThan(String value) {
            addCriterion("BPJOBN >", value, "bpjobn");
            return (Criteria) this;
        }

        public Criteria andBpjobnGreaterThanOrEqualTo(String value) {
            addCriterion("BPJOBN >=", value, "bpjobn");
            return (Criteria) this;
        }

        public Criteria andBpjobnLessThan(String value) {
            addCriterion("BPJOBN <", value, "bpjobn");
            return (Criteria) this;
        }

        public Criteria andBpjobnLessThanOrEqualTo(String value) {
            addCriterion("BPJOBN <=", value, "bpjobn");
            return (Criteria) this;
        }

        public Criteria andBpjobnIn(List<String> values) {
            addCriterion("BPJOBN in", values, "bpjobn");
            return (Criteria) this;
        }

        public Criteria andBpjobnNotIn(List<String> values) {
            addCriterion("BPJOBN not in", values, "bpjobn");
            return (Criteria) this;
        }

        public Criteria andBpjobnBetween(String value1, String value2) {
            addCriterion("BPJOBN between", value1, value2, "bpjobn");
            return (Criteria) this;
        }

        public Criteria andBpjobnNotBetween(String value1, String value2) {
            addCriterion("BPJOBN not between", value1, value2, "bpjobn");
            return (Criteria) this;
        }

        public Criteria andBpupmjIsNull() {
            addCriterion("BPUPMJ is null");
            return (Criteria) this;
        }

        public Criteria andBpupmjIsNotNull() {
            addCriterion("BPUPMJ is not null");
            return (Criteria) this;
        }

        public Criteria andBpupmjEqualTo(Double value) {
            addCriterion("BPUPMJ =", value, "bpupmj");
            return (Criteria) this;
        }

        public Criteria andBpupmjNotEqualTo(Double value) {
            addCriterion("BPUPMJ <>", value, "bpupmj");
            return (Criteria) this;
        }

        public Criteria andBpupmjGreaterThan(Double value) {
            addCriterion("BPUPMJ >", value, "bpupmj");
            return (Criteria) this;
        }

        public Criteria andBpupmjGreaterThanOrEqualTo(Double value) {
            addCriterion("BPUPMJ >=", value, "bpupmj");
            return (Criteria) this;
        }

        public Criteria andBpupmjLessThan(Double value) {
            addCriterion("BPUPMJ <", value, "bpupmj");
            return (Criteria) this;
        }

        public Criteria andBpupmjLessThanOrEqualTo(Double value) {
            addCriterion("BPUPMJ <=", value, "bpupmj");
            return (Criteria) this;
        }

        public Criteria andBpupmjIn(List<Double> values) {
            addCriterion("BPUPMJ in", values, "bpupmj");
            return (Criteria) this;
        }

        public Criteria andBpupmjNotIn(List<Double> values) {
            addCriterion("BPUPMJ not in", values, "bpupmj");
            return (Criteria) this;
        }

        public Criteria andBpupmjBetween(Double value1, Double value2) {
            addCriterion("BPUPMJ between", value1, value2, "bpupmj");
            return (Criteria) this;
        }

        public Criteria andBpupmjNotBetween(Double value1, Double value2) {
            addCriterion("BPUPMJ not between", value1, value2, "bpupmj");
            return (Criteria) this;
        }

        public Criteria andBptdayIsNull() {
            addCriterion("BPTDAY is null");
            return (Criteria) this;
        }

        public Criteria andBptdayIsNotNull() {
            addCriterion("BPTDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBptdayEqualTo(Double value) {
            addCriterion("BPTDAY =", value, "bptday");
            return (Criteria) this;
        }

        public Criteria andBptdayNotEqualTo(Double value) {
            addCriterion("BPTDAY <>", value, "bptday");
            return (Criteria) this;
        }

        public Criteria andBptdayGreaterThan(Double value) {
            addCriterion("BPTDAY >", value, "bptday");
            return (Criteria) this;
        }

        public Criteria andBptdayGreaterThanOrEqualTo(Double value) {
            addCriterion("BPTDAY >=", value, "bptday");
            return (Criteria) this;
        }

        public Criteria andBptdayLessThan(Double value) {
            addCriterion("BPTDAY <", value, "bptday");
            return (Criteria) this;
        }

        public Criteria andBptdayLessThanOrEqualTo(Double value) {
            addCriterion("BPTDAY <=", value, "bptday");
            return (Criteria) this;
        }

        public Criteria andBptdayIn(List<Double> values) {
            addCriterion("BPTDAY in", values, "bptday");
            return (Criteria) this;
        }

        public Criteria andBptdayNotIn(List<Double> values) {
            addCriterion("BPTDAY not in", values, "bptday");
            return (Criteria) this;
        }

        public Criteria andBptdayBetween(Double value1, Double value2) {
            addCriterion("BPTDAY between", value1, value2, "bptday");
            return (Criteria) this;
        }

        public Criteria andBptdayNotBetween(Double value1, Double value2) {
            addCriterion("BPTDAY not between", value1, value2, "bptday");
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