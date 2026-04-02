package com.recipebox.api.controller;

import com.recipebox.api.model.Recipe;
import com.recipebox.api.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/recipes")
@CrossOrigin(origins = "*")
public class RecipeController {

    @Autowired
    private RecipeService service;

    @GetMapping
    public List<Recipe> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recipe> getById(@PathVariable Long id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/random")
    public ResponseEntity<Recipe> getRandom() {
        return service.getRandom()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/random/list")
    public List<Recipe> getRandomList(@RequestParam(defaultValue = "10") int count) {
        return service.getRandomList(count);
    }

    @GetMapping("/search")
    public List<Recipe> search(@RequestParam String q) {
        return service.searchByName(q);
    }

    @GetMapping("/category")
    public List<Recipe> byCategory(@RequestParam String c) {
        return service.getByCategory(c);
    }

    @GetMapping("/mealtype")
    public List<Recipe> byMealType(@RequestParam String t) {
        return service.getByMealType(t);
    }

    @GetMapping("/tag")
    public List<Recipe> byTag(@RequestParam String tag) {
        return service.getByTag(tag);
    }

    @PostMapping
    public Recipe create(@RequestBody Recipe recipe) {
        return service.save(recipe);
    }
}