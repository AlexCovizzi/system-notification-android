package com.alexcovizzi.systemnotification.cpu;

/**
 * Created by Alex on 10/11/2017.
 */

public class CpuContract {
    
    interface View {
        void showUsage(String usage);
        void showMaxFreq(String maxFreq);
        void showCores(String cores);
        void showTemp(String temp);
        //TODO: add
    }
    
    interface UserActionsListener {
    
    }
}
