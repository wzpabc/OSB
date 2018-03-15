package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.StockAdjust;
import com.tup.mssql.model.StockAdjustExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockAdjustMapper  extends BaseMapper<StockAdjust> {
    int countByExample(StockAdjustExample example);

    int deleteByExample(StockAdjustExample example);

    int deleteByPrimaryKey(Integer autonumber);

   Integer  insert(StockAdjust record);

    int insertSelective(StockAdjust record);

    List<StockAdjust> selectByExample(StockAdjustExample example);

    StockAdjust selectByPrimaryKey(Integer autonumber);

    int updateByExampleSelective(@Param("record") StockAdjust record, @Param("example") StockAdjustExample example);

    int updateByExample(@Param("record") StockAdjust record, @Param("example") StockAdjustExample example);

    int updateByPrimaryKeySelective(StockAdjust record);

    int updateByPrimaryKey(StockAdjust record);
}