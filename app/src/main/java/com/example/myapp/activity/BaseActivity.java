package com.example.myapp.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SyncRequest;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapp.MainActivity;

public class BaseActivity extends AppCompatActivity {
    private Context mContext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
    }
    public void showToast(String a){
        Toast.makeText(mContext,a,Toast.LENGTH_LONG).show();
    }
    public void navigateTo(Class cla){
        Intent intent = new Intent(mContext, cla);
        startActivity(intent);
    }
}
