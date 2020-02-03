package com.pxxy.personManagement.controller.admin;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pxxy.personManagement.domain.Admin;
import com.pxxy.personManagement.service.AdminService;
/**
 * 管理员的controller
 * @param admin
 * @param code
 * @param session
 * @param model
 * @return
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	@GetMapping("/loginPage")
	public String toAdminLoginPage() {
		return "admin/login-page";
	}
	@PostMapping("/login")
	public String login(Admin admin,String code,HttpSession session,Model model) {
		String validateCode = (String) session.getAttribute("validateCode");
		System.out.println(validateCode);
		if(code.equalsIgnoreCase(validateCode)) {
			String msg = adminService.login(admin);
			if(msg.equals("登录成功!")) {
				session.setMaxInactiveInterval(3*60*60);
				session.setAttribute("admin", admin);
				return "admin/index";
			}
			model.addAttribute("msg", msg);
			return "admin/login-page";
		}
		model.addAttribute("msg", "验证码输入不正确!");
		return "admin/login-page";
	}
	@GetMapping("/logout")
	public String adminLogout(HttpSession session) {
		session.removeAttribute("admin");
		return "redirect:loginPage";
	}
}
