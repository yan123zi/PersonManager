package com.pxxy.personManagement.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pxxy.personManagement.domain.Attendance;
import com.pxxy.personManagement.domain.AttendanceExample;
import com.pxxy.personManagement.domain.Employee;
import com.pxxy.personManagement.domain.EmployeeExample;
import com.pxxy.personManagement.domain.Reward;
import com.pxxy.personManagement.domain.RewardExample;
import com.pxxy.personManagement.domain.Training;
import com.pxxy.personManagement.domain.TrainingExample;
import com.pxxy.personManagement.mapper.AttendanceMapper;
import com.pxxy.personManagement.mapper.EmployeeMapper;
import com.pxxy.personManagement.mapper.RewardMapper;
import com.pxxy.personManagement.mapper.TrainingMapper;
import com.pxxy.personManagement.service.EmployeeService;
import com.pxxy.personManagement.utils.DateUtil;
import com.pxxy.personManagement.utils.MD5;
/**
 * 员工操作的service
 * @author 子江
 *
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	/**
	 * 注入员工的mapper
	 */
	@Autowired
	private EmployeeMapper employeeMapper; 
	@Autowired
	private TrainingMapper trainingMapper;
	@Autowired
	private AttendanceMapper attendanceMapper;
	@Autowired
	private RewardMapper rewardMapper;
	@Override
	public String empLogin(Employee employee) {
		// TODO Auto-generated method stub
		String name = employee.geteName();
		EmployeeExample example=new EmployeeExample();
		example.createCriteria().andENameEqualTo(name);
		List<Employee> selectByExample = employeeMapper.selectByExample(example);
		if(selectByExample.size()>0) {
			try {
				Employee employee2 = selectByExample.get(0);
				System.out.println(employee2.getePassword());
				boolean verify = MD5.verify(employee.getePassword(), employee2.getePassword());
				if(verify) {
					return "登录成功!";
				}else {
					return "密码错误!";
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return "登录出现异常!";
			}
		}else {
			return "该员工不存在!";
		}
	}
	@Override
	public Employee getEmp(Employee employee) {
		// TODO Auto-generated method stub
		EmployeeExample example=new EmployeeExample();
		try {
			String md5 = MD5.md5(employee.getePassword());
			example.createCriteria().andENameEqualTo(employee.geteName()).andEPasswordEqualTo(md5);
			List<Employee> selectByExample = employeeMapper.selectByExample(example);
			Employee employee2 = selectByExample.get(0);
			return employee2;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	}
	@Override
	public List<Training> allTrainForEmp(Integer eId) {
		// TODO Auto-generated method stub
		Employee employee = employeeMapper.selectByPrimaryKey(eId);
		TrainingExample example=new TrainingExample();
		example.createCriteria().andPPositionEqualTo(employee.getPosition().getpName());
		return trainingMapper.selectByExample(example);
	}
	@Override
	public List<Training> allTrainForEmpPage(Integer eId, int page, int limit) {
		// TODO Auto-generated method stub
		Map map=new HashMap<String,Object>();
		map.put("pName", employeeMapper.selectByPrimaryKey(eId).getPosition().getpName());
		map.put("page", page);
		map.put("limit", limit);
		return trainingMapper.selectPageByeId(map);
	}
	/*@Override
	public int countTrainForEmp(Integer eId) {
		// TODO Auto-generated method stub
		Employee employee = employeeMapper.selectByPrimaryKey(eId);
		TrainingExample example=new TrainingExample();
		example.createCriteria().andPPositionEqualTo(employee.getPosition().getpName());
		return trainingMapper.countByExample(example);
	}*/
	@Override
	public List<Attendance> allAttenForEmp(Integer eId) {
		// TODO Auto-generated method stub
		AttendanceExample example=new AttendanceExample();
		example.createCriteria().andEIdEqualTo(eId);
		return attendanceMapper.selectByExample(example);
	}
	@Override
	public List<Attendance> allAttenForEmpPage(Integer eId, int page, int limit) {
		// TODO Auto-generated method stub
		return attendanceMapper.selectPageByeId(eId, page, limit);
	}
	@Override
	public List<Reward> allRewardForEmpPage(Integer eId, int page, int limit) {
		// TODO Auto-generated method stub
		return rewardMapper.selectPageByeId(eId, page, limit);
	}
	@Override
	public List<Reward> allRewardForEmp(Integer eId) {
		// TODO Auto-generated method stub
		RewardExample example=new RewardExample();
		example.createCriteria().andEIdEqualTo(eId);
		return rewardMapper.selectByExample(example);
	}
	@Override
	public String empPunch(Integer eId, int status,String atDesc) {
		// TODO Auto-generated method stub
		String startWork="09:00:00";
		Date dStartWork = DateUtil.paresString("HH:mm:ss", startWork);
		String endWork="17:00:00";
		Date dendWork = DateUtil.paresString("HH:mm:ss", endWork);
		Date date = DateUtil.parse("yyyy-MM-dd", new Date());
		AttendanceExample example=new AttendanceExample();
		example.createCriteria().andAtDateEqualTo(date).andEIdEqualTo(eId);
		List<Attendance> byExample = attendanceMapper.selectByExample(example);
		if(byExample.size()>0) {
			Attendance attendance = byExample.get(0);
			if(attendance.getAtDesc()!=null) {
				return "今日已请假，无需打卡!";
			}else {
				if(status==0) {
					return "您已上班打卡!请不要重复操作!";
				}
				if(status==1) {
					if(attendance.getAtEw()!=null) {
						return "下班已经打过卡了!请不要重复操作!";
					}
					Date d2 = new Date();
					Date parse = DateUtil.parse("HH:mm:ss", d2);
					if(parse.compareTo(dendWork)<0) {
						if(attendance.getAtStatus()==0) {
							attendance.setAtStatus(3);
						}else {
							attendance.setAtStatus(1);
						}
					}else {
						attendance.setAtStatus(4);
					}
					attendance.setAtEw(d2);
					attendanceMapper.updateByPrimaryKeySelective(attendance);
					return "下班打卡成功!";
				}
				if(status==2) {
					if(attendance.getAtDesc()!=null) {
						return "您已经请过假了!请不要重复操作!";
					}
					attendance.setAtDesc(atDesc);
					attendance.setAtStatus(2);
					attendanceMapper.updateByPrimaryKeySelective(attendance);
					return "请假成功!";
				}
			}
		}else {
			Attendance attendance=new Attendance();
			if(status==0) {
				attendance.setAtDate(new Date());
				Date d1 = new Date();
				Date parse = DateUtil.parse("HH:mm:ss", d1);
				if(parse.compareTo(dStartWork)>0) {
					attendance.setAtStatus(0);
				}else {
					attendance.setAtStatus(4);
				}
				attendance.setAtSw(d1);
				attendance.seteId(employeeMapper.selectByPrimaryKey(eId));
				attendanceMapper.insertSelective(attendance);
				return "上班打卡成功!";
				
			}
			if(status==1) {
				return "请上班打卡!";
			}
			if(status==2) {
				attendance.setAtDate(new Date());
				attendance.setAtDesc(atDesc);
				attendance.setAtStatus(2);
				attendance.seteId(employeeMapper.selectByPrimaryKey(eId));
				attendanceMapper.insertSelective(attendance);
				return "请假成功!";
			}
			return "请上班打卡!";
		}
		return "打卡异常!";
	}
	@Override 
	public void updateEmp(Employee employee) {
		// TODO Auto-generated method stub
		employeeMapper.updateByPrimaryKeySelective(employee);
	}
	@Override
	public Employee getEmployeeByeId(Integer eId) {
		// TODO Auto-generated method stub
		return employeeMapper.selectByPrimaryKey(eId);
	}
}
