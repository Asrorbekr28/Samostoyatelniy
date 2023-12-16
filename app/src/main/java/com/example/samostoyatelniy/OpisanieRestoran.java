package com.example.samostoyatelniy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OpisanieRestoran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opisanie_restoran);
    }

    public void welcome(View v) {
        Intent intent = new Intent(this, katalog.class);
        startActivity(intent);
    }

    public void karta(View v) {
        Intent intent = new Intent(this, geokarta.class);
        startActivity(intent);
    }
}