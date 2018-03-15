<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/global.jsp" %>
<script type="text/javascript">
    var reportsByTimeDataGrid;
    $(function() {
        reportsByTimeDataGrid = $('#reportsByTimeDataGrid').datagrid({
        url : '${path}/reportsByTime/dataGrid',
        striped : true,
        rownumbers : true,
        pagination : true,
        singleSelect : true,
        idField : 'id',
        sortName : 'createdts',
        sortOrder : 'desc',
        pageSize : 20,
        pageList : [ 10, 20, 30, 40, 50, 100, 200, 300, 400, 500],
        columns : [ [ 
         
				 { width : '60',title : 'pk', field : 'pk',sortable : true },
				 { width : '60',title : 'organ_no', field : 'organ_no',sortable : true },
				 { width : '60',title : 'hjmpts', field : 'hjmpts',sortable : true },
				 { width : '60',title : 'createdts', field : 'createdts',sortable : true },
				 { width : '60',title : 'modifiedts', field : 'modifiedts',sortable : true },
				 { width : '60',title : 'typepkstring', field : 'typepkstring',sortable : true },
				 { width : '60',title : 'ownerpkstring', field : 'ownerpkstring',sortable : true },
				 { width : '60',title : 'p_customer_id', field : 'p_customer_id',sortable : true },
				 { width : '60',title : 'p_report_status', field : 'p_report_status',sortable : true },
				 { width : '60',title : 'p_store_type', field : 'p_store_type',sortable : true },
				 { width : '60',title : 'p_year', field : 'p_year',sortable : true },
				 { width : '60',title : 'p_month', field : 'p_month',sortable : true },
				 { width : '60',title : 'p_week', field : 'p_week',sortable : true },
				 { width : '60',title : 'p_report_type', field : 'p_report_type',sortable : true },
				 { width : '60',title : 'p_counter_sale_amts', field : 'p_counter_sale_amts',sortable : true },
				 { width : '60',title : 'p_lijia_sales_amts', field : 'p_lijia_sales_amts',sortable : true },
				 { width : '60',title : 'p_grpb_sales_amts', field : 'p_grpb_sales_amts',sortable : true },
				 { width : '60',title : 'p_customised_sales_amts', field : 'p_customised_sales_amts',sortable : true },
				 { width : '60',title : 'p_others_sales_amts', field : 'p_others_sales_amts',sortable : true },
				 { width : '60',title : 'p_deal_amts', field : 'p_deal_amts',sortable : true },
				 { width : '60',title : 'p_total_sales_amts', field : 'p_total_sales_amts',sortable : true },
				 { width : '60',title : 'p_natural_customer_no', field : 'p_natural_customer_no',sortable : true },
				 { width : '60',title : 'p_comeback_customer_no', field : 'p_comeback_customer_no',sortable : true },
				 { width : '60',title : 'p_customised_customer_no', field : 'p_customised_customer_no',sortable : true },
				 { width : '60',title : 'p_lijia_customer_no', field : 'p_lijia_customer_no',sortable : true },
				 { width : '60',title : 'p_total_customer_no', field : 'p_total_customer_no',sortable : true },
				 { width : '60',title : 'p_customised_prstt_times', field : 'p_customised_prstt_times',sortable : true },
				 { width : '60',title : 'p_lijia_prstt_times', field : 'p_lijia_prstt_times',sortable : true },
				 { width : '60',title : 'p_imdtly_prstt_times', field : 'p_imdtly_prstt_times',sortable : true },
				 { width : '60',title : 'p_water_purifier_sales_amts', field : 'p_water_purifier_sales_amts',sortable : true },
				 { width : '60',title : 'p_total_prstt_times', field : 'p_total_prstt_times',sortable : true },
				 { width : '60',title : 'p_com_order_amt', field : 'p_com_order_amt',sortable : true },
				 { width : '60',title : 'p_transfer_amt', field : 'p_transfer_amt',sortable : true },
				 { width : '60',title : 'p_total_order_amt', field : 'p_total_order_amt',sortable : true },
				 { width : '60',title : 'p_lijia_fulltime_consutant_no', field : 'p_lijia_fulltime_consutant_no',sortable : true },
				 { width : '60',title : 'p_weekend_stock_amt', field : 'p_weekend_stock_amt',sortable : true },
				 { width : '60',title : 'p_is_manager', field : 'p_is_manager',sortable : true },
				 { width : '60',title : 'p_manager_name', field : 'p_manager_name',sortable : true },
				 { width : '60',title : 'p_manager_type', field : 'p_manager_type',sortable : true },
				 { width : '60',title : 'p_report_desc', field : 'p_report_desc',sortable : true },
				 { width : '60',title : 'p_decoration_charge', field : 'p_decoration_charge',sortable : true },
				 { width : '60',title : 'p_operation_charge', field : 'p_operation_charge',sortable : true },
				 { width : '60',title : 'p_labor_charge', field : 'p_labor_charge',sortable : true },
				 { width : '60',title : 'p_room_charge', field : 'p_room_charge',sortable : true },
				 { width : '60',title : 'p_light_water_charge', field : 'p_light_water_charge',sortable : true },
				 { width : '60',title : 'p_promo_charge', field : 'p_promo_charge',sortable : true },
				 { width : '60',title : 'p_phone_charge', field : 'p_phone_charge',sortable : true },
				 { width : '60',title : 'p_logistical_charge', field : 'p_logistical_charge',sortable : true },
				 { width : '60',title : 'p_tax_charge', field : 'p_tax_charge',sortable : true },
				 { width : '60',title : 'p_others_charge', field : 'p_others_charge',sortable : true },
				 { width : '60',title : 'p_psm_charge', field : 'p_psm_charge',sortable : true },
				 { width : '60',title : 'p_warehouse_charge', field : 'p_warehouse_charge',sortable : true },
				 { width : '60',title : 'p_has_wechat', field : 'p_has_wechat',sortable : true },
				 { width : '60',title : 'p_wechat_grp_no', field : 'p_wechat_grp_no',sortable : true },
				 { width : '60',title : 'p_wechat_members_no', field : 'p_wechat_members_no',sortable : true },
				 { width : '60',title : 'p_wechat_moments_members_no', field : 'p_wechat_moments_members_no',sortable : true },
				 { width : '60',title : 'p_experice_card_price50_no', field : 'p_experice_card_price50_no',sortable : true },
				 { width : '60',title : 'p_experice_card_price500_no', field : 'p_experice_card_price500_no',sortable : true },
				 { width : '60',title : 'p_lijia_team_course_no', field : 'p_lijia_team_course_no',sortable : true },
				 { width : '60',title : 'p_hshs_foods_carnival_no', field : 'p_hshs_foods_carnival_no',sortable : true },
				 { width : '60',title : 'p_onlinesaleamt', field : 'p_onlinesaleamt',sortable : true },
				 { width : '60',title : 'p_province', field : 'p_province',sortable : true },
				 { width : '60',title : 'p_region', field : 'p_region',sortable : true },
				 { width : '60',title : 'aclts', field : 'aclts',sortable : true },
				 { width : '60',title : 'propts', field : 'propts',sortable : true },
				 { width : '60',title : 'p_breakevenpoint', field : 'p_breakevenpoint',sortable : true },
				 { width : '60',title : 'p_fs', field : 'p_fs',sortable : true },
				 { width : '60',title : 'p_dm', field : 'p_dm',sortable : true },
		        {
            field : 'action',
            title : '操作',
            width : 200,
            formatter : function(value, row, index) {
                var str = '';
                <shiro:hasPermission name="/user/add">
                    str += $.formatString('<a href="javascript:void(0)" class="reportsByTime-easyui-linkbutton-edit" data-options="plain:true,iconCls:\'fi-pencil icon-blue\'" onclick="reportsByTimeEditFun(\'{0}\');" >编辑</a>', row.id);
                </shiro:hasPermission>
                <shiro:hasPermission name="/user/add">
                    str += '&nbsp;&nbsp;|&nbsp;&nbsp;';
                    str += $.formatString('<a href="javascript:void(0)" class="reportsByTime-easyui-linkbutton-del" data-options="plain:true,iconCls:\'fi-x icon-red\'" onclick="reportsByTimeDeleteFun(\'{0}\');" >删除</a>', row.id);
                </shiro:hasPermission>
                return str;
            }
        } ] ],
        onLoadSuccess:function(data){
            $('.reportsByTime-easyui-linkbutton-edit').linkbutton({text:'编辑'});
            $('.reportsByTime-easyui-linkbutton-del').linkbutton({text:'删除'});
        },
        toolbar : '#reportsByTimeToolbar'
    });
});

