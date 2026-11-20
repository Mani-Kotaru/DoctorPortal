package com.collections;

public class Emp {
  
	private String dept;
	private String ename;
	 public Emp()
	 {
		 
	 }
	 public Emp(String dept, String ename) {
		super();
		this.dept = dept;
		this.ename = ename;
	 }
	 public String getDept() {
		 return dept;
	 }
	 public void setDept(String dept) {
		 this.dept = dept;
	 }
	 public String getEname() {
		 return ename;
	 }
	 public void setEname(String ename) {
		 this.ename = ename;
	 }
	 @Override
	 public String toString() {
		return "Emp [dept=" + dept + ", ename=" + ename + "]";
	 }
	 
	

	

}
