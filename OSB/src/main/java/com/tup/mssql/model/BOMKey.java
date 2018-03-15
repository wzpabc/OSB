package com.tup.mssql.model;


import java.math.BigDecimal;

public class BOMKey {
    private String ixtbm;

    private Integer ixkit;

    private String ixmmcu;

    private BigDecimal ixcpnb;

    public String getIxtbm() {
        return ixtbm;
    }

    public void setIxtbm(String ixtbm) {
        this.ixtbm = ixtbm == null ? null : ixtbm.trim();
    }

    public Integer getIxkit() {
        return ixkit;
    }

    public void setIxkit(Integer ixkit) {
        this.ixkit = ixkit;
    }

    public String getIxmmcu() {
        return ixmmcu;
    }

    public void setIxmmcu(String ixmmcu) {
        this.ixmmcu = ixmmcu == null ? null : ixmmcu.trim();
    }

    public BigDecimal getIxcpnb() {
        return ixcpnb;
    }

    public void setIxcpnb(BigDecimal ixcpnb) {
        this.ixcpnb = ixcpnb;
    }
}