/**
 * 添加框
 * @param url
 */
function reportsByTimeAddFun() {
    parent.$.modalDialog({
        title : '添加',
        width : 700,
        height : 600,
        href : '${path}/reportsByTime/addPage',
        buttons : [ {
			            text : '确定',
			            handler : function() {
			                parent.$.modalDialog.openner_dataGrid = reportsByTimeDataGrid;//因为添加成功之后，需要刷新这个treeGrid，所以先预定义好
			                var f = parent.$.modalDialog.handler.find('#reportsByTimeAddForm');
			                f.submit();
					            }
					 }  ,
			        {
			            text : '关闭',
			            handler : function() {
			                alert("关闭");
			            }
			        } ,
			        {
			            text : '重置',
			            handler : function() {
			            	 alert("重置");
			            }
			        } ]
    });
}


/**
 * 编辑
 */
function reportsByTimeEditFun(id) {
    if (id == undefined) {
        var rows = reportsByTimeDataGrid.datagrid('getSelections');
        id = rows[0].id;
    } else {
        reportsByTimeDataGrid.datagrid('unselectAll').datagrid('uncheckAll');
    }
    parent.$.modalDialog({
        title : '编辑',
        width : 700,
        height : 600,
        href :  '${path}/reportsByTime/editPage?id=' + id,
        buttons : [ {
		            text : '确定',
		            handler : function() {
				                parent.$.modalDialog.openner_dataGrid = reportsByTimeDataGrid;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
				                var f = parent.$.modalDialog.handler.find('#reportsByTimeEditForm');
				                f.submit();
				            }
				        }  ,
			        {
			            text : '关闭',
			            handler : function() {
			                alert("关闭");
			            }
			        } ,
			        {
			            text : '重置',
			            handler : function() {
			            	 alert("重置");
			            }
			        } ]
    });
}


