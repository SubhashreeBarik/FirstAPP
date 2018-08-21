package com.example.hp.firstapp;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Demo_ProgressBar extends AppCompatActivity {
    ProgressBar progressBar;
    TextView textView;
    int status=0;
    private Button button;
    private Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo__progress_bar);
        textView=(TextView)findViewById(R.id.t1);
        progressBar=(ProgressBar)findViewById(R.id.p1);
        button=(Button)findViewById(R.id.b1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                status=0;

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (status<100)
                        {
                            status+=5;

                            try {
                                Thread.sleep(500);
                            }
                            catch (InterruptedException e)
                            {
                                e.printStackTrace();
                            }
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    textView.setText("progress : "+status+"/"+progressBar.getMax());
                                    progressBar.setProgress(status);
                                    textView.setText(status+"%");
                                    if (status==100){
                                        Toast.makeText(getApplicationContext(),"completed",Toast.LENGTH_SHORT).show();
                                        textView.setText("");
                                        progressBar.setProgress(0);
                                    }
                                }
                            });
                        }
                    }
                }).start();


            }
        });
    }
}
