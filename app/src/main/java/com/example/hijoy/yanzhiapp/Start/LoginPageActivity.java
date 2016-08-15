package com.example.hijoy.yanzhiapp.Start;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hijoy.yanzhiapp.R;

import static android.text.Html.fromHtml;


public class LoginPageActivity extends StartPageActivity implements View.OnClickListener{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login_page);

        TextView tv_forget = (TextView)findViewById(R.id.tv_forget);
        tv_forget.setText(fromHtml("<u>"+"忘记密码?"+"</u>"));

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
