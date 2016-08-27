package com.example.hijoy.yanzhiapp.Mine;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hijoy.yanzhiapp.R;


public class MyCollectionPageFragment extends Fragment implements View.OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_my_collection_page,null);

        view.findViewById(R.id.ib_back).setOnClickListener(this);
        view.findViewById(R.id.btn_my_collection_edit).setOnClickListener(this);
        view.findViewById(R.id.btn_create_commit).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ib_back:{
                getFragmentManager().popBackStack();
            }
            case R.id.btn_my_collection_edit:{
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new EditCollectionFragment()).addToBackStack(null).commit();
                break;
            }
            case R.id.btn_create_collection:{
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new CreateCollectionFragment()).addToBackStack(null).commit();
                break;
            }
        }
    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
