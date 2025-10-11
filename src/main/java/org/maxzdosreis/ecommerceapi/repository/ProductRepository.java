package org.maxzdosreis.ecommerceapi.repository;

import org.maxzdosreis.ecommerceapi.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {}
