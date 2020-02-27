package com.cts.training.service;

import java.util.List;

import com.cts.training.model.Company;

public interface CompanyService {
	public List<Company> getAllCompany();
	public void addCompany(int id,String companyname,String sector,String ceo,String bod,double turnover);
}
