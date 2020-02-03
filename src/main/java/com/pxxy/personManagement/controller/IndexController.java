package com.pxxy.personManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	/**
	 * 跳转到首页
	 * @return
	 */
	@GetMapping("/index")
	public String toIndexPage() {
		return "index";
	}
	/**
	 * 跳转到应聘信息填入界面
	 * @return
	 */
	@GetMapping("/applyPage")
	public String toApplyPage() {
		return "contact";
	}
}
