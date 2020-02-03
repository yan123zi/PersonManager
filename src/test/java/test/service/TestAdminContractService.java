package test.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pxxy.personManagement.domain.Apply;
import com.pxxy.personManagement.domain.ApplyExample;
import com.pxxy.personManagement.domain.Employee;
import com.pxxy.personManagement.domain.ApplyExample.Criteria;
import com.pxxy.personManagement.domain.Contract;
import com.pxxy.personManagement.mapper.ApplyMapper;
import com.pxxy.personManagement.mapper.ContractMapper;
import com.pxxy.personManagement.mapper.EmployeeMapper;
import com.pxxy.personManagement.mapper.PositionMapper;
import com.pxxy.personManagement.service.AdminContractService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:config/spring-context.xml"})
public class TestAdminContractService {
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
	private AdminContractService adminContractService;
	@Test
	public void testId() {
		Employee employee=new Employee();
		employeeMapper.insertSelective(employee);
		Integer id = employee.geteId();
		System.out.println(id);
	}
	@Test
	public void testselect() throws Exception {
		Contract contract=new Contract();
		contract.setcBname("龚仕俊");
		contract.setcBnumber("362330199812062071");
		contract.setcBposition("java开发工程师");
		adminContractService.addOneContract(contract);
	}
}
