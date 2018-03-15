package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.Orderheaderintempfms;
import com.tup.mssql.model.OrderheaderintempfmsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderheaderintempfmsMapper  extends BaseMapper<Orderheaderintempfms> {
    int countByExample(OrderheaderintempfmsExample example);

    int deleteByExample(OrderheaderintempfmsExample example);

    int deleteByPrimaryKey(String id);

   Integer  insert(Orderheaderintempfms record);

    int insertSelective(Orderheaderintempfms record);

    List<Orderheaderintempfms> selectByExample(OrderheaderintempfmsExample example);

    Orderheaderintempfms selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Orderheaderintempfms record, @Param("example") OrderheaderintempfmsExample example);

    int updateByExample(@Param("record") Orderheaderintempfms record, @Param("example") OrderheaderintempfmsExample example);

    int updateByPrimaryKeySelective(Orderheaderintempfms record);

    int updateByPrimaryKey(Orderheaderintempfms record);
}