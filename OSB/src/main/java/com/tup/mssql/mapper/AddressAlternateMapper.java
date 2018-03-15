package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.AddressAlternate;
import com.tup.mssql.model.AddressAlternateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressAlternateMapper  extends BaseMapper<AddressAlternate> {
    int countByExample(AddressAlternateExample example);

    int deleteByExample(AddressAlternateExample example);

   Integer  insert(AddressAlternate record);

    int insertSelective(AddressAlternate record);

    List<AddressAlternate> selectByExample(AddressAlternateExample example);

    int updateByExampleSelective(@Param("record") AddressAlternate record, @Param("example") AddressAlternateExample example);

    int updateByExample(@Param("record") AddressAlternate record, @Param("example") AddressAlternateExample example);
}