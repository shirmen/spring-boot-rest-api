package com.miga.springboot.restapi.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts() {
        return (List<Product>) productRepository.findAll();
    }

    public Product getProduct(long id) {
        return productRepository.findOne(id);
    }

    public void addproduct(Product product) {
        productRepository.save(product);
    }
}
