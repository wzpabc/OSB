package com.tup.mssql.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.mssql.model.ItemPrice;
import com.tup.mssql.model.ItemPriceExample;
import com.tup.mssql.model.ItemPriceKey;

public interface ItemPriceMapper  extends BaseMapper<ItemPrice> {
    int countByExample(ItemPriceExample example);

    int deleteByExample(ItemPriceExample example);

    int deleteByPrimaryKey(ItemPriceKey key);

   Integer  insert(ItemPrice record);

    int insertSelective(ItemPrice record);

    List<ItemPrice> selectByExample(ItemPriceExample example);

    List<ItemPrice > selectByMapParam(Map<String,String> params);
    ItemPrice selectByPrimaryKey(ItemPriceKey key);

    int updateByExampleSelective(@Param("record") ItemPrice record, @Param("example") ItemPriceExample example);

    int updateByExample(@Param("record") ItemPrice record, @Param("example") ItemPriceExample example);

    int updateByPrimaryKeySelective(ItemPrice record);

    int updateByPrimaryKey(ItemPrice record);
}