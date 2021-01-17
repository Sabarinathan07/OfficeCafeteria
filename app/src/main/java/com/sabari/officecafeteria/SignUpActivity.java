package com.sabari.officecafeteria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    EditText et_firstName,et_lastName,et_OrganisationName,et_empIdNo,et_mobileNo,et_email,et_password,et_conformPassword;
    Button signUp;
    TextView tv_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        et_firstName = findViewById(R.id.et_firstName);
        et_lastName = findViewById(R.id.et_lastName);
        et_OrganisationName = findViewById(R.id.et_organisationName);
        et_empIdNo = findViewById(R.id.et_employeeIdNo);
        et_mobileNo = findViewById(R.id.et_mobileNo);
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        et_conformPassword = findViewById(R.id.et_conform_password);

        signUp = findViewById(R.id.bt_signUp);
        tv_login = findViewById(R.id.already_hav_acc);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),OfficeCafeteriaBottomNav.class);
                startActivity(i);
            }
        });

        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),LoginActivity.class);
                startActivity(i);
            }
        });
    }




}