package com.tup.mssql.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.tup.mssql.model.AccountCalendar;
import com.tup.mssql.model.AccountCalendarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountCalendarMapper  extends BaseMapper<AccountCalendar> {
    int countByExample(AccountCalendarExample example);

    int deleteByExample(AccountCalendarExample example);

   Integer  insert(AccountCalendar record);

    int insertSelective(AccountCalendar record);

    List<AccountCalendar> selectByExample(AccountCalendarExample example);

    int updateByExampleSelective(@Param("record") AccountCalendar record, @Param("example") AccountCalendarExample example);

    int updateByExample(@Param("record") AccountCalendar record, @Param("example") AccountCalendarExample example);
}