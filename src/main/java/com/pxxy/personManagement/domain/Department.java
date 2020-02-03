package com.pxxy.personManagement.domain;

import java.util.List;

/**
 * 	部门信息表
 * @author 子江
 *
 */
public class Department {
	/**
	 * 部门编号
	 */
    private Integer dId;
    /**
     * 	部门名称
     */
    private String dName;
    /**
     * 	该部门下的所有职位
     */
    private List<Position> positions;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

	public List<Position> getPositions() {
		return positions;
	}

	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + ", positions=" + positions + "]";
	}
}