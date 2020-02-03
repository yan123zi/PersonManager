package com.pxxy.personManagement.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pxxy.personManagement.domain.Apply;
import com.pxxy.personManagement.domain.ApplyExample;
import com.pxxy.personManagement.domain.ApplyExample.Criteria;
import com.pxxy.personManagement.domain.Contract;
import com.pxxy.personManagement.domain.ContractExample;
import com.pxxy.personManagement.domain.Employee;
import com.pxxy.personManagement.domain.Position;
import com.pxxy.personManagement.domain.PositionExample;
import com.pxxy.personManagement.domain.Salary;
import com.pxxy.personManagement.mapper.ApplyMapper;
import com.pxxy.personManagement.mapper.ContractMapper;
import com.pxxy.personManagement.mapper.EmployeeMapper;
import com.pxxy.personManagement.mapper.PositionMapper;
import com.pxxy.personManagement.mapper.SalaryMapper;
import com.pxxy.personManagement.service.AdminContractService;
import com.pxxy.personManagement.utils.MD5;
/**
 * 	管理员合同管理
 * @author 子江
 *
 */
@Service
@Transactional
public class AdminContractServiceImpl implements AdminContractService{
	/**
	 * 注入合同的mapper
	 */
	@Autowired
	private ContractMapper contractMapper;
	/**
	 * 	注入员工的mapper
	 */
	@Autowired
	private EmployeeMapper employeeMapper;
	/**
	 * 注入面试信息的mapper
	 */
	@Autowired
	private ApplyMapper applyMapper;
	/**
	 * 部门mapper注入
	 */
	@Autowired
	private PositionMapper positionMapper;
	@Autowired
	private com.pxxy.personManagement.service.AdminRecruitmentService AdminRecruitmentService;
	@Autowired
	private SalaryMapper salaryMapper;
	@Override
	public List<Contract> getAllContract() {
		// TODO Auto-generated method stub
		return contractMapper.selectByExample(null);
	}

	@Override
	public String addOneContract(Contract contract) throws Exception {
		ContractExample contractExample=new ContractExample();
		com.pxxy.personManagement.domain.ContractExample.Criteria criteria2 = contractExample.createCriteria();
		criteria2.andCBnameEqualTo(contract.getcBname());
		criteria2.andCBnumberEqualTo(contract.getcBnumber());
		criteria2.andCBpositionEqualTo(contract.getcBposition());
		List<Contract> byExample2 = contractMapper.selectByExample(contractExample);
		if(byExample2.size()>0) {
			return "该人员合同信息已录入!请不要重复操作!";
		}else {
		// TODO Auto-generated method stub
		ApplyExample example=new ApplyExample();
		Criteria criteria = example.createCriteria();
		criteria.andApNameEqualTo(contract.getcBname());
		criteria.andIScheEqualTo(3);
		criteria.andApNumberEqualTo(contract.getcBnumber());
		criteria.andPPositionEqualTo(contract.getcBposition());
		List<Apply> apply = applyMapper.selectByExample(example);
		if(apply.size()>0) {
			Employee employee=new Employee();
			employee.seteName(apply.get(0).getApName());
			employee.seteAge(apply.get(0).getApAge());
			employee.seteGender(apply.get(0).getApGender());
			employee.seteEdu(apply.get(0).getApEdu());
			employee.setePhone(apply.get(0).getApPhone());
			PositionExample example1=new PositionExample();
			com.pxxy.personManagement.domain.PositionExample.Criteria criteria1 = example1.createCriteria();
			criteria1.andPNameEqualTo(apply.get(0).getpPosition());
			List<Position> byExample = positionMapper.selectByExample(example1);
			Position position = byExample.get(0);
			employee.setPosition(position);
			String md5 = MD5.md5("123456");
			employee.setePassword(md5);
			employee.seteIfwork(1);
			employee.seteBegin(new Date());
			employee.seteNumber(apply.get(0).getApNumber());
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
			
			contract.seteId(employee);
			contractMapper.insert(contract);
			AdminRecruitmentService.updateApplyiSche(apply.get(0), 5);
			return "录入合同信息成功!";
		}else {
			return "该人员不存在!或面试不合格等原因填写合同信息失败!";
		}
		}
	}

	@Override
	public Contract getContractById(Integer cId) {
		// TODO Auto-generated method stub
		return contractMapper.selectByPrimaryKey(cId);
	}

	@Override
	public void deleteContractById(Integer cId) {
		// TODO Auto-generated method stub
		contractMapper.deleteByPrimaryKey(cId);
	}

}
