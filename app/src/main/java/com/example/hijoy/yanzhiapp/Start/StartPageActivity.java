package com.example.hijoy.yanzhiapp.Start;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.hijoy.yanzhiapp.R;


public class StartPageActivity extends AppCompatActivity implements View.OnClickListener {

    static StartPageActivity instance;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        instance = this;

        Button button_login = (Button)findViewById(R.id.btn_login);
        Button button_register = (Button)findViewById(R.id.btn_register);
        button_login.setOnClickListener(this);
        button_register.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_login:
                startActivity(new Intent(StartPageActivity.this,LoginPageActivity.class));
                //finish();
                break;
            case R.id.btn_register:
                startActivity( new Intent(StartPageActivity.this,RegisterPageActivity.class));
                //finish();
                break;
        }
    }

    /*
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
    }
    */
}
