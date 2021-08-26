package com.example.birthdaywishingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextFunction(View view) {
        EditText name = (EditText) findViewById(R.id.PersonName);
        String Name = String.valueOf(name.getText());
        Intent backgroundPage = new Intent();
        backgroundPage.setClass(this, MainActivity3.class);
        backgroundPage.putExtra("name", Name);
        startActivity(backgroundPage);
    }
}