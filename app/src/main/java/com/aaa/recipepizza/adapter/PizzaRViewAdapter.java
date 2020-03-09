package com.aaa.recipepizza.adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aaa.recipepizza.R;
import com.aaa.recipepizza.RecipeActivity;
import com.aaa.recipepizza.data.PizzaItem;

import java.util.ArrayList;


public class PizzaRViewAdapter extends RecyclerView.Adapter<PizzaRViewAdapter.RvViewHolder> {

    ArrayList<PizzaItem> pizzaArrayList;
    Context context;

    public PizzaRViewAdapter(ArrayList<PizzaItem> pizzaArrayList, Context context){
        this.pizzaArrayList = pizzaArrayList;
        this.context = context;

    }

    @NonNull
    @Override
    public RvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item, parent, false);
        return new RvViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RvViewHolder holder, int position) {

        PizzaItem pizzaItem = pizzaArrayList.get(position);
        holder.pizzaImageView.setImageResource(pizzaItem.getImageResource());
        holder.title.setText(pizzaItem.getTitle());
        holder.description.setText(pizzaItem.getDescription());
    }


    @Override
    public int getItemCount() {
       return pizzaArrayList.size();
    }

    class RvViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView pizzaImageView;
        public TextView title;
        public TextView description;

    public RvViewHolder(@NonNull View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

        pizzaImageView = itemView.findViewById(R.id.pizza_imageView);
        title = itemView.findViewById(R.id.titleTextView);
        description = itemView.findViewById(R.id.descriptionTextView);
    }

       @Override
       public void onClick(View v) {

        int position = getAdapterPosition();
        PizzaItem pizzaItem = pizzaArrayList.get(position);

           Intent intent = new Intent(context, RecipeActivity.class);
           intent.putExtra("imageResource", pizzaItem.getImageResource());
           intent.putExtra("title", pizzaItem.getTitle());
           intent.putExtra("description", pizzaItem.getDescription());
           intent.putExtra("recipe", pizzaItem.getRecipe());
           context.startActivity(intent);
       }
   }
}
