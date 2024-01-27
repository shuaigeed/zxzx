package com.example.myapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapp.R;
import com.example.myapp.util.StringUtil;

public class LoginActivity extends BaseActivity {

    private EditText edAccount;
    private EditText edPwd;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edAccount   = findViewById(R.id.edit_account_l);
        edPwd       = findViewById(R.id.edit_pwd_l);
        btnLogin    = findViewById(R.id.btn_login_l);

        btnLogin.setOnClickListener(view -> {
            String account  = edAccount.getText().toString().trim();
            String pwd      = edPwd.getText().toString().trim();
            login(account,pwd);
        });
    }
    private void login(String account, String pwd){
        if (StringUtil.isEmpty(account)){
            //Toast.makeText(this,"请输入账号",Toast.LENGTH_LONG).show();
            showToast("请输入账号");
            return;
        }
        if (StringUtil.isEmpty(pwd)){
            //Toast.makeText(this,"请输入密码",Toast.LENGTH_LONG).show();
            showToast("请输入密码");
            return;
        }

    }
}