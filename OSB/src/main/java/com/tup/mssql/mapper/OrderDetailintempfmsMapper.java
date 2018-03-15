package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.OrderDetailintempfms;
import com.tup.mssql.model.OrderDetailintempfmsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailintempfmsMapper  extends BaseMapper<OrderDetailintempfms> {
    int countByExample(OrderDetailintempfmsExample example);

    int deleteByExample(OrderDetailintempfmsExample example);

    int deleteByPrimaryKey(String id);

   Integer  insert(OrderDetailintempfms record);

    int insertSelective(OrderDetailintempfms record);

    List<OrderDetailintempfms> selectByExample(OrderDetailintempfmsExample example);

    OrderDetailintempfms selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderDetailintempfms record, @Param("example") OrderDetailintempfmsExample example);

    int updateByExample(@Param("record") OrderDetailintempfms record, @Param("example") OrderDetailintempfmsExample example);

    int updateByPrimaryKeySelective(OrderDetailintempfms record);

    int updateByPrimaryKey(OrderDetailintempfms record);
}