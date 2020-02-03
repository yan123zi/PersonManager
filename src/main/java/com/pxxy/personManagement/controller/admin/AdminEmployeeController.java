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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pxxy.personManagement.domain.Employee;
import com.pxxy.personManagement.service.AdminEmployeeService;
import com.pxxy.personManagement.utils.EmailSender;
import com.pxxy.personManagement.utils.Msg;
/**
 * 管理员员工信息管理
 * @author 子江
 *
 */
@Controller
@RequestMapping("/adminEmployee")
public class AdminEmployeeController {
	/**
	 * 注入管理员员工管理的service
	 */
	@Autowired
	private AdminEmployeeService adminEmployeeService;
	/**
	 * 	跳转到员工列表页面
	 * @param model 
	 * @return
	 */
	@GetMapping("/allEmployee")
	public String toAllEmployeePage(Model model) {
		List<Employee> allEmployee = adminEmployeeService.getAllEmployee();
		model.addAttribute("employeeList", allEmployee);
		return "admin/employee";
	}
	/**
	 * 	查看员工详情
	 * @param eId
	 * @param model
	 * @return
	 */
	@GetMapping("/employeeDetail/{eId}")
	public String employeeDetail(@PathVariable("eId") Integer eId,Model model) {
		Employee employee = adminEmployeeService.getEmployeeByeId(eId);
		model.addAttribute("employee", employee);
		return "admin/employee-details";
	}
	/**
	 * 	发送邮件信息
	 * @param recipient
	 * @param title
	 * @param content
	 * @return
	 */
	@PostMapping("/emailSend")
	@ResponseBody
	public Msg sendEmail(String recipient,String title,String content) {
		try {
			EmailSender.sendEmail(recipient, title, content);
			Msg msg = Msg.success();
			msg.setMsg("邮件发送成功!");
			return msg;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Msg msg = Msg.fail();
			msg.setMsg("邮箱格式错误，或不支持该邮箱发送!");
			return msg;
		}
	}
	/**
	 * 	修改员工密码
	 * @param eId
	 * @param newPassword
	 * @return
	 */
	@PutMapping("/updatePassword")
	@ResponseBody
	public Msg updatePassword(Integer eId,String newPassword) {
		try {
			adminEmployeeService.updatePassword(eId, newPassword);
			Msg msg = Msg.success();
			msg.setMsg("密码修改成功!");
			return msg;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Msg msg = Msg.fail();
			msg.setMsg("出现错误!密码修改错误!");
			return msg;
		}
	}
	/**
	 * 跳转到添加员工的界面
	 * @return
	 */
	@GetMapping("/addEmployeePage")
	public String toAddEmployee() {
		return "admin/addEmployee";
	}
	/**
	 * 添加一名员工
	 * @param employee
	 * @param model
	 * @return
	 */
	@PostMapping("/addEmployee")
	public String addEmployee(Employee employee,RedirectAttributes redirectAttributes,String pro,String city,String area,String pPosition) {
		try {
			employee.seteAddress(pro+city+area);
			adminEmployeeService.addEmployee(employee,pPosition);
			redirectAttributes.addFlashAttribute("msg", "添加员工成功!");
			return "redirect:allEmployee";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			redirectAttributes.addFlashAttribute("msg", "出现异常添加失败!请重新提交!");
			return "admin/addEmployee";
		}
	}
	@PutMapping("/updateEmp")
	public String updateEmpInfo(Employee employee,RedirectAttributes redirectAttributes) {
		adminEmployeeService.updateEmp(employee);
		redirectAttributes.addFlashAttribute("msg", "修改信息成功!");
		return "redirect:employeeDetail/"+employee.geteId();
	}
}
