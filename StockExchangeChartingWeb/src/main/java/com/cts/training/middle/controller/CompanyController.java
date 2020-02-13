package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.training.bean.Company;
import com.cts.training.dao.CompanyDAO;

@Controller
public class CompanyController {

	@Autowired
	CompanyDAO companyDAO;

	@GetMapping("/company-home")
	public String userpage(Model model)

	{
		List<Company> companies = companyDAO.getAllCompanies();
		model.addAttribute("list", companies);
		model.addAttribute("company", new Company());

		return "company";

	}

	@PostMapping("/company/save")

	public String addcompany(@ModelAttribute("company") Company company) {
		companyDAO.saveOrUpdatCompany(company);
		return "redirect:/company-home";
	}

	@GetMapping("/delete/{id}")
	public String deleteuser(@PathVariable("id") int id) {
		Company company = companyDAO.getCompanyById(id);
		companyDAO.removeCompany(company);

		return "redirect:/company-home";
	}

	@GetMapping("/update1/{id}")
	public String updateUser(@PathVariable("id") int id, Model model) {
		Company company = companyDAO.getCompanyById(id);
		List<Company> company1 = companyDAO.getAllCompanies();
		model.addAttribute("list", company1);
		model.addAttribute("company", company);
		return "company";
	}
}
