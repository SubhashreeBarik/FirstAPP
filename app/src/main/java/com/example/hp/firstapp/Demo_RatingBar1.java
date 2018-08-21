package com.example.hp.firstapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class Demo_RatingBar1 extends AppCompatActivity {

    RatingBar ratingBar;
    TextView textView,textView1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingbar_demo);

        ratingBar=(RatingBar)findViewById(R.id.r1);
        textView=(TextView)findViewById(R.id.t1);
        textView1=(TextView)findViewById(R.id.t2);
        button=(Button)findViewById(R.id.b1);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                float f=ratingBar.getRating();
                textView.setBackgroundColor(Color.GREEN);
                textView.setText(String.valueOf(f));

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float f=ratingBar.getRating();
                textView1.setText(String.valueOf(f));
            }
        });
    }
}
