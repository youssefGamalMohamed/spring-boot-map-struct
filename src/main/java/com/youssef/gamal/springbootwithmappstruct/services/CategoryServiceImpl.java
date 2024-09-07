package com.youssef.gamal.springbootwithmappstruct.services;


import com.youssef.gamal.springbootwithmappstruct.entities.Category;
import com.youssef.gamal.springbootwithmappstruct.repos.CategoryRepoIfc;
import lombok.extern.slf4j.Slf4j;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryServiceIfc {

	
    @Autowired
    private CategoryRepoIfc categoryRepo;

    @Override
    public Category save(Category category) {
    	log.info("save({})",category);
        return categoryRepo.save(category);
    }

	@Override
	public Category findById(Long id) throws NoSuchElementException {
		log.info("findById({})",id);
		return categoryRepo.findById(id);
	}
}
