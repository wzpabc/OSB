package com.tup.mssql.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TRANLOGExample  {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TRANLOGExample() {
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

        public Criteria andIdBatchIsNull() {
            addCriterion("ID_BATCH is null");
            return (Criteria) this;
        }

        public Criteria andIdBatchIsNotNull() {
            addCriterion("ID_BATCH is not null");
            return (Criteria) this;
        }

        public Criteria andIdBatchEqualTo(Integer value) {
            addCriterion("ID_BATCH =", value, "idBatch");
            return (Criteria) this;
        }

        public Criteria andIdBatchNotEqualTo(Integer value) {
            addCriterion("ID_BATCH <>", value, "idBatch");
            return (Criteria) this;
        }

        public Criteria andIdBatchGreaterThan(Integer value) {
            addCriterion("ID_BATCH >", value, "idBatch");
            return (Criteria) this;
        }

        public Criteria andIdBatchGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_BATCH >=", value, "idBatch");
            return (Criteria) this;
        }

        public Criteria andIdBatchLessThan(Integer value) {
            addCriterion("ID_BATCH <", value, "idBatch");
            return (Criteria) this;
        }

        public Criteria andIdBatchLessThanOrEqualTo(Integer value) {
            addCriterion("ID_BATCH <=", value, "idBatch");
            return (Criteria) this;
        }

        public Criteria andIdBatchIn(List<Integer> values) {
            addCriterion("ID_BATCH in", values, "idBatch");
            return (Criteria) this;
        }

        public Criteria andIdBatchNotIn(List<Integer> values) {
            addCriterion("ID_BATCH not in", values, "idBatch");
            return (Criteria) this;
        }

        public Criteria andIdBatchBetween(Integer value1, Integer value2) {
            addCriterion("ID_BATCH between", value1, value2, "idBatch");
            return (Criteria) this;
        }

        public Criteria andIdBatchNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_BATCH not between", value1, value2, "idBatch");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(String value) {
            addCriterion("CHANNEL_ID =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(String value) {
            addCriterion("CHANNEL_ID <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(String value) {
            addCriterion("CHANNEL_ID >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_ID >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(String value) {
            addCriterion("CHANNEL_ID <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_ID <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLike(String value) {
            addCriterion("CHANNEL_ID like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotLike(String value) {
            addCriterion("CHANNEL_ID not like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<String> values) {
            addCriterion("CHANNEL_ID in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<String> values) {
            addCriterion("CHANNEL_ID not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(String value1, String value2) {
            addCriterion("CHANNEL_ID between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_ID not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andTransnameIsNull() {
            addCriterion("TRANSNAME is null");
            return (Criteria) this;
        }

        public Criteria andTransnameIsNotNull() {
            addCriterion("TRANSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTransnameEqualTo(String value) {
            addCriterion("TRANSNAME =", value, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameNotEqualTo(String value) {
            addCriterion("TRANSNAME <>", value, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameGreaterThan(String value) {
            addCriterion("TRANSNAME >", value, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSNAME >=", value, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameLessThan(String value) {
            addCriterion("TRANSNAME <", value, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameLessThanOrEqualTo(String value) {
            addCriterion("TRANSNAME <=", value, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameLike(String value) {
            addCriterion("TRANSNAME like", value, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameNotLike(String value) {
            addCriterion("TRANSNAME not like", value, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameIn(List<String> values) {
            addCriterion("TRANSNAME in", values, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameNotIn(List<String> values) {
            addCriterion("TRANSNAME not in", values, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameBetween(String value1, String value2) {
            addCriterion("TRANSNAME between", value1, value2, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameNotBetween(String value1, String value2) {
            addCriterion("TRANSNAME not between", value1, value2, "transname");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLinesReadIsNull() {
            addCriterion("LINES_READ is null");
            return (Criteria) this;
        }

        public Criteria andLinesReadIsNotNull() {
            addCriterion("LINES_READ is not null");
            return (Criteria) this;
        }

        public Criteria andLinesReadEqualTo(Long value) {
            addCriterion("LINES_READ =", value, "linesRead");
            return (Criteria) this;
        }

        public Criteria andLinesReadNotEqualTo(Long value) {
            addCriterion("LINES_READ <>", value, "linesRead");
            return (Criteria) this;
        }

        public Criteria andLinesReadGreaterThan(Long value) {
            addCriterion("LINES_READ >", value, "linesRead");
            return (Criteria) this;
        }

        public Criteria andLinesReadGreaterThanOrEqualTo(Long value) {
            addCriterion("LINES_READ >=", value, "linesRead");
            return (Criteria) this;
        }

        public Criteria andLinesReadLessThan(Long value) {
            addCriterion("LINES_READ <", value, "linesRead");
            return (Criteria) this;
        }

        public Criteria andLinesReadLessThanOrEqualTo(Long value) {
            addCriterion("LINES_READ <=", value, "linesRead");
            return (Criteria) this;
        }

        public Criteria andLinesReadIn(List<Long> values) {
            addCriterion("LINES_READ in", values, "linesRead");
            return (Criteria) this;
        }

        public Criteria andLinesReadNotIn(List<Long> values) {
            addCriterion("LINES_READ not in", values, "linesRead");
            return (Criteria) this;
        }

        public Criteria andLinesReadBetween(Long value1, Long value2) {
            addCriterion("LINES_READ between", value1, value2, "linesRead");
            return (Criteria) this;
        }

        public Criteria andLinesReadNotBetween(Long value1, Long value2) {
            addCriterion("LINES_READ not between", value1, value2, "linesRead");
            return (Criteria) this;
        }

        public Criteria andLinesWrittenIsNull() {
            addCriterion("LINES_WRITTEN is null");
            return (Criteria) this;
        }

        public Criteria andLinesWrittenIsNotNull() {
            addCriterion("LINES_WRITTEN is not null");
            return (Criteria) this;
        }

        public Criteria andLinesWrittenEqualTo(Long value) {
            addCriterion("LINES_WRITTEN =", value, "linesWritten");
            return (Criteria) this;
        }

        public Criteria andLinesWrittenNotEqualTo(Long value) {
            addCriterion("LINES_WRITTEN <>", value, "linesWritten");
            return (Criteria) this;
        }

        public Criteria andLinesWrittenGreaterThan(Long value) {
            addCriterion("LINES_WRITTEN >", value, "linesWritten");
            return (Criteria) this;
        }

        public Criteria andLinesWrittenGreaterThanOrEqualTo(Long value) {
            addCriterion("LINES_WRITTEN >=", value, "linesWritten");
            return (Criteria) this;
        }

        public Criteria andLinesWrittenLessThan(Long value) {
            addCriterion("LINES_WRITTEN <", value, "linesWritten");
            return (Criteria) this;
        }

        public Criteria andLinesWrittenLessThanOrEqualTo(Long value) {
            addCriterion("LINES_WRITTEN <=", value, "linesWritten");
            return (Criteria) this;
        }

        public Criteria andLinesWrittenIn(List<Long> values) {
            addCriterion("LINES_WRITTEN in", values, "linesWritten");
            return (Criteria) this;
        }

        public Criteria andLinesWrittenNotIn(List<Long> values) {
            addCriterion("LINES_WRITTEN not in", values, "linesWritten");
            return (Criteria) this;
        }

        public Criteria andLinesWrittenBetween(Long value1, Long value2) {
            addCriterion("LINES_WRITTEN between", value1, value2, "linesWritten");
            return (Criteria) this;
        }

        public Criteria andLinesWrittenNotBetween(Long value1, Long value2) {
            addCriterion("LINES_WRITTEN not between", value1, value2, "linesWritten");
            return (Criteria) this;
        }

        public Criteria andLinesUpdatedIsNull() {
            addCriterion("LINES_UPDATED is null");
            return (Criteria) this;
        }

        public Criteria andLinesUpdatedIsNotNull() {
            addCriterion("LINES_UPDATED is not null");
            return (Criteria) this;
        }

        public Criteria andLinesUpdatedEqualTo(Long value) {
            addCriterion("LINES_UPDATED =", value, "linesUpdated");
            return (Criteria) this;
        }

        public Criteria andLinesUpdatedNotEqualTo(Long value) {
            addCriterion("LINES_UPDATED <>", value, "linesUpdated");
            return (Criteria) this;
        }

        public Criteria andLinesUpdatedGreaterThan(Long value) {
            addCriterion("LINES_UPDATED >", value, "linesUpdated");
            return (Criteria) this;
        }

        public Criteria andLinesUpdatedGreaterThanOrEqualTo(Long value) {
            addCriterion("LINES_UPDATED >=", value, "linesUpdated");
            return (Criteria) this;
        }

        public Criteria andLinesUpdatedLessThan(Long value) {
            addCriterion("LINES_UPDATED <", value, "linesUpdated");
            return (Criteria) this;
        }

        public Criteria andLinesUpdatedLessThanOrEqualTo(Long value) {
            addCriterion("LINES_UPDATED <=", value, "linesUpdated");
            return (Criteria) this;
        }

        public Criteria andLinesUpdatedIn(List<Long> values) {
            addCriterion("LINES_UPDATED in", values, "linesUpdated");
            return (Criteria) this;
        }

        public Criteria andLinesUpdatedNotIn(List<Long> values) {
            addCriterion("LINES_UPDATED not in", values, "linesUpdated");
            return (Criteria) this;
        }

        public Criteria andLinesUpdatedBetween(Long value1, Long value2) {
            addCriterion("LINES_UPDATED between", value1, value2, "linesUpdated");
            return (Criteria) this;
        }

        public Criteria andLinesUpdatedNotBetween(Long value1, Long value2) {
            addCriterion("LINES_UPDATED not between", value1, value2, "linesUpdated");
            return (Criteria) this;
        }

        public Criteria andLinesInputIsNull() {
            addCriterion("LINES_INPUT is null");
            return (Criteria) this;
        }

        public Criteria andLinesInputIsNotNull() {
            addCriterion("LINES_INPUT is not null");
            return (Criteria) this;
        }

        public Criteria andLinesInputEqualTo(Long value) {
            addCriterion("LINES_INPUT =", value, "linesInput");
            return (Criteria) this;
        }

        public Criteria andLinesInputNotEqualTo(Long value) {
            addCriterion("LINES_INPUT <>", value, "linesInput");
            return (Criteria) this;
        }

        public Criteria andLinesInputGreaterThan(Long value) {
            addCriterion("LINES_INPUT >", value, "linesInput");
            return (Criteria) this;
        }

        public Criteria andLinesInputGreaterThanOrEqualTo(Long value) {
            addCriterion("LINES_INPUT >=", value, "linesInput");
            return (Criteria) this;
        }

        public Criteria andLinesInputLessThan(Long value) {
            addCriterion("LINES_INPUT <", value, "linesInput");
            return (Criteria) this;
        }

        public Criteria andLinesInputLessThanOrEqualTo(Long value) {
            addCriterion("LINES_INPUT <=", value, "linesInput");
            return (Criteria) this;
        }

        public Criteria andLinesInputIn(List<Long> values) {
            addCriterion("LINES_INPUT in", values, "linesInput");
            return (Criteria) this;
        }

        public Criteria andLinesInputNotIn(List<Long> values) {
            addCriterion("LINES_INPUT not in", values, "linesInput");
            return (Criteria) this;
        }

        public Criteria andLinesInputBetween(Long value1, Long value2) {
            addCriterion("LINES_INPUT between", value1, value2, "linesInput");
            return (Criteria) this;
        }

        public Criteria andLinesInputNotBetween(Long value1, Long value2) {
            addCriterion("LINES_INPUT not between", value1, value2, "linesInput");
            return (Criteria) this;
        }

        public Criteria andLinesOutputIsNull() {
            addCriterion("LINES_OUTPUT is null");
            return (Criteria) this;
        }

        public Criteria andLinesOutputIsNotNull() {
            addCriterion("LINES_OUTPUT is not null");
            return (Criteria) this;
        }

        public Criteria andLinesOutputEqualTo(Long value) {
            addCriterion("LINES_OUTPUT =", value, "linesOutput");
            return (Criteria) this;
        }

        public Criteria andLinesOutputNotEqualTo(Long value) {
            addCriterion("LINES_OUTPUT <>", value, "linesOutput");
            return (Criteria) this;
        }

        public Criteria andLinesOutputGreaterThan(Long value) {
            addCriterion("LINES_OUTPUT >", value, "linesOutput");
            return (Criteria) this;
        }

        public Criteria andLinesOutputGreaterThanOrEqualTo(Long value) {
            addCriterion("LINES_OUTPUT >=", value, "linesOutput");
            return (Criteria) this;
        }

        public Criteria andLinesOutputLessThan(Long value) {
            addCriterion("LINES_OUTPUT <", value, "linesOutput");
            return (Criteria) this;
        }

        public Criteria andLinesOutputLessThanOrEqualTo(Long value) {
            addCriterion("LINES_OUTPUT <=", value, "linesOutput");
            return (Criteria) this;
        }

        public Criteria andLinesOutputIn(List<Long> values) {
            addCriterion("LINES_OUTPUT in", values, "linesOutput");
            return (Criteria) this;
        }

        public Criteria andLinesOutputNotIn(List<Long> values) {
            addCriterion("LINES_OUTPUT not in", values, "linesOutput");
            return (Criteria) this;
        }

        public Criteria andLinesOutputBetween(Long value1, Long value2) {
            addCriterion("LINES_OUTPUT between", value1, value2, "linesOutput");
            return (Criteria) this;
        }

        public Criteria andLinesOutputNotBetween(Long value1, Long value2) {
            addCriterion("LINES_OUTPUT not between", value1, value2, "linesOutput");
            return (Criteria) this;
        }

        public Criteria andLinesRejectedIsNull() {
            addCriterion("LINES_REJECTED is null");
            return (Criteria) this;
        }

        public Criteria andLinesRejectedIsNotNull() {
            addCriterion("LINES_REJECTED is not null");
            return (Criteria) this;
        }

        public Criteria andLinesRejectedEqualTo(Long value) {
            addCriterion("LINES_REJECTED =", value, "linesRejected");
            return (Criteria) this;
        }

        public Criteria andLinesRejectedNotEqualTo(Long value) {
            addCriterion("LINES_REJECTED <>", value, "linesRejected");
            return (Criteria) this;
        }

        public Criteria andLinesRejectedGreaterThan(Long value) {
            addCriterion("LINES_REJECTED >", value, "linesRejected");
            return (Criteria) this;
        }

        public Criteria andLinesRejectedGreaterThanOrEqualTo(Long value) {
            addCriterion("LINES_REJECTED >=", value, "linesRejected");
            return (Criteria) this;
        }

        public Criteria andLinesRejectedLessThan(Long value) {
            addCriterion("LINES_REJECTED <", value, "linesRejected");
            return (Criteria) this;
        }

        public Criteria andLinesRejectedLessThanOrEqualTo(Long value) {
            addCriterion("LINES_REJECTED <=", value, "linesRejected");
            return (Criteria) this;
        }

        public Criteria andLinesRejectedIn(List<Long> values) {
            addCriterion("LINES_REJECTED in", values, "linesRejected");
            return (Criteria) this;
        }

        public Criteria andLinesRejectedNotIn(List<Long> values) {
            addCriterion("LINES_REJECTED not in", values, "linesRejected");
            return (Criteria) this;
        }

        public Criteria andLinesRejectedBetween(Long value1, Long value2) {
            addCriterion("LINES_REJECTED between", value1, value2, "linesRejected");
            return (Criteria) this;
        }

        public Criteria andLinesRejectedNotBetween(Long value1, Long value2) {
            addCriterion("LINES_REJECTED not between", value1, value2, "linesRejected");
            return (Criteria) this;
        }

        public Criteria andErrorsIsNull() {
            addCriterion("ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andErrorsIsNotNull() {
            addCriterion("ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andErrorsEqualTo(Long value) {
            addCriterion("ERRORS =", value, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsNotEqualTo(Long value) {
            addCriterion("ERRORS <>", value, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsGreaterThan(Long value) {
            addCriterion("ERRORS >", value, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("ERRORS >=", value, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsLessThan(Long value) {
            addCriterion("ERRORS <", value, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsLessThanOrEqualTo(Long value) {
            addCriterion("ERRORS <=", value, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsIn(List<Long> values) {
            addCriterion("ERRORS in", values, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsNotIn(List<Long> values) {
            addCriterion("ERRORS not in", values, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsBetween(Long value1, Long value2) {
            addCriterion("ERRORS between", value1, value2, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsNotBetween(Long value1, Long value2) {
            addCriterion("ERRORS not between", value1, value2, "errors");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("STARTDATE =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("STARTDATE <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("STARTDATE >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("STARTDATE >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("STARTDATE <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("STARTDATE <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("STARTDATE in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("STARTDATE not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("STARTDATE between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("STARTDATE not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("ENDDATE =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("ENDDATE <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("ENDDATE >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("ENDDATE >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("ENDDATE <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("ENDDATE <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("ENDDATE in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("ENDDATE not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("ENDDATE between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("ENDDATE not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andLogdateIsNull() {
            addCriterion("LOGDATE is null");
            return (Criteria) this;
        }

        public Criteria andLogdateIsNotNull() {
            addCriterion("LOGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLogdateEqualTo(Date value) {
            addCriterion("LOGDATE =", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateNotEqualTo(Date value) {
            addCriterion("LOGDATE <>", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateGreaterThan(Date value) {
            addCriterion("LOGDATE >", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateGreaterThanOrEqualTo(Date value) {
            addCriterion("LOGDATE >=", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateLessThan(Date value) {
            addCriterion("LOGDATE <", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateLessThanOrEqualTo(Date value) {
            addCriterion("LOGDATE <=", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateIn(List<Date> values) {
            addCriterion("LOGDATE in", values, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateNotIn(List<Date> values) {
            addCriterion("LOGDATE not in", values, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateBetween(Date value1, Date value2) {
            addCriterion("LOGDATE between", value1, value2, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateNotBetween(Date value1, Date value2) {
            addCriterion("LOGDATE not between", value1, value2, "logdate");
            return (Criteria) this;
        }

        public Criteria andDepdateIsNull() {
            addCriterion("DEPDATE is null");
            return (Criteria) this;
        }

        public Criteria andDepdateIsNotNull() {
            addCriterion("DEPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDepdateEqualTo(Date value) {
            addCriterion("DEPDATE =", value, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateNotEqualTo(Date value) {
            addCriterion("DEPDATE <>", value, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateGreaterThan(Date value) {
            addCriterion("DEPDATE >", value, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateGreaterThanOrEqualTo(Date value) {
            addCriterion("DEPDATE >=", value, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateLessThan(Date value) {
            addCriterion("DEPDATE <", value, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateLessThanOrEqualTo(Date value) {
            addCriterion("DEPDATE <=", value, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateIn(List<Date> values) {
            addCriterion("DEPDATE in", values, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateNotIn(List<Date> values) {
            addCriterion("DEPDATE not in", values, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateBetween(Date value1, Date value2) {
            addCriterion("DEPDATE between", value1, value2, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateNotBetween(Date value1, Date value2) {
            addCriterion("DEPDATE not between", value1, value2, "depdate");
            return (Criteria) this;
        }

        public Criteria andReplaydateIsNull() {
            addCriterion("REPLAYDATE is null");
            return (Criteria) this;
        }

        public Criteria andReplaydateIsNotNull() {
            addCriterion("REPLAYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andReplaydateEqualTo(Date value) {
            addCriterion("REPLAYDATE =", value, "replaydate");
            return (Criteria) this;
        }

        public Criteria andReplaydateNotEqualTo(Date value) {
            addCriterion("REPLAYDATE <>", value, "replaydate");
            return (Criteria) this;
        }

        public Criteria andReplaydateGreaterThan(Date value) {
            addCriterion("REPLAYDATE >", value, "replaydate");
            return (Criteria) this;
        }

        public Criteria andReplaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("REPLAYDATE >=", value, "replaydate");
            return (Criteria) this;
        }

        public Criteria andReplaydateLessThan(Date value) {
            addCriterion("REPLAYDATE <", value, "replaydate");
            return (Criteria) this;
        }

        public Criteria andReplaydateLessThanOrEqualTo(Date value) {
            addCriterion("REPLAYDATE <=", value, "replaydate");
            return (Criteria) this;
        }

        public Criteria andReplaydateIn(List<Date> values) {
            addCriterion("REPLAYDATE in", values, "replaydate");
            return (Criteria) this;
        }

        public Criteria andReplaydateNotIn(List<Date> values) {
            addCriterion("REPLAYDATE not in", values, "replaydate");
            return (Criteria) this;
        }

        public Criteria andReplaydateBetween(Date value1, Date value2) {
            addCriterion("REPLAYDATE between", value1, value2, "replaydate");
            return (Criteria) this;
        }

        public Criteria andReplaydateNotBetween(Date value1, Date value2) {
            addCriterion("REPLAYDATE not between", value1, value2, "replaydate");
            return (Criteria) this;
        }

        public Criteria andExecutingServerIsNull() {
            addCriterion("EXECUTING_SERVER is null");
            return (Criteria) this;
        }

        public Criteria andExecutingServerIsNotNull() {
            addCriterion("EXECUTING_SERVER is not null");
            return (Criteria) this;
        }

        public Criteria andExecutingServerEqualTo(String value) {
            addCriterion("EXECUTING_SERVER =", value, "executingServer");
            return (Criteria) this;
        }

        public Criteria andExecutingServerNotEqualTo(String value) {
            addCriterion("EXECUTING_SERVER <>", value, "executingServer");
            return (Criteria) this;
        }

        public Criteria andExecutingServerGreaterThan(String value) {
            addCriterion("EXECUTING_SERVER >", value, "executingServer");
            return (Criteria) this;
        }

        public Criteria andExecutingServerGreaterThanOrEqualTo(String value) {
            addCriterion("EXECUTING_SERVER >=", value, "executingServer");
            return (Criteria) this;
        }

        public Criteria andExecutingServerLessThan(String value) {
            addCriterion("EXECUTING_SERVER <", value, "executingServer");
            return (Criteria) this;
        }

        public Criteria andExecutingServerLessThanOrEqualTo(String value) {
            addCriterion("EXECUTING_SERVER <=", value, "executingServer");
            return (Criteria) this;
        }

        public Criteria andExecutingServerLike(String value) {
            addCriterion("EXECUTING_SERVER like", value, "executingServer");
            return (Criteria) this;
        }

        public Criteria andExecutingServerNotLike(String value) {
            addCriterion("EXECUTING_SERVER not like", value, "executingServer");
            return (Criteria) this;
        }

        public Criteria andExecutingServerIn(List<String> values) {
            addCriterion("EXECUTING_SERVER in", values, "executingServer");
            return (Criteria) this;
        }

        public Criteria andExecutingServerNotIn(List<String> values) {
            addCriterion("EXECUTING_SERVER not in", values, "executingServer");
            return (Criteria) this;
        }

        public Criteria andExecutingServerBetween(String value1, String value2) {
            addCriterion("EXECUTING_SERVER between", value1, value2, "executingServer");
            return (Criteria) this;
        }

        public Criteria andExecutingServerNotBetween(String value1, String value2) {
            addCriterion("EXECUTING_SERVER not between", value1, value2, "executingServer");
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