package com.bej.customerservice.product.controller;

import com.bej.customerservice.product.demain.Product;
import com.bej.customerservice.product.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/v1/")
public class ProductController {
    ProductServices productServices;
    @Autowired
    public ProductController(ProductServices productServices){
        this.productServices=productServices;
    }
    @PostMapping("/product")
    public ResponseEntity<?>insertProduct(@RequestBody Product product){
        return new ResponseEntity<>(productServices.addProduct(product), HttpStatus.CREATED);
    }
}
