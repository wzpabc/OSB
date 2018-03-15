package com.tup.mssql.model;


import java.util.Date;

public class ItemGLClassOverride {
    private String id;

    private String iblitm;

    private String ibglpt;

    private String memberLevel;

    private Date lastupdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIblitm() {
        return iblitm;
    }

    public void setIblitm(String iblitm) {
        this.iblitm = iblitm == null ? null : iblitm.trim();
    }

    public String getIbglpt() {
        return ibglpt;
    }

    public void setIbglpt(String ibglpt) {
        this.ibglpt = ibglpt == null ? null : ibglpt.trim();
    }

    public String getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(String memberLevel) {
        this.memberLevel = memberLevel == null ? null : memberLevel.trim();
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }
}