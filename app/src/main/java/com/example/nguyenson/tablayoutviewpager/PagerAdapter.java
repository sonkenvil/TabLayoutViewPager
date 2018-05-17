package com.example.nguyenson.tablayoutviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> mList = new ArrayList<>();
    private List<String> mTitle= new ArrayList<>();

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }
    void addFragment(Fragment fragment, String title){
        mList.add(fragment);
        mTitle.add(title);
    }
    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitle.get(position);
    }
}
