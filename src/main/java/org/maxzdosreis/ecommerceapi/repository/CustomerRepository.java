package org.maxzdosreis.ecommerceapi.repository;

import org.maxzdosreis.ecommerceapi.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {}
