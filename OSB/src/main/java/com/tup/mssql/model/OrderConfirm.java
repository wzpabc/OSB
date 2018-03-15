package com.tup.mssql.model;


import java.util.Date;

public class OrderConfirm extends OrderConfirmKey {
    private Date sdaddj;

    private Long sdsoqs;

    private Integer sdcars;

    private String sdcnid;

    private Integer sddeln;

    private String sdlitm;

    private String sdlocn;

    private String sdlotn;

    private String jdeStatus;

    private Date jdeInsertdate;

    private Date jdeUpdatedate;

    private String jdeProccesslog;

    private Date ktProcessdate;

    private String sdlgnum;

    private Date fmsProcessDate;

    public Date getSdaddj() {
        return sdaddj;
    }

    public void setSdaddj(Date sdaddj) {
        this.sdaddj = sdaddj;
    }

    public Long getSdsoqs() {
        return sdsoqs;
    }

    public void setSdsoqs(Long sdsoqs) {
        this.sdsoqs = sdsoqs;
    }

    public Integer getSdcars() {
        return sdcars;
    }

    public void setSdcars(Integer sdcars) {
        this.sdcars = sdcars;
    }

    public String getSdcnid() {
        return sdcnid;
    }

    public void setSdcnid(String sdcnid) {
        this.sdcnid = sdcnid == null ? null : sdcnid.trim();
    }

    public Integer getSddeln() {
        return sddeln;
    }

    public void setSddeln(Integer sddeln) {
        this.sddeln = sddeln;
    }

    public String getSdlitm() {
        return sdlitm;
    }

    public void setSdlitm(String sdlitm) {
        this.sdlitm = sdlitm == null ? null : sdlitm.trim();
    }

    public String getSdlocn() {
        return sdlocn;
    }

    public void setSdlocn(String sdlocn) {
        this.sdlocn = sdlocn == null ? null : sdlocn.trim();
    }

    public String getSdlotn() {
        return sdlotn;
    }

    public void setSdlotn(String sdlotn) {
        this.sdlotn = sdlotn == null ? null : sdlotn.trim();
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

    public String getSdlgnum() {
        return sdlgnum;
    }

    public void setSdlgnum(String sdlgnum) {
        this.sdlgnum = sdlgnum == null ? null : sdlgnum.trim();
    }

    public Date getFmsProcessDate() {
        return fmsProcessDate;
    }

    public void setFmsProcessDate(Date fmsProcessDate) {
        this.fmsProcessDate = fmsProcessDate;
    }
}