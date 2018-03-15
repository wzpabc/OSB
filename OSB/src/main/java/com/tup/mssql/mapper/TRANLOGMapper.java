package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.TRANLOG;
import com.tup.mssql.model.TRANLOGExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRANLOGMapper  extends BaseMapper<TRANLOG> {
    int countByExample(TRANLOGExample example);

    int deleteByExample(TRANLOGExample example);

   Integer  insert(TRANLOG record);

    int insertSelective(TRANLOG record);

    List<TRANLOG> selectByExampleWithBLOBs(TRANLOGExample example);

    List<TRANLOG> selectByExample(TRANLOGExample example);

    int updateByExampleSelective(@Param("record") TRANLOG record, @Param("example") TRANLOGExample example);

    int updateByExampleWithBLOBs(@Param("record") TRANLOG record, @Param("example") TRANLOGExample example);

    int updateByExample(@Param("record") TRANLOG record, @Param("example") TRANLOGExample example);
}