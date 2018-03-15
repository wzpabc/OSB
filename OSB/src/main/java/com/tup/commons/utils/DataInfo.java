package com.tup.commons.utils;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * 返回报表数据
 * @author upw023
 *
 */
@SuppressWarnings("rawtypes")
public class DataInfo {

    private int total; // 总记录 
  
    private String desc;
    private String organno;
    @JsonIgnore
    private String organtype;
    private String dimtime;
    private String dimorgan;
    private List rows; //显示的记录  
	public DataInfo() {
		super();
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getOrganno() {
		return organno;
	}
	public void setOrganno(String organno) {
		this.organno = organno;
	}
 
	public String getOrgantype() {
		return organtype;
	}
	public void setOrgantype(String organtype) {
		this.organtype = organtype;
	}
	public String getDimtime() {
		return dimtime;
	}
	public void setDimtime(String dimtime) {
		this.dimtime = dimtime;
	}
	public String getDimorgan() {
		return dimorgan;
	}
	public void setDimorgan(String dimorgan) {
		this.dimorgan = dimorgan;
	}
	public DataInfo(String organno, String dimtime, String dimorgan) {
	 
		this.organno = organno;
		this.dimtime = dimtime;
		this.dimorgan = dimorgan;
	}
    
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
    
}
