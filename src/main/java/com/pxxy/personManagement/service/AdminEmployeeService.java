package com.pxxy.personManagement.service;

import java.util.List;

import com.pxxy.personManagement.domain.Employee;

/**
 * 管理员员工信息管理
 * @author 子江
 *
 */	
public interface AdminEmployeeService {
	/**
	 * 添加一名员工
	 * @param employee
	 */
	public void addOneEmployee(Employee employee);
	/**
	 * 	获取所有的员工
	 * @return
	 */
	public List<Employee> getAllEmployee();
	/**
	 * 通过员工id获取员工信息
	 * @param eId
	 * @return
	 */
	public Employee getEmployeeByeId(Integer eId);
	/**
	 * 	设置员工的新密码
	 * @param eId
	 * @param newPassword
	 * @throws Exception 
	 */
	public void updatePassword(Integer eId,String newPassword) throws Exception;
	/**
	 * 手动添加一名员工
	 * @param employee
	 * @param pPosition 
	 * @throws Exception 
	 */
	public void addEmployee(Employee employee, String pPosition) throws Exception;
	/**
	 * 修改员工信息
	 * @param employee
	 */
	public void updateEmp(Employee employee);
}
