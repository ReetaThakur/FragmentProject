package com.example.fragmentproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    private ArrayList<ItemModel> itemList;
    public ItemAdapter(ArrayList<ItemModel> itemList){
        this.itemList=itemList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  ItemViewHolder holder, int position) {

        ItemModel itemModel=itemList.get(position);
        holder.setData(itemModel);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
