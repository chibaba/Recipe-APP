package com.example.myapplication;

public class Recipes {
    private String RecipeName;
    private String RecipeIngredient;
    private String RecipeMethodTitle;
    private String Recipe;
    private int Thumbnail;


    public Recipes(String name, String recipeIngredient, String recipeMethodTitle, String recipe, int thumbnail) {
        RecipeName = name;
        RecipeIngredient = recipeIngredient;
        RecipeMethodTitle = recipeMethodTitle;
        Recipe = recipe;
        Thumbnail = thumbnail;
    }
}
