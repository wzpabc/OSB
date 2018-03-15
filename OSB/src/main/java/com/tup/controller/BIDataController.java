package com.tup.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.tup.commons.utils.DataInfo;
import com.tup.commons.utils.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.tup.commons.base.BaseController;
import com.tup.mssql.model.ADDRESS;
import com.tup.mssql.model.ItemPrice;
import com.tup.mssql.model.OrderHeaderIn;
import com.tup.service.IAddressService;
import com.tup.service.IItemPriceService;
import com.tup.service.IOrderHeaderInService;
@Controller
@RequestMapping("/api")
public class BIDataController extends BaseController {
	@Autowired
	private IAddressService iAddressService;
	
	@Autowired
	private IOrderHeaderInService iOrderHeaderInService;
	
	@Autowired
	private IItemPriceService iItemPriceService;
	/**
	 * CIT ADDRESS 
	 * @param request get方法传参,参数名见DwRegionSalesWeek，区分大小写
	 * @return DataInfo DataInfo
	 * @see DataInfo
	 * @see DwRegionSalesWeek
	 * @see DwRegionSalesWeekKey
	 */
	@RequestMapping("/address")
	@ResponseBody
	public DataInfo getAddress(HttpServletRequest request){
		Map<String, String> map = WebUtils.Requst2Map(request);//1.请求参数转map 
		DataInfo datainfo = new DataInfo(map.get("aban8"),  super.getStaffName(), "");//2.初始化datainfo
		List<ADDRESS> list=iAddressService.getAddressMapParams(map);//3.用map去查询
		datainfo.setTotal(list.size());
		datainfo.setDesc("CIT ADDRESS");
		datainfo.setRows(list);
		return datainfo; 		
	} 
	
	/**
	 * 同步订单到cit返回状态
	 * 
	 */
	public void syncOrders2CIT() { 
		 
	}

	//https://github.com/baomidou/mybatis-plus-doc/blob/master/wrapper.md
	/**
	 * test wrapper
	 * @param entityList
	 * @param batchSize
	 * @return
	 */
	@RequestMapping("/test")
	@ResponseBody
	public List<OrderHeaderIn> testWrapper(){
		
		EntityWrapper<OrderHeaderIn> ew =new EntityWrapper<OrderHeaderIn>();
		ew.setEntity(new OrderHeaderIn());
		ew.where("syvr01={0}", "SO__2016383095");
		System.out.println(ew.getSqlSegment());
		return iOrderHeaderInService.selectList(ew);
		
//		int buyCount = selectCount(Condition.create()
//                .setSqlSelect("sum(quantity)")
////                .isNull("order_id")
////                .eq("user_id", 1)
////                .eq("type", 1)
////                .in("status", new Integer[]{0, 1})
////                .eq("product_id", 1)
////                .between("created_time", startDate, currentDate)
////                .eq("weal", 1)
//                )
//				;
		
		
	}
	
	@RequestMapping("/test1")
	@ResponseBody
	public List<ItemPrice> testWrapper1(){		
		EntityWrapper<ItemPrice> ew =new EntityWrapper<ItemPrice>();
		ew.setEntity(new ItemPrice());
		ew.where("bplitm={0}", "21055020001");
		System.out.println(ew.getSqlSegment());
		return iItemPriceService.selectList(ew); 
	}
	public boolean insertOrderHeaderBatch(List<OrderHeaderIn>entityList, int batchSize){
		 return iOrderHeaderInService.insertBatch(entityList, batchSize);
	}
	
	public boolean insertOrderHeaderBatch(List<OrderHeaderIn>entityList ){
		return iOrderHeaderInService.insertBatch(entityList );
	}
	
	
	public void syncOrderHeaderOut() {

	}

	public void syncOrderDetailOut() {

	}

	public void syncItem() {
	}

	public void syncItemPrice() {
	}

	public void getInventory() {
	}

	public void getStockBalance() {
	}
}
