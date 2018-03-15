package com.tup.mssql.model;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BOMExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BOMExample() {
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

        public Criteria andIxtbmIsNull() {
            addCriterion("IXTBM is null");
            return (Criteria) this;
        }

        public Criteria andIxtbmIsNotNull() {
            addCriterion("IXTBM is not null");
            return (Criteria) this;
        }

        public Criteria andIxtbmEqualTo(String value) {
            addCriterion("IXTBM =", value, "ixtbm");
            return (Criteria) this;
        }

        public Criteria andIxtbmNotEqualTo(String value) {
            addCriterion("IXTBM <>", value, "ixtbm");
            return (Criteria) this;
        }

        public Criteria andIxtbmGreaterThan(String value) {
            addCriterion("IXTBM >", value, "ixtbm");
            return (Criteria) this;
        }

        public Criteria andIxtbmGreaterThanOrEqualTo(String value) {
            addCriterion("IXTBM >=", value, "ixtbm");
            return (Criteria) this;
        }

        public Criteria andIxtbmLessThan(String value) {
            addCriterion("IXTBM <", value, "ixtbm");
            return (Criteria) this;
        }

        public Criteria andIxtbmLessThanOrEqualTo(String value) {
            addCriterion("IXTBM <=", value, "ixtbm");
            return (Criteria) this;
        }

        public Criteria andIxtbmLike(String value) {
            addCriterion("IXTBM like", value, "ixtbm");
            return (Criteria) this;
        }

        public Criteria andIxtbmNotLike(String value) {
            addCriterion("IXTBM not like", value, "ixtbm");
            return (Criteria) this;
        }

        public Criteria andIxtbmIn(List<String> values) {
            addCriterion("IXTBM in", values, "ixtbm");
            return (Criteria) this;
        }

        public Criteria andIxtbmNotIn(List<String> values) {
            addCriterion("IXTBM not in", values, "ixtbm");
            return (Criteria) this;
        }

        public Criteria andIxtbmBetween(String value1, String value2) {
            addCriterion("IXTBM between", value1, value2, "ixtbm");
            return (Criteria) this;
        }

        public Criteria andIxtbmNotBetween(String value1, String value2) {
            addCriterion("IXTBM not between", value1, value2, "ixtbm");
            return (Criteria) this;
        }

        public Criteria andIxkitIsNull() {
            addCriterion("IXKIT is null");
            return (Criteria) this;
        }

        public Criteria andIxkitIsNotNull() {
            addCriterion("IXKIT is not null");
            return (Criteria) this;
        }

        public Criteria andIxkitEqualTo(Integer value) {
            addCriterion("IXKIT =", value, "ixkit");
            return (Criteria) this;
        }

        public Criteria andIxkitNotEqualTo(Integer value) {
            addCriterion("IXKIT <>", value, "ixkit");
            return (Criteria) this;
        }

        public Criteria andIxkitGreaterThan(Integer value) {
            addCriterion("IXKIT >", value, "ixkit");
            return (Criteria) this;
        }

        public Criteria andIxkitGreaterThanOrEqualTo(Integer value) {
            addCriterion("IXKIT >=", value, "ixkit");
            return (Criteria) this;
        }

        public Criteria andIxkitLessThan(Integer value) {
            addCriterion("IXKIT <", value, "ixkit");
            return (Criteria) this;
        }

        public Criteria andIxkitLessThanOrEqualTo(Integer value) {
            addCriterion("IXKIT <=", value, "ixkit");
            return (Criteria) this;
        }

        public Criteria andIxkitIn(List<Integer> values) {
            addCriterion("IXKIT in", values, "ixkit");
            return (Criteria) this;
        }

        public Criteria andIxkitNotIn(List<Integer> values) {
            addCriterion("IXKIT not in", values, "ixkit");
            return (Criteria) this;
        }

        public Criteria andIxkitBetween(Integer value1, Integer value2) {
            addCriterion("IXKIT between", value1, value2, "ixkit");
            return (Criteria) this;
        }

        public Criteria andIxkitNotBetween(Integer value1, Integer value2) {
            addCriterion("IXKIT not between", value1, value2, "ixkit");
            return (Criteria) this;
        }

        public Criteria andIxmmcuIsNull() {
            addCriterion("IXMMCU is null");
            return (Criteria) this;
        }

        public Criteria andIxmmcuIsNotNull() {
            addCriterion("IXMMCU is not null");
            return (Criteria) this;
        }

        public Criteria andIxmmcuEqualTo(String value) {
            addCriterion("IXMMCU =", value, "ixmmcu");
            return (Criteria) this;
        }

        public Criteria andIxmmcuNotEqualTo(String value) {
            addCriterion("IXMMCU <>", value, "ixmmcu");
            return (Criteria) this;
        }

        public Criteria andIxmmcuGreaterThan(String value) {
            addCriterion("IXMMCU >", value, "ixmmcu");
            return (Criteria) this;
        }

        public Criteria andIxmmcuGreaterThanOrEqualTo(String value) {
            addCriterion("IXMMCU >=", value, "ixmmcu");
            return (Criteria) this;
        }

        public Criteria andIxmmcuLessThan(String value) {
            addCriterion("IXMMCU <", value, "ixmmcu");
            return (Criteria) this;
        }

        public Criteria andIxmmcuLessThanOrEqualTo(String value) {
            addCriterion("IXMMCU <=", value, "ixmmcu");
            return (Criteria) this;
        }

        public Criteria andIxmmcuLike(String value) {
            addCriterion("IXMMCU like", value, "ixmmcu");
            return (Criteria) this;
        }

        public Criteria andIxmmcuNotLike(String value) {
            addCriterion("IXMMCU not like", value, "ixmmcu");
            return (Criteria) this;
        }

        public Criteria andIxmmcuIn(List<String> values) {
            addCriterion("IXMMCU in", values, "ixmmcu");
            return (Criteria) this;
        }

        public Criteria andIxmmcuNotIn(List<String> values) {
            addCriterion("IXMMCU not in", values, "ixmmcu");
            return (Criteria) this;
        }

        public Criteria andIxmmcuBetween(String value1, String value2) {
            addCriterion("IXMMCU between", value1, value2, "ixmmcu");
            return (Criteria) this;
        }

        public Criteria andIxmmcuNotBetween(String value1, String value2) {
            addCriterion("IXMMCU not between", value1, value2, "ixmmcu");
            return (Criteria) this;
        }

        public Criteria andIxcpnbIsNull() {
            addCriterion("IXCPNB is null");
            return (Criteria) this;
        }

        public Criteria andIxcpnbIsNotNull() {
            addCriterion("IXCPNB is not null");
            return (Criteria) this;
        }

        public Criteria andIxcpnbEqualTo(BigDecimal value) {
            addCriterion("IXCPNB =", value, "ixcpnb");
            return (Criteria) this;
        }

        public Criteria andIxcpnbNotEqualTo(BigDecimal value) {
            addCriterion("IXCPNB <>", value, "ixcpnb");
            return (Criteria) this;
        }

        public Criteria andIxcpnbGreaterThan(BigDecimal value) {
            addCriterion("IXCPNB >", value, "ixcpnb");
            return (Criteria) this;
        }

        public Criteria andIxcpnbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IXCPNB >=", value, "ixcpnb");
            return (Criteria) this;
        }

        public Criteria andIxcpnbLessThan(BigDecimal value) {
            addCriterion("IXCPNB <", value, "ixcpnb");
            return (Criteria) this;
        }

        public Criteria andIxcpnbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IXCPNB <=", value, "ixcpnb");
            return (Criteria) this;
        }

        public Criteria andIxcpnbIn(List<BigDecimal> values) {
            addCriterion("IXCPNB in", values, "ixcpnb");
            return (Criteria) this;
        }

        public Criteria andIxcpnbNotIn(List<BigDecimal> values) {
            addCriterion("IXCPNB not in", values, "ixcpnb");
            return (Criteria) this;
        }

        public Criteria andIxcpnbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IXCPNB between", value1, value2, "ixcpnb");
            return (Criteria) this;
        }

        public Criteria andIxcpnbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IXCPNB not between", value1, value2, "ixcpnb");
            return (Criteria) this;
        }

        public Criteria andIxkitlIsNull() {
            addCriterion("IXKITL is null");
            return (Criteria) this;
        }

        public Criteria andIxkitlIsNotNull() {
            addCriterion("IXKITL is not null");
            return (Criteria) this;
        }

        public Criteria andIxkitlEqualTo(String value) {
            addCriterion("IXKITL =", value, "ixkitl");
            return (Criteria) this;
        }

        public Criteria andIxkitlNotEqualTo(String value) {
            addCriterion("IXKITL <>", value, "ixkitl");
            return (Criteria) this;
        }

        public Criteria andIxkitlGreaterThan(String value) {
            addCriterion("IXKITL >", value, "ixkitl");
            return (Criteria) this;
        }

        public Criteria andIxkitlGreaterThanOrEqualTo(String value) {
            addCriterion("IXKITL >=", value, "ixkitl");
            return (Criteria) this;
        }

        public Criteria andIxkitlLessThan(String value) {
            addCriterion("IXKITL <", value, "ixkitl");
            return (Criteria) this;
        }

        public Criteria andIxkitlLessThanOrEqualTo(String value) {
            addCriterion("IXKITL <=", value, "ixkitl");
            return (Criteria) this;
        }

        public Criteria andIxkitlLike(String value) {
            addCriterion("IXKITL like", value, "ixkitl");
            return (Criteria) this;
        }

        public Criteria andIxkitlNotLike(String value) {
            addCriterion("IXKITL not like", value, "ixkitl");
            return (Criteria) this;
        }

        public Criteria andIxkitlIn(List<String> values) {
            addCriterion("IXKITL in", values, "ixkitl");
            return (Criteria) this;
        }

        public Criteria andIxkitlNotIn(List<String> values) {
            addCriterion("IXKITL not in", values, "ixkitl");
            return (Criteria) this;
        }

        public Criteria andIxkitlBetween(String value1, String value2) {
            addCriterion("IXKITL between", value1, value2, "ixkitl");
            return (Criteria) this;
        }

        public Criteria andIxkitlNotBetween(String value1, String value2) {
            addCriterion("IXKITL not between", value1, value2, "ixkitl");
            return (Criteria) this;
        }

        public Criteria andIxitmIsNull() {
            addCriterion("IXITM is null");
            return (Criteria) this;
        }

        public Criteria andIxitmIsNotNull() {
            addCriterion("IXITM is not null");
            return (Criteria) this;
        }

        public Criteria andIxitmEqualTo(Integer value) {
            addCriterion("IXITM =", value, "ixitm");
            return (Criteria) this;
        }

        public Criteria andIxitmNotEqualTo(Integer value) {
            addCriterion("IXITM <>", value, "ixitm");
            return (Criteria) this;
        }

        public Criteria andIxitmGreaterThan(Integer value) {
            addCriterion("IXITM >", value, "ixitm");
            return (Criteria) this;
        }

        public Criteria andIxitmGreaterThanOrEqualTo(Integer value) {
            addCriterion("IXITM >=", value, "ixitm");
            return (Criteria) this;
        }

        public Criteria andIxitmLessThan(Integer value) {
            addCriterion("IXITM <", value, "ixitm");
            return (Criteria) this;
        }

        public Criteria andIxitmLessThanOrEqualTo(Integer value) {
            addCriterion("IXITM <=", value, "ixitm");
            return (Criteria) this;
        }

        public Criteria andIxitmIn(List<Integer> values) {
            addCriterion("IXITM in", values, "ixitm");
            return (Criteria) this;
        }

        public Criteria andIxitmNotIn(List<Integer> values) {
            addCriterion("IXITM not in", values, "ixitm");
            return (Criteria) this;
        }

        public Criteria andIxitmBetween(Integer value1, Integer value2) {
            addCriterion("IXITM between", value1, value2, "ixitm");
            return (Criteria) this;
        }

        public Criteria andIxitmNotBetween(Integer value1, Integer value2) {
            addCriterion("IXITM not between", value1, value2, "ixitm");
            return (Criteria) this;
        }

        public Criteria andIxlitmIsNull() {
            addCriterion("IXLITM is null");
            return (Criteria) this;
        }

        public Criteria andIxlitmIsNotNull() {
            addCriterion("IXLITM is not null");
            return (Criteria) this;
        }

        public Criteria andIxlitmEqualTo(String value) {
            addCriterion("IXLITM =", value, "ixlitm");
            return (Criteria) this;
        }

        public Criteria andIxlitmNotEqualTo(String value) {
            addCriterion("IXLITM <>", value, "ixlitm");
            return (Criteria) this;
        }

        public Criteria andIxlitmGreaterThan(String value) {
            addCriterion("IXLITM >", value, "ixlitm");
            return (Criteria) this;
        }

        public Criteria andIxlitmGreaterThanOrEqualTo(String value) {
            addCriterion("IXLITM >=", value, "ixlitm");
            return (Criteria) this;
        }

        public Criteria andIxlitmLessThan(String value) {
            addCriterion("IXLITM <", value, "ixlitm");
            return (Criteria) this;
        }

        public Criteria andIxlitmLessThanOrEqualTo(String value) {
            addCriterion("IXLITM <=", value, "ixlitm");
            return (Criteria) this;
        }

        public Criteria andIxlitmLike(String value) {
            addCriterion("IXLITM like", value, "ixlitm");
            return (Criteria) this;
        }

        public Criteria andIxlitmNotLike(String value) {
            addCriterion("IXLITM not like", value, "ixlitm");
            return (Criteria) this;
        }

        public Criteria andIxlitmIn(List<String> values) {
            addCriterion("IXLITM in", values, "ixlitm");
            return (Criteria) this;
        }

        public Criteria andIxlitmNotIn(List<String> values) {
            addCriterion("IXLITM not in", values, "ixlitm");
            return (Criteria) this;
        }

        public Criteria andIxlitmBetween(String value1, String value2) {
            addCriterion("IXLITM between", value1, value2, "ixlitm");
            return (Criteria) this;
        }

        public Criteria andIxlitmNotBetween(String value1, String value2) {
            addCriterion("IXLITM not between", value1, value2, "ixlitm");
            return (Criteria) this;
        }

        public Criteria andIxcmcuIsNull() {
            addCriterion("IXCMCU is null");
            return (Criteria) this;
        }

        public Criteria andIxcmcuIsNotNull() {
            addCriterion("IXCMCU is not null");
            return (Criteria) this;
        }

        public Criteria andIxcmcuEqualTo(String value) {
            addCriterion("IXCMCU =", value, "ixcmcu");
            return (Criteria) this;
        }

        public Criteria andIxcmcuNotEqualTo(String value) {
            addCriterion("IXCMCU <>", value, "ixcmcu");
            return (Criteria) this;
        }

        public Criteria andIxcmcuGreaterThan(String value) {
            addCriterion("IXCMCU >", value, "ixcmcu");
            return (Criteria) this;
        }

        public Criteria andIxcmcuGreaterThanOrEqualTo(String value) {
            addCriterion("IXCMCU >=", value, "ixcmcu");
            return (Criteria) this;
        }

        public Criteria andIxcmcuLessThan(String value) {
            addCriterion("IXCMCU <", value, "ixcmcu");
            return (Criteria) this;
        }

        public Criteria andIxcmcuLessThanOrEqualTo(String value) {
            addCriterion("IXCMCU <=", value, "ixcmcu");
            return (Criteria) this;
        }

        public Criteria andIxcmcuLike(String value) {
            addCriterion("IXCMCU like", value, "ixcmcu");
            return (Criteria) this;
        }

        public Criteria andIxcmcuNotLike(String value) {
            addCriterion("IXCMCU not like", value, "ixcmcu");
            return (Criteria) this;
        }

        public Criteria andIxcmcuIn(List<String> values) {
            addCriterion("IXCMCU in", values, "ixcmcu");
            return (Criteria) this;
        }

        public Criteria andIxcmcuNotIn(List<String> values) {
            addCriterion("IXCMCU not in", values, "ixcmcu");
            return (Criteria) this;
        }

        public Criteria andIxcmcuBetween(String value1, String value2) {
            addCriterion("IXCMCU between", value1, value2, "ixcmcu");
            return (Criteria) this;
        }

        public Criteria andIxcmcuNotBetween(String value1, String value2) {
            addCriterion("IXCMCU not between", value1, value2, "ixcmcu");
            return (Criteria) this;
        }

        public Criteria andIxcpntIsNull() {
            addCriterion("IXCPNT is null");
            return (Criteria) this;
        }

        public Criteria andIxcpntIsNotNull() {
            addCriterion("IXCPNT is not null");
            return (Criteria) this;
        }

        public Criteria andIxcpntEqualTo(Integer value) {
            addCriterion("IXCPNT =", value, "ixcpnt");
            return (Criteria) this;
        }

        public Criteria andIxcpntNotEqualTo(Integer value) {
            addCriterion("IXCPNT <>", value, "ixcpnt");
            return (Criteria) this;
        }

        public Criteria andIxcpntGreaterThan(Integer value) {
            addCriterion("IXCPNT >", value, "ixcpnt");
            return (Criteria) this;
        }

        public Criteria andIxcpntGreaterThanOrEqualTo(Integer value) {
            addCriterion("IXCPNT >=", value, "ixcpnt");
            return (Criteria) this;
        }

        public Criteria andIxcpntLessThan(Integer value) {
            addCriterion("IXCPNT <", value, "ixcpnt");
            return (Criteria) this;
        }

        public Criteria andIxcpntLessThanOrEqualTo(Integer value) {
            addCriterion("IXCPNT <=", value, "ixcpnt");
            return (Criteria) this;
        }

        public Criteria andIxcpntIn(List<Integer> values) {
            addCriterion("IXCPNT in", values, "ixcpnt");
            return (Criteria) this;
        }

        public Criteria andIxcpntNotIn(List<Integer> values) {
            addCriterion("IXCPNT not in", values, "ixcpnt");
            return (Criteria) this;
        }

        public Criteria andIxcpntBetween(Integer value1, Integer value2) {
            addCriterion("IXCPNT between", value1, value2, "ixcpnt");
            return (Criteria) this;
        }

        public Criteria andIxcpntNotBetween(Integer value1, Integer value2) {
            addCriterion("IXCPNT not between", value1, value2, "ixcpnt");
            return (Criteria) this;
        }

        public Criteria andIxqntyIsNull() {
            addCriterion("IXQNTY is null");
            return (Criteria) this;
        }

        public Criteria andIxqntyIsNotNull() {
            addCriterion("IXQNTY is not null");
            return (Criteria) this;
        }

        public Criteria andIxqntyEqualTo(Integer value) {
            addCriterion("IXQNTY =", value, "ixqnty");
            return (Criteria) this;
        }

        public Criteria andIxqntyNotEqualTo(Integer value) {
            addCriterion("IXQNTY <>", value, "ixqnty");
            return (Criteria) this;
        }

        public Criteria andIxqntyGreaterThan(Integer value) {
            addCriterion("IXQNTY >", value, "ixqnty");
            return (Criteria) this;
        }

        public Criteria andIxqntyGreaterThanOrEqualTo(Integer value) {
            addCriterion("IXQNTY >=", value, "ixqnty");
            return (Criteria) this;
        }

        public Criteria andIxqntyLessThan(Integer value) {
            addCriterion("IXQNTY <", value, "ixqnty");
            return (Criteria) this;
        }

        public Criteria andIxqntyLessThanOrEqualTo(Integer value) {
            addCriterion("IXQNTY <=", value, "ixqnty");
            return (Criteria) this;
        }

        public Criteria andIxqntyIn(List<Integer> values) {
            addCriterion("IXQNTY in", values, "ixqnty");
            return (Criteria) this;
        }

        public Criteria andIxqntyNotIn(List<Integer> values) {
            addCriterion("IXQNTY not in", values, "ixqnty");
            return (Criteria) this;
        }

        public Criteria andIxqntyBetween(Integer value1, Integer value2) {
            addCriterion("IXQNTY between", value1, value2, "ixqnty");
            return (Criteria) this;
        }

        public Criteria andIxqntyNotBetween(Integer value1, Integer value2) {
            addCriterion("IXQNTY not between", value1, value2, "ixqnty");
            return (Criteria) this;
        }

        public Criteria andIxumIsNull() {
            addCriterion("IXUM is null");
            return (Criteria) this;
        }

        public Criteria andIxumIsNotNull() {
            addCriterion("IXUM is not null");
            return (Criteria) this;
        }

        public Criteria andIxumEqualTo(String value) {
            addCriterion("IXUM =", value, "ixum");
            return (Criteria) this;
        }

        public Criteria andIxumNotEqualTo(String value) {
            addCriterion("IXUM <>", value, "ixum");
            return (Criteria) this;
        }

        public Criteria andIxumGreaterThan(String value) {
            addCriterion("IXUM >", value, "ixum");
            return (Criteria) this;
        }

        public Criteria andIxumGreaterThanOrEqualTo(String value) {
            addCriterion("IXUM >=", value, "ixum");
            return (Criteria) this;
        }

        public Criteria andIxumLessThan(String value) {
            addCriterion("IXUM <", value, "ixum");
            return (Criteria) this;
        }

        public Criteria andIxumLessThanOrEqualTo(String value) {
            addCriterion("IXUM <=", value, "ixum");
            return (Criteria) this;
        }

        public Criteria andIxumLike(String value) {
            addCriterion("IXUM like", value, "ixum");
            return (Criteria) this;
        }

        public Criteria andIxumNotLike(String value) {
            addCriterion("IXUM not like", value, "ixum");
            return (Criteria) this;
        }

        public Criteria andIxumIn(List<String> values) {
            addCriterion("IXUM in", values, "ixum");
            return (Criteria) this;
        }

        public Criteria andIxumNotIn(List<String> values) {
            addCriterion("IXUM not in", values, "ixum");
            return (Criteria) this;
        }

        public Criteria andIxumBetween(String value1, String value2) {
            addCriterion("IXUM between", value1, value2, "ixum");
            return (Criteria) this;
        }

        public Criteria andIxumNotBetween(String value1, String value2) {
            addCriterion("IXUM not between", value1, value2, "ixum");
            return (Criteria) this;
        }

        public Criteria andIxefffIsNull() {
            addCriterion("IXEFFF is null");
            return (Criteria) this;
        }

        public Criteria andIxefffIsNotNull() {
            addCriterion("IXEFFF is not null");
            return (Criteria) this;
        }

        public Criteria andIxefffEqualTo(Date value) {
            addCriterionForJDBCDate("IXEFFF =", value, "ixefff");
            return (Criteria) this;
        }

        public Criteria andIxefffNotEqualTo(Date value) {
            addCriterionForJDBCDate("IXEFFF <>", value, "ixefff");
            return (Criteria) this;
        }

        public Criteria andIxefffGreaterThan(Date value) {
            addCriterionForJDBCDate("IXEFFF >", value, "ixefff");
            return (Criteria) this;
        }

        public Criteria andIxefffGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("IXEFFF >=", value, "ixefff");
            return (Criteria) this;
        }

        public Criteria andIxefffLessThan(Date value) {
            addCriterionForJDBCDate("IXEFFF <", value, "ixefff");
            return (Criteria) this;
        }

        public Criteria andIxefffLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("IXEFFF <=", value, "ixefff");
            return (Criteria) this;
        }

        public Criteria andIxefffIn(List<Date> values) {
            addCriterionForJDBCDate("IXEFFF in", values, "ixefff");
            return (Criteria) this;
        }

        public Criteria andIxefffNotIn(List<Date> values) {
            addCriterionForJDBCDate("IXEFFF not in", values, "ixefff");
            return (Criteria) this;
        }

        public Criteria andIxefffBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("IXEFFF between", value1, value2, "ixefff");
            return (Criteria) this;
        }

        public Criteria andIxefffNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("IXEFFF not between", value1, value2, "ixefff");
            return (Criteria) this;
        }

        public Criteria andIxefftIsNull() {
            addCriterion("IXEFFT is null");
            return (Criteria) this;
        }

        public Criteria andIxefftIsNotNull() {
            addCriterion("IXEFFT is not null");
            return (Criteria) this;
        }

        public Criteria andIxefftEqualTo(Date value) {
            addCriterionForJDBCDate("IXEFFT =", value, "ixefft");
            return (Criteria) this;
        }

        public Criteria andIxefftNotEqualTo(Date value) {
            addCriterionForJDBCDate("IXEFFT <>", value, "ixefft");
            return (Criteria) this;
        }

        public Criteria andIxefftGreaterThan(Date value) {
            addCriterionForJDBCDate("IXEFFT >", value, "ixefft");
            return (Criteria) this;
        }

        public Criteria andIxefftGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("IXEFFT >=", value, "ixefft");
            return (Criteria) this;
        }

        public Criteria andIxefftLessThan(Date value) {
            addCriterionForJDBCDate("IXEFFT <", value, "ixefft");
            return (Criteria) this;
        }

        public Criteria andIxefftLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("IXEFFT <=", value, "ixefft");
            return (Criteria) this;
        }

        public Criteria andIxefftIn(List<Date> values) {
            addCriterionForJDBCDate("IXEFFT in", values, "ixefft");
            return (Criteria) this;
        }

        public Criteria andIxefftNotIn(List<Date> values) {
            addCriterionForJDBCDate("IXEFFT not in", values, "ixefft");
            return (Criteria) this;
        }

        public Criteria andIxefftBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("IXEFFT between", value1, value2, "ixefft");
            return (Criteria) this;
        }

        public Criteria andIxefftNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("IXEFFT not between", value1, value2, "ixefft");
            return (Criteria) this;
        }

        public Criteria andIxuserIsNull() {
            addCriterion("IXUSER is null");
            return (Criteria) this;
        }

        public Criteria andIxuserIsNotNull() {
            addCriterion("IXUSER is not null");
            return (Criteria) this;
        }

        public Criteria andIxuserEqualTo(String value) {
            addCriterion("IXUSER =", value, "ixuser");
            return (Criteria) this;
        }

        public Criteria andIxuserNotEqualTo(String value) {
            addCriterion("IXUSER <>", value, "ixuser");
            return (Criteria) this;
        }

        public Criteria andIxuserGreaterThan(String value) {
            addCriterion("IXUSER >", value, "ixuser");
            return (Criteria) this;
        }

        public Criteria andIxuserGreaterThanOrEqualTo(String value) {
            addCriterion("IXUSER >=", value, "ixuser");
            return (Criteria) this;
        }

        public Criteria andIxuserLessThan(String value) {
            addCriterion("IXUSER <", value, "ixuser");
            return (Criteria) this;
        }

        public Criteria andIxuserLessThanOrEqualTo(String value) {
            addCriterion("IXUSER <=", value, "ixuser");
            return (Criteria) this;
        }

        public Criteria andIxuserLike(String value) {
            addCriterion("IXUSER like", value, "ixuser");
            return (Criteria) this;
        }

        public Criteria andIxuserNotLike(String value) {
            addCriterion("IXUSER not like", value, "ixuser");
            return (Criteria) this;
        }

        public Criteria andIxuserIn(List<String> values) {
            addCriterion("IXUSER in", values, "ixuser");
            return (Criteria) this;
        }

        public Criteria andIxuserNotIn(List<String> values) {
            addCriterion("IXUSER not in", values, "ixuser");
            return (Criteria) this;
        }

        public Criteria andIxuserBetween(String value1, String value2) {
            addCriterion("IXUSER between", value1, value2, "ixuser");
            return (Criteria) this;
        }

        public Criteria andIxuserNotBetween(String value1, String value2) {
            addCriterion("IXUSER not between", value1, value2, "ixuser");
            return (Criteria) this;
        }

        public Criteria andIxupmjIsNull() {
            addCriterion("IXUPMJ is null");
            return (Criteria) this;
        }

        public Criteria andIxupmjIsNotNull() {
            addCriterion("IXUPMJ is not null");
            return (Criteria) this;
        }

        public Criteria andIxupmjEqualTo(Date value) {
            addCriterion("IXUPMJ =", value, "ixupmj");
            return (Criteria) this;
        }

        public Criteria andIxupmjNotEqualTo(Date value) {
            addCriterion("IXUPMJ <>", value, "ixupmj");
            return (Criteria) this;
        }

        public Criteria andIxupmjGreaterThan(Date value) {
            addCriterion("IXUPMJ >", value, "ixupmj");
            return (Criteria) this;
        }

        public Criteria andIxupmjGreaterThanOrEqualTo(Date value) {
            addCriterion("IXUPMJ >=", value, "ixupmj");
            return (Criteria) this;
        }

        public Criteria andIxupmjLessThan(Date value) {
            addCriterion("IXUPMJ <", value, "ixupmj");
            return (Criteria) this;
        }

        public Criteria andIxupmjLessThanOrEqualTo(Date value) {
            addCriterion("IXUPMJ <=", value, "ixupmj");
            return (Criteria) this;
        }

        public Criteria andIxupmjIn(List<Date> values) {
            addCriterion("IXUPMJ in", values, "ixupmj");
            return (Criteria) this;
        }

        public Criteria andIxupmjNotIn(List<Date> values) {
            addCriterion("IXUPMJ not in", values, "ixupmj");
            return (Criteria) this;
        }

        public Criteria andIxupmjBetween(Date value1, Date value2) {
            addCriterion("IXUPMJ between", value1, value2, "ixupmj");
            return (Criteria) this;
        }

        public Criteria andIxupmjNotBetween(Date value1, Date value2) {
            addCriterion("IXUPMJ not between", value1, value2, "ixupmj");
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