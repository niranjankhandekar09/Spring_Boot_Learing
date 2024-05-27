package com.productdemo.service;

import com.productdemo.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product addProduct(Product product);
    Optional<Product> getProductById(Integer id);
    List<Product> getAllProducts();
    Product updateProduct(Integer id,Product product);
    void deleteProduct(Integer id);
}
