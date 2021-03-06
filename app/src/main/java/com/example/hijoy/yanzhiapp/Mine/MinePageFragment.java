package com.example.hijoy.yanzhiapp.Mine;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.hijoy.yanzhiapp.R;


public class MinePageFragment extends Fragment implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_mine_page,null);

        view.findViewById(R.id.ib_setting).setOnClickListener(this);
        view.findViewById(R.id.user).setOnClickListener(this);
        view.findViewById(R.id.my_focus).setOnClickListener(this);
        view.findViewById(R.id.my_collection).setOnClickListener(this);
        view.findViewById(R.id.my_script).setOnClickListener(this);
        view.findViewById(R.id.recent_views).setOnClickListener(this);
        view.findViewById(R.id.personal_wallet).setOnClickListener(this);
        view.findViewById(R.id.my_vip).setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.ib_setting: {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new SettingPageFragment()).addToBackStack(null).commit();
                break;
            }
            case R.id.user:{
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new UserPageFragment()).addToBackStack(null).commit();
                break;
            }
            case R.id.my_focus:{
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new MyFocusPageFragment()).addToBackStack(null).commit();
                break;
            }
            case R.id.my_collection:{
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new MyCollectionPageFragment()).addToBackStack(null).commit();
                break;
            }
            case R.id.my_script:{
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new MyScriptPageFragment()).addToBackStack(null).commit();
                break;
            }
            case R.id.recent_views:{
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new RecentViewsPageFragment()).addToBackStack(null).commit();
                break;
            }
            case R.id.personal_wallet:{
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new PersonalWalletPageFragment()).addToBackStack(null).commit();
                break;
            }
            case R.id.my_vip:{
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new MyVipPageFragment()).addToBackStack(null).commit();
                break;
            }
        }
    }


    @Override
    public void onPause(){
        super.onPause();
    }
}
