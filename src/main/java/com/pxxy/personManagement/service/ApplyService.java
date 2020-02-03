package com.pxxy.personManagement.service;

import java.util.List;

import com.pxxy.personManagement.domain.Apply;
import com.pxxy.personManagement.domain.Department;

/**
 * 	应聘者的service
 * @author 子江
 *
 */
public interface ApplyService {
	/**
	 * 	应聘信息填写
	 * @param apply
	 */
	public void fillApplyMessage(Apply apply);
	/**
	 * 	根据部门名称查出部门
	 * @param dName
	 * @return
	 */
	public Department getDepartmentBydName(String dName);
	/**
	 * 	获得所有的部门
	 * @return
	 */
	public List<Department> getAllDepartment();
}
