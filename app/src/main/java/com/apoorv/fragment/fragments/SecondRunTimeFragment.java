package com.apoorv.fragment.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.apoorv.fragment.R;

/**
 * Created by Apoorv Vardhman on 28-11-2019
 *
 * @Email :  apoorv.vardhman@gmail.com
 * @Author :  Apoorv Vardhman (developerapoorv.xyz)
 * @Linkedin :  https://in.linkedin.com/in/apoorv-vardhman
 * Contact :  +91 8434014444
 */
public class SecondRunTimeFragment extends Fragment {

    public SecondRunTimeFragment() {
    }

    TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_run_time_fragment,container,false);
        textView = view.findViewById(R.id.txt_message);
        String message = getArguments().getString("message");
        textView.setText(message);
        return view;
    }
}
