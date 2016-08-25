package com.example.hijoy.yanzhiapp.Mine;


import android.os.Bundle;

import com.example.hijoy.yanzhiapp.R;
import com.example.hijoy.yanzhiapp.Start.LoginPageActivity;


public class MineActivity extends LoginPageActivity{


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine_page);

        if(findViewById(R.id.fragment_container) != null){
            if(savedInstanceState != null){
                return;
            }

            MinePageFragment minePageFragment = new MinePageFragment();
            minePageFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_container,minePageFragment)
                    .commit();

        }
    }


}
