package com.example.myapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapp.R;

public class RegisterActivity extends AppCompatActivity {
    private EditText edAccount;
    private EditText edPwd;
    private Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edAccount   = findViewById(R.id.edit_account_r);
        edPwd       = findViewById(R.id.edit_pwd_r);
        btnRegister = findViewById(R.id.btn_register_r);
    }
}