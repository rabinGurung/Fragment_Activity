package com.example.fragment_activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;

import Fragments.First_Fragment;
import Fragments.Second_Fragment;

public class TabActivity extends AppCompatActivity {
    private TabLayout tableLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablayout);
        tableLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpage);

        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(getSupportFragmentManager());

        viewPageAdapter.addFragment(new First_Fragment(),"login");
        viewPageAdapter.addFragment(new Second_Fragment(),"Circle");
        viewPager.setAdapter(viewPageAdapter);
        tableLayout.setupWithViewPager(viewPager);

    }
}
