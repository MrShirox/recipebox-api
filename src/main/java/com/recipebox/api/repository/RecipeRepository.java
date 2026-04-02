package com.recipebox.api.repository;

import com.recipebox.api.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    List<Recipe> findByCategoryFrIgnoreCase(String category);

    List<Recipe> findByMealTypeIgnoreCase(String mealType);

    @Query("SELECT r FROM Recipe r WHERE LOWER(r.nameFr) LIKE LOWER(CONCAT('%', :q, '%')) OR LOWER(r.nameEn) LIKE LOWER(CONCAT('%', :q, '%'))")
    List<Recipe> searchByName(@Param("q") String query);

    @Query("SELECT r FROM Recipe r JOIN r.tags t WHERE LOWER(t) = LOWER(:tag)")
    List<Recipe> findByTag(@Param("tag") String tag);

    @Query("SELECT r FROM Recipe r ORDER BY RAND()")
    List<Recipe> findAllRandom();
}