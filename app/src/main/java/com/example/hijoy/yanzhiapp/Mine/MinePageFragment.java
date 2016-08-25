package com.example.hijoy.yanzhiapp.Mine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hijoy.yanzhiapp.R;


public class MinePageFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_mine_page,null);
        view.findViewById(R.id.ib_setting).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SettingPageFragment settingPageFragment = new SettingPageFragment();
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container,settingPageFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        /*
        view.findViewById(R.id.my_vip).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_mine,new fr)
            }
        });
        */

        return view;
    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
