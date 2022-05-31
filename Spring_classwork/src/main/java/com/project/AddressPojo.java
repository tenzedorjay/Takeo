package com.project;

public class AddressPojo {
private int Sid;
private String Sname;
private EmployeePojo emp;
public int getSid() {
	return Sid;
}
public void setSid(int sid) {
	Sid = sid;
}
public String getSname() {
	return Sname;
}
public void setSname(String sname) {
	Sname = sname;
}
public EmployeePojo getEmp() {
	return emp;
}
public void setEmp(EmployeePojo emp) {
	this.emp = emp;
}
}
