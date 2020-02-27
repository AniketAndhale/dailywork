package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import com.cts.training.model.Company;
import com.cts.training.service.CompanyService;
import com.cts.training.service.CompanyServiceImpl;

@SpringBootApplication
public class SpringBootStockProjectApplication implements CommandLineRunner {

	@Autowired
	CompanyService ser;
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootStockProjectApplication.class, args);
		
	}

		
	@Override
	public void run(String... args) throws Exception {
		ser.addCompany(1, "jklj", "dsds", "fd","ds",2900.90D);
		
	}
}
