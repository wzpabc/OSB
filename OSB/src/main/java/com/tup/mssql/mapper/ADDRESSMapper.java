package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.ADDRESS;
import com.tup.mssql.model.ADDRESSExample; 

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ADDRESSMapper  extends BaseMapper<ADDRESS> {
    int countByExample(ADDRESSExample example);

    int deleteByExample(ADDRESSExample example);

    int deleteByPrimaryKey(Integer aban8);

   Integer  insert(ADDRESS record);

    int insertSelective(ADDRESS record);

    List<ADDRESS> selectByMapParam(Map<String,String> params);
    
    List<ADDRESS> selectByExample(ADDRESSExample example);

    ADDRESS selectByPrimaryKey(Integer aban8);

    int updateByExampleSelective(@Param("record") ADDRESS record, @Param("example") ADDRESSExample example);

    int updateByExample(@Param("record") ADDRESS record, @Param("example") ADDRESSExample example);

    int updateByPrimaryKeySelective(ADDRESS record);

    int updateByPrimaryKey(ADDRESS record);
}