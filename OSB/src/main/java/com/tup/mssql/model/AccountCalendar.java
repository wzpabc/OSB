package com.tup.mssql.model;


import java.util.Date;

public class AccountCalendar {
    private Integer accountYear;

    private Integer accountMonth;

    private Integer accountWeek;

    private Date date;

    public Integer getAccountYear() {
        return accountYear;
    }

    public void setAccountYear(Integer accountYear) {
        this.accountYear = accountYear;
    }

    public Integer getAccountMonth() {
        return accountMonth;
    }

    public void setAccountMonth(Integer accountMonth) {
        this.accountMonth = accountMonth;
    }

    public Integer getAccountWeek() {
        return accountWeek;
    }

    public void setAccountWeek(Integer accountWeek) {
        this.accountWeek = accountWeek;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}