package com.aaa.recipepizza;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

////        //full screen
//       getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageView pizzaImageView = findViewById(R.id.pizzaImageView_onClick);
        TextView title = findViewById(R.id.titleOfPizzaTextView);
        TextView description = findViewById(R.id.descriptionOfPizzaTextView);
        TextView resipe = findViewById(R.id.recipeOfPizzaTextView);


        Intent intent = getIntent();
        if (intent != null) {
            pizzaImageView.setImageResource(intent.getIntExtra("imageResource", 0));
            title.setText(intent.getStringExtra("title"));
            description.setText(intent.getStringExtra("description"));
            resipe.setText(intent.getStringExtra("recipe"));

        }
    }
}
