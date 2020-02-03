package com.pxxy.personManagement.service;

import java.util.List;

import com.pxxy.personManagement.domain.Employee;
import com.pxxy.personManagement.domain.Talent;

/**
 * 管理员人事变动的service接口
 * @author 子江
 *
 */
public interface AdminPersonService {
	/**
	 * 查询出所有不是人才的员工
	 * @return
	 */
	public List<Employee> getAllEmployeeNotTalent();
	/**
	 * 添加一名人才
	 * @param eId
	 */
	public void addTalent(Integer eId);
	/**
	 * 解雇一名员工
	 * @param eId
	 */
	public void dismissal(Integer eId);
	/**
	 * 得到所有人才信息
	 * @return
	 */
	public List<Talent> getAllTalent();
	public void deleteTalent(Integer taId);
}
