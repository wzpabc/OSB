package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.ImportBasePrice;
import com.tup.mssql.model.ImportBasePriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImportBasePriceMapper  extends BaseMapper<ImportBasePrice> {
    int countByExample(ImportBasePriceExample example);

    int deleteByExample(ImportBasePriceExample example);

   Integer  insert(ImportBasePrice record);

    int insertSelective(ImportBasePrice record);

    List<ImportBasePrice> selectByExample(ImportBasePriceExample example);

    int updateByExampleSelective(@Param("record") ImportBasePrice record, @Param("example") ImportBasePriceExample example);

    int updateByExample(@Param("record") ImportBasePrice record, @Param("example") ImportBasePriceExample example);
}