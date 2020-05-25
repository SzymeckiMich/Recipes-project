package com.example.demo.service;

import com.example.demo.model.Recipe;
import com.example.demo.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

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
}
