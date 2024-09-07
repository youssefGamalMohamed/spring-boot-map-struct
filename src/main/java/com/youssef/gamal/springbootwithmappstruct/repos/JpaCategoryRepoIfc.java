package com.youssef.gamal.springbootwithmappstruct.repos;

import com.youssef.gamal.springbootwithmappstruct.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCategoryRepoIfc extends JpaRepository<Category,Long> {

}
