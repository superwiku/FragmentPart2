package com.example.fragmentpart2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;
    TabFragmentPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=(Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        viewPager=(ViewPager)findViewById(R.id.pager);
        pagerAdapter=new TabFragmentPagerAdapter(getSupportFragmentManager(),0);
        viewPager.setAdapter(pagerAdapter);

        tabLayout=(TabLayout)findViewById(R.id.tab_layout);
        tabLayout.setTabTextColors(getResources().getColor(R.color.colorPrimaryDark),getResources().getColor(R.color.colorWhite));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }
}