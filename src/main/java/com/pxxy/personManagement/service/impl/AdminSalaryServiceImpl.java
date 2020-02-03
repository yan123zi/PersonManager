package com.pxxy.personManagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pxxy.personManagement.domain.Salary;
import com.pxxy.personManagement.mapper.SalaryMapper;
import com.pxxy.personManagement.service.AdminSalaryService;

/**
 * 管理员薪酬管理的service实现
 * @author 子江
 *
 */
@Service
@Transactional
public class AdminSalaryServiceImpl implements AdminSalaryService{
	@Autowired
	private SalaryMapper salaryMapper;
	@Override
	public List<Salary> getAllEmpSalary() {
		// TODO Auto-generated method stub
		return salaryMapper.selectByExample(null);
	}
	@Override
	public void updateEmpSalary(Salary salary) {
		// TODO Auto-generated method stub
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+salary);
		salaryMapper.updateByPrimaryKeySelective(salary);
	}
	
}
