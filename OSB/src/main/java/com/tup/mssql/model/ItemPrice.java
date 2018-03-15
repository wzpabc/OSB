package com.tup.mssql.model;


import java.math.BigDecimal;
import java.util.Date;

public class ItemPrice extends ItemPriceKey {
    private String bplitm;

    private BigDecimal bpuprc;

    private Date bpeftj;

    private String bpuser;

    private Date bpupmj;

    private Date jdeUpdatedate;

    private Boolean isprocessed;

    private Date ktProcessdate;

    private Date ktFaildate;

    private Integer ktRetrytimes;

    private String ktErrorlog;

    private Date fmsProcessDate;

    public String getBplitm() {
        return bplitm;
    }

    public void setBplitm(String bplitm) {
        this.bplitm = bplitm == null ? null : bplitm.trim();
    }

    public BigDecimal getBpuprc() {
        return bpuprc;
    }

    public void setBpuprc(BigDecimal bpuprc) {
        this.bpuprc = bpuprc;
    }

    public Date getBpeftj() {
        return bpeftj;
    }

    public void setBpeftj(Date bpeftj) {
        this.bpeftj = bpeftj;
    }

    public String getBpuser() {
        return bpuser;
    }

    public void setBpuser(String bpuser) {
        this.bpuser = bpuser == null ? null : bpuser.trim();
    }

    public Date getBpupmj() {
        return bpupmj;
    }

    public void setBpupmj(Date bpupmj) {
        this.bpupmj = bpupmj;
    }

    public Date getJdeUpdatedate() {
        return jdeUpdatedate;
    }

    public void setJdeUpdatedate(Date jdeUpdatedate) {
        this.jdeUpdatedate = jdeUpdatedate;
    }

    public Boolean getIsprocessed() {
        return isprocessed;
    }

    public void setIsprocessed(Boolean isprocessed) {
        this.isprocessed = isprocessed;
    }

    public Date getKtProcessdate() {
        return ktProcessdate;
    }

    public void setKtProcessdate(Date ktProcessdate) {
        this.ktProcessdate = ktProcessdate;
    }

    public Date getKtFaildate() {
        return ktFaildate;
    }

    public void setKtFaildate(Date ktFaildate) {
        this.ktFaildate = ktFaildate;
    }

    public Integer getKtRetrytimes() {
        return ktRetrytimes;
    }

    public void setKtRetrytimes(Integer ktRetrytimes) {
        this.ktRetrytimes = ktRetrytimes;
    }

    public String getKtErrorlog() {
        return ktErrorlog;
    }

    public void setKtErrorlog(String ktErrorlog) {
        this.ktErrorlog = ktErrorlog == null ? null : ktErrorlog.trim();
    }

    public Date getFmsProcessDate() {
        return fmsProcessDate;
    }

    public void setFmsProcessDate(Date fmsProcessDate) {
        this.fmsProcessDate = fmsProcessDate;
    }
}