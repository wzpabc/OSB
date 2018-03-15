package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.ERRORDATA;
import com.tup.mssql.model.ERRORDATAExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ERRORDATAMapper  extends BaseMapper<ERRORDATA> {
    int countByExample(ERRORDATAExample example);

    int deleteByExample(ERRORDATAExample example);

    int deleteByPrimaryKey(Long id);

   Integer  insert(ERRORDATA record);

    int insertSelective(ERRORDATA record);

    List<ERRORDATA> selectByExampleWithBLOBs(ERRORDATAExample example);

    List<ERRORDATA> selectByExample(ERRORDATAExample example);

    ERRORDATA selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ERRORDATA record, @Param("example") ERRORDATAExample example);

    int updateByExampleWithBLOBs(@Param("record") ERRORDATA record, @Param("example") ERRORDATAExample example);

    int updateByExample(@Param("record") ERRORDATA record, @Param("example") ERRORDATAExample example);

    int updateByPrimaryKeySelective(ERRORDATA record);

    int updateByPrimaryKeyWithBLOBs(ERRORDATA record);

    int updateByPrimaryKey(ERRORDATA record);
}