package com.example.laboratornaya_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Thread DisplaySplash = new Thread() {
            public void run() {
                Intent home = new Intent(Main2Activity.this, MainActivity.class);
                try {
                    Thread.sleep(2000);
                    startActivity(home);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        DisplaySplash.start();

    }
}








