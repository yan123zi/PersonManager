package com.pxxy.personManagement.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pxxy.personManagement.domain.Attendance;
import com.pxxy.personManagement.domain.Employee;
import com.pxxy.personManagement.domain.Reward;
import com.pxxy.personManagement.domain.Training;
import com.pxxy.personManagement.service.EmployeeService;
import com.pxxy.personManagement.utils.MD5;
import com.pxxy.personManagement.utils.Msg;
/**
 * 员工操作controller
 * @author 子江
 *
 */
@Controller
@RequestMapping("/employee")
@PropertySource(value = {"classpath:app.properties"}) 
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService; 
	/**
	 * 员工图片上传路径
	 */
	@Value("${emplyee.image.uploadPath}")
	private String EMPIMG;
	/**
	 * 员工登录
	 * @param employee
	 * @return
	 */
	@PostMapping("/login")
	public String empLogin(Employee employee,Model model,HttpSession session) {
		String mes = employeeService.empLogin(employee);
		if(mes.equals("登录成功!")) {
			Employee emp = employeeService.getEmp(employee);
			session.setMaxInactiveInterval(3*60*60);
			session.setAttribute("employee", emp);
//			model.addAttribute("employee", emp);
			return "redirect:employeePage";
		}else {
			model.addAttribute("msg", mes);
			return "index";
		}
	}
	@GetMapping("/employeePage")
	public String empPage(HttpSession session) {
		if(session.getAttribute("employee")==null) {
			return "redirect:/index";
		}
		return "Employee";
	}
	/**
	 * 获取该针对该员工的培训信息
	 * @param eId
	 * @param page
	 * @param limit
	 * @return
	 */
	@GetMapping("/trainForEmp/{eId}")
	@ResponseBody
	public Map<String,Object> findallTrainEmp(@PathVariable("eId") Integer eId,int page, int limit){
		int before = limit * (page - 1);
        int after = page * limit;
        List<Training> allTrainForEmpPage = employeeService.allTrainForEmpPage(eId, before, after);
        List<Training> allTrainForEmp = employeeService.allTrainForEmp(eId);
        Map<String, Object> tableData = new HashMap<String, Object>(); //这是layui要求返回的json数据格式 
        JSONArray data = (JSONArray) JSONArray.toJSON(allTrainForEmpPage);
        tableData.put("code", "0"); tableData.put("msg", ""); //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", allTrainForEmp.size()); //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", data);
        return tableData;
    }
	/**
	 * 获取该员工的所有考勤信息
	 * @param eId
	 * @param page
	 * @param limit
	 * @return
	 */
	@GetMapping("/attenForEmp/{eId}")
	@ResponseBody
	public Map<String,Object> findallAttenEmp(@PathVariable("eId") Integer eId,int page, int limit){
		int before = limit * (page - 1);
        int after = page * limit;
        List<Attendance> allAttenForEmpPage = employeeService.allAttenForEmpPage(eId, before, after);
        List<Attendance> allAttenForEmp = employeeService.allAttenForEmp(eId);
        Map<String, Object> tableData = new HashMap<String, Object>(); //这是layui要求返回的json数据格式 
        JSONArray data = (JSONArray) JSONArray.toJSON(allAttenForEmpPage);
        tableData.put("code", "0"); tableData.put("msg", ""); //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", allAttenForEmp.size()); //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", data);
        return tableData;
    }
	/**
	 * 获取该员工的所有奖惩信息
	 * @param eId
	 * @param page
	 * @param limit
	 * @return
	 */
	@GetMapping("/rewForEmp/{eId}")
	@ResponseBody
	public Map<String,Object> findallRewEmp(@PathVariable("eId") Integer eId,int page, int limit){
		int before = limit * (page - 1);
        int after = page * limit;
        List<Reward> allRewardForEmpPage = employeeService.allRewardForEmpPage(eId, before, after);
        List<Reward> allRewardForEmp = employeeService.allRewardForEmp(eId);
        Map<String, Object> tableData = new HashMap<String, Object>(); //这是layui要求返回的json数据格式 
        JSONArray data = (JSONArray) JSONArray.toJSON(allRewardForEmpPage);
        tableData.put("code", "0"); tableData.put("msg", ""); //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", allRewardForEmp.size()); //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", data);
        return tableData;
    }
	/**
	 * 员工打卡
	 * @param eId
	 * @param status
	 * @param atDesc
	 * @return
	 */
	@GetMapping("/empPunch/{eId}/{status}")
	@ResponseBody
	public Msg empPunch(@PathVariable("eId") Integer eId,@PathVariable("status") int status,String atDesc) {
		String empPunch = employeeService.empPunch(eId, status, atDesc);
		Msg msg = Msg.success();
		msg.setMsg(empPunch);
		return msg;
	}
	/**
	 * 更新员工信息
	 * @param employee
	 * @return
	 */
	@PutMapping("/updateEmpInfo")
	@ResponseBody
	public Msg updateEmpMes(Employee employee) {
		employeeService.updateEmp(employee);
		Msg msg = Msg.success();
		msg.setMsg("修改信息成功!");
		return msg;
	}
	/**
	 * 重设密码
	 * @param employee
	 * @return
	 */
	@PutMapping("/upEmpPwd")
	@ResponseBody
	public Msg upEmpPassword(Employee employee) {
		try {
			String newPassword = MD5.md5(employee.getePassword());
			System.out.println(newPassword);
			employee.setePassword(newPassword);
			employeeService.updateEmp(employee);
			Msg msg = Msg.success();
			msg.setMsg("重设密码成功!");
			return msg;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Msg msg = Msg.fail();
			msg.setMsg("修改密码失败!");
			return msg;
		} 
	}
	/**
	 * 上传员工头像
	 * @param eImage
	 * @param eId
	 * @return
	 */
	@PostMapping("/uploadImg")
	@ResponseBody
	public Msg uploadEmpImg(MultipartFile eImage,Integer eId) {
		// 文件存放路径
        String filePath = EMPIMG;
        String fileName = eImage.getOriginalFilename();
        // 判断路径是否存在，不存在则创建文件夹
        File exifile = new File(filePath);
        if (!exifile.exists()) {
        	exifile.mkdir();
        }
    	// 将文件写入目标
        exifile = new File(filePath, fileName);
        try {
			eImage.transferTo(exifile);
			Employee employee = employeeService.getEmployeeByeId(eId);
			employee.seteImage("/PersonManagement/static/upload/emplyeeUpload/"+exifile.getName());
			employeeService.updateEmp(employee);
			Msg msg = Msg.success();
			msg.setMsg("/PersonManagement/static/upload/emplyeeUpload/"+exifile.getName());
			return msg;
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			Msg msg=Msg.fail();
			return msg;
		}
	}
	@GetMapping("/empExit")
	public String empExit(HttpSession session) {
		session.removeAttribute("employee");
		return "redirect:/index";
	}
}
