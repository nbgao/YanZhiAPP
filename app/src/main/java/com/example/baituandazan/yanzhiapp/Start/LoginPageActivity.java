package com.example.baituandazan.yanzhiapp.Start;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.baituandazan.yanzhiapp.R;


public class LoginPageActivity extends StartPageActivity implements View.OnClickListener{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        ImageButton imageButton_sina = (ImageButton)findViewById(R.id.ib_sina);
        ImageButton imageButton_qq = (ImageButton)findViewById(R.id.ib_qq);
        ImageButton imageButton_wechat = (ImageButton)findViewById(R.id.ib_wechat);

        imageButton_sina.setOnClickListener(this);
        imageButton_qq.setOnClickListener(this);
        imageButton_wechat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ib_sina:
                Toast.makeText(LoginPageActivity.this,"Login by Sina",Toast.LENGTH_LONG).show();
                break;
            case R.id.ib_qq:
                Toast.makeText(LoginPageActivity.this,"Login by QQ",Toast.LENGTH_LONG).show();
                break;
            case R.id.ib_wechat:
                Toast.makeText(LoginPageActivity.this,"Login by WeChat",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
