package com.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String sname;
	private String scity;
	private String smail;
	private String snumber;
	@Column(columnDefinition = "double(5,2)")
	private Double spercentage;
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", smail=" + smail + ", snumber="
				+ snumber + ", spercentage=" + spercentage + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	public String getSmail() {
		return smail;
	}
	public void setSmail(String smail) {
		this.smail = smail;
	}
	public String getSnumber() {
		return snumber;
	}
	public void setSnumber(String snumber) {
		this.snumber = snumber;
	}
	public Double getSpercentage() {
		return spercentage;
	}
	public void setSpercentage(Double spercentage) {
		this.spercentage = spercentage;
	}
	
	
	
	
	
}
