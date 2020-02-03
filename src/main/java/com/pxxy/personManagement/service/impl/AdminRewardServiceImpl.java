package com.pxxy.personManagement.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pxxy.personManagement.domain.AttendanceExample;
import com.pxxy.personManagement.domain.Reward;
import com.pxxy.personManagement.domain.RewardExample;
import com.pxxy.personManagement.domain.RewardExample.Criteria;
import com.pxxy.personManagement.domain.Salary;
import com.pxxy.personManagement.domain.SalaryExample;
import com.pxxy.personManagement.mapper.AttendanceMapper;
import com.pxxy.personManagement.mapper.RewardMapper;
import com.pxxy.personManagement.mapper.SalaryMapper;
import com.pxxy.personManagement.service.AdminRewardService;
/**
 * 	管理员奖惩管理service实现
 * @author 子江
 *
 */
@Service
@Transactional
public class AdminRewardServiceImpl implements AdminRewardService {
	@Autowired
	private RewardMapper rewardMapper;
	@Autowired
	private SalaryMapper salaryMapper;
	@Override
	public List<Reward> getAllRewardForEmp(Integer eId) {
		// TODO Auto-generated method stub
		RewardExample example=new RewardExample();
		Criteria criteria = example.createCriteria();
		criteria.andEIdEqualTo(eId);
		example.setOrderByClause("re_redate desc");
		example.or(criteria);
		return rewardMapper.selectByExample(example);
	}

	@Override
	public void addReward(Reward reward,boolean j) {
		// TODO Auto-generated method stub
		reward.setReDate(new Date());
		if(j) {
			reward.setReRedate(new Date());
			rewardMapper.insertSelective(reward);
			
			SalaryExample example=new SalaryExample();
			example.createCriteria().andEIdEqualTo(reward.geteId().geteId());
			List<Salary> list = salaryMapper.selectByExample(example);
			Salary salary = list.get(0);
			Double final1 = salary.getsFinal();
			final1=final1+reward.getReReward();
			salary.setsFinal(final1);
			salaryMapper.updateByPrimaryKey(salary);
		}else {
			reward.setRePudate(new Date());
			rewardMapper.insertSelective(reward);
			
			SalaryExample example=new SalaryExample();
			example.createCriteria().andEIdEqualTo(reward.geteId().geteId());
			List<Salary> list = salaryMapper.selectByExample(example);
			Salary salary = list.get(0);
			Double final1 = salary.getsFinal();
			final1=final1-reward.getRePunish();
			salary.setsFinal(final1);
			salaryMapper.updateByPrimaryKey(salary);
		}
	}

}
