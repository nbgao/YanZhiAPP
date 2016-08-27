package com.example.hijoy.yanzhiapp.Mine;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hijoy.yanzhiapp.R;


public class IdManagerFragment extends Fragment implements View.OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_id_manager,null);

        view.findViewById(R.id.ib_back).setOnClickListener(this);
        view.findViewById(R.id.change_password).setOnClickListener(this);

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
        }
    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
