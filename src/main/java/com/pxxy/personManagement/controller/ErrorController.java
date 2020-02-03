package com.pxxy.personManagement.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {
	@GetMapping("/notFound")
	public String notFoundPage(Model model) {
		model.addAttribute("msg", "请求的资源路径不存在!");
		return "error";
	}
	@GetMapping("/notAllowed")
	public String notAllowedMethod(Model model) {
		model.addAttribute("msg", "请求方式错误");
		return "error";
	}
	@GetMapping("/codeError")
	public String codeError(Model model) {
		model.addAttribute("msg", "系统方式异常问题！请联系管理员！");
		return "error";
	}
}
