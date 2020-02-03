package com.pxxy.personManagement.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.pxxy.personManagement.domain.Apply;
import com.pxxy.personManagement.domain.Department;
import com.pxxy.personManagement.service.AdminRecruitmentService;
import com.pxxy.personManagement.service.ApplyService;
import com.pxxy.personManagement.utils.Msg;

/**
 * 	应聘者模块的controller
 * @author 子江
 *
 */
@Controller
@RequestMapping("/recruit")
@PropertySource(value = {"classpath:app.properties"}) 
public class RecruitmentController {
	/**
	 * 简历上传路径
	 */
	@Value("${resume.uploadPath}")
	private String RESUME_UPLOAD_PATH;
	/**
	 * 注入应聘模块的service
	 */
	@Autowired
	private ApplyService applyService;
	/**
	 *	 跳转到输入应聘信息的页面
	 * @return
	 */
	@GetMapping("/page")
	public String recruitPage() {
		return "/";
	}
	/**
	 * 	上传招聘者信息
	 * @param file 简历文件
	 * @param apply 应聘信息
	 * @return
	 */
	@PostMapping("/commit")
	@ResponseBody
	public Msg commitInfo(Apply apply,MultipartFile file,HttpServletRequest request) {
		if(file.isEmpty()) {
			Msg msg = Msg.fail();
        	msg.setMsg("简历不能为空!");
    		return msg;
		}
		String mime = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1);
		if((apply.getApAge()).length()==0||(apply.getApEdu()).length()==0||(apply.getApExp()).length()==0
				||(apply.getApGender()).length()==0||(apply.getApName()).length()==0
				||(apply.getApPhone()).length()==0||(apply.getdName()).length()==0||(apply.getpPosition()).length()==0||(apply.getApNumber()).length()==0) {
			Msg msg = Msg.fail();
        	msg.setMsg("个人信息不能为空!");
    		return msg;
		}
		System.out.println(mime);
		if(mime.equals("doc")||mime.equals("docx")||mime.equals("pdf")||mime.equals("txt")||mime.equals("html")||mime.equals("htm")) {
		// 获取文件后缀
        String fileName = file.getOriginalFilename();
        String fileSuffix = fileName.substring(fileName.lastIndexOf("."));

        // 文件存放路径
        String filePath = RESUME_UPLOAD_PATH;

        // 判断路径是否存在，不存在则创建文件夹
        File exifile = new File(filePath);
        if (!exifile.exists()) {
        	exifile.mkdir();
        }
        // 将文件写入目标
        exifile = new File(filePath, fileName);
        try {
        	file.transferTo(exifile);
        	//linux下
//        	apply.setApResume(RESUME_UPLOAD_PATH+"/"+exifile.getName());
        	//windows下
        	apply.setApResume(RESUME_UPLOAD_PATH+"\\"+exifile.getName());
        	apply.setiSche(0);
        	applyService.fillApplyMessage(apply);
        	Msg msg = Msg.success();
        	msg.setMsg("提交个人信息成功!请等待消息!");
    		return msg;
        } catch (IOException e) {
        	Msg msg = Msg.fail();
        	msg.setMsg("提交信息失败!");
    		return msg;
        }
		}else {
			Msg msg = Msg.fail();
        	msg.setMsg("请上传正确的简历文档格式!");
    		return msg;
		}
	}
	/**
	 * 根据部门名称获取部门信息
	 * @param dId
	 * @return
	 */
	@GetMapping("/department/{dName}")
	@ResponseBody
	public Msg getDepartmentByDid(@PathVariable("dName") String dName) {
		Department department = applyService.getDepartmentBydName(dName);
		Msg msg = Msg.success();
		msg.getExtend().put("department", department);
		return msg;
	}
	/**
	 * 获取所有的部门包括其中的职位
	 * @return
	 */
	@GetMapping("/allDepartment")
	@ResponseBody
	public Msg getAllDepartment() {
		List<Department> departments = applyService.getAllDepartment();
		System.out.println(departments);
		 Msg msg = Msg.success();
		 msg.getExtend().put("departments", departments);
		return msg;
	}
}
