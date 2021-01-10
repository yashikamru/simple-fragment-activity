package com.example.myfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void addFragment(View view) {
        FirstFragment ff=FirstFragment.newInstance();

        FragmentManager fm=getSupportFragmentManager();

        FragmentTransaction ft=fm.beginTransaction();

        ft.add(R.id.myframelayout,ff);

        ft.commit();
    }

    public void removeFragment(View view) {

        FragmentManager fm=getSupportFragmentManager();

        FirstFragment ff=(FirstFragment) fm.findFragmentById(R.id.myframelayout);

        FragmentTransaction ft=fm.beginTransaction();

        ft.remove(ff);

        ft.commit();

    }
}