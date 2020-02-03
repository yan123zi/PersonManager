package com.pxxy.personManagement.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.alibaba.druid.stat.TableStat.Mode;
import com.alibaba.fastjson.JSONObject;
import com.pxxy.personManagement.domain.Employee;
import com.pxxy.personManagement.domain.Talent;
import com.pxxy.personManagement.service.AdminEmployeeService;
import com.pxxy.personManagement.service.AdminPersonService;
import com.pxxy.personManagement.utils.SendSMS;
/**
 * 管理员人事变动controller
 * @author 子江
 *
 */
@Controller
@RequestMapping("/adminPerson")
public class AdminPersonnelController {
	/**
	 * 注入人事管理的service接口
	 */
	@Autowired
	private AdminPersonService adminPersonService;
	/**
	 * 注入员工管理的service接口
	 */
	@Autowired
	private AdminEmployeeService adminEmployeeService;
	/**
	 * 跳转到人事变动页面
	 * @param model
	 * @return
	 */
	@GetMapping("/peopleChangePage")
	public String toPersonPage(Model model) {
		List<Employee> employeeList = adminPersonService.getAllEmployeeNotTalent();
		model.addAttribute("employeeList", employeeList);
		return "admin/peopleChange";
	}
	/**
	 * 添加一个人才
	 * @param eId
	 * @param model
	 * @return
	 */
	@PostMapping("/toBeTalent")
	public String addOneTalent(Integer eId,RedirectAttributes redirectAttributes) {
		adminPersonService.addTalent(eId);
		redirectAttributes.addFlashAttribute("msg", "加入人才库成功!");
		return "redirect:peopleChangePage";
	}
	/**
	 * 解雇一名员工
	 * @param eId
	 * @param model
	 * @return
	 */
	@DeleteMapping("/dismissEmp")
	public String dismissalEmployee(Integer eId,String message,RedirectAttributes redirectAttributes) {
		Employee employee = adminEmployeeService.getEmployeeByeId(eId);
		try {
			String result = SendSMS.SendSms(message, employee.getePhone());
			JSONObject json = JSONObject.parseObject(result);
			if(json.getIntValue("code") != 0) {
				//发送短信失败
				redirectAttributes.addFlashAttribute("msg", json.getString("data"));
				return "redirect:peopleChangePage";
			}
			adminPersonService.dismissal(eId);
			redirectAttributes.addFlashAttribute("msg", "解雇员工"+employee.geteName()+"成功!");
			return "redirect:peopleChangePage";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			redirectAttributes.addFlashAttribute("msg", "未知原因,信息发送失败!请重新发送!");
			return "redirect:peopleChangePage";
		}
	}
	/**
	 * 跳转到人才列表页面
	 * @param model
	 * @return
	 */
	@GetMapping("/talentPage")
	public String toTalentPage(Model model) {
		List<Talent> talentList = adminPersonService.getAllTalent();
		model.addAttribute("talentList", talentList);
		return "admin/people";
	}
	/**
	 * 移除一名人才
	 * @param taId
	 * @param model
	 * @return
	 */
	@DeleteMapping("/deleteTalent")
	public String deleteTalent(Integer taId,RedirectAttributes redirectAttributes) {
		adminPersonService.deleteTalent(taId);
		redirectAttributes.addFlashAttribute("msg", "该人员已被移除人才库!");
		return "redirect:talentPage";
	}
}
