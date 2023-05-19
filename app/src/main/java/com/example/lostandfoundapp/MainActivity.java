package com.example.lostandfoundapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.lostandfoundapp.data.DatabaseHelper;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new DatabaseHelper(this);
    }
    public void onClickShow(View view) {
        Intent showIntent = new Intent(MainActivity.this, DisplayAdvertisment.class);
        startActivity(showIntent);
    }
    public void onClickCreate(View view) {
        Intent signupIntent = new Intent(MainActivity.this, CreateActivity.class);
        startActivity(signupIntent);
    }
}