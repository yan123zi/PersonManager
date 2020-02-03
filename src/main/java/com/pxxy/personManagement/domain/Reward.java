package com.pxxy.personManagement.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonBackReference;
/**
 * 奖惩信息实体类
 * @author 子江
 *
 */
public class Reward {
	/**
	 * 奖惩编号
	 */
    private Integer reRepuid;
    /**
     * 员工编号实体类
     */
    @JSONField(serialize=false)
    private Employee eId;
    /**
     * 所获奖励
     */
    private Integer reReward;
    /**
     * 奖励日期
     */
    private Date reRedate;
    /**
     * 奖励理由
     */
    private String reRereson;
    /**
     * 所获处罚
     */
    private Integer rePunish;
    /**
     * 处罚日期
     */
    private Date rePudate;
    /**
     * 处罚原因
     */
    private String rePureson;
    /**
     * 奖惩发布时间
     */
    private Date reDate;

    public Integer getReRepuid() {
        return reRepuid;
    }

    public void setReRepuid(Integer reRepuid) {
        this.reRepuid = reRepuid;
    }
    @JsonBackReference
    public Employee geteId() {
		return eId;
	}
    @JsonBackReference
	public void seteId(Employee eId) {
		this.eId = eId;
	}

    public Date getReRedate() {
        return reRedate;
    }

    public void setReRedate(Date reRedate) {
        this.reRedate = reRedate;
    }

    public String getReRereson() {
        return reRereson;
    }

    public void setReRereson(String reRereson) {
        this.reRereson = reRereson == null ? null : reRereson.trim();
    }

    public Date getRePudate() {
        return rePudate;
    }

    public void setRePudate(Date rePudate) {
        this.rePudate = rePudate;
    }

    public String getRePureson() {
        return rePureson;
    }

    public void setRePureson(String rePureson) {
        this.rePureson = rePureson == null ? null : rePureson.trim();
    }

    public Date getReDate() {
        return reDate;
    }

    public void setReDate(Date reDate) {
        this.reDate = reDate;
    }

	public Integer getReReward() {
		return reReward;
	}

	public void setReReward(Integer reReward) {
		this.reReward = reReward;
	}

	public Integer getRePunish() {
		return rePunish;
	}

	public void setRePunish(Integer rePunish) {
		this.rePunish = rePunish;
	}

	@Override
	public String toString() {
		return "Reward [reRepuid=" + reRepuid + ", eId=" + eId + ", reReward=" + reReward + ", reRedate=" + reRedate
				+ ", reRereson=" + reRereson + ", rePunish=" + rePunish + ", rePudate=" + rePudate + ", rePureson="
				+ rePureson + ", reDate=" + reDate + "]";
	}

}