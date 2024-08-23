package com.example.foodapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerRestAdapter extends RecyclerView.Adapter<RecyclerRestAdapter.ViewHolder> {
    private ArrayList<String> itemList;

    public RecyclerRestAdapter(ArrayList<String> itemList) {
        this.itemList = itemList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.res_names, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String item = itemList.get(position);
        holder.itemText.setText(item);
    }

    @Override
    public int getItemCount() {

        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemText;
        ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            itemText=itemText.findViewById(R.id.imageView10);
            image=image.findViewById(R.id.cartimage);

        }


    }
}
