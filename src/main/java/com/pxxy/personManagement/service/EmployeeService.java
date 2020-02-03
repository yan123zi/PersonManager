package com.pxxy.personManagement.service;

import java.util.List;

import com.pxxy.personManagement.domain.Attendance;
import com.pxxy.personManagement.domain.Employee;
import com.pxxy.personManagement.domain.Reward;
import com.pxxy.personManagement.domain.Training;

/**
 * 员工操作的service
 * @author 子江
 *
 */
public interface EmployeeService {
	/**
	 * 员工登录
	 * @param employee
	 * @return
	 */
	public String empLogin(Employee employee);
	/**
	 * 获取员工实体类
	 * @param employee
	 * @return
	 */
	public Employee getEmp(Employee employee);
	/**
	 * 获取针对某个员工的培训信息分页
	 * @param eId
	 * @param before
	 * @param after
	 * @return
	 */
	public List<Training> allTrainForEmpPage(Integer eId,int page,int limit);
	/**
	 *获取针对某个员工的所有培训信息
	 * @param eId
	 * @return
	 */
	public List<Training> allTrainForEmp(Integer eId);
	/**
	 * 获取某个员工的所有考勤信息
	 * @param eId
	 * @return
	 */
	public List<Attendance> allAttenForEmp(Integer eId);
	/**
	 * 获取某个员工的所有考勤信息分页
	 * @param eId
	 * @param page
	 * @param limit
	 * @return
	 */
	public List<Attendance> allAttenForEmpPage(Integer eId,int page,int limit);
	/**
	 * 获取某个员工的所有奖惩信息分页
	 * @param eId
	 * @return
	 */
	public List<Reward> allRewardForEmpPage(Integer eId,int page,int limit);
	/**
	 * 获取某个员工的所有奖惩信息
	 * @param eId
	 * @return
	 */
	public List<Reward> allRewardForEmp(Integer eId);
	/**
	 * 员工打卡
	 * @param eId
	 * @param status
	 */
	public String empPunch(Integer eId,int status,String atDesc);
	public void updateEmp(Employee employee);
	public Employee getEmployeeByeId(Integer eId);
}
