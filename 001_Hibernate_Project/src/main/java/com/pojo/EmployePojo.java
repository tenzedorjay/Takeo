package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="EMPLOYE")
public class EmployePojo{
	@Id
	@Column(name="EID")
	private int eid;
	@Column(name="ENAME")
	private String ename;
	@Column(name="EADDRESS")
	private String eaddress;
	public EmployePojo() {
		super();
		//TODO Auto-generated constructor stub
	}
	public EmployePojo(int eid, String ename, String eaddress) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	
}