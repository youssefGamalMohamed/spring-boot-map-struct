package com.youssef.gamal.springbootwithmappstruct.services;

import java.util.NoSuchElementException;

import com.youssef.gamal.springbootwithmappstruct.entities.Product;


public interface ProductServiceIfc {
    Product save(Product category);

    Product findById(Long id) throws NoSuchElementException;
}
