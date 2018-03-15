package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.OrderDetailJDEnew;
import com.tup.mssql.model.OrderDetailJDEnewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailJDEnewMapper  extends BaseMapper<OrderDetailJDEnew> {
    int countByExample(OrderDetailJDEnewExample example);

    int deleteByExample(OrderDetailJDEnewExample example);

    int deleteByPrimaryKey(Integer rrn);

   Integer  insert(OrderDetailJDEnew record);

    int insertSelective(OrderDetailJDEnew record);

    List<OrderDetailJDEnew> selectByExample(OrderDetailJDEnewExample example);

    OrderDetailJDEnew selectByPrimaryKey(Integer rrn);

    int updateByExampleSelective(@Param("record") OrderDetailJDEnew record, @Param("example") OrderDetailJDEnewExample example);

    int updateByExample(@Param("record") OrderDetailJDEnew record, @Param("example") OrderDetailJDEnewExample example);

    int updateByPrimaryKeySelective(OrderDetailJDEnew record);

    int updateByPrimaryKey(OrderDetailJDEnew record);
}