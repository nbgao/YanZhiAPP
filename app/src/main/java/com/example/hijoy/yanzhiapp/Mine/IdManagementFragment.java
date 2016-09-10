package com.example.hijoy.yanzhiapp.Mine;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.example.hijoy.yanzhiapp.R;


public class IdManagementFragment extends Fragment implements View.OnClickListener,CompoundButton.OnCheckedChangeListener{

    Switch switch_wechat;
    Switch switch_weibo;
    Switch switch_qq;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_id_management,null);

        view.findViewById(R.id.ib_back).setOnClickListener(this);
        view.findViewById(R.id.change_password).setOnClickListener(this);

        view.findViewById(R.id.wechat_id).setOnClickListener(this);
        view.findViewById(R.id.weibo_id).setOnClickListener(this);
        view.findViewById(R.id.qq_id).setOnClickListener(this);

        switch_wechat = (Switch)view.findViewById(R.id.switch_wechat);
        switch_weibo = (Switch)view.findViewById(R.id.switch_weibo);
        switch_qq = (Switch)view.findViewById(R.id.switch_qq);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ib_back:{
                getFragmentManager().popBackStack();
                break;
            }
            case R.id.change_password:{
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new ChangePasswordFragment()).addToBackStack(null).commit();
                break;
            }
            case R.id.wechat_id:{
                if(switch_wechat.isChecked()){
                    switch_wechat.setChecked(false);
                }else{
                    switch_wechat.setChecked(true);
                }
                break;
            }
            case R.id.weibo_id:{
                if(switch_weibo.isChecked()){
                    switch_weibo.setChecked(false);
                }else{
                    switch_weibo.setChecked(true);
                }
                break;
            }
            case R.id.qq_id:{
                if(switch_qq.isChecked()){
                    switch_qq.setChecked(false);
                }else{
                    switch_qq.setChecked(true);
                }
                break;
            }

        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()){
            case R.id.switch_wechat:{

                break;
            }
            case R.id.switch_weibo:{

                break;
            }
            case R.id.switch_qq:{

                break;
            }
        }
    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
