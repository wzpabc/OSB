package com.tup.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.service.IService;
import com.tup.commons.utils.DataInfo;
import com.tup.mssql.model.OrderHeaderIn;

public interface IOrderHeaderInService extends IService<OrderHeaderIn> {

	void selectDataGrid(DataInfo dataInfo);

	List<OrderHeaderIn> selectDateList(String db_no, String year, String month);

	List<OrderHeaderIn> getMapParams(Map<String, String> params);

	OrderHeaderIn getTop1();

	List<OrderHeaderIn> getTopx(Integer x);

}