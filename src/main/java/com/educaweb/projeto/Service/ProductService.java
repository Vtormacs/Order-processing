package com.educaweb.projeto.Service;

import com.educaweb.projeto.Entity.Product;
import com.educaweb.projeto.Entity.User;
import com.educaweb.projeto.Repository.ProductRepository;
import com.educaweb.projeto.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return this.productRepository.findById(id).get();
    }
}
