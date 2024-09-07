package com.youssef.gamal.springbootwithmappstruct.repos;

import com.youssef.gamal.springbootwithmappstruct.entities.Category;
import com.youssef.gamal.springbootwithmappstruct.entities.Product;

import lombok.extern.slf4j.Slf4j;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JpaProductRepoImpl implements ProductRepoIfc {
	
    @Autowired
    private JpaProductRepoIfc jpaProductRepoIfc;

    @Override
    public Product save(Product product) {
    	log.info("save({})",product);
        return jpaProductRepoIfc.save(product);
    }

	@Override
	public Product findById(Long id) throws NoSuchElementException {
		log.info("findById({})",id);
		return jpaProductRepoIfc.findById(id)
				.orElseThrow();
	}
	
	
	
}
