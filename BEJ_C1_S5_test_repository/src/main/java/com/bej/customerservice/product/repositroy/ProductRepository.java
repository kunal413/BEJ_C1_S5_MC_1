package com.bej.customerservice.product.repositroy;

import com.bej.customerservice.product.demain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {
}
