package com.smart.dto;

public class UserDto {

	private String jwtToken;
	private int id;
	private String name;
	private String email;
	private String role;
	private boolean enabled;
	private int companyId;
	
	//ModuleAccess Parameter
	
	private boolean leadAccess;
	private boolean templateAccess;
	private boolean emailAccess;

	

	public UserDto() {
		super();
	}

	// for Employee
	public UserDto(int id, String name, String email, String role, boolean enabled, int companyId, String jwtToken,boolean leadAccess, boolean templateAccess, boolean emailAccess) {
		
		
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.role = role;
		this.enabled = enabled;
		this.companyId = companyId;

		this.jwtToken = jwtToken;
		this.leadAccess = leadAccess;
		this.templateAccess = templateAccess;
		this.emailAccess = emailAccess;

	}
	

	// for Company
	public UserDto(int id,int companyId, String name, String email, String role, boolean enabled,String jwtToken,boolean leadAccess, boolean templateAccess, boolean emailAccess) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.role = role;
		this.enabled = enabled;
		this.jwtToken = jwtToken;
		this.leadAccess = leadAccess;
		this.templateAccess = templateAccess;
		this.emailAccess = emailAccess;
		this.companyId=companyId;

	}

	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
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

	

}
