package com.pxxy.personManagement.domain;
/**
 * 	职位信息实体类
 * @author 子江
 *
 */
public class Position {
	/**
	 * 	职位编号
	 */
    private Integer pId;
    /**
     * 	部门编号对应实体类
     */
    private Department department;
    /**
     * 	职位名称
     */
    private String pName;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

	@Override
	public String toString() {
		return "Position [pId=" + pId + ", department=" + department + ", pName=" + pName + "]";
	}
}