package com.tup.mssql.model;


import java.util.Date;

public class OrderCancel {
    private String id;

    private String shkcoo;

    private String shdcto;

    private Long shdoco;

    private String jdeStatus;

    private Date jdeUpdatedate;

    private String jdeProccesslog;

    private Date jdeInsertdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getShkcoo() {
        return shkcoo;
    }

    public void setShkcoo(String shkcoo) {
        this.shkcoo = shkcoo == null ? null : shkcoo.trim();
    }

    public String getShdcto() {
        return shdcto;
    }

    public void setShdcto(String shdcto) {
        this.shdcto = shdcto == null ? null : shdcto.trim();
    }

    public Long getShdoco() {
        return shdoco;
    }

    public void setShdoco(Long shdoco) {
        this.shdoco = shdoco;
    }

    public String getJdeStatus() {
        return jdeStatus;
    }

    public void setJdeStatus(String jdeStatus) {
        this.jdeStatus = jdeStatus == null ? null : jdeStatus.trim();
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

    public Date getJdeInsertdate() {
        return jdeInsertdate;
    }

    public void setJdeInsertdate(Date jdeInsertdate) {
        this.jdeInsertdate = jdeInsertdate;
    }
}