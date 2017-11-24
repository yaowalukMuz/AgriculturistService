package com.yodpanom.yaowaluk.agriculturistservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.yodpanom.yaowaluk.agriculturistservice.Fragment.MainFragment;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Add Fragment to Main Activity
        addFragmentToActivity(savedInstanceState);



    }//Main method

    private void addFragmentToActivity(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.contentFragmentMain,new MainFragment()).commit();
        }
    }
}//Main Class
