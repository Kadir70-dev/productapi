package com.kadir.productapi.repository;

import com.kadir.productapi.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, Long> {
    // You can add custom query methods here if needed
}
