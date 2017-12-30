package com.miga.springboot.data.jpa.sample.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    public Product getProduct(long id) {
        return productRepository.findOne(id);
    }

    public void createProduct(Product product) {
        productRepository.save(product);
    }

    public void updateProduct(long id, Product newProduct) {
        Product product = productRepository.findOne(id);
        product.setName(newProduct.getName());
        product.setPrice(newProduct.getPrice());
        productRepository.save(product);
    }

    public void deleteProduct(long id) {
        productRepository.delete(id);
    }

    public void deleteAllProducts() {
        productRepository.deleteAll();
    }

}
