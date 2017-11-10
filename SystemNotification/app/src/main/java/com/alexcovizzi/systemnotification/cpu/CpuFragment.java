package com.alexcovizzi.systemnotification.cpu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CpuFragment extends Fragment implements CpuContract.UserActionsListener {
    
    private CpuContract.View cpuView;
    
    public CpuFragment() {
    
    }
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        cpuView = new CpuView(inflater, container, this);
        return cpuView.getRoot();
    }
    
    @Override
    public void showStatusBarNotification() {
    
    }
}
