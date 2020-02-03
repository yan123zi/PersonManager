package com.pxxy.personManagement.domain;

import java.util.Date;
/**
 * 	离职信息实体类
 * @author 子江
 *
 */
public class Leaveinfo {
	/**
	 * 	员工编号对应实体类
	 */
    private Employee employee;
    /**
     * 	甲方名称
     */
    private String lAname;
    /**
     * 	乙方名称
     */
    private String lBname;
    /**
     * 	曾任职务
     */
    private String lJob;
    /**
     * 	在职时间
     */
    private String lIntime;
    /**
     * 	身份证号
     */
    private String lNumber;
    /**
     * 	离职日期
     */
    private Date lLevtime; 
    /**
     * 	离职内容
     */
    private String lContent;
    
    public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getlAname() {
        return lAname;
    }

    public void setlAname(String lAname) {
        this.lAname = lAname == null ? null : lAname.trim();
    }

    public String getlBname() {
        return lBname;
    }

    public void setlBname(String lBname) {
        this.lBname = lBname == null ? null : lBname.trim();
    }

    public String getlJob() {
        return lJob;
    }

    public void setlJob(String lJob) {
        this.lJob = lJob == null ? null : lJob.trim();
    }

    public String getlIntime() {
        return lIntime;
    }

    public void setlIntime(String lIntime) {
        this.lIntime = lIntime == null ? null : lIntime.trim();
    }

    public String getlNumber() {
        return lNumber;
    }

    public void setlNumber(String lNumber) {
        this.lNumber = lNumber == null ? null : lNumber.trim();
    }

    public Date getlLevtime() {
        return lLevtime;
    }

    public void setlLevtime(Date lLevtime) {
        this.lLevtime = lLevtime;
    }

    public String getlContent() {
        return lContent;
    }

    public void setlContent(String lContent) {
        this.lContent = lContent == null ? null : lContent.trim();
    }

	@Override
	public String toString() {
		return "Leaveinfo [employee=" + employee + ", lAname=" + lAname + ", lBname=" + lBname + ", lJob=" + lJob
				+ ", lIntime=" + lIntime + ", lNumber=" + lNumber + ", lLevtime=" + lLevtime + ", lContent=" + lContent
				+ "]";
	}
}