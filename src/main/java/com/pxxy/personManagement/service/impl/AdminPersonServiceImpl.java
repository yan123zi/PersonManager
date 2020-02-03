package com.pxxy.personManagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pxxy.personManagement.domain.Employee;
import com.pxxy.personManagement.domain.EmployeeExample;
import com.pxxy.personManagement.domain.EmployeeExample.Criteria;
import com.pxxy.personManagement.domain.Talent;
import com.pxxy.personManagement.mapper.EmployeeMapper;
import com.pxxy.personManagement.mapper.TalentMapper;
import com.pxxy.personManagement.service.AdminPersonService;
/**
 * 管理员人事变动的service实现
 * @author 子江
 *
 */
@Service
@Transactional
public class AdminPersonServiceImpl implements AdminPersonService {
	@Autowired
	private TalentMapper talentMapper;
	@Autowired
	private EmployeeMapper employeeMapper;
	@Override
	public List<Employee> getAllEmployeeNotTalent() {
		// TODO Auto-generated method stub
		EmployeeExample example=new EmployeeExample();
		Criteria criteria = example.createCriteria();
		criteria.andEIftalentEqualTo(0);
		return employeeMapper.selectByExample(example);
	}
	@Override
	public void addTalent(Integer eId) {
		// TODO Auto-generated method stub
		Employee employee = employeeMapper.selectByPrimaryKey(eId);
		employee.seteIftalent(1);
		employeeMapper.updateByPrimaryKeySelective(employee);
		Talent talent=new Talent();
		talent.seteId(employee);
		talentMapper.insert(talent);
	}
	@Override
	public void dismissal(Integer eId) {
		// TODO Auto-generated method stub
		employeeMapper.deleteByPrimaryKey(eId);
	}
	@Override
	public List<Talent> getAllTalent() {
		// TODO Auto-generated method stub
		return talentMapper.selectByExample(null);
	}
	@Override
	public void deleteTalent(Integer taId) {
		// TODO Auto-generated method stub
		Talent talent = talentMapper.selectByPrimaryKey(taId);
		Employee employee = talent.geteId();
		employee.seteIftalent(0);
		employeeMapper.updateByPrimaryKeySelective(employee);
		talentMapper.deleteByPrimaryKey(taId);
	}
	
}
