package com.pxxy.personManagement.service;

import java.util.List;

import com.pxxy.personManagement.domain.Salary;

/**
 * 管理员薪酬管理的service接口
 * @author 子江
 *
 */
public interface AdminSalaryService {
	/**
	 * 查出所有员工薪酬列表
	 * @return
	 */
	public List<Salary> getAllEmpSalary();
	/**
	 * 修改员工薪酬信息
	 * @param salary
	 */
	public void updateEmpSalary(Salary salary);
}
