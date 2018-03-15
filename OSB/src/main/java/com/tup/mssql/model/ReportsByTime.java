package com.tup.mssql.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
/**
 * <p>
 * ${table.comment}
 * </p>
 *
 * @author patrick.wang
 * @since 2018-03-13
 */
@TableName("reports_by_time")
public class ReportsByTime extends Model<ReportsByTime> {

    private static final long serialVersionUID = 1L;

	@TableId(type = IdType.AUTO)
	private Long pk;
	@TableField(value="organ_no")
	private String organNo;
	private Long hjmpts;
	private java.util.Date createdts;
	private java.util.Date modifiedts;
	private Long typepkstring;
	private Long ownerpkstring;
	@TableField(value="p_customer_id")
	private Long pCustomerId;
	@TableField(value="p_report_status")
	private Long pReportStatus;
	@TableField(value="p_store_type")
	private String pStoreType;
	@TableField(value="p_year")
	private String pYear;
	@TableField(value="p_month")
	private String pMonth;
	@TableField(value="p_week")
	private String pWeek;
	@TableField(value="p_report_type")
	private Long pReportType;
	@TableField(value="p_counter_sale_amts")
	private Double pCounterSaleAmts;
	@TableField(value="p_lijia_sales_amts")
	private Double pLijiaSalesAmts;
	@TableField(value="p_grpb_sales_amts")
	private Double pGrpbSalesAmts;
	@TableField(value="p_customised_sales_amts")
	private Double pCustomisedSalesAmts;
	@TableField(value="p_others_sales_amts")
	private Double pOthersSalesAmts;
	@TableField(value="p_deal_amts")
	private Double pDealAmts;
	@TableField(value="p_total_sales_amts")
	private Double pTotalSalesAmts;
	@TableField(value="p_natural_customer_no")
	private Integer pNaturalCustomerNo;
	@TableField(value="p_comeback_customer_no")
	private Integer pComebackCustomerNo;
	@TableField(value="p_customised_customer_no")
	private Integer pCustomisedCustomerNo;
	@TableField(value="p_lijia_customer_no")
	private Integer pLijiaCustomerNo;
	@TableField(value="p_total_customer_no")
	private Integer pTotalCustomerNo;
	@TableField(value="p_customised_prstt_times")
	private Integer pCustomisedPrsttTimes;
	@TableField(value="p_lijia_prstt_times")
	private Integer pLijiaPrsttTimes;
	@TableField(value="p_imdtly_prstt_times")
	private Integer pImdtlyPrsttTimes;
	@TableField(value="p_water_purifier_sales_amts")
	private Double pWaterPurifierSalesAmts;
	@TableField(value="p_total_prstt_times")
	private Integer pTotalPrsttTimes;
	@TableField(value="p_com_order_amt")
	private Double pComOrderAmt;
	@TableField(value="p_transfer_amt")
	private Double pTransferAmt;
	@TableField(value="p_total_order_amt")
	private Double pTotalOrderAmt;
	@TableField(value="p_lijia_fulltime_consutant_no")
	private Integer pLijiaFulltimeConsutantNo;
	@TableField(value="p_weekend_stock_amt")
	private Double pWeekendStockAmt;
	@TableField(value="p_is_manager")
	private Long pIsManager;
	@TableField(value="p_manager_name")
	private String pManagerName;
	@TableField(value="p_manager_type")
	private Long pManagerType;
	@TableField(value="p_report_desc")
	private String pReportDesc;
	@TableField(value="p_decoration_charge")
	private Double pDecorationCharge;
	@TableField(value="p_operation_charge")
	private Double pOperationCharge;
	@TableField(value="p_labor_charge")
	private Double pLaborCharge;
	@TableField(value="p_room_charge")
	private Double pRoomCharge;
	@TableField(value="p_light_water_charge")
	private Double pLightWaterCharge;
	@TableField(value="p_promo_charge")
	private Double pPromoCharge;
	@TableField(value="p_phone_charge")
	private Double pPhoneCharge;
	@TableField(value="p_logistical_charge")
	private Double pLogisticalCharge;
	@TableField(value="p_tax_charge")
	private Double pTaxCharge;
	@TableField(value="p_others_charge")
	private Double pOthersCharge;
	@TableField(value="p_psm_charge")
	private Double pPsmCharge;
	@TableField(value="p_warehouse_charge")
	private Double pWarehouseCharge;
	@TableField(value="p_has_wechat")
	private Long pHasWechat;
	@TableField(value="p_wechat_grp_no")
	private Integer pWechatGrpNo;
	@TableField(value="p_wechat_members_no")
	private Integer pWechatMembersNo;
	@TableField(value="p_wechat_moments_members_no")
	private Integer pWechatMomentsMembersNo;
	@TableField(value="p_experice_card_price50_no")
	private Integer pExpericeCardPrice50No;
	@TableField(value="p_experice_card_price500_no")
	private Integer pExpericeCardPrice500No;
	@TableField(value="p_lijia_team_course_no")
	private Integer pLijiaTeamCourseNo;
	@TableField(value="p_hshs_foods_carnival_no")
	private Integer pHshsFoodsCarnivalNo;
	@TableField(value="p_onlinesaleamt")
	private Double pOnlinesaleamt;
	@TableField(value="p_province")
	private Long pProvince;
	@TableField(value="p_region")
	private Long pRegion;
	private Long aclts;
	private Long propts;
	@TableField(value="p_breakevenpoint")
	private Double pBreakevenpoint;
	@TableField(value="p_fs")
	private Long pFs;
	@TableField(value="p_dm")
	private Long pDm;


