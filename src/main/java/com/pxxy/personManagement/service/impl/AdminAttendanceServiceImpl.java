package com.pxxy.personManagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pxxy.personManagement.domain.Attendance;
import com.pxxy.personManagement.domain.AttendanceExample;
import com.pxxy.personManagement.domain.AttendanceExample.Criteria;
import com.pxxy.personManagement.domain.Employee;
import com.pxxy.personManagement.mapper.AttendanceMapper;
import com.pxxy.personManagement.mapper.EmployeeMapper;
import com.pxxy.personManagement.service.AdminAttendanceService;
/**
 * 	管理员考勤管理service实现
 * @author 子江
 *
 */
@Service
@Transactional
public class AdminAttendanceServiceImpl implements AdminAttendanceService {
	/**
	 * 注入员工的mapper
	 */
	@Autowired
	private EmployeeMapper employeeMapper; 
	/**
	 * 注入考勤的mapper
	 */
	@Autowired
	private AttendanceMapper attendanceMapper;
	@Override
	public List<Attendance> getAttenForEmp(Integer eId) {
		// TODO Auto-generated method stub
		AttendanceExample example=new AttendanceExample();
		Criteria criteria = example.createCriteria();
		criteria.andEIdEqualTo(eId);
		example.setOrderByClause("at_date desc");
		return attendanceMapper.selectByExample(example);
	}
	@Override
	public int countAttenStatus(Integer eId, String status) {
		// TODO Auto-generated method stub
		AttendanceExample example=new AttendanceExample();
		example.createCriteria().andEIdEqualTo(eId).andAtStatusEqualTo(status);
		return (int) attendanceMapper.countByExample(example);
	}
	
}
