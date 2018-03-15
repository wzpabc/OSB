package com.tup.mssql.model;


import java.util.ArrayList;
import java.util.List;

public class InventoryJDEExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InventoryJDEExample() {
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

        public Criteria andLiitmIsNull() {
            addCriterion("LIITM is null");
            return (Criteria) this;
        }

        public Criteria andLiitmIsNotNull() {
            addCriterion("LIITM is not null");
            return (Criteria) this;
        }

        public Criteria andLiitmEqualTo(Integer value) {
            addCriterion("LIITM =", value, "liitm");
            return (Criteria) this;
        }

        public Criteria andLiitmNotEqualTo(Integer value) {
            addCriterion("LIITM <>", value, "liitm");
            return (Criteria) this;
        }

        public Criteria andLiitmGreaterThan(Integer value) {
            addCriterion("LIITM >", value, "liitm");
            return (Criteria) this;
        }

        public Criteria andLiitmGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIITM >=", value, "liitm");
            return (Criteria) this;
        }

        public Criteria andLiitmLessThan(Integer value) {
            addCriterion("LIITM <", value, "liitm");
            return (Criteria) this;
        }

        public Criteria andLiitmLessThanOrEqualTo(Integer value) {
            addCriterion("LIITM <=", value, "liitm");
            return (Criteria) this;
        }

        public Criteria andLiitmIn(List<Integer> values) {
            addCriterion("LIITM in", values, "liitm");
            return (Criteria) this;
        }

        public Criteria andLiitmNotIn(List<Integer> values) {
            addCriterion("LIITM not in", values, "liitm");
            return (Criteria) this;
        }

        public Criteria andLiitmBetween(Integer value1, Integer value2) {
            addCriterion("LIITM between", value1, value2, "liitm");
            return (Criteria) this;
        }

        public Criteria andLiitmNotBetween(Integer value1, Integer value2) {
            addCriterion("LIITM not between", value1, value2, "liitm");
            return (Criteria) this;
        }

        public Criteria andLimcuIsNull() {
            addCriterion("LIMCU is null");
            return (Criteria) this;
        }

        public Criteria andLimcuIsNotNull() {
            addCriterion("LIMCU is not null");
            return (Criteria) this;
        }

        public Criteria andLimcuEqualTo(String value) {
            addCriterion("LIMCU =", value, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuNotEqualTo(String value) {
            addCriterion("LIMCU <>", value, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuGreaterThan(String value) {
            addCriterion("LIMCU >", value, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuGreaterThanOrEqualTo(String value) {
            addCriterion("LIMCU >=", value, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuLessThan(String value) {
            addCriterion("LIMCU <", value, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuLessThanOrEqualTo(String value) {
            addCriterion("LIMCU <=", value, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuLike(String value) {
            addCriterion("LIMCU like", value, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuNotLike(String value) {
            addCriterion("LIMCU not like", value, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuIn(List<String> values) {
            addCriterion("LIMCU in", values, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuNotIn(List<String> values) {
            addCriterion("LIMCU not in", values, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuBetween(String value1, String value2) {
            addCriterion("LIMCU between", value1, value2, "limcu");
            return (Criteria) this;
        }

        public Criteria andLimcuNotBetween(String value1, String value2) {
            addCriterion("LIMCU not between", value1, value2, "limcu");
            return (Criteria) this;
        }

        public Criteria andLilocnIsNull() {
            addCriterion("LILOCN is null");
            return (Criteria) this;
        }

        public Criteria andLilocnIsNotNull() {
            addCriterion("LILOCN is not null");
            return (Criteria) this;
        }

        public Criteria andLilocnEqualTo(String value) {
            addCriterion("LILOCN =", value, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnNotEqualTo(String value) {
            addCriterion("LILOCN <>", value, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnGreaterThan(String value) {
            addCriterion("LILOCN >", value, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnGreaterThanOrEqualTo(String value) {
            addCriterion("LILOCN >=", value, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnLessThan(String value) {
            addCriterion("LILOCN <", value, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnLessThanOrEqualTo(String value) {
            addCriterion("LILOCN <=", value, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnLike(String value) {
            addCriterion("LILOCN like", value, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnNotLike(String value) {
            addCriterion("LILOCN not like", value, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnIn(List<String> values) {
            addCriterion("LILOCN in", values, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnNotIn(List<String> values) {
            addCriterion("LILOCN not in", values, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnBetween(String value1, String value2) {
            addCriterion("LILOCN between", value1, value2, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilocnNotBetween(String value1, String value2) {
            addCriterion("LILOCN not between", value1, value2, "lilocn");
            return (Criteria) this;
        }

        public Criteria andLilotnIsNull() {
            addCriterion("LILOTN is null");
            return (Criteria) this;
        }

        public Criteria andLilotnIsNotNull() {
            addCriterion("LILOTN is not null");
            return (Criteria) this;
        }

        public Criteria andLilotnEqualTo(String value) {
            addCriterion("LILOTN =", value, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnNotEqualTo(String value) {
            addCriterion("LILOTN <>", value, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnGreaterThan(String value) {
            addCriterion("LILOTN >", value, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnGreaterThanOrEqualTo(String value) {
            addCriterion("LILOTN >=", value, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnLessThan(String value) {
            addCriterion("LILOTN <", value, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnLessThanOrEqualTo(String value) {
            addCriterion("LILOTN <=", value, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnLike(String value) {
            addCriterion("LILOTN like", value, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnNotLike(String value) {
            addCriterion("LILOTN not like", value, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnIn(List<String> values) {
            addCriterion("LILOTN in", values, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnNotIn(List<String> values) {
            addCriterion("LILOTN not in", values, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnBetween(String value1, String value2) {
            addCriterion("LILOTN between", value1, value2, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLilotnNotBetween(String value1, String value2) {
            addCriterion("LILOTN not between", value1, value2, "lilotn");
            return (Criteria) this;
        }

        public Criteria andLipbinIsNull() {
            addCriterion("LIPBIN is null");
            return (Criteria) this;
        }

        public Criteria andLipbinIsNotNull() {
            addCriterion("LIPBIN is not null");
            return (Criteria) this;
        }

        public Criteria andLipbinEqualTo(String value) {
            addCriterion("LIPBIN =", value, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinNotEqualTo(String value) {
            addCriterion("LIPBIN <>", value, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinGreaterThan(String value) {
            addCriterion("LIPBIN >", value, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinGreaterThanOrEqualTo(String value) {
            addCriterion("LIPBIN >=", value, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinLessThan(String value) {
            addCriterion("LIPBIN <", value, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinLessThanOrEqualTo(String value) {
            addCriterion("LIPBIN <=", value, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinLike(String value) {
            addCriterion("LIPBIN like", value, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinNotLike(String value) {
            addCriterion("LIPBIN not like", value, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinIn(List<String> values) {
            addCriterion("LIPBIN in", values, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinNotIn(List<String> values) {
            addCriterion("LIPBIN not in", values, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinBetween(String value1, String value2) {
            addCriterion("LIPBIN between", value1, value2, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLipbinNotBetween(String value1, String value2) {
            addCriterion("LIPBIN not between", value1, value2, "lipbin");
            return (Criteria) this;
        }

        public Criteria andLiglptIsNull() {
            addCriterion("LIGLPT is null");
            return (Criteria) this;
        }

        public Criteria andLiglptIsNotNull() {
            addCriterion("LIGLPT is not null");
            return (Criteria) this;
        }

        public Criteria andLiglptEqualTo(String value) {
            addCriterion("LIGLPT =", value, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptNotEqualTo(String value) {
            addCriterion("LIGLPT <>", value, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptGreaterThan(String value) {
            addCriterion("LIGLPT >", value, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptGreaterThanOrEqualTo(String value) {
            addCriterion("LIGLPT >=", value, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptLessThan(String value) {
            addCriterion("LIGLPT <", value, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptLessThanOrEqualTo(String value) {
            addCriterion("LIGLPT <=", value, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptLike(String value) {
            addCriterion("LIGLPT like", value, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptNotLike(String value) {
            addCriterion("LIGLPT not like", value, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptIn(List<String> values) {
            addCriterion("LIGLPT in", values, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptNotIn(List<String> values) {
            addCriterion("LIGLPT not in", values, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptBetween(String value1, String value2) {
            addCriterion("LIGLPT between", value1, value2, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLiglptNotBetween(String value1, String value2) {
            addCriterion("LIGLPT not between", value1, value2, "liglpt");
            return (Criteria) this;
        }

        public Criteria andLilotsIsNull() {
            addCriterion("LILOTS is null");
            return (Criteria) this;
        }

        public Criteria andLilotsIsNotNull() {
            addCriterion("LILOTS is not null");
            return (Criteria) this;
        }

        public Criteria andLilotsEqualTo(String value) {
            addCriterion("LILOTS =", value, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsNotEqualTo(String value) {
            addCriterion("LILOTS <>", value, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsGreaterThan(String value) {
            addCriterion("LILOTS >", value, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsGreaterThanOrEqualTo(String value) {
            addCriterion("LILOTS >=", value, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsLessThan(String value) {
            addCriterion("LILOTS <", value, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsLessThanOrEqualTo(String value) {
            addCriterion("LILOTS <=", value, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsLike(String value) {
            addCriterion("LILOTS like", value, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsNotLike(String value) {
            addCriterion("LILOTS not like", value, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsIn(List<String> values) {
            addCriterion("LILOTS in", values, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsNotIn(List<String> values) {
            addCriterion("LILOTS not in", values, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsBetween(String value1, String value2) {
            addCriterion("LILOTS between", value1, value2, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilotsNotBetween(String value1, String value2) {
            addCriterion("LILOTS not between", value1, value2, "lilots");
            return (Criteria) this;
        }

        public Criteria andLilrcjIsNull() {
            addCriterion("LILRCJ is null");
            return (Criteria) this;
        }

        public Criteria andLilrcjIsNotNull() {
            addCriterion("LILRCJ is not null");
            return (Criteria) this;
        }

        public Criteria andLilrcjEqualTo(Integer value) {
            addCriterion("LILRCJ =", value, "lilrcj");
            return (Criteria) this;
        }

        public Criteria andLilrcjNotEqualTo(Integer value) {
            addCriterion("LILRCJ <>", value, "lilrcj");
            return (Criteria) this;
        }

        public Criteria andLilrcjGreaterThan(Integer value) {
            addCriterion("LILRCJ >", value, "lilrcj");
            return (Criteria) this;
        }

        public Criteria andLilrcjGreaterThanOrEqualTo(Integer value) {
            addCriterion("LILRCJ >=", value, "lilrcj");
            return (Criteria) this;
        }

        public Criteria andLilrcjLessThan(Integer value) {
            addCriterion("LILRCJ <", value, "lilrcj");
            return (Criteria) this;
        }

        public Criteria andLilrcjLessThanOrEqualTo(Integer value) {
            addCriterion("LILRCJ <=", value, "lilrcj");
            return (Criteria) this;
        }

        public Criteria andLilrcjIn(List<Integer> values) {
            addCriterion("LILRCJ in", values, "lilrcj");
            return (Criteria) this;
        }

        public Criteria andLilrcjNotIn(List<Integer> values) {
            addCriterion("LILRCJ not in", values, "lilrcj");
            return (Criteria) this;
        }

        public Criteria andLilrcjBetween(Integer value1, Integer value2) {
            addCriterion("LILRCJ between", value1, value2, "lilrcj");
            return (Criteria) this;
        }

        public Criteria andLilrcjNotBetween(Integer value1, Integer value2) {
            addCriterion("LILRCJ not between", value1, value2, "lilrcj");
            return (Criteria) this;
        }

        public Criteria andLipqohIsNull() {
            addCriterion("LIPQOH is null");
            return (Criteria) this;
        }

        public Criteria andLipqohIsNotNull() {
            addCriterion("LIPQOH is not null");
            return (Criteria) this;
        }

        public Criteria andLipqohEqualTo(Long value) {
            addCriterion("LIPQOH =", value, "lipqoh");
            return (Criteria) this;
        }

        public Criteria andLipqohNotEqualTo(Long value) {
            addCriterion("LIPQOH <>", value, "lipqoh");
            return (Criteria) this;
        }

        public Criteria andLipqohGreaterThan(Long value) {
            addCriterion("LIPQOH >", value, "lipqoh");
            return (Criteria) this;
        }

        public Criteria andLipqohGreaterThanOrEqualTo(Long value) {
            addCriterion("LIPQOH >=", value, "lipqoh");
            return (Criteria) this;
        }

        public Criteria andLipqohLessThan(Long value) {
            addCriterion("LIPQOH <", value, "lipqoh");
            return (Criteria) this;
        }

        public Criteria andLipqohLessThanOrEqualTo(Long value) {
            addCriterion("LIPQOH <=", value, "lipqoh");
            return (Criteria) this;
        }

        public Criteria andLipqohIn(List<Long> values) {
            addCriterion("LIPQOH in", values, "lipqoh");
            return (Criteria) this;
        }

        public Criteria andLipqohNotIn(List<Long> values) {
            addCriterion("LIPQOH not in", values, "lipqoh");
            return (Criteria) this;
        }

        public Criteria andLipqohBetween(Long value1, Long value2) {
            addCriterion("LIPQOH between", value1, value2, "lipqoh");
            return (Criteria) this;
        }

        public Criteria andLipqohNotBetween(Long value1, Long value2) {
            addCriterion("LIPQOH not between", value1, value2, "lipqoh");
            return (Criteria) this;
        }

        public Criteria andLipbckIsNull() {
            addCriterion("LIPBCK is null");
            return (Criteria) this;
        }

        public Criteria andLipbckIsNotNull() {
            addCriterion("LIPBCK is not null");
            return (Criteria) this;
        }

        public Criteria andLipbckEqualTo(Long value) {
            addCriterion("LIPBCK =", value, "lipbck");
            return (Criteria) this;
        }

        public Criteria andLipbckNotEqualTo(Long value) {
            addCriterion("LIPBCK <>", value, "lipbck");
            return (Criteria) this;
        }

        public Criteria andLipbckGreaterThan(Long value) {
            addCriterion("LIPBCK >", value, "lipbck");
            return (Criteria) this;
        }

        public Criteria andLipbckGreaterThanOrEqualTo(Long value) {
            addCriterion("LIPBCK >=", value, "lipbck");
            return (Criteria) this;
        }

        public Criteria andLipbckLessThan(Long value) {
            addCriterion("LIPBCK <", value, "lipbck");
            return (Criteria) this;
        }

        public Criteria andLipbckLessThanOrEqualTo(Long value) {
            addCriterion("LIPBCK <=", value, "lipbck");
            return (Criteria) this;
        }

        public Criteria andLipbckIn(List<Long> values) {
            addCriterion("LIPBCK in", values, "lipbck");
            return (Criteria) this;
        }

        public Criteria andLipbckNotIn(List<Long> values) {
            addCriterion("LIPBCK not in", values, "lipbck");
            return (Criteria) this;
        }

        public Criteria andLipbckBetween(Long value1, Long value2) {
            addCriterion("LIPBCK between", value1, value2, "lipbck");
            return (Criteria) this;
        }

        public Criteria andLipbckNotBetween(Long value1, Long value2) {
            addCriterion("LIPBCK not between", value1, value2, "lipbck");
            return (Criteria) this;
        }

        public Criteria andLipreqIsNull() {
            addCriterion("LIPREQ is null");
            return (Criteria) this;
        }

        public Criteria andLipreqIsNotNull() {
            addCriterion("LIPREQ is not null");
            return (Criteria) this;
        }

        public Criteria andLipreqEqualTo(Long value) {
            addCriterion("LIPREQ =", value, "lipreq");
            return (Criteria) this;
        }

        public Criteria andLipreqNotEqualTo(Long value) {
            addCriterion("LIPREQ <>", value, "lipreq");
            return (Criteria) this;
        }

        public Criteria andLipreqGreaterThan(Long value) {
            addCriterion("LIPREQ >", value, "lipreq");
            return (Criteria) this;
        }

        public Criteria andLipreqGreaterThanOrEqualTo(Long value) {
            addCriterion("LIPREQ >=", value, "lipreq");
            return (Criteria) this;
        }

        public Criteria andLipreqLessThan(Long value) {
            addCriterion("LIPREQ <", value, "lipreq");
            return (Criteria) this;
        }

        public Criteria andLipreqLessThanOrEqualTo(Long value) {
            addCriterion("LIPREQ <=", value, "lipreq");
            return (Criteria) this;
        }

        public Criteria andLipreqIn(List<Long> values) {
            addCriterion("LIPREQ in", values, "lipreq");
            return (Criteria) this;
        }

        public Criteria andLipreqNotIn(List<Long> values) {
            addCriterion("LIPREQ not in", values, "lipreq");
            return (Criteria) this;
        }

        public Criteria andLipreqBetween(Long value1, Long value2) {
            addCriterion("LIPREQ between", value1, value2, "lipreq");
            return (Criteria) this;
        }

        public Criteria andLipreqNotBetween(Long value1, Long value2) {
            addCriterion("LIPREQ not between", value1, value2, "lipreq");
            return (Criteria) this;
        }

        public Criteria andLiqwboIsNull() {
            addCriterion("LIQWBO is null");
            return (Criteria) this;
        }

        public Criteria andLiqwboIsNotNull() {
            addCriterion("LIQWBO is not null");
            return (Criteria) this;
        }

        public Criteria andLiqwboEqualTo(Long value) {
            addCriterion("LIQWBO =", value, "liqwbo");
            return (Criteria) this;
        }

        public Criteria andLiqwboNotEqualTo(Long value) {
            addCriterion("LIQWBO <>", value, "liqwbo");
            return (Criteria) this;
        }

        public Criteria andLiqwboGreaterThan(Long value) {
            addCriterion("LIQWBO >", value, "liqwbo");
            return (Criteria) this;
        }

        public Criteria andLiqwboGreaterThanOrEqualTo(Long value) {
            addCriterion("LIQWBO >=", value, "liqwbo");
            return (Criteria) this;
        }

        public Criteria andLiqwboLessThan(Long value) {
            addCriterion("LIQWBO <", value, "liqwbo");
            return (Criteria) this;
        }

        public Criteria andLiqwboLessThanOrEqualTo(Long value) {
            addCriterion("LIQWBO <=", value, "liqwbo");
            return (Criteria) this;
        }

        public Criteria andLiqwboIn(List<Long> values) {
            addCriterion("LIQWBO in", values, "liqwbo");
            return (Criteria) this;
        }

        public Criteria andLiqwboNotIn(List<Long> values) {
            addCriterion("LIQWBO not in", values, "liqwbo");
            return (Criteria) this;
        }

        public Criteria andLiqwboBetween(Long value1, Long value2) {
            addCriterion("LIQWBO between", value1, value2, "liqwbo");
            return (Criteria) this;
        }

        public Criteria andLiqwboNotBetween(Long value1, Long value2) {
            addCriterion("LIQWBO not between", value1, value2, "liqwbo");
            return (Criteria) this;
        }

        public Criteria andLiot1pIsNull() {
            addCriterion("LIOT1P is null");
            return (Criteria) this;
        }

        public Criteria andLiot1pIsNotNull() {
            addCriterion("LIOT1P is not null");
            return (Criteria) this;
        }

        public Criteria andLiot1pEqualTo(Long value) {
            addCriterion("LIOT1P =", value, "liot1p");
            return (Criteria) this;
        }

        public Criteria andLiot1pNotEqualTo(Long value) {
            addCriterion("LIOT1P <>", value, "liot1p");
            return (Criteria) this;
        }

        public Criteria andLiot1pGreaterThan(Long value) {
            addCriterion("LIOT1P >", value, "liot1p");
            return (Criteria) this;
        }

        public Criteria andLiot1pGreaterThanOrEqualTo(Long value) {
            addCriterion("LIOT1P >=", value, "liot1p");
            return (Criteria) this;
        }

        public Criteria andLiot1pLessThan(Long value) {
            addCriterion("LIOT1P <", value, "liot1p");
            return (Criteria) this;
        }

        public Criteria andLiot1pLessThanOrEqualTo(Long value) {
            addCriterion("LIOT1P <=", value, "liot1p");
            return (Criteria) this;
        }

        public Criteria andLiot1pIn(List<Long> values) {
            addCriterion("LIOT1P in", values, "liot1p");
            return (Criteria) this;
        }

        public Criteria andLiot1pNotIn(List<Long> values) {
            addCriterion("LIOT1P not in", values, "liot1p");
            return (Criteria) this;
        }

        public Criteria andLiot1pBetween(Long value1, Long value2) {
            addCriterion("LIOT1P between", value1, value2, "liot1p");
            return (Criteria) this;
        }

        public Criteria andLiot1pNotBetween(Long value1, Long value2) {
            addCriterion("LIOT1P not between", value1, value2, "liot1p");
            return (Criteria) this;
        }

        public Criteria andLiot2pIsNull() {
            addCriterion("LIOT2P is null");
            return (Criteria) this;
        }

        public Criteria andLiot2pIsNotNull() {
            addCriterion("LIOT2P is not null");
            return (Criteria) this;
        }

        public Criteria andLiot2pEqualTo(Long value) {
            addCriterion("LIOT2P =", value, "liot2p");
            return (Criteria) this;
        }

        public Criteria andLiot2pNotEqualTo(Long value) {
            addCriterion("LIOT2P <>", value, "liot2p");
            return (Criteria) this;
        }

        public Criteria andLiot2pGreaterThan(Long value) {
            addCriterion("LIOT2P >", value, "liot2p");
            return (Criteria) this;
        }

        public Criteria andLiot2pGreaterThanOrEqualTo(Long value) {
            addCriterion("LIOT2P >=", value, "liot2p");
            return (Criteria) this;
        }

        public Criteria andLiot2pLessThan(Long value) {
            addCriterion("LIOT2P <", value, "liot2p");
            return (Criteria) this;
        }

        public Criteria andLiot2pLessThanOrEqualTo(Long value) {
            addCriterion("LIOT2P <=", value, "liot2p");
            return (Criteria) this;
        }

        public Criteria andLiot2pIn(List<Long> values) {
            addCriterion("LIOT2P in", values, "liot2p");
            return (Criteria) this;
        }

        public Criteria andLiot2pNotIn(List<Long> values) {
            addCriterion("LIOT2P not in", values, "liot2p");
            return (Criteria) this;
        }

        public Criteria andLiot2pBetween(Long value1, Long value2) {
            addCriterion("LIOT2P between", value1, value2, "liot2p");
            return (Criteria) this;
        }

        public Criteria andLiot2pNotBetween(Long value1, Long value2) {
            addCriterion("LIOT2P not between", value1, value2, "liot2p");
            return (Criteria) this;
        }

        public Criteria andLiot1aIsNull() {
            addCriterion("LIOT1A is null");
            return (Criteria) this;
        }

        public Criteria andLiot1aIsNotNull() {
            addCriterion("LIOT1A is not null");
            return (Criteria) this;
        }

        public Criteria andLiot1aEqualTo(Long value) {
            addCriterion("LIOT1A =", value, "liot1a");
            return (Criteria) this;
        }

        public Criteria andLiot1aNotEqualTo(Long value) {
            addCriterion("LIOT1A <>", value, "liot1a");
            return (Criteria) this;
        }

        public Criteria andLiot1aGreaterThan(Long value) {
            addCriterion("LIOT1A >", value, "liot1a");
            return (Criteria) this;
        }

        public Criteria andLiot1aGreaterThanOrEqualTo(Long value) {
            addCriterion("LIOT1A >=", value, "liot1a");
            return (Criteria) this;
        }

        public Criteria andLiot1aLessThan(Long value) {
            addCriterion("LIOT1A <", value, "liot1a");
            return (Criteria) this;
        }

        public Criteria andLiot1aLessThanOrEqualTo(Long value) {
            addCriterion("LIOT1A <=", value, "liot1a");
            return (Criteria) this;
        }

        public Criteria andLiot1aIn(List<Long> values) {
            addCriterion("LIOT1A in", values, "liot1a");
            return (Criteria) this;
        }

        public Criteria andLiot1aNotIn(List<Long> values) {
            addCriterion("LIOT1A not in", values, "liot1a");
            return (Criteria) this;
        }

        public Criteria andLiot1aBetween(Long value1, Long value2) {
            addCriterion("LIOT1A between", value1, value2, "liot1a");
            return (Criteria) this;
        }

        public Criteria andLiot1aNotBetween(Long value1, Long value2) {
            addCriterion("LIOT1A not between", value1, value2, "liot1a");
            return (Criteria) this;
        }

        public Criteria andLihcomIsNull() {
            addCriterion("LIHCOM is null");
            return (Criteria) this;
        }

        public Criteria andLihcomIsNotNull() {
            addCriterion("LIHCOM is not null");
            return (Criteria) this;
        }

        public Criteria andLihcomEqualTo(Long value) {
            addCriterion("LIHCOM =", value, "lihcom");
            return (Criteria) this;
        }

        public Criteria andLihcomNotEqualTo(Long value) {
            addCriterion("LIHCOM <>", value, "lihcom");
            return (Criteria) this;
        }

        public Criteria andLihcomGreaterThan(Long value) {
            addCriterion("LIHCOM >", value, "lihcom");
            return (Criteria) this;
        }

        public Criteria andLihcomGreaterThanOrEqualTo(Long value) {
            addCriterion("LIHCOM >=", value, "lihcom");
            return (Criteria) this;
        }

        public Criteria andLihcomLessThan(Long value) {
            addCriterion("LIHCOM <", value, "lihcom");
            return (Criteria) this;
        }

        public Criteria andLihcomLessThanOrEqualTo(Long value) {
            addCriterion("LIHCOM <=", value, "lihcom");
            return (Criteria) this;
        }

        public Criteria andLihcomIn(List<Long> values) {
            addCriterion("LIHCOM in", values, "lihcom");
            return (Criteria) this;
        }

        public Criteria andLihcomNotIn(List<Long> values) {
            addCriterion("LIHCOM not in", values, "lihcom");
            return (Criteria) this;
        }

        public Criteria andLihcomBetween(Long value1, Long value2) {
            addCriterion("LIHCOM between", value1, value2, "lihcom");
            return (Criteria) this;
        }

        public Criteria andLihcomNotBetween(Long value1, Long value2) {
            addCriterion("LIHCOM not between", value1, value2, "lihcom");
            return (Criteria) this;
        }

        public Criteria andLipcomIsNull() {
            addCriterion("LIPCOM is null");
            return (Criteria) this;
        }

        public Criteria andLipcomIsNotNull() {
            addCriterion("LIPCOM is not null");
            return (Criteria) this;
        }

        public Criteria andLipcomEqualTo(Long value) {
            addCriterion("LIPCOM =", value, "lipcom");
            return (Criteria) this;
        }

        public Criteria andLipcomNotEqualTo(Long value) {
            addCriterion("LIPCOM <>", value, "lipcom");
            return (Criteria) this;
        }

        public Criteria andLipcomGreaterThan(Long value) {
            addCriterion("LIPCOM >", value, "lipcom");
            return (Criteria) this;
        }

        public Criteria andLipcomGreaterThanOrEqualTo(Long value) {
            addCriterion("LIPCOM >=", value, "lipcom");
            return (Criteria) this;
        }

        public Criteria andLipcomLessThan(Long value) {
            addCriterion("LIPCOM <", value, "lipcom");
            return (Criteria) this;
        }

        public Criteria andLipcomLessThanOrEqualTo(Long value) {
            addCriterion("LIPCOM <=", value, "lipcom");
            return (Criteria) this;
        }

        public Criteria andLipcomIn(List<Long> values) {
            addCriterion("LIPCOM in", values, "lipcom");
            return (Criteria) this;
        }

        public Criteria andLipcomNotIn(List<Long> values) {
            addCriterion("LIPCOM not in", values, "lipcom");
            return (Criteria) this;
        }

        public Criteria andLipcomBetween(Long value1, Long value2) {
            addCriterion("LIPCOM between", value1, value2, "lipcom");
            return (Criteria) this;
        }

        public Criteria andLipcomNotBetween(Long value1, Long value2) {
            addCriterion("LIPCOM not between", value1, value2, "lipcom");
            return (Criteria) this;
        }

        public Criteria andLifcomIsNull() {
            addCriterion("LIFCOM is null");
            return (Criteria) this;
        }

        public Criteria andLifcomIsNotNull() {
            addCriterion("LIFCOM is not null");
            return (Criteria) this;
        }

        public Criteria andLifcomEqualTo(Long value) {
            addCriterion("LIFCOM =", value, "lifcom");
            return (Criteria) this;
        }

        public Criteria andLifcomNotEqualTo(Long value) {
            addCriterion("LIFCOM <>", value, "lifcom");
            return (Criteria) this;
        }

        public Criteria andLifcomGreaterThan(Long value) {
            addCriterion("LIFCOM >", value, "lifcom");
            return (Criteria) this;
        }

        public Criteria andLifcomGreaterThanOrEqualTo(Long value) {
            addCriterion("LIFCOM >=", value, "lifcom");
            return (Criteria) this;
        }

        public Criteria andLifcomLessThan(Long value) {
            addCriterion("LIFCOM <", value, "lifcom");
            return (Criteria) this;
        }

        public Criteria andLifcomLessThanOrEqualTo(Long value) {
            addCriterion("LIFCOM <=", value, "lifcom");
            return (Criteria) this;
        }

        public Criteria andLifcomIn(List<Long> values) {
            addCriterion("LIFCOM in", values, "lifcom");
            return (Criteria) this;
        }

        public Criteria andLifcomNotIn(List<Long> values) {
            addCriterion("LIFCOM not in", values, "lifcom");
            return (Criteria) this;
        }

        public Criteria andLifcomBetween(Long value1, Long value2) {
            addCriterion("LIFCOM between", value1, value2, "lifcom");
            return (Criteria) this;
        }

        public Criteria andLifcomNotBetween(Long value1, Long value2) {
            addCriterion("LIFCOM not between", value1, value2, "lifcom");
            return (Criteria) this;
        }

        public Criteria andLifun1IsNull() {
            addCriterion("LIFUN1 is null");
            return (Criteria) this;
        }

        public Criteria andLifun1IsNotNull() {
            addCriterion("LIFUN1 is not null");
            return (Criteria) this;
        }

        public Criteria andLifun1EqualTo(Long value) {
            addCriterion("LIFUN1 =", value, "lifun1");
            return (Criteria) this;
        }

        public Criteria andLifun1NotEqualTo(Long value) {
            addCriterion("LIFUN1 <>", value, "lifun1");
            return (Criteria) this;
        }

        public Criteria andLifun1GreaterThan(Long value) {
            addCriterion("LIFUN1 >", value, "lifun1");
            return (Criteria) this;
        }

        public Criteria andLifun1GreaterThanOrEqualTo(Long value) {
            addCriterion("LIFUN1 >=", value, "lifun1");
            return (Criteria) this;
        }

        public Criteria andLifun1LessThan(Long value) {
            addCriterion("LIFUN1 <", value, "lifun1");
            return (Criteria) this;
        }

        public Criteria andLifun1LessThanOrEqualTo(Long value) {
            addCriterion("LIFUN1 <=", value, "lifun1");
            return (Criteria) this;
        }

        public Criteria andLifun1In(List<Long> values) {
            addCriterion("LIFUN1 in", values, "lifun1");
            return (Criteria) this;
        }

        public Criteria andLifun1NotIn(List<Long> values) {
            addCriterion("LIFUN1 not in", values, "lifun1");
            return (Criteria) this;
        }

        public Criteria andLifun1Between(Long value1, Long value2) {
            addCriterion("LIFUN1 between", value1, value2, "lifun1");
            return (Criteria) this;
        }

        public Criteria andLifun1NotBetween(Long value1, Long value2) {
            addCriterion("LIFUN1 not between", value1, value2, "lifun1");
            return (Criteria) this;
        }

        public Criteria andLiqowoIsNull() {
            addCriterion("LIQOWO is null");
            return (Criteria) this;
        }

        public Criteria andLiqowoIsNotNull() {
            addCriterion("LIQOWO is not null");
            return (Criteria) this;
        }

        public Criteria andLiqowoEqualTo(Long value) {
            addCriterion("LIQOWO =", value, "liqowo");
            return (Criteria) this;
        }

        public Criteria andLiqowoNotEqualTo(Long value) {
            addCriterion("LIQOWO <>", value, "liqowo");
            return (Criteria) this;
        }

        public Criteria andLiqowoGreaterThan(Long value) {
            addCriterion("LIQOWO >", value, "liqowo");
            return (Criteria) this;
        }

        public Criteria andLiqowoGreaterThanOrEqualTo(Long value) {
            addCriterion("LIQOWO >=", value, "liqowo");
            return (Criteria) this;
        }

        public Criteria andLiqowoLessThan(Long value) {
            addCriterion("LIQOWO <", value, "liqowo");
            return (Criteria) this;
        }

        public Criteria andLiqowoLessThanOrEqualTo(Long value) {
            addCriterion("LIQOWO <=", value, "liqowo");
            return (Criteria) this;
        }

        public Criteria andLiqowoIn(List<Long> values) {
            addCriterion("LIQOWO in", values, "liqowo");
            return (Criteria) this;
        }

        public Criteria andLiqowoNotIn(List<Long> values) {
            addCriterion("LIQOWO not in", values, "liqowo");
            return (Criteria) this;
        }

        public Criteria andLiqowoBetween(Long value1, Long value2) {
            addCriterion("LIQOWO between", value1, value2, "liqowo");
            return (Criteria) this;
        }

        public Criteria andLiqowoNotBetween(Long value1, Long value2) {
            addCriterion("LIQOWO not between", value1, value2, "liqowo");
            return (Criteria) this;
        }

        public Criteria andLiqttrIsNull() {
            addCriterion("LIQTTR is null");
            return (Criteria) this;
        }

        public Criteria andLiqttrIsNotNull() {
            addCriterion("LIQTTR is not null");
            return (Criteria) this;
        }

        public Criteria andLiqttrEqualTo(Long value) {
            addCriterion("LIQTTR =", value, "liqttr");
            return (Criteria) this;
        }

        public Criteria andLiqttrNotEqualTo(Long value) {
            addCriterion("LIQTTR <>", value, "liqttr");
            return (Criteria) this;
        }

        public Criteria andLiqttrGreaterThan(Long value) {
            addCriterion("LIQTTR >", value, "liqttr");
            return (Criteria) this;
        }

        public Criteria andLiqttrGreaterThanOrEqualTo(Long value) {
            addCriterion("LIQTTR >=", value, "liqttr");
            return (Criteria) this;
        }

        public Criteria andLiqttrLessThan(Long value) {
            addCriterion("LIQTTR <", value, "liqttr");
            return (Criteria) this;
        }

        public Criteria andLiqttrLessThanOrEqualTo(Long value) {
            addCriterion("LIQTTR <=", value, "liqttr");
            return (Criteria) this;
        }

        public Criteria andLiqttrIn(List<Long> values) {
            addCriterion("LIQTTR in", values, "liqttr");
            return (Criteria) this;
        }

        public Criteria andLiqttrNotIn(List<Long> values) {
            addCriterion("LIQTTR not in", values, "liqttr");
            return (Criteria) this;
        }

        public Criteria andLiqttrBetween(Long value1, Long value2) {
            addCriterion("LIQTTR between", value1, value2, "liqttr");
            return (Criteria) this;
        }

        public Criteria andLiqttrNotBetween(Long value1, Long value2) {
            addCriterion("LIQTTR not between", value1, value2, "liqttr");
            return (Criteria) this;
        }

        public Criteria andLiqtinIsNull() {
            addCriterion("LIQTIN is null");
            return (Criteria) this;
        }

        public Criteria andLiqtinIsNotNull() {
            addCriterion("LIQTIN is not null");
            return (Criteria) this;
        }

        public Criteria andLiqtinEqualTo(Long value) {
            addCriterion("LIQTIN =", value, "liqtin");
            return (Criteria) this;
        }

        public Criteria andLiqtinNotEqualTo(Long value) {
            addCriterion("LIQTIN <>", value, "liqtin");
            return (Criteria) this;
        }

        public Criteria andLiqtinGreaterThan(Long value) {
            addCriterion("LIQTIN >", value, "liqtin");
            return (Criteria) this;
        }

        public Criteria andLiqtinGreaterThanOrEqualTo(Long value) {
            addCriterion("LIQTIN >=", value, "liqtin");
            return (Criteria) this;
        }

        public Criteria andLiqtinLessThan(Long value) {
            addCriterion("LIQTIN <", value, "liqtin");
            return (Criteria) this;
        }

        public Criteria andLiqtinLessThanOrEqualTo(Long value) {
            addCriterion("LIQTIN <=", value, "liqtin");
            return (Criteria) this;
        }

        public Criteria andLiqtinIn(List<Long> values) {
            addCriterion("LIQTIN in", values, "liqtin");
            return (Criteria) this;
        }

        public Criteria andLiqtinNotIn(List<Long> values) {
            addCriterion("LIQTIN not in", values, "liqtin");
            return (Criteria) this;
        }

        public Criteria andLiqtinBetween(Long value1, Long value2) {
            addCriterion("LIQTIN between", value1, value2, "liqtin");
            return (Criteria) this;
        }

        public Criteria andLiqtinNotBetween(Long value1, Long value2) {
            addCriterion("LIQTIN not between", value1, value2, "liqtin");
            return (Criteria) this;
        }

        public Criteria andLiqonlIsNull() {
            addCriterion("LIQONL is null");
            return (Criteria) this;
        }

        public Criteria andLiqonlIsNotNull() {
            addCriterion("LIQONL is not null");
            return (Criteria) this;
        }

        public Criteria andLiqonlEqualTo(Long value) {
            addCriterion("LIQONL =", value, "liqonl");
            return (Criteria) this;
        }

        public Criteria andLiqonlNotEqualTo(Long value) {
            addCriterion("LIQONL <>", value, "liqonl");
            return (Criteria) this;
        }

        public Criteria andLiqonlGreaterThan(Long value) {
            addCriterion("LIQONL >", value, "liqonl");
            return (Criteria) this;
        }

        public Criteria andLiqonlGreaterThanOrEqualTo(Long value) {
            addCriterion("LIQONL >=", value, "liqonl");
            return (Criteria) this;
        }

        public Criteria andLiqonlLessThan(Long value) {
            addCriterion("LIQONL <", value, "liqonl");
            return (Criteria) this;
        }

        public Criteria andLiqonlLessThanOrEqualTo(Long value) {
            addCriterion("LIQONL <=", value, "liqonl");
            return (Criteria) this;
        }

        public Criteria andLiqonlIn(List<Long> values) {
            addCriterion("LIQONL in", values, "liqonl");
            return (Criteria) this;
        }

        public Criteria andLiqonlNotIn(List<Long> values) {
            addCriterion("LIQONL not in", values, "liqonl");
            return (Criteria) this;
        }

        public Criteria andLiqonlBetween(Long value1, Long value2) {
            addCriterion("LIQONL between", value1, value2, "liqonl");
            return (Criteria) this;
        }

        public Criteria andLiqonlNotBetween(Long value1, Long value2) {
            addCriterion("LIQONL not between", value1, value2, "liqonl");
            return (Criteria) this;
        }

        public Criteria andLiqtriIsNull() {
            addCriterion("LIQTRI is null");
            return (Criteria) this;
        }

        public Criteria andLiqtriIsNotNull() {
            addCriterion("LIQTRI is not null");
            return (Criteria) this;
        }

        public Criteria andLiqtriEqualTo(Long value) {
            addCriterion("LIQTRI =", value, "liqtri");
            return (Criteria) this;
        }

        public Criteria andLiqtriNotEqualTo(Long value) {
            addCriterion("LIQTRI <>", value, "liqtri");
            return (Criteria) this;
        }

        public Criteria andLiqtriGreaterThan(Long value) {
            addCriterion("LIQTRI >", value, "liqtri");
            return (Criteria) this;
        }

        public Criteria andLiqtriGreaterThanOrEqualTo(Long value) {
            addCriterion("LIQTRI >=", value, "liqtri");
            return (Criteria) this;
        }

        public Criteria andLiqtriLessThan(Long value) {
            addCriterion("LIQTRI <", value, "liqtri");
            return (Criteria) this;
        }

        public Criteria andLiqtriLessThanOrEqualTo(Long value) {
            addCriterion("LIQTRI <=", value, "liqtri");
            return (Criteria) this;
        }

        public Criteria andLiqtriIn(List<Long> values) {
            addCriterion("LIQTRI in", values, "liqtri");
            return (Criteria) this;
        }

        public Criteria andLiqtriNotIn(List<Long> values) {
            addCriterion("LIQTRI not in", values, "liqtri");
            return (Criteria) this;
        }

        public Criteria andLiqtriBetween(Long value1, Long value2) {
            addCriterion("LIQTRI between", value1, value2, "liqtri");
            return (Criteria) this;
        }

        public Criteria andLiqtriNotBetween(Long value1, Long value2) {
            addCriterion("LIQTRI not between", value1, value2, "liqtri");
            return (Criteria) this;
        }

        public Criteria andLiqtroIsNull() {
            addCriterion("LIQTRO is null");
            return (Criteria) this;
        }

        public Criteria andLiqtroIsNotNull() {
            addCriterion("LIQTRO is not null");
            return (Criteria) this;
        }

        public Criteria andLiqtroEqualTo(Long value) {
            addCriterion("LIQTRO =", value, "liqtro");
            return (Criteria) this;
        }

        public Criteria andLiqtroNotEqualTo(Long value) {
            addCriterion("LIQTRO <>", value, "liqtro");
            return (Criteria) this;
        }

        public Criteria andLiqtroGreaterThan(Long value) {
            addCriterion("LIQTRO >", value, "liqtro");
            return (Criteria) this;
        }

        public Criteria andLiqtroGreaterThanOrEqualTo(Long value) {
            addCriterion("LIQTRO >=", value, "liqtro");
            return (Criteria) this;
        }

        public Criteria andLiqtroLessThan(Long value) {
            addCriterion("LIQTRO <", value, "liqtro");
            return (Criteria) this;
        }

        public Criteria andLiqtroLessThanOrEqualTo(Long value) {
            addCriterion("LIQTRO <=", value, "liqtro");
            return (Criteria) this;
        }

        public Criteria andLiqtroIn(List<Long> values) {
            addCriterion("LIQTRO in", values, "liqtro");
            return (Criteria) this;
        }

        public Criteria andLiqtroNotIn(List<Long> values) {
            addCriterion("LIQTRO not in", values, "liqtro");
            return (Criteria) this;
        }

        public Criteria andLiqtroBetween(Long value1, Long value2) {
            addCriterion("LIQTRO between", value1, value2, "liqtro");
            return (Criteria) this;
        }

        public Criteria andLiqtroNotBetween(Long value1, Long value2) {
            addCriterion("LIQTRO not between", value1, value2, "liqtro");
            return (Criteria) this;
        }

        public Criteria andLincdjIsNull() {
            addCriterion("LINCDJ is null");
            return (Criteria) this;
        }

        public Criteria andLincdjIsNotNull() {
            addCriterion("LINCDJ is not null");
            return (Criteria) this;
        }

        public Criteria andLincdjEqualTo(Integer value) {
            addCriterion("LINCDJ =", value, "lincdj");
            return (Criteria) this;
        }

        public Criteria andLincdjNotEqualTo(Integer value) {
            addCriterion("LINCDJ <>", value, "lincdj");
            return (Criteria) this;
        }

        public Criteria andLincdjGreaterThan(Integer value) {
            addCriterion("LINCDJ >", value, "lincdj");
            return (Criteria) this;
        }

        public Criteria andLincdjGreaterThanOrEqualTo(Integer value) {
            addCriterion("LINCDJ >=", value, "lincdj");
            return (Criteria) this;
        }

        public Criteria andLincdjLessThan(Integer value) {
            addCriterion("LINCDJ <", value, "lincdj");
            return (Criteria) this;
        }

        public Criteria andLincdjLessThanOrEqualTo(Integer value) {
            addCriterion("LINCDJ <=", value, "lincdj");
            return (Criteria) this;
        }

        public Criteria andLincdjIn(List<Integer> values) {
            addCriterion("LINCDJ in", values, "lincdj");
            return (Criteria) this;
        }

        public Criteria andLincdjNotIn(List<Integer> values) {
            addCriterion("LINCDJ not in", values, "lincdj");
            return (Criteria) this;
        }

        public Criteria andLincdjBetween(Integer value1, Integer value2) {
            addCriterion("LINCDJ between", value1, value2, "lincdj");
            return (Criteria) this;
        }

        public Criteria andLincdjNotBetween(Integer value1, Integer value2) {
            addCriterion("LINCDJ not between", value1, value2, "lincdj");
            return (Criteria) this;
        }

        public Criteria andLiqty1IsNull() {
            addCriterion("LIQTY1 is null");
            return (Criteria) this;
        }

        public Criteria andLiqty1IsNotNull() {
            addCriterion("LIQTY1 is not null");
            return (Criteria) this;
        }

        public Criteria andLiqty1EqualTo(Long value) {
            addCriterion("LIQTY1 =", value, "liqty1");
            return (Criteria) this;
        }

        public Criteria andLiqty1NotEqualTo(Long value) {
            addCriterion("LIQTY1 <>", value, "liqty1");
            return (Criteria) this;
        }

        public Criteria andLiqty1GreaterThan(Long value) {
            addCriterion("LIQTY1 >", value, "liqty1");
            return (Criteria) this;
        }

        public Criteria andLiqty1GreaterThanOrEqualTo(Long value) {
            addCriterion("LIQTY1 >=", value, "liqty1");
            return (Criteria) this;
        }

        public Criteria andLiqty1LessThan(Long value) {
            addCriterion("LIQTY1 <", value, "liqty1");
            return (Criteria) this;
        }

        public Criteria andLiqty1LessThanOrEqualTo(Long value) {
            addCriterion("LIQTY1 <=", value, "liqty1");
            return (Criteria) this;
        }

        public Criteria andLiqty1In(List<Long> values) {
            addCriterion("LIQTY1 in", values, "liqty1");
            return (Criteria) this;
        }

        public Criteria andLiqty1NotIn(List<Long> values) {
            addCriterion("LIQTY1 not in", values, "liqty1");
            return (Criteria) this;
        }

        public Criteria andLiqty1Between(Long value1, Long value2) {
            addCriterion("LIQTY1 between", value1, value2, "liqty1");
            return (Criteria) this;
        }

        public Criteria andLiqty1NotBetween(Long value1, Long value2) {
            addCriterion("LIQTY1 not between", value1, value2, "liqty1");
            return (Criteria) this;
        }

        public Criteria andLiqty2IsNull() {
            addCriterion("LIQTY2 is null");
            return (Criteria) this;
        }

        public Criteria andLiqty2IsNotNull() {
            addCriterion("LIQTY2 is not null");
            return (Criteria) this;
        }

        public Criteria andLiqty2EqualTo(Long value) {
            addCriterion("LIQTY2 =", value, "liqty2");
            return (Criteria) this;
        }

        public Criteria andLiqty2NotEqualTo(Long value) {
            addCriterion("LIQTY2 <>", value, "liqty2");
            return (Criteria) this;
        }

        public Criteria andLiqty2GreaterThan(Long value) {
            addCriterion("LIQTY2 >", value, "liqty2");
            return (Criteria) this;
        }

        public Criteria andLiqty2GreaterThanOrEqualTo(Long value) {
            addCriterion("LIQTY2 >=", value, "liqty2");
            return (Criteria) this;
        }

        public Criteria andLiqty2LessThan(Long value) {
            addCriterion("LIQTY2 <", value, "liqty2");
            return (Criteria) this;
        }

        public Criteria andLiqty2LessThanOrEqualTo(Long value) {
            addCriterion("LIQTY2 <=", value, "liqty2");
            return (Criteria) this;
        }

        public Criteria andLiqty2In(List<Long> values) {
            addCriterion("LIQTY2 in", values, "liqty2");
            return (Criteria) this;
        }

        public Criteria andLiqty2NotIn(List<Long> values) {
            addCriterion("LIQTY2 not in", values, "liqty2");
            return (Criteria) this;
        }

        public Criteria andLiqty2Between(Long value1, Long value2) {
            addCriterion("LIQTY2 between", value1, value2, "liqty2");
            return (Criteria) this;
        }

        public Criteria andLiqty2NotBetween(Long value1, Long value2) {
            addCriterion("LIQTY2 not between", value1, value2, "liqty2");
            return (Criteria) this;
        }

        public Criteria andLiurabIsNull() {
            addCriterion("LIURAB is null");
            return (Criteria) this;
        }

        public Criteria andLiurabIsNotNull() {
            addCriterion("LIURAB is not null");
            return (Criteria) this;
        }

        public Criteria andLiurabEqualTo(Integer value) {
            addCriterion("LIURAB =", value, "liurab");
            return (Criteria) this;
        }

        public Criteria andLiurabNotEqualTo(Integer value) {
            addCriterion("LIURAB <>", value, "liurab");
            return (Criteria) this;
        }

        public Criteria andLiurabGreaterThan(Integer value) {
            addCriterion("LIURAB >", value, "liurab");
            return (Criteria) this;
        }

        public Criteria andLiurabGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIURAB >=", value, "liurab");
            return (Criteria) this;
        }

        public Criteria andLiurabLessThan(Integer value) {
            addCriterion("LIURAB <", value, "liurab");
            return (Criteria) this;
        }

        public Criteria andLiurabLessThanOrEqualTo(Integer value) {
            addCriterion("LIURAB <=", value, "liurab");
            return (Criteria) this;
        }

        public Criteria andLiurabIn(List<Integer> values) {
            addCriterion("LIURAB in", values, "liurab");
            return (Criteria) this;
        }

        public Criteria andLiurabNotIn(List<Integer> values) {
            addCriterion("LIURAB not in", values, "liurab");
            return (Criteria) this;
        }

        public Criteria andLiurabBetween(Integer value1, Integer value2) {
            addCriterion("LIURAB between", value1, value2, "liurab");
            return (Criteria) this;
        }

        public Criteria andLiurabNotBetween(Integer value1, Integer value2) {
            addCriterion("LIURAB not between", value1, value2, "liurab");
            return (Criteria) this;
        }

        public Criteria andLiurrfIsNull() {
            addCriterion("LIURRF is null");
            return (Criteria) this;
        }

        public Criteria andLiurrfIsNotNull() {
            addCriterion("LIURRF is not null");
            return (Criteria) this;
        }

        public Criteria andLiurrfEqualTo(String value) {
            addCriterion("LIURRF =", value, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfNotEqualTo(String value) {
            addCriterion("LIURRF <>", value, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfGreaterThan(String value) {
            addCriterion("LIURRF >", value, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfGreaterThanOrEqualTo(String value) {
            addCriterion("LIURRF >=", value, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfLessThan(String value) {
            addCriterion("LIURRF <", value, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfLessThanOrEqualTo(String value) {
            addCriterion("LIURRF <=", value, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfLike(String value) {
            addCriterion("LIURRF like", value, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfNotLike(String value) {
            addCriterion("LIURRF not like", value, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfIn(List<String> values) {
            addCriterion("LIURRF in", values, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfNotIn(List<String> values) {
            addCriterion("LIURRF not in", values, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfBetween(String value1, String value2) {
            addCriterion("LIURRF between", value1, value2, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiurrfNotBetween(String value1, String value2) {
            addCriterion("LIURRF not between", value1, value2, "liurrf");
            return (Criteria) this;
        }

        public Criteria andLiuratIsNull() {
            addCriterion("LIURAT is null");
            return (Criteria) this;
        }

        public Criteria andLiuratIsNotNull() {
            addCriterion("LIURAT is not null");
            return (Criteria) this;
        }

        public Criteria andLiuratEqualTo(Long value) {
            addCriterion("LIURAT =", value, "liurat");
            return (Criteria) this;
        }

        public Criteria andLiuratNotEqualTo(Long value) {
            addCriterion("LIURAT <>", value, "liurat");
            return (Criteria) this;
        }

        public Criteria andLiuratGreaterThan(Long value) {
            addCriterion("LIURAT >", value, "liurat");
            return (Criteria) this;
        }

        public Criteria andLiuratGreaterThanOrEqualTo(Long value) {
            addCriterion("LIURAT >=", value, "liurat");
            return (Criteria) this;
        }

        public Criteria andLiuratLessThan(Long value) {
            addCriterion("LIURAT <", value, "liurat");
            return (Criteria) this;
        }

        public Criteria andLiuratLessThanOrEqualTo(Long value) {
            addCriterion("LIURAT <=", value, "liurat");
            return (Criteria) this;
        }

        public Criteria andLiuratIn(List<Long> values) {
            addCriterion("LIURAT in", values, "liurat");
            return (Criteria) this;
        }

        public Criteria andLiuratNotIn(List<Long> values) {
            addCriterion("LIURAT not in", values, "liurat");
            return (Criteria) this;
        }

        public Criteria andLiuratBetween(Long value1, Long value2) {
            addCriterion("LIURAT between", value1, value2, "liurat");
            return (Criteria) this;
        }

        public Criteria andLiuratNotBetween(Long value1, Long value2) {
            addCriterion("LIURAT not between", value1, value2, "liurat");
            return (Criteria) this;
        }

        public Criteria andLiurcdIsNull() {
            addCriterion("LIURCD is null");
            return (Criteria) this;
        }

        public Criteria andLiurcdIsNotNull() {
            addCriterion("LIURCD is not null");
            return (Criteria) this;
        }

        public Criteria andLiurcdEqualTo(String value) {
            addCriterion("LIURCD =", value, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdNotEqualTo(String value) {
            addCriterion("LIURCD <>", value, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdGreaterThan(String value) {
            addCriterion("LIURCD >", value, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdGreaterThanOrEqualTo(String value) {
            addCriterion("LIURCD >=", value, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdLessThan(String value) {
            addCriterion("LIURCD <", value, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdLessThanOrEqualTo(String value) {
            addCriterion("LIURCD <=", value, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdLike(String value) {
            addCriterion("LIURCD like", value, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdNotLike(String value) {
            addCriterion("LIURCD not like", value, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdIn(List<String> values) {
            addCriterion("LIURCD in", values, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdNotIn(List<String> values) {
            addCriterion("LIURCD not in", values, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdBetween(String value1, String value2) {
            addCriterion("LIURCD between", value1, value2, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLiurcdNotBetween(String value1, String value2) {
            addCriterion("LIURCD not between", value1, value2, "liurcd");
            return (Criteria) this;
        }

        public Criteria andLijobnIsNull() {
            addCriterion("LIJOBN is null");
            return (Criteria) this;
        }

        public Criteria andLijobnIsNotNull() {
            addCriterion("LIJOBN is not null");
            return (Criteria) this;
        }

        public Criteria andLijobnEqualTo(String value) {
            addCriterion("LIJOBN =", value, "lijobn");
            return (Criteria) this;
        }

        public Criteria andLijobnNotEqualTo(String value) {
            addCriterion("LIJOBN <>", value, "lijobn");
            return (Criteria) this;
        }

        public Criteria andLijobnGreaterThan(String value) {
            addCriterion("LIJOBN >", value, "lijobn");
            return (Criteria) this;
        }

        public Criteria andLijobnGreaterThanOrEqualTo(String value) {
            addCriterion("LIJOBN >=", value, "lijobn");
            return (Criteria) this;
        }

        public Criteria andLijobnLessThan(String value) {
            addCriterion("LIJOBN <", value, "lijobn");
            return (Criteria) this;
        }

        public Criteria andLijobnLessThanOrEqualTo(String value) {
            addCriterion("LIJOBN <=", value, "lijobn");
            return (Criteria) this;
        }

        public Criteria andLijobnLike(String value) {
            addCriterion("LIJOBN like", value, "lijobn");
            return (Criteria) this;
        }

        public Criteria andLijobnNotLike(String value) {
            addCriterion("LIJOBN not like", value, "lijobn");
            return (Criteria) this;
        }

        public Criteria andLijobnIn(List<String> values) {
            addCriterion("LIJOBN in", values, "lijobn");
            return (Criteria) this;
        }

        public Criteria andLijobnNotIn(List<String> values) {
            addCriterion("LIJOBN not in", values, "lijobn");
            return (Criteria) this;
        }

        public Criteria andLijobnBetween(String value1, String value2) {
            addCriterion("LIJOBN between", value1, value2, "lijobn");
            return (Criteria) this;
        }

        public Criteria andLijobnNotBetween(String value1, String value2) {
            addCriterion("LIJOBN not between", value1, value2, "lijobn");
            return (Criteria) this;
        }

        public Criteria andLipidIsNull() {
            addCriterion("LIPID is null");
            return (Criteria) this;
        }

        public Criteria andLipidIsNotNull() {
            addCriterion("LIPID is not null");
            return (Criteria) this;
        }

        public Criteria andLipidEqualTo(String value) {
            addCriterion("LIPID =", value, "lipid");
            return (Criteria) this;
        }

        public Criteria andLipidNotEqualTo(String value) {
            addCriterion("LIPID <>", value, "lipid");
            return (Criteria) this;
        }

        public Criteria andLipidGreaterThan(String value) {
            addCriterion("LIPID >", value, "lipid");
            return (Criteria) this;
        }

        public Criteria andLipidGreaterThanOrEqualTo(String value) {
            addCriterion("LIPID >=", value, "lipid");
            return (Criteria) this;
        }

        public Criteria andLipidLessThan(String value) {
            addCriterion("LIPID <", value, "lipid");
            return (Criteria) this;
        }

        public Criteria andLipidLessThanOrEqualTo(String value) {
            addCriterion("LIPID <=", value, "lipid");
            return (Criteria) this;
        }

        public Criteria andLipidLike(String value) {
            addCriterion("LIPID like", value, "lipid");
            return (Criteria) this;
        }

        public Criteria andLipidNotLike(String value) {
            addCriterion("LIPID not like", value, "lipid");
            return (Criteria) this;
        }

        public Criteria andLipidIn(List<String> values) {
            addCriterion("LIPID in", values, "lipid");
            return (Criteria) this;
        }

        public Criteria andLipidNotIn(List<String> values) {
            addCriterion("LIPID not in", values, "lipid");
            return (Criteria) this;
        }

        public Criteria andLipidBetween(String value1, String value2) {
            addCriterion("LIPID between", value1, value2, "lipid");
            return (Criteria) this;
        }

        public Criteria andLipidNotBetween(String value1, String value2) {
            addCriterion("LIPID not between", value1, value2, "lipid");
            return (Criteria) this;
        }

        public Criteria andLiupmjIsNull() {
            addCriterion("LIUPMJ is null");
            return (Criteria) this;
        }

        public Criteria andLiupmjIsNotNull() {
            addCriterion("LIUPMJ is not null");
            return (Criteria) this;
        }

        public Criteria andLiupmjEqualTo(Integer value) {
            addCriterion("LIUPMJ =", value, "liupmj");
            return (Criteria) this;
        }

        public Criteria andLiupmjNotEqualTo(Integer value) {
            addCriterion("LIUPMJ <>", value, "liupmj");
            return (Criteria) this;
        }

        public Criteria andLiupmjGreaterThan(Integer value) {
            addCriterion("LIUPMJ >", value, "liupmj");
            return (Criteria) this;
        }

        public Criteria andLiupmjGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIUPMJ >=", value, "liupmj");
            return (Criteria) this;
        }

        public Criteria andLiupmjLessThan(Integer value) {
            addCriterion("LIUPMJ <", value, "liupmj");
            return (Criteria) this;
        }

        public Criteria andLiupmjLessThanOrEqualTo(Integer value) {
            addCriterion("LIUPMJ <=", value, "liupmj");
            return (Criteria) this;
        }

        public Criteria andLiupmjIn(List<Integer> values) {
            addCriterion("LIUPMJ in", values, "liupmj");
            return (Criteria) this;
        }

        public Criteria andLiupmjNotIn(List<Integer> values) {
            addCriterion("LIUPMJ not in", values, "liupmj");
            return (Criteria) this;
        }

        public Criteria andLiupmjBetween(Integer value1, Integer value2) {
            addCriterion("LIUPMJ between", value1, value2, "liupmj");
            return (Criteria) this;
        }

        public Criteria andLiupmjNotBetween(Integer value1, Integer value2) {
            addCriterion("LIUPMJ not between", value1, value2, "liupmj");
            return (Criteria) this;
        }

        public Criteria andLiuserIsNull() {
            addCriterion("LIUSER is null");
            return (Criteria) this;
        }

        public Criteria andLiuserIsNotNull() {
            addCriterion("LIUSER is not null");
            return (Criteria) this;
        }

        public Criteria andLiuserEqualTo(String value) {
            addCriterion("LIUSER =", value, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserNotEqualTo(String value) {
            addCriterion("LIUSER <>", value, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserGreaterThan(String value) {
            addCriterion("LIUSER >", value, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserGreaterThanOrEqualTo(String value) {
            addCriterion("LIUSER >=", value, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserLessThan(String value) {
            addCriterion("LIUSER <", value, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserLessThanOrEqualTo(String value) {
            addCriterion("LIUSER <=", value, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserLike(String value) {
            addCriterion("LIUSER like", value, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserNotLike(String value) {
            addCriterion("LIUSER not like", value, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserIn(List<String> values) {
            addCriterion("LIUSER in", values, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserNotIn(List<String> values) {
            addCriterion("LIUSER not in", values, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserBetween(String value1, String value2) {
            addCriterion("LIUSER between", value1, value2, "liuser");
            return (Criteria) this;
        }

        public Criteria andLiuserNotBetween(String value1, String value2) {
            addCriterion("LIUSER not between", value1, value2, "liuser");
            return (Criteria) this;
        }

        public Criteria andLitdayIsNull() {
            addCriterion("LITDAY is null");
            return (Criteria) this;
        }

        public Criteria andLitdayIsNotNull() {
            addCriterion("LITDAY is not null");
            return (Criteria) this;
        }

        public Criteria andLitdayEqualTo(Integer value) {
            addCriterion("LITDAY =", value, "litday");
            return (Criteria) this;
        }

        public Criteria andLitdayNotEqualTo(Integer value) {
            addCriterion("LITDAY <>", value, "litday");
            return (Criteria) this;
        }

        public Criteria andLitdayGreaterThan(Integer value) {
            addCriterion("LITDAY >", value, "litday");
            return (Criteria) this;
        }

        public Criteria andLitdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("LITDAY >=", value, "litday");
            return (Criteria) this;
        }

        public Criteria andLitdayLessThan(Integer value) {
            addCriterion("LITDAY <", value, "litday");
            return (Criteria) this;
        }

        public Criteria andLitdayLessThanOrEqualTo(Integer value) {
            addCriterion("LITDAY <=", value, "litday");
            return (Criteria) this;
        }

        public Criteria andLitdayIn(List<Integer> values) {
            addCriterion("LITDAY in", values, "litday");
            return (Criteria) this;
        }

        public Criteria andLitdayNotIn(List<Integer> values) {
            addCriterion("LITDAY not in", values, "litday");
            return (Criteria) this;
        }

        public Criteria andLitdayBetween(Integer value1, Integer value2) {
            addCriterion("LITDAY between", value1, value2, "litday");
            return (Criteria) this;
        }

        public Criteria andLitdayNotBetween(Integer value1, Integer value2) {
            addCriterion("LITDAY not between", value1, value2, "litday");
            return (Criteria) this;
        }

        public Criteria andLiurdtIsNull() {
            addCriterion("LIURDT is null");
            return (Criteria) this;
        }

        public Criteria andLiurdtIsNotNull() {
            addCriterion("LIURDT is not null");
            return (Criteria) this;
        }

        public Criteria andLiurdtEqualTo(Integer value) {
            addCriterion("LIURDT =", value, "liurdt");
            return (Criteria) this;
        }

        public Criteria andLiurdtNotEqualTo(Integer value) {
            addCriterion("LIURDT <>", value, "liurdt");
            return (Criteria) this;
        }

        public Criteria andLiurdtGreaterThan(Integer value) {
            addCriterion("LIURDT >", value, "liurdt");
            return (Criteria) this;
        }

        public Criteria andLiurdtGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIURDT >=", value, "liurdt");
            return (Criteria) this;
        }

        public Criteria andLiurdtLessThan(Integer value) {
            addCriterion("LIURDT <", value, "liurdt");
            return (Criteria) this;
        }

        public Criteria andLiurdtLessThanOrEqualTo(Integer value) {
            addCriterion("LIURDT <=", value, "liurdt");
            return (Criteria) this;
        }

        public Criteria andLiurdtIn(List<Integer> values) {
            addCriterion("LIURDT in", values, "liurdt");
            return (Criteria) this;
        }

        public Criteria andLiurdtNotIn(List<Integer> values) {
            addCriterion("LIURDT not in", values, "liurdt");
            return (Criteria) this;
        }

        public Criteria andLiurdtBetween(Integer value1, Integer value2) {
            addCriterion("LIURDT between", value1, value2, "liurdt");
            return (Criteria) this;
        }

        public Criteria andLiurdtNotBetween(Integer value1, Integer value2) {
            addCriterion("LIURDT not between", value1, value2, "liurdt");
            return (Criteria) this;
        }

        public Criteria andLiqto1IsNull() {
            addCriterion("LIQTO1 is null");
            return (Criteria) this;
        }

        public Criteria andLiqto1IsNotNull() {
            addCriterion("LIQTO1 is not null");
            return (Criteria) this;
        }

        public Criteria andLiqto1EqualTo(Long value) {
            addCriterion("LIQTO1 =", value, "liqto1");
            return (Criteria) this;
        }

        public Criteria andLiqto1NotEqualTo(Long value) {
            addCriterion("LIQTO1 <>", value, "liqto1");
            return (Criteria) this;
        }

        public Criteria andLiqto1GreaterThan(Long value) {
            addCriterion("LIQTO1 >", value, "liqto1");
            return (Criteria) this;
        }

        public Criteria andLiqto1GreaterThanOrEqualTo(Long value) {
            addCriterion("LIQTO1 >=", value, "liqto1");
            return (Criteria) this;
        }

        public Criteria andLiqto1LessThan(Long value) {
            addCriterion("LIQTO1 <", value, "liqto1");
            return (Criteria) this;
        }

        public Criteria andLiqto1LessThanOrEqualTo(Long value) {
            addCriterion("LIQTO1 <=", value, "liqto1");
            return (Criteria) this;
        }

        public Criteria andLiqto1In(List<Long> values) {
            addCriterion("LIQTO1 in", values, "liqto1");
            return (Criteria) this;
        }

        public Criteria andLiqto1NotIn(List<Long> values) {
            addCriterion("LIQTO1 not in", values, "liqto1");
            return (Criteria) this;
        }

        public Criteria andLiqto1Between(Long value1, Long value2) {
            addCriterion("LIQTO1 between", value1, value2, "liqto1");
            return (Criteria) this;
        }

        public Criteria andLiqto1NotBetween(Long value1, Long value2) {
            addCriterion("LIQTO1 not between", value1, value2, "liqto1");
            return (Criteria) this;
        }

        public Criteria andLiqto2IsNull() {
            addCriterion("LIQTO2 is null");
            return (Criteria) this;
        }

        public Criteria andLiqto2IsNotNull() {
            addCriterion("LIQTO2 is not null");
            return (Criteria) this;
        }

        public Criteria andLiqto2EqualTo(Long value) {
            addCriterion("LIQTO2 =", value, "liqto2");
            return (Criteria) this;
        }

        public Criteria andLiqto2NotEqualTo(Long value) {
            addCriterion("LIQTO2 <>", value, "liqto2");
            return (Criteria) this;
        }

        public Criteria andLiqto2GreaterThan(Long value) {
            addCriterion("LIQTO2 >", value, "liqto2");
            return (Criteria) this;
        }

        public Criteria andLiqto2GreaterThanOrEqualTo(Long value) {
            addCriterion("LIQTO2 >=", value, "liqto2");
            return (Criteria) this;
        }

        public Criteria andLiqto2LessThan(Long value) {
            addCriterion("LIQTO2 <", value, "liqto2");
            return (Criteria) this;
        }

        public Criteria andLiqto2LessThanOrEqualTo(Long value) {
            addCriterion("LIQTO2 <=", value, "liqto2");
            return (Criteria) this;
        }

        public Criteria andLiqto2In(List<Long> values) {
            addCriterion("LIQTO2 in", values, "liqto2");
            return (Criteria) this;
        }

        public Criteria andLiqto2NotIn(List<Long> values) {
            addCriterion("LIQTO2 not in", values, "liqto2");
            return (Criteria) this;
        }

        public Criteria andLiqto2Between(Long value1, Long value2) {
            addCriterion("LIQTO2 between", value1, value2, "liqto2");
            return (Criteria) this;
        }

        public Criteria andLiqto2NotBetween(Long value1, Long value2) {
            addCriterion("LIQTO2 not between", value1, value2, "liqto2");
            return (Criteria) this;
        }

        public Criteria andLihcmsIsNull() {
            addCriterion("LIHCMS is null");
            return (Criteria) this;
        }

        public Criteria andLihcmsIsNotNull() {
            addCriterion("LIHCMS is not null");
            return (Criteria) this;
        }

        public Criteria andLihcmsEqualTo(Long value) {
            addCriterion("LIHCMS =", value, "lihcms");
            return (Criteria) this;
        }

        public Criteria andLihcmsNotEqualTo(Long value) {
            addCriterion("LIHCMS <>", value, "lihcms");
            return (Criteria) this;
        }

        public Criteria andLihcmsGreaterThan(Long value) {
            addCriterion("LIHCMS >", value, "lihcms");
            return (Criteria) this;
        }

        public Criteria andLihcmsGreaterThanOrEqualTo(Long value) {
            addCriterion("LIHCMS >=", value, "lihcms");
            return (Criteria) this;
        }

        public Criteria andLihcmsLessThan(Long value) {
            addCriterion("LIHCMS <", value, "lihcms");
            return (Criteria) this;
        }

        public Criteria andLihcmsLessThanOrEqualTo(Long value) {
            addCriterion("LIHCMS <=", value, "lihcms");
            return (Criteria) this;
        }

        public Criteria andLihcmsIn(List<Long> values) {
            addCriterion("LIHCMS in", values, "lihcms");
            return (Criteria) this;
        }

        public Criteria andLihcmsNotIn(List<Long> values) {
            addCriterion("LIHCMS not in", values, "lihcms");
            return (Criteria) this;
        }

        public Criteria andLihcmsBetween(Long value1, Long value2) {
            addCriterion("LIHCMS between", value1, value2, "lihcms");
            return (Criteria) this;
        }

        public Criteria andLihcmsNotBetween(Long value1, Long value2) {
            addCriterion("LIHCMS not between", value1, value2, "lihcms");
            return (Criteria) this;
        }

        public Criteria andLipjcmIsNull() {
            addCriterion("LIPJCM is null");
            return (Criteria) this;
        }

        public Criteria andLipjcmIsNotNull() {
            addCriterion("LIPJCM is not null");
            return (Criteria) this;
        }

        public Criteria andLipjcmEqualTo(Long value) {
            addCriterion("LIPJCM =", value, "lipjcm");
            return (Criteria) this;
        }

        public Criteria andLipjcmNotEqualTo(Long value) {
            addCriterion("LIPJCM <>", value, "lipjcm");
            return (Criteria) this;
        }

        public Criteria andLipjcmGreaterThan(Long value) {
            addCriterion("LIPJCM >", value, "lipjcm");
            return (Criteria) this;
        }

        public Criteria andLipjcmGreaterThanOrEqualTo(Long value) {
            addCriterion("LIPJCM >=", value, "lipjcm");
            return (Criteria) this;
        }

        public Criteria andLipjcmLessThan(Long value) {
            addCriterion("LIPJCM <", value, "lipjcm");
            return (Criteria) this;
        }

        public Criteria andLipjcmLessThanOrEqualTo(Long value) {
            addCriterion("LIPJCM <=", value, "lipjcm");
            return (Criteria) this;
        }

        public Criteria andLipjcmIn(List<Long> values) {
            addCriterion("LIPJCM in", values, "lipjcm");
            return (Criteria) this;
        }

        public Criteria andLipjcmNotIn(List<Long> values) {
            addCriterion("LIPJCM not in", values, "lipjcm");
            return (Criteria) this;
        }

        public Criteria andLipjcmBetween(Long value1, Long value2) {
            addCriterion("LIPJCM between", value1, value2, "lipjcm");
            return (Criteria) this;
        }

        public Criteria andLipjcmNotBetween(Long value1, Long value2) {
            addCriterion("LIPJCM not between", value1, value2, "lipjcm");
            return (Criteria) this;
        }

        public Criteria andLipjdmIsNull() {
            addCriterion("LIPJDM is null");
            return (Criteria) this;
        }

        public Criteria andLipjdmIsNotNull() {
            addCriterion("LIPJDM is not null");
            return (Criteria) this;
        }

        public Criteria andLipjdmEqualTo(Long value) {
            addCriterion("LIPJDM =", value, "lipjdm");
            return (Criteria) this;
        }

        public Criteria andLipjdmNotEqualTo(Long value) {
            addCriterion("LIPJDM <>", value, "lipjdm");
            return (Criteria) this;
        }

        public Criteria andLipjdmGreaterThan(Long value) {
            addCriterion("LIPJDM >", value, "lipjdm");
            return (Criteria) this;
        }

        public Criteria andLipjdmGreaterThanOrEqualTo(Long value) {
            addCriterion("LIPJDM >=", value, "lipjdm");
            return (Criteria) this;
        }

        public Criteria andLipjdmLessThan(Long value) {
            addCriterion("LIPJDM <", value, "lipjdm");
            return (Criteria) this;
        }

        public Criteria andLipjdmLessThanOrEqualTo(Long value) {
            addCriterion("LIPJDM <=", value, "lipjdm");
            return (Criteria) this;
        }

        public Criteria andLipjdmIn(List<Long> values) {
            addCriterion("LIPJDM in", values, "lipjdm");
            return (Criteria) this;
        }

        public Criteria andLipjdmNotIn(List<Long> values) {
            addCriterion("LIPJDM not in", values, "lipjdm");
            return (Criteria) this;
        }

        public Criteria andLipjdmBetween(Long value1, Long value2) {
            addCriterion("LIPJDM between", value1, value2, "lipjdm");
            return (Criteria) this;
        }

        public Criteria andLipjdmNotBetween(Long value1, Long value2) {
            addCriterion("LIPJDM not between", value1, value2, "lipjdm");
            return (Criteria) this;
        }

        public Criteria andLiscmsIsNull() {
            addCriterion("LISCMS is null");
            return (Criteria) this;
        }

        public Criteria andLiscmsIsNotNull() {
            addCriterion("LISCMS is not null");
            return (Criteria) this;
        }

        public Criteria andLiscmsEqualTo(Long value) {
            addCriterion("LISCMS =", value, "liscms");
            return (Criteria) this;
        }

        public Criteria andLiscmsNotEqualTo(Long value) {
            addCriterion("LISCMS <>", value, "liscms");
            return (Criteria) this;
        }

        public Criteria andLiscmsGreaterThan(Long value) {
            addCriterion("LISCMS >", value, "liscms");
            return (Criteria) this;
        }

        public Criteria andLiscmsGreaterThanOrEqualTo(Long value) {
            addCriterion("LISCMS >=", value, "liscms");
            return (Criteria) this;
        }

        public Criteria andLiscmsLessThan(Long value) {
            addCriterion("LISCMS <", value, "liscms");
            return (Criteria) this;
        }

        public Criteria andLiscmsLessThanOrEqualTo(Long value) {
            addCriterion("LISCMS <=", value, "liscms");
            return (Criteria) this;
        }

        public Criteria andLiscmsIn(List<Long> values) {
            addCriterion("LISCMS in", values, "liscms");
            return (Criteria) this;
        }

        public Criteria andLiscmsNotIn(List<Long> values) {
            addCriterion("LISCMS not in", values, "liscms");
            return (Criteria) this;
        }

        public Criteria andLiscmsBetween(Long value1, Long value2) {
            addCriterion("LISCMS between", value1, value2, "liscms");
            return (Criteria) this;
        }

        public Criteria andLiscmsNotBetween(Long value1, Long value2) {
            addCriterion("LISCMS not between", value1, value2, "liscms");
            return (Criteria) this;
        }

        public Criteria andLisibwIsNull() {
            addCriterion("LISIBW is null");
            return (Criteria) this;
        }

        public Criteria andLisibwIsNotNull() {
            addCriterion("LISIBW is not null");
            return (Criteria) this;
        }

        public Criteria andLisibwEqualTo(Long value) {
            addCriterion("LISIBW =", value, "lisibw");
            return (Criteria) this;
        }

        public Criteria andLisibwNotEqualTo(Long value) {
            addCriterion("LISIBW <>", value, "lisibw");
            return (Criteria) this;
        }

        public Criteria andLisibwGreaterThan(Long value) {
            addCriterion("LISIBW >", value, "lisibw");
            return (Criteria) this;
        }

        public Criteria andLisibwGreaterThanOrEqualTo(Long value) {
            addCriterion("LISIBW >=", value, "lisibw");
            return (Criteria) this;
        }

        public Criteria andLisibwLessThan(Long value) {
            addCriterion("LISIBW <", value, "lisibw");
            return (Criteria) this;
        }

        public Criteria andLisibwLessThanOrEqualTo(Long value) {
            addCriterion("LISIBW <=", value, "lisibw");
            return (Criteria) this;
        }

        public Criteria andLisibwIn(List<Long> values) {
            addCriterion("LISIBW in", values, "lisibw");
            return (Criteria) this;
        }

        public Criteria andLisibwNotIn(List<Long> values) {
            addCriterion("LISIBW not in", values, "lisibw");
            return (Criteria) this;
        }

        public Criteria andLisibwBetween(Long value1, Long value2) {
            addCriterion("LISIBW between", value1, value2, "lisibw");
            return (Criteria) this;
        }

        public Criteria andLisibwNotBetween(Long value1, Long value2) {
            addCriterion("LISIBW not between", value1, value2, "lisibw");
            return (Criteria) this;
        }

        public Criteria andLisobwIsNull() {
            addCriterion("LISOBW is null");
            return (Criteria) this;
        }

        public Criteria andLisobwIsNotNull() {
            addCriterion("LISOBW is not null");
            return (Criteria) this;
        }

        public Criteria andLisobwEqualTo(Long value) {
            addCriterion("LISOBW =", value, "lisobw");
            return (Criteria) this;
        }

        public Criteria andLisobwNotEqualTo(Long value) {
            addCriterion("LISOBW <>", value, "lisobw");
            return (Criteria) this;
        }

        public Criteria andLisobwGreaterThan(Long value) {
            addCriterion("LISOBW >", value, "lisobw");
            return (Criteria) this;
        }

        public Criteria andLisobwGreaterThanOrEqualTo(Long value) {
            addCriterion("LISOBW >=", value, "lisobw");
            return (Criteria) this;
        }

        public Criteria andLisobwLessThan(Long value) {
            addCriterion("LISOBW <", value, "lisobw");
            return (Criteria) this;
        }

        public Criteria andLisobwLessThanOrEqualTo(Long value) {
            addCriterion("LISOBW <=", value, "lisobw");
            return (Criteria) this;
        }

        public Criteria andLisobwIn(List<Long> values) {
            addCriterion("LISOBW in", values, "lisobw");
            return (Criteria) this;
        }

        public Criteria andLisobwNotIn(List<Long> values) {
            addCriterion("LISOBW not in", values, "lisobw");
            return (Criteria) this;
        }

        public Criteria andLisobwBetween(Long value1, Long value2) {
            addCriterion("LISOBW between", value1, value2, "lisobw");
            return (Criteria) this;
        }

        public Criteria andLisobwNotBetween(Long value1, Long value2) {
            addCriterion("LISOBW not between", value1, value2, "lisobw");
            return (Criteria) this;
        }

        public Criteria andLisqohIsNull() {
            addCriterion("LISQOH is null");
            return (Criteria) this;
        }

        public Criteria andLisqohIsNotNull() {
            addCriterion("LISQOH is not null");
            return (Criteria) this;
        }

        public Criteria andLisqohEqualTo(Long value) {
            addCriterion("LISQOH =", value, "lisqoh");
            return (Criteria) this;
        }

        public Criteria andLisqohNotEqualTo(Long value) {
            addCriterion("LISQOH <>", value, "lisqoh");
            return (Criteria) this;
        }

        public Criteria andLisqohGreaterThan(Long value) {
            addCriterion("LISQOH >", value, "lisqoh");
            return (Criteria) this;
        }

        public Criteria andLisqohGreaterThanOrEqualTo(Long value) {
            addCriterion("LISQOH >=", value, "lisqoh");
            return (Criteria) this;
        }

        public Criteria andLisqohLessThan(Long value) {
            addCriterion("LISQOH <", value, "lisqoh");
            return (Criteria) this;
        }

        public Criteria andLisqohLessThanOrEqualTo(Long value) {
            addCriterion("LISQOH <=", value, "lisqoh");
            return (Criteria) this;
        }

        public Criteria andLisqohIn(List<Long> values) {
            addCriterion("LISQOH in", values, "lisqoh");
            return (Criteria) this;
        }

        public Criteria andLisqohNotIn(List<Long> values) {
            addCriterion("LISQOH not in", values, "lisqoh");
            return (Criteria) this;
        }

        public Criteria andLisqohBetween(Long value1, Long value2) {
            addCriterion("LISQOH between", value1, value2, "lisqoh");
            return (Criteria) this;
        }

        public Criteria andLisqohNotBetween(Long value1, Long value2) {
            addCriterion("LISQOH not between", value1, value2, "lisqoh");
            return (Criteria) this;
        }

        public Criteria andLisqwoIsNull() {
            addCriterion("LISQWO is null");
            return (Criteria) this;
        }

        public Criteria andLisqwoIsNotNull() {
            addCriterion("LISQWO is not null");
            return (Criteria) this;
        }

        public Criteria andLisqwoEqualTo(Long value) {
            addCriterion("LISQWO =", value, "lisqwo");
            return (Criteria) this;
        }

        public Criteria andLisqwoNotEqualTo(Long value) {
            addCriterion("LISQWO <>", value, "lisqwo");
            return (Criteria) this;
        }

        public Criteria andLisqwoGreaterThan(Long value) {
            addCriterion("LISQWO >", value, "lisqwo");
            return (Criteria) this;
        }

        public Criteria andLisqwoGreaterThanOrEqualTo(Long value) {
            addCriterion("LISQWO >=", value, "lisqwo");
            return (Criteria) this;
        }

        public Criteria andLisqwoLessThan(Long value) {
            addCriterion("LISQWO <", value, "lisqwo");
            return (Criteria) this;
        }

        public Criteria andLisqwoLessThanOrEqualTo(Long value) {
            addCriterion("LISQWO <=", value, "lisqwo");
            return (Criteria) this;
        }

        public Criteria andLisqwoIn(List<Long> values) {
            addCriterion("LISQWO in", values, "lisqwo");
            return (Criteria) this;
        }

        public Criteria andLisqwoNotIn(List<Long> values) {
            addCriterion("LISQWO not in", values, "lisqwo");
            return (Criteria) this;
        }

        public Criteria andLisqwoBetween(Long value1, Long value2) {
            addCriterion("LISQWO between", value1, value2, "lisqwo");
            return (Criteria) this;
        }

        public Criteria andLisqwoNotBetween(Long value1, Long value2) {
            addCriterion("LISQWO not between", value1, value2, "lisqwo");
            return (Criteria) this;
        }

        public Criteria andLisreqIsNull() {
            addCriterion("LISREQ is null");
            return (Criteria) this;
        }

        public Criteria andLisreqIsNotNull() {
            addCriterion("LISREQ is not null");
            return (Criteria) this;
        }

        public Criteria andLisreqEqualTo(Long value) {
            addCriterion("LISREQ =", value, "lisreq");
            return (Criteria) this;
        }

        public Criteria andLisreqNotEqualTo(Long value) {
            addCriterion("LISREQ <>", value, "lisreq");
            return (Criteria) this;
        }

        public Criteria andLisreqGreaterThan(Long value) {
            addCriterion("LISREQ >", value, "lisreq");
            return (Criteria) this;
        }

        public Criteria andLisreqGreaterThanOrEqualTo(Long value) {
            addCriterion("LISREQ >=", value, "lisreq");
            return (Criteria) this;
        }

        public Criteria andLisreqLessThan(Long value) {
            addCriterion("LISREQ <", value, "lisreq");
            return (Criteria) this;
        }

        public Criteria andLisreqLessThanOrEqualTo(Long value) {
            addCriterion("LISREQ <=", value, "lisreq");
            return (Criteria) this;
        }

        public Criteria andLisreqIn(List<Long> values) {
            addCriterion("LISREQ in", values, "lisreq");
            return (Criteria) this;
        }

        public Criteria andLisreqNotIn(List<Long> values) {
            addCriterion("LISREQ not in", values, "lisreq");
            return (Criteria) this;
        }

        public Criteria andLisreqBetween(Long value1, Long value2) {
            addCriterion("LISREQ between", value1, value2, "lisreq");
            return (Criteria) this;
        }

        public Criteria andLisreqNotBetween(Long value1, Long value2) {
            addCriterion("LISREQ not between", value1, value2, "lisreq");
            return (Criteria) this;
        }

        public Criteria andLiswhcIsNull() {
            addCriterion("LISWHC is null");
            return (Criteria) this;
        }

        public Criteria andLiswhcIsNotNull() {
            addCriterion("LISWHC is not null");
            return (Criteria) this;
        }

        public Criteria andLiswhcEqualTo(Long value) {
            addCriterion("LISWHC =", value, "liswhc");
            return (Criteria) this;
        }

        public Criteria andLiswhcNotEqualTo(Long value) {
            addCriterion("LISWHC <>", value, "liswhc");
            return (Criteria) this;
        }

        public Criteria andLiswhcGreaterThan(Long value) {
            addCriterion("LISWHC >", value, "liswhc");
            return (Criteria) this;
        }

        public Criteria andLiswhcGreaterThanOrEqualTo(Long value) {
            addCriterion("LISWHC >=", value, "liswhc");
            return (Criteria) this;
        }

        public Criteria andLiswhcLessThan(Long value) {
            addCriterion("LISWHC <", value, "liswhc");
            return (Criteria) this;
        }

        public Criteria andLiswhcLessThanOrEqualTo(Long value) {
            addCriterion("LISWHC <=", value, "liswhc");
            return (Criteria) this;
        }

        public Criteria andLiswhcIn(List<Long> values) {
            addCriterion("LISWHC in", values, "liswhc");
            return (Criteria) this;
        }

        public Criteria andLiswhcNotIn(List<Long> values) {
            addCriterion("LISWHC not in", values, "liswhc");
            return (Criteria) this;
        }

        public Criteria andLiswhcBetween(Long value1, Long value2) {
            addCriterion("LISWHC between", value1, value2, "liswhc");
            return (Criteria) this;
        }

        public Criteria andLiswhcNotBetween(Long value1, Long value2) {
            addCriterion("LISWHC not between", value1, value2, "liswhc");
            return (Criteria) this;
        }

        public Criteria andLiswscIsNull() {
            addCriterion("LISWSC is null");
            return (Criteria) this;
        }

        public Criteria andLiswscIsNotNull() {
            addCriterion("LISWSC is not null");
            return (Criteria) this;
        }

        public Criteria andLiswscEqualTo(Long value) {
            addCriterion("LISWSC =", value, "liswsc");
            return (Criteria) this;
        }

        public Criteria andLiswscNotEqualTo(Long value) {
            addCriterion("LISWSC <>", value, "liswsc");
            return (Criteria) this;
        }

        public Criteria andLiswscGreaterThan(Long value) {
            addCriterion("LISWSC >", value, "liswsc");
            return (Criteria) this;
        }

        public Criteria andLiswscGreaterThanOrEqualTo(Long value) {
            addCriterion("LISWSC >=", value, "liswsc");
            return (Criteria) this;
        }

        public Criteria andLiswscLessThan(Long value) {
            addCriterion("LISWSC <", value, "liswsc");
            return (Criteria) this;
        }

        public Criteria andLiswscLessThanOrEqualTo(Long value) {
            addCriterion("LISWSC <=", value, "liswsc");
            return (Criteria) this;
        }

        public Criteria andLiswscIn(List<Long> values) {
            addCriterion("LISWSC in", values, "liswsc");
            return (Criteria) this;
        }

        public Criteria andLiswscNotIn(List<Long> values) {
            addCriterion("LISWSC not in", values, "liswsc");
            return (Criteria) this;
        }

        public Criteria andLiswscBetween(Long value1, Long value2) {
            addCriterion("LISWSC between", value1, value2, "liswsc");
            return (Criteria) this;
        }

        public Criteria andLiswscNotBetween(Long value1, Long value2) {
            addCriterion("LISWSC not between", value1, value2, "liswsc");
            return (Criteria) this;
        }

        public Criteria andLichdfIsNull() {
            addCriterion("LICHDF is null");
            return (Criteria) this;
        }

        public Criteria andLichdfIsNotNull() {
            addCriterion("LICHDF is not null");
            return (Criteria) this;
        }

        public Criteria andLichdfEqualTo(String value) {
            addCriterion("LICHDF =", value, "lichdf");
            return (Criteria) this;
        }

        public Criteria andLichdfNotEqualTo(String value) {
            addCriterion("LICHDF <>", value, "lichdf");
            return (Criteria) this;
        }

        public Criteria andLichdfGreaterThan(String value) {
            addCriterion("LICHDF >", value, "lichdf");
            return (Criteria) this;
        }

        public Criteria andLichdfGreaterThanOrEqualTo(String value) {
            addCriterion("LICHDF >=", value, "lichdf");
            return (Criteria) this;
        }

        public Criteria andLichdfLessThan(String value) {
            addCriterion("LICHDF <", value, "lichdf");
            return (Criteria) this;
        }

        public Criteria andLichdfLessThanOrEqualTo(String value) {
            addCriterion("LICHDF <=", value, "lichdf");
            return (Criteria) this;
        }

        public Criteria andLichdfLike(String value) {
            addCriterion("LICHDF like", value, "lichdf");
            return (Criteria) this;
        }

        public Criteria andLichdfNotLike(String value) {
            addCriterion("LICHDF not like", value, "lichdf");
            return (Criteria) this;
        }

        public Criteria andLichdfIn(List<String> values) {
            addCriterion("LICHDF in", values, "lichdf");
            return (Criteria) this;
        }

        public Criteria andLichdfNotIn(List<String> values) {
            addCriterion("LICHDF not in", values, "lichdf");
            return (Criteria) this;
        }

        public Criteria andLichdfBetween(String value1, String value2) {
            addCriterion("LICHDF between", value1, value2, "lichdf");
            return (Criteria) this;
        }

        public Criteria andLichdfNotBetween(String value1, String value2) {
            addCriterion("LICHDF not between", value1, value2, "lichdf");
            return (Criteria) this;
        }

        public Criteria andLiwpdfIsNull() {
            addCriterion("LIWPDF is null");
            return (Criteria) this;
        }

        public Criteria andLiwpdfIsNotNull() {
            addCriterion("LIWPDF is not null");
            return (Criteria) this;
        }

        public Criteria andLiwpdfEqualTo(String value) {
            addCriterion("LIWPDF =", value, "liwpdf");
            return (Criteria) this;
        }

        public Criteria andLiwpdfNotEqualTo(String value) {
            addCriterion("LIWPDF <>", value, "liwpdf");
            return (Criteria) this;
        }

        public Criteria andLiwpdfGreaterThan(String value) {
            addCriterion("LIWPDF >", value, "liwpdf");
            return (Criteria) this;
        }

        public Criteria andLiwpdfGreaterThanOrEqualTo(String value) {
            addCriterion("LIWPDF >=", value, "liwpdf");
            return (Criteria) this;
        }

        public Criteria andLiwpdfLessThan(String value) {
            addCriterion("LIWPDF <", value, "liwpdf");
            return (Criteria) this;
        }

        public Criteria andLiwpdfLessThanOrEqualTo(String value) {
            addCriterion("LIWPDF <=", value, "liwpdf");
            return (Criteria) this;
        }

        public Criteria andLiwpdfLike(String value) {
            addCriterion("LIWPDF like", value, "liwpdf");
            return (Criteria) this;
        }

        public Criteria andLiwpdfNotLike(String value) {
            addCriterion("LIWPDF not like", value, "liwpdf");
            return (Criteria) this;
        }

        public Criteria andLiwpdfIn(List<String> values) {
            addCriterion("LIWPDF in", values, "liwpdf");
            return (Criteria) this;
        }

        public Criteria andLiwpdfNotIn(List<String> values) {
            addCriterion("LIWPDF not in", values, "liwpdf");
            return (Criteria) this;
        }

        public Criteria andLiwpdfBetween(String value1, String value2) {
            addCriterion("LIWPDF between", value1, value2, "liwpdf");
            return (Criteria) this;
        }

        public Criteria andLiwpdfNotBetween(String value1, String value2) {
            addCriterion("LIWPDF not between", value1, value2, "liwpdf");
            return (Criteria) this;
        }

        public Criteria andLicfgsidIsNull() {
            addCriterion("LICFGSID is null");
            return (Criteria) this;
        }

        public Criteria andLicfgsidIsNotNull() {
            addCriterion("LICFGSID is not null");
            return (Criteria) this;
        }

        public Criteria andLicfgsidEqualTo(String value) {
            addCriterion("LICFGSID =", value, "licfgsid");
            return (Criteria) this;
        }

        public Criteria andLicfgsidNotEqualTo(String value) {
            addCriterion("LICFGSID <>", value, "licfgsid");
            return (Criteria) this;
        }

        public Criteria andLicfgsidGreaterThan(String value) {
            addCriterion("LICFGSID >", value, "licfgsid");
            return (Criteria) this;
        }

        public Criteria andLicfgsidGreaterThanOrEqualTo(String value) {
            addCriterion("LICFGSID >=", value, "licfgsid");
            return (Criteria) this;
        }

        public Criteria andLicfgsidLessThan(String value) {
            addCriterion("LICFGSID <", value, "licfgsid");
            return (Criteria) this;
        }

        public Criteria andLicfgsidLessThanOrEqualTo(String value) {
            addCriterion("LICFGSID <=", value, "licfgsid");
            return (Criteria) this;
        }

        public Criteria andLicfgsidLike(String value) {
            addCriterion("LICFGSID like", value, "licfgsid");
            return (Criteria) this;
        }

        public Criteria andLicfgsidNotLike(String value) {
            addCriterion("LICFGSID not like", value, "licfgsid");
            return (Criteria) this;
        }

        public Criteria andLicfgsidIn(List<String> values) {
            addCriterion("LICFGSID in", values, "licfgsid");
            return (Criteria) this;
        }

        public Criteria andLicfgsidNotIn(List<String> values) {
            addCriterion("LICFGSID not in", values, "licfgsid");
            return (Criteria) this;
        }

        public Criteria andLicfgsidBetween(String value1, String value2) {
            addCriterion("LICFGSID between", value1, value2, "licfgsid");
            return (Criteria) this;
        }

        public Criteria andLicfgsidNotBetween(String value1, String value2) {
            addCriterion("LICFGSID not between", value1, value2, "licfgsid");
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