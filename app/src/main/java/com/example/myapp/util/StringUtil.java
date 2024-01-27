package com.example.myapp.util;

import android.widget.Toast;

public class StringUtil {
    public static boolean isEmpty(String a){
        if (a == null || a.length()<=0){
            return true;
        }
        else
            return false;
    }
}
