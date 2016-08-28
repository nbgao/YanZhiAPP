package com.example.hijoy.yanzhiapp.Mine;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;


public class FragmentAdapter extends FragmentPagerAdapter {
    private List<String> mTitles;
    private List<Fragment> mFragments;

    public FragmentAdapter(FragmentManager fragmentManager, List<String> titles, List<Fragment> fragments){
        super(fragmentManager);
        mTitles = titles;
        mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position){
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position){
        return mTitles.get(position);
    }

}
