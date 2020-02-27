
package com.cts.project.restresource;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cts.project.models.CompareCompany;


@RepositoryRestResource(path = "comparecompany", collectionResourceRel = "comparecompany")
public interface CompareCompanyRestResource extends PagingAndSortingRepository<CompareCompany, Integer>{

}
