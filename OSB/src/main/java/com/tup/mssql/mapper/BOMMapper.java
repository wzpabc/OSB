package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.BOM;
import com.tup.mssql.model.BOMExample;
import com.tup.mssql.model.BOMKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BOMMapper  extends BaseMapper<BOM> {
    int countByExample(BOMExample example);

    int deleteByExample(BOMExample example);

    int deleteByPrimaryKey(BOMKey key);

   Integer  insert(BOM record);

    int insertSelective(BOM record);

    List<BOM> selectByExample(BOMExample example);

    BOM selectByPrimaryKey(BOMKey key);

    int updateByExampleSelective(@Param("record") BOM record, @Param("example") BOMExample example);

    int updateByExample(@Param("record") BOM record, @Param("example") BOMExample example);

    int updateByPrimaryKeySelective(BOM record);

    int updateByPrimaryKey(BOM record);
}