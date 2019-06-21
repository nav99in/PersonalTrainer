package com.example.personaltrainer;

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
    public void loosweight(View view) {
        Intent intent = new Intent(MainActivity.this, WeightLoose.class);
        startActivity(intent);
    }

    public void gainweight(View view) {
        Intent intent1 = new Intent(MainActivity.this, Exercise.class);
        startActivity(intent1);
    }

    public void haircare(View view) {
    }

    public void bodycare(View view) {
    }

    public void generaltips(View view) {
    }

    public void skincare(View view) {
    }
}
