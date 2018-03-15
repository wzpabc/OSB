package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.ItemPRP3;
import com.tup.mssql.model.ItemPRP3Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemPRP3Mapper  extends BaseMapper<ItemPRP3> {
    int countByExample(ItemPRP3Example example);

    int deleteByExample(ItemPRP3Example example);

    int deleteByPrimaryKey(String itemBrandno);

   Integer  insert(ItemPRP3 record);

    int insertSelective(ItemPRP3 record);

    List<ItemPRP3> selectByExample(ItemPRP3Example example);

    ItemPRP3 selectByPrimaryKey(String itemBrandno);

    int updateByExampleSelective(@Param("record") ItemPRP3 record, @Param("example") ItemPRP3Example example);

    int updateByExample(@Param("record") ItemPRP3 record, @Param("example") ItemPRP3Example example);

    int updateByPrimaryKeySelective(ItemPRP3 record);

    int updateByPrimaryKey(ItemPRP3 record);
}