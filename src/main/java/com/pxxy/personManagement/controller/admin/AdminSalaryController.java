package com.pxxy.personManagement.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pxxy.personManagement.domain.Salary;
import com.pxxy.personManagement.mapper.SalaryMapper;
import com.pxxy.personManagement.service.AdminSalaryService;
import com.pxxy.personManagement.utils.Msg;
/**
 * 管理员薪酬管理实体类
 * @author 子江
 *
 */
@Controller
@RequestMapping("/adminSalary")
public class AdminSalaryController {
	/**
	 * 注入管理员薪酬管理的service
	 */
	@Autowired
	private AdminSalaryService adminSalaryService;
	/**
	 * 跳转到员工薪酬管理界面
	 * @return
	 */
	@GetMapping("/empSalary")
	public String toEmpSalaryPage() {
		return "admin/salary";
	}
	/**
	 * 查出所有员工的薪酬列表
	 * @return
	 */
	@GetMapping("/allEmpSalary")
	@ResponseBody
	public List<Salary> getAllEmpSalary() {
		List<Salary> allEmpSalary = adminSalaryService.getAllEmpSalary();
		return allEmpSalary;
	}
	/**
	 * 修改员工的薪酬信息
	 * @param salary
	 * @return
	 */
	@PutMapping("/updateEmpSalary")
	@ResponseBody
	public Msg updateEmpSalary(Salary salary) {
		adminSalaryService.updateEmpSalary(salary);
		Msg msg = Msg.success();
		msg.setMsg("修改成功!");
		return msg;
	}
}
