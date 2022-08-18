package com.example.mvvm_food.Listeners;

import com.example.mvvm_food.Models.InstructionsResponse;

import java.util.List;

public interface InstructionsListener {
    void didFetch(List<InstructionsResponse> response, String message);
    void didError(String message);
}
