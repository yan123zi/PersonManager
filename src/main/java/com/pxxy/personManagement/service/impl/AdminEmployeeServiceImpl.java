package com.pxxy.personManagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pxxy.personManagement.domain.Employee;
import com.pxxy.personManagement.domain.Position;
import com.pxxy.personManagement.domain.PositionExample;
import com.pxxy.personManagement.domain.Salary;
import com.pxxy.personManagement.domain.PositionExample.Criteria;
import com.pxxy.personManagement.mapper.EmployeeMapper;
import com.pxxy.personManagement.mapper.PositionMapper;
import com.pxxy.personManagement.mapper.SalaryMapper;
import com.pxxy.personManagement.service.AdminEmployeeService;
import com.pxxy.personManagement.utils.MD5;
/**
 * 管理员员工信息管理
 * @author 子江
 *
 */
@Service
@Transactional
public class AdminEmployeeServiceImpl implements AdminEmployeeService {
	/**
	 * 员工mapper注入
	 */
	@Autowired
	private EmployeeMapper employeeMapper;
	/**
	 * 部门mapper注入
	 */
	@Autowired
	private PositionMapper positionMapper;
	@Autowired
	private SalaryMapper salaryMapper;
	@Override
	public void addOneEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeMapper.insertSelective(employee);
	}
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeMapper.selectByExample(null);
	}
	@Override
	public Employee getEmployeeByeId(Integer eId) {
		// TODO Auto-generated method stub
		return employeeMapper.selectByPrimaryKey(eId);
	}
	@Override
	public void updatePassword(Integer eId, String newPassword) throws Exception {
		// TODO Auto-generated method stub
		Employee employee = employeeMapper.selectByPrimaryKey(eId);
		String md5 = MD5.md5(newPassword);
		employee.setePassword(md5);
		employeeMapper.updateByPrimaryKeySelective(employee);
	}
	@Override
	public void addEmployee(Employee employee,String pPosition) throws Exception {
		// TODO Auto-generated method stub
		String password = employee.getePassword();
		String md5 = MD5.md5(password);
		employee.setePassword(md5);
		PositionExample example=new PositionExample();
		Criteria criteria = example.createCriteria();
		criteria.andPNameEqualTo(pPosition);
		List<Position> position = positionMapper.selectByExample(example);
		employee.setPosition(position.get(0));
		employee.seteIfwork(1);
		Salary salary=new Salary();
		salary.setsSocial(new Double(1000));
		salary.setsSubsidy(new Double(1000));
		salary.setsSalary(new Double(12000));
		salary.setsFinal(salary.getsSalary()+salary.getsSocial()+salary.getsSubsidy());
		salaryMapper.insertSelective(salary);
		
		employee.setsId(salary);
		employeeMapper.insertSelective(employee);
		salary.seteId(employee);
		salaryMapper.updateByPrimaryKeySelective(salary);
	}
	@Override
	public void updateEmp(Employee employee) {
		// TODO Auto-generated method stub
		PositionExample example=new PositionExample();
		example.createCriteria().andPNameEqualTo(employee.getPosition().getpName());
		List<Position> example2 = positionMapper.selectByExample(example);
		employee.setPosition(example2.get(0));
		employeeMapper.updateByPrimaryKeySelective(employee);
	}
	
}
