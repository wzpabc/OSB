package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.OrderDetailJDE;
import com.tup.mssql.model.OrderDetailJDEExample;
import com.tup.mssql.model.OrderDetailJDEKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailJDEMapper  extends BaseMapper<OrderDetailJDE> {
    int countByExample(OrderDetailJDEExample example);

    int deleteByExample(OrderDetailJDEExample example);

    int deleteByPrimaryKey(OrderDetailJDEKey key);

   Integer  insert(OrderDetailJDE record);

    int insertSelective(OrderDetailJDE record);

    List<OrderDetailJDE> selectByExample(OrderDetailJDEExample example);

    OrderDetailJDE selectByPrimaryKey(OrderDetailJDEKey key);

    int updateByExampleSelective(@Param("record") OrderDetailJDE record, @Param("example") OrderDetailJDEExample example);

    int updateByExample(@Param("record") OrderDetailJDE record, @Param("example") OrderDetailJDEExample example);

    int updateByPrimaryKeySelective(OrderDetailJDE record);

    int updateByPrimaryKey(OrderDetailJDE record);
}