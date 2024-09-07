package com.youssef.gamal.springbootwithmappstruct.repos;

import com.youssef.gamal.springbootwithmappstruct.entities.Category;

import lombok.extern.slf4j.Slf4j;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JpaCategoryRepoImpl implements CategoryRepoIfc {
	
    @Autowired
    private JpaCategoryRepoIfc jpaCategoryRepoIfc;

    @Override
    public Category save(Category category) {
    	log.info("save({})",category);
        return jpaCategoryRepoIfc.save(category);
    }

	@Override
	public Category findById(Long id) throws NoSuchElementException {
		return jpaCategoryRepoIfc.findById(id)
				.orElseThrow();
	}
}
