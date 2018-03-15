package com.tup.mssql.model;


import java.util.Date;

public class StockAdjust {
    private Integer autonumber;

    private String mcu;

    private String dct;

    private String exp;

    private String glc;

    private String litm;

    private String locn;

    private String lotn;

    private Long qty;

    private Date trandtae;

    private String trantype;

    private String jdeStatus;

    private Date jdeInsertdate;

    private Date jdeUpdatedate;

    private String jdeProccesslog;

    private Date ktProcessdate;

    private Date ktFaildate;

    private Integer ktRetrytimes;

    private String ktErrorlog;

    private Date fmsProcessDate;

    public Integer getAutonumber() {
        return autonumber;
    }

    public void setAutonumber(Integer autonumber) {
        this.autonumber = autonumber;
    }

    public String getMcu() {
        return mcu;
    }

    public void setMcu(String mcu) {
        this.mcu = mcu == null ? null : mcu.trim();
    }

    public String getDct() {
        return dct;
    }

    public void setDct(String dct) {
        this.dct = dct == null ? null : dct.trim();
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp == null ? null : exp.trim();
    }

    public String getGlc() {
        return glc;
    }

    public void setGlc(String glc) {
        this.glc = glc == null ? null : glc.trim();
    }

    public String getLitm() {
        return litm;
    }

    public void setLitm(String litm) {
        this.litm = litm == null ? null : litm.trim();
    }

    public String getLocn() {
        return locn;
    }

    public void setLocn(String locn) {
        this.locn = locn == null ? null : locn.trim();
    }

    public String getLotn() {
        return lotn;
    }

    public void setLotn(String lotn) {
        this.lotn = lotn == null ? null : lotn.trim();
    }

    public Long getQty() {
        return qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }

    public Date getTrandtae() {
        return trandtae;
    }

    public void setTrandtae(Date trandtae) {
        this.trandtae = trandtae;
    }

    public String getTrantype() {
        return trantype;
    }

    public void setTrantype(String trantype) {
        this.trantype = trantype == null ? null : trantype.trim();
    }

    public String getJdeStatus() {
        return jdeStatus;
    }

    public void setJdeStatus(String jdeStatus) {
        this.jdeStatus = jdeStatus == null ? null : jdeStatus.trim();
    }

    public Date getJdeInsertdate() {
        return jdeInsertdate;
    }

    public void setJdeInsertdate(Date jdeInsertdate) {
        this.jdeInsertdate = jdeInsertdate;
    }

    public Date getJdeUpdatedate() {
        return jdeUpdatedate;
    }

    public void setJdeUpdatedate(Date jdeUpdatedate) {
        this.jdeUpdatedate = jdeUpdatedate;
    }

    public String getJdeProccesslog() {
        return jdeProccesslog;
    }

    public void setJdeProccesslog(String jdeProccesslog) {
        this.jdeProccesslog = jdeProccesslog == null ? null : jdeProccesslog.trim();
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