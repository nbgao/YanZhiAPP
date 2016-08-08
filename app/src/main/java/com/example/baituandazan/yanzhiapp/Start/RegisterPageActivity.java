package com.example.baituandazan.yanzhiapp.Start;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.baituandazan.yanzhiapp.R;


public class RegisterPageActivity extends StartPageActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        final EditText editText = (EditText)findViewById(R.id.et_phone);
        Button button_send = (Button)findViewById(R.id.btn_send);

        button_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString().length()==11){
                    Toast.makeText(RegisterPageActivity.this,"短信已发出",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
