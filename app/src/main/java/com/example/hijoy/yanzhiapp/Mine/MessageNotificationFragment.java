package com.example.hijoy.yanzhiapp.Mine;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import com.example.hijoy.yanzhiapp.R;

import static com.example.hijoy.yanzhiapp.R.style.Switch;


public class MessageNotificationFragment extends Fragment implements View.OnClickListener ,CompoundButton.OnCheckedChangeListener {

    Switch switch1;
    Switch switch2;
    Switch switch3;
    Switch switch4;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_message_notification,null);

        view.findViewById(R.id.ib_back).setOnClickListener(this);
        view.findViewById(R.id.click1).setOnClickListener(this);
        view.findViewById(R.id.click2).setOnClickListener(this);
        view.findViewById(R.id.click3).setOnClickListener(this);
        view.findViewById(R.id.click4).setOnClickListener(this);

        switch1 = (Switch)view.findViewById(R.id.switch1);
        switch2 = (Switch)view.findViewById(R.id.switch2);
        switch3 = (Switch)view.findViewById(R.id.switch3);
        switch4 = (Switch)view.findViewById(R.id.switch4);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ib_back:{
                getFragmentManager().popBackStack();
                break;
            }
            case R.id.click1:{
                if(switch1.isChecked()){
                    switch1.setChecked(false);
                }else{
                    switch1.setChecked(true);
                }
                break;
            }
            case R.id.click2:{
                if(switch2.isChecked()){
                    switch2.setChecked(false);
                }else{
                    switch2.setChecked(true);
                }
                break;
            }case R.id.click3:{
                if(switch3.isChecked()){
                    switch3.setChecked(false);
                }else{
                    switch3.setChecked(true);
                }
                break;
            }
            case R.id.click4:{
                if(switch4.isChecked()){
                    switch4.setChecked(false);
                }else{
                    switch4.setChecked(true);
                }
                break;
            }

        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()){
            case R.id.switch1:{

                break;
            }
            case R.id.switch2:{

                break;
            }
            case R.id.switch3:{

                break;
            }
            case R.id.switch4:{

                break;
            }
        }
    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
