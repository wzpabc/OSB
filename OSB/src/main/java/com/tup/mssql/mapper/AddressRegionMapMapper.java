package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.AddressRegionMap;
import com.tup.mssql.model.AddressRegionMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressRegionMapMapper  extends BaseMapper<AddressRegionMap> {
    int countByExample(AddressRegionMapExample example);

    int deleteByExample(AddressRegionMapExample example);

    int deleteByPrimaryKey(String id);

   Integer  insert(AddressRegionMap record);

    int insertSelective(AddressRegionMap record);

    List<AddressRegionMap> selectByExample(AddressRegionMapExample example);

    AddressRegionMap selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AddressRegionMap record, @Param("example") AddressRegionMapExample example);

    int updateByExample(@Param("record") AddressRegionMap record, @Param("example") AddressRegionMapExample example);

    int updateByPrimaryKeySelective(AddressRegionMap record);

    int updateByPrimaryKey(AddressRegionMap record);
}