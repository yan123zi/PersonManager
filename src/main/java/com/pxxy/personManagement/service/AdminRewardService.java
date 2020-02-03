package com.pxxy.personManagement.service;

import java.util.List;

import com.pxxy.personManagement.domain.Reward;

/**
 * 	管理员奖惩管理service
 * @author 子江
 *
 */
public interface AdminRewardService {
	/**
	 * 	查看某个员工所有的奖惩信息
	 * @return
	 */
	public List<Reward> getAllRewardForEmp(Integer eId);
	/**
	 * 	添加一个奖惩信息
	 * @param reward
	 */
	public void addReward(Reward reward,boolean j);

}
