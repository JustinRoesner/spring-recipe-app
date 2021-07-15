package com.hugesalt.springrecipeapp.repositories;

import com.hugesalt.springrecipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
