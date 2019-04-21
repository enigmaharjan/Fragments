package com.example.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

import fragments.FirstFragment;
import fragments.SecondFragment;

public class MainActivity extends AppCompatActivity {
    Button btnClick;
    Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = findViewById(R.id.btnFrg);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if(status){
                    FirstFragment firstFragment = new FirstFragment();
                    fragmentTransaction.replace(R.id.fragmentContainer,firstFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    btnClick.setText("Load Second Fragment");
                    status = false;
                }
                else{
                    SecondFragment secondFragment = new SecondFragment();
                    fragmentTransaction.replace(R.id.fragmentContainer,secondFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    btnClick.setText("Load First Fragment");
                    status = true;
                }
            }
        });
    }
}
