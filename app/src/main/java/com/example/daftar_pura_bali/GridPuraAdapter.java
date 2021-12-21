package com.example.daftar_pura_bali;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class GridPuraAdapter extends RecyclerView.Adapter<GridPuraAdapter.GridViewHolder> {
    private GridPuraAdapter.OnItemClickCallBack onItemClickCallBack;

    public void setOnItemClickCallBack(GridPuraAdapter.OnItemClickCallBack onItemClickCallBack) {
        this.onItemClickCallBack = onItemClickCallBack;
    }

    private ArrayList<DaftarPura> listPura;

    public GridPuraAdapter(ArrayList<DaftarPura> listPura) {
        this.listPura = listPura;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_pura, parent, false);
        return new GridPuraAdapter.GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, @SuppressLint({"GridView", "RecyclerView"}) int position) {
        DaftarPura pura = listPura.get(position);
        Picasso.get().load(pura.getFoto()).into(holder.fotoGrid);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallBack.onItemClicked(listPura.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPura.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView fotoGrid;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            fotoGrid = itemView.findViewById(R.id.image_grid);
        }
    }

    public interface OnItemClickCallBack {
        void onItemClicked(DaftarPura daftar);
    }
}
