package com.nanofaroque.tablayoutdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

//set adapter to your ViewPager
        viewPager.setAdapter(new TabPagerAdapter(getSupportFragmentManager()));

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        TabLayout.Tab tab1 = tabLayout.getTabAt(0);
        tab1.setIcon(R.drawable.first_tab);

        TabLayout.Tab tab2 = tabLayout.getTabAt(1);
        tab2.setIcon(R.drawable.second_tab);

        TabLayout.Tab tab3 = tabLayout.getTabAt(2);
        tab3.setIcon(R.drawable.third_tab);

        TabLayout.Tab tab4 = tabLayout.getTabAt(3);
        tab4.setIcon(R.drawable.fourth_tab);

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

    }
}
