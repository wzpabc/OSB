package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.ItemUOMMap;
import com.tup.mssql.model.ItemUOMMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemUOMMapMapper  extends BaseMapper<ItemUOMMap> {
    int countByExample(ItemUOMMapExample example);

    int deleteByExample(ItemUOMMapExample example);

    int deleteByPrimaryKey(String id);

   Integer  insert(ItemUOMMap record);

    int insertSelective(ItemUOMMap record);

    List<ItemUOMMap> selectByExample(ItemUOMMapExample example);

    ItemUOMMap selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ItemUOMMap record, @Param("example") ItemUOMMapExample example);

    int updateByExample(@Param("record") ItemUOMMap record, @Param("example") ItemUOMMapExample example);

    int updateByPrimaryKeySelective(ItemUOMMap record);

    int updateByPrimaryKey(ItemUOMMap record);
}