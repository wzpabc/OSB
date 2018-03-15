package com.tup.mssql.model;


public class ItemKey {
    private String ibmcu;

    private Integer ibitm;

    public String getIbmcu() {
        return ibmcu;
    }

    public void setIbmcu(String ibmcu) {
        this.ibmcu = ibmcu == null ? null : ibmcu.trim();
    }

    public Integer getIbitm() {
        return ibitm;
    }

    public void setIbitm(Integer ibitm) {
        this.ibitm = ibitm;
    }
}