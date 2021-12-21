package com.example.daftar_pura_bali;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailPura extends AppCompatActivity {

    ImageView gambarPura;
    TextView namaPura, lokasiPura, deskripsiPura;
    DaftarPura listTemple;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pura);
        this.setTitle("Detail Pura");

        gambarPura = findViewById(R.id.gambar_detail);
        namaPura = findViewById(R.id.text_namaPura);
        lokasiPura = findViewById(R.id.text_lokasiPura);
        deskripsiPura = findViewById(R.id.text_deskripsi_Pura);

        int foto = getIntent().getIntExtra("Image", 0);
        String nama = getIntent().getStringExtra("nama_pura");
        String lokasi = getIntent().getStringExtra("lokasi_pura");
        String detail = getIntent().getStringExtra("detail_pura");

        Picasso.get().load(foto).into(gambarPura);
        namaPura.setText(nama);
        lokasiPura.setText(lokasi);
        deskripsiPura.setText(detail);
        deskripsiPura.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
    }

}