package com.cts.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.models.Company;
import com.cts.project.repo.CompanyRepo;

@CrossOrigin("*")
@RestController
public class CompanyRestServiceController {
	@Autowired
	CompanyRepo cmp;
	
	@GetMapping("/company")
	public List<Company> findAll() {
		return cmp.findAll();
	}
	
	@GetMapping("/company/{id}")
	public Company findOne(@PathVariable int id) {
		Optional<Company> companyobj = cmp.findById(id);
		Company c = companyobj.get();
		return c;
	}
	
	@PostMapping("/company")
	public Company save(@RequestBody Company companyobj) {
		Company c = cmp.save(companyobj);
		return c;
	}
	
	@DeleteMapping("/company/{id}")
	public void delete(@PathVariable int id) {
		cmp.deleteById(id);
	}
	
	@PutMapping("/company")
	public Company update(@RequestBody Company companyobj) {
		Company c = cmp.save(companyobj);
		return c;
	}
}