	public Long getPk() {
		return pk;
	}

	public void setPk(Long pk) {
		this.pk = pk;
	}

	public String getOrganNo() {
		return organNo;
	}

	public void setOrganNo(String organNo) {
		this.organNo = organNo;
	}

	public Long getHjmpts() {
		return hjmpts;
	}

	public void setHjmpts(Long hjmpts) {
		this.hjmpts = hjmpts;
	}

	public java.util.Date getCreatedts() {
		return createdts;
	}

	public void setCreatedts(java.util.Date createdts) {
		this.createdts = createdts;
	}

	public java.util.Date getModifiedts() {
		return modifiedts;
	}

	public void setModifiedts(java.util.Date modifiedts) {
		this.modifiedts = modifiedts;
	}

	public Long getTypepkstring() {
		return typepkstring;
	}

	public void setTypepkstring(Long typepkstring) {
		this.typepkstring = typepkstring;
	}

	public Long getOwnerpkstring() {
		return ownerpkstring;
	}

	public void setOwnerpkstring(Long ownerpkstring) {
		this.ownerpkstring = ownerpkstring;
	}

	public Long getPCustomerId() {
		return pCustomerId;
	}

	public void setPCustomerId(Long pCustomerId) {
		this.pCustomerId = pCustomerId;
	}

	public Long getPReportStatus() {
		return pReportStatus;
	}

	public void setPReportStatus(Long pReportStatus) {
		this.pReportStatus = pReportStatus;
	}

	public String getPStoreType() {
		return pStoreType;
	}

	public void setPStoreType(String pStoreType) {
		this.pStoreType = pStoreType;
	}

	public String getPYear() {
		return pYear;
	}

	public void setPYear(String pYear) {
		this.pYear = pYear;
	}

	public String getPMonth() {
		return pMonth;
	}

	public void setPMonth(String pMonth) {
		this.pMonth = pMonth;
	}

	public String getPWeek() {
		return pWeek;
	}

	public void setPWeek(String pWeek) {
		this.pWeek = pWeek;
	}

	public Long getPReportType() {
		return pReportType;
	}

	public void setPReportType(Long pReportType) {
		this.pReportType = pReportType;
	}

	public Double getPCounterSaleAmts() {
		return pCounterSaleAmts;
	}

