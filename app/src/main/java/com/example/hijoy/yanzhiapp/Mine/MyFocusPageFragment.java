package com.example.hijoy.yanzhiapp.Mine;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hijoy.yanzhiapp.R;

import java.util.ArrayList;
import java.util.List;


public class MyFocusPageFragment extends Fragment implements View.OnClickListener{

    TabLayout mTabLayout;
    ViewPager mViewPager;

    FragmentManager fManager;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_my_focus_page,null);

        mTabLayout = (TabLayout)view.findViewById(R.id.tabMyFocus);
        mViewPager = (ViewPager)view.findViewById(R.id.tabViewPager);

        initTabView();
        fManager = getFragmentManager();


        view.findViewById(R.id.ib_back).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ib_back:{
                getFragmentManager().popBackStack();
                break;
            }
        }
    }

    public void initTabView(){
        List<Fragment> mFragmentList = new ArrayList<>();
        List<String> mTitles = new ArrayList<>();

        TabFragmentCollection tabFragmentCollection = new TabFragmentCollection();
        TabFragmentPost tabFragmentPost = new TabFragmentPost();
        TabFragmentTopic tabFragmentTopic = new TabFragmentTopic();

        FragmentAdapter fragmentAdapter;


        mTitles.add("收藏");
        mTitles.add("帖子");
        mTitles.add("话题");

        mFragmentList.add(tabFragmentCollection);
        mFragmentList.add(tabFragmentPost);
        mFragmentList.add(tabFragmentTopic);

        mTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        mTabLayout.addTab(mTabLayout.newTab().setText(mTitles.get(0)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mTitles.get(1)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mTitles.get(2)));

        mViewPager.setOffscreenPageLimit(0);

        fragmentAdapter = new FragmentAdapter(getFragmentManager(),mTitles,mFragmentList);
        mViewPager.setAdapter(fragmentAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }



    @Override
    public void onPause(){
        super.onPause();
    }

}
