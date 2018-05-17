package com.example.nguyenson.tablayoutviewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = findViewById(R.id.viewpager);
        mTabLayout = findViewById(R.id.tablayout);
        setupViewPager(mViewPager);
        mTabLayout.setupWithViewPager(mViewPager);
        setupTabIcons();
    }
    private void setupViewPager(ViewPager viewPager){
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FirstFragment(),"First");
        adapter.addFragment(new SecondFragment(), "Second");
        adapter.addFragment(new ThirdFragment(), "Third");
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(3);
    }
    private void setupTabIcons() {
        mTabLayout.setBackgroundColor(getResources().getColor(R.color.colorRegentGray));
        for(int i = 0 ; i < 3 ; i ++){
            mTabLayout.getTabAt(i).setIcon(R.mipmap.ic_launcher);
        }
    }
}
