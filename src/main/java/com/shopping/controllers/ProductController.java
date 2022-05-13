package com.shopping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.shopping.dal.adapter.ProductService;
import com.shopping.dal.model.Product;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*",exposedHeaders = "*")
@RestController
@RequestMapping("/api/product/seller")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add-product")
    //@PreAuthorize("hasRole('SELLER')")
    public void add(@RequestBody Product product) {
        productService.add(product);
    }

    @DeleteMapping("/delete-product/{id}")
   //@PreAuthorize("hasRole('SELLER')")
    public void delete(@PathVariable("id") String id) {
        productService.delete(id);
    }

    @GetMapping("/get-all-product")
   //@PreAuthorize("hasRole('SELLER')")
    public List<Product> list() {
        return productService.listAll();
    }

    @PutMapping("/update-product")
   //@PreAuthorize("hasRole('SELLER')")
    public void update(@RequestBody Product product) {
        productService.update(product);
    }

}
