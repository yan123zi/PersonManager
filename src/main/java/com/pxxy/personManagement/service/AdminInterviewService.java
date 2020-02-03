package com.pxxy.personManagement.service;

import java.util.List;

import com.pxxy.personManagement.domain.Apply;
import com.pxxy.personManagement.domain.Interview;

/**
 * 管理员对面试信息的管理
 * @author 子江
 *
 */
public interface AdminInterviewService {
	/**
	 * 获得所有面试信息
	 * @return
	 */
	public List<Interview> getAllInterview();
	/**
	 * 通过面试编号查找该记录
	 * @param iId
	 * @return
	 */
	public Interview getInterviewByiId(Integer iId);
	/**
	 * 根据面试编号更新面试状态
	 * @param interview
	 */
	public void updateInterviewStatus(Integer iId,int status);
	/**
	 * 根据面试编号删除面试信息
	 * @param iId
	 */
	public void deleteInterviewByiId(Integer iId);
}
