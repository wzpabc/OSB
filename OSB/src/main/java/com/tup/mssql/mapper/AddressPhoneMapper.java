package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.AddressPhone;
import com.tup.mssql.model.AddressPhoneExample;
import com.tup.mssql.model.AddressPhoneKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressPhoneMapper  extends BaseMapper<AddressPhone> {
    int countByExample(AddressPhoneExample example);

    int deleteByExample(AddressPhoneExample example);

    int deleteByPrimaryKey(AddressPhoneKey key);

   Integer  insert(AddressPhone record);

    int insertSelective(AddressPhone record);

    List<AddressPhone> selectByExample(AddressPhoneExample example);

    AddressPhone selectByPrimaryKey(AddressPhoneKey key);

    int updateByExampleSelective(@Param("record") AddressPhone record, @Param("example") AddressPhoneExample example);

    int updateByExample(@Param("record") AddressPhone record, @Param("example") AddressPhoneExample example);

    int updateByPrimaryKeySelective(AddressPhone record);

    int updateByPrimaryKey(AddressPhone record);
}