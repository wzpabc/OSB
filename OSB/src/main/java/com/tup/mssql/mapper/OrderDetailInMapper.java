package com.tup.mssql.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.mssql.model.OrderDetailIn;
import com.tup.mssql.model.OrderDetailInExample;

public interface OrderDetailInMapper  extends BaseMapper<OrderDetailIn> {
    int countByExample(OrderDetailInExample example);

    int deleteByExample(OrderDetailInExample example);

    int deleteByPrimaryKey(String id);

   Integer  insert(OrderDetailIn record);

    int insertSelective(OrderDetailIn record);

    List<OrderDetailIn> selectByExample(OrderDetailInExample example);

    List<OrderDetailIn > selectByMapParam(Map<String,String> params);
    OrderDetailIn selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderDetailIn record, @Param("example") OrderDetailInExample example);

    int updateByExample(@Param("record") OrderDetailIn record, @Param("example") OrderDetailInExample example);

    int updateByPrimaryKeySelective(OrderDetailIn record);

    int updateByPrimaryKey(OrderDetailIn record);
}