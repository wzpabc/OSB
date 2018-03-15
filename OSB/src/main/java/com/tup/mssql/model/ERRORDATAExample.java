package com.tup.mssql.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ERRORDATAExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ERRORDATAExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andErrorTableIsNull() {
            addCriterion("ERROR_TABLE is null");
            return (Criteria) this;
        }

        public Criteria andErrorTableIsNotNull() {
            addCriterion("ERROR_TABLE is not null");
            return (Criteria) this;
        }

        public Criteria andErrorTableEqualTo(String value) {
            addCriterion("ERROR_TABLE =", value, "errorTable");
            return (Criteria) this;
        }

        public Criteria andErrorTableNotEqualTo(String value) {
            addCriterion("ERROR_TABLE <>", value, "errorTable");
            return (Criteria) this;
        }

        public Criteria andErrorTableGreaterThan(String value) {
            addCriterion("ERROR_TABLE >", value, "errorTable");
            return (Criteria) this;
        }

        public Criteria andErrorTableGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_TABLE >=", value, "errorTable");
            return (Criteria) this;
        }

        public Criteria andErrorTableLessThan(String value) {
            addCriterion("ERROR_TABLE <", value, "errorTable");
            return (Criteria) this;
        }

        public Criteria andErrorTableLessThanOrEqualTo(String value) {
            addCriterion("ERROR_TABLE <=", value, "errorTable");
            return (Criteria) this;
        }

        public Criteria andErrorTableLike(String value) {
            addCriterion("ERROR_TABLE like", value, "errorTable");
            return (Criteria) this;
        }

        public Criteria andErrorTableNotLike(String value) {
            addCriterion("ERROR_TABLE not like", value, "errorTable");
            return (Criteria) this;
        }

        public Criteria andErrorTableIn(List<String> values) {
            addCriterion("ERROR_TABLE in", values, "errorTable");
            return (Criteria) this;
        }

        public Criteria andErrorTableNotIn(List<String> values) {
            addCriterion("ERROR_TABLE not in", values, "errorTable");
            return (Criteria) this;
        }

        public Criteria andErrorTableBetween(String value1, String value2) {
            addCriterion("ERROR_TABLE between", value1, value2, "errorTable");
            return (Criteria) this;
        }

        public Criteria andErrorTableNotBetween(String value1, String value2) {
            addCriterion("ERROR_TABLE not between", value1, value2, "errorTable");
            return (Criteria) this;
        }

        public Criteria andDataColIsNull() {
            addCriterion("DATA_COL is null");
            return (Criteria) this;
        }

        public Criteria andDataColIsNotNull() {
            addCriterion("DATA_COL is not null");
            return (Criteria) this;
        }

        public Criteria andDataColEqualTo(String value) {
            addCriterion("DATA_COL =", value, "dataCol");
            return (Criteria) this;
        }

        public Criteria andDataColNotEqualTo(String value) {
            addCriterion("DATA_COL <>", value, "dataCol");
            return (Criteria) this;
        }

        public Criteria andDataColGreaterThan(String value) {
            addCriterion("DATA_COL >", value, "dataCol");
            return (Criteria) this;
        }

        public Criteria andDataColGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_COL >=", value, "dataCol");
            return (Criteria) this;
        }

        public Criteria andDataColLessThan(String value) {
            addCriterion("DATA_COL <", value, "dataCol");
            return (Criteria) this;
        }

        public Criteria andDataColLessThanOrEqualTo(String value) {
            addCriterion("DATA_COL <=", value, "dataCol");
            return (Criteria) this;
        }

        public Criteria andDataColLike(String value) {
            addCriterion("DATA_COL like", value, "dataCol");
            return (Criteria) this;
        }

        public Criteria andDataColNotLike(String value) {
            addCriterion("DATA_COL not like", value, "dataCol");
            return (Criteria) this;
        }

        public Criteria andDataColIn(List<String> values) {
            addCriterion("DATA_COL in", values, "dataCol");
            return (Criteria) this;
        }

        public Criteria andDataColNotIn(List<String> values) {
            addCriterion("DATA_COL not in", values, "dataCol");
            return (Criteria) this;
        }

        public Criteria andDataColBetween(String value1, String value2) {
            addCriterion("DATA_COL between", value1, value2, "dataCol");
            return (Criteria) this;
        }

        public Criteria andDataColNotBetween(String value1, String value2) {
            addCriterion("DATA_COL not between", value1, value2, "dataCol");
            return (Criteria) this;
        }

        public Criteria andDataKeyIsNull() {
            addCriterion("DATA_KEY is null");
            return (Criteria) this;
        }

        public Criteria andDataKeyIsNotNull() {
            addCriterion("DATA_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andDataKeyEqualTo(String value) {
            addCriterion("DATA_KEY =", value, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyNotEqualTo(String value) {
            addCriterion("DATA_KEY <>", value, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyGreaterThan(String value) {
            addCriterion("DATA_KEY >", value, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_KEY >=", value, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyLessThan(String value) {
            addCriterion("DATA_KEY <", value, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyLessThanOrEqualTo(String value) {
            addCriterion("DATA_KEY <=", value, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyLike(String value) {
            addCriterion("DATA_KEY like", value, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyNotLike(String value) {
            addCriterion("DATA_KEY not like", value, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyIn(List<String> values) {
            addCriterion("DATA_KEY in", values, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyNotIn(List<String> values) {
            addCriterion("DATA_KEY not in", values, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyBetween(String value1, String value2) {
            addCriterion("DATA_KEY between", value1, value2, "dataKey");
            return (Criteria) this;
        }

        public Criteria andDataKeyNotBetween(String value1, String value2) {
            addCriterion("DATA_KEY not between", value1, value2, "dataKey");
            return (Criteria) this;
        }

        public Criteria andErrorNumIsNull() {
            addCriterion("ERROR_NUM is null");
            return (Criteria) this;
        }

        public Criteria andErrorNumIsNotNull() {
            addCriterion("ERROR_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andErrorNumEqualTo(Integer value) {
            addCriterion("ERROR_NUM =", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumNotEqualTo(Integer value) {
            addCriterion("ERROR_NUM <>", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumGreaterThan(Integer value) {
            addCriterion("ERROR_NUM >", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ERROR_NUM >=", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumLessThan(Integer value) {
            addCriterion("ERROR_NUM <", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumLessThanOrEqualTo(Integer value) {
            addCriterion("ERROR_NUM <=", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumIn(List<Integer> values) {
            addCriterion("ERROR_NUM in", values, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumNotIn(List<Integer> values) {
            addCriterion("ERROR_NUM not in", values, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumBetween(Integer value1, Integer value2) {
            addCriterion("ERROR_NUM between", value1, value2, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ERROR_NUM not between", value1, value2, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorColIsNull() {
            addCriterion("ERROR_COL is null");
            return (Criteria) this;
        }

        public Criteria andErrorColIsNotNull() {
            addCriterion("ERROR_COL is not null");
            return (Criteria) this;
        }

        public Criteria andErrorColEqualTo(String value) {
            addCriterion("ERROR_COL =", value, "errorCol");
            return (Criteria) this;
        }

        public Criteria andErrorColNotEqualTo(String value) {
            addCriterion("ERROR_COL <>", value, "errorCol");
            return (Criteria) this;
        }

        public Criteria andErrorColGreaterThan(String value) {
            addCriterion("ERROR_COL >", value, "errorCol");
            return (Criteria) this;
        }

        public Criteria andErrorColGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_COL >=", value, "errorCol");
            return (Criteria) this;
        }

        public Criteria andErrorColLessThan(String value) {
            addCriterion("ERROR_COL <", value, "errorCol");
            return (Criteria) this;
        }

        public Criteria andErrorColLessThanOrEqualTo(String value) {
            addCriterion("ERROR_COL <=", value, "errorCol");
            return (Criteria) this;
        }

        public Criteria andErrorColLike(String value) {
            addCriterion("ERROR_COL like", value, "errorCol");
            return (Criteria) this;
        }

        public Criteria andErrorColNotLike(String value) {
            addCriterion("ERROR_COL not like", value, "errorCol");
            return (Criteria) this;
        }

        public Criteria andErrorColIn(List<String> values) {
            addCriterion("ERROR_COL in", values, "errorCol");
            return (Criteria) this;
        }

        public Criteria andErrorColNotIn(List<String> values) {
            addCriterion("ERROR_COL not in", values, "errorCol");
            return (Criteria) this;
        }

        public Criteria andErrorColBetween(String value1, String value2) {
            addCriterion("ERROR_COL between", value1, value2, "errorCol");
            return (Criteria) this;
        }

        public Criteria andErrorColNotBetween(String value1, String value2) {
            addCriterion("ERROR_COL not between", value1, value2, "errorCol");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNull() {
            addCriterion("ERROR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNotNull() {
            addCriterion("ERROR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeEqualTo(String value) {
            addCriterion("ERROR_CODE =", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotEqualTo(String value) {
            addCriterion("ERROR_CODE <>", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThan(String value) {
            addCriterion("ERROR_CODE >", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_CODE >=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThan(String value) {
            addCriterion("ERROR_CODE <", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThanOrEqualTo(String value) {
            addCriterion("ERROR_CODE <=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLike(String value) {
            addCriterion("ERROR_CODE like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotLike(String value) {
            addCriterion("ERROR_CODE not like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIn(List<String> values) {
            addCriterion("ERROR_CODE in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotIn(List<String> values) {
            addCriterion("ERROR_CODE not in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeBetween(String value1, String value2) {
            addCriterion("ERROR_CODE between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotBetween(String value1, String value2) {
            addCriterion("ERROR_CODE not between", value1, value2, "errorCode");
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