package com.youssef.gamal.springbootwithmappstruct.services;


import com.youssef.gamal.springbootwithmappstruct.entities.Category;
import com.youssef.gamal.springbootwithmappstruct.entities.Product;
import com.youssef.gamal.springbootwithmappstruct.repos.CategoryRepoIfc;
import com.youssef.gamal.springbootwithmappstruct.repos.ProductRepoIfc;

import lombok.extern.slf4j.Slf4j;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductServiceImpl implements ProductServiceIfc {

	
    @Autowired
    private ProductRepoIfc productRepoIfc;

    @Override
    public Product save(Product product) {
    	log.info("save({})",product);
        return productRepoIfc.save(product);
    }

	@Override
	public Product findById(Long id) throws NoSuchElementException {
		log.info("findById({})",id);
		return productRepoIfc.findById(id);
	}
}
