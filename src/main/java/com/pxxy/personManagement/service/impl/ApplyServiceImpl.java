package com.pxxy.personManagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pxxy.personManagement.domain.Apply;
import com.pxxy.personManagement.domain.Department;
import com.pxxy.personManagement.domain.DepartmentExample;
import com.pxxy.personManagement.domain.DepartmentExample.Criteria;
import com.pxxy.personManagement.mapper.ApplyMapper;
import com.pxxy.personManagement.mapper.DepartmentMapper;
import com.pxxy.personManagement.service.ApplyService;
/**
 * 	应聘者的service
 * @author 子江
 *
 */
@Service
@Transactional
public class ApplyServiceImpl implements ApplyService {
	/**
	 * 注入应聘信息的mapper
	 */
	@Autowired
	private ApplyMapper applyMapper;
	/**
	 * 	注入部门信息的mapper
	 */
	@Autowired
	private DepartmentMapper departmentMapper;
	/**
	 * 	应聘信息填写
	 * @param apply
	 */
	@Override
	public void fillApplyMessage(Apply apply) {
		// TODO Auto-generated method stub
		applyMapper.insert(apply);
	}
	/**
	 * 	根据部门名称查出部门
	 * @param dName
	 * @return
	 */
	@Override
	public Department getDepartmentBydName(String dName) {
		// TODO Auto-generated method stub
		return departmentMapper.selectDepartmentByNameWithPosition(dName);
	}
	/**
	 * 	获得所有的部门
	 * @return
	 */
	@Override
	public List<Department> getAllDepartment() {
		// TODO Auto-generated method stub
		return departmentMapper.selectAllDepartmentWithPosition();
	}

}
