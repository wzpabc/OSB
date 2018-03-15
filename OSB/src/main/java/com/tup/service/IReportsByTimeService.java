package com.tup.service;

import com.tup.mssql.model.ReportsByTime;
import com.tup.commons.utils.PageInfo;
import com.baomidou.mybatisplus.service.IService;
import com.tup.form.ReportsByTimeHelper;

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
public interface IReportsByTimeService extends IService<ReportsByTime> {
	 
	void setHelper(ReportsByTimeHelper helper);

	void selectDataGrid(PageInfo pageInfo);
	
	
	void selectDataGrid(DataInfo dataInfo);
	
	ReportsByTime getTop1();
	
	public List<ReportsByTime> getMapParams(Map<String, String> params) ;
	
}
