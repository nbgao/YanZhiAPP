package com.example.hijoy.yanzhiapp.Mine;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hijoy.yanzhiapp.R;

import static android.text.Html.fromHtml;


public class RecentViewsPageFragment extends Fragment implements View.OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_recent_views_page,null);

        view.findViewById(R.id.ib_back).setOnClickListener(this);
        view.findViewById(R.id.btn_recent_views_delete).setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ib_back:{
                getFragmentManager().popBackStack();
                break;
            }
            case R.id.btn_recent_views_delete:{
                AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());
                dialog.setMessage("确认清除全部内容吗？")
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