	public void setPCounterSaleAmts(Double pCounterSaleAmts) {
		this.pCounterSaleAmts = pCounterSaleAmts;
	}

	public Double getPLijiaSalesAmts() {
		return pLijiaSalesAmts;
	}

	public void setPLijiaSalesAmts(Double pLijiaSalesAmts) {
		this.pLijiaSalesAmts = pLijiaSalesAmts;
	}

	public Double getPGrpbSalesAmts() {
		return pGrpbSalesAmts;
	}

	public void setPGrpbSalesAmts(Double pGrpbSalesAmts) {
		this.pGrpbSalesAmts = pGrpbSalesAmts;
	}

	public Double getPCustomisedSalesAmts() {
		return pCustomisedSalesAmts;
	}

	public void setPCustomisedSalesAmts(Double pCustomisedSalesAmts) {
		this.pCustomisedSalesAmts = pCustomisedSalesAmts;
	}

	public Double getPOthersSalesAmts() {
		return pOthersSalesAmts;
	}

	public void setPOthersSalesAmts(Double pOthersSalesAmts) {
		this.pOthersSalesAmts = pOthersSalesAmts;
	}

	public Double getPDealAmts() {
		return pDealAmts;
	}

	public void setPDealAmts(Double pDealAmts) {
		this.pDealAmts = pDealAmts;
	}

	public Double getPTotalSalesAmts() {
		return pTotalSalesAmts;
	}

	public void setPTotalSalesAmts(Double pTotalSalesAmts) {
		this.pTotalSalesAmts = pTotalSalesAmts;
	}

	public Integer getPNaturalCustomerNo() {
		return pNaturalCustomerNo;
	}

	public void setPNaturalCustomerNo(Integer pNaturalCustomerNo) {
		this.pNaturalCustomerNo = pNaturalCustomerNo;
	}

	public Integer getPComebackCustomerNo() {
		return pComebackCustomerNo;
	}

	public void setPComebackCustomerNo(Integer pComebackCustomerNo) {
		this.pComebackCustomerNo = pComebackCustomerNo;
	}

	public Integer getPCustomisedCustomerNo() {
		return pCustomisedCustomerNo;
	}

	public void setPCustomisedCustomerNo(Integer pCustomisedCustomerNo) {
		this.pCustomisedCustomerNo = pCustomisedCustomerNo;
	}

	public Integer getPLijiaCustomerNo() {
		return pLijiaCustomerNo;
	}

	public void setPLijiaCustomerNo(Integer pLijiaCustomerNo) {
		this.pLijiaCustomerNo = pLijiaCustomerNo;
	}

	public Integer getPTotalCustomerNo() {
		return pTotalCustomerNo;
	}

	public void setPTotalCustomerNo(Integer pTotalCustomerNo) {
		this.pTotalCustomerNo = pTotalCustomerNo;
	}

	public Integer getPCustomisedPrsttTimes() {
		return pCustomisedPrsttTimes;
	}

	public void setPCustomisedPrsttTimes(Integer pCustomisedPrsttTimes) {
		this.pCustomisedPrsttTimes = pCustomisedPrsttTimes;
	}

	public Integer getPLijiaPrsttTimes() {
		return pLijiaPrsttTimes;
	}

	public void setPLijiaPrsttTimes(Integer pLijiaPrsttTimes) {
		this.pLijiaPrsttTimes = pLijiaPrsttTimes;
	}

	public Integer getPImdtlyPrsttTimes() {
		return pImdtlyPrsttTimes;
	}

	public void setPImdtlyPrsttTimes(Integer pImdtlyPrsttTimes) {
		this.pImdtlyPrsttTimes = pImdtlyPrsttTimes;
	}

	public Double getPWaterPurifierSalesAmts() {
		return pWaterPurifierSalesAmts;
	}

	public void setPWaterPurifierSalesAmts(Double pWaterPurifierSalesAmts) {
		this.pWaterPurifierSalesAmts = pWaterPurifierSalesAmts;
	}

