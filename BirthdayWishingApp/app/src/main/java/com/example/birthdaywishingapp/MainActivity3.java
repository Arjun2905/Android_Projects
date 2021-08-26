package com.example.birthdaywishingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent fromPage2 = getIntent();
        String Person = fromPage2.getStringExtra("name");
        TextView textView = (TextView) findViewById((R.id.WishingNote));
        textView.setText("Happy Birthday " + Person);
    }
}