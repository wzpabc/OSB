package com.tup.mssql.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JOBCONFIGExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JOBCONFIGExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andConfigCodeIsNull() {
            addCriterion("CONFIG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andConfigCodeIsNotNull() {
            addCriterion("CONFIG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andConfigCodeEqualTo(String value) {
            addCriterion("CONFIG_CODE =", value, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeNotEqualTo(String value) {
            addCriterion("CONFIG_CODE <>", value, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeGreaterThan(String value) {
            addCriterion("CONFIG_CODE >", value, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIG_CODE >=", value, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeLessThan(String value) {
            addCriterion("CONFIG_CODE <", value, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeLessThanOrEqualTo(String value) {
            addCriterion("CONFIG_CODE <=", value, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeLike(String value) {
            addCriterion("CONFIG_CODE like", value, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeNotLike(String value) {
            addCriterion("CONFIG_CODE not like", value, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeIn(List<String> values) {
            addCriterion("CONFIG_CODE in", values, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeNotIn(List<String> values) {
            addCriterion("CONFIG_CODE not in", values, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeBetween(String value1, String value2) {
            addCriterion("CONFIG_CODE between", value1, value2, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeNotBetween(String value1, String value2) {
            addCriterion("CONFIG_CODE not between", value1, value2, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigNameIsNull() {
            addCriterion("CONFIG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andConfigNameIsNotNull() {
            addCriterion("CONFIG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andConfigNameEqualTo(String value) {
            addCriterion("CONFIG_NAME =", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotEqualTo(String value) {
            addCriterion("CONFIG_NAME <>", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameGreaterThan(String value) {
            addCriterion("CONFIG_NAME >", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIG_NAME >=", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLessThan(String value) {
            addCriterion("CONFIG_NAME <", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLessThanOrEqualTo(String value) {
            addCriterion("CONFIG_NAME <=", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLike(String value) {
            addCriterion("CONFIG_NAME like", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotLike(String value) {
            addCriterion("CONFIG_NAME not like", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameIn(List<String> values) {
            addCriterion("CONFIG_NAME in", values, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotIn(List<String> values) {
            addCriterion("CONFIG_NAME not in", values, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameBetween(String value1, String value2) {
            addCriterion("CONFIG_NAME between", value1, value2, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotBetween(String value1, String value2) {
            addCriterion("CONFIG_NAME not between", value1, value2, "configName");
            return (Criteria) this;
        }

        public Criteria andFreqIsNull() {
            addCriterion("FREQ is null");
            return (Criteria) this;
        }

        public Criteria andFreqIsNotNull() {
            addCriterion("FREQ is not null");
            return (Criteria) this;
        }

        public Criteria andFreqEqualTo(Integer value) {
            addCriterion("FREQ =", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotEqualTo(Integer value) {
            addCriterion("FREQ <>", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqGreaterThan(Integer value) {
            addCriterion("FREQ >", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqGreaterThanOrEqualTo(Integer value) {
            addCriterion("FREQ >=", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqLessThan(Integer value) {
            addCriterion("FREQ <", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqLessThanOrEqualTo(Integer value) {
            addCriterion("FREQ <=", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqIn(List<Integer> values) {
            addCriterion("FREQ in", values, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotIn(List<Integer> values) {
            addCriterion("FREQ not in", values, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqBetween(Integer value1, Integer value2) {
            addCriterion("FREQ between", value1, value2, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotBetween(Integer value1, Integer value2) {
            addCriterion("FREQ not between", value1, value2, "freq");
            return (Criteria) this;
        }

        public Criteria andRetryTimeIsNull() {
            addCriterion("RETRY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRetryTimeIsNotNull() {
            addCriterion("RETRY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRetryTimeEqualTo(Integer value) {
            addCriterion("RETRY_TIME =", value, "retryTime");
            return (Criteria) this;
        }

        public Criteria andRetryTimeNotEqualTo(Integer value) {
            addCriterion("RETRY_TIME <>", value, "retryTime");
            return (Criteria) this;
        }

        public Criteria andRetryTimeGreaterThan(Integer value) {
            addCriterion("RETRY_TIME >", value, "retryTime");
            return (Criteria) this;
        }

        public Criteria andRetryTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RETRY_TIME >=", value, "retryTime");
            return (Criteria) this;
        }

        public Criteria andRetryTimeLessThan(Integer value) {
            addCriterion("RETRY_TIME <", value, "retryTime");
            return (Criteria) this;
        }

        public Criteria andRetryTimeLessThanOrEqualTo(Integer value) {
            addCriterion("RETRY_TIME <=", value, "retryTime");
            return (Criteria) this;
        }

        public Criteria andRetryTimeIn(List<Integer> values) {
            addCriterion("RETRY_TIME in", values, "retryTime");
            return (Criteria) this;
        }

        public Criteria andRetryTimeNotIn(List<Integer> values) {
            addCriterion("RETRY_TIME not in", values, "retryTime");
            return (Criteria) this;
        }

        public Criteria andRetryTimeBetween(Integer value1, Integer value2) {
            addCriterion("RETRY_TIME between", value1, value2, "retryTime");
            return (Criteria) this;
        }

        public Criteria andRetryTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("RETRY_TIME not between", value1, value2, "retryTime");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andConfigStatusIsNull() {
            addCriterion("CONFIG_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andConfigStatusIsNotNull() {
            addCriterion("CONFIG_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andConfigStatusEqualTo(String value) {
            addCriterion("CONFIG_STATUS =", value, "configStatus");
            return (Criteria) this;
        }

        public Criteria andConfigStatusNotEqualTo(String value) {
            addCriterion("CONFIG_STATUS <>", value, "configStatus");
            return (Criteria) this;
        }

        public Criteria andConfigStatusGreaterThan(String value) {
            addCriterion("CONFIG_STATUS >", value, "configStatus");
            return (Criteria) this;
        }

        public Criteria andConfigStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIG_STATUS >=", value, "configStatus");
            return (Criteria) this;
        }

        public Criteria andConfigStatusLessThan(String value) {
            addCriterion("CONFIG_STATUS <", value, "configStatus");
            return (Criteria) this;
        }

        public Criteria andConfigStatusLessThanOrEqualTo(String value) {
            addCriterion("CONFIG_STATUS <=", value, "configStatus");
            return (Criteria) this;
        }

        public Criteria andConfigStatusLike(String value) {
            addCriterion("CONFIG_STATUS like", value, "configStatus");
            return (Criteria) this;
        }

        public Criteria andConfigStatusNotLike(String value) {
            addCriterion("CONFIG_STATUS not like", value, "configStatus");
            return (Criteria) this;
        }

        public Criteria andConfigStatusIn(List<String> values) {
            addCriterion("CONFIG_STATUS in", values, "configStatus");
            return (Criteria) this;
        }

        public Criteria andConfigStatusNotIn(List<String> values) {
            addCriterion("CONFIG_STATUS not in", values, "configStatus");
            return (Criteria) this;
        }

        public Criteria andConfigStatusBetween(String value1, String value2) {
            addCriterion("CONFIG_STATUS between", value1, value2, "configStatus");
            return (Criteria) this;
        }

        public Criteria andConfigStatusNotBetween(String value1, String value2) {
            addCriterion("CONFIG_STATUS not between", value1, value2, "configStatus");
            return (Criteria) this;
        }

        public Criteria andKtrNameIsNull() {
            addCriterion("KTR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andKtrNameIsNotNull() {
            addCriterion("KTR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andKtrNameEqualTo(String value) {
            addCriterion("KTR_NAME =", value, "ktrName");
            return (Criteria) this;
        }

        public Criteria andKtrNameNotEqualTo(String value) {
            addCriterion("KTR_NAME <>", value, "ktrName");
            return (Criteria) this;
        }

        public Criteria andKtrNameGreaterThan(String value) {
            addCriterion("KTR_NAME >", value, "ktrName");
            return (Criteria) this;
        }

        public Criteria andKtrNameGreaterThanOrEqualTo(String value) {
            addCriterion("KTR_NAME >=", value, "ktrName");
            return (Criteria) this;
        }

        public Criteria andKtrNameLessThan(String value) {
            addCriterion("KTR_NAME <", value, "ktrName");
            return (Criteria) this;
        }

        public Criteria andKtrNameLessThanOrEqualTo(String value) {
            addCriterion("KTR_NAME <=", value, "ktrName");
            return (Criteria) this;
        }

        public Criteria andKtrNameLike(String value) {
            addCriterion("KTR_NAME like", value, "ktrName");
            return (Criteria) this;
        }

        public Criteria andKtrNameNotLike(String value) {
            addCriterion("KTR_NAME not like", value, "ktrName");
            return (Criteria) this;
        }

        public Criteria andKtrNameIn(List<String> values) {
            addCriterion("KTR_NAME in", values, "ktrName");
            return (Criteria) this;
        }

        public Criteria andKtrNameNotIn(List<String> values) {
            addCriterion("KTR_NAME not in", values, "ktrName");
            return (Criteria) this;
        }

        public Criteria andKtrNameBetween(String value1, String value2) {
            addCriterion("KTR_NAME between", value1, value2, "ktrName");
            return (Criteria) this;
        }

        public Criteria andKtrNameNotBetween(String value1, String value2) {
            addCriterion("KTR_NAME not between", value1, value2, "ktrName");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRunStatusIsNull() {
            addCriterion("run_status is null");
            return (Criteria) this;
        }

        public Criteria andRunStatusIsNotNull() {
            addCriterion("run_status is not null");
            return (Criteria) this;
        }

        public Criteria andRunStatusEqualTo(String value) {
            addCriterion("run_status =", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusNotEqualTo(String value) {
            addCriterion("run_status <>", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusGreaterThan(String value) {
            addCriterion("run_status >", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusGreaterThanOrEqualTo(String value) {
            addCriterion("run_status >=", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusLessThan(String value) {
            addCriterion("run_status <", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusLessThanOrEqualTo(String value) {
            addCriterion("run_status <=", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusLike(String value) {
            addCriterion("run_status like", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusNotLike(String value) {
            addCriterion("run_status not like", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusIn(List<String> values) {
            addCriterion("run_status in", values, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusNotIn(List<String> values) {
            addCriterion("run_status not in", values, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusBetween(String value1, String value2) {
            addCriterion("run_status between", value1, value2, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusNotBetween(String value1, String value2) {
            addCriterion("run_status not between", value1, value2, "runStatus");
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