package com.example.assignment1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickMe(View view) {
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Hello")
                .setMessage("You clicked the button. Good job!")
                .setNegativeButton("Thanks!", null)
                .show();
    }

    public void nextActivity(View view) {
        Intent intent = new Intent(this, NextPage.class);
        startActivity(intent);
    }
}