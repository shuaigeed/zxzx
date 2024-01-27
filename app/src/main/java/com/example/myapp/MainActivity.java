package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.myapp.activity.BaseActivity;
import com.example.myapp.activity.LoginActivity;
import com.example.myapp.activity.RegisterActivity;

public class MainActivity extends BaseActivity {

    private Button btnLogin;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(view -> {
//            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//            startActivity(intent);
            navigateTo(LoginActivity.class);
        });
        btnRegister = findViewById(R.id.btn_register);
        btnRegister.setOnClickListener(view -> {
//            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
//            startActivity(intent);
            navigateTo(RegisterActivity.class);
        });
    }
}