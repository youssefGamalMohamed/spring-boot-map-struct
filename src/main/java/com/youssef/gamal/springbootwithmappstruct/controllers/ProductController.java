package com.youssef.gamal.springbootwithmappstruct.controllers;

import com.youssef.gamal.springbootwithmappstruct.dtos.ProductDto;
import com.youssef.gamal.springbootwithmappstruct.mappers.ProductMapper;
import com.youssef.gamal.springbootwithmappstruct.services.ProductServiceIfc;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProductController {

    
    @Autowired
    private ProductServiceIfc ProductServiceIfc;

    @PostMapping("/api/v1/products")
    public ResponseEntity<ProductDto> save(@RequestBody ProductDto ProductDto) {
    	log.info("save({})",ProductDto);
        ProductDto newSavedProductDto = ProductMapper.INSTANCE.mapToDto(ProductServiceIfc.save(ProductMapper.INSTANCE.mapToEntity(ProductDto)));
        log.info("save(): response body = {}", newSavedProductDto);
        return ResponseEntity.ok()
                .body(newSavedProductDto);
    }
    
    
    @GetMapping("/api/v1/products/{id}")
    public ResponseEntity<ProductDto> findById(@PathVariable Long id) {
    	log.info("findById({})",id);
        ProductDto ProductDto = ProductMapper.INSTANCE.mapToDto(ProductServiceIfc.findById(id));
        log.info("findById(): response body = {}", ProductDto);
        return ResponseEntity.ok()
                .body(ProductDto);
    }
}
