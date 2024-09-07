package com.youssef.gamal.springbootwithmappstruct.mappers;

import com.youssef.gamal.springbootwithmappstruct.dtos.CategoryDto;
import com.youssef.gamal.springbootwithmappstruct.entities.Category;

import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);


    CategoryDto mapToDto(Category category);
    
    Set<CategoryDto> mapToDto(Set<CategoryDto> category);

    Category mapToEntity(CategoryDto categoryDto);
}
