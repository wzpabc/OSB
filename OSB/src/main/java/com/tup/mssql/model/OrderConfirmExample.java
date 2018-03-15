package com.tup.mssql.model;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderConfirmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderConfirmExample() {
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

        public Criteria andSdkcooIsNull() {
            addCriterion("SDKCOO is null");
            return (Criteria) this;
        }

        public Criteria andSdkcooIsNotNull() {
            addCriterion("SDKCOO is not null");
            return (Criteria) this;
        }

        public Criteria andSdkcooEqualTo(String value) {
            addCriterion("SDKCOO =", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooNotEqualTo(String value) {
            addCriterion("SDKCOO <>", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooGreaterThan(String value) {
            addCriterion("SDKCOO >", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooGreaterThanOrEqualTo(String value) {
            addCriterion("SDKCOO >=", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooLessThan(String value) {
            addCriterion("SDKCOO <", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooLessThanOrEqualTo(String value) {
            addCriterion("SDKCOO <=", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooLike(String value) {
            addCriterion("SDKCOO like", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooNotLike(String value) {
            addCriterion("SDKCOO not like", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooIn(List<String> values) {
            addCriterion("SDKCOO in", values, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooNotIn(List<String> values) {
            addCriterion("SDKCOO not in", values, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooBetween(String value1, String value2) {
            addCriterion("SDKCOO between", value1, value2, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooNotBetween(String value1, String value2) {
            addCriterion("SDKCOO not between", value1, value2, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSddocoIsNull() {
            addCriterion("SDDOCO is null");
            return (Criteria) this;
        }

        public Criteria andSddocoIsNotNull() {
            addCriterion("SDDOCO is not null");
            return (Criteria) this;
        }

        public Criteria andSddocoEqualTo(Integer value) {
            addCriterion("SDDOCO =", value, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoNotEqualTo(Integer value) {
            addCriterion("SDDOCO <>", value, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoGreaterThan(Integer value) {
            addCriterion("SDDOCO >", value, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SDDOCO >=", value, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoLessThan(Integer value) {
            addCriterion("SDDOCO <", value, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoLessThanOrEqualTo(Integer value) {
            addCriterion("SDDOCO <=", value, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoIn(List<Integer> values) {
            addCriterion("SDDOCO in", values, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoNotIn(List<Integer> values) {
            addCriterion("SDDOCO not in", values, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoBetween(Integer value1, Integer value2) {
            addCriterion("SDDOCO between", value1, value2, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoNotBetween(Integer value1, Integer value2) {
            addCriterion("SDDOCO not between", value1, value2, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddctoIsNull() {
            addCriterion("SDDCTO is null");
            return (Criteria) this;
        }

        public Criteria andSddctoIsNotNull() {
            addCriterion("SDDCTO is not null");
            return (Criteria) this;
        }

        public Criteria andSddctoEqualTo(String value) {
            addCriterion("SDDCTO =", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoNotEqualTo(String value) {
            addCriterion("SDDCTO <>", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoGreaterThan(String value) {
            addCriterion("SDDCTO >", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoGreaterThanOrEqualTo(String value) {
            addCriterion("SDDCTO >=", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoLessThan(String value) {
            addCriterion("SDDCTO <", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoLessThanOrEqualTo(String value) {
            addCriterion("SDDCTO <=", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoLike(String value) {
            addCriterion("SDDCTO like", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoNotLike(String value) {
            addCriterion("SDDCTO not like", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoIn(List<String> values) {
            addCriterion("SDDCTO in", values, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoNotIn(List<String> values) {
            addCriterion("SDDCTO not in", values, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoBetween(String value1, String value2) {
            addCriterion("SDDCTO between", value1, value2, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoNotBetween(String value1, String value2) {
            addCriterion("SDDCTO not between", value1, value2, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSdlnidIsNull() {
            addCriterion("SDLNID is null");
            return (Criteria) this;
        }

        public Criteria andSdlnidIsNotNull() {
            addCriterion("SDLNID is not null");
            return (Criteria) this;
        }

        public Criteria andSdlnidEqualTo(BigDecimal value) {
            addCriterion("SDLNID =", value, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidNotEqualTo(BigDecimal value) {
            addCriterion("SDLNID <>", value, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidGreaterThan(BigDecimal value) {
            addCriterion("SDLNID >", value, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SDLNID >=", value, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidLessThan(BigDecimal value) {
            addCriterion("SDLNID <", value, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SDLNID <=", value, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidIn(List<BigDecimal> values) {
            addCriterion("SDLNID in", values, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidNotIn(List<BigDecimal> values) {
            addCriterion("SDLNID not in", values, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDLNID between", value1, value2, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDLNID not between", value1, value2, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdmcuIsNull() {
            addCriterion("SDMCU is null");
            return (Criteria) this;
        }

        public Criteria andSdmcuIsNotNull() {
            addCriterion("SDMCU is not null");
            return (Criteria) this;
        }

        public Criteria andSdmcuEqualTo(String value) {
            addCriterion("SDMCU =", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuNotEqualTo(String value) {
            addCriterion("SDMCU <>", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuGreaterThan(String value) {
            addCriterion("SDMCU >", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuGreaterThanOrEqualTo(String value) {
            addCriterion("SDMCU >=", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuLessThan(String value) {
            addCriterion("SDMCU <", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuLessThanOrEqualTo(String value) {
            addCriterion("SDMCU <=", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuLike(String value) {
            addCriterion("SDMCU like", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuNotLike(String value) {
            addCriterion("SDMCU not like", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuIn(List<String> values) {
            addCriterion("SDMCU in", values, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuNotIn(List<String> values) {
            addCriterion("SDMCU not in", values, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuBetween(String value1, String value2) {
            addCriterion("SDMCU between", value1, value2, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuNotBetween(String value1, String value2) {
            addCriterion("SDMCU not between", value1, value2, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdaddjIsNull() {
            addCriterion("SDADDJ is null");
            return (Criteria) this;
        }

        public Criteria andSdaddjIsNotNull() {
            addCriterion("SDADDJ is not null");
            return (Criteria) this;
        }

        public Criteria andSdaddjEqualTo(Date value) {
            addCriterion("SDADDJ =", value, "sdaddj");
            return (Criteria) this;
        }

        public Criteria andSdaddjNotEqualTo(Date value) {
            addCriterion("SDADDJ <>", value, "sdaddj");
            return (Criteria) this;
        }

        public Criteria andSdaddjGreaterThan(Date value) {
            addCriterion("SDADDJ >", value, "sdaddj");
            return (Criteria) this;
        }

        public Criteria andSdaddjGreaterThanOrEqualTo(Date value) {
            addCriterion("SDADDJ >=", value, "sdaddj");
            return (Criteria) this;
        }

        public Criteria andSdaddjLessThan(Date value) {
            addCriterion("SDADDJ <", value, "sdaddj");
            return (Criteria) this;
        }

        public Criteria andSdaddjLessThanOrEqualTo(Date value) {
            addCriterion("SDADDJ <=", value, "sdaddj");
            return (Criteria) this;
        }

        public Criteria andSdaddjIn(List<Date> values) {
            addCriterion("SDADDJ in", values, "sdaddj");
            return (Criteria) this;
        }

        public Criteria andSdaddjNotIn(List<Date> values) {
            addCriterion("SDADDJ not in", values, "sdaddj");
            return (Criteria) this;
        }

        public Criteria andSdaddjBetween(Date value1, Date value2) {
            addCriterion("SDADDJ between", value1, value2, "sdaddj");
            return (Criteria) this;
        }

        public Criteria andSdaddjNotBetween(Date value1, Date value2) {
            addCriterion("SDADDJ not between", value1, value2, "sdaddj");
            return (Criteria) this;
        }

        public Criteria andSdsoqsIsNull() {
            addCriterion("SDSOQS is null");
            return (Criteria) this;
        }

        public Criteria andSdsoqsIsNotNull() {
            addCriterion("SDSOQS is not null");
            return (Criteria) this;
        }

        public Criteria andSdsoqsEqualTo(Long value) {
            addCriterion("SDSOQS =", value, "sdsoqs");
            return (Criteria) this;
        }

        public Criteria andSdsoqsNotEqualTo(Long value) {
            addCriterion("SDSOQS <>", value, "sdsoqs");
            return (Criteria) this;
        }

        public Criteria andSdsoqsGreaterThan(Long value) {
            addCriterion("SDSOQS >", value, "sdsoqs");
            return (Criteria) this;
        }

        public Criteria andSdsoqsGreaterThanOrEqualTo(Long value) {
            addCriterion("SDSOQS >=", value, "sdsoqs");
            return (Criteria) this;
        }

        public Criteria andSdsoqsLessThan(Long value) {
            addCriterion("SDSOQS <", value, "sdsoqs");
            return (Criteria) this;
        }

        public Criteria andSdsoqsLessThanOrEqualTo(Long value) {
            addCriterion("SDSOQS <=", value, "sdsoqs");
            return (Criteria) this;
        }

        public Criteria andSdsoqsIn(List<Long> values) {
            addCriterion("SDSOQS in", values, "sdsoqs");
            return (Criteria) this;
        }

        public Criteria andSdsoqsNotIn(List<Long> values) {
            addCriterion("SDSOQS not in", values, "sdsoqs");
            return (Criteria) this;
        }

        public Criteria andSdsoqsBetween(Long value1, Long value2) {
            addCriterion("SDSOQS between", value1, value2, "sdsoqs");
            return (Criteria) this;
        }

        public Criteria andSdsoqsNotBetween(Long value1, Long value2) {
            addCriterion("SDSOQS not between", value1, value2, "sdsoqs");
            return (Criteria) this;
        }

        public Criteria andSdcarsIsNull() {
            addCriterion("SDCARS is null");
            return (Criteria) this;
        }

        public Criteria andSdcarsIsNotNull() {
            addCriterion("SDCARS is not null");
            return (Criteria) this;
        }

        public Criteria andSdcarsEqualTo(Integer value) {
            addCriterion("SDCARS =", value, "sdcars");
            return (Criteria) this;
        }

        public Criteria andSdcarsNotEqualTo(Integer value) {
            addCriterion("SDCARS <>", value, "sdcars");
            return (Criteria) this;
        }

        public Criteria andSdcarsGreaterThan(Integer value) {
            addCriterion("SDCARS >", value, "sdcars");
            return (Criteria) this;
        }

        public Criteria andSdcarsGreaterThanOrEqualTo(Integer value) {
            addCriterion("SDCARS >=", value, "sdcars");
            return (Criteria) this;
        }

        public Criteria andSdcarsLessThan(Integer value) {
            addCriterion("SDCARS <", value, "sdcars");
            return (Criteria) this;
        }

        public Criteria andSdcarsLessThanOrEqualTo(Integer value) {
            addCriterion("SDCARS <=", value, "sdcars");
            return (Criteria) this;
        }

        public Criteria andSdcarsIn(List<Integer> values) {
            addCriterion("SDCARS in", values, "sdcars");
            return (Criteria) this;
        }

        public Criteria andSdcarsNotIn(List<Integer> values) {
            addCriterion("SDCARS not in", values, "sdcars");
            return (Criteria) this;
        }

        public Criteria andSdcarsBetween(Integer value1, Integer value2) {
            addCriterion("SDCARS between", value1, value2, "sdcars");
            return (Criteria) this;
        }

        public Criteria andSdcarsNotBetween(Integer value1, Integer value2) {
            addCriterion("SDCARS not between", value1, value2, "sdcars");
            return (Criteria) this;
        }

        public Criteria andSdcnidIsNull() {
            addCriterion("SDCNID is null");
            return (Criteria) this;
        }

        public Criteria andSdcnidIsNotNull() {
            addCriterion("SDCNID is not null");
            return (Criteria) this;
        }

        public Criteria andSdcnidEqualTo(String value) {
            addCriterion("SDCNID =", value, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidNotEqualTo(String value) {
            addCriterion("SDCNID <>", value, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidGreaterThan(String value) {
            addCriterion("SDCNID >", value, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidGreaterThanOrEqualTo(String value) {
            addCriterion("SDCNID >=", value, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidLessThan(String value) {
            addCriterion("SDCNID <", value, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidLessThanOrEqualTo(String value) {
            addCriterion("SDCNID <=", value, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidLike(String value) {
            addCriterion("SDCNID like", value, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidNotLike(String value) {
            addCriterion("SDCNID not like", value, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidIn(List<String> values) {
            addCriterion("SDCNID in", values, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidNotIn(List<String> values) {
            addCriterion("SDCNID not in", values, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidBetween(String value1, String value2) {
            addCriterion("SDCNID between", value1, value2, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSdcnidNotBetween(String value1, String value2) {
            addCriterion("SDCNID not between", value1, value2, "sdcnid");
            return (Criteria) this;
        }

        public Criteria andSddelnIsNull() {
            addCriterion("SDDELN is null");
            return (Criteria) this;
        }

        public Criteria andSddelnIsNotNull() {
            addCriterion("SDDELN is not null");
            return (Criteria) this;
        }

        public Criteria andSddelnEqualTo(Integer value) {
            addCriterion("SDDELN =", value, "sddeln");
            return (Criteria) this;
        }

        public Criteria andSddelnNotEqualTo(Integer value) {
            addCriterion("SDDELN <>", value, "sddeln");
            return (Criteria) this;
        }

        public Criteria andSddelnGreaterThan(Integer value) {
            addCriterion("SDDELN >", value, "sddeln");
            return (Criteria) this;
        }

        public Criteria andSddelnGreaterThanOrEqualTo(Integer value) {
            addCriterion("SDDELN >=", value, "sddeln");
            return (Criteria) this;
        }

        public Criteria andSddelnLessThan(Integer value) {
            addCriterion("SDDELN <", value, "sddeln");
            return (Criteria) this;
        }

        public Criteria andSddelnLessThanOrEqualTo(Integer value) {
            addCriterion("SDDELN <=", value, "sddeln");
            return (Criteria) this;
        }

        public Criteria andSddelnIn(List<Integer> values) {
            addCriterion("SDDELN in", values, "sddeln");
            return (Criteria) this;
        }

        public Criteria andSddelnNotIn(List<Integer> values) {
            addCriterion("SDDELN not in", values, "sddeln");
            return (Criteria) this;
        }

        public Criteria andSddelnBetween(Integer value1, Integer value2) {
            addCriterion("SDDELN between", value1, value2, "sddeln");
            return (Criteria) this;
        }

        public Criteria andSddelnNotBetween(Integer value1, Integer value2) {
            addCriterion("SDDELN not between", value1, value2, "sddeln");
            return (Criteria) this;
        }

        public Criteria andSdlitmIsNull() {
            addCriterion("SDLITM is null");
            return (Criteria) this;
        }

        public Criteria andSdlitmIsNotNull() {
            addCriterion("SDLITM is not null");
            return (Criteria) this;
        }

        public Criteria andSdlitmEqualTo(String value) {
            addCriterion("SDLITM =", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmNotEqualTo(String value) {
            addCriterion("SDLITM <>", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmGreaterThan(String value) {
            addCriterion("SDLITM >", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmGreaterThanOrEqualTo(String value) {
            addCriterion("SDLITM >=", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmLessThan(String value) {
            addCriterion("SDLITM <", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmLessThanOrEqualTo(String value) {
            addCriterion("SDLITM <=", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmLike(String value) {
            addCriterion("SDLITM like", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmNotLike(String value) {
            addCriterion("SDLITM not like", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmIn(List<String> values) {
            addCriterion("SDLITM in", values, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmNotIn(List<String> values) {
            addCriterion("SDLITM not in", values, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmBetween(String value1, String value2) {
            addCriterion("SDLITM between", value1, value2, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmNotBetween(String value1, String value2) {
            addCriterion("SDLITM not between", value1, value2, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlocnIsNull() {
            addCriterion("SDLOCN is null");
            return (Criteria) this;
        }

        public Criteria andSdlocnIsNotNull() {
            addCriterion("SDLOCN is not null");
            return (Criteria) this;
        }

        public Criteria andSdlocnEqualTo(String value) {
            addCriterion("SDLOCN =", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnNotEqualTo(String value) {
            addCriterion("SDLOCN <>", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnGreaterThan(String value) {
            addCriterion("SDLOCN >", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnGreaterThanOrEqualTo(String value) {
            addCriterion("SDLOCN >=", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnLessThan(String value) {
            addCriterion("SDLOCN <", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnLessThanOrEqualTo(String value) {
            addCriterion("SDLOCN <=", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnLike(String value) {
            addCriterion("SDLOCN like", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnNotLike(String value) {
            addCriterion("SDLOCN not like", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnIn(List<String> values) {
            addCriterion("SDLOCN in", values, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnNotIn(List<String> values) {
            addCriterion("SDLOCN not in", values, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnBetween(String value1, String value2) {
            addCriterion("SDLOCN between", value1, value2, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnNotBetween(String value1, String value2) {
            addCriterion("SDLOCN not between", value1, value2, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlotnIsNull() {
            addCriterion("SDLOTN is null");
            return (Criteria) this;
        }

        public Criteria andSdlotnIsNotNull() {
            addCriterion("SDLOTN is not null");
            return (Criteria) this;
        }

        public Criteria andSdlotnEqualTo(String value) {
            addCriterion("SDLOTN =", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnNotEqualTo(String value) {
            addCriterion("SDLOTN <>", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnGreaterThan(String value) {
            addCriterion("SDLOTN >", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnGreaterThanOrEqualTo(String value) {
            addCriterion("SDLOTN >=", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnLessThan(String value) {
            addCriterion("SDLOTN <", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnLessThanOrEqualTo(String value) {
            addCriterion("SDLOTN <=", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnLike(String value) {
            addCriterion("SDLOTN like", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnNotLike(String value) {
            addCriterion("SDLOTN not like", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnIn(List<String> values) {
            addCriterion("SDLOTN in", values, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnNotIn(List<String> values) {
            addCriterion("SDLOTN not in", values, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnBetween(String value1, String value2) {
            addCriterion("SDLOTN between", value1, value2, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnNotBetween(String value1, String value2) {
            addCriterion("SDLOTN not between", value1, value2, "sdlotn");
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

        public Criteria andSdlgnumIsNull() {
            addCriterion("SDLGNUM is null");
            return (Criteria) this;
        }

        public Criteria andSdlgnumIsNotNull() {
            addCriterion("SDLGNUM is not null");
            return (Criteria) this;
        }

        public Criteria andSdlgnumEqualTo(String value) {
            addCriterion("SDLGNUM =", value, "sdlgnum");
            return (Criteria) this;
        }

        public Criteria andSdlgnumNotEqualTo(String value) {
            addCriterion("SDLGNUM <>", value, "sdlgnum");
            return (Criteria) this;
        }

        public Criteria andSdlgnumGreaterThan(String value) {
            addCriterion("SDLGNUM >", value, "sdlgnum");
            return (Criteria) this;
        }

        public Criteria andSdlgnumGreaterThanOrEqualTo(String value) {
            addCriterion("SDLGNUM >=", value, "sdlgnum");
            return (Criteria) this;
        }

        public Criteria andSdlgnumLessThan(String value) {
            addCriterion("SDLGNUM <", value, "sdlgnum");
            return (Criteria) this;
        }

        public Criteria andSdlgnumLessThanOrEqualTo(String value) {
            addCriterion("SDLGNUM <=", value, "sdlgnum");
            return (Criteria) this;
        }

        public Criteria andSdlgnumLike(String value) {
            addCriterion("SDLGNUM like", value, "sdlgnum");
            return (Criteria) this;
        }

        public Criteria andSdlgnumNotLike(String value) {
            addCriterion("SDLGNUM not like", value, "sdlgnum");
            return (Criteria) this;
        }

        public Criteria andSdlgnumIn(List<String> values) {
            addCriterion("SDLGNUM in", values, "sdlgnum");
            return (Criteria) this;
        }

        public Criteria andSdlgnumNotIn(List<String> values) {
            addCriterion("SDLGNUM not in", values, "sdlgnum");
            return (Criteria) this;
        }

        public Criteria andSdlgnumBetween(String value1, String value2) {
            addCriterion("SDLGNUM between", value1, value2, "sdlgnum");
            return (Criteria) this;
        }

        public Criteria andSdlgnumNotBetween(String value1, String value2) {
            addCriterion("SDLGNUM not between", value1, value2, "sdlgnum");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateIsNull() {
            addCriterion("FMS_Process_Date is null");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateIsNotNull() {
            addCriterion("FMS_Process_Date is not null");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateEqualTo(Date value) {
            addCriterion("FMS_Process_Date =", value, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateNotEqualTo(Date value) {
            addCriterion("FMS_Process_Date <>", value, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateGreaterThan(Date value) {
            addCriterion("FMS_Process_Date >", value, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateGreaterThanOrEqualTo(Date value) {
            addCriterion("FMS_Process_Date >=", value, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateLessThan(Date value) {
            addCriterion("FMS_Process_Date <", value, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateLessThanOrEqualTo(Date value) {
            addCriterion("FMS_Process_Date <=", value, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateIn(List<Date> values) {
            addCriterion("FMS_Process_Date in", values, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateNotIn(List<Date> values) {
            addCriterion("FMS_Process_Date not in", values, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateBetween(Date value1, Date value2) {
            addCriterion("FMS_Process_Date between", value1, value2, "fmsProcessDate");
            return (Criteria) this;
        }

        public Criteria andFmsProcessDateNotBetween(Date value1, Date value2) {
            addCriterion("FMS_Process_Date not between", value1, value2, "fmsProcessDate");
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