package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_tab);

    }
    public void onAdd(View v){
        TextView TV1=(TextView)findViewById(R.id.textView);
        TV1.setText(TV1.getText()+"*");
    }
    public void onCopy(View v){
        TextView TV1=(TextView)findViewById(R.id.textView);
        TextView TV2=(TextView)findViewById(R.id.textView2);
        TV2.setText(TV1.getText());
    }
}
