package com.pxxy.personManagement.domain;
/**
 * 面试信息表
 * @author 子江
 *
 */
public class Interview {
	/**
	 * 面试信息编号
	 */
    private Integer iId;
    /**
     * 应聘编号对应实体类
     */
    private Apply apId;
    /**
     * 面试人名称
     */
    private String iMan;
    /**
     * 面试人电话
     */
    private String iPhone;
    /**
     * 面试信息
     */
    private String iMessage;

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public Apply getApId() {
		return apId;
	}

	public void setApId(Apply apId) {
		this.apId = apId;
	}

	public String getiMan() {
        return iMan;
    }

    public void setiMan(String iMan) {
        this.iMan = iMan == null ? null : iMan.trim();
    }

    public String getiPhone() {
        return iPhone;
    }

    public void setiPhone(String iPhone) {
        this.iPhone = iPhone == null ? null : iPhone.trim();
    }

    public String getiMessage() {
        return iMessage;
    }

    public void setiMessage(String iMessage) {
        this.iMessage = iMessage == null ? null : iMessage.trim();
    }

	@Override
	public String toString() {
		return "Interview [iId=" + iId + ", apId=" + apId + ", iMan=" + iMan + ", iPhone=" + iPhone + ", iMessage="
				+ iMessage + "]";
	}
}