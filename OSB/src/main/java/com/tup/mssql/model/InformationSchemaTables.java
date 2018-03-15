package com.tup.mssql.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
/**
 * <p>
 * ${table.comment}
 * </p>
 *
 * @author patrick.wang
 * @since 2018-03-13
 */
@TableName("INFORMATION_SCHEMA_TABLES")
public class InformationSchemaTables extends Model<InformationSchemaTables> {

    private static final long serialVersionUID = 1L;

	@TableId(type = IdType.AUTO)
	private Integer id; 
	@TableField(value="TABLE_CATALOG")
	private String tableCatalog;
	@TableField(value="TABLE_SCHEMA")
	private String tableSchema;  
	@TableField(value="TABLE_NAME")
	private String tableName;
	@TableField(value="TABLE_TYPE")
	private String tableType;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
 

	public String getTableCatalog() {
		return tableCatalog;
	}

	public void setTableCatalog(String tableCatalog) {
		this.tableCatalog = tableCatalog;
	}

	public String getTableSchema() {
		return tableSchema;
	}

	public void setTableSchema(String tableSchema) {
		this.tableSchema = tableSchema;
	}

	 

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
 

	public String getTableType() {
		return tableType;
	}

	public void setTableType(String tableType) {
		this.tableType = tableType;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
