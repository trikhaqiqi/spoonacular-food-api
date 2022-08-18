package com.example.mvvm_food.Listeners;

import com.example.mvvm_food.Models.RecipeDetailsResponse;

public interface RecipeDetailsListener {
    void didFetch(RecipeDetailsResponse response, String message);
    void didError(String message);
}
