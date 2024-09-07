package com.youssef.gamal.springbootwithmappstruct.repos;

import java.util.NoSuchElementException;

import com.youssef.gamal.springbootwithmappstruct.entities.Product;

public interface ProductRepoIfc {
    Product save(Product Product);

	Product findById(Long id) throws NoSuchElementException;
}
