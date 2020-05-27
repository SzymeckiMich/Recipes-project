package com.example.demo.service;

import com.example.demo.model.Recipe;
import com.example.demo.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Service
public class RecipeService {

    @PersistenceContext
    private EntityManager entityManager;

    private RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository){
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> find3MostLiked(){
        return recipeRepository.findTop3ByOrderByLikesDesc();
    }

    public List<Recipe> findAllByLiked() {
        return recipeRepository.findAllByOrderByLikesDesc();
    }

    public List<Recipe> findAllByNewest() {
        return recipeRepository.findAllByOrderByAddOrEditDateAsc();
    }

    public Recipe findById(long id) {
        TypedQuery<Recipe> query = entityManager.createQuery("SELECT r FROM Recipe r WHERE r.id = " + id, Recipe.class);
        return query.getSingleResult();
    }

    public void save(Recipe recipe) {
        recipeRepository.save(recipe);
    }
}
