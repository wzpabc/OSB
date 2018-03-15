package com.tup.mssql.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.tup.mssql.model.ReportsByTime;

/**
 * <p>
 * Mapper接口
 * </p>
 *
 * @author patrick.wang
 * @since 2018-03-13
 */
public interface ReportsByTimeMapper extends BaseMapper<ReportsByTime> {
    //int countByExample(ReportsByTimeExample example);

   // int deleteByExample(ReportsByTimeExample example);

    Integer insert(ReportsByTime record);

    int insertSelective(ReportsByTime record);
    
    
    List<ReportsByTime > selectByMapParam(Map<String,String> params);
    

    List<ReportsByTime> selectReportsByTimeList(Pagination page, @Param("sort") String sort, @Param("order") String order);

    //List<ReportsByTime> selectByExample(ReportsByTimeExample example);

    //int updateByExampleSelective(@Param("record") ReportsByTime record, @Param("example") ReportsByTimeExample example);

    //int updateByExample(@Param("record") ReportsByTime record, @Param("example") ReportsByTimeExample example);
}