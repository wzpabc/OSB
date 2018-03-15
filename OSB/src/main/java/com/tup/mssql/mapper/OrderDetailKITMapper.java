package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.OrderDetailKIT;
import com.tup.mssql.model.OrderDetailKITExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailKITMapper  extends BaseMapper<OrderDetailKIT> {
    int countByExample(OrderDetailKITExample example);

    int deleteByExample(OrderDetailKITExample example);

    int deleteByPrimaryKey(String id);

   Integer  insert(OrderDetailKIT record);

    int insertSelective(OrderDetailKIT record);

    List<OrderDetailKIT> selectByExample(OrderDetailKITExample example);

    OrderDetailKIT selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderDetailKIT record, @Param("example") OrderDetailKITExample example);

    int updateByExample(@Param("record") OrderDetailKIT record, @Param("example") OrderDetailKITExample example);

    int updateByPrimaryKeySelective(OrderDetailKIT record);

    int updateByPrimaryKey(OrderDetailKIT record);
}