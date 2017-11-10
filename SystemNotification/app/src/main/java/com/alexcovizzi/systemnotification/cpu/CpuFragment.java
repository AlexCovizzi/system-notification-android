package com.alexcovizzi.systemnotification.cpu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alexcovizzi.systemnotification.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CpuFragment extends Fragment implements CpuContract.View {
    
    @BindView(R.id.text_view_cpu_usage) TextView mTextViewCpuUsage;
    @BindView(R.id.text_view_cpu_max_freq) TextView mTextViewCpuMaxFreq;
    @BindView(R.id.text_view_cpu_cores) TextView mTextViewCpuCores;
    @BindView(R.id.text_view_cpu_temp) TextView mTextViewCpuTemp;
    
    public CpuFragment() {
    
    }
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_cpu, container, false);
    
        ButterKnife.bind(this, rootView);
        
        return rootView;
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
