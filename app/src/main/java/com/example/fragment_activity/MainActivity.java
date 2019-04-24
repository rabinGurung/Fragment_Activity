package com.example.fragment_activity;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Fragments.First_Fragment;
import Fragments.Second_Fragment;

public class MainActivity extends AppCompatActivity {
    private FragmentManager manager;
    private FragmentTransaction transaction;
    private Button loadfragment;
    private boolean status;
    private First_Fragment first;
    private Second_Fragment second;
    private Button change;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadfragment = findViewById(R.id.btnloadFragment);
        manager = getSupportFragmentManager();
        status = true;

        change = findViewById(R.id.btnchange);

        loadfragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction = manager.beginTransaction();
                if(status){
                    first = new First_Fragment();
                 transaction.replace(R.id.Fragment_Container,first);
                 transaction.addToBackStack(null);
                 transaction.commit();
                 status = false;

                }else{
                    second = new Second_Fragment();
                    transaction.replace(R.id.Fragment_Container, second);
                    transaction.addToBackStack(null);
                    transaction.commit();
                    status = true;
                }

            }
        });

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,TabActivity.class);
                startActivity(i);
            }
        });

    }
}
