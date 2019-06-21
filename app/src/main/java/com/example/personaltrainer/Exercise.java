package com.example.personaltrainer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.personaltrainer.main.SectionsPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class Exercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

    }


    public void cardio(View view) {
    }

    public void yoga(View view) {
        Intent intent=new Intent(Exercise.this,Exec.class);
        startActivity(intent);
        }

    public void st(View view) {
        Intent intent1=new Intent(Exercise.this,Bmi.class);
        startActivity(intent1);
    }
}

