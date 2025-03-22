package com.apimongodb.restapi.service;

import com.apimongodb.restapi.domain.Product;
import com.apimongodb.restapi.domain.model.CrudService;
import com.apimongodb.restapi.repository.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Collection;
import java.util.List;

@Service
public class ProductService implements CrudService<Product> {
    @Autowired
    ProductRespository repository;

    @Override
    public void create(Product product) {
        repository.save(product);
    }

    @Override
    public void update(String id, Product product) {
    }

    @Override
    public void delete(String id) {
    }

    @Override
    public Collection<Product> getItem() {
        return null;
    }

    @Override
    public List<Product> getAllItems() {
        return repository.findAll();
    }


}
