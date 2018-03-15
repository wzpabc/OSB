package com.tup.controller;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import com.tup.commons.utils.DataInfo;
import com.tup.commons.utils.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.tup.commons.base.BaseController;
import com.tup.commons.utils.PageInfo;
import com.tup.mssql.model.ReportsByTime;
import com.tup.service.IReportsByTimeService;
import com.tup.form.ReportsByTimeHelper;


/**
 * <p>
 * ${table.comment}  前端控制器
 * </p>
 * @author patrick.wang
 * @since 2018-03-13
 */
@Controller
@RequestMapping("/reportsByTime")
public class ReportsByTimeController extends BaseController {
	
	@Autowired private IReportsByTimeService reportsByTimeService;
	
	@GetMapping("/manager")
    public String manager() {
        System.out.println("manager");
        return "reportsByTime/reportsByTime";
    }


    @PostMapping("/dataGrid")
    @ResponseBody
    public PageInfo dataGrid(ReportsByTimeHelper helper) {
		PageInfo pageInfo = new PageInfo(helper.getPage(), helper.getRows(), helper.getSort(), helper.getOrder());
        Map<String, Object> condition = new HashMap<String, Object>();
        pageInfo.setCondition(condition);
        reportsByTimeService.setHelper(helper);
        reportsByTimeService.selectDataGrid(pageInfo);
        return pageInfo;
    }
    
    
    @RequestMapping("/query")
	@ResponseBody
	public DataInfo getAddress(HttpServletRequest request){
		Map<String, String> map = WebUtils.Requst2Map(request);//1.请求参数转map 
		DataInfo datainfo = new DataInfo(map.get("aban8"),  super.getStaffName(), "");//2.初始化datainfo
		List<ReportsByTime> list=reportsByTimeService.getMapParams(map);//3.用map去查询
		datainfo.setTotal(list.size());
		datainfo.setDesc("reportsByTime");
		datainfo.setRows(list);
		return datainfo; 		
	} 
	
    /**
     * 添加页面
     * @return
     */
    @GetMapping("/addPage")
    public String addPage() {
        return "reportsByTime/reportsByTimeAdd";
    }

    /**
     * 添加
     * @param 
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Object add(ReportsByTime reportsByTime) {
    	//reportsByTime.setCreatetime(new Date());
    	//reportsByTime.setCreatetime(new Date());
        boolean b = reportsByTimeService.insert(reportsByTime);
        if (b) {
        	return renderSuccess("添加成功！");
		} else {
			return renderError("添加失败！");
		}
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public Object delete(Integer id) {
    	ReportsByTime reportsByTime = new ReportsByTime();
    	//reportsByTime.setId(id);
    	//reportsByTime.setCreatetime(new Date());
    	//reportsByTime.setDeleteflag(1);
    	boolean b = reportsByTimeService.updateById(reportsByTime);
    	if (b) {
        	return renderSuccess("删除成功！");
		} else {
			return renderError("删除失败！");
		}
    }

    /**
     * 编辑
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/editPage")
    public String editPage(Model model, Long id) {
        ReportsByTime reportsByTime = reportsByTimeService.selectById(id);
        model.addAttribute("reportsByTime", reportsByTime);
        return "reportsByTime/reportsByTimeEdit";
    }

    /**
     * 编辑
     * @param 
     * @return
     */
    @RequestMapping("/edit")
    @ResponseBody
    public Object edit(ReportsByTime reportsByTime) {
    	//reportsByTime.setCreatetime(new Date());
    	boolean b = reportsByTimeService.updateById(reportsByTime);
        if (b) {
        	return renderSuccess("编辑成功！");
		} else {
			return renderError("编辑失败！");
		}
    }
    
	
	
	
}
