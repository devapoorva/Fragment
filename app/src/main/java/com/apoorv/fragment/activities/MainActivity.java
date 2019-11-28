package com.apoorv.fragment.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.apoorv.fragment.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openCompileTimeFragment(View view) {
        startActivity(new Intent(MainActivity.this,CompileFragment.class));
    }

    public void gotoRunTime(View view) {
        startActivity(new Intent(MainActivity.this,RunTimeFragment.class));
    }
}
