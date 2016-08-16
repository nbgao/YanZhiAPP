package com.example.hijoy.yanzhiapp.Start;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hijoy.yanzhiapp.Mine.MineActivity;
import com.example.hijoy.yanzhiapp.R;

import static android.text.Html.fromHtml;


public class LoginPageActivity extends StartPageActivity implements View.OnClickListener{

    private EditText et_phone;
    private EditText et_password;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login_page);

        TextView tv_forget = (TextView)findViewById(R.id.tv_forget);
        tv_forget.setText(fromHtml("<u>"+"忘记密码?"+"</u>"));

        et_phone = (EditText)findViewById(R.id.et_phone);
        et_password = (EditText)findViewById(R.id.et_password);

        Button button_login = (Button)findViewById(R.id.btn_login);
        ImageButton imageButton_sina = (ImageButton)findViewById(R.id.ib_sina);
        ImageButton imageButton_qq = (ImageButton)findViewById(R.id.ib_qq);
        ImageButton imageButton_wechat = (ImageButton)findViewById(R.id.ib_wechat);

        button_login.setOnClickListener(this);
        imageButton_sina.setOnClickListener(this);
        imageButton_qq.setOnClickListener(this);
        imageButton_wechat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                if(et_phone.getText().toString().equals("18112345678") && et_password.getText().toString().equals("123456")){
                    Intent intent = new Intent(LoginPageActivity.this, MineActivity.class);
                    startActivity(intent);
                    Toast.makeText(LoginPageActivity.this,"Login successfully",Toast.LENGTH_LONG).show();
                    this.finish();
                }else{
                    Toast.makeText(LoginPageActivity.this,"Wrong",Toast.LENGTH_LONG).show();
                }
                break;
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
