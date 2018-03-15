package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.OrderDetailInEDI;
import com.tup.mssql.model.OrderDetailInEDIExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailInEDIMapper  extends BaseMapper<OrderDetailInEDI> {
    int countByExample(OrderDetailInEDIExample example);

    int deleteByExample(OrderDetailInEDIExample example);

    int deleteByPrimaryKey(String id);

   Integer  insert(OrderDetailInEDI record);

    int insertSelective(OrderDetailInEDI record);

    List<OrderDetailInEDI> selectByExample(OrderDetailInEDIExample example);

    OrderDetailInEDI selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderDetailInEDI record, @Param("example") OrderDetailInEDIExample example);

    int updateByExample(@Param("record") OrderDetailInEDI record, @Param("example") OrderDetailInEDIExample example);

    int updateByPrimaryKeySelective(OrderDetailInEDI record);

    int updateByPrimaryKey(OrderDetailInEDI record);
}