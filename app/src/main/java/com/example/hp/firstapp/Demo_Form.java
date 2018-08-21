package com.example.hp.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Demo_Form extends AppCompatActivity {
    EditText et1,et2;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo__form);
        et1=(EditText)findViewById(R.id.e1);
        et2=(EditText)findViewById(R.id.e2);
        textView=(TextView)findViewById(R.id.t1);
        button=(Button)findViewById(R.id.b1);
       // button.setOnClickListener();
    }
}
