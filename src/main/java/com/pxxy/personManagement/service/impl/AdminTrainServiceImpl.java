package com.pxxy.personManagement.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pxxy.personManagement.domain.Training;
import com.pxxy.personManagement.mapper.TrainingMapper;
import com.pxxy.personManagement.service.AdminTrainService;
/**
 * 管理员培训管理service实现
 * @author 子江
 *
 */
@Service
@Transactional
public class AdminTrainServiceImpl implements AdminTrainService{
	/**
	 * 注入培训信息的mapper
	 */
	@Autowired
	private TrainingMapper trainingMapper;
	@Override
	public List<Training> getAllTraining() {
		// TODO Auto-generated method stub
		return trainingMapper.selectByExampleWithBLOBs(null);
	}

	@Override
	public Training getTrainBytId(Integer tId) {
		// TODO Auto-generated method stub
		return trainingMapper.selectByPrimaryKey(tId);
	}

	@Override
	public void addTrainInfo(Training training) {
		// TODO Auto-generated method stub
		training.settDate(new Date());
		trainingMapper.insert(training);
	}

	@Override
	public void deleteTrainInfo(Integer tId) {
		// TODO Auto-generated method stub
		trainingMapper.deleteByPrimaryKey(tId);
	}

}
