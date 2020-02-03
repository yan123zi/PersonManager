package com.pxxy.personManagement.controller.admin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pxxy.personManagement.domain.Attendance;
import com.pxxy.personManagement.domain.Employee;
import com.pxxy.personManagement.domain.Reward;
import com.pxxy.personManagement.service.AdminAttendanceService;
import com.pxxy.personManagement.service.AdminEmployeeService;
import com.pxxy.personManagement.service.AdminRewardService;
import com.pxxy.personManagement.utils.Msg;
/**
 * 	管理员考勤管理controller
 * @author 子江
 *
 */
@Controller
@RequestMapping("/adminAttenRew")
public class AdminAttenRewController {
	/**
	 * 	注入考勤管理的service
	 */
	@Autowired
	private AdminAttendanceService adminAttendanceService;
	/**
	 * 	注入员工管理的service
	 */
	@Autowired
	private AdminEmployeeService adminEmployeeService;
	/**
	 * 	注入奖惩管理的service
	 */
	@Autowired
	private AdminRewardService adminRewardService;
	/**
	 * 	跳转到考勤奖惩页面
	 * @param model
	 * @return
	 */
	@GetMapping("/allEmpPage")
	public String allEmployee(Model model) {
		List<Employee> employeeList = adminEmployeeService.getAllEmployee();
		model.addAttribute("employeeList", employeeList);
		return "admin/attenRew";
	}
	/**
	 * 	获取某个员工所有的考勤信息
	 * @param eId
	 * @param model
	 * @param pn
	 * @return
	 */
	@GetMapping("/empAttens/{eId}")
	public String getEmpAtten(@PathVariable("eId") Integer eId,Model model,@RequestParam(defaultValue="1") Integer pn) {
		PageHelper.startPage(pn, 8);
		List<Attendance> attenForEmp = adminAttendanceService.getAttenForEmp(eId);
		System.out.println("》》》》》》《《《《《《"+attenForEmp);
		PageInfo page=new PageInfo(attenForEmp,8);
		model.addAttribute("pageInfo", page);
		return "admin/attendanceInfo";
	}
	/**
	 * 	获取某个员工的所有奖惩信息
	 * @param eId
	 * @param model
	 * @param pn
	 * @return
	 */
	@GetMapping("/empRew/{eId}")
	public String getEmpRew(@PathVariable("eId") Integer eId,Model model,@RequestParam(defaultValue="1") Integer pn) {
		PageHelper.startPage(pn, 8);
		List<Reward> rewardForEmp = adminRewardService.getAllRewardForEmp(eId);
		PageInfo page=new PageInfo(rewardForEmp,8);
		model.addAttribute("pageInfo", page);
		return "admin/rewardPeoples";
	}
	/**
	 * 添加处罚或奖励信息
	 * @param reward
	 * @return
	 */
	@PostMapping("/addReOrPu")
	@ResponseBody
	public Msg addReOrPu(Reward reward) {
		if(reward.getReReward()!=null) {
			adminRewardService.addReward(reward,true);
			Msg msg = Msg.success();
			msg.setMsg("添加奖励成功!");
			return msg;
		}else {
			adminRewardService.addReward(reward,false);
			Msg msg = Msg.success();
			msg.setMsg("添加处罚成功!");
			return msg;
		}
	}
	@GetMapping("/attenStatus")
	@ResponseBody
	public Map<String, String> getEmpAttenStatus(Integer eId){
		int later = adminAttendanceService.countAttenStatus(eId, "0");
		int out = adminAttendanceService.countAttenStatus(eId, "1");
		int leave = adminAttendanceService.countAttenStatus(eId, "2");
		int latOut = adminAttendanceService.countAttenStatus(eId, "3");
		Map<String, String> map=new HashMap<>();
		map.put("later", String.valueOf(later+latOut));
		map.put("out", String.valueOf(out+latOut));
		map.put("leave", String.valueOf(leave));
		return map;
	}
}
