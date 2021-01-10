package com.sabari.officecafeteria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView tv_email,tv_password,tv_login,tv_not_hav_any_acc;
    EditText et_email,et_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tv_email = findViewById(R.id.tv_email);
        tv_password = findViewById(R.id.tv_password);
        tv_login = findViewById(R.id.tv_login);
        tv_not_hav_any_acc = findViewById(R.id.not_hav_any_acc);
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);

        tv_not_hav_any_acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this , SignUpActivity.class);
                startActivity(i);
            }
        });



    }
}