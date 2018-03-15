package com.tup.mssql.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.mssql.model.OrderHeaderIn;
import com.tup.mssql.model.OrderHeaderInExample;

public interface OrderHeaderInMapper  extends BaseMapper<OrderHeaderIn> {
    int countByExample(OrderHeaderInExample example);

    int deleteByExample(OrderHeaderInExample example);

    int deleteByPrimaryKey(String id);

   Integer  insert(OrderHeaderIn record);

    int insertSelective(OrderHeaderIn record);

    List<OrderHeaderIn> selectByExample(OrderHeaderInExample example);

    List<OrderHeaderIn > selectByMapParam(Map<String,String> params);
    OrderHeaderIn selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderHeaderIn record, @Param("example") OrderHeaderInExample example);

    int updateByExample(@Param("record") OrderHeaderIn record, @Param("example") OrderHeaderInExample example);

    int updateByPrimaryKeySelective(OrderHeaderIn record);

    int updateByPrimaryKey(OrderHeaderIn record);
}