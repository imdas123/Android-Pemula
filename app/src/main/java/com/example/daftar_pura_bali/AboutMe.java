package com.example.daftar_pura_bali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AboutMe extends AppCompatActivity {

    TextView name, mail, phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        this.setTitle("About Me");

        name = findViewById(R.id.namaku);
        mail = findViewById(R.id.emailku);
        phone = findViewById(R.id.nomorku);

        name.setText("I Made Dwi Andika Saputra");
        mail.setText("saputragamers00@gmail.com");
        phone.setText("+6281-236-129-210");
    }
}