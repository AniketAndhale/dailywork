package com.cts.training.dao;

import java.util.List;

import com.cts.training.bean.Company;
import com.cts.training.bean.User;

public interface CompanyDAO {
	
	//public boolean saveCompany(Company company);
	
	//public boolean updateCompany(Company company);
	
	public boolean saveOrUpdatCompany(Company company);
	
	public boolean removeCompany(Company company);
	
	public Company getCompanyById(int id);
	
	public List<Company> getAllCompanies();

}
