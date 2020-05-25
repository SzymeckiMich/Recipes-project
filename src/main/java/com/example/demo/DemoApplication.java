package com.example.demo;

import com.example.demo.model.Recipe;
import com.example.demo.repository.IngredientRepository;
import com.example.demo.repository.RecipeRepository;
import org.apache.tomcat.jni.Address;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;

import static com.example.demo.model.DifficultyLevel.*;
import static com.example.demo.model.RecipeCategory.*;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        RecipeRepository recipeRepository = context.getBean(RecipeRepository.class);
        IngredientRepository ingredientRepository = context.getBean(IngredientRepository.class);


        Recipe recipe = new Recipe("Makaron w sosie pieczarkowym", 4, 20, "Ugotuj makaron, zalej sosem i już", "Pani Basia", "https://s3.przepisy.pl/przepisy3ii/img/variants/800x0/cheesy-chicken-and-pasta_a9727.jpg", 48, 9, LocalDate.now(), DINNER, EASY);
        recipeRepository.save(recipe);
    }


}
