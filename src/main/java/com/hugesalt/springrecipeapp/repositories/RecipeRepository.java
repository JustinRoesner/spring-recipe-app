package com.hugesalt.springrecipeapp.repositories;

import com.hugesalt.springrecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
