package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.ItemPRP2;
import com.tup.mssql.model.ItemPRP2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemPRP2Mapper  extends BaseMapper<ItemPRP2> {
    int countByExample(ItemPRP2Example example);

    int deleteByExample(ItemPRP2Example example);

    int deleteByPrimaryKey(String itemClsno);

   Integer  insert(ItemPRP2 record);

    int insertSelective(ItemPRP2 record);

    List<ItemPRP2> selectByExample(ItemPRP2Example example);

    ItemPRP2 selectByPrimaryKey(String itemClsno);

    int updateByExampleSelective(@Param("record") ItemPRP2 record, @Param("example") ItemPRP2Example example);

    int updateByExample(@Param("record") ItemPRP2 record, @Param("example") ItemPRP2Example example);

    int updateByPrimaryKeySelective(ItemPRP2 record);

    int updateByPrimaryKey(ItemPRP2 record);
}