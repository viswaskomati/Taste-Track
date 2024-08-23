package com.example.foodapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class rvadapter extends RecyclerView.Adapter<rvadapter.ViewHolder> {
   private final RecyclerViewInterface recyclerViewInterface;
    Context context;
   ArrayList<resdatamodel> resn;
    rvadapter(Context context,ArrayList<resdatamodel>resn,RecyclerViewInterface recyclerViewInterface){
        this.context=context;
        this.resn=resn;
        this.recyclerViewInterface=recyclerViewInterface;

    }
    @NonNull
    @Override
    public rvadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view  = LayoutInflater.from(context).inflate(R.layout.res_names,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull rvadapter.ViewHolder holder, int position) {

        holder.imag.setImageResource(resn.get(position).image);
        holder.txtName.setText(resn.get(position).Resname);
    }

    @Override
    public int getItemCount() {
        return resn.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder  {
       TextView txtName;
       ImageView imag;

        public ViewHolder(@NonNull View itemview){
            super(itemview);
            txtName=itemview.findViewById(R.id.textView10);
            imag=itemview.findViewById(R.id.cartimage);

            itemview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(recyclerViewInterface!=null){
                        int pos=getAdapterPosition();
                        if(pos!=RecyclerView.NO_POSITION){
                            recyclerViewInterface.onItemClick(pos);
                        }


                    }
                }
            });

        }

    }
    }


