package com.example.recipeapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RecipeListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list);

        // Fetch the ListView from XML
        ListView recipeListView = findViewById(R.id.recipeListView);

        // Get the category passed from MainActivity
        String category = getIntent().getStringExtra("category");

        // Create a list of recipes based on the selected category
        ArrayList<String> recipes = new ArrayList<>();
        if ("Appetizers".equals(category)) {
            recipes.add("Spring Rolls");
            recipes.add("Bruschetta");
        } else if ("Main Course".equals(category)) {
            recipes.add("Grilled Chicken");
            recipes.add("Pasta Alfredo");
        } else if ("Desserts".equals(category)) {
            recipes.add("Chocolate Cake");
            recipes.add("Ice Cream Sundae");
        }

        // Populate the ListView with the recipes
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, recipes);
        recipeListView.setAdapter(adapter);
    }
}
