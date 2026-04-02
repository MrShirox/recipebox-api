package com.recipebox.api.service;

import com.recipebox.api.model.Recipe;
import com.recipebox.api.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository repository;

    public List<Recipe> getAll() {
        return repository.findAll();
    }

    public Optional<Recipe> getById(Long id) {
        return repository.findById(id);
    }

    public Recipe save(Recipe recipe) {
        return repository.save(recipe);
    }

    public List<Recipe> searchByName(String query) {
        return repository.searchByName(query);
    }

    public List<Recipe> getByCategory(String category) {
        return repository.findByCategoryFrIgnoreCase(category);
    }

    public List<Recipe> getByMealType(String mealType) {
        return repository.findByMealTypeIgnoreCase(mealType);
    }

    public List<Recipe> getByTag(String tag) {
        return repository.findByTag(tag);
    }

    public Optional<Recipe> getRandom() {
        List<Recipe> all = repository.findAll();
        if (all.isEmpty()) return Optional.empty();
        Collections.shuffle(all);
        return Optional.of(all.get(0));
    }

    public List<Recipe> getRandomList(int count) {
        List<Recipe> all = repository.findAll();
        Collections.shuffle(all);
        return all.subList(0, Math.min(count, all.size()));
    }
}