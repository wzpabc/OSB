package com.tup.mssql.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.mssql.model.Item;
import com.tup.mssql.model.ItemExample;
import com.tup.mssql.model.ItemKey;

public interface ItemMapper  extends BaseMapper<Item> {
    int countByExample(ItemExample example);

    int deleteByExample(ItemExample example);

    int deleteByPrimaryKey(ItemKey key);

   Integer  insert(Item record);

    int insertSelective(Item record);

    List<Item> selectByExample(ItemExample example);
    

    List<Item > selectByMapParam(Map<String,String> params);

    Item selectByPrimaryKey(ItemKey key);

    int updateByExampleSelective(@Param("record") Item record, @Param("example") ItemExample example);

    int updateByExample(@Param("record") Item record, @Param("example") ItemExample example);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);
}