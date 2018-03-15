package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.Orderheaderintemp;
import com.tup.mssql.model.OrderheaderintempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderheaderintempMapper  extends BaseMapper<Orderheaderintemp> {
    int countByExample(OrderheaderintempExample example);

    int deleteByExample(OrderheaderintempExample example);

    int deleteByPrimaryKey(String id);

   Integer  insert(Orderheaderintemp record);

    int insertSelective(Orderheaderintemp record);

    List<Orderheaderintemp> selectByExample(OrderheaderintempExample example);

    Orderheaderintemp selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Orderheaderintemp record, @Param("example") OrderheaderintempExample example);

    int updateByExample(@Param("record") Orderheaderintemp record, @Param("example") OrderheaderintempExample example);

    int updateByPrimaryKeySelective(Orderheaderintemp record);

    int updateByPrimaryKey(Orderheaderintemp record);
}