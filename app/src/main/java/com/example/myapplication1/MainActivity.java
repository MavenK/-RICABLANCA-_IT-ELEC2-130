package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "This is a verbose tag.");
        Log.d(TAG, "This is a debug log.");
        Log.i(TAG,"This is an info log.");
        Log.w(TAG, "This is a warn log");
        Log.e(TAG, "This is an error log.");



    }


}