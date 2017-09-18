package com.miga.springboot.restapi.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("product/{id}")
    public Product getProdcut(@PathVariable("id") long id) {
        return productService.getProduct(id);
    }

    @PostMapping("product")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody Product product) {
        productService.createProduct(product);
    }

    @PutMapping("product/{id}")
    public void updateProdcut(@PathVariable("id") long id, @RequestBody Product product) {
        productService.updateProduct(id, product);
    }

    @DeleteMapping("product/{id}")
    public void deleteProduct(@PathVariable("id") long id) {
        productService.deleteProduct(id);
    }

    @DeleteMapping("product")
    public void deleteAllProducts() {
        productService.deleteAllProducts();
    }

}