/**
 * 删除
 */
 function reportsByTimeDeleteFun(id) {
     if (id == undefined) {//点击右键菜单才会触发这个
         var rows = reportsByTimeDataGrid.datagrid('getSelections');
         id = rows[0].id;
     } else {//点击操作里面的删除图标会触发这个
         reportsByTimeDataGrid.datagrid('unselectAll').datagrid('uncheckAll');
     }
     parent.$.messager.confirm('询问', '您是否要删除当前角色？', function(b) {
         if (b) {
             progressLoad();
             $.post('${path}/reportsByTime/delete', {
                 id : id
             }, function(result) {
                 if (result.success) {
                     parent.$.messager.alert('提示', result.msg, 'info');
                     reportsByTimeDataGrid.datagrid('reload');
                 }
                 progressClose();
             }, 'JSON');
         }
     });
}


/**
 * 清除
 */
function reportsByTimeCleanFun() {
    $('#reportsByTimeSearchForm input').val('');
    reportsByTimeDataGrid.datagrid('load', {});
}
/**
 * 搜索
 */
function reportsByTimeSearchFun() {
     reportsByTimeDataGrid.datagrid('load', $.serializeObject($('#reportsByTimeSearchForm')));
}
</script>

<div class="easyui-layout" data-options="fit:true,border:false">
    <div data-options="region:'north',border:false" style="height: 30px; overflow: hidden;background-color: #fff">
        <form id="reportsByTimeSearchForm">
            <table>
                <tr>
                    <td>名称:</td>
                    <td><input name="name" type="text" class="easyui-textbox"  placeholder="搜索条件"/></td>                 
                </tr>
            </table>
        </form>
     </div>
 
    <div data-options="region:'center',border:false">
        <table id="reportsByTimeDataGrid" data-options="fit:true,border:false"></table>
    </div>
</div>
<div id="reportsByTimeToolbar" style="display: none;">
    <shiro:hasPermission name="/user/add">
        <a onclick="reportsByTimeAddFun();" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'fi-plus icon-green'">添加</a>
        <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'fi-magnifying-glass',plain:true" onclick="reportsByTimeSearchFun();">查询</a>
        <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'fi-x-circle',plain:true" onclick="reportsByTimeCleanFun();">清空</a>       
    </shiro:hasPermission>
</div>