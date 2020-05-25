package com.example.demo.recipeController;

import com.example.demo.model.Recipe;
import com.example.demo.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RecipeController {

    private RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService){
        this.recipeService=recipeService;
    }

   @GetMapping("/add")
   public String addRecipe(Model model){
        model.addAttribute("recipe", new Recipe());
        model.addAttribute("mode", "add");
        return "firstForm";
   }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam long id) {
        Recipe recipe = recipeService.findById(id);
        model.addAttribute("recipe", recipe);
        model.addAttribute("mode", "edit");
        return "firstForm";
    }




    @GetMapping("/allByLiked")
    public String allByLiked(Model model){
        model.addAttribute("list", recipeService.findAllByLiked());
        return "list";
    }
    @GetMapping("/allByNewest")
    public String allByNewest(Model model){
        model.addAttribute("list", recipeService.findAllByNewest());
        return "list";
    }
}
