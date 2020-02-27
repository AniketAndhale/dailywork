
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

import com.cts.project.models.CompareCompany;
import com.cts.project.repo.CompareCompanyRepo;


@CrossOrigin("*")
@RestController
public class  CompareCompanyRestServiceController {
	@Autowired
	CompareCompanyRepo cmp;
	
	@GetMapping("/comparecompany")
	public List<CompareCompany> findAll() {
		return cmp.findAll();
	}
	
	@GetMapping("/comparecompany/{id}")
	public CompareCompany findOne(@PathVariable int id) {
		Optional<CompareCompany> companyobj = cmp.findById(id);
		CompareCompany c = companyobj.get();
		return c;
	}
	
	@PostMapping("/comparecompany")
	public CompareCompany save(@RequestBody CompareCompany companyobj) {
		CompareCompany c = cmp.save(companyobj);
		return c;
	}
	
	@DeleteMapping("/comparecompany/{id}")
	public void delete(@PathVariable int id) {
		cmp.deleteById(id);
	}
	
	@PutMapping("/comparecompany")
	public CompareCompany update(@RequestBody CompareCompany companyobj) {
		CompareCompany c = cmp.save(companyobj);
		return c;
	}
}



