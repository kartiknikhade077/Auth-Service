package com.smart.dto;

public class CompanyDto {
	
	private String  companyName;
	private int companyId;
	private String email;
	private String password;
	private String desciption;
	private boolean leadAccess;
	private boolean tempalteAccess;
	private boolean emailAccess;

	
	
	
	public CompanyDto(String companyName, int companyId, String email, String password, String desciption,
			boolean leadAccess, boolean tempalteAccess, boolean emailAccess) {
		super();
		this.companyName = companyName;
		this.companyId = companyId;
		this.email = email;
		this.password = password;
		this.desciption = desciption;
		this.leadAccess = leadAccess;
		this.tempalteAccess = tempalteAccess;
		this.emailAccess = emailAccess;
	}


	//Company Login DTO

	public CompanyDto(String companyName, int companyId, String email, String desciption, boolean leadAccess,
			boolean tempalteAccess, boolean emailAccess) {
		this.companyName = companyName;
		this.companyId = companyId;
		this.email = email;
		this.desciption = desciption;
		this.leadAccess = leadAccess;
		this.tempalteAccess = tempalteAccess;
		this.emailAccess = emailAccess;
	}



	public CompanyDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	public boolean isLeadAccess() {
		return leadAccess;
	}
	public void setLeadAccess(boolean leadAccess) {
		this.leadAccess = leadAccess;
	}
	public boolean isTempalteAccess() {
		return tempalteAccess;
	}
	public void setTempalteAccess(boolean tempalteAccess) {
		this.tempalteAccess = tempalteAccess;
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
	
	
	
	

}
