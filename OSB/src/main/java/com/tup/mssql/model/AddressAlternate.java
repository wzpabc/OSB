package com.tup.mssql.model;


import java.util.Date;

public class AddressAlternate {
    private Integer wlidln;

    private Integer atan8;

    private Date eftb;

    private String atype;

    private String add1;

    private String add2;

    private String add3;

    private String add4;

    private String cty1;

    private String adds;

    private String coun;

    private String ctr;

    private String addz;

    private Integer maina;

    private Date jdeUpdatedate;

    private Date fmsProcessDate;

    public Integer getWlidln() {
        return wlidln;
    }

    public void setWlidln(Integer wlidln) {
        this.wlidln = wlidln;
    }

    public Integer getAtan8() {
        return atan8;
    }

    public void setAtan8(Integer atan8) {
        this.atan8 = atan8;
    }

    public Date getEftb() {
        return eftb;
    }

    public void setEftb(Date eftb) {
        this.eftb = eftb;
    }

    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype == null ? null : atype.trim();
    }

    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1 == null ? null : add1.trim();
    }

    public String getAdd2() {
        return add2;
    }

    public void setAdd2(String add2) {
        this.add2 = add2 == null ? null : add2.trim();
    }

    public String getAdd3() {
        return add3;
    }

    public void setAdd3(String add3) {
        this.add3 = add3 == null ? null : add3.trim();
    }

    public String getAdd4() {
        return add4;
    }

    public void setAdd4(String add4) {
        this.add4 = add4 == null ? null : add4.trim();
    }

    public String getCty1() {
        return cty1;
    }

    public void setCty1(String cty1) {
        this.cty1 = cty1 == null ? null : cty1.trim();
    }

    public String getAdds() {
        return adds;
    }

    public void setAdds(String adds) {
        this.adds = adds == null ? null : adds.trim();
    }

    public String getCoun() {
        return coun;
    }

    public void setCoun(String coun) {
        this.coun = coun == null ? null : coun.trim();
    }

    public String getCtr() {
        return ctr;
    }

    public void setCtr(String ctr) {
        this.ctr = ctr == null ? null : ctr.trim();
    }

    public String getAddz() {
        return addz;
    }

    public void setAddz(String addz) {
        this.addz = addz == null ? null : addz.trim();
    }

    public Integer getMaina() {
        return maina;
    }

    public void setMaina(Integer maina) {
        this.maina = maina;
    }

    public Date getJdeUpdatedate() {
        return jdeUpdatedate;
    }

    public void setJdeUpdatedate(Date jdeUpdatedate) {
        this.jdeUpdatedate = jdeUpdatedate;
    }

    public Date getFmsProcessDate() {
        return fmsProcessDate;
    }

    public void setFmsProcessDate(Date fmsProcessDate) {
        this.fmsProcessDate = fmsProcessDate;
    }
}