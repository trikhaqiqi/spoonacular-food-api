package com.example.mvvm_food.Listeners;

import com.example.mvvm_food.Models.SimilarRecipeResponse;

import java.util.List;

public interface SimilarRecipesListener {

    void didFetch(List<SimilarRecipeResponse> response, String message);
    void didError(String message);

}
