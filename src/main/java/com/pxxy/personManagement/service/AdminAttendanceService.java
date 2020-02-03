package com.pxxy.personManagement.service;
/**
 * 	管理员考勤管理service
 * @author 子江
 *
 */

import java.util.List;

import com.pxxy.personManagement.domain.Attendance;

public interface AdminAttendanceService {
	/**
	 * 	获取某个员工的所有考勤信息
	 * @param eId
	 * @return
	 */
	public List<Attendance> getAttenForEmp(Integer eId);
	/**
	 * 	获取某个员工的某个考勤状态数量
	 * @param eId
	 * @param status
	 * @return
	 */
	public int countAttenStatus(Integer eId,String status);
}
