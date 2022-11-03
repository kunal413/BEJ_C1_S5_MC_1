package com.bej.customerservice.product.services;

import com.bej.customerservice.product.demain.Product;
import com.bej.customerservice.product.repositroy.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productServiceImpl implements ProductServices {
  ProductRepository productRepository;
  public productServiceImpl(ProductRepository productRepository){
    this .productRepository= productRepository;

  }
  @Override
  public Product addProduct(Product product){
    return productRepository.save(product);
  }
  @Override
  public List<Product> getProduct(){
    return (List<Product>) productRepository.findAll();
  }
}
