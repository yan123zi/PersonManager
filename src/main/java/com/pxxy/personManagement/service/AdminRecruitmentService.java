package com.pxxy.personManagement.service;

import java.util.List;

import com.pxxy.personManagement.domain.Apply;
import com.pxxy.personManagement.domain.Interview;
import com.pxxy.personManagement.domain.Recruitment;

/**
 * 	管理员招聘模块的service接口
 * @author 子江
 *
 */
public interface AdminRecruitmentService {
	/**
	 * 	获得所有应聘信息
	 * @return 所有应聘信息
	 */
	public List<Apply> getAllApplyMessage();
	/**
	 * 	删除某个应聘信息
	 * @param apId 应聘号
	 */
	public void removeApplyMessageById(Integer apId);
	/**
	 * 	根据应聘id查询指定应聘信息
	 * @param apId 应聘号
	 * @return 指定的应聘信息
	 */
	public Apply getApplyMessageById(Integer apId);
	/**
	 * 添加一条面试信息
	 * @param interview
	 */
	public void fillInterviewMes(Interview interview);
	/**
	 * 判断是否发送面试信息
	 * @param apId
	 * @return
	 */
	public boolean ifSendInterview(Integer apId);
	/**
	 * 更新应聘者面试状态
	 * @param apply
	 * @param status
	 */
	public void updateApplyiSche(Apply apply,int status);
	/**
	 * 发布一条招聘信息
	 * @param recruitment
	 */
	public void releaseOneRecruit(Recruitment recruitment);
	/**
	 * 获得所有招聘信息
	 */
	public List<Recruitment> getAllRecruit();
	/**
	 * 根据id删除一条招聘发布记录
	 * @param rId
	 */
	public void deleteRecruitById(Integer rId);
	/**
	 * 	根据id查询一条招聘信息记录
	 * @param rId
	 * @return
	 */
	public Recruitment getRecruitByrId(Integer rId);
}
