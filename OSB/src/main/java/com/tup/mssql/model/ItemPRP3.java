package com.tup.mssql.model;


public class ItemPRP3 {
    private String itemBrandno;

    private String itemBrandname;

    private String managerNo;

    public String getItemBrandno() {
        return itemBrandno;
    }

    public void setItemBrandno(String itemBrandno) {
        this.itemBrandno = itemBrandno == null ? null : itemBrandno.trim();
    }

    public String getItemBrandname() {
        return itemBrandname;
    }

    public void setItemBrandname(String itemBrandname) {
        this.itemBrandname = itemBrandname == null ? null : itemBrandname.trim();
    }

    public String getManagerNo() {
        return managerNo;
    }

    public void setManagerNo(String managerNo) {
        this.managerNo = managerNo == null ? null : managerNo.trim();
    }
}