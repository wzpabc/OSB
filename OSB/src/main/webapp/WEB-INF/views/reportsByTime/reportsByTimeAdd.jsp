<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/global.jsp" %>
<script type="text/javascript">
    $(function() {
        $('#reportsByTimeAddForm').form({
            url : '${path}/reportsByTime/add',
            onSubmit : function() {
                progressLoad();
                var isValid = $(this).form('validate');
                if (!isValid) {
                    progressClose();
                }
                return isValid;
            },
            success : function(result) {
                progressClose();
                result = $.parseJSON(result);
                if (result.success) {
                    //之所以能在这里调用到parent.$.modalDialog.openner_dataGrid这个对象，是因为user.jsp页面预定义好了
                    parent.$.modalDialog.openner_dataGrid.datagrid('reload');
                    parent.$.modalDialog.handler.dialog('close');
                } else {
                    parent.$.messager.alert('错误', result.msg, 'error');
                }
            }
        });
    });
</script>
<div class="easyui-layout" data-options="fit:true,border:false" >
    <div data-options="region:'center',border:false" style="overflow: hidden;padding: 3px;" >
        <form id="reportsByTimeAddForm" method="post">
            <table class="grid">
            		        <tr>
                    <td>pk</td>
                    <td><input name="pk" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>organ_no</td>
                    <td><input name="organ_no" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>hjmpts</td>
                    <td><input name="hjmpts" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>createdts</td>
                    <td><input name="createdts" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>modifiedts</td>
                    <td><input name="modifiedts" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>typepkstring</td>
                    <td><input name="typepkstring" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>ownerpkstring</td>
                    <td><input name="ownerpkstring" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_customer_id</td>
                    <td><input name="p_customer_id" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_report_status</td>
                    <td><input name="p_report_status" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_store_type</td>
                    <td><input name="p_store_type" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_year</td>
                    <td><input name="p_year" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_month</td>
                    <td><input name="p_month" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_week</td>
                    <td><input name="p_week" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_report_type</td>
                    <td><input name="p_report_type" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_counter_sale_amts</td>
                    <td><input name="p_counter_sale_amts" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_lijia_sales_amts</td>
                    <td><input name="p_lijia_sales_amts" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_grpb_sales_amts</td>
                    <td><input name="p_grpb_sales_amts" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_customised_sales_amts</td>
                    <td><input name="p_customised_sales_amts" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_others_sales_amts</td>
                    <td><input name="p_others_sales_amts" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_deal_amts</td>
                    <td><input name="p_deal_amts" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_total_sales_amts</td>
                    <td><input name="p_total_sales_amts" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_natural_customer_no</td>
                    <td><input name="p_natural_customer_no" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_comeback_customer_no</td>
                    <td><input name="p_comeback_customer_no" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_customised_customer_no</td>
                    <td><input name="p_customised_customer_no" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_lijia_customer_no</td>
                    <td><input name="p_lijia_customer_no" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_total_customer_no</td>
                    <td><input name="p_total_customer_no" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_customised_prstt_times</td>
                    <td><input name="p_customised_prstt_times" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_lijia_prstt_times</td>
                    <td><input name="p_lijia_prstt_times" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_imdtly_prstt_times</td>
                    <td><input name="p_imdtly_prstt_times" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_water_purifier_sales_amts</td>
                    <td><input name="p_water_purifier_sales_amts" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_total_prstt_times</td>
                    <td><input name="p_total_prstt_times" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_com_order_amt</td>
                    <td><input name="p_com_order_amt" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_transfer_amt</td>
                    <td><input name="p_transfer_amt" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_total_order_amt</td>
                    <td><input name="p_total_order_amt" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_lijia_fulltime_consutant_no</td>
                    <td><input name="p_lijia_fulltime_consutant_no" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_weekend_stock_amt</td>
                    <td><input name="p_weekend_stock_amt" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_is_manager</td>
                    <td><input name="p_is_manager" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_manager_name</td>
                    <td><input name="p_manager_name" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_manager_type</td>
                    <td><input name="p_manager_type" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_report_desc</td>
                    <td><input name="p_report_desc" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_decoration_charge</td>
                    <td><input name="p_decoration_charge" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_operation_charge</td>
                    <td><input name="p_operation_charge" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_labor_charge</td>
                    <td><input name="p_labor_charge" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_room_charge</td>
                    <td><input name="p_room_charge" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_light_water_charge</td>
                    <td><input name="p_light_water_charge" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_promo_charge</td>
                    <td><input name="p_promo_charge" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_phone_charge</td>
                    <td><input name="p_phone_charge" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_logistical_charge</td>
                    <td><input name="p_logistical_charge" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_tax_charge</td>
                    <td><input name="p_tax_charge" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_others_charge</td>
                    <td><input name="p_others_charge" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_psm_charge</td>
                    <td><input name="p_psm_charge" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_warehouse_charge</td>
                    <td><input name="p_warehouse_charge" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_has_wechat</td>
                    <td><input name="p_has_wechat" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_wechat_grp_no</td>
                    <td><input name="p_wechat_grp_no" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_wechat_members_no</td>
                    <td><input name="p_wechat_members_no" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_wechat_moments_members_no</td>
                    <td><input name="p_wechat_moments_members_no" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_experice_card_price50_no</td>
                    <td><input name="p_experice_card_price50_no" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_experice_card_price500_no</td>
                    <td><input name="p_experice_card_price500_no" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_lijia_team_course_no</td>
                    <td><input name="p_lijia_team_course_no" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_hshs_foods_carnival_no</td>
                    <td><input name="p_hshs_foods_carnival_no" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_onlinesaleamt</td>
                    <td><input name="p_onlinesaleamt" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_province</td>
                    <td><input name="p_province" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_region</td>
                    <td><input name="p_region" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>aclts</td>
                    <td><input name="aclts" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>propts</td>
                    <td><input name="propts" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_breakevenpoint</td>
                    <td><input name="p_breakevenpoint" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_fs</td>
                    <td><input name="p_fs" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		        <tr>
                    <td>p_dm</td>
                    <td><input name="p_dm" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		                </table>
        </form>
    </div>
</div>