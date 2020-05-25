package com.example.demo.recipeController;

import com.example.demo.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipeController {

    private RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService){
        this.recipeService=recipeService;
    }

    @GetMapping("/allByLiked")
    public String allByLiked(Model model){
        model.addAttribute("list", recipeService.findAllByLiked());
        return "list";
    }
}
