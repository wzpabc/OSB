package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.OrderHeaderJDE;
import com.tup.mssql.model.OrderHeaderJDEExample;
import com.tup.mssql.model.OrderHeaderJDEKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderHeaderJDEMapper  extends BaseMapper<OrderHeaderJDE> {
    int countByExample(OrderHeaderJDEExample example);

    int deleteByExample(OrderHeaderJDEExample example);

    int deleteByPrimaryKey(OrderHeaderJDEKey key);

   Integer  insert(OrderHeaderJDE record);

    int insertSelective(OrderHeaderJDE record);

    List<OrderHeaderJDE> selectByExample(OrderHeaderJDEExample example);

    OrderHeaderJDE selectByPrimaryKey(OrderHeaderJDEKey key);

    int updateByExampleSelective(@Param("record") OrderHeaderJDE record, @Param("example") OrderHeaderJDEExample example);

    int updateByExample(@Param("record") OrderHeaderJDE record, @Param("example") OrderHeaderJDEExample example);

    int updateByPrimaryKeySelective(OrderHeaderJDE record);

    int updateByPrimaryKey(OrderHeaderJDE record);
}