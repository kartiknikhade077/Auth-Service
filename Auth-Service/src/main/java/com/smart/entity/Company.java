package com.smart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class Company {
	

	
	private int companyId;
	private int userId;
	private String compnayName;
	private String companyEmail;
	private String companyDescription;
	public Company(int companyId, int userId, String compnayName, String companyEmail, String companyDescription) {
		super();
		this.companyId = companyId;
		this.userId = userId;
		this.compnayName = compnayName;
		this.companyEmail = companyEmail;
		this.companyDescription = companyDescription;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCompnayName() {
		return compnayName;
	}
	public void setCompnayName(String compnayName) {
		this.compnayName = compnayName;
	}
	public String getCompanyEmail() {
		return companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public String getCompanyDescription() {
		return companyDescription;
	}
	public void setCompanyDescription(String companyDescription) {
		this.companyDescription = companyDescription;
	}
	
	

}
