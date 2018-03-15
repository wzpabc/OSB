package com.tup.mssql.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockAdjustExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockAdjustExample() {
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

        public Criteria andAutonumberIsNull() {
            addCriterion("Autonumber is null");
            return (Criteria) this;
        }

        public Criteria andAutonumberIsNotNull() {
            addCriterion("Autonumber is not null");
            return (Criteria) this;
        }

        public Criteria andAutonumberEqualTo(Integer value) {
            addCriterion("Autonumber =", value, "autonumber");
            return (Criteria) this;
        }

        public Criteria andAutonumberNotEqualTo(Integer value) {
            addCriterion("Autonumber <>", value, "autonumber");
            return (Criteria) this;
        }

        public Criteria andAutonumberGreaterThan(Integer value) {
            addCriterion("Autonumber >", value, "autonumber");
            return (Criteria) this;
        }

        public Criteria andAutonumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("Autonumber >=", value, "autonumber");
            return (Criteria) this;
        }

        public Criteria andAutonumberLessThan(Integer value) {
            addCriterion("Autonumber <", value, "autonumber");
            return (Criteria) this;
        }

        public Criteria andAutonumberLessThanOrEqualTo(Integer value) {
            addCriterion("Autonumber <=", value, "autonumber");
            return (Criteria) this;
        }

        public Criteria andAutonumberIn(List<Integer> values) {
            addCriterion("Autonumber in", values, "autonumber");
            return (Criteria) this;
        }

        public Criteria andAutonumberNotIn(List<Integer> values) {
            addCriterion("Autonumber not in", values, "autonumber");
            return (Criteria) this;
        }

        public Criteria andAutonumberBetween(Integer value1, Integer value2) {
            addCriterion("Autonumber between", value1, value2, "autonumber");
            return (Criteria) this;
        }

        public Criteria andAutonumberNotBetween(Integer value1, Integer value2) {
            addCriterion("Autonumber not between", value1, value2, "autonumber");
            return (Criteria) this;
        }

        public Criteria andMcuIsNull() {
            addCriterion("MCU is null");
            return (Criteria) this;
        }

        public Criteria andMcuIsNotNull() {
            addCriterion("MCU is not null");
            return (Criteria) this;
        }

        public Criteria andMcuEqualTo(String value) {
            addCriterion("MCU =", value, "mcu");
            return (Criteria) this;
        }

        public Criteria andMcuNotEqualTo(String value) {
            addCriterion("MCU <>", value, "mcu");
            return (Criteria) this;
        }

        public Criteria andMcuGreaterThan(String value) {
            addCriterion("MCU >", value, "mcu");
            return (Criteria) this;
        }

        public Criteria andMcuGreaterThanOrEqualTo(String value) {
            addCriterion("MCU >=", value, "mcu");
            return (Criteria) this;
        }

        public Criteria andMcuLessThan(String value) {
            addCriterion("MCU <", value, "mcu");
            return (Criteria) this;
        }

        public Criteria andMcuLessThanOrEqualTo(String value) {
            addCriterion("MCU <=", value, "mcu");
            return (Criteria) this;
        }

        public Criteria andMcuIn(List<String> values) {
            addCriterion("MCU in", values, "mcu");
            return (Criteria) this;
        }

        public Criteria andMcuNotIn(List<String> values) {
            addCriterion("MCU not in", values, "mcu");
            return (Criteria) this;
        }

        public Criteria andMcuBetween(String value1, String value2) {
            addCriterion("MCU between", value1, value2, "mcu");
            return (Criteria) this;
        }

        public Criteria andMcuNotBetween(String value1, String value2) {
            addCriterion("MCU not between", value1, value2, "mcu");
            return (Criteria) this;
        }

        public Criteria andDctIsNull() {
            addCriterion("DCT is null");
            return (Criteria) this;
        }

        public Criteria andDctIsNotNull() {
            addCriterion("DCT is not null");
            return (Criteria) this;
        }

        public Criteria andDctEqualTo(String value) {
            addCriterion("DCT =", value, "dct");
            return (Criteria) this;
        }

        public Criteria andDctNotEqualTo(String value) {
            addCriterion("DCT <>", value, "dct");
            return (Criteria) this;
        }

        public Criteria andDctGreaterThan(String value) {
            addCriterion("DCT >", value, "dct");
            return (Criteria) this;
        }

        public Criteria andDctGreaterThanOrEqualTo(String value) {
            addCriterion("DCT >=", value, "dct");
            return (Criteria) this;
        }

        public Criteria andDctLessThan(String value) {
            addCriterion("DCT <", value, "dct");
            return (Criteria) this;
        }

        public Criteria andDctLessThanOrEqualTo(String value) {
            addCriterion("DCT <=", value, "dct");
            return (Criteria) this;
        }

        public Criteria andDctIn(List<String> values) {
            addCriterion("DCT in", values, "dct");
            return (Criteria) this;
        }

        public Criteria andDctNotIn(List<String> values) {
            addCriterion("DCT not in", values, "dct");
            return (Criteria) this;
        }

        public Criteria andDctBetween(String value1, String value2) {
            addCriterion("DCT between", value1, value2, "dct");
            return (Criteria) this;
        }

        public Criteria andDctNotBetween(String value1, String value2) {
            addCriterion("DCT not between", value1, value2, "dct");
            return (Criteria) this;
        }

        public Criteria andExpIsNull() {
            addCriterion("EXP is null");
            return (Criteria) this;
        }

        public Criteria andExpIsNotNull() {
            addCriterion("EXP is not null");
            return (Criteria) this;
        }

        public Criteria andExpEqualTo(String value) {
            addCriterion("EXP =", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotEqualTo(String value) {
            addCriterion("EXP <>", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThan(String value) {
            addCriterion("EXP >", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThanOrEqualTo(String value) {
            addCriterion("EXP >=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThan(String value) {
            addCriterion("EXP <", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThanOrEqualTo(String value) {
            addCriterion("EXP <=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpIn(List<String> values) {
            addCriterion("EXP in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotIn(List<String> values) {
            addCriterion("EXP not in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpBetween(String value1, String value2) {
            addCriterion("EXP between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotBetween(String value1, String value2) {
            addCriterion("EXP not between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andGlcIsNull() {
            addCriterion("GLC is null");
            return (Criteria) this;
        }

        public Criteria andGlcIsNotNull() {
            addCriterion("GLC is not null");
            return (Criteria) this;
        }

        public Criteria andGlcEqualTo(String value) {
            addCriterion("GLC =", value, "glc");
            return (Criteria) this;
        }

        public Criteria andGlcNotEqualTo(String value) {
            addCriterion("GLC <>", value, "glc");
            return (Criteria) this;
        }

        public Criteria andGlcGreaterThan(String value) {
            addCriterion("GLC >", value, "glc");
            return (Criteria) this;
        }

        public Criteria andGlcGreaterThanOrEqualTo(String value) {
            addCriterion("GLC >=", value, "glc");
            return (Criteria) this;
        }

        public Criteria andGlcLessThan(String value) {
            addCriterion("GLC <", value, "glc");
            return (Criteria) this;
        }

        public Criteria andGlcLessThanOrEqualTo(String value) {
            addCriterion("GLC <=", value, "glc");
            return (Criteria) this;
        }

        public Criteria andGlcIn(List<String> values) {
            addCriterion("GLC in", values, "glc");
            return (Criteria) this;
        }

        public Criteria andGlcNotIn(List<String> values) {
            addCriterion("GLC not in", values, "glc");
            return (Criteria) this;
        }

        public Criteria andGlcBetween(String value1, String value2) {
            addCriterion("GLC between", value1, value2, "glc");
            return (Criteria) this;
        }

        public Criteria andGlcNotBetween(String value1, String value2) {
            addCriterion("GLC not between", value1, value2, "glc");
            return (Criteria) this;
        }

        public Criteria andLitmIsNull() {
            addCriterion("LITM is null");
            return (Criteria) this;
        }

        public Criteria andLitmIsNotNull() {
            addCriterion("LITM is not null");
            return (Criteria) this;
        }

        public Criteria andLitmEqualTo(String value) {
            addCriterion("LITM =", value, "litm");
            return (Criteria) this;
        }

        public Criteria andLitmNotEqualTo(String value) {
            addCriterion("LITM <>", value, "litm");
            return (Criteria) this;
        }

        public Criteria andLitmGreaterThan(String value) {
            addCriterion("LITM >", value, "litm");
            return (Criteria) this;
        }

        public Criteria andLitmGreaterThanOrEqualTo(String value) {
            addCriterion("LITM >=", value, "litm");
            return (Criteria) this;
        }

        public Criteria andLitmLessThan(String value) {
            addCriterion("LITM <", value, "litm");
            return (Criteria) this;
        }

        public Criteria andLitmLessThanOrEqualTo(String value) {
            addCriterion("LITM <=", value, "litm");
            return (Criteria) this;
        }

        public Criteria andLitmIn(List<String> values) {
            addCriterion("LITM in", values, "litm");
            return (Criteria) this;
        }

        public Criteria andLitmNotIn(List<String> values) {
            addCriterion("LITM not in", values, "litm");
            return (Criteria) this;
        }

        public Criteria andLitmBetween(String value1, String value2) {
            addCriterion("LITM between", value1, value2, "litm");
            return (Criteria) this;
        }

        public Criteria andLitmNotBetween(String value1, String value2) {
            addCriterion("LITM not between", value1, value2, "litm");
            return (Criteria) this;
        }

        public Criteria andLocnIsNull() {
            addCriterion("LOCN is null");
            return (Criteria) this;
        }

        public Criteria andLocnIsNotNull() {
            addCriterion("LOCN is not null");
            return (Criteria) this;
        }

        public Criteria andLocnEqualTo(String value) {
            addCriterion("LOCN =", value, "locn");
            return (Criteria) this;
        }

        public Criteria andLocnNotEqualTo(String value) {
            addCriterion("LOCN <>", value, "locn");
            return (Criteria) this;
        }

        public Criteria andLocnGreaterThan(String value) {
            addCriterion("LOCN >", value, "locn");
            return (Criteria) this;
        }

        public Criteria andLocnGreaterThanOrEqualTo(String value) {
            addCriterion("LOCN >=", value, "locn");
            return (Criteria) this;
        }

        public Criteria andLocnLessThan(String value) {
            addCriterion("LOCN <", value, "locn");
            return (Criteria) this;
        }

        public Criteria andLocnLessThanOrEqualTo(String value) {
            addCriterion("LOCN <=", value, "locn");
            return (Criteria) this;
        }

        public Criteria andLocnIn(List<String> values) {
            addCriterion("LOCN in", values, "locn");
            return (Criteria) this;
        }

        public Criteria andLocnNotIn(List<String> values) {
            addCriterion("LOCN not in", values, "locn");
            return (Criteria) this;
        }

        public Criteria andLocnBetween(String value1, String value2) {
            addCriterion("LOCN between", value1, value2, "locn");
            return (Criteria) this;
        }

        public Criteria andLocnNotBetween(String value1, String value2) {
            addCriterion("LOCN not between", value1, value2, "locn");
            return (Criteria) this;
        }

        public Criteria andLotnIsNull() {
            addCriterion("LOTN is null");
            return (Criteria) this;
        }

        public Criteria andLotnIsNotNull() {
            addCriterion("LOTN is not null");
            return (Criteria) this;
        }

        public Criteria andLotnEqualTo(String value) {
            addCriterion("LOTN =", value, "lotn");
            return (Criteria) this;
        }

        public Criteria andLotnNotEqualTo(String value) {
            addCriterion("LOTN <>", value, "lotn");
            return (Criteria) this;
        }

        public Criteria andLotnGreaterThan(String value) {
            addCriterion("LOTN >", value, "lotn");
            return (Criteria) this;
        }

        public Criteria andLotnGreaterThanOrEqualTo(String value) {
            addCriterion("LOTN >=", value, "lotn");
            return (Criteria) this;
        }

        public Criteria andLotnLessThan(String value) {
            addCriterion("LOTN <", value, "lotn");
            return (Criteria) this;
        }

        public Criteria andLotnLessThanOrEqualTo(String value) {
            addCriterion("LOTN <=", value, "lotn");
            return (Criteria) this;
        }

        public Criteria andLotnIn(List<String> values) {
            addCriterion("LOTN in", values, "lotn");
            return (Criteria) this;
        }

        public Criteria andLotnNotIn(List<String> values) {
            addCriterion("LOTN not in", values, "lotn");
            return (Criteria) this;
        }

        public Criteria andLotnBetween(String value1, String value2) {
            addCriterion("LOTN between", value1, value2, "lotn");
            return (Criteria) this;
        }

        public Criteria andLotnNotBetween(String value1, String value2) {
            addCriterion("LOTN not between", value1, value2, "lotn");
            return (Criteria) this;
        }

        public Criteria andQtyIsNull() {
            addCriterion("QTY is null");
            return (Criteria) this;
        }

        public Criteria andQtyIsNotNull() {
            addCriterion("QTY is not null");
            return (Criteria) this;
        }

        public Criteria andQtyEqualTo(Long value) {
            addCriterion("QTY =", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotEqualTo(Long value) {
            addCriterion("QTY <>", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThan(Long value) {
            addCriterion("QTY >", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThanOrEqualTo(Long value) {
            addCriterion("QTY >=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThan(Long value) {
            addCriterion("QTY <", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThanOrEqualTo(Long value) {
            addCriterion("QTY <=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyIn(List<Long> values) {
            addCriterion("QTY in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotIn(List<Long> values) {
            addCriterion("QTY not in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyBetween(Long value1, Long value2) {
            addCriterion("QTY between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotBetween(Long value1, Long value2) {
            addCriterion("QTY not between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andTrandtaeIsNull() {
            addCriterion("TRANDTAE is null");
            return (Criteria) this;
        }

        public Criteria andTrandtaeIsNotNull() {
            addCriterion("TRANDTAE is not null");
            return (Criteria) this;
        }

        public Criteria andTrandtaeEqualTo(Date value) {
            addCriterion("TRANDTAE =", value, "trandtae");
            return (Criteria) this;
        }

        public Criteria andTrandtaeNotEqualTo(Date value) {
            addCriterion("TRANDTAE <>", value, "trandtae");
            return (Criteria) this;
        }

        public Criteria andTrandtaeGreaterThan(Date value) {
            addCriterion("TRANDTAE >", value, "trandtae");
            return (Criteria) this;
        }

        public Criteria andTrandtaeGreaterThanOrEqualTo(Date value) {
            addCriterion("TRANDTAE >=", value, "trandtae");
            return (Criteria) this;
        }

        public Criteria andTrandtaeLessThan(Date value) {
            addCriterion("TRANDTAE <", value, "trandtae");
            return (Criteria) this;
        }

        public Criteria andTrandtaeLessThanOrEqualTo(Date value) {
            addCriterion("TRANDTAE <=", value, "trandtae");
            return (Criteria) this;
        }

        public Criteria andTrandtaeIn(List<Date> values) {
            addCriterion("TRANDTAE in", values, "trandtae");
            return (Criteria) this;
        }

        public Criteria andTrandtaeNotIn(List<Date> values) {
            addCriterion("TRANDTAE not in", values, "trandtae");
            return (Criteria) this;
        }

        public Criteria andTrandtaeBetween(Date value1, Date value2) {
            addCriterion("TRANDTAE between", value1, value2, "trandtae");
            return (Criteria) this;
        }

        public Criteria andTrandtaeNotBetween(Date value1, Date value2) {
            addCriterion("TRANDTAE not between", value1, value2, "trandtae");
            return (Criteria) this;
        }

        public Criteria andTrantypeIsNull() {
            addCriterion("TRANTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTrantypeIsNotNull() {
            addCriterion("TRANTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTrantypeEqualTo(String value) {
            addCriterion("TRANTYPE =", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeNotEqualTo(String value) {
            addCriterion("TRANTYPE <>", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeGreaterThan(String value) {
            addCriterion("TRANTYPE >", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANTYPE >=", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeLessThan(String value) {
            addCriterion("TRANTYPE <", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeLessThanOrEqualTo(String value) {
            addCriterion("TRANTYPE <=", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeIn(List<String> values) {
            addCriterion("TRANTYPE in", values, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeNotIn(List<String> values) {
            addCriterion("TRANTYPE not in", values, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeBetween(String value1, String value2) {
            addCriterion("TRANTYPE between", value1, value2, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeNotBetween(String value1, String value2) {
            addCriterion("TRANTYPE not between", value1, value2, "trantype");
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