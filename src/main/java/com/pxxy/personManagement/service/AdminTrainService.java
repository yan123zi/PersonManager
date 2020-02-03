package com.pxxy.personManagement.service;

import java.util.List;

import com.pxxy.personManagement.domain.Training;

/**
 * 管理员培训管理service
 * @author 子江
 *
 */
public interface AdminTrainService {
	/**
	 * 获取所有培训信息
	 * @return
	 */
	public List<Training> getAllTraining();
	/**
	 * 根据id获取培训信息
	 * @param tId
	 * @return
	 */
	public Training getTrainBytId(Integer tId);
	/**
	 * 添加培训信息
	 * @param training
	 */
	public void addTrainInfo(Training training);
	/**
	 * 根据id删除培训信息
	 * @param tId
	 */
	public void deleteTrainInfo(Integer tId);
}
