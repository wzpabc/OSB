package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.OrderCancel;
import com.tup.mssql.model.OrderCancelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderCancelMapper  extends BaseMapper<OrderCancel> {
    int countByExample(OrderCancelExample example);

    int deleteByExample(OrderCancelExample example);

    int deleteByPrimaryKey(String id);

   Integer  insert(OrderCancel record);

    int insertSelective(OrderCancel record);

    List<OrderCancel> selectByExample(OrderCancelExample example);

    OrderCancel selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderCancel record, @Param("example") OrderCancelExample example);

    int updateByExample(@Param("record") OrderCancel record, @Param("example") OrderCancelExample example);

    int updateByPrimaryKeySelective(OrderCancel record);

    int updateByPrimaryKey(OrderCancel record);
}