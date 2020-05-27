package com.example.demo;

import com.example.demo.model.Ingredient;
import com.example.demo.model.Recipe;
import com.example.demo.repository.IngredientRepository;
import com.example.demo.repository.RecipeRepository;
import org.apache.tomcat.jni.Address;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;

import static com.example.demo.model.DifficultyLevel.*;
import static com.example.demo.model.QuantityUnit.*;
import static com.example.demo.model.RecipeCategory.*;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        RecipeRepository recipeRepository = context.getBean(RecipeRepository.class);
        IngredientRepository ingredientRepository = context.getBean(IngredientRepository.class);

        //RECIPE 1
//        Recipe recipe1 = new Recipe("Makaron w sosie pieczarkowym", 4, 20, "Ugotuj makaron, zalej sosem i już", "Pani Basia", "https://s3.przepisy.pl/przepisy3ii/img/variants/800x0/cheesy-chicken-and-pasta_a9727.jpg", 48, 9, LocalDate.now(), DINNER, EASY);
//        recipeRepository.save(recipe1);
//        Ingredient ingredient1 = new Ingredient("Filet z piersi kurczaka", 500, g, recipe1);
//        Ingredient ingredient2 = new Ingredient("Fix Świderki Knorr", 1, piece, recipe1);
//        Ingredient ingredient3 = new Ingredient("Makaron tagliatelle", 250, g, recipe1);
//        Ingredient ingredient4 = new Ingredient("Pieczarki", 500, g, recipe1);
//        Ingredient ingredient5 = new Ingredient("Mleko", 150, ml, recipe1);
//        Ingredient ingredient6 = new Ingredient("Cebula", 1, piece, recipe1);
//        Ingredient ingredient7 = new Ingredient("Musztarda", 2, spoon, recipe1);
//        Ingredient ingredient8 = new Ingredient("Świeża natka pietruszki", 2, spoon, recipe1);
//        Ingredient ingredient9 = new Ingredient("Olej rzepakowy", 1, spoon, recipe1);
//        ingredientRepository.save(ingredient1);
//        ingredientRepository.save(ingredient2);
//        ingredientRepository.save(ingredient3);
//        ingredientRepository.save(ingredient4);
//        ingredientRepository.save(ingredient5);
//        ingredientRepository.save(ingredient6);
//        ingredientRepository.save(ingredient7);
//        ingredientRepository.save(ingredient8);
//        ingredientRepository.save(ingredient9);

        //RECIPE 2
//        Recipe recipe2 = new Recipe("Muffinki a la pizza", 10, 90, "Kiełbasę pokrój w plasterki – podsmaż ją na patelni tak, aby się wytopiło z niej trochę tłuszczu. Ciasto delikatnie pomieszaj z serem mozarella, kiełbasą razem z tłuszczem, pokrojonymi oliwkami i ziołami Knorr. Powstałą w ten sposób mieszankę rozłóż do foremek na muffinki wcześniej wysmarowanych olejem. Całość wstaw do nagrzanego do 180*C piekarnika na około 20 minut. Podawaj z dipem czosnkowym.", "Pani Barbara", "https://s3.przepisy.pl/przepisy3ii/img/variants/767x0/muffinki_a_la_pizza_0661895.jpg", 51, 12, LocalDate.now(), DINNER, EASY);
//        recipeRepository.save(recipe2);
//        Ingredient ingredient10 = new Ingredient("Mąka", 2, glass, recipe2);
//        Ingredient ingredient11 = new Ingredient("Suche drożdże", 7, g, recipe2);
//        Ingredient ingredient12 = new Ingredient("Majonez Helllmann's", 4, spoon, recipe2);
//        Ingredient ingredient13 = new Ingredient("Ciepła woda", 0.5, glass, recipe2);
//        Ingredient ingredient14 = new Ingredient("Jajko", 1, piece, recipe2);
//        Ingredient ingredient15 = new Ingredient("Sól", 1, pinch, recipe2);
//        Ingredient ingredient16 = new Ingredient("Cukier", 1, teaspoon, recipe2);
//        Ingredient ingredient17 = new Ingredient("Tarta mozzarella", 0.5, glass, recipe2);
//        Ingredient ingredient18 = new Ingredient("Starty parmezan", 3, spoon, recipe2);
//        Ingredient ingredient19 = new Ingredient("Kiełbasa chroizo pikantna", 200, g, recipe2);
//        Ingredient ingredient20 = new Ingredient("Oliwki zielone", 100, g, recipe2);
//        Ingredient ingredient21 = new Ingredient("Mieszanka Knorr Zioła prowansalskie", 1, spoon, recipe2);
//        ingredientRepository.save(ingredient10);
//        ingredientRepository.save(ingredient11);
//        ingredientRepository.save(ingredient12);
//        ingredientRepository.save(ingredient13);
//        ingredientRepository.save(ingredient14);
//        ingredientRepository.save(ingredient15);
//        ingredientRepository.save(ingredient16);
//        ingredientRepository.save(ingredient17);
//        ingredientRepository.save(ingredient18);
//        ingredientRepository.save(ingredient19);
//        ingredientRepository.save(ingredient20);
//        ingredientRepository.save(ingredient21);
    }


}
