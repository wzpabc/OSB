package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.OrderbackRD;
import com.tup.mssql.model.OrderbackRDExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderbackRDMapper  extends BaseMapper<OrderbackRD> {
    int countByExample(OrderbackRDExample example);

    int deleteByExample(OrderbackRDExample example);

   Integer  insert(OrderbackRD record);

    int insertSelective(OrderbackRD record);

    List<OrderbackRD> selectByExample(OrderbackRDExample example);

    int updateByExampleSelective(@Param("record") OrderbackRD record, @Param("example") OrderbackRDExample example);

    int updateByExample(@Param("record") OrderbackRD record, @Param("example") OrderbackRDExample example);
}