package com.example.recipeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Programmatically add menu items
        menu.add(0, 1, 0, "Appetizers");
        menu.add(0, 2, 0, "Main Course");
        menu.add(0, 3, 0, "Desserts");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(this, RecipeListActivity.class);
        switch (item.getItemId()) {
            case 1:
                intent.putExtra("category", "Appetizers");
                break;
            case 2:
                intent.putExtra("category", "Main Course");
                break;
            case 3:
                intent.putExtra("category", "Desserts");
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        startActivity(intent);
        return true;
    }
}
