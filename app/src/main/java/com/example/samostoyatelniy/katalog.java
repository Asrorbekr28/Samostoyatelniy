package com.example.samostoyatelniy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class katalog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog);
    }
    public void opisanie(View v) {
        Intent intent = new Intent(this, OpisanieRestoran.class);
        startActivity(intent);
    }
}