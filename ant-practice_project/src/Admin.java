package com.tcs.otas.model;


/**
 * Admin is a model class 
 * This class Initializes the Admin variables using setters
 * 
 * 
 * @author 529100
 * @version version1
 * @class Admin
 * @creation 15-11-11
 * @history
*/
public class Admin {
	
	private String adminId;
	private String adminName;
	private int age;
	private String sex;
	private long phoneNo;
	private String email;
	private String address;
	
	//Getters and Setters
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAdminid() {
		return adminId;
	}
	public void setAdminid(String adminid) {
		this.adminId = adminid;
	}
	public String getAdminname() {
		return adminName;
	}
	public void setAdminname(String adminname) {
		this.adminName = adminname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public long getPhoneno() {
		return phoneNo;
	}
	public void setPhoneno(long phoneno) {
		this.phoneNo = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
