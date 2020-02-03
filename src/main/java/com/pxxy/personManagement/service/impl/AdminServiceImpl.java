package com.pxxy.personManagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pxxy.personManagement.domain.Admin;
import com.pxxy.personManagement.mapper.AdminMapper;
import com.pxxy.personManagement.service.AdminService;
/**
 * 	管理员的service接口实现层
 * @author 子江
 *
 */
@Transactional
@Service
public class AdminServiceImpl implements AdminService {
	/**
	 * 	管理员mapper接口注入
	 */
	@Autowired
	private AdminMapper adminMapper;
	/**
	 * 	管理员登录逻辑
	 */
	@Override
	public String login(Admin admin) {
		// TODO Auto-generated method stub
		Admin adminByaUsername = adminMapper.selectAdminByaUsername(admin.getaUsername());
		if(adminByaUsername==null) {
			return "该账号不存在!";
		}else {
			if(admin.getaPassword().equals(adminByaUsername.getaPassword())) {
				return "登录成功!";
			}else {
				return "密码错误!";
			}
		}
	}
	
}
