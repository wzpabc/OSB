package com.tup.mssql.model;


public class AddressRegionMap {
    private String id;

    private String oldno;

    private String newno;

    private String name;

    private String oldbu;

    private String newbu;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOldno() {
        return oldno;
    }

    public void setOldno(String oldno) {
        this.oldno = oldno == null ? null : oldno.trim();
    }

    public String getNewno() {
        return newno;
    }

    public void setNewno(String newno) {
        this.newno = newno == null ? null : newno.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOldbu() {
        return oldbu;
    }

    public void setOldbu(String oldbu) {
        this.oldbu = oldbu == null ? null : oldbu.trim();
    }

    public String getNewbu() {
        return newbu;
    }

    public void setNewbu(String newbu) {
        this.newbu = newbu == null ? null : newbu.trim();
    }
}