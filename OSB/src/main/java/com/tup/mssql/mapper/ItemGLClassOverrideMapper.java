package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.ItemGLClassOverride;
import com.tup.mssql.model.ItemGLClassOverrideExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemGLClassOverrideMapper  extends BaseMapper<ItemGLClassOverride> {
    int countByExample(ItemGLClassOverrideExample example);

    int deleteByExample(ItemGLClassOverrideExample example);

    int deleteByPrimaryKey(String id);

   Integer  insert(ItemGLClassOverride record);

    int insertSelective(ItemGLClassOverride record);

    List<ItemGLClassOverride> selectByExample(ItemGLClassOverrideExample example);

    ItemGLClassOverride selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ItemGLClassOverride record, @Param("example") ItemGLClassOverrideExample example);

    int updateByExample(@Param("record") ItemGLClassOverride record, @Param("example") ItemGLClassOverrideExample example);

    int updateByPrimaryKeySelective(ItemGLClassOverride record);

    int updateByPrimaryKey(ItemGLClassOverride record);
}