package com.example.android.myfirstapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nmatveev on 10.11.2017.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ItemCategoryViewHolder> {





    public static class ItemCategoryViewHolder extends RecyclerView.ViewHolder{

        RecyclerView rv;
        TextView tvName;
        TextView tvAddress;
        TextView tvNumbers;
        ImageView image;



        public ItemCategoryViewHolder(View itemView) {
            super(itemView);
            rv = itemView.findViewById(R.id.recycleView);
            tvName = itemView.findViewById(R.id.textName);
            tvAddress = itemView.findViewById(R.id.textAddress);
            tvNumbers = itemView.findViewById(R.id.textNumber);
            image = itemView.findViewById(R.id.image);

        }
    }
    ArrayList<Category> categories;
    public CategoryAdapter(ArrayList<Category> categories){
        this.categories = categories;

    }

    public ItemCategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item,parent,false);
        ItemCategoryViewHolder vh = new ItemCategoryViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ItemCategoryViewHolder holder, int position) {
        holder.tvName.setText(categories.get(position).getmName());
        holder.tvAddress.setText(categories.get(position).getmAddress());
        holder.tvNumbers.setText(categories.get(position).getmNumber());
        holder.image.setImageResource(categories.get(position).getmPhoto());
    }




    @Override
    public int getItemCount() {
        return 4;
    }
}
