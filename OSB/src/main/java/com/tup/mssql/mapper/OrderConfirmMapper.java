package com.tup.mssql.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.mssql.model.OrderConfirm;
import com.tup.mssql.model.OrderConfirmExample;
import com.tup.mssql.model.OrderConfirmKey;

public interface OrderConfirmMapper  extends BaseMapper<OrderConfirm> {
    int countByExample(OrderConfirmExample example);

    int deleteByExample(OrderConfirmExample example);

    int deleteByPrimaryKey(OrderConfirmKey key);

   Integer  insert(OrderConfirm record);

    int insertSelective(OrderConfirm record);

    List<OrderConfirm> selectByExample(OrderConfirmExample example);

    List<OrderConfirm > selectByMapParam(Map<String,String> params);
    OrderConfirm selectByPrimaryKey(OrderConfirmKey key);

    int updateByExampleSelective(@Param("record") OrderConfirm record, @Param("example") OrderConfirmExample example);

    int updateByExample(@Param("record") OrderConfirm record, @Param("example") OrderConfirmExample example);

    int updateByPrimaryKeySelective(OrderConfirm record);

    int updateByPrimaryKey(OrderConfirm record);
}