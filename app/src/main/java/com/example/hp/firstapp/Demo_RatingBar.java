package com.example.hp.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Demo_RatingBar extends AppCompatActivity {
    RatingBar rr1;
    RatingBar rr2;
    RatingBar rr3;
    Button bb1;
    float f1;
    float f2;
    float f3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo__rating_bar);
        rr1=(RatingBar)findViewById(R.id.r1);
        rr2=(RatingBar)findViewById(R.id.r2);
        rr3=(RatingBar)findViewById(R.id.r3);
        bb1=(Button)findViewById(R.id.b1);

              bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1=rr1.getRating();
                f2=rr2.getRating();
                f3=f1+f2;
                rr3.setRating(f3);
                Toast.makeText(getApplicationContext(),String.valueOf(f3),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
