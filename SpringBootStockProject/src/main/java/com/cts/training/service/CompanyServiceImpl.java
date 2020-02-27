package com.cts.training.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.model.Company;
import com.cts.training.repository.CompanyRepository;
import com.cts.training.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService{
	@Autowired	
	private CompanyRepository companyrepository;
	
	public List<Company> getAllCompany()
	 {
        List<Company> result = new ArrayList<Company>();
        Iterable<Company> companies = companyrepository.findAll();
        for (Company company : companies) {
            result.add(company);
        }
        return result;
    }

	
	public void addCompany(int id, String companyname, String sector, String ceo, String bod, double turnover) {
	
		Company company=new Company();		
		company.setId(id);
		company.setSector(sector);
		company.setCompanyname(companyname);
		company.setCeo(ceo);
		company.setBod(bod);
		company.setTurnover(3000.89);

	}
	
}

