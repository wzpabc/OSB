package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.JOBCONFIG;
import com.tup.mssql.model.JOBCONFIGExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JOBCONFIGMapper  extends BaseMapper<JOBCONFIG> {
    int countByExample(JOBCONFIGExample example);

    int deleteByExample(JOBCONFIGExample example);

    int deleteByPrimaryKey(Integer id);

   Integer  insert(JOBCONFIG record);

    int insertSelective(JOBCONFIG record);

    List<JOBCONFIG> selectByExample(JOBCONFIGExample example);

    JOBCONFIG selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JOBCONFIG record, @Param("example") JOBCONFIGExample example);

    int updateByExample(@Param("record") JOBCONFIG record, @Param("example") JOBCONFIGExample example);

    int updateByPrimaryKeySelective(JOBCONFIG record);

    int updateByPrimaryKey(JOBCONFIG record);
}