package com.smart.dto;

import jakarta.persistence.Column;

public class EmployeeDto {
	
	private int employeeId;
	private int userId;
	private int companyId;
	private String Name;
	private String email;
	private String password;
	private String phone;
	@Column(length = 5000)
	private String description;
	private String department;
	private String gender;
	
	//access module
	
	private boolean leadAccess;
	private boolean templateAccess;
	private boolean emailAccess;
	public EmployeeDto(int employeeId,int companyId, int userId, String name, String email, String phone, String description,
			String department, String gender, boolean leadAccess, boolean templateAccess, boolean emailAccess,String password) {
		super();
		this.employeeId = employeeId;
		this.userId = userId;
		Name = name;
		this.email = email;
		this.phone = phone;
		this.description = description;
		this.department = department;
		this.gender = gender;
		this.leadAccess = leadAccess;
		this.templateAccess = templateAccess;
		this.emailAccess = emailAccess;
		this.companyId=companyId;
		this.password=password;
	}
	public EmployeeDto(int employeeId,int companyId, int userId, String name, String email, String phone, String description,
			String department, String gender, boolean leadAccess, boolean templateAccess, boolean emailAccess) {
		super();
		this.employeeId = employeeId;
		this.userId = userId;
		Name = name;
		this.email = email;
		this.phone = phone;
		this.description = description;
		this.department = department;
		this.gender = gender;
		this.leadAccess = leadAccess;
		this.templateAccess = templateAccess;
		this.emailAccess = emailAccess;
		this.companyId=companyId;
		
	}
	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isLeadAccess() {
		return leadAccess;
	}
	public void setLeadAccess(boolean leadAccess) {
		this.leadAccess = leadAccess;
	}
	public boolean isTemplateAccess() {
		return templateAccess;
	}
	public void setTemplateAccess(boolean templateAccess) {
		this.templateAccess = templateAccess;
	}
	public boolean isEmailAccess() {
		return emailAccess;
	}
	public void setEmailAccess(boolean emailAccess) {
		this.emailAccess = emailAccess;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
