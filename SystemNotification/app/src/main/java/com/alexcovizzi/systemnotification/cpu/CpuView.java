package com.alexcovizzi.systemnotification.cpu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alexcovizzi.systemnotification.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Alex on 10/11/2017.
 */

public class CpuView implements CpuContract.View {
    
    private CpuContract.UserActionsListener mActionListener;
    private View root;
    @BindView(R.id.text_view_cpu_usage) TextView mTextViewCpuUsage;
    @BindView(R.id.text_view_cpu_max_freq) TextView mTextViewCpuMaxFreq;
    @BindView(R.id.text_view_cpu_cores) TextView mTextViewCpuCores;
    @BindView(R.id.text_view_cpu_temp) TextView mTextViewCpuTemp;
    
    public CpuView(LayoutInflater inflater, ViewGroup container, CpuContract.UserActionsListener mActionListener) {
        this.mActionListener = mActionListener;
        root = inflater.inflate(R.layout.fragment_cpu, container, false);
        ButterKnife.bind(this, root);
    }
    
    public View getRoot() {
        return root;
    }
    
    @Override
    public void showCpuUsage(String usage) {
        mTextViewCpuUsage.setText(usage);
    }
    
    @Override
    public void showCpuMaxFreq(String maxFreq) {
        mTextViewCpuMaxFreq.setText(maxFreq);
    }
    
    @Override
    public void showCpuCores(String cores) {
        mTextViewCpuCores.setText(cores);
    }
    
    @Override
    public void showCpuTemp(String temp) {
        mTextViewCpuTemp.setText(temp);
    }
}
