package com.example.a4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);
    }

    public void startOperation(View v) {
        Button b = (Button) v;
        TextView tv = (TextView) findViewById(R.id.textView);
        EditText editText1 = (EditText) findViewById(R.id.editTextNumber);
        EditText editText2 = (EditText) findViewById(R.id.editTextNumber2);
        int num1, num2;
        try {
            num1 = Integer.parseInt(editText1.getText().toString());
            num2 = Integer.parseInt(editText2.getText().toString());


            if (b.getText().toString().contains("+")) {
                tv.setText(num1 + "+" + num2 + "=" + (num1 + num2));
            }
            if (b.getText().toString().contains("-")) {
                tv.setText(num1 + "-" + num2 + "=" + (num1 - num2));
            }
            if (b.getText().toString().contains("/")) {
                if (num2 != 0) {
                    tv.setText(num1 + "/" + num2 + "=" + ((float)num1 / num2));
                }else{tv.setText("dividion by 0 is forbiden");}
            }
            if (b.getText().toString().contains("*")) {
                tv.setText(num1 + "*" + num2 + "=" + (num1 * num2));
            }
        } catch (java.lang.NumberFormatException e) {
            tv.setText("not enougth variables");
        }
    }
}
