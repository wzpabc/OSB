package com.tup.mssql.model;


import java.util.Date;

public class ERRORDATA {
    private Long id;

    private String errorTable;

    private String dataCol;

    private String dataKey;

    private Integer errorNum;

    private String errorCol;

    private String errorCode;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private String errorDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getErrorTable() {
        return errorTable;
    }

    public void setErrorTable(String errorTable) {
        this.errorTable = errorTable == null ? null : errorTable.trim();
    }

    public String getDataCol() {
        return dataCol;
    }

    public void setDataCol(String dataCol) {
        this.dataCol = dataCol == null ? null : dataCol.trim();
    }

    public String getDataKey() {
        return dataKey;
    }

    public void setDataKey(String dataKey) {
        this.dataKey = dataKey == null ? null : dataKey.trim();
    }

    public Integer getErrorNum() {
        return errorNum;
    }

    public void setErrorNum(Integer errorNum) {
        this.errorNum = errorNum;
    }

    public String getErrorCol() {
        return errorCol;
    }

    public void setErrorCol(String errorCol) {
        this.errorCol = errorCol == null ? null : errorCol.trim();
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode == null ? null : errorCode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc == null ? null : errorDesc.trim();
    }
}