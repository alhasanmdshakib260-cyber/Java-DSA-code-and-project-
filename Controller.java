package myagro.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import myagro.model.Product;
import myagro.repository.ProductRepository;

public class ProductController {

    private final ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product addProduct(@RequestBody Product product) {
        return repo.save(product);
    }
}