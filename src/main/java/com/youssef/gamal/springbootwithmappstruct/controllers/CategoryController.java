package com.youssef.gamal.springbootwithmappstruct.controllers;

import com.youssef.gamal.springbootwithmappstruct.dtos.CategoryDto;
import com.youssef.gamal.springbootwithmappstruct.mappers.CategoryMapper;
import com.youssef.gamal.springbootwithmappstruct.services.CategoryServiceIfc;

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
public class CategoryController {

    
    @Autowired
    private CategoryServiceIfc categoryServiceIfc;

    @PostMapping("/api/v1/categories")
    public ResponseEntity<CategoryDto> save(@RequestBody CategoryDto categoryDto) {
    	log.info("save({})",categoryDto);
        CategoryDto newSavedCategoryDto = CategoryMapper.INSTANCE.mapToDto(categoryServiceIfc.save(CategoryMapper.INSTANCE.mapToEntity(categoryDto)));
        log.info("save(): response body = {}", newSavedCategoryDto);
        return ResponseEntity.ok()
                .body(newSavedCategoryDto);
    }
    
    
    @GetMapping("/api/v1/categories/{id}")
    public ResponseEntity<CategoryDto> findById(@PathVariable Long id) {
    	log.info("findById({})",id);
        CategoryDto categoryDto = CategoryMapper.INSTANCE.mapToDto(categoryServiceIfc.findById(id));
        log.info("findById(): response body = {}", categoryDto);
        return ResponseEntity.ok()
                .body(categoryDto);
    }
}
