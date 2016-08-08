package com.example.baituandazan.yanzhiapp.Start;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.example.baituandazan.yanzhiapp.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_page);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /*
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashPageActivity.this,StartPageActivity.class);
                startActivity(intent);
                SplashPageActivity.this.finish();
            }
        },5000);*/

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(SplashPageActivity.this,StartPageActivity.class));
                finish();
            }
        };
        timer.schedule(task,5000);
    }
}
