package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.InventoryJDE;
import com.tup.mssql.model.InventoryJDEExample;
import com.tup.mssql.model.InventoryJDEKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InventoryJDEMapper  extends BaseMapper<InventoryJDE> {
    int countByExample(InventoryJDEExample example);

    int deleteByExample(InventoryJDEExample example);

    int deleteByPrimaryKey(InventoryJDEKey key);

   Integer  insert(InventoryJDE record);

    int insertSelective(InventoryJDE record);

    List<InventoryJDE> selectByExample(InventoryJDEExample example);

    InventoryJDE selectByPrimaryKey(InventoryJDEKey key);

    int updateByExampleSelective(@Param("record") InventoryJDE record, @Param("example") InventoryJDEExample example);

    int updateByExample(@Param("record") InventoryJDE record, @Param("example") InventoryJDEExample example);

    int updateByPrimaryKeySelective(InventoryJDE record);

    int updateByPrimaryKey(InventoryJDE record);
}