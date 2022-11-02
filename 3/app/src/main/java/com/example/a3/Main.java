package com.example.a3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);
    }
    public void Button_action_1(View v){
        Button b =(Button)v;
        TextView tv1 = (TextView) findViewById(R.id.textView);
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        tv1.setTextColor(b.getTextColors());
        tv1.setBackground(b.getBackground());
        tv2.setTextColor(b.getTextColors());
        tv2.setBackground(b.getBackground());
    };
    public void Button_action_2(View v){
        Button b =(Button)v;
        LinearLayout tv1 = (LinearLayout) findViewById(R.id.LLFScreen);
        tv1.setBackground(b.getBackground());
    };
};

