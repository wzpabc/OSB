package com.tup.mssql.model;


import java.util.Date;

public class BOM extends BOMKey {
    private String ixkitl;

    private Integer ixitm;

    private String ixlitm;

    private String ixcmcu;

    private Integer ixcpnt;

    private Integer ixqnty;

    private String ixum;

    private Date ixefff;

    private Date ixefft;

    private String ixuser;

    private Date ixupmj;

    private Date jdeUpdatedate;

    private Date ktProcessdate;

    private Date ktFaildate;

    private Integer ktRetrytimes;

    private String ktErrorlog;

    public String getIxkitl() {
        return ixkitl;
    }

    public void setIxkitl(String ixkitl) {
        this.ixkitl = ixkitl == null ? null : ixkitl.trim();
    }

    public Integer getIxitm() {
        return ixitm;
    }

    public void setIxitm(Integer ixitm) {
        this.ixitm = ixitm;
    }

    public String getIxlitm() {
        return ixlitm;
    }

    public void setIxlitm(String ixlitm) {
        this.ixlitm = ixlitm == null ? null : ixlitm.trim();
    }

    public String getIxcmcu() {
        return ixcmcu;
    }

    public void setIxcmcu(String ixcmcu) {
        this.ixcmcu = ixcmcu == null ? null : ixcmcu.trim();
    }

    public Integer getIxcpnt() {
        return ixcpnt;
    }

    public void setIxcpnt(Integer ixcpnt) {
        this.ixcpnt = ixcpnt;
    }

    public Integer getIxqnty() {
        return ixqnty;
    }

    public void setIxqnty(Integer ixqnty) {
        this.ixqnty = ixqnty;
    }

    public String getIxum() {
        return ixum;
    }

    public void setIxum(String ixum) {
        this.ixum = ixum == null ? null : ixum.trim();
    }

    public Date getIxefff() {
        return ixefff;
    }

    public void setIxefff(Date ixefff) {
        this.ixefff = ixefff;
    }

    public Date getIxefft() {
        return ixefft;
    }

    public void setIxefft(Date ixefft) {
        this.ixefft = ixefft;
    }

    public String getIxuser() {
        return ixuser;
    }

    public void setIxuser(String ixuser) {
        this.ixuser = ixuser == null ? null : ixuser.trim();
    }

    public Date getIxupmj() {
        return ixupmj;
    }

    public void setIxupmj(Date ixupmj) {
        this.ixupmj = ixupmj;
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
}