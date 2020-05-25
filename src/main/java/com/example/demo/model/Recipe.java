package com.example.demo.model;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private int portions;
    private int time;
    private String instruction;
    private String author;
    private String imageUrl;
    private int likes;
    private int amountOfIngredients;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate addOrEditDate;

    @Enumerated(value = EnumType.STRING)
    private RecipeCategory category;

    @Enumerated(value = EnumType.STRING)
    private DifficultyLevel level;

    @OneToMany(mappedBy = "recipe", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<Ingredient> ingredients;

    public Recipe() {
    }

    public Recipe(String title, int portions, int time, String instruction, String author, String imageUrl, int likes, int amountOfIngredients, LocalDate addOrEditDate, RecipeCategory category, DifficultyLevel level) {
        this.title = title;
        this.portions = portions;
        this.time = time;
        this.instruction = instruction;
        this.author = author;
        this.imageUrl = imageUrl;
        this.likes = likes;
        this.amountOfIngredients = amountOfIngredients;
        this.addOrEditDate = addOrEditDate;
        this.category = category;
        this.level = level;
    }


    public int getAmountOfIngredients() {
        return amountOfIngredients;
    }

    public void setAmountOfIngredients(int amountOfIngredients) {
        this.amountOfIngredients = amountOfIngredients;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getAddOrEditDate() {
        return addOrEditDate;
    }

    public void setAddOrEditDate(LocalDate addOrEditDate) {
        this.addOrEditDate = addOrEditDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPortions() {
        return portions;
    }

    public void setPortions(int portions) {
        this.portions = portions;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public RecipeCategory getCategory() {
        return category;
    }

    public void setCategory(RecipeCategory category) {
        this.category = category;
    }

    public DifficultyLevel getLevel() {
        return level;
    }

    public void setLevel(DifficultyLevel level) {
        this.level = level;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
