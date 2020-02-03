package com.pxxy.personManagement.controller.admin;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pxxy.personManagement.domain.Apply;
import com.pxxy.personManagement.domain.Interview;
import com.pxxy.personManagement.domain.Recruitment;
import com.pxxy.personManagement.service.AdminRecruitmentService;
import com.pxxy.personManagement.utils.Msg;
import com.pxxy.personManagement.utils.SendSMS;
/**
 * 	管理员招聘模块controller
 * @author 子江
 *
 */
@Controller
@RequestMapping("/adminRecruit")
public class AdminRecruitController {
	/**
	 * 注入招聘模块的service接口
	 */
	@Autowired
	private AdminRecruitmentService recruitmentService;
	/**
	 * 	查看所有应聘信息
	 * @param currentPage 页码
	 * @return
	 */
	@GetMapping("/allApplyMessage")
	public String toAllApplyMessagePage(Model model) {
//		PageHelper.startPage(currentPage, pageSize);
		List<Apply> allApplyMessage = recruitmentService.getAllApplyMessage();
//		PageInfo<Apply> pageInfo = new PageInfo<>(allApplyMessage);
		model.addAttribute("applyList", allApplyMessage);
		return "admin/apply";
	}
	/**
	 * 	删除某个应聘信息
	 * @param apId
	 * @return 返回删除信息
	 */
	@DeleteMapping("/deleteApplyById")
	public String deleteApplyMessage(Integer apId,RedirectAttributes redirectAttributes) {
		recruitmentService.removeApplyMessageById(apId);
		redirectAttributes.addFlashAttribute("msg", "删除成功!");
		return "redirect:allApplyMessage";
	}
	/**
	 * 	查看某个应聘信息详情
	 * @param apId 应聘编号
	 * @return 跳转到应聘信息详情页
	 */
	@GetMapping("/applyDetail/{apId}")
	public String seeApplyDetail(@PathVariable(name="apId") Integer apId,Model model) {
		Apply applyMessageById = recruitmentService.getApplyMessageById(apId);
		model.addAttribute("detail", applyMessageById);
		return "admin/applypeople";
	}
	/**
	 * 	发起面试
	 * @param interview 面试信息
	 * @param apId 应聘编号
	 * @return 短信发送情况
	 */
	@PostMapping("/sendInterview")
	@ResponseBody
	public Msg sendInterview(Interview interview,Integer ap_Id) {
		if(recruitmentService.ifSendInterview(ap_Id)) {
			Msg msg = Msg.fail();
			msg.setMsg("短信已经发送，请不要重复发送!");
			return msg;
		}else {
		Apply applyMessageById = recruitmentService.getApplyMessageById(ap_Id);
		try {
			interview.setApId(applyMessageById);
			String result = SendSMS.SendSms(interview.getiMessage(), applyMessageById.getApPhone());
			JSONObject json = JSONObject.parseObject(result);
			if(json.getIntValue("code") != 0) {
				//发送短信失败
				Msg msg = Msg.fail();
				msg.setMsg(json.getString("data"));
				return msg;
			}
			recruitmentService.updateApplyiSche(applyMessageById,1);
			recruitmentService.fillInterviewMes(interview);
			Msg msg = Msg.success();
			msg.setMsg(json.getString("data"));
			return msg;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Msg msg = Msg.fail();
			msg.setMsg("出现错误，短信发送失败!");
			return msg;
		}
		}
	}
	/**
	 * 驳回该应聘信息
	 * @param apId 应聘编号
	 * @param message 驳回信息
	 * @return
	 */
	@DeleteMapping("/refuse")
	public String turnDown(Integer apId,String message,RedirectAttributes redirectAttributes) {
		Apply applyMessageById = recruitmentService.getApplyMessageById(apId);
		try {
			String result = SendSMS.SendSms(message, applyMessageById.getApPhone());
			JSONObject json = JSONObject.parseObject(result);
			if(json.getIntValue("code") != 0) {
				//发送短信失败
				redirectAttributes.addFlashAttribute("msg", json.getString("data"));
				return "admin/applypeople";
			}
			redirectAttributes.addFlashAttribute("msg", "信息发送成功!该应聘记录已被删除!");
			recruitmentService.removeApplyMessageById(apId);
			return "redirect:allApplyMessage";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			redirectAttributes.addFlashAttribute("msg", "出现未知错误!发送失败!");
			return "admin/applypeople";
		}
	}
	/**
	 * 	下载简历
	 * @param fileName
	 * @param filePath
	 * @return
	 * @throws IOException
	 */
	@GetMapping("/download")  
    public ResponseEntity<byte[]> export(String filePath) throws IOException {  
    	
        HttpHeaders headers = new HttpHeaders();    
        File file = new File(filePath);
        String fileName=filePath.substring(filePath.lastIndexOf("\\")+1);
        String fileName1=new String(fileName.getBytes("UTF-8"),"iso-8859-1");//为了解决中文名称乱码问题
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);    
        headers.setContentDispositionFormData("attachment", fileName1);    
       
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),    
                                              headers, HttpStatus.CREATED);    
    }
	/**
	 * 跳转到招聘信息发布页面
	 * @return
	 */
	@GetMapping("/recruitPage")
	public String torecruitPage() {
		return "admin/recruit";
	}
	/**
	 * 发布招聘信息
	 * @param recruitment
	 * @return
	 */
	@PostMapping("/releaseRecruitMessage")
	public String releaseRecruit(Recruitment recruitment,Model model) {
		System.out.println(recruitment);
		recruitmentService.releaseOneRecruit(recruitment);
		model.addAttribute("msg", "发布招聘信息成功!");
		return "admin/recruit";
	}
	/**
	 * 获取所有发布的招聘信息
	 * @param model
	 * @return
	 */
	@GetMapping("/allRecruitMessage")
	public String getAllRecruits(Model model,@RequestParam(defaultValue="1") Integer pn) {
		PageHelper.startPage(pn, 8);
		List<Recruitment> recruitList = recruitmentService.getAllRecruit();
		PageInfo<Recruitment> pageInfo=new PageInfo<>(recruitList,8);
		model.addAttribute("pageInfo", pageInfo);
		return "admin/recruitTable";
	}
	/**
	 * 	根据id删除招聘信息
	 * @param rId
	 * @return
	 */
	@DeleteMapping("/deleteRecruit")
	public String deleteRecruitById(Integer rId,RedirectAttributes redirectAttributes) {
		recruitmentService.deleteRecruitById(rId);
		redirectAttributes.addFlashAttribute("msg", "删除成功!");
		return "redirect:allRecruitMessage";
	}
	/**
	 * 	根据id查询某个招聘信息详情
	 * @return
	 */
	@GetMapping("/recruitDetail/{rId}")
	public String toRecruitPage(@PathVariable("rId") Integer rId,Model model) {
		Recruitment recruitment = recruitmentService.getRecruitByrId(rId);
		model.addAttribute("recruitment", recruitment);
		return "admin/recruit";
	}
}
