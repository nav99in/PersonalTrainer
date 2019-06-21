package com.example.personaltrainer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.example.personaltrainer.main.SectionsPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class Exec extends AppCompatActivity {
    private static final String TAG="MainActivity";
    private SectionsPagerAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exec);


        Log.d(TAG,"onCreate:String.");

        mSectionsPageAdapter=new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager=findViewById(R.id.view_pag);
        setupViewPager(mViewPager);



        tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }
    public void setupViewPager(ViewPager viewPager){

        SectionsPagerAdapter adapter=new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Walking_Fragment(),"Walking");
        adapter.addFragment(new Swimming_Fragment(),"Swimming");
        adapter.addFragment(new Cycling_Fragment(),"Cycling");
        adapter.addFragment(new Running_Fragment(),"Running");
        adapter.addFragment(new Jumprope_Fragment(),"Jumping Rope");
        viewPager.setAdapter(adapter);

    }}