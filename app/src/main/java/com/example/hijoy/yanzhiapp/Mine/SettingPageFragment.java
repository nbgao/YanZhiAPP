package com.example.hijoy.yanzhiapp.Mine;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.hijoy.yanzhiapp.R;


public class SettingPageFragment extends Fragment implements View.OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_setting_page,null);

        view.findViewById(R.id.ib_back).setOnClickListener(this);
        view.findViewById(R.id.id_manager).setOnClickListener(this);
        view.findViewById(R.id.message_notification).setOnClickListener(this);
        view.findViewById(R.id.font_size).setOnClickListener(this);
        view.findViewById(R.id.evaluation_center).setOnClickListener(this);
        view.findViewById(R.id.check_update).setOnClickListener(this);
        view.findViewById(R.id.clear_netflow).setOnClickListener(this);
        view.findViewById(R.id.night_mode).setOnClickListener(this);
        view.findViewById(R.id.btn_exit_id).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ib_back:{
                getFragmentManager().popBackStack();
                break;
            }
            case R.id.id_manager:{
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new IdManagerFragment()).addToBackStack(null).commit();
                break;
            }
            case R.id.message_notification:{
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new MessageNotificationFragment()).addToBackStack(null).commit();
                break;
            }
            case R.id.font_size:{
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new FontSizeFragment()).addToBackStack(null).commit();
                break;
            }
            case R.id.evaluation_center:{
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new EvaluationCenterFragment()).addToBackStack(null).commit();
                break;
            }
            case R.id.check_update:{

                break;
            }
            case R.id.clear_netflow:{

                break;
            }
            case R.id.night_mode:{

                break;
            }
            case R.id.btn_exit_id:{
                AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());
                dialog.setTitle("退出登陆")
                        .setMessage("是否确认退出登录？")
                        .setCancelable(true)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .show();
                break;
            }
        }
    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