	public Integer getPTotalPrsttTimes() {
		return pTotalPrsttTimes;
	}

	public void setPTotalPrsttTimes(Integer pTotalPrsttTimes) {
		this.pTotalPrsttTimes = pTotalPrsttTimes;
	}

	public Double getPComOrderAmt() {
		return pComOrderAmt;
	}

	public void setPComOrderAmt(Double pComOrderAmt) {
		this.pComOrderAmt = pComOrderAmt;
	}

	public Double getPTransferAmt() {
		return pTransferAmt;
	}

	public void setPTransferAmt(Double pTransferAmt) {
		this.pTransferAmt = pTransferAmt;
	}

	public Double getPTotalOrderAmt() {
		return pTotalOrderAmt;
	}

	public void setPTotalOrderAmt(Double pTotalOrderAmt) {
		this.pTotalOrderAmt = pTotalOrderAmt;
	}

	public Integer getPLijiaFulltimeConsutantNo() {
		return pLijiaFulltimeConsutantNo;
	}

	public void setPLijiaFulltimeConsutantNo(Integer pLijiaFulltimeConsutantNo) {
		this.pLijiaFulltimeConsutantNo = pLijiaFulltimeConsutantNo;
	}

	public Double getPWeekendStockAmt() {
		return pWeekendStockAmt;
	}

	public void setPWeekendStockAmt(Double pWeekendStockAmt) {
		this.pWeekendStockAmt = pWeekendStockAmt;
	}

	public Long getPIsManager() {
		return pIsManager;
	}

	public void setPIsManager(Long pIsManager) {
		this.pIsManager = pIsManager;
	}

	public String getPManagerName() {
		return pManagerName;
	}

	public void setPManagerName(String pManagerName) {
		this.pManagerName = pManagerName;
	}

	public Long getPManagerType() {
		return pManagerType;
	}

	public void setPManagerType(Long pManagerType) {
		this.pManagerType = pManagerType;
	}

	public String getPReportDesc() {
		return pReportDesc;
	}

	public void setPReportDesc(String pReportDesc) {
		this.pReportDesc = pReportDesc;
	}

	public Double getPDecorationCharge() {
		return pDecorationCharge;
	}

	public void setPDecorationCharge(Double pDecorationCharge) {
		this.pDecorationCharge = pDecorationCharge;
	}

	public Double getPOperationCharge() {
		return pOperationCharge;
	}

	public void setPOperationCharge(Double pOperationCharge) {
		this.pOperationCharge = pOperationCharge;
	}

	public Double getPLaborCharge() {
		return pLaborCharge;
	}

	public void setPLaborCharge(Double pLaborCharge) {
		this.pLaborCharge = pLaborCharge;
	}

	public Double getPRoomCharge() {
		return pRoomCharge;
	}

	public void setPRoomCharge(Double pRoomCharge) {
		this.pRoomCharge = pRoomCharge;
	}

	public Double getPLightWaterCharge() {
		return pLightWaterCharge;
	}

	public void setPLightWaterCharge(Double pLightWaterCharge) {
		this.pLightWaterCharge = pLightWaterCharge;
	}

	public Double getPPromoCharge() {
		return pPromoCharge;
	}

	public void setPPromoCharge(Double pPromoCharge) {
		this.pPromoCharge = pPromoCharge;
	}

	public Double getPPhoneCharge() {
		return pPhoneCharge;
	}

	public void setPPhoneCharge(Double pPhoneCharge) {
		this.pPhoneCharge = pPhoneCharge;
	}

	public Double getPLogisticalCharge() {
		return pLogisticalCharge;
	}

	public void setPLogisticalCharge(Double pLogisticalCharge) {
		this.pLogisticalCharge = pLogisticalCharge;
	}

	public Double getPTaxCharge() {
		return pTaxCharge;
	}

	public void setPTaxCharge(Double pTaxCharge) {
		this.pTaxCharge = pTaxCharge;
	}

	public Double getPOthersCharge() {
		return pOthersCharge;
	}

