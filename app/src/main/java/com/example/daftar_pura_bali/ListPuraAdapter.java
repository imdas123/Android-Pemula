package com.example.daftar_pura_bali;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ListPuraAdapter extends RecyclerView.Adapter<ListPuraAdapter.ViewHolder> {
    private OnItemClickCallBack onItemClickCallBack;

    public void setOnItemClickCallBack(OnItemClickCallBack onItemClickCallBack) {
        this.onItemClickCallBack = onItemClickCallBack;
    }


    private ArrayList<DaftarPura> listPura;

    public ListPuraAdapter(ArrayList<DaftarPura> list) {
        this.listPura = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.kontent_list, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("WrongConstant")
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DaftarPura temple = listPura.get(position);
        holder.tvNama.setText(temple.getNamaPura());
        holder.tvDetail.setText(temple.getDeskripsi());
        holder.tvDetail.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
        Picasso.get().load(temple.getFoto()).into(holder.imgPhoto);

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

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvDetail;

        public ViewHolder(@NonNull View view) {
            super(view);
            imgPhoto = view.findViewById(R.id.gambar_list);
            tvNama = view.findViewById(R.id.list_namaPura);
            tvDetail = view.findViewById(R.id.list_deskripsiPura);
        }
    }

    public interface OnItemClickCallBack {
        void onItemClicked(DaftarPura daftar);
    }
}
