package com.apoorv.fragment.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.apoorv.fragment.R;
import com.apoorv.fragment.activities.RunTimeFragment;

/**
 * Created by Apoorv Vardhman on 28-11-2019
 *
 * @Email :  apoorv.vardhman@gmail.com
 * @Author :  Apoorv Vardhman (developerapoorv.xyz)
 * @Linkedin :  https://in.linkedin.com/in/apoorv-vardhman
 * Contact :  +91 8434014444
 */
public class FirstRunTimeFragment extends Fragment {

    EditText edtMessage;
    Button btnMessage;

    private String message;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_run_time_fragment,container,false);
        // view initialize
        edtMessage = view.findViewById(R.id.edt_message);
        btnMessage = view.findViewById(R.id.btn_send_message);
        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = edtMessage.getText().toString().trim();
                if(message.isEmpty())
                {
                    Toast.makeText(getContext(),"Enter Some Message",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    SecondRunTimeFragment secondRunTimeFragment = new SecondRunTimeFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("message",message);
                    secondRunTimeFragment.setArguments(bundle);
                    ((RunTimeFragment)getActivity()).replaceFragment(secondRunTimeFragment,"SecondRunTime");
                }
            }
        });
        return view;
    }
}
