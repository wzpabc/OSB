package com.tup.service.impl;

import com.tup.mssql.model.ReportsByTime;
import com.tup.mssql.mapper.ReportsByTimeMapper;
import com.tup.service.IReportsByTimeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List; 
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.tup.commons.utils.PageInfo;
import com.tup.form.ReportsByTimeHelper;
import com.tup.model.Role;
import com.tup.mssql.mapper.ReportsByTimeMapper;
import com.tup.mssql.model.ReportsByTime;
import com.tup.commons.utils.DataInfo;
//import com.tup.model.ReportsByTimeExample;
//import com.tup.model.ReportsByTimeExample.Criteria;
import com.tup.service.IReportsByTimeService;
/**
 * <p>
 * ${table.comment}  服务实现类
 * </p>
 * @author patrick.wang
 * @since 2018-03-13
 */
@Service
public class ReportsByTimeServiceImpl extends ServiceImpl<ReportsByTimeMapper, ReportsByTime> implements IReportsByTimeService {
	@Autowired private ReportsByTimeMapper mapper;
	 
	private ReportsByTimeHelper helper;

	private int count = 0;

	@Autowired
	public void setBaseMapper() {
		super.baseMapper = mapper;
	}

	
	public void setHelper(ReportsByTimeHelper helper) {
		this.helper = helper;
	}

	
	public boolean Add(ReportsByTime entity) {
		return super.insert(entity);
	}
	
 	public List<ReportsByTime> getMapParams(Map<String, String> params) {
		// TODO Auto-generated method stub
		return mapper.selectByMapParam(params);
	}

	public ReportsByTime getTop1(){
		
		return null;
		
	}
	
	public void selectDataGrid(PageInfo pageInfo) {
		
		  Page<ReportsByTime> page = new Page<ReportsByTime>(pageInfo.getNowpage(), pageInfo.getSize());
	        List<ReportsByTime> list = mapper.selectReportsByTimeList(page, pageInfo.getSort(), pageInfo.getOrder());
	        pageInfo.setRows(list);
	        pageInfo.setTotal(page.getTotal());//设置总行数
	/*
	
		System.out.println(helper.toString());
		ReportsByTimeExample example = new ReportsByTimeExample();
		example.setOrderByClause(helper.getSort() + " " + helper.getOrder());
		example.setOffset(String.valueOf(((helper.getPage() - 1) * helper.getRows())));//mysql
		example.setRows(String.valueOf(helper.getRows()));
		Criteria criteria = example.createCriteria();

		List<ReportsByTime> list = mapper.selectByExample(example);
		pageInfo.setRows(list);
		count = mapper.countByExample(example);
		pageInfo.setTotal(count);
	
	
	*/
	
	} 
	
	public void selectDataGrid(DataInfo dataInfo) {
		// TODO Auto-generated method stub
	}
}
