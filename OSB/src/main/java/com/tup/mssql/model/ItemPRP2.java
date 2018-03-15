package com.tup.mssql.model;


import java.math.BigDecimal;

public class ItemPRP2 {
    private String itemClsno;

    private String itemClsname;

    private String pItemClsno;

    private String managerNo;

    private String level;

    private BigDecimal profitRange1;

    private BigDecimal profitRange2;

    private Integer maxNo;

    public String getItemClsno() {
        return itemClsno;
    }

    public void setItemClsno(String itemClsno) {
        this.itemClsno = itemClsno == null ? null : itemClsno.trim();
    }

    public String getItemClsname() {
        return itemClsname;
    }

    public void setItemClsname(String itemClsname) {
        this.itemClsname = itemClsname == null ? null : itemClsname.trim();
    }

    public String getpItemClsno() {
        return pItemClsno;
    }

    public void setpItemClsno(String pItemClsno) {
        this.pItemClsno = pItemClsno == null ? null : pItemClsno.trim();
    }

    public String getManagerNo() {
        return managerNo;
    }

    public void setManagerNo(String managerNo) {
        this.managerNo = managerNo == null ? null : managerNo.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public BigDecimal getProfitRange1() {
        return profitRange1;
    }

    public void setProfitRange1(BigDecimal profitRange1) {
        this.profitRange1 = profitRange1;
    }

    public BigDecimal getProfitRange2() {
        return profitRange2;
    }

    public void setProfitRange2(BigDecimal profitRange2) {
        this.profitRange2 = profitRange2;
    }

    public Integer getMaxNo() {
        return maxNo;
    }

    public void setMaxNo(Integer maxNo) {
        this.maxNo = maxNo;
    }
}