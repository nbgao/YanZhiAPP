package com.example.hijoy.yanzhiapp.Mine;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hijoy.yanzhiapp.R;


public class EditCollectionFragment extends Fragment implements View.OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_edit_collection,null);

        view.findViewById(R.id.btn_delete_collection).setOnClickListener(this);
        view.findViewById(R.id.btn_edit_commit).setOnClickListener(this);
        view.findViewById(R.id.btn_create_collection).setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_delete_collection:{
                AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());
                dialog.setTitle("删除收藏夹")
                        .setMessage("确定要删除整个收藏夹？")
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
            case R.id.btn_edit_commit:{

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
