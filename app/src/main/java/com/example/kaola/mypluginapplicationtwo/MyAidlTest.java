package com.example.kaola.mypluginapplicationtwo;

import android.os.RemoteException;
import android.widget.Toast;

import com.qihoo360.replugin.RePlugin;

/**
 * Created by zhangchao on 2018/2/24.
 */

public class MyAidlTest extends IMyAidlInterface.Stub {
    @Override
    public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {
        Toast.makeText(RePlugin.getPluginContext(), "收到 aidl消息", Toast.LENGTH_SHORT).show();
    }
}
