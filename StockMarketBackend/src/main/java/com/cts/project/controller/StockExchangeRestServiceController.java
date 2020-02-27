//package com.cts.project.controller;
//
//public class StockExchangeRestServiceController {
//
//}

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


import com.cts.project.models.StockExchange;

import com.cts.project.repo.StockExchangeRepo;

@CrossOrigin("*")
@RestController
public class StockExchangeRestServiceController {
	@Autowired
	StockExchangeRepo se;
	
	@GetMapping("/stock")
	public List<StockExchange> findAll() {
		return se.findAll();
	}
	
	@GetMapping("/stock/{id}")
	public StockExchange findOne(@PathVariable int id) {
		Optional<StockExchange> stockobj = se.findById(id);
		StockExchange stb = stockobj.get();
		return stb;
	}
	
	@PostMapping("/stock")
	public StockExchange save(@RequestBody StockExchange stockobj) {
		StockExchange seb = se.save(stockobj);
		return seb;
	}
	
	@DeleteMapping("/stock/{id}")
	public void delete(@PathVariable int id) {
		se.deleteById(id);
	}
	
	@PutMapping("/stock")
	public StockExchange update(@RequestBody StockExchange stockobj) {
		StockExchange seb = se.save(stockobj);
		return seb;
	}
}



