package com.tup.mssql.model;


import java.util.Date;

public class DMLSOURCE {
    private Integer dmlId;

    private String dmlCurrentUser;

    private Integer dmlSpid;

    private String dmlHostName;

    private String dmlAppname;

    private Date dmlDate;

    private String dmlTsql;

    public Integer getDmlId() {
        return dmlId;
    }

    public void setDmlId(Integer dmlId) {
        this.dmlId = dmlId;
    }

    public String getDmlCurrentUser() {
        return dmlCurrentUser;
    }

    public void setDmlCurrentUser(String dmlCurrentUser) {
        this.dmlCurrentUser = dmlCurrentUser == null ? null : dmlCurrentUser.trim();
    }

    public Integer getDmlSpid() {
        return dmlSpid;
    }

    public void setDmlSpid(Integer dmlSpid) {
        this.dmlSpid = dmlSpid;
    }

    public String getDmlHostName() {
        return dmlHostName;
    }

    public void setDmlHostName(String dmlHostName) {
        this.dmlHostName = dmlHostName == null ? null : dmlHostName.trim();
    }

    public String getDmlAppname() {
        return dmlAppname;
    }

    public void setDmlAppname(String dmlAppname) {
        this.dmlAppname = dmlAppname == null ? null : dmlAppname.trim();
    }

    public Date getDmlDate() {
        return dmlDate;
    }

    public void setDmlDate(Date dmlDate) {
        this.dmlDate = dmlDate;
    }

    public String getDmlTsql() {
        return dmlTsql;
    }

    public void setDmlTsql(String dmlTsql) {
        this.dmlTsql = dmlTsql == null ? null : dmlTsql.trim();
    }
}