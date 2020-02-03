package com.pxxy.personManagement.domain;

import java.util.Date;
/**
 * 招聘信息发布实体类
 * @author 子江
 *
 */
public class Recruitment {
	/**
	 * 招聘信息编号
	 */
    private Integer rId;
    /**
     * 招聘信息发布时间
     */
    private Date rTime;
    /**
     * 招聘部门名称
     */
    private String dName;
    /**
     * 招聘职位名称
     */
    private String pPosition;
    /**
     * 招聘人数
     */
    private String rNumber;
    /**
     * 招聘信息标题
     */
    private String rTitle;
    /**
     * 月工资定义
     */
    private Integer rSalary;
    /**
     * 要求学历
     */
    private String rEdu;
    /**
     * 工作经验
     */
    private String rExp;
    /**
     * 职位描述
     */
    private String rContent;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Date getrTime() {
        return rTime;
    }

    public void setrTime(Date rTime) {
        this.rTime = rTime;
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

    public String getrNumber() {
        return rNumber;
    }

    public void setrNumber(String rNumber) {
        this.rNumber = rNumber == null ? null : rNumber.trim();
    }

    public String getrTitle() {
        return rTitle;
    }

    public void setrTitle(String rTitle) {
        this.rTitle = rTitle == null ? null : rTitle.trim();
    }

    public Integer getrSalary() {
        return rSalary;
    }

    public void setrSalary(Integer rSalary) {
        this.rSalary = rSalary;
    }

    public String getrEdu() {
        return rEdu;
    }

    public void setrEdu(String rEdu) {
        this.rEdu = rEdu == null ? null : rEdu.trim();
    }

    public String getrExp() {
        return rExp;
    }

    public void setrExp(String rExp) {
        this.rExp = rExp == null ? null : rExp.trim();
    }

    public String getrContent() {
        return rContent;
    }

    public void setrContent(String rContent) {
        this.rContent = rContent == null ? null : rContent.trim();
    }

	@Override
	public String toString() {
		return "Recruitment [rId=" + rId + ", rTime=" + rTime + ", dName=" + dName + ", pPosition=" + pPosition
				+ ", rNumber=" + rNumber + ", rTitle=" + rTitle + ", rSalary=" + rSalary + ", rEdu=" + rEdu + ", rExp="
				+ rExp + ", rContent=" + rContent + "]";
	}
    
}