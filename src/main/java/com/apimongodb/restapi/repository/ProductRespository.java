package com.apimongodb.restapi.repository;

import com.apimongodb.restapi.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRespository extends MongoRepository<Product, Integer> {
}
