package com.pxxy.personManagement.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.alibaba.fastjson.JSONObject;
import com.pxxy.personManagement.domain.Apply;
import com.pxxy.personManagement.domain.Employee;
import com.pxxy.personManagement.domain.Interview;
import com.pxxy.personManagement.service.AdminEmployeeService;
import com.pxxy.personManagement.service.AdminInterviewService;
import com.pxxy.personManagement.service.AdminRecruitmentService;
import com.pxxy.personManagement.utils.SendSMS;
/**
 * 管理员面试信息管理
 */
@Controller
@RequestMapping("/adminInterview")
public class AdminInterviewController {
	@Autowired
	private AdminInterviewService adminInterviewService;
	@Autowired
	private AdminRecruitmentService adminRecruitmentService;
	/**
	 * 跳转到面试信息界面，同时将所有的面试信息查出来
	 * @param model
	 * @return
	 */
	@GetMapping("/allInterviews")
	public String toInterviewPage(Model model) {
		List<Interview> interviews = adminInterviewService.getAllInterview();
		model.addAttribute("interviews", interviews);
		return "admin/interview";
	}
	/**
	 * 面试通过
	 * @param message
	 * @param iId
	 * @return
	 */
	@PostMapping("/passInterview")
	public String interviewPass(String message,Integer iId,RedirectAttributes redirectAttributes) {
		Interview interview = adminInterviewService.getInterviewByiId(iId);
		try {
			String result = SendSMS.SendSms(message, interview.getApId().getApPhone());
			JSONObject json = JSONObject.parseObject(result);
			if(json.getIntValue("code") != 0) {
				//发送短信失败
				redirectAttributes.addFlashAttribute("msg", json.getString("data"));
				return "redirect:allInterviews";
			}
			Apply apply = interview.getApId();
			adminInterviewService.updateInterviewStatus(iId, 3);
			redirectAttributes.addFlashAttribute("msg", "信息发送成功!");
			return "redirect:allInterviews";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			redirectAttributes.addFlashAttribute("msg", "未知原因,信息发送失败!请重新发送!");
			return "redirect:allInterviews";
		}
	}
	/**
	 * 面试不通过
	 * @param message
	 * @param iId
	 * @return
	 */
	@PutMapping("/failInterview")
	public String interviewFailed(String message,Integer iId,RedirectAttributes redirectAttributes) {
		Interview interview = adminInterviewService.getInterviewByiId(iId);
		try {
			String result = SendSMS.SendSms(message, interview.getApId().getApPhone());
			JSONObject json = JSONObject.parseObject(result);
			if(json.getIntValue("code") != 0) {
				//发送短信失败
				redirectAttributes.addFlashAttribute("msg", json.getString("data"));
				return "redirect:allInterviews";
			}
			adminInterviewService.updateInterviewStatus(iId, 4);
			redirectAttributes.addFlashAttribute("msg", "信息发送成功!");
			return "redirect:allInterviews";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			redirectAttributes.addFlashAttribute("msg", "未知原因,信息发送失败!请重新发送!");
			return "redirect:allInterviews";
		}
	}
	/**
	 * 结束面试
	 * @param iId
	 * @return
	 */
	@PutMapping("/overInterview")
	public String overInterview(Integer iId) {
		adminInterviewService.updateInterviewStatus(iId, 2);
		return "redirect:allInterviews";
	}
	/**
	 * 根据面试编号删除面试信息
	 * @param iId
	 * @return
	 */
	@DeleteMapping("/deleteInterview")
	public String deleteInterview(Integer iId,RedirectAttributes redirectAttributes) {
		adminInterviewService.deleteInterviewByiId(iId);
		redirectAttributes.addFlashAttribute("msg", "删除成功!");
		return "redirect:allInterviews";
	}
	@GetMapping("/contractPage")
	public String toContractPage(Integer apId,Model model) {
		Apply apply = adminRecruitmentService.getApplyMessageById(apId);
		model.addAttribute("apply", apply);
		return "admin/agreementInfo";
	}
}
