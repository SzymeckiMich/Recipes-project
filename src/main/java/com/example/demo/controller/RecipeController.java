package com.example.demo.controller;

import com.example.demo.model.Ingredient;
import com.example.demo.model.IngredientWrapper;
import com.example.demo.model.Obiekt;
import com.example.demo.model.Recipe;
import com.example.demo.service.IngredientService;
import com.example.demo.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class RecipeController {

    private RecipeService recipeService;
    public IngredientService ingredientService;

    @Autowired
    public RecipeController(RecipeService recipeService, IngredientService ingredientService) {
        this.recipeService = recipeService;
        this.ingredientService = ingredientService;
    }

    @GetMapping("/add")
    public String addRecipe(Model model) {
        model.addAttribute("recipe", new Recipe());
        model.addAttribute("mode", "add");
        return "firstForm";
    }

    @PostMapping("/add")
    public String addRecipe(Recipe recipe, Model model) {
        recipe.setAddOrEditDate(LocalDateTime.now());
        recipeService.save(recipe);

        List<Ingredient> ingredients = new ArrayList<>();

        for (int i = 0; i < recipe.getAmountOfIngredients(); i++) {
            Ingredient ingredient = new Ingredient();
            ingredient.setRecipe(recipe);
            ingredients.add(ingredient);
        }

        IngredientWrapper wrapper = new IngredientWrapper();
        wrapper.setIngredients(ingredients);

        model.addAttribute("recipe", recipe);
        model.addAttribute("wrapper", wrapper);

        return "ingredientForm";
    }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam long id) {
        Recipe recipe = recipeService.findById(id);
        model.addAttribute("recipe", recipe);
        model.addAttribute("mode", "edit");
        return "firstForm";
    }

    @GetMapping("/allByLiked")
    public String allByLiked(Model model) {
        model.addAttribute("list", recipeService.findAllByLiked());
        return "list";
    }

    @GetMapping("/allByNewest")
    public String allByNewest(Model model) {
        model.addAttribute("list", recipeService.findAllByNewest());
        return "list";
    }

    @GetMapping("/addIngredient")
    public String addingredient(Model model, Recipe recipe) throws InterruptedException {

        List<Ingredient> ingredients = new ArrayList<>();


        for (int i = 0; i < recipe.getAmountOfIngredients(); i++) {
            Ingredient ingredient = new Ingredient();
            ingredient.setRecipe(recipe);
            ingredients.add(ingredient);
        }

        return "ingredientForm";
    }

    @PostMapping("/addIngredient")
    public String addIngredient(IngredientWrapper wrapper) {
        for(int i =0; i<wrapper.getIngredients().size(); i++ ){
            ingredientService.save(wrapper.getIngredients().get(i));
        }

        return "Success";
    }
}
