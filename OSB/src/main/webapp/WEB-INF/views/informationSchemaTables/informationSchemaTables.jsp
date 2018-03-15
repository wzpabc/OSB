<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/global.jsp" %>
<script type="text/javascript">
    var informationSchemaTablesDataGrid;
    $(function() {
        informationSchemaTablesDataGrid = $('#informationSchemaTablesDataGrid').datagrid({
        url : '${path}/informationSchemaTables/dataGrid',
        striped : true,
        rownumbers : true,
        pagination : true,
        singleSelect : true,
        idField : 'id',
        sortName : 'id',
        sortOrder : 'asc',
        pageSize : 20,
        pageList : [ 10, 20, 30, 40, 50, 100, 200, 300, 400, 500],
        columns : [ [ 
         
				 { width : '60',title : 'id', field : 'id',sortable : true },
				 { width : '60',title : 'table_catalog', field : 'table_catalog',sortable : true },
				 { width : '60',title : 'table_catalog', field : 'table_catalog',sortable : true },
				 { width : '60',title : 'table_schema', field : 'table_schema',sortable : true },
				 { width : '60',title : 'table_schema', field : 'table_schema',sortable : true },
				 { width : '60',title : 'table_name', field : 'table_name',sortable : true },
				 { width : '60',title : 'table_name', field : 'table_name',sortable : true },
				 { width : '60',title : 'table_type', field : 'table_type',sortable : true },
		        {
            field : 'action',
            title : '操作',
            width : 200,
            formatter : function(value, row, index) {
                var str = '';
                <shiro:hasPermission name="/user/add">
                    str += $.formatString('<a href="javascript:void(0)" class="informationSchemaTables-easyui-linkbutton-edit" data-options="plain:true,iconCls:\'fi-pencil icon-blue\'" onclick="informationSchemaTablesEditFun(\'{0}\');" >编辑</a>', row.id);
                </shiro:hasPermission>
                <shiro:hasPermission name="/user/add">
                    str += '&nbsp;&nbsp;|&nbsp;&nbsp;';
                    str += $.formatString('<a href="javascript:void(0)" class="informationSchemaTables-easyui-linkbutton-del" data-options="plain:true,iconCls:\'fi-x icon-red\'" onclick="informationSchemaTablesDeleteFun(\'{0}\');" >删除</a>', row.id);
                </shiro:hasPermission>
                return str;
            }
        } ] ],
        onLoadSuccess:function(data){
            $('.informationSchemaTables-easyui-linkbutton-edit').linkbutton({text:'编辑'});
            $('.informationSchemaTables-easyui-linkbutton-del').linkbutton({text:'删除'});
        },
        toolbar : '#informationSchemaTablesToolbar'
    });
});

/**
 * 添加框
 * @param url
 */
function informationSchemaTablesAddFun() {
    parent.$.modalDialog({
        title : '添加',
        width : 700,
        height : 600,
        href : '${path}/informationSchemaTables/addPage',
        buttons : [ {
			            text : '确定',
			            handler : function() {
			                parent.$.modalDialog.openner_dataGrid = informationSchemaTablesDataGrid;//因为添加成功之后，需要刷新这个treeGrid，所以先预定义好
			                var f = parent.$.modalDialog.handler.find('#informationSchemaTablesAddForm');
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
function informationSchemaTablesEditFun(id) {
    if (id == undefined) {
        var rows = informationSchemaTablesDataGrid.datagrid('getSelections');
        id = rows[0].id;
    } else {
        informationSchemaTablesDataGrid.datagrid('unselectAll').datagrid('uncheckAll');
    }
    parent.$.modalDialog({
        title : '编辑',
        width : 700,
        height : 600,
        href :  '${path}/informationSchemaTables/editPage?id=' + id,
        buttons : [ {
		            text : '确定',
		            handler : function() {
				                parent.$.modalDialog.openner_dataGrid = informationSchemaTablesDataGrid;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
				                var f = parent.$.modalDialog.handler.find('#informationSchemaTablesEditForm');
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
 function informationSchemaTablesDeleteFun(id) {
     if (id == undefined) {//点击右键菜单才会触发这个
         var rows = informationSchemaTablesDataGrid.datagrid('getSelections');
         id = rows[0].id;
     } else {//点击操作里面的删除图标会触发这个
         informationSchemaTablesDataGrid.datagrid('unselectAll').datagrid('uncheckAll');
     }
     parent.$.messager.confirm('询问', '您是否要删除当前角色？', function(b) {
         if (b) {
             progressLoad();
             $.post('${path}/informationSchemaTables/delete', {
                 id : id
             }, function(result) {
                 if (result.success) {
                     parent.$.messager.alert('提示', result.msg, 'info');
                     informationSchemaTablesDataGrid.datagrid('reload');
                 }
                 progressClose();
             }, 'JSON');
         }
     });
}


/**
 * 清除
 */
function informationSchemaTablesCleanFun() {
    $('#informationSchemaTablesSearchForm input').val('');
    informationSchemaTablesDataGrid.datagrid('load', {});
}
/**
 * 搜索
 */
function informationSchemaTablesSearchFun() {
     informationSchemaTablesDataGrid.datagrid('load', $.serializeObject($('#informationSchemaTablesSearchForm')));
}
</script>

<div class="easyui-layout" data-options="fit:true,border:false">
    <div data-options="region:'north',border:false" style="height: 30px; overflow: hidden;background-color: #fff">
        <form id="informationSchemaTablesSearchForm">
            <table>
                <tr>
                    <td>名称:</td>
                    <td><input name="name" type="text" class="easyui-textbox"  placeholder="搜索条件"/></td>                 
                </tr>
            </table>
        </form>
     </div>
 
    <div data-options="region:'center',border:false">
        <table id="informationSchemaTablesDataGrid" data-options="fit:true,border:false"></table>
    </div>
</div>
<div id="informationSchemaTablesToolbar" style="display: none;">
    <shiro:hasPermission name="/user/add">
        <a onclick="informationSchemaTablesAddFun();" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'fi-plus icon-green'">添加</a>
        <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'fi-magnifying-glass',plain:true" onclick="informationSchemaTablesSearchFun();">查询</a>
        <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'fi-x-circle',plain:true" onclick="informationSchemaTablesCleanFun();">清空</a>       
    </shiro:hasPermission>
</div>