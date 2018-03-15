package com.tup.mssql.model;


import java.util.Date;

public class ItemPriceKey {
    private Integer bpitm;

    private String bpmcu;

    private String bplocn;

    private String bpuom;

    private Date bpexdj;

    public Integer getBpitm() {
        return bpitm;
    }

    public void setBpitm(Integer bpitm) {
        this.bpitm = bpitm;
    }

    public String getBpmcu() {
        return bpmcu;
    }

    public void setBpmcu(String bpmcu) {
        this.bpmcu = bpmcu == null ? null : bpmcu.trim();
    }

    public String getBplocn() {
        return bplocn;
    }

    public void setBplocn(String bplocn) {
        this.bplocn = bplocn == null ? null : bplocn.trim();
    }

    public String getBpuom() {
        return bpuom;
    }

    public void setBpuom(String bpuom) {
        this.bpuom = bpuom == null ? null : bpuom.trim();
    }

    public Date getBpexdj() {
        return bpexdj;
    }

    public void setBpexdj(Date bpexdj) {
        this.bpexdj = bpexdj;
    }
}