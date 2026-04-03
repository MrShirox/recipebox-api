package com.recipebox.api.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nameFr;

    @Column(nullable = false)
    private String nameEn;

    private String categoryFr;
    private String categoryEn;
    private String mealType;
    private String thumbnail;
    private String duration;
    private String difficulty;
    private int servings;

    @Column(columnDefinition = "TEXT")
    private String instructionsFr;

    @Column(columnDefinition = "TEXT")
    private String instructionsEn;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "recipe_ingredients_fr", joinColumns = @JoinColumn(name = "recipe_id"))
    @Column(name = "ingredient")
    private List<String> ingredientsFr;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "recipe_ingredients_en", joinColumns = @JoinColumn(name = "recipe_id"))
    @Column(name = "ingredient")
    private List<String> ingredientsEn;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "recipe_measures", joinColumns = @JoinColumn(name = "recipe_id"))
    @Column(name = "measure")
    private List<String> measures;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "recipe_tags", joinColumns = @JoinColumn(name = "recipe_id"))
    @Column(name = "tag")
    private List<String> tags;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNameFr() { return nameFr; }
    public void setNameFr(String nameFr) { this.nameFr = nameFr; }
    public String getNameEn() { return nameEn; }
    public void setNameEn(String nameEn) { this.nameEn = nameEn; }
    public String getCategoryFr() { return categoryFr; }
    public void setCategoryFr(String categoryFr) { this.categoryFr = categoryFr; }
    public String getCategoryEn() { return categoryEn; }
    public void setCategoryEn(String categoryEn) { this.categoryEn = categoryEn; }
    public String getMealType() { return mealType; }
    public void setMealType(String mealType) { this.mealType = mealType; }
    public String getThumbnail() { return thumbnail; }
    public void setThumbnail(String thumbnail) { this.thumbnail = thumbnail; }
    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }
    public String getDifficulty() { return difficulty; }
    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }
    public int getServings() { return servings; }
    public void setServings(int servings) { this.servings = servings; }
    public String getInstructionsFr() { return instructionsFr; }
    public void setInstructionsFr(String instructionsFr) { this.instructionsFr = instructionsFr; }
    public String getInstructionsEn() { return instructionsEn; }
    public void setInstructionsEn(String instructionsEn) { this.instructionsEn = instructionsEn; }
    public List<String> getIngredientsFr() { return ingredientsFr; }
    public void setIngredientsFr(List<String> ingredientsFr) { this.ingredientsFr = ingredientsFr; }
    public List<String> getIngredientsEn() { return ingredientsEn; }
    public void setIngredientsEn(List<String> ingredientsEn) { this.ingredientsEn = ingredientsEn; }
    public List<String> getMeasures() { return measures; }
    public void setMeasures(List<String> measures) { this.measures = measures; }
    public List<String> getTags() { return tags; }
    public void setTags(List<String> tags) { this.tags = tags; }
}