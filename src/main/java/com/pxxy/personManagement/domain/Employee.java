package com.pxxy.personManagement.domain;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * 	员工信息实体类
 * @author 子江
 *
 */
public class Employee {
	/**
	 * 	员工编号
	 */
    private Integer eId;
    /**
     * 	职位编号对应实体类
     */
    private Position position;
    /**
     * 	员工姓名
     */
    private String eName;
    /**
     * 	员工性别
     */
    private String eGender;
    /**
     * 	员工年龄
     */
    private String eAge;
    /**
     * 	员工电话号码
     */
    private String ePhone;
    /**
     * 	员工登录密码
     */
    private String ePassword;
    /**
     * 	员工出生日期
     */
    private Date eBorn;
    /**
     * 	是否在职，0为离职，1位在职
     */
    private Integer eIfwork;
    /**
     * 	入职时间
     */
    private Date eBegin;
    /**
     * 	员工学历
     */
    private String eEdu;
    /**
     * 	员工身份证号码
     */
    private String eNumber;
    /**
     * 	员工居住地址
     */
    private String eAddress;
    /**
     * 	员工图片
     */
    private String eImage;
    /**
     * 	员工邮箱
     */
    private String eEmail;
    /**
     * 	员工政治面貌
     */
    private String ePolitical;
    /**
     * 是否人才
     */
    private Integer eIftalent;
    /**
     * 薪酬信息实体类
     */
    @JSONField(serialize=false)
    private Salary sId;
    /**
     * 考勤信息集合
     *//*
    private List<Attendance> attens;
    *//**
     * 奖惩信息集合
     *//*
    private List<Reward> rews;*/
    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName == null ? null : eName.trim();
    }

    public String geteGender() {
        return eGender;
    }

    public void seteGender(String eGender) {
        this.eGender = eGender == null ? null : eGender.trim();
    }

    public String geteAge() {
        return eAge;
    }

    public void seteAge(String eAge) {
        this.eAge = eAge == null ? null : eAge.trim();
    }

    public String getePhone() {
        return ePhone;
    }

    public void setePhone(String ePhone) {
        this.ePhone = ePhone == null ? null : ePhone.trim();
    }

    public String getePassword() {
        return ePassword;
    }

    public void setePassword(String ePassword) {
        this.ePassword = ePassword == null ? null : ePassword.trim();
    }

    public Date geteBorn() {
        return eBorn;
    }

    public void seteBorn(Date eBorn) {
        this.eBorn = eBorn;
    }

    public Integer geteIfwork() {
        return eIfwork;
    }

    public void seteIfwork(Integer eIfwork) {
        this.eIfwork = eIfwork;
    }

    public Date geteBegin() {
        return eBegin;
    }

    public void seteBegin(Date eBegin) {
        this.eBegin = eBegin;
    }

    public String geteEdu() {
        return eEdu;
    }

    public void seteEdu(String eEdu) {
        this.eEdu = eEdu == null ? null : eEdu.trim();
    }

    public String geteNumber() {
        return eNumber;
    }

    public void seteNumber(String eNumber) {
        this.eNumber = eNumber == null ? null : eNumber.trim();
    }

    public String geteAddress() {
        return eAddress;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress == null ? null : eAddress.trim();
    }

    public String geteImage() {
        return eImage;
    }

    public void seteImage(String eImage) {
        this.eImage = eImage == null ? null : eImage.trim();
    }

    public String geteEmail() {
        return eEmail;
    }

    public void seteEmail(String eEmail) {
        this.eEmail = eEmail == null ? null : eEmail.trim();
    }

    public String getePolitical() {
        return ePolitical;
    }

    public void setePolitical(String ePolitical) {
        this.ePolitical = ePolitical == null ? null : ePolitical.trim();
    }

	public Integer geteIftalent() {
		return eIftalent;
	}

	public void seteIftalent(Integer eIftalent) {
		this.eIftalent = eIftalent;
	}
	public Salary getsId() {
		return sId;
	}
	@JsonBackReference
	public void setsId(Salary sId) {
		this.sId = sId;
	}

}