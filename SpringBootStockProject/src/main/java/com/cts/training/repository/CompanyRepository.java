package com.cts.training.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.model.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer>
{

   // List<Company> findById(long id);
}
