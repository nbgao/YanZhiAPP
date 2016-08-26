package com.example.hijoy.yanzhiapp.Mine;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hijoy.yanzhiapp.R;


public class UserPageFragment extends Fragment implements View.OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_user_page,null);

        view.findViewById(R.id.ib_back).setOnClickListener(this);
        view.findViewById(R.id.edit_user_information).setOnClickListener(this);
        view.findViewById(R.id.focus_others).setOnClickListener(this);
        view.findViewById(R.id.focus_me).setOnClickListener(this);
        view.findViewById(R.id.my_replies).setOnClickListener(this);
        view.findViewById(R.id.my_essays).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.ib_back:{
                getFragmentManager().popBackStack();
                break;
            }
            case R.id.edit_user_information:{
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new EditEducationInformationFragment()).addToBackStack(null).commit();
                break;
            }
            case R.id.focus_others:{
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new FocusOthersFragment()).addToBackStack(null).commit();
                break;
            }
            case R.id.focus_me:{
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new FocusMeFragment()).addToBackStack(null).commit();
                break;
            }
            case R.id.my_replies:{
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new MyRepliesFragment()).addToBackStack(null).commit();
                break;
            }
            case R.id.my_essays:{
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new MyEssaysFragment()).addToBackStack(null).commit();
                break;
            }

        }
    }

    @Override
    public void onPause(){
        super.onPause();
    }

}
