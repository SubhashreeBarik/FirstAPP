package com.example.hp.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Demo_CustomToast extends AppCompatActivity {

TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo__custom_toast);

      /*  Toast ImageToast = new Toast(getBaseContext());
        LinearLayout toastLayout =new LinearLayout(getBaseContext());
        toastLayout.setOrientation(LinearLayout.HORIZONTAL);
        ImageView image = new ImageView(getBaseContext());
        image.setImageResource(R.drawable.hands);
        toastLayout.addView(image);
        ImageToast.setView(toastLayout);
        ImageToast.setDuration(Toast.LENGTH_SHORT);
        ImageToast.show();  */

/*textView=(TextView)findViewById(R.id.text);
        textView.setText("What a view!");

        Toast t1=new Toast(getApplicationContext());
        t1.setText("textview");*/
    }

    public void submit(View view)
    {
        LayoutInflater lf=getLayoutInflater();
        View view1=lf.inflate(R.layout.imagetoast,(ViewGroup)findViewById(R.id.lin));
        textView = (TextView)view1.findViewById(R.id.tv);
        textView.setText("Hello : Welcome To Ninja World");

        Toast t1=new Toast(getApplicationContext());
        t1.setDuration(Toast.LENGTH_SHORT);
        t1.setView(view1);
        t1.show();

    }
}
