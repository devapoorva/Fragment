package com.apoorv.fragment.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.apoorv.fragment.R;
import com.apoorv.fragment.fragments.FirstFragment;
import com.apoorv.fragment.fragments.FirstRunTimeFragment;

public class RunTimeFragment extends AppCompatActivity {

    FrameLayout frameLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.run_time_fragment);
        frameLayout = findViewById(R.id.frame);

        if(savedInstanceState==null)
        {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frame,new FirstRunTimeFragment());
            transaction.commit();
        }

    }

    public void replaceFragment(Fragment fragment,String TAG)
    {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,fragment);
        transaction.addToBackStack(TAG);
        transaction.commit();
    }
}
