package com.youssef.gamal.springbootwithmappstruct.dtos;

import java.util.HashSet;
import java.util.Set;

import com.youssef.gamal.springbootwithmappstruct.entities.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private Long id;
    
    private String name;

    private String description;

    private double price;

    private Integer quantity;
    
    private Set<CategoryDto> categories = new HashSet<>();
}
