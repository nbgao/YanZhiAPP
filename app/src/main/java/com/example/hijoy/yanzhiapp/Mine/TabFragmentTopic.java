package com.example.hijoy.yanzhiapp.Mine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hijoy.yanzhiapp.R;

public class TabFragmentTopic extends Fragment {

    protected View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.tab_fragment_topic,container,false);

        return view;
    }

}
