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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pxxy.personManagement.domain.Recruitment;
import com.pxxy.personManagement.domain.Training;
import com.pxxy.personManagement.service.AdminTrainService;
/**
 * 管理员培训管理controller
 * @author 子江
 *
 */
@Controller
@RequestMapping("/adminTrain")
public class AdminTrainController {
	/**
	 * 注入培训信息service
	 */
	@Autowired
	private AdminTrainService adminTrainService;
	/**
	 * 跳转到培训信息发布页面
	 * @return
	 */
	@GetMapping("/trainInfoPage")
	public String toTrainInfoPage() {
		return "admin/trainInfo";
	}
	/**
	 * 跳转到培训信息列表页面
	 * @param model
	 * @return
	 */
	@GetMapping("/allTraining")
	public String toTrainTable(Model model,@RequestParam(defaultValue="1") Integer pn) {
		PageHelper.startPage(pn, 8);
		List<Training> trainList = adminTrainService.getAllTraining();
		PageInfo<Training> pageInfo=new PageInfo<>(trainList,8);
		model.addAttribute("pageInfo", pageInfo);
		return "admin/trainTable";
	}
	/**
	 * 获取培训信息详情
	 * @param tId
	 * @param model
	 * @return
	 */
	@GetMapping("/trainInfo/{tId}")
	public String getTrainDetail(@PathVariable("tId") Integer tId,Model model) {
		Training training = adminTrainService.getTrainBytId(tId);
		model.addAttribute("training", training);
		return "admin/trainInfo";
	}
	/**
	 * 添加一条培训信息
	 * @param training
	 * @param model
	 * @return
	 */
	@PostMapping("/trainInfoAdd")
	public String addTrainInfo(Training training,RedirectAttributes redirectAttributes) {
		adminTrainService.addTrainInfo(training);
		redirectAttributes.addFlashAttribute("msg", "发布培训信息成功!");
		return "redirect:allTraining";
	}
	/**
	 * 删除培训信息
	 * @param tId
	 * @param model
	 * @return
	 */
	@DeleteMapping("/trainInfoDelete")
	public String delTrainInfo(Integer tId,RedirectAttributes redirectAttributes) {
		adminTrainService.deleteTrainInfo(tId);
		redirectAttributes.addFlashAttribute("msg", "删除培训信息成功!");
		return "redirect:allTraining";
	}
}
