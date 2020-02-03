package com.pxxy.personManagement.domain;
/**
 * 人才信息实体类
 * @author 子江
 *
 */
public class Talent {
	/**
	 * 人才编号
	 */
    private Integer taId;
    /**
     * 员工编号对应实体类
     */
    private Employee eId;

    public Integer getTaId() {
        return taId;
    }

    public void setTaId(Integer taId) {
        this.taId = taId;
    }

	public Employee geteId() {
		return eId;
	}

	public void seteId(Employee eId) {
		this.eId = eId;
	}

	@Override
	public String toString() {
		return "Talent [taId=" + taId + ", eId=" + eId + "]";
	}

}