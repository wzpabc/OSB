package com.tup.mssql.model;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ItemPriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemPriceExample() {
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

        public Criteria andBpitmIsNull() {
            addCriterion("BPITM is null");
            return (Criteria) this;
        }

        public Criteria andBpitmIsNotNull() {
            addCriterion("BPITM is not null");
            return (Criteria) this;
        }

        public Criteria andBpitmEqualTo(Integer value) {
            addCriterion("BPITM =", value, "bpitm");
            return (Criteria) this;
        }

        public Criteria andBpitmNotEqualTo(Integer value) {
            addCriterion("BPITM <>", value, "bpitm");
            return (Criteria) this;
        }

        public Criteria andBpitmGreaterThan(Integer value) {
            addCriterion("BPITM >", value, "bpitm");
            return (Criteria) this;
        }

        public Criteria andBpitmGreaterThanOrEqualTo(Integer value) {
            addCriterion("BPITM >=", value, "bpitm");
            return (Criteria) this;
        }

        public Criteria andBpitmLessThan(Integer value) {
            addCriterion("BPITM <", value, "bpitm");
            return (Criteria) this;
        }

        public Criteria andBpitmLessThanOrEqualTo(Integer value) {
            addCriterion("BPITM <=", value, "bpitm");
            return (Criteria) this;
        }

        public Criteria andBpitmIn(List<Integer> values) {
            addCriterion("BPITM in", values, "bpitm");
            return (Criteria) this;
        }

        public Criteria andBpitmNotIn(List<Integer> values) {
            addCriterion("BPITM not in", values, "bpitm");
            return (Criteria) this;
        }

        public Criteria andBpitmBetween(Integer value1, Integer value2) {
            addCriterion("BPITM between", value1, value2, "bpitm");
            return (Criteria) this;
        }

        public Criteria andBpitmNotBetween(Integer value1, Integer value2) {
            addCriterion("BPITM not between", value1, value2, "bpitm");
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

        public Criteria andBpmcuLike(String value) {
            addCriterion("BPMCU like", value, "bpmcu");
            return (Criteria) this;
        }

        public Criteria andBpmcuNotLike(String value) {
            addCriterion("BPMCU not like", value, "bpmcu");
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

        public Criteria andBplocnLike(String value) {
            addCriterion("BPLOCN like", value, "bplocn");
            return (Criteria) this;
        }

        public Criteria andBplocnNotLike(String value) {
            addCriterion("BPLOCN not like", value, "bplocn");
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

        public Criteria andBpuomLike(String value) {
            addCriterion("BPUOM like", value, "bpuom");
            return (Criteria) this;
        }

        public Criteria andBpuomNotLike(String value) {
            addCriterion("BPUOM not like", value, "bpuom");
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

        public Criteria andBpexdjIsNull() {
            addCriterion("BPEXDJ is null");
            return (Criteria) this;
        }

        public Criteria andBpexdjIsNotNull() {
            addCriterion("BPEXDJ is not null");
            return (Criteria) this;
        }

        public Criteria andBpexdjEqualTo(Date value) {
            addCriterionForJDBCDate("BPEXDJ =", value, "bpexdj");
            return (Criteria) this;
        }

        public Criteria andBpexdjNotEqualTo(Date value) {
            addCriterionForJDBCDate("BPEXDJ <>", value, "bpexdj");
            return (Criteria) this;
        }

        public Criteria andBpexdjGreaterThan(Date value) {
            addCriterionForJDBCDate("BPEXDJ >", value, "bpexdj");
            return (Criteria) this;
        }

        public Criteria andBpexdjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BPEXDJ >=", value, "bpexdj");
            return (Criteria) this;
        }

        public Criteria andBpexdjLessThan(Date value) {
            addCriterionForJDBCDate("BPEXDJ <", value, "bpexdj");
            return (Criteria) this;
        }

        public Criteria andBpexdjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BPEXDJ <=", value, "bpexdj");
            return (Criteria) this;
        }

        public Criteria andBpexdjIn(List<Date> values) {
            addCriterionForJDBCDate("BPEXDJ in", values, "bpexdj");
            return (Criteria) this;
        }

        public Criteria andBpexdjNotIn(List<Date> values) {
            addCriterionForJDBCDate("BPEXDJ not in", values, "bpexdj");
            return (Criteria) this;
        }

        public Criteria andBpexdjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BPEXDJ between", value1, value2, "bpexdj");
            return (Criteria) this;
        }

        public Criteria andBpexdjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BPEXDJ not between", value1, value2, "bpexdj");
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

        public Criteria andBplitmLike(String value) {
            addCriterion("BPLITM like", value, "bplitm");
            return (Criteria) this;
        }

        public Criteria andBplitmNotLike(String value) {
            addCriterion("BPLITM not like", value, "bplitm");
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

        public Criteria andBpuprcIsNull() {
            addCriterion("BPUPRC is null");
            return (Criteria) this;
        }

        public Criteria andBpuprcIsNotNull() {
            addCriterion("BPUPRC is not null");
            return (Criteria) this;
        }

        public Criteria andBpuprcEqualTo(BigDecimal value) {
            addCriterion("BPUPRC =", value, "bpuprc");
            return (Criteria) this;
        }

        public Criteria andBpuprcNotEqualTo(BigDecimal value) {
            addCriterion("BPUPRC <>", value, "bpuprc");
            return (Criteria) this;
        }

        public Criteria andBpuprcGreaterThan(BigDecimal value) {
            addCriterion("BPUPRC >", value, "bpuprc");
            return (Criteria) this;
        }

        public Criteria andBpuprcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BPUPRC >=", value, "bpuprc");
            return (Criteria) this;
        }

        public Criteria andBpuprcLessThan(BigDecimal value) {
            addCriterion("BPUPRC <", value, "bpuprc");
            return (Criteria) this;
        }

        public Criteria andBpuprcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BPUPRC <=", value, "bpuprc");
            return (Criteria) this;
        }

        public Criteria andBpuprcIn(List<BigDecimal> values) {
            addCriterion("BPUPRC in", values, "bpuprc");
            return (Criteria) this;
        }

        public Criteria andBpuprcNotIn(List<BigDecimal> values) {
            addCriterion("BPUPRC not in", values, "bpuprc");
            return (Criteria) this;
        }

        public Criteria andBpuprcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BPUPRC between", value1, value2, "bpuprc");
            return (Criteria) this;
        }

        public Criteria andBpuprcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BPUPRC not between", value1, value2, "bpuprc");
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

        public Criteria andBpeftjEqualTo(Date value) {
            addCriterionForJDBCDate("BPEFTJ =", value, "bpeftj");
            return (Criteria) this;
        }

        public Criteria andBpeftjNotEqualTo(Date value) {
            addCriterionForJDBCDate("BPEFTJ <>", value, "bpeftj");
            return (Criteria) this;
        }

        public Criteria andBpeftjGreaterThan(Date value) {
            addCriterionForJDBCDate("BPEFTJ >", value, "bpeftj");
            return (Criteria) this;
        }

        public Criteria andBpeftjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BPEFTJ >=", value, "bpeftj");
            return (Criteria) this;
        }

        public Criteria andBpeftjLessThan(Date value) {
            addCriterionForJDBCDate("BPEFTJ <", value, "bpeftj");
            return (Criteria) this;
        }

        public Criteria andBpeftjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BPEFTJ <=", value, "bpeftj");
            return (Criteria) this;
        }

        public Criteria andBpeftjIn(List<Date> values) {
            addCriterionForJDBCDate("BPEFTJ in", values, "bpeftj");
            return (Criteria) this;
        }

        public Criteria andBpeftjNotIn(List<Date> values) {
            addCriterionForJDBCDate("BPEFTJ not in", values, "bpeftj");
            return (Criteria) this;
        }

        public Criteria andBpeftjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BPEFTJ between", value1, value2, "bpeftj");
            return (Criteria) this;
        }

        public Criteria andBpeftjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BPEFTJ not between", value1, value2, "bpeftj");
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

        public Criteria andBpuserLike(String value) {
            addCriterion("BPUSER like", value, "bpuser");
            return (Criteria) this;
        }

        public Criteria andBpuserNotLike(String value) {
            addCriterion("BPUSER not like", value, "bpuser");
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

        public Criteria andBpupmjIsNull() {
            addCriterion("BPUPMJ is null");
            return (Criteria) this;
        }

        public Criteria andBpupmjIsNotNull() {
            addCriterion("BPUPMJ is not null");
            return (Criteria) this;
        }

        public Criteria andBpupmjEqualTo(Date value) {
            addCriterion("BPUPMJ =", value, "bpupmj");
            return (Criteria) this;
        }

        public Criteria andBpupmjNotEqualTo(Date value) {
            addCriterion("BPUPMJ <>", value, "bpupmj");
            return (Criteria) this;
        }

        public Criteria andBpupmjGreaterThan(Date value) {
            addCriterion("BPUPMJ >", value, "bpupmj");
            return (Criteria) this;
        }

        public Criteria andBpupmjGreaterThanOrEqualTo(Date value) {
            addCriterion("BPUPMJ >=", value, "bpupmj");
            return (Criteria) this;
        }

        public Criteria andBpupmjLessThan(Date value) {
            addCriterion("BPUPMJ <", value, "bpupmj");
            return (Criteria) this;
        }

        public Criteria andBpupmjLessThanOrEqualTo(Date value) {
            addCriterion("BPUPMJ <=", value, "bpupmj");
            return (Criteria) this;
        }

        public Criteria andBpupmjIn(List<Date> values) {
            addCriterion("BPUPMJ in", values, "bpupmj");
            return (Criteria) this;
        }

        public Criteria andBpupmjNotIn(List<Date> values) {
            addCriterion("BPUPMJ not in", values, "bpupmj");
            return (Criteria) this;
        }

        public Criteria andBpupmjBetween(Date value1, Date value2) {
            addCriterion("BPUPMJ between", value1, value2, "bpupmj");
            return (Criteria) this;
        }

        public Criteria andBpupmjNotBetween(Date value1, Date value2) {
            addCriterion("BPUPMJ not between", value1, value2, "bpupmj");
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

        public Criteria andIsprocessedIsNull() {
            addCriterion("IsProcessed is null");
            return (Criteria) this;
        }

        public Criteria andIsprocessedIsNotNull() {
            addCriterion("IsProcessed is not null");
            return (Criteria) this;
        }

        public Criteria andIsprocessedEqualTo(Boolean value) {
            addCriterion("IsProcessed =", value, "isprocessed");
            return (Criteria) this;
        }

        public Criteria andIsprocessedNotEqualTo(Boolean value) {
            addCriterion("IsProcessed <>", value, "isprocessed");
            return (Criteria) this;
        }

        public Criteria andIsprocessedGreaterThan(Boolean value) {
            addCriterion("IsProcessed >", value, "isprocessed");
            return (Criteria) this;
        }

        public Criteria andIsprocessedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsProcessed >=", value, "isprocessed");
            return (Criteria) this;
        }

        public Criteria andIsprocessedLessThan(Boolean value) {
            addCriterion("IsProcessed <", value, "isprocessed");
            return (Criteria) this;
        }

        public Criteria andIsprocessedLessThanOrEqualTo(Boolean value) {
            addCriterion("IsProcessed <=", value, "isprocessed");
            return (Criteria) this;
        }

        public Criteria andIsprocessedIn(List<Boolean> values) {
            addCriterion("IsProcessed in", values, "isprocessed");
            return (Criteria) this;
        }

        public Criteria andIsprocessedNotIn(List<Boolean> values) {
            addCriterion("IsProcessed not in", values, "isprocessed");
            return (Criteria) this;
        }

        public Criteria andIsprocessedBetween(Boolean value1, Boolean value2) {
            addCriterion("IsProcessed between", value1, value2, "isprocessed");
            return (Criteria) this;
        }

        public Criteria andIsprocessedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsProcessed not between", value1, value2, "isprocessed");
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