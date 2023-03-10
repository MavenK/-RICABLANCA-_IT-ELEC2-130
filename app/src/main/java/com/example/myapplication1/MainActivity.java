package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.content.*;



public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Today's Activity is an introduction of logs. This is by Andre Kent Ricablanca.
        Log.v(TAG, "This is a verbose log.");
        Log.d(TAG, "This is a debug log.");
        Log.i(TAG,"This is an info log.");
        Log.w(TAG, "This is a warn log");
        Log.e(TAG, "This is an error log.");

        Button button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Log.i(TAG, "Button Clicked");

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });


    }


}