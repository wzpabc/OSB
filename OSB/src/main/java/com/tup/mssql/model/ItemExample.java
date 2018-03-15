package com.tup.mssql.model;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
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

        public Criteria andIbmcuIsNull() {
            addCriterion("IBMCU is null");
            return (Criteria) this;
        }

        public Criteria andIbmcuIsNotNull() {
            addCriterion("IBMCU is not null");
            return (Criteria) this;
        }

        public Criteria andIbmcuEqualTo(String value) {
            addCriterion("IBMCU =", value, "ibmcu");
            return (Criteria) this;
        }

        public Criteria andIbmcuNotEqualTo(String value) {
            addCriterion("IBMCU <>", value, "ibmcu");
            return (Criteria) this;
        }

        public Criteria andIbmcuGreaterThan(String value) {
            addCriterion("IBMCU >", value, "ibmcu");
            return (Criteria) this;
        }

        public Criteria andIbmcuGreaterThanOrEqualTo(String value) {
            addCriterion("IBMCU >=", value, "ibmcu");
            return (Criteria) this;
        }

        public Criteria andIbmcuLessThan(String value) {
            addCriterion("IBMCU <", value, "ibmcu");
            return (Criteria) this;
        }

        public Criteria andIbmcuLessThanOrEqualTo(String value) {
            addCriterion("IBMCU <=", value, "ibmcu");
            return (Criteria) this;
        }

        public Criteria andIbmcuLike(String value) {
            addCriterion("IBMCU like", value, "ibmcu");
            return (Criteria) this;
        }

        public Criteria andIbmcuNotLike(String value) {
            addCriterion("IBMCU not like", value, "ibmcu");
            return (Criteria) this;
        }

        public Criteria andIbmcuIn(List<String> values) {
            addCriterion("IBMCU in", values, "ibmcu");
            return (Criteria) this;
        }

        public Criteria andIbmcuNotIn(List<String> values) {
            addCriterion("IBMCU not in", values, "ibmcu");
            return (Criteria) this;
        }

        public Criteria andIbmcuBetween(String value1, String value2) {
            addCriterion("IBMCU between", value1, value2, "ibmcu");
            return (Criteria) this;
        }

        public Criteria andIbmcuNotBetween(String value1, String value2) {
            addCriterion("IBMCU not between", value1, value2, "ibmcu");
            return (Criteria) this;
        }

        public Criteria andIbitmIsNull() {
            addCriterion("IBITM is null");
            return (Criteria) this;
        }

        public Criteria andIbitmIsNotNull() {
            addCriterion("IBITM is not null");
            return (Criteria) this;
        }

        public Criteria andIbitmEqualTo(Integer value) {
            addCriterion("IBITM =", value, "ibitm");
            return (Criteria) this;
        }

        public Criteria andIbitmNotEqualTo(Integer value) {
            addCriterion("IBITM <>", value, "ibitm");
            return (Criteria) this;
        }

        public Criteria andIbitmGreaterThan(Integer value) {
            addCriterion("IBITM >", value, "ibitm");
            return (Criteria) this;
        }

        public Criteria andIbitmGreaterThanOrEqualTo(Integer value) {
            addCriterion("IBITM >=", value, "ibitm");
            return (Criteria) this;
        }

        public Criteria andIbitmLessThan(Integer value) {
            addCriterion("IBITM <", value, "ibitm");
            return (Criteria) this;
        }

        public Criteria andIbitmLessThanOrEqualTo(Integer value) {
            addCriterion("IBITM <=", value, "ibitm");
            return (Criteria) this;
        }

        public Criteria andIbitmIn(List<Integer> values) {
            addCriterion("IBITM in", values, "ibitm");
            return (Criteria) this;
        }

        public Criteria andIbitmNotIn(List<Integer> values) {
            addCriterion("IBITM not in", values, "ibitm");
            return (Criteria) this;
        }

        public Criteria andIbitmBetween(Integer value1, Integer value2) {
            addCriterion("IBITM between", value1, value2, "ibitm");
            return (Criteria) this;
        }

        public Criteria andIbitmNotBetween(Integer value1, Integer value2) {
            addCriterion("IBITM not between", value1, value2, "ibitm");
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

        public Criteria andImdsc1IsNull() {
            addCriterion("IMDSC1 is null");
            return (Criteria) this;
        }

        public Criteria andImdsc1IsNotNull() {
            addCriterion("IMDSC1 is not null");
            return (Criteria) this;
        }

        public Criteria andImdsc1EqualTo(String value) {
            addCriterion("IMDSC1 =", value, "imdsc1");
            return (Criteria) this;
        }

        public Criteria andImdsc1NotEqualTo(String value) {
            addCriterion("IMDSC1 <>", value, "imdsc1");
            return (Criteria) this;
        }

        public Criteria andImdsc1GreaterThan(String value) {
            addCriterion("IMDSC1 >", value, "imdsc1");
            return (Criteria) this;
        }

        public Criteria andImdsc1GreaterThanOrEqualTo(String value) {
            addCriterion("IMDSC1 >=", value, "imdsc1");
            return (Criteria) this;
        }

        public Criteria andImdsc1LessThan(String value) {
            addCriterion("IMDSC1 <", value, "imdsc1");
            return (Criteria) this;
        }

        public Criteria andImdsc1LessThanOrEqualTo(String value) {
            addCriterion("IMDSC1 <=", value, "imdsc1");
            return (Criteria) this;
        }

        public Criteria andImdsc1In(List<String> values) {
            addCriterion("IMDSC1 in", values, "imdsc1");
            return (Criteria) this;
        }

        public Criteria andImdsc1NotIn(List<String> values) {
            addCriterion("IMDSC1 not in", values, "imdsc1");
            return (Criteria) this;
        }

        public Criteria andImdsc1Between(String value1, String value2) {
            addCriterion("IMDSC1 between", value1, value2, "imdsc1");
            return (Criteria) this;
        }

        public Criteria andImdsc1NotBetween(String value1, String value2) {
            addCriterion("IMDSC1 not between", value1, value2, "imdsc1");
            return (Criteria) this;
        }

        public Criteria andImdsc2IsNull() {
            addCriterion("IMDSC2 is null");
            return (Criteria) this;
        }

        public Criteria andImdsc2IsNotNull() {
            addCriterion("IMDSC2 is not null");
            return (Criteria) this;
        }

        public Criteria andImdsc2EqualTo(String value) {
            addCriterion("IMDSC2 =", value, "imdsc2");
            return (Criteria) this;
        }

        public Criteria andImdsc2NotEqualTo(String value) {
            addCriterion("IMDSC2 <>", value, "imdsc2");
            return (Criteria) this;
        }

        public Criteria andImdsc2GreaterThan(String value) {
            addCriterion("IMDSC2 >", value, "imdsc2");
            return (Criteria) this;
        }

        public Criteria andImdsc2GreaterThanOrEqualTo(String value) {
            addCriterion("IMDSC2 >=", value, "imdsc2");
            return (Criteria) this;
        }

        public Criteria andImdsc2LessThan(String value) {
            addCriterion("IMDSC2 <", value, "imdsc2");
            return (Criteria) this;
        }

        public Criteria andImdsc2LessThanOrEqualTo(String value) {
            addCriterion("IMDSC2 <=", value, "imdsc2");
            return (Criteria) this;
        }

        public Criteria andImdsc2In(List<String> values) {
            addCriterion("IMDSC2 in", values, "imdsc2");
            return (Criteria) this;
        }

        public Criteria andImdsc2NotIn(List<String> values) {
            addCriterion("IMDSC2 not in", values, "imdsc2");
            return (Criteria) this;
        }

        public Criteria andImdsc2Between(String value1, String value2) {
            addCriterion("IMDSC2 between", value1, value2, "imdsc2");
            return (Criteria) this;
        }

        public Criteria andImdsc2NotBetween(String value1, String value2) {
            addCriterion("IMDSC2 not between", value1, value2, "imdsc2");
            return (Criteria) this;
        }

        public Criteria andIbdsc1EIsNull() {
            addCriterion("IBDSC1_e is null");
            return (Criteria) this;
        }

        public Criteria andIbdsc1EIsNotNull() {
            addCriterion("IBDSC1_e is not null");
            return (Criteria) this;
        }

        public Criteria andIbdsc1EEqualTo(String value) {
            addCriterion("IBDSC1_e =", value, "ibdsc1E");
            return (Criteria) this;
        }

        public Criteria andIbdsc1ENotEqualTo(String value) {
            addCriterion("IBDSC1_e <>", value, "ibdsc1E");
            return (Criteria) this;
        }

        public Criteria andIbdsc1EGreaterThan(String value) {
            addCriterion("IBDSC1_e >", value, "ibdsc1E");
            return (Criteria) this;
        }

        public Criteria andIbdsc1EGreaterThanOrEqualTo(String value) {
            addCriterion("IBDSC1_e >=", value, "ibdsc1E");
            return (Criteria) this;
        }

        public Criteria andIbdsc1ELessThan(String value) {
            addCriterion("IBDSC1_e <", value, "ibdsc1E");
            return (Criteria) this;
        }

        public Criteria andIbdsc1ELessThanOrEqualTo(String value) {
            addCriterion("IBDSC1_e <=", value, "ibdsc1E");
            return (Criteria) this;
        }

        public Criteria andIbdsc1EIn(List<String> values) {
            addCriterion("IBDSC1_e in", values, "ibdsc1E");
            return (Criteria) this;
        }

        public Criteria andIbdsc1ENotIn(List<String> values) {
            addCriterion("IBDSC1_e not in", values, "ibdsc1E");
            return (Criteria) this;
        }

        public Criteria andIbdsc1EBetween(String value1, String value2) {
            addCriterion("IBDSC1_e between", value1, value2, "ibdsc1E");
            return (Criteria) this;
        }

        public Criteria andIbdsc1ENotBetween(String value1, String value2) {
            addCriterion("IBDSC1_e not between", value1, value2, "ibdsc1E");
            return (Criteria) this;
        }

        public Criteria andIbdsc2EIsNull() {
            addCriterion("IBDSC2_e is null");
            return (Criteria) this;
        }

        public Criteria andIbdsc2EIsNotNull() {
            addCriterion("IBDSC2_e is not null");
            return (Criteria) this;
        }

        public Criteria andIbdsc2EEqualTo(String value) {
            addCriterion("IBDSC2_e =", value, "ibdsc2E");
            return (Criteria) this;
        }

        public Criteria andIbdsc2ENotEqualTo(String value) {
            addCriterion("IBDSC2_e <>", value, "ibdsc2E");
            return (Criteria) this;
        }

        public Criteria andIbdsc2EGreaterThan(String value) {
            addCriterion("IBDSC2_e >", value, "ibdsc2E");
            return (Criteria) this;
        }

        public Criteria andIbdsc2EGreaterThanOrEqualTo(String value) {
            addCriterion("IBDSC2_e >=", value, "ibdsc2E");
            return (Criteria) this;
        }

        public Criteria andIbdsc2ELessThan(String value) {
            addCriterion("IBDSC2_e <", value, "ibdsc2E");
            return (Criteria) this;
        }

        public Criteria andIbdsc2ELessThanOrEqualTo(String value) {
            addCriterion("IBDSC2_e <=", value, "ibdsc2E");
            return (Criteria) this;
        }

        public Criteria andIbdsc2EIn(List<String> values) {
            addCriterion("IBDSC2_e in", values, "ibdsc2E");
            return (Criteria) this;
        }

        public Criteria andIbdsc2ENotIn(List<String> values) {
            addCriterion("IBDSC2_e not in", values, "ibdsc2E");
            return (Criteria) this;
        }

        public Criteria andIbdsc2EBetween(String value1, String value2) {
            addCriterion("IBDSC2_e between", value1, value2, "ibdsc2E");
            return (Criteria) this;
        }

        public Criteria andIbdsc2ENotBetween(String value1, String value2) {
            addCriterion("IBDSC2_e not between", value1, value2, "ibdsc2E");
            return (Criteria) this;
        }

        public Criteria andIbsrp1IsNull() {
            addCriterion("IBSRP1 is null");
            return (Criteria) this;
        }

        public Criteria andIbsrp1IsNotNull() {
            addCriterion("IBSRP1 is not null");
            return (Criteria) this;
        }

        public Criteria andIbsrp1EqualTo(String value) {
            addCriterion("IBSRP1 =", value, "ibsrp1");
            return (Criteria) this;
        }

        public Criteria andIbsrp1NotEqualTo(String value) {
            addCriterion("IBSRP1 <>", value, "ibsrp1");
            return (Criteria) this;
        }

        public Criteria andIbsrp1GreaterThan(String value) {
            addCriterion("IBSRP1 >", value, "ibsrp1");
            return (Criteria) this;
        }

        public Criteria andIbsrp1GreaterThanOrEqualTo(String value) {
            addCriterion("IBSRP1 >=", value, "ibsrp1");
            return (Criteria) this;
        }

        public Criteria andIbsrp1LessThan(String value) {
            addCriterion("IBSRP1 <", value, "ibsrp1");
            return (Criteria) this;
        }

        public Criteria andIbsrp1LessThanOrEqualTo(String value) {
            addCriterion("IBSRP1 <=", value, "ibsrp1");
            return (Criteria) this;
        }

        public Criteria andIbsrp1Like(String value) {
            addCriterion("IBSRP1 like", value, "ibsrp1");
            return (Criteria) this;
        }

        public Criteria andIbsrp1NotLike(String value) {
            addCriterion("IBSRP1 not like", value, "ibsrp1");
            return (Criteria) this;
        }

        public Criteria andIbsrp1In(List<String> values) {
            addCriterion("IBSRP1 in", values, "ibsrp1");
            return (Criteria) this;
        }

        public Criteria andIbsrp1NotIn(List<String> values) {
            addCriterion("IBSRP1 not in", values, "ibsrp1");
            return (Criteria) this;
        }

        public Criteria andIbsrp1Between(String value1, String value2) {
            addCriterion("IBSRP1 between", value1, value2, "ibsrp1");
            return (Criteria) this;
        }

        public Criteria andIbsrp1NotBetween(String value1, String value2) {
            addCriterion("IBSRP1 not between", value1, value2, "ibsrp1");
            return (Criteria) this;
        }

        public Criteria andIbsrp2IsNull() {
            addCriterion("IBSRP2 is null");
            return (Criteria) this;
        }

        public Criteria andIbsrp2IsNotNull() {
            addCriterion("IBSRP2 is not null");
            return (Criteria) this;
        }

        public Criteria andIbsrp2EqualTo(String value) {
            addCriterion("IBSRP2 =", value, "ibsrp2");
            return (Criteria) this;
        }

        public Criteria andIbsrp2NotEqualTo(String value) {
            addCriterion("IBSRP2 <>", value, "ibsrp2");
            return (Criteria) this;
        }

        public Criteria andIbsrp2GreaterThan(String value) {
            addCriterion("IBSRP2 >", value, "ibsrp2");
            return (Criteria) this;
        }

        public Criteria andIbsrp2GreaterThanOrEqualTo(String value) {
            addCriterion("IBSRP2 >=", value, "ibsrp2");
            return (Criteria) this;
        }

        public Criteria andIbsrp2LessThan(String value) {
            addCriterion("IBSRP2 <", value, "ibsrp2");
            return (Criteria) this;
        }

        public Criteria andIbsrp2LessThanOrEqualTo(String value) {
            addCriterion("IBSRP2 <=", value, "ibsrp2");
            return (Criteria) this;
        }

        public Criteria andIbsrp2Like(String value) {
            addCriterion("IBSRP2 like", value, "ibsrp2");
            return (Criteria) this;
        }

        public Criteria andIbsrp2NotLike(String value) {
            addCriterion("IBSRP2 not like", value, "ibsrp2");
            return (Criteria) this;
        }

        public Criteria andIbsrp2In(List<String> values) {
            addCriterion("IBSRP2 in", values, "ibsrp2");
            return (Criteria) this;
        }

        public Criteria andIbsrp2NotIn(List<String> values) {
            addCriterion("IBSRP2 not in", values, "ibsrp2");
            return (Criteria) this;
        }

        public Criteria andIbsrp2Between(String value1, String value2) {
            addCriterion("IBSRP2 between", value1, value2, "ibsrp2");
            return (Criteria) this;
        }

        public Criteria andIbsrp2NotBetween(String value1, String value2) {
            addCriterion("IBSRP2 not between", value1, value2, "ibsrp2");
            return (Criteria) this;
        }

        public Criteria andIbsrp3IsNull() {
            addCriterion("IBSRP3 is null");
            return (Criteria) this;
        }

        public Criteria andIbsrp3IsNotNull() {
            addCriterion("IBSRP3 is not null");
            return (Criteria) this;
        }

        public Criteria andIbsrp3EqualTo(String value) {
            addCriterion("IBSRP3 =", value, "ibsrp3");
            return (Criteria) this;
        }

        public Criteria andIbsrp3NotEqualTo(String value) {
            addCriterion("IBSRP3 <>", value, "ibsrp3");
            return (Criteria) this;
        }

        public Criteria andIbsrp3GreaterThan(String value) {
            addCriterion("IBSRP3 >", value, "ibsrp3");
            return (Criteria) this;
        }

        public Criteria andIbsrp3GreaterThanOrEqualTo(String value) {
            addCriterion("IBSRP3 >=", value, "ibsrp3");
            return (Criteria) this;
        }

        public Criteria andIbsrp3LessThan(String value) {
            addCriterion("IBSRP3 <", value, "ibsrp3");
            return (Criteria) this;
        }

        public Criteria andIbsrp3LessThanOrEqualTo(String value) {
            addCriterion("IBSRP3 <=", value, "ibsrp3");
            return (Criteria) this;
        }

        public Criteria andIbsrp3Like(String value) {
            addCriterion("IBSRP3 like", value, "ibsrp3");
            return (Criteria) this;
        }

        public Criteria andIbsrp3NotLike(String value) {
            addCriterion("IBSRP3 not like", value, "ibsrp3");
            return (Criteria) this;
        }

        public Criteria andIbsrp3In(List<String> values) {
            addCriterion("IBSRP3 in", values, "ibsrp3");
            return (Criteria) this;
        }

        public Criteria andIbsrp3NotIn(List<String> values) {
            addCriterion("IBSRP3 not in", values, "ibsrp3");
            return (Criteria) this;
        }

        public Criteria andIbsrp3Between(String value1, String value2) {
            addCriterion("IBSRP3 between", value1, value2, "ibsrp3");
            return (Criteria) this;
        }

        public Criteria andIbsrp3NotBetween(String value1, String value2) {
            addCriterion("IBSRP3 not between", value1, value2, "ibsrp3");
            return (Criteria) this;
        }

        public Criteria andIbsrp4IsNull() {
            addCriterion("IBSRP4 is null");
            return (Criteria) this;
        }

        public Criteria andIbsrp4IsNotNull() {
            addCriterion("IBSRP4 is not null");
            return (Criteria) this;
        }

        public Criteria andIbsrp4EqualTo(String value) {
            addCriterion("IBSRP4 =", value, "ibsrp4");
            return (Criteria) this;
        }

        public Criteria andIbsrp4NotEqualTo(String value) {
            addCriterion("IBSRP4 <>", value, "ibsrp4");
            return (Criteria) this;
        }

        public Criteria andIbsrp4GreaterThan(String value) {
            addCriterion("IBSRP4 >", value, "ibsrp4");
            return (Criteria) this;
        }

        public Criteria andIbsrp4GreaterThanOrEqualTo(String value) {
            addCriterion("IBSRP4 >=", value, "ibsrp4");
            return (Criteria) this;
        }

        public Criteria andIbsrp4LessThan(String value) {
            addCriterion("IBSRP4 <", value, "ibsrp4");
            return (Criteria) this;
        }

        public Criteria andIbsrp4LessThanOrEqualTo(String value) {
            addCriterion("IBSRP4 <=", value, "ibsrp4");
            return (Criteria) this;
        }

        public Criteria andIbsrp4Like(String value) {
            addCriterion("IBSRP4 like", value, "ibsrp4");
            return (Criteria) this;
        }

        public Criteria andIbsrp4NotLike(String value) {
            addCriterion("IBSRP4 not like", value, "ibsrp4");
            return (Criteria) this;
        }

        public Criteria andIbsrp4In(List<String> values) {
            addCriterion("IBSRP4 in", values, "ibsrp4");
            return (Criteria) this;
        }

        public Criteria andIbsrp4NotIn(List<String> values) {
            addCriterion("IBSRP4 not in", values, "ibsrp4");
            return (Criteria) this;
        }

        public Criteria andIbsrp4Between(String value1, String value2) {
            addCriterion("IBSRP4 between", value1, value2, "ibsrp4");
            return (Criteria) this;
        }

        public Criteria andIbsrp4NotBetween(String value1, String value2) {
            addCriterion("IBSRP4 not between", value1, value2, "ibsrp4");
            return (Criteria) this;
        }

        public Criteria andIbsrp5IsNull() {
            addCriterion("IBSRP5 is null");
            return (Criteria) this;
        }

        public Criteria andIbsrp5IsNotNull() {
            addCriterion("IBSRP5 is not null");
            return (Criteria) this;
        }

        public Criteria andIbsrp5EqualTo(String value) {
            addCriterion("IBSRP5 =", value, "ibsrp5");
            return (Criteria) this;
        }

        public Criteria andIbsrp5NotEqualTo(String value) {
            addCriterion("IBSRP5 <>", value, "ibsrp5");
            return (Criteria) this;
        }

        public Criteria andIbsrp5GreaterThan(String value) {
            addCriterion("IBSRP5 >", value, "ibsrp5");
            return (Criteria) this;
        }

        public Criteria andIbsrp5GreaterThanOrEqualTo(String value) {
            addCriterion("IBSRP5 >=", value, "ibsrp5");
            return (Criteria) this;
        }

        public Criteria andIbsrp5LessThan(String value) {
            addCriterion("IBSRP5 <", value, "ibsrp5");
            return (Criteria) this;
        }

        public Criteria andIbsrp5LessThanOrEqualTo(String value) {
            addCriterion("IBSRP5 <=", value, "ibsrp5");
            return (Criteria) this;
        }

        public Criteria andIbsrp5Like(String value) {
            addCriterion("IBSRP5 like", value, "ibsrp5");
            return (Criteria) this;
        }

        public Criteria andIbsrp5NotLike(String value) {
            addCriterion("IBSRP5 not like", value, "ibsrp5");
            return (Criteria) this;
        }

        public Criteria andIbsrp5In(List<String> values) {
            addCriterion("IBSRP5 in", values, "ibsrp5");
            return (Criteria) this;
        }

        public Criteria andIbsrp5NotIn(List<String> values) {
            addCriterion("IBSRP5 not in", values, "ibsrp5");
            return (Criteria) this;
        }

        public Criteria andIbsrp5Between(String value1, String value2) {
            addCriterion("IBSRP5 between", value1, value2, "ibsrp5");
            return (Criteria) this;
        }

        public Criteria andIbsrp5NotBetween(String value1, String value2) {
            addCriterion("IBSRP5 not between", value1, value2, "ibsrp5");
            return (Criteria) this;
        }

        public Criteria andIbsrp6IsNull() {
            addCriterion("IBSRP6 is null");
            return (Criteria) this;
        }

        public Criteria andIbsrp6IsNotNull() {
            addCriterion("IBSRP6 is not null");
            return (Criteria) this;
        }

        public Criteria andIbsrp6EqualTo(String value) {
            addCriterion("IBSRP6 =", value, "ibsrp6");
            return (Criteria) this;
        }

        public Criteria andIbsrp6NotEqualTo(String value) {
            addCriterion("IBSRP6 <>", value, "ibsrp6");
            return (Criteria) this;
        }

        public Criteria andIbsrp6GreaterThan(String value) {
            addCriterion("IBSRP6 >", value, "ibsrp6");
            return (Criteria) this;
        }

        public Criteria andIbsrp6GreaterThanOrEqualTo(String value) {
            addCriterion("IBSRP6 >=", value, "ibsrp6");
            return (Criteria) this;
        }

        public Criteria andIbsrp6LessThan(String value) {
            addCriterion("IBSRP6 <", value, "ibsrp6");
            return (Criteria) this;
        }

        public Criteria andIbsrp6LessThanOrEqualTo(String value) {
            addCriterion("IBSRP6 <=", value, "ibsrp6");
            return (Criteria) this;
        }

        public Criteria andIbsrp6Like(String value) {
            addCriterion("IBSRP6 like", value, "ibsrp6");
            return (Criteria) this;
        }

        public Criteria andIbsrp6NotLike(String value) {
            addCriterion("IBSRP6 not like", value, "ibsrp6");
            return (Criteria) this;
        }

        public Criteria andIbsrp6In(List<String> values) {
            addCriterion("IBSRP6 in", values, "ibsrp6");
            return (Criteria) this;
        }

        public Criteria andIbsrp6NotIn(List<String> values) {
            addCriterion("IBSRP6 not in", values, "ibsrp6");
            return (Criteria) this;
        }

        public Criteria andIbsrp6Between(String value1, String value2) {
            addCriterion("IBSRP6 between", value1, value2, "ibsrp6");
            return (Criteria) this;
        }

        public Criteria andIbsrp6NotBetween(String value1, String value2) {
            addCriterion("IBSRP6 not between", value1, value2, "ibsrp6");
            return (Criteria) this;
        }

        public Criteria andIbsrp7IsNull() {
            addCriterion("IBSRP7 is null");
            return (Criteria) this;
        }

        public Criteria andIbsrp7IsNotNull() {
            addCriterion("IBSRP7 is not null");
            return (Criteria) this;
        }

        public Criteria andIbsrp7EqualTo(String value) {
            addCriterion("IBSRP7 =", value, "ibsrp7");
            return (Criteria) this;
        }

        public Criteria andIbsrp7NotEqualTo(String value) {
            addCriterion("IBSRP7 <>", value, "ibsrp7");
            return (Criteria) this;
        }

        public Criteria andIbsrp7GreaterThan(String value) {
            addCriterion("IBSRP7 >", value, "ibsrp7");
            return (Criteria) this;
        }

        public Criteria andIbsrp7GreaterThanOrEqualTo(String value) {
            addCriterion("IBSRP7 >=", value, "ibsrp7");
            return (Criteria) this;
        }

        public Criteria andIbsrp7LessThan(String value) {
            addCriterion("IBSRP7 <", value, "ibsrp7");
            return (Criteria) this;
        }

        public Criteria andIbsrp7LessThanOrEqualTo(String value) {
            addCriterion("IBSRP7 <=", value, "ibsrp7");
            return (Criteria) this;
        }

        public Criteria andIbsrp7Like(String value) {
            addCriterion("IBSRP7 like", value, "ibsrp7");
            return (Criteria) this;
        }

        public Criteria andIbsrp7NotLike(String value) {
            addCriterion("IBSRP7 not like", value, "ibsrp7");
            return (Criteria) this;
        }

        public Criteria andIbsrp7In(List<String> values) {
            addCriterion("IBSRP7 in", values, "ibsrp7");
            return (Criteria) this;
        }

        public Criteria andIbsrp7NotIn(List<String> values) {
            addCriterion("IBSRP7 not in", values, "ibsrp7");
            return (Criteria) this;
        }

        public Criteria andIbsrp7Between(String value1, String value2) {
            addCriterion("IBSRP7 between", value1, value2, "ibsrp7");
            return (Criteria) this;
        }

        public Criteria andIbsrp7NotBetween(String value1, String value2) {
            addCriterion("IBSRP7 not between", value1, value2, "ibsrp7");
            return (Criteria) this;
        }

        public Criteria andIbsrp8IsNull() {
            addCriterion("IBSRP8 is null");
            return (Criteria) this;
        }

        public Criteria andIbsrp8IsNotNull() {
            addCriterion("IBSRP8 is not null");
            return (Criteria) this;
        }

        public Criteria andIbsrp8EqualTo(String value) {
            addCriterion("IBSRP8 =", value, "ibsrp8");
            return (Criteria) this;
        }

        public Criteria andIbsrp8NotEqualTo(String value) {
            addCriterion("IBSRP8 <>", value, "ibsrp8");
            return (Criteria) this;
        }

        public Criteria andIbsrp8GreaterThan(String value) {
            addCriterion("IBSRP8 >", value, "ibsrp8");
            return (Criteria) this;
        }

        public Criteria andIbsrp8GreaterThanOrEqualTo(String value) {
            addCriterion("IBSRP8 >=", value, "ibsrp8");
            return (Criteria) this;
        }

        public Criteria andIbsrp8LessThan(String value) {
            addCriterion("IBSRP8 <", value, "ibsrp8");
            return (Criteria) this;
        }

        public Criteria andIbsrp8LessThanOrEqualTo(String value) {
            addCriterion("IBSRP8 <=", value, "ibsrp8");
            return (Criteria) this;
        }

        public Criteria andIbsrp8Like(String value) {
            addCriterion("IBSRP8 like", value, "ibsrp8");
            return (Criteria) this;
        }

        public Criteria andIbsrp8NotLike(String value) {
            addCriterion("IBSRP8 not like", value, "ibsrp8");
            return (Criteria) this;
        }

        public Criteria andIbsrp8In(List<String> values) {
            addCriterion("IBSRP8 in", values, "ibsrp8");
            return (Criteria) this;
        }

        public Criteria andIbsrp8NotIn(List<String> values) {
            addCriterion("IBSRP8 not in", values, "ibsrp8");
            return (Criteria) this;
        }

        public Criteria andIbsrp8Between(String value1, String value2) {
            addCriterion("IBSRP8 between", value1, value2, "ibsrp8");
            return (Criteria) this;
        }

        public Criteria andIbsrp8NotBetween(String value1, String value2) {
            addCriterion("IBSRP8 not between", value1, value2, "ibsrp8");
            return (Criteria) this;
        }

        public Criteria andIbsrp9IsNull() {
            addCriterion("IBSRP9 is null");
            return (Criteria) this;
        }

        public Criteria andIbsrp9IsNotNull() {
            addCriterion("IBSRP9 is not null");
            return (Criteria) this;
        }

        public Criteria andIbsrp9EqualTo(String value) {
            addCriterion("IBSRP9 =", value, "ibsrp9");
            return (Criteria) this;
        }

        public Criteria andIbsrp9NotEqualTo(String value) {
            addCriterion("IBSRP9 <>", value, "ibsrp9");
            return (Criteria) this;
        }

        public Criteria andIbsrp9GreaterThan(String value) {
            addCriterion("IBSRP9 >", value, "ibsrp9");
            return (Criteria) this;
        }

        public Criteria andIbsrp9GreaterThanOrEqualTo(String value) {
            addCriterion("IBSRP9 >=", value, "ibsrp9");
            return (Criteria) this;
        }

        public Criteria andIbsrp9LessThan(String value) {
            addCriterion("IBSRP9 <", value, "ibsrp9");
            return (Criteria) this;
        }

        public Criteria andIbsrp9LessThanOrEqualTo(String value) {
            addCriterion("IBSRP9 <=", value, "ibsrp9");
            return (Criteria) this;
        }

        public Criteria andIbsrp9Like(String value) {
            addCriterion("IBSRP9 like", value, "ibsrp9");
            return (Criteria) this;
        }

        public Criteria andIbsrp9NotLike(String value) {
            addCriterion("IBSRP9 not like", value, "ibsrp9");
            return (Criteria) this;
        }

        public Criteria andIbsrp9In(List<String> values) {
            addCriterion("IBSRP9 in", values, "ibsrp9");
            return (Criteria) this;
        }

        public Criteria andIbsrp9NotIn(List<String> values) {
            addCriterion("IBSRP9 not in", values, "ibsrp9");
            return (Criteria) this;
        }

        public Criteria andIbsrp9Between(String value1, String value2) {
            addCriterion("IBSRP9 between", value1, value2, "ibsrp9");
            return (Criteria) this;
        }

        public Criteria andIbsrp9NotBetween(String value1, String value2) {
            addCriterion("IBSRP9 not between", value1, value2, "ibsrp9");
            return (Criteria) this;
        }

        public Criteria andIbsrp0IsNull() {
            addCriterion("IBSRP0 is null");
            return (Criteria) this;
        }

        public Criteria andIbsrp0IsNotNull() {
            addCriterion("IBSRP0 is not null");
            return (Criteria) this;
        }

        public Criteria andIbsrp0EqualTo(String value) {
            addCriterion("IBSRP0 =", value, "ibsrp0");
            return (Criteria) this;
        }

        public Criteria andIbsrp0NotEqualTo(String value) {
            addCriterion("IBSRP0 <>", value, "ibsrp0");
            return (Criteria) this;
        }

        public Criteria andIbsrp0GreaterThan(String value) {
            addCriterion("IBSRP0 >", value, "ibsrp0");
            return (Criteria) this;
        }

        public Criteria andIbsrp0GreaterThanOrEqualTo(String value) {
            addCriterion("IBSRP0 >=", value, "ibsrp0");
            return (Criteria) this;
        }

        public Criteria andIbsrp0LessThan(String value) {
            addCriterion("IBSRP0 <", value, "ibsrp0");
            return (Criteria) this;
        }

        public Criteria andIbsrp0LessThanOrEqualTo(String value) {
            addCriterion("IBSRP0 <=", value, "ibsrp0");
            return (Criteria) this;
        }

        public Criteria andIbsrp0Like(String value) {
            addCriterion("IBSRP0 like", value, "ibsrp0");
            return (Criteria) this;
        }

        public Criteria andIbsrp0NotLike(String value) {
            addCriterion("IBSRP0 not like", value, "ibsrp0");
            return (Criteria) this;
        }

        public Criteria andIbsrp0In(List<String> values) {
            addCriterion("IBSRP0 in", values, "ibsrp0");
            return (Criteria) this;
        }

        public Criteria andIbsrp0NotIn(List<String> values) {
            addCriterion("IBSRP0 not in", values, "ibsrp0");
            return (Criteria) this;
        }

        public Criteria andIbsrp0Between(String value1, String value2) {
            addCriterion("IBSRP0 between", value1, value2, "ibsrp0");
            return (Criteria) this;
        }

        public Criteria andIbsrp0NotBetween(String value1, String value2) {
            addCriterion("IBSRP0 not between", value1, value2, "ibsrp0");
            return (Criteria) this;
        }

        public Criteria andIbprp1IsNull() {
            addCriterion("IBPRP1 is null");
            return (Criteria) this;
        }

        public Criteria andIbprp1IsNotNull() {
            addCriterion("IBPRP1 is not null");
            return (Criteria) this;
        }

        public Criteria andIbprp1EqualTo(String value) {
            addCriterion("IBPRP1 =", value, "ibprp1");
            return (Criteria) this;
        }

        public Criteria andIbprp1NotEqualTo(String value) {
            addCriterion("IBPRP1 <>", value, "ibprp1");
            return (Criteria) this;
        }

        public Criteria andIbprp1GreaterThan(String value) {
            addCriterion("IBPRP1 >", value, "ibprp1");
            return (Criteria) this;
        }

        public Criteria andIbprp1GreaterThanOrEqualTo(String value) {
            addCriterion("IBPRP1 >=", value, "ibprp1");
            return (Criteria) this;
        }

        public Criteria andIbprp1LessThan(String value) {
            addCriterion("IBPRP1 <", value, "ibprp1");
            return (Criteria) this;
        }

        public Criteria andIbprp1LessThanOrEqualTo(String value) {
            addCriterion("IBPRP1 <=", value, "ibprp1");
            return (Criteria) this;
        }

        public Criteria andIbprp1Like(String value) {
            addCriterion("IBPRP1 like", value, "ibprp1");
            return (Criteria) this;
        }

        public Criteria andIbprp1NotLike(String value) {
            addCriterion("IBPRP1 not like", value, "ibprp1");
            return (Criteria) this;
        }

        public Criteria andIbprp1In(List<String> values) {
            addCriterion("IBPRP1 in", values, "ibprp1");
            return (Criteria) this;
        }

        public Criteria andIbprp1NotIn(List<String> values) {
            addCriterion("IBPRP1 not in", values, "ibprp1");
            return (Criteria) this;
        }

        public Criteria andIbprp1Between(String value1, String value2) {
            addCriterion("IBPRP1 between", value1, value2, "ibprp1");
            return (Criteria) this;
        }

        public Criteria andIbprp1NotBetween(String value1, String value2) {
            addCriterion("IBPRP1 not between", value1, value2, "ibprp1");
            return (Criteria) this;
        }

        public Criteria andIbprp2IsNull() {
            addCriterion("IBPRP2 is null");
            return (Criteria) this;
        }

        public Criteria andIbprp2IsNotNull() {
            addCriterion("IBPRP2 is not null");
            return (Criteria) this;
        }

        public Criteria andIbprp2EqualTo(String value) {
            addCriterion("IBPRP2 =", value, "ibprp2");
            return (Criteria) this;
        }

        public Criteria andIbprp2NotEqualTo(String value) {
            addCriterion("IBPRP2 <>", value, "ibprp2");
            return (Criteria) this;
        }

        public Criteria andIbprp2GreaterThan(String value) {
            addCriterion("IBPRP2 >", value, "ibprp2");
            return (Criteria) this;
        }

        public Criteria andIbprp2GreaterThanOrEqualTo(String value) {
            addCriterion("IBPRP2 >=", value, "ibprp2");
            return (Criteria) this;
        }

        public Criteria andIbprp2LessThan(String value) {
            addCriterion("IBPRP2 <", value, "ibprp2");
            return (Criteria) this;
        }

        public Criteria andIbprp2LessThanOrEqualTo(String value) {
            addCriterion("IBPRP2 <=", value, "ibprp2");
            return (Criteria) this;
        }

        public Criteria andIbprp2Like(String value) {
            addCriterion("IBPRP2 like", value, "ibprp2");
            return (Criteria) this;
        }

        public Criteria andIbprp2NotLike(String value) {
            addCriterion("IBPRP2 not like", value, "ibprp2");
            return (Criteria) this;
        }

        public Criteria andIbprp2In(List<String> values) {
            addCriterion("IBPRP2 in", values, "ibprp2");
            return (Criteria) this;
        }

        public Criteria andIbprp2NotIn(List<String> values) {
            addCriterion("IBPRP2 not in", values, "ibprp2");
            return (Criteria) this;
        }

        public Criteria andIbprp2Between(String value1, String value2) {
            addCriterion("IBPRP2 between", value1, value2, "ibprp2");
            return (Criteria) this;
        }

        public Criteria andIbprp2NotBetween(String value1, String value2) {
            addCriterion("IBPRP2 not between", value1, value2, "ibprp2");
            return (Criteria) this;
        }

        public Criteria andIbprp3IsNull() {
            addCriterion("IBPRP3 is null");
            return (Criteria) this;
        }

        public Criteria andIbprp3IsNotNull() {
            addCriterion("IBPRP3 is not null");
            return (Criteria) this;
        }

        public Criteria andIbprp3EqualTo(String value) {
            addCriterion("IBPRP3 =", value, "ibprp3");
            return (Criteria) this;
        }

        public Criteria andIbprp3NotEqualTo(String value) {
            addCriterion("IBPRP3 <>", value, "ibprp3");
            return (Criteria) this;
        }

        public Criteria andIbprp3GreaterThan(String value) {
            addCriterion("IBPRP3 >", value, "ibprp3");
            return (Criteria) this;
        }

        public Criteria andIbprp3GreaterThanOrEqualTo(String value) {
            addCriterion("IBPRP3 >=", value, "ibprp3");
            return (Criteria) this;
        }

        public Criteria andIbprp3LessThan(String value) {
            addCriterion("IBPRP3 <", value, "ibprp3");
            return (Criteria) this;
        }

        public Criteria andIbprp3LessThanOrEqualTo(String value) {
            addCriterion("IBPRP3 <=", value, "ibprp3");
            return (Criteria) this;
        }

        public Criteria andIbprp3Like(String value) {
            addCriterion("IBPRP3 like", value, "ibprp3");
            return (Criteria) this;
        }

        public Criteria andIbprp3NotLike(String value) {
            addCriterion("IBPRP3 not like", value, "ibprp3");
            return (Criteria) this;
        }

        public Criteria andIbprp3In(List<String> values) {
            addCriterion("IBPRP3 in", values, "ibprp3");
            return (Criteria) this;
        }

        public Criteria andIbprp3NotIn(List<String> values) {
            addCriterion("IBPRP3 not in", values, "ibprp3");
            return (Criteria) this;
        }

        public Criteria andIbprp3Between(String value1, String value2) {
            addCriterion("IBPRP3 between", value1, value2, "ibprp3");
            return (Criteria) this;
        }

        public Criteria andIbprp3NotBetween(String value1, String value2) {
            addCriterion("IBPRP3 not between", value1, value2, "ibprp3");
            return (Criteria) this;
        }

        public Criteria andIbprp4IsNull() {
            addCriterion("IBPRP4 is null");
            return (Criteria) this;
        }

        public Criteria andIbprp4IsNotNull() {
            addCriterion("IBPRP4 is not null");
            return (Criteria) this;
        }

        public Criteria andIbprp4EqualTo(String value) {
            addCriterion("IBPRP4 =", value, "ibprp4");
            return (Criteria) this;
        }

        public Criteria andIbprp4NotEqualTo(String value) {
            addCriterion("IBPRP4 <>", value, "ibprp4");
            return (Criteria) this;
        }

        public Criteria andIbprp4GreaterThan(String value) {
            addCriterion("IBPRP4 >", value, "ibprp4");
            return (Criteria) this;
        }

        public Criteria andIbprp4GreaterThanOrEqualTo(String value) {
            addCriterion("IBPRP4 >=", value, "ibprp4");
            return (Criteria) this;
        }

        public Criteria andIbprp4LessThan(String value) {
            addCriterion("IBPRP4 <", value, "ibprp4");
            return (Criteria) this;
        }

        public Criteria andIbprp4LessThanOrEqualTo(String value) {
            addCriterion("IBPRP4 <=", value, "ibprp4");
            return (Criteria) this;
        }

        public Criteria andIbprp4Like(String value) {
            addCriterion("IBPRP4 like", value, "ibprp4");
            return (Criteria) this;
        }

        public Criteria andIbprp4NotLike(String value) {
            addCriterion("IBPRP4 not like", value, "ibprp4");
            return (Criteria) this;
        }

        public Criteria andIbprp4In(List<String> values) {
            addCriterion("IBPRP4 in", values, "ibprp4");
            return (Criteria) this;
        }

        public Criteria andIbprp4NotIn(List<String> values) {
            addCriterion("IBPRP4 not in", values, "ibprp4");
            return (Criteria) this;
        }

        public Criteria andIbprp4Between(String value1, String value2) {
            addCriterion("IBPRP4 between", value1, value2, "ibprp4");
            return (Criteria) this;
        }

        public Criteria andIbprp4NotBetween(String value1, String value2) {
            addCriterion("IBPRP4 not between", value1, value2, "ibprp4");
            return (Criteria) this;
        }

        public Criteria andIbprp5IsNull() {
            addCriterion("IBPRP5 is null");
            return (Criteria) this;
        }

        public Criteria andIbprp5IsNotNull() {
            addCriterion("IBPRP5 is not null");
            return (Criteria) this;
        }

        public Criteria andIbprp5EqualTo(String value) {
            addCriterion("IBPRP5 =", value, "ibprp5");
            return (Criteria) this;
        }

        public Criteria andIbprp5NotEqualTo(String value) {
            addCriterion("IBPRP5 <>", value, "ibprp5");
            return (Criteria) this;
        }

        public Criteria andIbprp5GreaterThan(String value) {
            addCriterion("IBPRP5 >", value, "ibprp5");
            return (Criteria) this;
        }

        public Criteria andIbprp5GreaterThanOrEqualTo(String value) {
            addCriterion("IBPRP5 >=", value, "ibprp5");
            return (Criteria) this;
        }

        public Criteria andIbprp5LessThan(String value) {
            addCriterion("IBPRP5 <", value, "ibprp5");
            return (Criteria) this;
        }

        public Criteria andIbprp5LessThanOrEqualTo(String value) {
            addCriterion("IBPRP5 <=", value, "ibprp5");
            return (Criteria) this;
        }

        public Criteria andIbprp5Like(String value) {
            addCriterion("IBPRP5 like", value, "ibprp5");
            return (Criteria) this;
        }

        public Criteria andIbprp5NotLike(String value) {
            addCriterion("IBPRP5 not like", value, "ibprp5");
            return (Criteria) this;
        }

        public Criteria andIbprp5In(List<String> values) {
            addCriterion("IBPRP5 in", values, "ibprp5");
            return (Criteria) this;
        }

        public Criteria andIbprp5NotIn(List<String> values) {
            addCriterion("IBPRP5 not in", values, "ibprp5");
            return (Criteria) this;
        }

        public Criteria andIbprp5Between(String value1, String value2) {
            addCriterion("IBPRP5 between", value1, value2, "ibprp5");
            return (Criteria) this;
        }

        public Criteria andIbprp5NotBetween(String value1, String value2) {
            addCriterion("IBPRP5 not between", value1, value2, "ibprp5");
            return (Criteria) this;
        }

        public Criteria andIbprp6IsNull() {
            addCriterion("IBPRP6 is null");
            return (Criteria) this;
        }

        public Criteria andIbprp6IsNotNull() {
            addCriterion("IBPRP6 is not null");
            return (Criteria) this;
        }

        public Criteria andIbprp6EqualTo(String value) {
            addCriterion("IBPRP6 =", value, "ibprp6");
            return (Criteria) this;
        }

        public Criteria andIbprp6NotEqualTo(String value) {
            addCriterion("IBPRP6 <>", value, "ibprp6");
            return (Criteria) this;
        }

        public Criteria andIbprp6GreaterThan(String value) {
            addCriterion("IBPRP6 >", value, "ibprp6");
            return (Criteria) this;
        }

        public Criteria andIbprp6GreaterThanOrEqualTo(String value) {
            addCriterion("IBPRP6 >=", value, "ibprp6");
            return (Criteria) this;
        }

        public Criteria andIbprp6LessThan(String value) {
            addCriterion("IBPRP6 <", value, "ibprp6");
            return (Criteria) this;
        }

        public Criteria andIbprp6LessThanOrEqualTo(String value) {
            addCriterion("IBPRP6 <=", value, "ibprp6");
            return (Criteria) this;
        }

        public Criteria andIbprp6Like(String value) {
            addCriterion("IBPRP6 like", value, "ibprp6");
            return (Criteria) this;
        }

        public Criteria andIbprp6NotLike(String value) {
            addCriterion("IBPRP6 not like", value, "ibprp6");
            return (Criteria) this;
        }

        public Criteria andIbprp6In(List<String> values) {
            addCriterion("IBPRP6 in", values, "ibprp6");
            return (Criteria) this;
        }

        public Criteria andIbprp6NotIn(List<String> values) {
            addCriterion("IBPRP6 not in", values, "ibprp6");
            return (Criteria) this;
        }

        public Criteria andIbprp6Between(String value1, String value2) {
            addCriterion("IBPRP6 between", value1, value2, "ibprp6");
            return (Criteria) this;
        }

        public Criteria andIbprp6NotBetween(String value1, String value2) {
            addCriterion("IBPRP6 not between", value1, value2, "ibprp6");
            return (Criteria) this;
        }

        public Criteria andIbprp7IsNull() {
            addCriterion("IBPRP7 is null");
            return (Criteria) this;
        }

        public Criteria andIbprp7IsNotNull() {
            addCriterion("IBPRP7 is not null");
            return (Criteria) this;
        }

        public Criteria andIbprp7EqualTo(String value) {
            addCriterion("IBPRP7 =", value, "ibprp7");
            return (Criteria) this;
        }

        public Criteria andIbprp7NotEqualTo(String value) {
            addCriterion("IBPRP7 <>", value, "ibprp7");
            return (Criteria) this;
        }

        public Criteria andIbprp7GreaterThan(String value) {
            addCriterion("IBPRP7 >", value, "ibprp7");
            return (Criteria) this;
        }

        public Criteria andIbprp7GreaterThanOrEqualTo(String value) {
            addCriterion("IBPRP7 >=", value, "ibprp7");
            return (Criteria) this;
        }

        public Criteria andIbprp7LessThan(String value) {
            addCriterion("IBPRP7 <", value, "ibprp7");
            return (Criteria) this;
        }

        public Criteria andIbprp7LessThanOrEqualTo(String value) {
            addCriterion("IBPRP7 <=", value, "ibprp7");
            return (Criteria) this;
        }

        public Criteria andIbprp7Like(String value) {
            addCriterion("IBPRP7 like", value, "ibprp7");
            return (Criteria) this;
        }

        public Criteria andIbprp7NotLike(String value) {
            addCriterion("IBPRP7 not like", value, "ibprp7");
            return (Criteria) this;
        }

        public Criteria andIbprp7In(List<String> values) {
            addCriterion("IBPRP7 in", values, "ibprp7");
            return (Criteria) this;
        }

        public Criteria andIbprp7NotIn(List<String> values) {
            addCriterion("IBPRP7 not in", values, "ibprp7");
            return (Criteria) this;
        }

        public Criteria andIbprp7Between(String value1, String value2) {
            addCriterion("IBPRP7 between", value1, value2, "ibprp7");
            return (Criteria) this;
        }

        public Criteria andIbprp7NotBetween(String value1, String value2) {
            addCriterion("IBPRP7 not between", value1, value2, "ibprp7");
            return (Criteria) this;
        }

        public Criteria andIbprp8IsNull() {
            addCriterion("IBPRP8 is null");
            return (Criteria) this;
        }

        public Criteria andIbprp8IsNotNull() {
            addCriterion("IBPRP8 is not null");
            return (Criteria) this;
        }

        public Criteria andIbprp8EqualTo(String value) {
            addCriterion("IBPRP8 =", value, "ibprp8");
            return (Criteria) this;
        }

        public Criteria andIbprp8NotEqualTo(String value) {
            addCriterion("IBPRP8 <>", value, "ibprp8");
            return (Criteria) this;
        }

        public Criteria andIbprp8GreaterThan(String value) {
            addCriterion("IBPRP8 >", value, "ibprp8");
            return (Criteria) this;
        }

        public Criteria andIbprp8GreaterThanOrEqualTo(String value) {
            addCriterion("IBPRP8 >=", value, "ibprp8");
            return (Criteria) this;
        }

        public Criteria andIbprp8LessThan(String value) {
            addCriterion("IBPRP8 <", value, "ibprp8");
            return (Criteria) this;
        }

        public Criteria andIbprp8LessThanOrEqualTo(String value) {
            addCriterion("IBPRP8 <=", value, "ibprp8");
            return (Criteria) this;
        }

        public Criteria andIbprp8Like(String value) {
            addCriterion("IBPRP8 like", value, "ibprp8");
            return (Criteria) this;
        }

        public Criteria andIbprp8NotLike(String value) {
            addCriterion("IBPRP8 not like", value, "ibprp8");
            return (Criteria) this;
        }

        public Criteria andIbprp8In(List<String> values) {
            addCriterion("IBPRP8 in", values, "ibprp8");
            return (Criteria) this;
        }

        public Criteria andIbprp8NotIn(List<String> values) {
            addCriterion("IBPRP8 not in", values, "ibprp8");
            return (Criteria) this;
        }

        public Criteria andIbprp8Between(String value1, String value2) {
            addCriterion("IBPRP8 between", value1, value2, "ibprp8");
            return (Criteria) this;
        }

        public Criteria andIbprp8NotBetween(String value1, String value2) {
            addCriterion("IBPRP8 not between", value1, value2, "ibprp8");
            return (Criteria) this;
        }

        public Criteria andIbprp9IsNull() {
            addCriterion("IBPRP9 is null");
            return (Criteria) this;
        }

        public Criteria andIbprp9IsNotNull() {
            addCriterion("IBPRP9 is not null");
            return (Criteria) this;
        }

        public Criteria andIbprp9EqualTo(String value) {
            addCriterion("IBPRP9 =", value, "ibprp9");
            return (Criteria) this;
        }

        public Criteria andIbprp9NotEqualTo(String value) {
            addCriterion("IBPRP9 <>", value, "ibprp9");
            return (Criteria) this;
        }

        public Criteria andIbprp9GreaterThan(String value) {
            addCriterion("IBPRP9 >", value, "ibprp9");
            return (Criteria) this;
        }

        public Criteria andIbprp9GreaterThanOrEqualTo(String value) {
            addCriterion("IBPRP9 >=", value, "ibprp9");
            return (Criteria) this;
        }

        public Criteria andIbprp9LessThan(String value) {
            addCriterion("IBPRP9 <", value, "ibprp9");
            return (Criteria) this;
        }

        public Criteria andIbprp9LessThanOrEqualTo(String value) {
            addCriterion("IBPRP9 <=", value, "ibprp9");
            return (Criteria) this;
        }

        public Criteria andIbprp9Like(String value) {
            addCriterion("IBPRP9 like", value, "ibprp9");
            return (Criteria) this;
        }

        public Criteria andIbprp9NotLike(String value) {
            addCriterion("IBPRP9 not like", value, "ibprp9");
            return (Criteria) this;
        }

        public Criteria andIbprp9In(List<String> values) {
            addCriterion("IBPRP9 in", values, "ibprp9");
            return (Criteria) this;
        }

        public Criteria andIbprp9NotIn(List<String> values) {
            addCriterion("IBPRP9 not in", values, "ibprp9");
            return (Criteria) this;
        }

        public Criteria andIbprp9Between(String value1, String value2) {
            addCriterion("IBPRP9 between", value1, value2, "ibprp9");
            return (Criteria) this;
        }

        public Criteria andIbprp9NotBetween(String value1, String value2) {
            addCriterion("IBPRP9 not between", value1, value2, "ibprp9");
            return (Criteria) this;
        }

        public Criteria andIbprp0IsNull() {
            addCriterion("IBPRP0 is null");
            return (Criteria) this;
        }

        public Criteria andIbprp0IsNotNull() {
            addCriterion("IBPRP0 is not null");
            return (Criteria) this;
        }

        public Criteria andIbprp0EqualTo(String value) {
            addCriterion("IBPRP0 =", value, "ibprp0");
            return (Criteria) this;
        }

        public Criteria andIbprp0NotEqualTo(String value) {
            addCriterion("IBPRP0 <>", value, "ibprp0");
            return (Criteria) this;
        }

        public Criteria andIbprp0GreaterThan(String value) {
            addCriterion("IBPRP0 >", value, "ibprp0");
            return (Criteria) this;
        }

        public Criteria andIbprp0GreaterThanOrEqualTo(String value) {
            addCriterion("IBPRP0 >=", value, "ibprp0");
            return (Criteria) this;
        }

        public Criteria andIbprp0LessThan(String value) {
            addCriterion("IBPRP0 <", value, "ibprp0");
            return (Criteria) this;
        }

        public Criteria andIbprp0LessThanOrEqualTo(String value) {
            addCriterion("IBPRP0 <=", value, "ibprp0");
            return (Criteria) this;
        }

        public Criteria andIbprp0Like(String value) {
            addCriterion("IBPRP0 like", value, "ibprp0");
            return (Criteria) this;
        }

        public Criteria andIbprp0NotLike(String value) {
            addCriterion("IBPRP0 not like", value, "ibprp0");
            return (Criteria) this;
        }

        public Criteria andIbprp0In(List<String> values) {
            addCriterion("IBPRP0 in", values, "ibprp0");
            return (Criteria) this;
        }

        public Criteria andIbprp0NotIn(List<String> values) {
            addCriterion("IBPRP0 not in", values, "ibprp0");
            return (Criteria) this;
        }

        public Criteria andIbprp0Between(String value1, String value2) {
            addCriterion("IBPRP0 between", value1, value2, "ibprp0");
            return (Criteria) this;
        }

        public Criteria andIbprp0NotBetween(String value1, String value2) {
            addCriterion("IBPRP0 not between", value1, value2, "ibprp0");
            return (Criteria) this;
        }

        public Criteria andUmrumIsNull() {
            addCriterion("UMRUM is null");
            return (Criteria) this;
        }

        public Criteria andUmrumIsNotNull() {
            addCriterion("UMRUM is not null");
            return (Criteria) this;
        }

        public Criteria andUmrumEqualTo(String value) {
            addCriterion("UMRUM =", value, "umrum");
            return (Criteria) this;
        }

        public Criteria andUmrumNotEqualTo(String value) {
            addCriterion("UMRUM <>", value, "umrum");
            return (Criteria) this;
        }

        public Criteria andUmrumGreaterThan(String value) {
            addCriterion("UMRUM >", value, "umrum");
            return (Criteria) this;
        }

        public Criteria andUmrumGreaterThanOrEqualTo(String value) {
            addCriterion("UMRUM >=", value, "umrum");
            return (Criteria) this;
        }

        public Criteria andUmrumLessThan(String value) {
            addCriterion("UMRUM <", value, "umrum");
            return (Criteria) this;
        }

        public Criteria andUmrumLessThanOrEqualTo(String value) {
            addCriterion("UMRUM <=", value, "umrum");
            return (Criteria) this;
        }

        public Criteria andUmrumLike(String value) {
            addCriterion("UMRUM like", value, "umrum");
            return (Criteria) this;
        }

        public Criteria andUmrumNotLike(String value) {
            addCriterion("UMRUM not like", value, "umrum");
            return (Criteria) this;
        }

        public Criteria andUmrumIn(List<String> values) {
            addCriterion("UMRUM in", values, "umrum");
            return (Criteria) this;
        }

        public Criteria andUmrumNotIn(List<String> values) {
            addCriterion("UMRUM not in", values, "umrum");
            return (Criteria) this;
        }

        public Criteria andUmrumBetween(String value1, String value2) {
            addCriterion("UMRUM between", value1, value2, "umrum");
            return (Criteria) this;
        }

        public Criteria andUmrumNotBetween(String value1, String value2) {
            addCriterion("UMRUM not between", value1, value2, "umrum");
            return (Criteria) this;
        }

        public Criteria andUmumIsNull() {
            addCriterion("UMUM is null");
            return (Criteria) this;
        }

        public Criteria andUmumIsNotNull() {
            addCriterion("UMUM is not null");
            return (Criteria) this;
        }

        public Criteria andUmumEqualTo(String value) {
            addCriterion("UMUM =", value, "umum");
            return (Criteria) this;
        }

        public Criteria andUmumNotEqualTo(String value) {
            addCriterion("UMUM <>", value, "umum");
            return (Criteria) this;
        }

        public Criteria andUmumGreaterThan(String value) {
            addCriterion("UMUM >", value, "umum");
            return (Criteria) this;
        }

        public Criteria andUmumGreaterThanOrEqualTo(String value) {
            addCriterion("UMUM >=", value, "umum");
            return (Criteria) this;
        }

        public Criteria andUmumLessThan(String value) {
            addCriterion("UMUM <", value, "umum");
            return (Criteria) this;
        }

        public Criteria andUmumLessThanOrEqualTo(String value) {
            addCriterion("UMUM <=", value, "umum");
            return (Criteria) this;
        }

        public Criteria andUmumLike(String value) {
            addCriterion("UMUM like", value, "umum");
            return (Criteria) this;
        }

        public Criteria andUmumNotLike(String value) {
            addCriterion("UMUM not like", value, "umum");
            return (Criteria) this;
        }

        public Criteria andUmumIn(List<String> values) {
            addCriterion("UMUM in", values, "umum");
            return (Criteria) this;
        }

        public Criteria andUmumNotIn(List<String> values) {
            addCriterion("UMUM not in", values, "umum");
            return (Criteria) this;
        }

        public Criteria andUmumBetween(String value1, String value2) {
            addCriterion("UMUM between", value1, value2, "umum");
            return (Criteria) this;
        }

        public Criteria andUmumNotBetween(String value1, String value2) {
            addCriterion("UMUM not between", value1, value2, "umum");
            return (Criteria) this;
        }

        public Criteria andUmconvIsNull() {
            addCriterion("UMCONV is null");
            return (Criteria) this;
        }

        public Criteria andUmconvIsNotNull() {
            addCriterion("UMCONV is not null");
            return (Criteria) this;
        }

        public Criteria andUmconvEqualTo(BigDecimal value) {
            addCriterion("UMCONV =", value, "umconv");
            return (Criteria) this;
        }

        public Criteria andUmconvNotEqualTo(BigDecimal value) {
            addCriterion("UMCONV <>", value, "umconv");
            return (Criteria) this;
        }

        public Criteria andUmconvGreaterThan(BigDecimal value) {
            addCriterion("UMCONV >", value, "umconv");
            return (Criteria) this;
        }

        public Criteria andUmconvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UMCONV >=", value, "umconv");
            return (Criteria) this;
        }

        public Criteria andUmconvLessThan(BigDecimal value) {
            addCriterion("UMCONV <", value, "umconv");
            return (Criteria) this;
        }

        public Criteria andUmconvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UMCONV <=", value, "umconv");
            return (Criteria) this;
        }

        public Criteria andUmconvIn(List<BigDecimal> values) {
            addCriterion("UMCONV in", values, "umconv");
            return (Criteria) this;
        }

        public Criteria andUmconvNotIn(List<BigDecimal> values) {
            addCriterion("UMCONV not in", values, "umconv");
            return (Criteria) this;
        }

        public Criteria andUmconvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UMCONV between", value1, value2, "umconv");
            return (Criteria) this;
        }

        public Criteria andUmconvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UMCONV not between", value1, value2, "umconv");
            return (Criteria) this;
        }

        public Criteria andImuserIsNull() {
            addCriterion("IMUSER is null");
            return (Criteria) this;
        }

        public Criteria andImuserIsNotNull() {
            addCriterion("IMUSER is not null");
            return (Criteria) this;
        }

        public Criteria andImuserEqualTo(String value) {
            addCriterion("IMUSER =", value, "imuser");
            return (Criteria) this;
        }

        public Criteria andImuserNotEqualTo(String value) {
            addCriterion("IMUSER <>", value, "imuser");
            return (Criteria) this;
        }

        public Criteria andImuserGreaterThan(String value) {
            addCriterion("IMUSER >", value, "imuser");
            return (Criteria) this;
        }

        public Criteria andImuserGreaterThanOrEqualTo(String value) {
            addCriterion("IMUSER >=", value, "imuser");
            return (Criteria) this;
        }

        public Criteria andImuserLessThan(String value) {
            addCriterion("IMUSER <", value, "imuser");
            return (Criteria) this;
        }

        public Criteria andImuserLessThanOrEqualTo(String value) {
            addCriterion("IMUSER <=", value, "imuser");
            return (Criteria) this;
        }

        public Criteria andImuserLike(String value) {
            addCriterion("IMUSER like", value, "imuser");
            return (Criteria) this;
        }

        public Criteria andImuserNotLike(String value) {
            addCriterion("IMUSER not like", value, "imuser");
            return (Criteria) this;
        }

        public Criteria andImuserIn(List<String> values) {
            addCriterion("IMUSER in", values, "imuser");
            return (Criteria) this;
        }

        public Criteria andImuserNotIn(List<String> values) {
            addCriterion("IMUSER not in", values, "imuser");
            return (Criteria) this;
        }

        public Criteria andImuserBetween(String value1, String value2) {
            addCriterion("IMUSER between", value1, value2, "imuser");
            return (Criteria) this;
        }

        public Criteria andImuserNotBetween(String value1, String value2) {
            addCriterion("IMUSER not between", value1, value2, "imuser");
            return (Criteria) this;
        }

        public Criteria andIbupmjIsNull() {
            addCriterion("IBUPMJ is null");
            return (Criteria) this;
        }

        public Criteria andIbupmjIsNotNull() {
            addCriterion("IBUPMJ is not null");
            return (Criteria) this;
        }

        public Criteria andIbupmjEqualTo(Date value) {
            addCriterion("IBUPMJ =", value, "ibupmj");
            return (Criteria) this;
        }

        public Criteria andIbupmjNotEqualTo(Date value) {
            addCriterion("IBUPMJ <>", value, "ibupmj");
            return (Criteria) this;
        }

        public Criteria andIbupmjGreaterThan(Date value) {
            addCriterion("IBUPMJ >", value, "ibupmj");
            return (Criteria) this;
        }

        public Criteria andIbupmjGreaterThanOrEqualTo(Date value) {
            addCriterion("IBUPMJ >=", value, "ibupmj");
            return (Criteria) this;
        }

        public Criteria andIbupmjLessThan(Date value) {
            addCriterion("IBUPMJ <", value, "ibupmj");
            return (Criteria) this;
        }

        public Criteria andIbupmjLessThanOrEqualTo(Date value) {
            addCriterion("IBUPMJ <=", value, "ibupmj");
            return (Criteria) this;
        }

        public Criteria andIbupmjIn(List<Date> values) {
            addCriterion("IBUPMJ in", values, "ibupmj");
            return (Criteria) this;
        }

        public Criteria andIbupmjNotIn(List<Date> values) {
            addCriterion("IBUPMJ not in", values, "ibupmj");
            return (Criteria) this;
        }

        public Criteria andIbupmjBetween(Date value1, Date value2) {
            addCriterion("IBUPMJ between", value1, value2, "ibupmj");
            return (Criteria) this;
        }

        public Criteria andIbupmjNotBetween(Date value1, Date value2) {
            addCriterion("IBUPMJ not between", value1, value2, "ibupmj");
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

        public Criteria andIbbackIsNull() {
            addCriterion("IBBACK is null");
            return (Criteria) this;
        }

        public Criteria andIbbackIsNotNull() {
            addCriterion("IBBACK is not null");
            return (Criteria) this;
        }

        public Criteria andIbbackEqualTo(String value) {
            addCriterion("IBBACK =", value, "ibback");
            return (Criteria) this;
        }

        public Criteria andIbbackNotEqualTo(String value) {
            addCriterion("IBBACK <>", value, "ibback");
            return (Criteria) this;
        }

        public Criteria andIbbackGreaterThan(String value) {
            addCriterion("IBBACK >", value, "ibback");
            return (Criteria) this;
        }

        public Criteria andIbbackGreaterThanOrEqualTo(String value) {
            addCriterion("IBBACK >=", value, "ibback");
            return (Criteria) this;
        }

        public Criteria andIbbackLessThan(String value) {
            addCriterion("IBBACK <", value, "ibback");
            return (Criteria) this;
        }

        public Criteria andIbbackLessThanOrEqualTo(String value) {
            addCriterion("IBBACK <=", value, "ibback");
            return (Criteria) this;
        }

        public Criteria andIbbackLike(String value) {
            addCriterion("IBBACK like", value, "ibback");
            return (Criteria) this;
        }

        public Criteria andIbbackNotLike(String value) {
            addCriterion("IBBACK not like", value, "ibback");
            return (Criteria) this;
        }

        public Criteria andIbbackIn(List<String> values) {
            addCriterion("IBBACK in", values, "ibback");
            return (Criteria) this;
        }

        public Criteria andIbbackNotIn(List<String> values) {
            addCriterion("IBBACK not in", values, "ibback");
            return (Criteria) this;
        }

        public Criteria andIbbackBetween(String value1, String value2) {
            addCriterion("IBBACK between", value1, value2, "ibback");
            return (Criteria) this;
        }

        public Criteria andIbbackNotBetween(String value1, String value2) {
            addCriterion("IBBACK not between", value1, value2, "ibback");
            return (Criteria) this;
        }

        public Criteria andIbaitmIsNull() {
            addCriterion("IBAITM is null");
            return (Criteria) this;
        }

        public Criteria andIbaitmIsNotNull() {
            addCriterion("IBAITM is not null");
            return (Criteria) this;
        }

        public Criteria andIbaitmEqualTo(String value) {
            addCriterion("IBAITM =", value, "ibaitm");
            return (Criteria) this;
        }

        public Criteria andIbaitmNotEqualTo(String value) {
            addCriterion("IBAITM <>", value, "ibaitm");
            return (Criteria) this;
        }

        public Criteria andIbaitmGreaterThan(String value) {
            addCriterion("IBAITM >", value, "ibaitm");
            return (Criteria) this;
        }

        public Criteria andIbaitmGreaterThanOrEqualTo(String value) {
            addCriterion("IBAITM >=", value, "ibaitm");
            return (Criteria) this;
        }

        public Criteria andIbaitmLessThan(String value) {
            addCriterion("IBAITM <", value, "ibaitm");
            return (Criteria) this;
        }

        public Criteria andIbaitmLessThanOrEqualTo(String value) {
            addCriterion("IBAITM <=", value, "ibaitm");
            return (Criteria) this;
        }

        public Criteria andIbaitmLike(String value) {
            addCriterion("IBAITM like", value, "ibaitm");
            return (Criteria) this;
        }

        public Criteria andIbaitmNotLike(String value) {
            addCriterion("IBAITM not like", value, "ibaitm");
            return (Criteria) this;
        }

        public Criteria andIbaitmIn(List<String> values) {
            addCriterion("IBAITM in", values, "ibaitm");
            return (Criteria) this;
        }

        public Criteria andIbaitmNotIn(List<String> values) {
            addCriterion("IBAITM not in", values, "ibaitm");
            return (Criteria) this;
        }

        public Criteria andIbaitmBetween(String value1, String value2) {
            addCriterion("IBAITM between", value1, value2, "ibaitm");
            return (Criteria) this;
        }

        public Criteria andIbaitmNotBetween(String value1, String value2) {
            addCriterion("IBAITM not between", value1, value2, "ibaitm");
            return (Criteria) this;
        }

        public Criteria andIbstktIsNull() {
            addCriterion("IBSTKT is null");
            return (Criteria) this;
        }

        public Criteria andIbstktIsNotNull() {
            addCriterion("IBSTKT is not null");
            return (Criteria) this;
        }

        public Criteria andIbstktEqualTo(String value) {
            addCriterion("IBSTKT =", value, "ibstkt");
            return (Criteria) this;
        }

        public Criteria andIbstktNotEqualTo(String value) {
            addCriterion("IBSTKT <>", value, "ibstkt");
            return (Criteria) this;
        }

        public Criteria andIbstktGreaterThan(String value) {
            addCriterion("IBSTKT >", value, "ibstkt");
            return (Criteria) this;
        }

        public Criteria andIbstktGreaterThanOrEqualTo(String value) {
            addCriterion("IBSTKT >=", value, "ibstkt");
            return (Criteria) this;
        }

        public Criteria andIbstktLessThan(String value) {
            addCriterion("IBSTKT <", value, "ibstkt");
            return (Criteria) this;
        }

        public Criteria andIbstktLessThanOrEqualTo(String value) {
            addCriterion("IBSTKT <=", value, "ibstkt");
            return (Criteria) this;
        }

        public Criteria andIbstktLike(String value) {
            addCriterion("IBSTKT like", value, "ibstkt");
            return (Criteria) this;
        }

        public Criteria andIbstktNotLike(String value) {
            addCriterion("IBSTKT not like", value, "ibstkt");
            return (Criteria) this;
        }

        public Criteria andIbstktIn(List<String> values) {
            addCriterion("IBSTKT in", values, "ibstkt");
            return (Criteria) this;
        }

        public Criteria andIbstktNotIn(List<String> values) {
            addCriterion("IBSTKT not in", values, "ibstkt");
            return (Criteria) this;
        }

        public Criteria andIbstktBetween(String value1, String value2) {
            addCriterion("IBSTKT between", value1, value2, "ibstkt");
            return (Criteria) this;
        }

        public Criteria andIbstktNotBetween(String value1, String value2) {
            addCriterion("IBSTKT not between", value1, value2, "ibstkt");
            return (Criteria) this;
        }

        public Criteria andImuom1IsNull() {
            addCriterion("IMUOM1 is null");
            return (Criteria) this;
        }

        public Criteria andImuom1IsNotNull() {
            addCriterion("IMUOM1 is not null");
            return (Criteria) this;
        }

        public Criteria andImuom1EqualTo(String value) {
            addCriterion("IMUOM1 =", value, "imuom1");
            return (Criteria) this;
        }

        public Criteria andImuom1NotEqualTo(String value) {
            addCriterion("IMUOM1 <>", value, "imuom1");
            return (Criteria) this;
        }

        public Criteria andImuom1GreaterThan(String value) {
            addCriterion("IMUOM1 >", value, "imuom1");
            return (Criteria) this;
        }

        public Criteria andImuom1GreaterThanOrEqualTo(String value) {
            addCriterion("IMUOM1 >=", value, "imuom1");
            return (Criteria) this;
        }

        public Criteria andImuom1LessThan(String value) {
            addCriterion("IMUOM1 <", value, "imuom1");
            return (Criteria) this;
        }

        public Criteria andImuom1LessThanOrEqualTo(String value) {
            addCriterion("IMUOM1 <=", value, "imuom1");
            return (Criteria) this;
        }

        public Criteria andImuom1Like(String value) {
            addCriterion("IMUOM1 like", value, "imuom1");
            return (Criteria) this;
        }

        public Criteria andImuom1NotLike(String value) {
            addCriterion("IMUOM1 not like", value, "imuom1");
            return (Criteria) this;
        }

        public Criteria andImuom1In(List<String> values) {
            addCriterion("IMUOM1 in", values, "imuom1");
            return (Criteria) this;
        }

        public Criteria andImuom1NotIn(List<String> values) {
            addCriterion("IMUOM1 not in", values, "imuom1");
            return (Criteria) this;
        }

        public Criteria andImuom1Between(String value1, String value2) {
            addCriterion("IMUOM1 between", value1, value2, "imuom1");
            return (Criteria) this;
        }

        public Criteria andImuom1NotBetween(String value1, String value2) {
            addCriterion("IMUOM1 not between", value1, value2, "imuom1");
            return (Criteria) this;
        }

        public Criteria andImuom2IsNull() {
            addCriterion("IMUOM2 is null");
            return (Criteria) this;
        }

        public Criteria andImuom2IsNotNull() {
            addCriterion("IMUOM2 is not null");
            return (Criteria) this;
        }

        public Criteria andImuom2EqualTo(String value) {
            addCriterion("IMUOM2 =", value, "imuom2");
            return (Criteria) this;
        }

        public Criteria andImuom2NotEqualTo(String value) {
            addCriterion("IMUOM2 <>", value, "imuom2");
            return (Criteria) this;
        }

        public Criteria andImuom2GreaterThan(String value) {
            addCriterion("IMUOM2 >", value, "imuom2");
            return (Criteria) this;
        }

        public Criteria andImuom2GreaterThanOrEqualTo(String value) {
            addCriterion("IMUOM2 >=", value, "imuom2");
            return (Criteria) this;
        }

        public Criteria andImuom2LessThan(String value) {
            addCriterion("IMUOM2 <", value, "imuom2");
            return (Criteria) this;
        }

        public Criteria andImuom2LessThanOrEqualTo(String value) {
            addCriterion("IMUOM2 <=", value, "imuom2");
            return (Criteria) this;
        }

        public Criteria andImuom2Like(String value) {
            addCriterion("IMUOM2 like", value, "imuom2");
            return (Criteria) this;
        }

        public Criteria andImuom2NotLike(String value) {
            addCriterion("IMUOM2 not like", value, "imuom2");
            return (Criteria) this;
        }

        public Criteria andImuom2In(List<String> values) {
            addCriterion("IMUOM2 in", values, "imuom2");
            return (Criteria) this;
        }

        public Criteria andImuom2NotIn(List<String> values) {
            addCriterion("IMUOM2 not in", values, "imuom2");
            return (Criteria) this;
        }

        public Criteria andImuom2Between(String value1, String value2) {
            addCriterion("IMUOM2 between", value1, value2, "imuom2");
            return (Criteria) this;
        }

        public Criteria andImuom2NotBetween(String value1, String value2) {
            addCriterion("IMUOM2 not between", value1, value2, "imuom2");
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