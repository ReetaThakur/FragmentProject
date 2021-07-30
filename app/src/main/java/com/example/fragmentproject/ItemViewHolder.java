package com.example.fragmentproject;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView name;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.ivAnimal);
        name=itemView.findViewById(R.id.tvName);
    }
    public void setData(ItemModel itemModel){
        imageView.setImageResource(itemModel.getImage());
        name.setText(itemModel.getName());
    }
}
