package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.DMLSOURCE;
import com.tup.mssql.model.DMLSOURCEExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DMLSOURCEMapper  extends BaseMapper<DMLSOURCE> {
    int countByExample(DMLSOURCEExample example);

    int deleteByExample(DMLSOURCEExample example);

   Integer  insert(DMLSOURCE record);

    int insertSelective(DMLSOURCE record);

    List<DMLSOURCE> selectByExample(DMLSOURCEExample example);

    int updateByExampleSelective(@Param("record") DMLSOURCE record, @Param("example") DMLSOURCEExample example);

    int updateByExample(@Param("record") DMLSOURCE record, @Param("example") DMLSOURCEExample example);
}