package com.pxxy.personManagement.domain;
/**
 * 	应聘信息实体类
 * @author 子江
 *
 */
public class Apply {
	/**
	 * 	应聘信息编号
	 */
    private Integer apId;
    /**
     *	 应聘者姓名
     */
    private String apName;
    /**
     * 	应聘者年龄
     */
    private String apAge;
    /**
     * 	应聘者性别
     */
    private String apGender;
    /**
     * 	应聘者学历
     */
    private String apEdu;
    /**
     * 	应聘者电话
     */
    private String apPhone;
    /**
     * 	应聘部门名称
     */
    private String dName;
    /**
     * 	应聘职位名称
     */
    private String pPosition;
    /**
     * 	应聘者工作经验
     */
    private String apExp;
    /**
     * 	投递的简历
     */
    private String apResume;
    /**
     * 	面试进度
     */
    private Integer iSche;
    /**
     * 	面试者身份证号
     */
    private String apNumber;

    public Integer getApId() {
        return apId;
    }

    public void setApId(Integer apId) {
        this.apId = apId;
    }

    public String getApName() {
        return apName;
    }

    public void setApName(String apName) {
        this.apName = apName == null ? null : apName.trim();
    }

    public String getApAge() {
        return apAge;
    }

    public void setApAge(String apAge) {
        this.apAge = apAge == null ? null : apAge.trim();
    }

    public String getApGender() {
        return apGender;
    }

    public void setApGender(String apGender) {
        this.apGender = apGender == null ? null : apGender.trim();
    }

    public String getApEdu() {
        return apEdu;
    }

    public void setApEdu(String apEdu) {
        this.apEdu = apEdu == null ? null : apEdu.trim();
    }

    public String getApPhone() {
        return apPhone;
    }

    public void setApPhone(String apPhone) {
        this.apPhone = apPhone == null ? null : apPhone.trim();
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

    public String getApResume() {
        return apResume;
    }

    public void setApResume(String apResume) {
        this.apResume = apResume == null ? null : apResume.trim();
    }

    public String getApExp() {
        return apExp;
    }

    public void setApExp(String apExp) {
        this.apExp = apExp == null ? null : apExp.trim();
    }

	public Integer getiSche() {
		return iSche;
	}

	public void setiSche(Integer iSche) {
		this.iSche = iSche;
	}

	public String getApNumber() {
		return apNumber;
	}

	public void setApNumber(String apNumber) {
		this.apNumber = apNumber;
	}

	@Override
	public String toString() {
		return "Apply [apId=" + apId + ", apName=" + apName + ", apAge=" + apAge + ", apGender=" + apGender + ", apEdu="
				+ apEdu + ", apPhone=" + apPhone + ", dName=" + dName + ", pPosition=" + pPosition + ", apExp=" + apExp
				+ ", apResume=" + apResume + ", iSche=" + iSche + ", apNumber=" + apNumber + "]";
	}
}