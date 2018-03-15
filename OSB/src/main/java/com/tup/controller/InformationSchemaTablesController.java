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
import com.tup.mssql.model.InformationSchemaTables;
import com.tup.service.IInformationSchemaTablesService;
import com.tup.form.InformationSchemaTablesHelper;


/**
 * <p>
 * ${table.comment}  前端控制器
 * </p>
 * @author patrick.wang
 * @since 2018-03-13
 */
@Controller
@RequestMapping("/informationSchemaTables")
public class InformationSchemaTablesController extends BaseController {
	
	@Autowired private IInformationSchemaTablesService informationSchemaTablesService;
	
	@GetMapping("/manager")
    public String manager() {
        return "informationSchemaTables/informationSchemaTables";
    }


    @PostMapping("/dataGrid")
    @ResponseBody
    public PageInfo dataGrid(InformationSchemaTablesHelper helper) {
		PageInfo pageInfo = new PageInfo(helper.getPage(), helper.getRows(), helper.getSort(), helper.getOrder());
        Map<String, Object> condition = new HashMap<String, Object>();
        pageInfo.setCondition(condition);
        informationSchemaTablesService.setHelper(helper);
        informationSchemaTablesService.selectDataGrid(pageInfo);
        return pageInfo;
    }
    
    
    @RequestMapping("/query")
	@ResponseBody
	public DataInfo getAddress(HttpServletRequest request){
		Map<String, String> map = WebUtils.Requst2Map(request);//1.请求参数转map 
		DataInfo datainfo = new DataInfo(map.get("aban8"),  super.getStaffName(), "");//2.初始化datainfo
		List<InformationSchemaTables> list=informationSchemaTablesService.getMapParams(map);//3.用map去查询
		datainfo.setTotal(list.size());
		datainfo.setDesc("informationSchemaTables");
		datainfo.setRows(list);
		return datainfo; 		
	} 
	
    /**
     * 添加页面
     * @return
     */
    @GetMapping("/addPage")
    public String addPage() {
        return "informationSchemaTables/informationSchemaTablesAdd";
    }

    /**
     * 添加
     * @param 
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Object add(InformationSchemaTables informationSchemaTables) {
    	//informationSchemaTables.setCreatetime(new Date());
    	//informationSchemaTables.setCreatetime(new Date());
        boolean b = informationSchemaTablesService.insert(informationSchemaTables);
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
    	InformationSchemaTables informationSchemaTables = new InformationSchemaTables();
    	//informationSchemaTables.setId(id);
    	//informationSchemaTables.setCreatetime(new Date());
    	//informationSchemaTables.setDeleteflag(1);
    	boolean b = informationSchemaTablesService.updateById(informationSchemaTables);
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
        InformationSchemaTables informationSchemaTables = informationSchemaTablesService.selectById(id);
        model.addAttribute("informationSchemaTables", informationSchemaTables);
        return "informationSchemaTables/informationSchemaTablesEdit";
    }

    /**
     * 编辑
     * @param 
     * @return
     */
    @RequestMapping("/edit")
    @ResponseBody
    public Object edit(InformationSchemaTables informationSchemaTables) {
    	//informationSchemaTables.setCreatetime(new Date());
    	boolean b = informationSchemaTablesService.updateById(informationSchemaTables);
        if (b) {
        	return renderSuccess("编辑成功！");
		} else {
			return renderError("编辑失败！");
		}
    }
    
	
	
	
}
