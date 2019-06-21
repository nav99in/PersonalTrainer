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
        Intent intent=new Intent(WeightLoose.this,Diet.class);
        startActivity(intent);
    }

    public void execr(View view) {
        Intent intent1=new Intent(WeightLoose.this,Exercise.class);
        startActivity(intent1);
    }
}
