package com.example.demo.repository;

import com.example.demo.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    List<Recipe> findTop3ByOrderByLikesDesc();

    List<Recipe> findAllByOrderByLikesDesc();

    List<Recipe> findAllByOrderByAddOrEditDateAsc();

    Optional<Recipe> findById(Long id);
}
