package com.pxxy.personManagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pxxy.personManagement.domain.Apply;
import com.pxxy.personManagement.domain.Employee;
import com.pxxy.personManagement.domain.Interview;
import com.pxxy.personManagement.domain.Position;
import com.pxxy.personManagement.domain.PositionExample;
import com.pxxy.personManagement.domain.PositionExample.Criteria;
import com.pxxy.personManagement.mapper.ApplyMapper;
import com.pxxy.personManagement.mapper.EmployeeMapper;
import com.pxxy.personManagement.mapper.InterviewMapper;
import com.pxxy.personManagement.mapper.PositionMapper;
import com.pxxy.personManagement.service.AdminInterviewService;
import com.pxxy.personManagement.utils.MD5;
/**
 * 管理员对面试信息的操作
 * @author 子江
 *
 */
@Service
@Transactional
public class AdminInterviewServiceImpl implements AdminInterviewService {
	/**
	 * 面试信息mapper注入
	 */
	@Autowired
	private InterviewMapper interviewMapper;
	/**
	 * 部门mapper注入
	 */
	@Autowired
	private PositionMapper positionMapper;
	/**
	 * 员工mapper注入
	 */
	@Autowired
	private EmployeeMapper employeeMapper;
	/**
	 * 应聘mapper注入
	 */
	@Autowired
	private ApplyMapper applyMapper;
	/**
	 * 获得所有面试信息
	 * @return
	 */
	@Override
	public List<Interview> getAllInterview() {
		// TODO Auto-generated method stub
		return interviewMapper.selectByExample(null);
	}
	/**
	 * 通过面试编号查找该记录
	 * @param iId
	 * @return
	 */
	@Override
	public Interview getInterviewByiId(Integer iId) {
		// TODO Auto-generated method stub
		return interviewMapper.selectByPrimaryKey(iId);
	}
	/**
	 * 根据面试编号更新面试状态
	 * @param interview
	 */
	@Override
	public void updateInterviewStatus(Integer iId,int status) {
		// TODO Auto-generated method stub
		Interview interview = interviewMapper.selectByPrimaryKey(iId);
		Apply apply = interview.getApId();
		apply.setiSche(status);
		applyMapper.updateByPrimaryKey(apply);
	}
	/**
	 * 根据面试编号删除面试信息
	 * @param iId
	 */
	@Override
	public void deleteInterviewByiId(Integer iId) {
		// TODO Auto-generated method stub
		interviewMapper.deleteByPrimaryKey(iId);
	}

}
