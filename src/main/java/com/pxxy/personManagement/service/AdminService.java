package com.pxxy.personManagement.service;

import com.pxxy.personManagement.domain.Admin;

/**
 * 	管理员的Service接口层
 * @author 子江
 *
 */
public interface AdminService {
	/**
	 * 	管理员登录方法
	 * @param admin 输入的管理员信息
	 * @return 返回登录信息
	 */
	public String login(Admin admin);
}
