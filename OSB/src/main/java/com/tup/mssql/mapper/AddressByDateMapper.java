package com.tup.mssql.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.mssql.model.AddressByDate;
import com.tup.mssql.model.AddressByDateExample;
import com.tup.mssql.model.AddressByDateKey;

public interface AddressByDateMapper  extends BaseMapper<AddressByDate> {
    int countByExample(AddressByDateExample example);

    int deleteByExample(AddressByDateExample example);

    int deleteByPrimaryKey(AddressByDateKey key);

   Integer  insert(AddressByDate record);

    int insertSelective(AddressByDate record);

    List<AddressByDate > selectByMapParam(Map<String,String> params);
    
    List<AddressByDate> selectByExample(AddressByDateExample example);

    AddressByDate selectByPrimaryKey(AddressByDateKey key);

    int updateByExampleSelective(@Param("record") AddressByDate record, @Param("example") AddressByDateExample example);

    int updateByExample(@Param("record") AddressByDate record, @Param("example") AddressByDateExample example);

    int updateByPrimaryKeySelective(AddressByDate record);

    int updateByPrimaryKey(AddressByDate record);
}