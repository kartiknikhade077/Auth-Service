package com.smart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smart.dto.CompanyDto;
import com.smart.entity.Company;

public interface CompanyRepository  extends JpaRepository<Company, Integer>{

	@Query(value = """
		    SELECT
		        c.compnay_name AS companyName,
		        c.company_id AS companyId,
		        c.company_email AS email,
		        c.company_description AS desciption,
		        m.lead_access AS leadAccess,
		        m.template AS tempalteAccess,
		        m.email AS emailAccess
		    FROM company c
		    JOIN module_access m ON c.company_id = m.company_id
		    WHERE c.company_email = :email and m.employee_id=0
		""", nativeQuery = true)
		CompanyDto findCompanyDtoByEmail(@Param("email") String email);

}
