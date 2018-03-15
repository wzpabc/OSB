package com.tup.mssql.model;


import java.util.Date;

public class AddressPhone extends AddressPhoneKey {
    private Integer wprck7;

    private String wpph1;

    private Date jdeUpdatedate;

    private Date ktProcessdate;

    private Date ktFaildate;

    private Integer ktRetrytimes;

    private String ktErrorlog;

    private Date fmsProcessDate;

    public Integer getWprck7() {
        return wprck7;
    }

    public void setWprck7(Integer wprck7) {
        this.wprck7 = wprck7;
    }

    public String getWpph1() {
        return wpph1;
    }

    public void setWpph1(String wpph1) {
        this.wpph1 = wpph1 == null ? null : wpph1.trim();
    }

    public Date getJdeUpdatedate() {
        return jdeUpdatedate;
    }

    public void setJdeUpdatedate(Date jdeUpdatedate) {
        this.jdeUpdatedate = jdeUpdatedate;
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