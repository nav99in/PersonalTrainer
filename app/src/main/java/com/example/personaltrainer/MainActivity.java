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
        Intent intent2 = new Intent(MainActivity.this,Hair_Care.class);
        startActivity(intent2);
    }

    public void bodycare(View view) {
        Intent intent3 = new Intent(MainActivity.this,Body_Care.class);
        startActivity(intent3);
    }

    public void generaltips(View view) {
        Intent intent4 = new Intent(MainActivity.this,General_Tips.class);
        startActivity(intent4);
    }

    public void skincare(View view) {
        Intent intent5 = new Intent(MainActivity.this,Skin_Care.class);
        startActivity(intent5);
    }
}
