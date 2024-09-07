package com.youssef.gamal.springbootwithmappstruct.services;

import java.util.NoSuchElementException;

import com.youssef.gamal.springbootwithmappstruct.entities.Category;

public interface CategoryServiceIfc {
    Category save(Category category);

	Category findById(Long id) throws NoSuchElementException;
}
