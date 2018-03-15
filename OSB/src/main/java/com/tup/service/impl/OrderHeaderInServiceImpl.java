package com.tup.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tup.commons.utils.DataInfo;
import com.tup.mssql.mapper.OrderHeaderInMapper;
import com.tup.mssql.model.OrderHeaderIn;
import com.tup.service.IOrderHeaderInService;
@Service
public class OrderHeaderInServiceImpl extends ServiceImpl<OrderHeaderInMapper, OrderHeaderIn> implements IOrderHeaderInService {

	@Autowired
	private OrderHeaderInMapper orderHeaderInMapper;
	
	/* (non-Javadoc)
	 * @see com.tup.service.impl.OrderHeaderInService#selectDataGrid(com.tup.commons.utils.DataInfo)
	 */
	public void selectDataGrid(DataInfo dataInfo) {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see com.tup.service.impl.OrderHeaderInService#selectDateList(java.lang.String, java.lang.String, java.lang.String)
	 */
	public List<OrderHeaderIn> selectDateList(String db_no, String year, String month) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.tup.service.impl.OrderHeaderInService#getMapParams(java.util.Map)
	 */
	public List<OrderHeaderIn> getMapParams(Map<String, String> params) {
		// TODO Auto-generated method stub
		return orderHeaderInMapper.selectByMapParam(params);
	}
	
	/* (non-Javadoc)
	 * @see com.tup.service.impl.OrderHeaderInService#getTop1()
	 */
	public OrderHeaderIn getTop1(){
		
		return null;
		
	}
	
	/* (non-Javadoc)
	 * @see com.tup.service.impl.OrderHeaderInService#getTopx(java.lang.Integer)
	 */
	public List<OrderHeaderIn> getTopx(Integer x){
		//super.insertBatch(entityList, batchSize)
		return null;
	}
}
