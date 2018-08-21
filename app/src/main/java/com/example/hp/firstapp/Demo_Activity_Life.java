package com.example.hp.firstapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

public class Demo_Activity_Life extends AppCompatActivity {
final String TAG="TAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo___life);
        Log.i(TAG,"Oncreate is called");

        Toast t1=Toast.makeText(Demo_Activity_Life.this,"Application is Created",Toast.LENGTH_SHORT);
        t1.show();
        t1.setGravity(Gravity.BOTTOM,0,0);
        t1.getView().setBackgroundColor(Color.BLUE);

    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.i(TAG,"OnResume is called");
        Toast t1=Toast.makeText(Demo_Activity_Life.this,"Application is resumed",Toast.LENGTH_SHORT);
        t1.show();
    }


    @Override
    protected void onStart()
    {
        super.onStart();
        Log.i(TAG,"OnStart is called");
        Toast t1=Toast.makeText(Demo_Activity_Life.this,"Application is Started",Toast.LENGTH_SHORT);
        t1.show();
    }


    @Override
    protected void onPause()
    {
        super.onPause();
        Log.i(TAG,"OnPause is called");
        Toast t1=Toast.makeText(Demo_Activity_Life.this,"Application is Paused",Toast.LENGTH_SHORT);
        t1.show();
    }


    @Override
    protected void onStop()
    {
        super.onStop();
        Log.i(TAG,"OnStop is called");
        Toast t1=Toast.makeText(Demo_Activity_Life.this,"Application is stopped",Toast.LENGTH_SHORT);
        t1.show();
    }
}
