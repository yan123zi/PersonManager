package com.pxxy.personManagement.domain;

public class Contract {
    private Integer cId;

    private Employee eId;

    private String cAname;

    private String cBname;

    private String cAaddress;

    private String cBaddress;

    private String cBnumber;

    private String cBposition;

    private String cContent;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Employee geteId() {
		return eId;
	}

	public void seteId(Employee eId) {
		this.eId = eId;
	}

	public String getcAname() {
        return cAname;
    }

    public void setcAname(String cAname) {
        this.cAname = cAname == null ? null : cAname.trim();
    }

    public String getcBname() {
        return cBname;
    }

    public void setcBname(String cBname) {
        this.cBname = cBname == null ? null : cBname.trim();
    }

    public String getcAaddress() {
        return cAaddress;
    }

    public void setcAaddress(String cAaddress) {
        this.cAaddress = cAaddress == null ? null : cAaddress.trim();
    }

    public String getcBaddress() {
        return cBaddress;
    }

    public void setcBaddress(String cBaddress) {
        this.cBaddress = cBaddress == null ? null : cBaddress.trim();
    }

    public String getcBnumber() {
        return cBnumber;
    }

    public void setcBnumber(String cBnumber) {
        this.cBnumber = cBnumber == null ? null : cBnumber.trim();
    }

    public String getcBposition() {
        return cBposition;
    }

    public void setcBposition(String cBposition) {
        this.cBposition = cBposition == null ? null : cBposition.trim();
    }

    public String getcContent() {
        return cContent;
    }

    public void setcContent(String cContent) {
        this.cContent = cContent == null ? null : cContent.trim();
    }

	@Override
	public String toString() {
		return "Contract [cId=" + cId + ", eId=" + eId + ", cAname=" + cAname + ", cBname=" + cBname + ", cAaddress="
				+ cAaddress + ", cBaddress=" + cBaddress + ", cBnumber=" + cBnumber + ", cBposition=" + cBposition
				+ ", cContent=" + cContent + "]";
	}
    
}