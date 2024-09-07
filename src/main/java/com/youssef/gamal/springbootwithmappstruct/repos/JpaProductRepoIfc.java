package com.youssef.gamal.springbootwithmappstruct.repos;

import com.youssef.gamal.springbootwithmappstruct.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductRepoIfc extends JpaRepository<Product,Long> {

}
