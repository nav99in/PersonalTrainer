package com.example.personaltrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WeightLoose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_loose);
    }

    public void dite(View view) {
        Intent i=new Intent(WeightLoose.this,Diet.class);
        startActivity(i);
    }
}
