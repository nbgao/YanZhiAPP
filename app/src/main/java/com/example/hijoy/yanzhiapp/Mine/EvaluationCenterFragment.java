package com.example.hijoy.yanzhiapp.Mine;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hijoy.yanzhiapp.R;


public class EvaluationCenterFragment extends Fragment implements View.OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_evaluation_center,null);

        view.findViewById(R.id.ib_back).setOnClickListener(this);
        view.findViewById(R.id.feedback_problem).setOnClickListener(this);
        view.findViewById(R.id.suggestion_evaluation).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ib_back:{
                getFragmentManager().popBackStack();
                break;
            }
            case R.id.feedback_problem:{
                LayoutInflater inflater = LayoutInflater.from(getActivity());
                View layout = inflater.inflate(R.layout.dialog_feedback_problem,(ViewGroup)view.findViewById(R.id.dialog_feedback_problem));

                AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
                dialog.setView(layout)
                        .setTitle("反馈问题")
                        .setCancelable(true)
                        .setPositiveButton("确认", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();

                break;
            }
            case R.id.suggestion_evaluation:{
                LayoutInflater inflater = LayoutInflater.from(getActivity());
                View layout = inflater.inflate(R.layout.dialog_suggestion_evaluation,(ViewGroup)view.findViewById(R.id.dialog_suggestion_evaluation));

                AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
                dialog.setView(layout)
                        .setTitle("意见评价")
                        .setCancelable(true)
                        .setPositiveButton("确认", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();
                break;
            }

        }
    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
