package com.alexcovizzi.systemnotification.cpu;

/**
 * Created by Alex on 10/11/2017.
 */

public class CpuContract {
    
    interface View {
        void showCpuUsage(String usage);
        void showCpuMaxFreq(String maxFreq);
        void showCpuCores(String cores);
        void showCpuTemp(String temp);
        android.view.View getRoot();
        //TODO: add addGraphPoint
    }
    
    interface UserActionsListener {
        void showStatusBarNotification();
    }
}
