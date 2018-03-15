package com.tup.mssql.model;


public class ItemUOMMap {
    private String id;

    private String uom;

    private String uomc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom == null ? null : uom.trim();
    }

    public String getUomc() {
        return uomc;
    }

    public void setUomc(String uomc) {
        this.uomc = uomc == null ? null : uomc.trim();
    }
}