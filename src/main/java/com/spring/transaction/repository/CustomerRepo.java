package com.spring.transaction.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.spring.transaction.model.Customer;

public interface CustomerRepo extends PagingAndSortingRepository<Customer, Long> {

	@Query("select cu from Customer cu where LOWER(cu.email) = LOWER(:email)")
	Customer findByEmailCaseInsensitive(@Param("email") String email);
}
