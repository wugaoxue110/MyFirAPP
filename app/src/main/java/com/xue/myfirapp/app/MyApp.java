package com.xue.myfirapp.app;

import android.app.Application;
import android.content.Context;

import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

public class MyApp extends Application{

    public static IWXAPI iwxapi;
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        registToWX();
        context=getApplicationContext();
    }
    private void registToWX() {
        //AppConst.WEIXIN.APP_ID是指你应用在微信开放平台上的AppID，记得替换。
        iwxapi = WXAPIFactory.createWXAPI(this, AppConst.WX_APP_ID, false);
        // 将该app注册到微信
        iwxapi.registerApp(AppConst.WX_APP_ID);
    }
    public static Context getContext(){
        return context;

    }
}