	public void setPOthersCharge(Double pOthersCharge) {
		this.pOthersCharge = pOthersCharge;
	}

	public Double getPPsmCharge() {
		return pPsmCharge;
	}

	public void setPPsmCharge(Double pPsmCharge) {
		this.pPsmCharge = pPsmCharge;
	}

	public Double getPWarehouseCharge() {
		return pWarehouseCharge;
	}

	public void setPWarehouseCharge(Double pWarehouseCharge) {
		this.pWarehouseCharge = pWarehouseCharge;
	}

	public Long getPHasWechat() {
		return pHasWechat;
	}

	public void setPHasWechat(Long pHasWechat) {
		this.pHasWechat = pHasWechat;
	}

	public Integer getPWechatGrpNo() {
		return pWechatGrpNo;
	}

	public void setPWechatGrpNo(Integer pWechatGrpNo) {
		this.pWechatGrpNo = pWechatGrpNo;
	}

	public Integer getPWechatMembersNo() {
		return pWechatMembersNo;
	}

	public void setPWechatMembersNo(Integer pWechatMembersNo) {
		this.pWechatMembersNo = pWechatMembersNo;
	}

	public Integer getPWechatMomentsMembersNo() {
		return pWechatMomentsMembersNo;
	}

	public void setPWechatMomentsMembersNo(Integer pWechatMomentsMembersNo) {
		this.pWechatMomentsMembersNo = pWechatMomentsMembersNo;
	}

	public Integer getPExpericeCardPrice50No() {
		return pExpericeCardPrice50No;
	}

	public void setPExpericeCardPrice50No(Integer pExpericeCardPrice50No) {
		this.pExpericeCardPrice50No = pExpericeCardPrice50No;
	}

	public Integer getPExpericeCardPrice500No() {
		return pExpericeCardPrice500No;
	}

	public void setPExpericeCardPrice500No(Integer pExpericeCardPrice500No) {
		this.pExpericeCardPrice500No = pExpericeCardPrice500No;
	}

	public Integer getPLijiaTeamCourseNo() {
		return pLijiaTeamCourseNo;
	}

	public void setPLijiaTeamCourseNo(Integer pLijiaTeamCourseNo) {
		this.pLijiaTeamCourseNo = pLijiaTeamCourseNo;
	}

	public Integer getPHshsFoodsCarnivalNo() {
		return pHshsFoodsCarnivalNo;
	}

	public void setPHshsFoodsCarnivalNo(Integer pHshsFoodsCarnivalNo) {
		this.pHshsFoodsCarnivalNo = pHshsFoodsCarnivalNo;
	}

	public Double getPOnlinesaleamt() {
		return pOnlinesaleamt;
	}

	public void setPOnlinesaleamt(Double pOnlinesaleamt) {
		this.pOnlinesaleamt = pOnlinesaleamt;
	}

	public Long getPProvince() {
		return pProvince;
	}

	public void setPProvince(Long pProvince) {
		this.pProvince = pProvince;
	}

	public Long getPRegion() {
		return pRegion;
	}

	public void setPRegion(Long pRegion) {
		this.pRegion = pRegion;
	}

	public Long getAclts() {
		return aclts;
	}

	public void setAclts(Long aclts) {
		this.aclts = aclts;
	}

	public Long getPropts() {
		return propts;
	}

	public void setPropts(Long propts) {
		this.propts = propts;
	}

	public Double getPBreakevenpoint() {
		return pBreakevenpoint;
	}

	public void setPBreakevenpoint(Double pBreakevenpoint) {
		this.pBreakevenpoint = pBreakevenpoint;
	}

	public Long getPFs() {
		return pFs;
	}

	public void setPFs(Long pFs) {
		this.pFs = pFs;
	}

	public Long getPDm() {
		return pDm;
	}

	public void setPDm(Long pDm) {
		this.pDm = pDm;
	}

	@Override
	protected Serializable pkVal() {
		return this.pk;
	}

}
