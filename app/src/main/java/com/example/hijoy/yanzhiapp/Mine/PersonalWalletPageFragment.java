package com.example.hijoy.yanzhiapp.Mine;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.hijoy.yanzhiapp.R;


public class PersonalWalletPageFragment extends Fragment implements View.OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_personal_wallet_page,null);

        view.findViewById(R.id.ib_back).setOnClickListener(this);
        view.findViewById(R.id.wechat_pay).setOnClickListener(this);
        view.findViewById(R.id.alipay_pay).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ib_back:{
                getFragmentManager().popBackStack();
                break;
            }
            case R.id.wechat_pay:{
                Toast.makeText(getActivity(),"微信支付",Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.alipay_pay:{
                Toast.makeText(getActivity(),"支付宝支付",Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
