package com.tup.mssql.mapper;
import java.util.List;

import java.util.Map;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.mssql.model.InformationSchemaTables;
//import com.tup.mssql.model.InformationSchemaTablesExample;
import com.tup.mssql.model.InformationSchemaTables;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * Mapper接口
 * </p>
 *
 * @author patrick.wang
 * @since 2018-03-13
 */
public interface InformationSchemaTablesMapper extends BaseMapper<InformationSchemaTables> {
    //int countByExample(InformationSchemaTablesExample example);

   // int deleteByExample(InformationSchemaTablesExample example);

    Integer insert(InformationSchemaTables record);

    int insertSelective(InformationSchemaTables record);
    
    
    List<InformationSchemaTables> selectByMapParam(Map<String,String> params);
    
    
    List<InformationSchemaTables> selectInformationSchemaTablesList(Pagination page, @Param("sort") String sort, @Param("order") String order);
    

    //List<InformationSchemaTables> selectByExample(InformationSchemaTablesExample example);

    //int updateByExampleSelective(@Param("record") InformationSchemaTables record, @Param("example") InformationSchemaTablesExample example);

    //int updateByExample(@Param("record") InformationSchemaTables record, @Param("example") InformationSchemaTablesExample example);
}