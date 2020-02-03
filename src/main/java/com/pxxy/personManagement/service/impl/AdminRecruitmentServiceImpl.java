package com.pxxy.personManagement.service.impl;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pxxy.personManagement.domain.Apply;
import com.pxxy.personManagement.domain.Interview;
import com.pxxy.personManagement.domain.InterviewExample;
import com.pxxy.personManagement.domain.InterviewExample.Criteria;
import com.pxxy.personManagement.domain.Recruitment;
import com.pxxy.personManagement.mapper.ApplyMapper;
import com.pxxy.personManagement.mapper.InterviewMapper;
import com.pxxy.personManagement.mapper.RecruitmentMapper;
import com.pxxy.personManagement.service.AdminRecruitmentService;
/**
 * 	管理员招聘模块的service实现
 * @author 子江
 *
 */
@Service
@Transactional
public class AdminRecruitmentServiceImpl implements AdminRecruitmentService {
	/**
	 * 注入招聘信息的mapper
	 */
	@Autowired
	private RecruitmentMapper recruitmentMapper;
	/**
	 * 注入应聘信息的mapper
	 */
	@Autowired
	private ApplyMapper applyMapper;
	/**
	 * 注入面试信息的mapper
	 */
	@Autowired
	private InterviewMapper interviewMapper;
	/**
	 * 	获得所有应聘信息
	 * @return 所有应聘信息
	 */
	@Override
	public List<Apply> getAllApplyMessage() {
		// TODO Auto-generated method stub
		return applyMapper.selectByExample(null);
	}
	/**
	 * 	删除某个应聘信息
	 * @param apId 应聘号
	 */
	@Override
	public void removeApplyMessageById(Integer apId) {
		// TODO Auto-generated method stub
		applyMapper.deleteByPrimaryKey(apId);
	}
	/**
	 * 	根据应聘id查询指定应聘信息
	 * @param apId 应聘号
	 * @return 指定的应聘信息
	 */
	@Override
	public Apply getApplyMessageById(Integer apId) {
		// TODO Auto-generated method stub
		return applyMapper.selectByPrimaryKey(apId);
	}
	/**
	 * 添加一条面试信息
	 * @param interview
	 */
	@Override
	public void fillInterviewMes(Interview interview) {
		// TODO Auto-generated method stub
		interviewMapper.insert(interview);
	}
	/**
	 * 判断是否发送面试信息
	 * @param apId
	 * @return
	 */
	@Override
	public boolean ifSendInterview(Integer apId) {
		// TODO Auto-generated method stub
		InterviewExample example=new InterviewExample();
		Criteria criteria = example.createCriteria();
		criteria.andApIdEqualTo(apId);
		long l = interviewMapper.countByExample(example);
		int c=(int) l;
		if(c>=1) {
			return true;
		}
		return false;
	}
	/**
	 * 更新应聘者面试状态
	 * @param apply
	 * @param status
	 */
	@Override
	public void updateApplyiSche(Apply apply,int status) {
		// TODO Auto-generated method stub
		apply.setiSche(status);
		applyMapper.updateByPrimaryKey(apply);
	}
	/**
	 * 发布一条招聘信息
	 * @param recruitment
	 */
	@Override
	public void releaseOneRecruit(Recruitment recruitment) {
		// TODO Auto-generated method stub
		recruitment.setrTime(new Date());
		recruitmentMapper.insert(recruitment);
	}
	/**
	 * 获得所有招聘信息
	 */
	@Override
	public List<Recruitment> getAllRecruit() {
		return recruitmentMapper.selectByExampleWithBLOBs(null);
	}
	/**
	 * 根据id删除一条招聘发布记录
	 * @param rId
	 */
	@Override
	public void deleteRecruitById(Integer rId) {
		// TODO Auto-generated method stub
		recruitmentMapper.deleteByPrimaryKey(rId);
	}
	@Override
	public Recruitment getRecruitByrId(Integer rId) {
		// TODO Auto-generated method stub
		return recruitmentMapper.selectByPrimaryKey(rId);
	}
}
