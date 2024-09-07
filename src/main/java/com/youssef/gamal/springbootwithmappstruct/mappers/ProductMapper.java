package com.youssef.gamal.springbootwithmappstruct.mappers;

import com.youssef.gamal.springbootwithmappstruct.dtos.ProductDto;
import com.youssef.gamal.springbootwithmappstruct.entities.Product;

import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {CategoryMapper.class})
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);


    ProductDto mapToDto(Product product);
    
    Set<ProductDto> mapToDto(Set<Product> products);

    Product mapToEntity(ProductDto productDto);
    
    
}
