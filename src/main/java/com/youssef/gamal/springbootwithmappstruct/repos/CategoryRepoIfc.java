package com.youssef.gamal.springbootwithmappstruct.repos;

import java.util.NoSuchElementException;

import com.youssef.gamal.springbootwithmappstruct.entities.Category;

public interface CategoryRepoIfc {
    Category save(Category category);

	Category findById(Long id) throws NoSuchElementException;
}
