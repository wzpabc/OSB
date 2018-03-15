package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.OrderDetailintemp;
import com.tup.mssql.model.OrderDetailintempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailintempMapper  extends BaseMapper<OrderDetailintemp> {
    int countByExample(OrderDetailintempExample example);

    int deleteByExample(OrderDetailintempExample example);

    int deleteByPrimaryKey(String id);

   Integer  insert(OrderDetailintemp record);

    int insertSelective(OrderDetailintemp record);

    List<OrderDetailintemp> selectByExample(OrderDetailintempExample example);

    OrderDetailintemp selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderDetailintemp record, @Param("example") OrderDetailintempExample example);

    int updateByExample(@Param("record") OrderDetailintemp record, @Param("example") OrderDetailintempExample example);

    int updateByPrimaryKeySelective(OrderDetailintemp record);

    int updateByPrimaryKey(OrderDetailintemp record);
}