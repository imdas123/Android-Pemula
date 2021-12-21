package com.example.daftar_pura_bali;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPura;
    private ArrayList<DaftarPura> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Daftar Pura");

        rvPura = findViewById(R.id.rv_daftarPura);
        rvPura.setHasFixedSize(true);

        list.addAll(DataPura.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvPura.setLayoutManager(new LinearLayoutManager(this));
        ListPuraAdapter listPuraAdapter = new ListPuraAdapter(list);
        rvPura.setAdapter(listPuraAdapter);

        listPuraAdapter.setOnItemClickCallBack(new ListPuraAdapter.OnItemClickCallBack() {
            @Override
            public void onItemClicked(DaftarPura daftar) {
                ShowDetailTemple_in_Bali(daftar);
            }
        });
    }

    private void ShowDetailTemple_in_Bali(DaftarPura daftar) {
        Intent intent = new Intent(MainActivity.this, DetailPura.class);
        intent.putExtra("Image", daftar.getFoto());
        intent.putExtra("nama_pura", daftar.getNamaPura());
        intent.putExtra("lokasi_pura", daftar.getLokasiPura());
        intent.putExtra("detail_pura", daftar.getDeskripsi());
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int itemId) {
        switch (itemId) {
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
            case R.id.action_about:
                startActivity(new Intent(MainActivity.this, AboutMe.class));
                break;
        }
    }

    private void showRecyclerGrid() {
        rvPura.setLayoutManager(new GridLayoutManager(this,2));
        GridPuraAdapter gridPuraAdapter = new GridPuraAdapter(list);
        rvPura.setAdapter(gridPuraAdapter);

        gridPuraAdapter.setOnItemClickCallBack(new GridPuraAdapter.OnItemClickCallBack() {
            @Override
            public void onItemClicked(DaftarPura daftar) {
                ShowDetailTemple_in_Bali(daftar);
            }
        });
    }


}