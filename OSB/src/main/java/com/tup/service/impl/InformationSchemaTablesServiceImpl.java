package com.tup.service.impl;

import com.tup.mssql.model.InformationSchemaTables;
import com.tup.mssql.model.ReportsByTime;
import com.tup.mssql.mapper.InformationSchemaTablesMapper;
import com.tup.service.IInformationSchemaTablesService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List; 
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.tup.commons.utils.PageInfo;
import com.tup.form.InformationSchemaTablesHelper;
import com.tup.mssql.mapper.InformationSchemaTablesMapper;
import com.tup.mssql.model.InformationSchemaTables;
import com.tup.commons.utils.DataInfo;
//import com.tup.model.InformationSchemaTablesExample;
//import com.tup.model.InformationSchemaTablesExample.Criteria;
import com.tup.service.IInformationSchemaTablesService;
/**
 * <p>
 * ${table.comment}  服务实现类
 * </p>
 * @author patrick.wang
 * @since 2018-03-13
 */
@Service
public class InformationSchemaTablesServiceImpl extends ServiceImpl<InformationSchemaTablesMapper, InformationSchemaTables> implements IInformationSchemaTablesService {
	@Autowired private InformationSchemaTablesMapper mapper;
	 
	private InformationSchemaTablesHelper helper;

	private int count = 0;

	@Autowired
	public void setBaseMapper() {
		super.baseMapper = mapper;
	}

	
	public void setHelper(InformationSchemaTablesHelper helper) {
		this.helper = helper;
	}

	
	public boolean Add(InformationSchemaTables entity) {
		return super.insert(entity);
	}
	
 	public List<InformationSchemaTables> getMapParams(Map<String, String> params) {
		// TODO Auto-generated method stub
		return mapper.selectByMapParam(params);
	}

	public InformationSchemaTables getTop1(){
		
		return null;
		
	}
	
	public void selectDataGrid(PageInfo pageInfo) {
		
		  Page<InformationSchemaTables> page = new Page<InformationSchemaTables>(pageInfo.getNowpage(), pageInfo.getSize());
	        List<InformationSchemaTables> list = mapper.selectInformationSchemaTablesList(page, pageInfo.getSort(), pageInfo.getOrder());
	        pageInfo.setRows(list);
	        pageInfo.setTotal(page.getTotal());//设置总行数
	/*
	
		System.out.println(helper.toString());
		InformationSchemaTablesExample example = new InformationSchemaTablesExample();
		example.setOrderByClause(helper.getSort() + " " + helper.getOrder());
		example.setOffset(String.valueOf(((helper.getPage() - 1) * helper.getRows())));//mysql
		example.setRows(String.valueOf(helper.getRows()));
		Criteria criteria = example.createCriteria();

		List<InformationSchemaTables> list = mapper.selectByExample(example);
		pageInfo.setRows(list);
		count = mapper.countByExample(example);
		pageInfo.setTotal(count);
	
	
	*/
	
	}
	
	public void selectDataGrid(DataInfo dataInfo) {
		// TODO Auto-generated method stub
	}
}
