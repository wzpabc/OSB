package com.tup.mssql.model;


public class AddressPhoneKey {
    private Integer wpan8;

    private String wpphtp;

    public Integer getWpan8() {
        return wpan8;
    }

    public void setWpan8(Integer wpan8) {
        this.wpan8 = wpan8;
    }

    public String getWpphtp() {
        return wpphtp;
    }

    public void setWpphtp(String wpphtp) {
        this.wpphtp = wpphtp == null ? null : wpphtp.trim();
    }
}