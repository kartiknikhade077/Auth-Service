package com.smart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ModuleAccess {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int moduleAccessId;
	private int companyId;
	private int employeeId;
	private boolean leadAccess;
	private boolean template;
	private boolean email;
	
	public ModuleAccess(int moduleAccessId, int companyId, int employeeId, boolean lead, boolean template,
			boolean email) {
		super();
		this.moduleAccessId = moduleAccessId;
		this.companyId = companyId;
		this.employeeId = employeeId;
		this.leadAccess = lead;
		this.template = template;
		this.email = email;
	}
	
	

	public ModuleAccess() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getModuleAccessId() {
		return moduleAccessId;
	}

	public void setModuleAccessId(int moduleAccessId) {
		this.moduleAccessId = moduleAccessId;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public boolean isLeadAccess() {
		return leadAccess;
	}


	public void setLeadAccess(boolean leadAccess) {
		this.leadAccess = leadAccess;
	}



	public boolean isTemplate() {
		return template;
	}

	public void setTemplate(boolean template) {
		this.template = template;
	}

	public boolean isEmail() {
		return email;
	}

	public void setEmail(boolean email) {
		this.email = email;
	}
	
	
	
	
	
	
	

}
