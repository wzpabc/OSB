package com.tup.controller;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Date;
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
import com.tup.model.Fmsuser;
import com.tup.service.IFmsuserService;
import com.tup.form.FmsuserHelper;


/**
 * <p>
 *   前端控制器
 * </p>
 * @author patrick.wang
 * @since 2017-01-23
 */
@Controller
@RequestMapping("/fmsuser")
public class FmsuserController extends BaseController {
	
	@Autowired private IFmsuserService fmsuserService;
	
	@GetMapping("/manager")
    public String manager() {
        return "admin/fmsuser/fmsuser";
    }


    @PostMapping("/dataGrid")
    @ResponseBody
    public PageInfo dataGrid(FmsuserHelper helper) {
		PageInfo pageInfo = new PageInfo(helper.getPage(), helper.getRows(), helper.getSort(), helper.getOrder());
        Map<String, Object> condition = new HashMap<String, Object>();
        pageInfo.setCondition(condition);
        fmsuserService.setHelper(helper);
        fmsuserService.selectDataGrid(pageInfo);
        return pageInfo;
    }
    
    /**
     * 添加页面
     * @return
     */
    @GetMapping("/addPage")
    public String addPage() {
        return "admin/fmsuser/fmsuserAdd";
    }

    /**
     * 添加
     * @param 
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Object add(Fmsuser fmsuser) {
    	fmsuser.setCreatetime(new Date());
    	fmsuser.setCreatetime(new Date());
        boolean b = fmsuserService.insert(fmsuser);
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
    	Fmsuser fmsuser = new Fmsuser();
    	//fmsuser.setId(id);
    	fmsuser.setCreatetime(new Date());
    	fmsuser.setDeleteflag(1);
    	boolean b = fmsuserService.updateById(fmsuser);
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
        Fmsuser fmsuser = fmsuserService.selectById(id);
        model.addAttribute("fmsuser", fmsuser);
        return "admin/fmsuser/fmsuserEdit";
    }

    /**
     * 编辑
     * @param 
     * @return
     */
    @RequestMapping("/edit")
    @ResponseBody
    public Object edit(Fmsuser fmsuser) {
    	fmsuser.setCreatetime(new Date());
    	boolean b = fmsuserService.updateById(fmsuser);
        if (b) {
        	return renderSuccess("编辑成功！");
		} else {
			return renderError("编辑失败！");
		}
    }
    
	
	
	
}
