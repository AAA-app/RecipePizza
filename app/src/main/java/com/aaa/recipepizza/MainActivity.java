package com.aaa.recipepizza;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.aaa.recipepizza.adapter.PizzaRViewAdapter;
import com.aaa.recipepizza.data.PizzaItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private GridLayoutManager gridLayoutManager;
    private int columnCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Pizza App ");

        columnCount = getResources().getInteger(R.integer.column_count);


        ArrayList<PizzaItem> pizzaRViewItems = new ArrayList<>();
        pizzaRViewItems.add(new PizzaItem(R.drawable.pizza1,
                Utils.PIZZA_1_TITLE, Utils.PIZZA_1_DESCRIPTION,
                Utils.PIZZA_1_RECIPE));
        pizzaRViewItems.add(new PizzaItem(R.drawable.pizza2,
                Utils.PIZZA_2_TITLE, Utils.PIZZA_2_DESCRIPTION,
                Utils.PIZZA_2_RECIPE));
        pizzaRViewItems.add(new PizzaItem(R.drawable.pizza3,
                Utils.PIZZA_3_TITLE, Utils.PIZZA_3_DESCRIPTION,
                Utils.PIZZA_3_RECIPE));
        pizzaRViewItems.add(new PizzaItem(R.drawable.pizza4,
                Utils.PIZZA_4_TITLE, Utils.PIZZA_4_DESCRIPTION,
                Utils.PIZZA_4_RECIPE));
        pizzaRViewItems.add(new PizzaItem(R.drawable.pizza5,
                Utils.PIZZA_5_TITLE, Utils.PIZZA_5_DESCRIPTION,
                Utils.PIZZA_5_RECIPE));
        pizzaRViewItems.add(new PizzaItem(R.drawable.pizza6,
                Utils.PIZZA_6_TITLE, Utils.PIZZA_6_DESCRIPTION,
                Utils.PIZZA_6_RECIPE));
        pizzaRViewItems.add(new PizzaItem(R.drawable.pizza7,
                Utils.PIZZA_7_TITLE, Utils.PIZZA_7_DESCRIPTION,
                Utils.PIZZA_7_RECIPE));
        pizzaRViewItems.add(new PizzaItem(R.drawable.pizza8,
                Utils.PIZZA_8_TITLE, Utils.PIZZA_8_DESCRIPTION,
                Utils.PIZZA_8_RECIPE));
        pizzaRViewItems.add(new PizzaItem(R.drawable.pizza9,
                Utils.PIZZA_9_TITLE, Utils.PIZZA_9_DESCRIPTION,
                Utils.PIZZA_9_RECIPE));
        pizzaRViewItems.add(new PizzaItem(R.drawable.pizza10,
                Utils.PIZZA_10_TITLE, Utils.PIZZA_10_DESCRIPTION,
                Utils.PIZZA_10_RECIPE));

        recyclerView = findViewById(R.id.pizzaRecyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new PizzaRViewAdapter(pizzaRViewItems, this);
        gridLayoutManager = new GridLayoutManager(this, columnCount);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(gridLayoutManager);
    }
}
