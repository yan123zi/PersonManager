package com.pxxy.personManagement.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * 	工资信息实体类
 * @author 子江
 *
 */
public class Salary {
	/**
	 * 薪酬编号
	 */
	private Integer sId;
	/**
	 * 	员工编号对应实体类
	 */
	@JSONField(serialize=false)
    private Employee eId;
    /**
     * 	基本工资
     */
    private Double sSalary;
    /**
     * 	社保金额
     */
    private Double sSocial;
    /**
     * 	补贴金额
     */
    private Double sSubsidy;
    /**
     * 	最终工资
     */
    private Double sFinal;
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public Double getsSalary() {
		return sSalary;
	}
	public void setsSalary(Double sSalary) {
		this.sSalary = sSalary;
	}
	public Double getsSocial() {
		return sSocial;
	}
	public void setsSocial(Double sSocial) {
		this.sSocial = sSocial;
	}
	public Double getsSubsidy() {
		return sSubsidy;
	}
	public void setsSubsidy(Double sSubsidy) {
		this.sSubsidy = sSubsidy;
	}
	public Double getsFinal() {
		return sFinal;
	}
	public void setsFinal(Double sFinal) {
		this.sFinal = sFinal;
	}
	public Employee geteId() {
		return eId;
	}
	public void seteId(Employee eId) {
		this.eId = eId;
	}
	@Override
	public String toString() {
		return "Salary [sId=" + sId + ", eId=" + eId + ", sSalary=" + sSalary + ", sSocial=" + sSocial + ", sSubsidy="
				+ sSubsidy + ", sFinal=" + sFinal + "]";
	}
}