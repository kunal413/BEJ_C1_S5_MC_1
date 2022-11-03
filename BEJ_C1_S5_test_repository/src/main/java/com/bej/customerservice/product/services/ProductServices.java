package com.bej.customerservice.product.services;

import com.bej.customerservice.product.demain.Product;

import java.util.List;

public interface ProductServices {
    public Product addProduct(Product product);
    public List<Product> getProduct();
}
