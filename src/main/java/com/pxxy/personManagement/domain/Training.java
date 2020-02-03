package com.pxxy.personManagement.domain;

import java.util.Date;
/**
 * 培训信息实体类
 * @author 子江
 *
 */
public class Training {
	/**
	 * 培训信息编号
	 */
    private Integer tId;
    /**
     * 培训信息发布日期
     */
    private Date tDate;
    /**
     * 培训计划
     */
    private String tPlan;
    /**
     * 培训部门名称
     */
    private String dName;
    /**
     * 培训职位名称
     */
    private String pPosition;
    /**
     * 培训信息发布人
     */
    private String tMan;
    /**
     * 培训详情
     */
    private String tDesc;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public Date gettDate() {
        return tDate;
    }

    public void settDate(Date tDate) {
        this.tDate = tDate;
    }

    public String gettPlan() {
        return tPlan;
    }

    public void settPlan(String tPlan) {
        this.tPlan = tPlan == null ? null : tPlan.trim();
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public String getpPosition() {
        return pPosition;
    }

    public void setpPosition(String pPosition) {
        this.pPosition = pPosition == null ? null : pPosition.trim();
    }

    public String gettMan() {
        return tMan;
    }

    public void settMan(String tMan) {
        this.tMan = tMan == null ? null : tMan.trim();
    }

    public String gettDesc() {
        return tDesc;
    }

    public void settDesc(String tDesc) {
        this.tDesc = tDesc == null ? null : tDesc.trim();
    }

	@Override
	public String toString() {
		return "Training [tId=" + tId + ", tDate=" + tDate + ", tPlan=" + tPlan + ", dName=" + dName + ", pPosition="
				+ pPosition + ", tMan=" + tMan + ", tDesc=" + tDesc + "]";
	}
    
}