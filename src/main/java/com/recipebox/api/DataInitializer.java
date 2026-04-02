package com.recipebox.api;

import com.recipebox.api.model.Recipe;
import com.recipebox.api.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private RecipeRepository repository;

    @Override
    public void run(String... args) {
        if (repository.count() > 0) return;

        repository.saveAll(Arrays.asList(

            recipe("Bœuf Bourguignon", "Beef Bourguignon",
                "Plat principal", "Main course", "diner",
                "https://loremflickr.com/400/300/beef,stew",
                "3h", "Moyen", 4,
                "Couper le bœuf en gros cubes. Faire revenir les lardons dans une cocotte avec l'huile et le beurre. Ajouter les oignons et l'ail. Faire dorer la viande de tous côtés. Saupoudrer de farine. Mouiller avec le vin rouge. Ajouter le bouquet garni et les carottes. Saler, poivrer. Couvrir et laisser mijoter 2h30 à feu doux.\nAjouter les champignons 30 minutes avant la fin. Servir chaud avec des pommes de terre vapeur.",
                "Cut beef into large cubes. Brown lardons in a casserole with oil and butter. Add onions and garlic. Brown meat on all sides. Sprinkle with flour. Add red wine. Add bouquet garni and carrots. Season. Cover and simmer for 2h30 on low heat.\nAdd mushrooms 30 minutes before the end. Serve hot with steamed potatoes.",
                fr("Bœuf à braiser", "Lardons", "Carottes", "Oignons", "Ail", "Vin rouge", "Champignons", "Farine", "Beurre", "Bouquet garni"),
                en("Braising beef", "Lardons", "Carrots", "Onions", "Garlic", "Red wine", "Mushrooms", "Flour", "Butter", "Bouquet garni"),
                m("800g", "200g", "3", "2", "3 gousses", "75cl", "250g", "2 c.s.", "30g", "1"),
                tags("sans-gluten")),

            recipe("Quiche Lorraine", "Quiche Lorraine",
                "Entrée", "Starter", "dejeuner",
                "https://loremflickr.com/400/300/quiche",
                "45min", "Facile", 6,
                "Préchauffer le four à 180°C. Foncer un moule avec la pâte brisée. Piquer le fond. Faire revenir les lardons à sec. Les répartir sur la pâte. Battre les œufs avec la crème, saler, poivrer, ajouter la muscade. Verser sur les lardons. Parsemer de gruyère. Enfourner 35 minutes.",
                "Preheat oven to 180°C. Line a tin with shortcrust pastry. Prick the base. Dry fry lardons. Spread over pastry. Beat eggs with cream, season, add nutmeg. Pour over lardons. Sprinkle with gruyere. Bake 35 minutes.",
                fr("Pâte brisée", "Lardons", "Œufs", "Crème fraîche", "Gruyère râpé", "Muscade", "Sel", "Poivre"),
                en("Shortcrust pastry", "Lardons", "Eggs", "Cream", "Grated gruyere", "Nutmeg", "Salt", "Pepper"),
                m("1", "200g", "3", "20cl", "100g", "1 pincée", "q.s.", "q.s."),
                tags("sans-viande-rouge")),

            recipe("Ratatouille", "Ratatouille",
                "Plat principal", "Main course", "diner",
                "https://loremflickr.com/400/300/ratatouille,vegetables",
                "1h", "Facile", 4,
                "Couper tous les légumes en dés. Faire revenir l'oignon et l'ail dans l'huile d'olive. Ajouter les poivrons, puis les aubergines et les courgettes. Incorporer les tomates. Assaisonner avec le thym et le basilic. Couvrir et laisser mijoter 40 minutes à feu doux.",
                "Cut all vegetables into cubes. Sauté onion and garlic in olive oil. Add peppers, then eggplant and zucchini. Add tomatoes. Season with thyme and basil. Cover and simmer 40 minutes on low heat.",
                fr("Aubergines", "Courgettes", "Poivrons rouges", "Tomates", "Oignon", "Ail", "Huile d'olive", "Thym", "Basilic"),
                en("Eggplants", "Zucchini", "Red peppers", "Tomatoes", "Onion", "Garlic", "Olive oil", "Thyme", "Basil"),
                m("2", "2", "2", "4", "1", "3 gousses", "4 c.s.", "1 brin", "quelques feuilles"),
                tags("vegetarien", "vegan", "sans-gluten", "sans-porc")),

            recipe("Gratin Dauphinois", "Potato Gratin",
                "Accompagnement", "Side dish", "diner",
                "https://loremflickr.com/400/300/potato,gratin",
                "1h30", "Facile", 4,
                "Préchauffer le four à 180°C. Éplucher et trancher finement les pommes de terre. Frotter le plat avec l'ail. Beurrer le plat. Disposer les pommes de terre en couches. Mélanger la crème avec le lait, saler, poivrer, muscade. Verser sur les pommes de terre. Enfourner 1h15 jusqu'à ce que le dessus soit doré.",
                "Preheat oven to 180°C. Peel and thinly slice potatoes. Rub dish with garlic. Butter the dish. Layer potatoes. Mix cream with milk, season with salt, pepper and nutmeg. Pour over potatoes. Bake 1h15 until golden.",
                fr("Pommes de terre", "Crème fraîche", "Lait", "Ail", "Beurre", "Muscade", "Sel", "Poivre"),
                en("Potatoes", "Heavy cream", "Milk", "Garlic", "Butter", "Nutmeg", "Salt", "Pepper"),
                m("1kg", "30cl", "20cl", "2 gousses", "20g", "1 pincée", "q.s.", "q.s."),
                tags("vegetarien", "sans-gluten", "sans-porc")),

            recipe("Crêpes Bretonnes", "Breton Crepes",
                "Dessert", "Dessert", "dessert",
                "https://loremflickr.com/400/300/crepes,pancake",
                "30min", "Facile", 4,
                "Mélanger la farine et le sel. Creuser un puits et ajouter les œufs. Incorporer le lait progressivement en fouettant. Ajouter le beurre fondu. Laisser reposer 30 minutes. Cuire chaque crêpe dans une poêle beurrée 1 minute de chaque côté.",
                "Mix flour and salt. Make a well and add eggs. Gradually incorporate milk while whisking. Add melted butter. Rest 30 minutes. Cook each crepe in a buttered pan 1 minute each side.",
                fr("Farine", "Œufs", "Lait", "Beurre fondu", "Sel"),
                en("Flour", "Eggs", "Milk", "Melted butter", "Salt"),
                m("250g", "3", "50cl", "50g", "1 pincée"),
                tags("vegetarien", "sans-porc")),

            recipe("Soupe à l'Oignon", "French Onion Soup",
                "Entrée", "Starter", "dejeuner",
                "https://loremflickr.com/400/300/onion,soup",
                "1h", "Facile", 4,
                "Émincer finement les oignons. Les faire caraméliser dans le beurre à feu doux pendant 30 minutes en remuant. Déglacer avec le vin blanc. Ajouter le bouillon de bœuf. Laisser mijoter 20 minutes. Servir dans des bols avec des tranches de pain grillé et du gruyère. Passer sous le gril 5 minutes.",
                "Finely slice onions. Caramelize in butter on low heat for 30 minutes, stirring. Deglaze with white wine. Add beef broth. Simmer 20 minutes. Serve in bowls with toasted bread slices and gruyere. Grill for 5 minutes.",
                fr("Oignons", "Beurre", "Vin blanc", "Bouillon de bœuf", "Pain", "Gruyère râpé", "Sel", "Poivre"),
                en("Onions", "Butter", "White wine", "Beef broth", "Bread", "Grated gruyere", "Salt", "Pepper"),
                m("6", "50g", "15cl", "1.5L", "8 tranches", "150g", "q.s.", "q.s."),
                tags("sans-porc")),

            recipe("Tarte Tatin", "Tarte Tatin",
                "Dessert", "Dessert", "dessert",
                "https://loremflickr.com/400/300/apple,tart,caramel",
                "1h", "Moyen", 6,
                "Préchauffer le four à 200°C. Faire fondre le beurre et le sucre dans un moule allant au four jusqu'à obtenir un caramel doré. Éplucher et couper les pommes en quartiers. Les disposer sur le caramel. Couvrir avec la pâte feuilletée en rentrant les bords. Enfourner 30 minutes. Retourner la tarte à la sortie du four.",
                "Preheat oven to 200°C. Melt butter and sugar in an ovenproof dish until golden caramel. Peel and quarter apples. Arrange over caramel. Cover with puff pastry tucking in edges. Bake 30 minutes. Flip tart immediately out of oven.",
                fr("Pommes", "Pâte feuilletée", "Beurre", "Sucre"),
                en("Apples", "Puff pastry", "Butter", "Sugar"),
                m("6", "1 rouleau", "80g", "150g"),
                tags("vegetarien", "sans-porc")),

            recipe("Poulet Rôti", "Roast Chicken",
                "Plat principal", "Main course", "diner",
                "https://loremflickr.com/400/300/roast,chicken",
                "1h30", "Facile", 4,
                "Préchauffer le four à 200°C. Frotter le poulet avec le beurre, le sel, le poivre, le thym et le romarin. Glisser l'ail et le citron à l'intérieur. Enfourner 1h15 en arrosant régulièrement. Laisser reposer 10 minutes avant de découper.",
                "Preheat oven to 200°C. Rub chicken with butter, salt, pepper, thyme and rosemary. Place garlic and lemon inside. Roast 1h15 basting regularly. Rest 10 minutes before carving.",
                fr("Poulet entier", "Beurre", "Ail", "Citron", "Thym", "Romarin", "Sel", "Poivre"),
                en("Whole chicken", "Butter", "Garlic", "Lemon", "Thyme", "Rosemary", "Salt", "Pepper"),
                m("1.5kg", "50g", "4 gousses", "1", "2 brins", "2 brins", "q.s.", "q.s."),
                tags("sans-gluten", "sans-porc")),

            recipe("Moules Marinières", "Mussels Marinière",
                "Plat principal", "Main course", "diner",
                "https://loremflickr.com/400/300/mussels,seafood",
                "30min", "Facile", 4,
                "Nettoyer et gratter les moules. Faire suer l'échalote et l'ail dans le beurre. Ajouter le vin blanc et le bouquet garni. Verser les moules. Couvrir et cuire à feu vif 5 minutes en secouant. Parsemer de persil haché. Servir immédiatement.",
                "Clean and scrape mussels. Sweat shallot and garlic in butter. Add white wine and bouquet garni. Add mussels. Cover and cook on high heat 5 minutes shaking pan. Sprinkle with chopped parsley. Serve immediately.",
                fr("Moules", "Échalotes", "Ail", "Vin blanc", "Beurre", "Persil", "Bouquet garni"),
                en("Mussels", "Shallots", "Garlic", "White wine", "Butter", "Parsley", "Bouquet garni"),
                m("2kg", "3", "2 gousses", "20cl", "40g", "1 bouquet", "1"),
                tags("sans-gluten", "sans-porc", "fruits-de-mer")),

            recipe("Crème Brûlée", "Crème Brûlée",
                "Dessert", "Dessert", "dessert",
                "https://loremflickr.com/400/300/creme,brulee,dessert",
                "1h", "Moyen", 4,
                "Préchauffer le four à 150°C. Fouetter les jaunes d'œufs avec le sucre jusqu'à blanchiment. Chauffer la crème avec la vanille. Verser sur les jaunes en mélangeant. Répartir dans des ramequins. Cuire au bain-marie 45 minutes. Réfrigérer 2 heures. Saupoudrer de sucre et caraméliser au chalumeau.",
                "Preheat oven to 150°C. Whisk egg yolks with sugar until pale. Heat cream with vanilla. Pour over yolks while mixing. Pour into ramekins. Cook in water bath 45 minutes. Refrigerate 2 hours. Sprinkle with sugar and caramelize with torch.",
                fr("Crème entière", "Jaunes d'œufs", "Sucre", "Vanille", "Sucre cassonade"),
                en("Heavy cream", "Egg yolks", "Sugar", "Vanilla", "Brown sugar"),
                m("50cl", "5", "100g", "1 gousse", "4 c.s."),
                tags("vegetarien", "sans-porc", "sans-gluten")),

            recipe("Blanquette de Veau", "Veal Blanquette",
                "Plat principal", "Main course", "diner",
                "https://loremflickr.com/400/300/veal,stew",
                "2h", "Moyen", 4,
                "Couper le veau en morceaux. Faire blanchir la viande dans l'eau bouillante 5 minutes. Rincer. Remettre dans une cocotte avec oignons, carottes, bouquet garni. Couvrir d'eau et cuire 1h30. Préparer un roux avec beurre et farine. Ajouter le bouillon filtré. Lier avec jaune d'œuf et crème. Ajouter les champignons. Servir avec du riz.",
                "Cut veal into pieces. Blanch meat in boiling water 5 minutes. Rinse. Return to pot with onions, carrots, bouquet garni. Cover with water and cook 1h30. Make a roux with butter and flour. Add filtered broth. Bind with egg yolk and cream. Add mushrooms. Serve with rice.",
                fr("Veau", "Carottes", "Oignons", "Champignons", "Beurre", "Farine", "Crème", "Jaune d'œuf", "Bouquet garni"),
                en("Veal", "Carrots", "Onions", "Mushrooms", "Butter", "Flour", "Cream", "Egg yolk", "Bouquet garni"),
                m("800g", "3", "2", "250g", "50g", "50g", "20cl", "2", "1"),
                tags("sans-porc")),

            recipe("Salade Niçoise", "Niçoise Salad",
                "Entrée", "Starter", "dejeuner",
                "https://loremflickr.com/400/300/salad,nicoise,tuna",
                "20min", "Facile", 4,
                "Cuire les haricots verts à la vapeur. Cuire les œufs durs. Disposer la salade dans un plat. Ajouter le thon émietté, les tomates, les olives, les anchois, les œufs coupés. Assaisonner avec l'huile d'olive, le vinaigre, le sel et le poivre.",
                "Steam green beans. Hard boil eggs. Arrange lettuce in a dish. Add flaked tuna, tomatoes, olives, anchovies, sliced eggs. Dress with olive oil, vinegar, salt and pepper.",
                fr("Salade verte", "Thon en boîte", "Haricots verts", "Tomates", "Olives noires", "Anchois", "Œufs", "Huile d'olive", "Vinaigre"),
                en("Green salad", "Canned tuna", "Green beans", "Tomatoes", "Black olives", "Anchovies", "Eggs", "Olive oil", "Vinegar"),
                m("1", "200g", "200g", "3", "100g", "50g", "4", "4 c.s.", "1 c.s."),
                tags("sans-gluten", "sans-porc")),

            recipe("Cassoulet", "Cassoulet",
                "Plat principal", "Main course", "diner",
                "https://loremflickr.com/400/300/cassoulet,beans",
                "3h", "Difficile", 6,
                "Faire tremper les haricots la veille. Les cuire 1 heure. Faire revenir les saucisses et le confit de canard. Dans une cocotte, alterner couches de haricots et viandes. Ajouter le bouillon. Cuire au four à 160°C pendant 2 heures en cassant la croûte régulièrement.",
                "Soak beans overnight. Cook 1 hour. Brown sausages and duck confit. In a casserole, alternate layers of beans and meats. Add broth. Cook in oven at 160°C for 2 hours breaking the crust regularly.",
                fr("Haricots blancs", "Saucisses de Toulouse", "Confit de canard", "Lardons", "Tomates", "Oignon", "Ail", "Bouillon", "Thym"),
                en("White beans", "Toulouse sausages", "Duck confit", "Lardons", "Tomatoes", "Onion", "Garlic", "Broth", "Thyme"),
                m("500g", "4", "2 cuisses", "200g", "3", "1", "4 gousses", "50cl", "2 brins"),
                tags("sans-gluten")),

            recipe("Pot-au-Feu", "Pot-au-Feu",
                "Plat principal", "Main course", "diner",
                "https://loremflickr.com/400/300/beef,broth,vegetables",
                "3h30", "Facile", 6,
                "Mettre la viande dans une grande marmite d'eau froide. Porter à ébullition et écumer. Ajouter les légumes, le bouquet garni, le sel et le poivre. Laisser cuire à petit feu pendant 3 heures. Servir le bouillon en entrée puis la viande et les légumes avec de la moutarde et du gros sel.",
                "Place meat in a large pot of cold water. Bring to boil and skim. Add vegetables, bouquet garni, salt and pepper. Simmer for 3 hours. Serve broth as starter then meat and vegetables with mustard and coarse salt.",
                fr("Paleron de bœuf", "Os à moelle", "Carottes", "Poireaux", "Navets", "Céleri", "Oignons", "Bouquet garni", "Gros sel"),
                en("Beef chuck", "Marrow bones", "Carrots", "Leeks", "Turnips", "Celery", "Onions", "Bouquet garni", "Coarse salt"),
                m("800g", "2", "4", "2", "2", "2 branches", "2", "1", "q.s."),
                tags("sans-gluten", "sans-porc")),

            recipe("Mousse au Chocolat", "Chocolate Mousse",
                "Dessert", "Dessert", "dessert",
                "https://loremflickr.com/400/300/chocolate,mousse",
                "20min", "Facile", 6,
                "Faire fondre le chocolat au bain-marie. Hors du feu, ajouter les jaunes d'œufs un par un. Monter les blancs en neige avec une pincée de sel. Incorporer délicatement les blancs au chocolat en plusieurs fois. Réfrigérer au moins 2 heures avant de servir.",
                "Melt chocolate in water bath. Off heat, add egg yolks one by one. Whip egg whites with a pinch of salt to stiff peaks. Gently fold whites into chocolate in batches. Refrigerate at least 2 hours before serving.",
                fr("Chocolat noir", "Œufs", "Sucre", "Sel"),
                en("Dark chocolate", "Eggs", "Sugar", "Salt"),
                m("200g", "6", "30g", "1 pincée"),
                tags("vegetarien", "sans-porc", "sans-gluten")),

            recipe("Coq au Vin", "Coq au Vin",
                "Plat principal", "Main course", "diner",
                "https://loremflickr.com/400/300/chicken,wine,stew",
                "2h", "Moyen", 4,
                "Faire mariner le poulet dans le vin rouge avec les herbes pendant 2 heures. Faire revenir les lardons et les champignons. Faire dorer les morceaux de poulet. Ajouter la marinade, les oignons et les lardons. Laisser mijoter 1h30. Rectifier l'assaisonnement.",
                "Marinate chicken in red wine with herbs for 2 hours. Brown lardons and mushrooms. Brown chicken pieces. Add marinade, onions and lardons. Simmer 1h30. Adjust seasoning.",
                fr("Poulet", "Vin rouge", "Lardons", "Champignons", "Oignons perlés", "Ail", "Thym", "Laurier", "Beurre"),
                en("Chicken", "Red wine", "Lardons", "Mushrooms", "Pearl onions", "Garlic", "Thyme", "Bay leaf", "Butter"),
                m("1.5kg", "75cl", "150g", "250g", "200g", "3 gousses", "2 brins", "2", "30g"),
                tags("sans-gluten")),

            recipe("Tarte aux Pommes", "Apple Tart",
                "Dessert", "Dessert", "dessert",
                "https://loremflickr.com/400/300/apple,tart",
                "1h", "Facile", 8,
                "Préchauffer le four à 180°C. Étaler la pâte dans un moule. Éplucher et trancher les pommes finement. Les disposer en rosace sur la pâte. Saupoudrer de sucre et de cannelle. Parsemer de noisettes de beurre. Enfourner 35 minutes. Badigeonner de gelée d'abricot à la sortie.",
                "Preheat oven to 180°C. Roll pastry in tin. Peel and thinly slice apples. Arrange in a rosette pattern over pastry. Sprinkle with sugar and cinnamon. Dot with butter. Bake 35 minutes. Glaze with apricot jelly when out of oven.",
                fr("Pâte brisée", "Pommes", "Sucre", "Cannelle", "Beurre", "Gelée d'abricot"),
                en("Shortcrust pastry", "Apples", "Sugar", "Cinnamon", "Butter", "Apricot jelly"),
                m("1 rouleau", "4", "50g", "1 c.c.", "20g", "2 c.s."),
                tags("vegetarien", "sans-porc")),

            recipe("Pain Perdu", "French Toast",
                "Petit-déjeuner", "Breakfast", "petit-dejeuner",
                "https://loremflickr.com/400/300/french,toast",
                "15min", "Facile", 4,
                "Battre les œufs avec le lait, le sucre et la vanille. Tremper les tranches de pain dans le mélange. Faire dorer dans le beurre 2 minutes de chaque côté. Saupoudrer de sucre glace. Servir avec du sirop d'érable ou de la confiture.",
                "Beat eggs with milk, sugar and vanilla. Dip bread slices in mixture. Brown in butter 2 minutes each side. Dust with powdered sugar. Serve with maple syrup or jam.",
                fr("Pain de mie", "Œufs", "Lait", "Sucre", "Vanille", "Beurre", "Sucre glace"),
                en("Sandwich bread", "Eggs", "Milk", "Sugar", "Vanilla", "Butter", "Powdered sugar"),
                m("8 tranches", "3", "15cl", "2 c.s.", "1 c.c.", "30g", "q.s."),
                tags("vegetarien", "sans-porc")),

            recipe("Croissants", "Croissants",
                "Petit-déjeuner", "Breakfast", "petit-dejeuner",
                "https://loremflickr.com/400/300/croissant,bakery",
                "3h", "Difficile", 8,
                "Préparer la détrempe avec farine, sucre, sel, levure et lait. Laisser lever 1 heure. Incorporer le beurre par feuilletage en faisant 3 tours. Réfrigérer 30 minutes entre chaque tour. Découper en triangles et rouler. Laisser lever 1 heure. Badigeonner de dorure et cuire à 200°C pendant 15 minutes.",
                "Make dough with flour, sugar, salt, yeast and milk. Rise 1 hour. Incorporate butter by laminating with 3 turns. Refrigerate 30 minutes between turns. Cut into triangles and roll. Rise 1 hour. Brush with egg wash and bake at 200°C for 15 minutes.",
                fr("Farine", "Beurre", "Lait", "Sucre", "Sel", "Levure", "Œuf"),
                en("Flour", "Butter", "Milk", "Sugar", "Salt", "Yeast", "Egg"),
                m("500g", "250g", "30cl", "50g", "10g", "10g", "1"),
                tags("vegetarien", "sans-porc")),

            recipe("Clafoutis aux Cerises", "Cherry Clafoutis",
                "Dessert", "Dessert", "dessert",
                "https://loremflickr.com/400/300/cherry,clafoutis,cake",
                "1h", "Facile", 6,
                "Préchauffer le four à 180°C. Beurrer un plat. Répartir les cerises. Mélanger les œufs, le sucre, la farine, le lait et la crème. Verser sur les cerises. Cuire 40 minutes. Saupoudrer de sucre glace avant de servir tiède.",
                "Preheat oven to 180°C. Butter a dish. Spread cherries. Mix eggs, sugar, flour, milk and cream. Pour over cherries. Bake 40 minutes. Dust with powdered sugar before serving warm.",
                fr("Cerises", "Œufs", "Sucre", "Farine", "Lait", "Crème", "Beurre", "Sucre glace"),
                en("Cherries", "Eggs", "Sugar", "Flour", "Milk", "Cream", "Butter", "Powdered sugar"),
                m("500g", "3", "100g", "80g", "25cl", "10cl", "20g", "q.s."),
                tags("vegetarien", "sans-porc"))
        ));
    }

    private Recipe recipe(String nameFr, String nameEn, String catFr, String catEn,
                          String mealType, String thumbnail, String duration, String difficulty,
                          int servings, String instrFr, String instrEn,
                          List<String> ingFr, List<String> ingEn, List<String> measures, List<String> tags) {
        Recipe r = new Recipe();
        r.setNameFr(nameFr);
        r.setNameEn(nameEn);
        r.setCategoryFr(catFr);
        r.setCategoryEn(catEn);
        r.setMealType(mealType);
        r.setThumbnail(thumbnail);
        r.setDuration(duration);
        r.setDifficulty(difficulty);
        r.setServings(servings);
        r.setInstructionsFr(instrFr);
        r.setInstructionsEn(instrEn);
        r.setIngredientsFr(ingFr);
        r.setIngredientsEn(ingEn);
        r.setMeasures(measures);
        r.setTags(tags);
        return r;
    }

    private List<String> fr(String... items) { return Arrays.asList(items); }
    private List<String> en(String... items) { return Arrays.asList(items); }
    private List<String> m(String... items)  { return Arrays.asList(items); }
    private List<String> tags(String... items) { return Arrays.asList(items); }
}