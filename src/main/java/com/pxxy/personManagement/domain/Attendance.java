package com.pxxy.personManagement.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonBackReference;
/**
 * 	考勤信息实体类
 * @author 子江
 *
 */
public class Attendance {
	/**
	 * 	考勤信息编号
	 */
    private Integer atId;
    /**
     * 	当前日期
     */
    private Date atDate;
    /**
     * 	员工编号对应实体
     */
    @JSONField(serialize=false)
    private Employee eId;
    /**
     * 	上班时间
     */
    private Date atSw;
    /**
     * 	下班时间
     */
    private Date atEw;
    /**
     * 	考核情况
     */
    private Integer atStatus;
    /**
     * 请假或病假等事情
     */
    private String atDesc;

    public Integer getAtId() {
        return atId;
    }

    public void setAtId(Integer atId) {
        this.atId = atId;
    }

    public Date getAtDate() {
        return atDate;
    }

    public void setAtDate(Date atDate) {
        this.atDate = atDate;
    }
	public Employee geteId() {
		return eId;
	}
	public void seteId(Employee eId) {
		this.eId = eId;
	}

	public Date getAtSw() {
        return atSw;
    }

    public void setAtSw(Date atSw) {
        this.atSw = atSw;
    }

    public Date getAtEw() {
        return atEw;
    }

    public void setAtEw(Date atEw) {
        this.atEw = atEw;
    }

	public Integer getAtStatus() {
		return atStatus;
	}

	public void setAtStatus(Integer atStatus) {
		this.atStatus = atStatus;
	}

	public String getAtDesc() {
		return atDesc;
	}

	public void setAtDesc(String atDesc) {
		this.atDesc = atDesc;
	}

	@Override
	public String toString() {
		return "Attendance [atId=" + atId + ", atDate=" + atDate + ", eId=" + eId + ", atSw=" + atSw + ", atEw=" + atEw
				+ ", atStatus=" + atStatus + ", atDesc=" + atDesc + "]";
	}

}