package com.example.personaltrainer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.example.personaltrainer.main.SectionsPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class Diet extends AppCompatActivity {
    private static final String TAG="MainActivity";
   private SectionsPagerAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        Log.d(TAG,"onCreate:String.");

        mSectionsPageAdapter=new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager=findViewById(R.id.view_pager);
        setupViewPager(mViewPager);



        tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }
    public void setupViewPager(ViewPager viewPager){

        SectionsPagerAdapter adapter=new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1_Fragment(),"DIET1");
        adapter.addFragment(new Tab2_Fragment(),"DIET2");
        adapter.addFragment(new Tab3_Fragment(),"DIET3");
        viewPager.setAdapter(adapter);

    }}
