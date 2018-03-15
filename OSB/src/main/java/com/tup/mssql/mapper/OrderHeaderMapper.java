package com.tup.mssql.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.mssql.model.OrderHeader;
import com.tup.mssql.model.OrderHeaderExample;
import com.tup.mssql.model.OrderHeaderKey;

public interface OrderHeaderMapper  extends BaseMapper<OrderHeader> {
    int countByExample(OrderHeaderExample example);

    int deleteByExample(OrderHeaderExample example);

    int deleteByPrimaryKey(OrderHeaderKey key);

   Integer  insert(OrderHeader record);

    int insertSelective(OrderHeader record);

    List<OrderHeader> selectByExample(OrderHeaderExample example);

    List< OrderHeader> selectByMapParam(Map<String,String> params);
    OrderHeader selectByPrimaryKey(OrderHeaderKey key);

    int updateByExampleSelective(@Param("record") OrderHeader record, @Param("example") OrderHeaderExample example);

    int updateByExample(@Param("record") OrderHeader record, @Param("example") OrderHeaderExample example);

    int updateByPrimaryKeySelective(OrderHeader record);

    int updateByPrimaryKey(OrderHeader record);
}