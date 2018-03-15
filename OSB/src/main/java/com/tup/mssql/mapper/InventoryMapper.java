package com.tup.mssql.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.mssql.model.Inventory;
import com.tup.mssql.model.InventoryExample;
import com.tup.mssql.model.InventoryKey;

public interface InventoryMapper  extends BaseMapper<Inventory> {
    int countByExample(InventoryExample example);

    int deleteByExample(InventoryExample example);

    int deleteByPrimaryKey(InventoryKey key);

   Integer  insert(Inventory record);

    int insertSelective(Inventory record);

    List<Inventory> selectByExample(InventoryExample example);

    List<Inventory > selectByMapParam(Map<String,String> params);
    Inventory selectByPrimaryKey(InventoryKey key);

    int updateByExampleSelective(@Param("record") Inventory record, @Param("example") InventoryExample example);

    int updateByExample(@Param("record") Inventory record, @Param("example") InventoryExample example);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);
}