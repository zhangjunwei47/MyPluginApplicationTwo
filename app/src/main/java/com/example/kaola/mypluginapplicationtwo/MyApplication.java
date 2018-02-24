package com.example.kaola.mypluginapplicationtwo;

import android.app.Application;

import com.qihoo360.replugin.RePlugin;

/**
 * Created by zhangchao on 2018/2/24.
 */

public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        RePlugin.registerPluginBinder("MyAidlTest", new MyAidlTest());
    }
}
