package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.OrderHeaderInEDI;
import com.tup.mssql.model.OrderHeaderInEDIExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderHeaderInEDIMapper  extends BaseMapper<OrderHeaderInEDI> {
    int countByExample(OrderHeaderInEDIExample example);

    int deleteByExample(OrderHeaderInEDIExample example);

    int deleteByPrimaryKey(String id);

   Integer  insert(OrderHeaderInEDI record);

    int insertSelective(OrderHeaderInEDI record);

    List<OrderHeaderInEDI> selectByExample(OrderHeaderInEDIExample example);

    OrderHeaderInEDI selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderHeaderInEDI record, @Param("example") OrderHeaderInEDIExample example);

    int updateByExample(@Param("record") OrderHeaderInEDI record, @Param("example") OrderHeaderInEDIExample example);

    int updateByPrimaryKeySelective(OrderHeaderInEDI record);

    int updateByPrimaryKey(OrderHeaderInEDI record);
}