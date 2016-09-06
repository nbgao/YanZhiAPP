package com.example.hijoy.yanzhiapp.Mine;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.Toast;

import com.example.hijoy.yanzhiapp.R;



public class MineActivity extends AppCompatActivity {
    private long mExitTime = 0;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine_page);

        if(findViewById(R.id.fragment_container) != null){
            if(savedInstanceState != null){
                return;
            }

            MinePageFragment minePageFragment = new MinePageFragment();
            minePageFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_container,minePageFragment)
                    .commit();

        }
    }

    /*
    public boolean onKeyDown(int keyCode,KeyEvent event){
        if(keyCode == KeyEvent.KEYCODE_BACK && getFragmentManager().findFragmentById(R.id.fragment_mine).isVisible()){

            if((System.currentTimeMillis() - mExitTime) > 2000){
                Toast.makeText(this,"再按一次退出程序",Toast.LENGTH_SHORT).show();
                mExitTime = System.currentTimeMillis();
            }else{
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode,event);
    }
    */

}
