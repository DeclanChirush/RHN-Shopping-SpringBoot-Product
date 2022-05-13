package com.shopping.dal.adapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.dal.model.Product;
import com.shopping.dal.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void add(Product product) {
        productRepository.save(product);
    }

    public void delete(String id) {
        productRepository.deleteById(id);
    }

    public List<Product> listAll() {
        return productRepository.findAll();
    }

    public void update(Product product) {
        productRepository.save(product);
    }
    
    public Product getById(String id) {
    	return productRepository.findById(id).get();
    }
}
