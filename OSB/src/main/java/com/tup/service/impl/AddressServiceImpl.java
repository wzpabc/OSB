package com.tup.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tup.commons.utils.DataInfo;
import com.tup.mssql.mapper.ADDRESSMapper;
import com.tup.mssql.model.ADDRESS;
import com.tup.service.IAddressService;
//通用curd在serviceImpl中实现
@Service
public class AddressServiceImpl extends ServiceImpl<ADDRESSMapper, ADDRESS> implements IAddressService {
 
	@Autowired 
	private ADDRESSMapper mapper;
	
	public void selectDataGrid(DataInfo dataInfo) {
		// TODO Auto-generated method stub

	}

	public List<ADDRESS> selectDateList(String db_no, String year, String month) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ADDRESS> getAddressMapParams(Map<String, String> params) {
		// TODO Auto-generated method stub
		return mapper.selectByMapParam(params);
	}

}
