package com.miga.springboot.restapi.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("product/{id}")
    public Product getProdcut(@PathVariable long id) {
        return productService.getProduct(id);
    }

    @PostMapping("product/add")
    public void addProdcut(@RequestParam String name, @RequestParam int price) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        productService.addproduct(product);
    }

}
