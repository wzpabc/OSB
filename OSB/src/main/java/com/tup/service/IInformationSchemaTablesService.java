package com.tup.service;

import com.tup.mssql.model.InformationSchemaTables;
import com.tup.commons.utils.PageInfo;
import com.baomidou.mybatisplus.service.IService;
import com.tup.form.InformationSchemaTablesHelper;

import com.tup.commons.utils.DataInfo;

import java.util.List;
import java.util.Map;
/**
 * <p>
 * ${table.comment}  服务类
 * </p>
 *
 * @author patrick.wang
 * @since 2018-03-13
 */
public interface IInformationSchemaTablesService extends IService<InformationSchemaTables> {
	 
	void setHelper(InformationSchemaTablesHelper helper);

	void selectDataGrid(PageInfo pageInfo);
	
	
	void selectDataGrid(DataInfo dataInfo);
	
	InformationSchemaTables getTop1();
	
	public List<InformationSchemaTables> getMapParams(Map<String, String> params) ;
	
}
