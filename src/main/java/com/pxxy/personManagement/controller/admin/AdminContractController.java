package com.pxxy.personManagement.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pxxy.personManagement.domain.Apply;
import com.pxxy.personManagement.domain.Contract;
import com.pxxy.personManagement.service.AdminContractService;
import com.pxxy.personManagement.service.AdminInterviewService;

/**
 * 	管理员合同信息操作
 * @author 子江
 *
 */
@Controller
@RequestMapping("/adminContract")
public class AdminContractController {
	@Autowired
	private AdminContractService adminContractService;
	/**
	 * 	跳转到合同信息列表界面
	 * @param model
	 * @return
	 */
	@GetMapping("/allContract")
	public String toContractPage(Model model,@RequestParam(defaultValue="1") Integer pn) {
		PageHelper.startPage(pn, 8);
		List<Contract> allContract = adminContractService.getAllContract();
		PageInfo page=new PageInfo(allContract,8);
		model.addAttribute("pageInfo", page);
		return "admin/agreement";
	}
	/**
	 * 	查看个人合同信息
	 * @param model
	 * @return
	 */
	@GetMapping("/contractDetail/{cId}")
	public String toContractEditorPage(@PathVariable("cId") Integer cId,Model model) {
		Contract contract = adminContractService.getContractById(cId);
		model.addAttribute("contract", contract);
		return "admin/agreementInfo";
	}
	/**
	 * 	录入员工入职合同信息
	 * @param contract
	 * @return
	 */
	@PostMapping("/addContract")
	public String addContract(Contract contract,Model model,RedirectAttributes redirectAttributes) {
		try {
			String message = adminContractService.addOneContract(contract);
			if(message.equals("录入合同信息成功!")) {
				redirectAttributes.addFlashAttribute("msg", "合同信息录入成功!");
				return "redirect:allContract";
			}else {
				model.addAttribute("msg", message);
				return "admin/agreementInfo";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.addAttribute("msg", "出现未知错误!请重新提交该合同信息!");
			return "admin/agreementInfo";
		}
	}
	/**
	 * 跳转到合同编辑界面
	 * @return
	 */
	@GetMapping("/editorPage")
	public String toEditorPage() {
		return "admin/agreementInfo";
	}
	
}
