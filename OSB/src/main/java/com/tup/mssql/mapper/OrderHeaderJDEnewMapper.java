package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.OrderHeaderJDEnew;
import com.tup.mssql.model.OrderHeaderJDEnewExample;
import com.tup.mssql.model.OrderHeaderJDEnewKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderHeaderJDEnewMapper  extends BaseMapper<OrderHeaderJDEnew> {
    int countByExample(OrderHeaderJDEnewExample example);

    int deleteByExample(OrderHeaderJDEnewExample example);

    int deleteByPrimaryKey(OrderHeaderJDEnewKey key);

   Integer  insert(OrderHeaderJDEnew record);

    int insertSelective(OrderHeaderJDEnew record);

    List<OrderHeaderJDEnew> selectByExample(OrderHeaderJDEnewExample example);

    OrderHeaderJDEnew selectByPrimaryKey(OrderHeaderJDEnewKey key);

    int updateByExampleSelective(@Param("record") OrderHeaderJDEnew record, @Param("example") OrderHeaderJDEnewExample example);

    int updateByExample(@Param("record") OrderHeaderJDEnew record, @Param("example") OrderHeaderJDEnewExample example);

    int updateByPrimaryKeySelective(OrderHeaderJDEnew record);

    int updateByPrimaryKey(OrderHeaderJDEnew record);
}