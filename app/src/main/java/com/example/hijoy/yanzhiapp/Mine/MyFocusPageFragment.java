package com.example.hijoy.yanzhiapp.Mine;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hijoy.yanzhiapp.R;

import java.util.ArrayList;
import java.util.List;


public class MyFocusPageFragment extends Fragment implements View.OnClickListener{
    private final String TAG = "FocusPage";
    View view;
    TabLayout mTabLayout;
    ViewPager mViewPager;

    FragmentManager fManager;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Log.d(TAG,"onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragment_my_focus_page,null);

        mTabLayout = (TabLayout)view.findViewById(R.id.tabMyFocus);
        mViewPager = (ViewPager)view.findViewById(R.id.tabViewPager);

        initTabView();
        fManager = getFragmentManager();

        view.findViewById(R.id.ib_back).setOnClickListener(this);

        Log.d(TAG,"onCreateView");
        return view;
    }


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ib_back:{

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

        /*mTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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
        });*/

        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        mTabLayout.addTab(mTabLayout.newTab().setText(mTitles.get(0)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mTitles.get(1)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mTitles.get(2)));

        mViewPager.setOffscreenPageLimit(3);

        fragmentAdapter = new FragmentAdapter(getChildFragmentManager(),mTitles,mFragmentList);
        mViewPager.setAdapter(fragmentAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG,"onAttach");
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG,"onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG,"onDestroyView");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG,"onDetach");
    }
}
