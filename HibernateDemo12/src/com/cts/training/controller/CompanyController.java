package com.cts.training.controller;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.dao.CompanyDAO;
import com.cts.training.dao.impl.CompanyDAOImpl;
import com.cts.training.model.Company;
import com.cts.training.model.StockExchange;
import com.cts.training.model.Company;
public class CompanyController {
	public static void main(String[] args) {

		Company company=new Company(101, "name", "sector", "ceoName", 120000.00, "jjjj", "hhh", true);

		CompanyDAO companyDAO = new CompanyDAOImpl();

		boolean status = companyDAO.saveCompany(company);
		if (status) {
			System.out.println("company Saved Successfully");
		} else {
			System.out.println("Try Again");
		}

	}

}
