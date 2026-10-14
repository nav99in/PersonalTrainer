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
        startActivity(new Intent(this, WeightLoose.class));
    }

    public void gainweight(View view) {
        startActivity(new Intent(this, Exercise.class));
    }



    public void haircare(View view) {
        InfoActivity.start(this, R.string.hair_care);
    }

    public void bodycare(View view) {
        InfoActivity.start(this, R.string.body_care);
    }

    public void generaltips(View view) {
        InfoActivity.start(this, R.string.general_tips);
    }

    public void skincare(View view) {
        InfoActivity.start(this, R.string.skin_care);
    }
}
