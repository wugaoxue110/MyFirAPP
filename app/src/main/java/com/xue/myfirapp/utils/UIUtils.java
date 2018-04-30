package com.xue.myfirapp.utils;

import android.content.Context;
import android.widget.Toast;

import com.xue.myfirapp.app.MyApp;

public final class UIUtils  {

    public  static  void showToast(String string){
        Toast.makeText(MyApp.getContext(),string,Toast.LENGTH_SHORT).show();
    }
}
