package com.tup.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.service.IService;
import com.tup.commons.utils.DataInfo;
import com.tup.mssql.model.ADDRESS; 

public interface IAddressService extends IService<ADDRESS> {
	
	void selectDataGrid(DataInfo dataInfo);

	/**
	 * 获取产品销售量top 10,对象列表
	 * @param db_no 分销商编号
	 * @param year 年
	 * @param month 月
	 * @return list List<DwSalesDay>
	 */
	List<ADDRESS> selectDateList(String db_no, String year, String month);
	/**
	 * 获取产品销售量top 10,对象列表
	 * @param db_no 分销商编号
	 * @param year 年
	 * @param month 月
	 * @return list List<DwSalesDay>
	 */
	 List<ADDRESS> getAddressMapParams(Map<String,String> params);
}
