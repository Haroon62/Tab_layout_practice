package com.example.tab_layout_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    Toolbar toolbar;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tab);
        viewPager=findViewById(R.id.page);
        toolbar=findViewById(R.id.myAppbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Watsapp");

        View_page_adaptor view_page_adaptor=new View_page_adaptor(getSupportFragmentManager());
        viewPager.setAdapter(view_page_adaptor);
        tabLayout.setupWithViewPager(viewPager);
    }
}