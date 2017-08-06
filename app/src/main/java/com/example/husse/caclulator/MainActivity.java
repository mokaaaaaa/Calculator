package com.example.husse.caclulator;

import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Defin Members
    EditText num1 = null;
    EditText num2 = null;
    String text1 = null;
    String text2 = null;
    boolean digitsOnly1 = false;
    boolean digitsOnly2 = false;
    TextView res = null;
    double firnum = 0;
    double secnum = 0;
    double result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.firNum);
        num2 = (EditText) findViewById(R.id.secNum);
        res = (TextView) findViewById(R.id.resultTxt);

    }//End of Create

    //Sum Function
    public void sumFunc(View view) {
        text1 = num1.getText().toString();
        text2 = num2.getText().toString();
        digitsOnly1 = TextUtils.isDigitsOnly(text1);
        digitsOnly2 = TextUtils.isDigitsOnly(text2);
        if (digitsOnly1 && digitsOnly2) {
            if (text1.length() == 0)
                text1 = "0";
            if (text2.length() == 0)
                text2 = "0";
            firnum = Double.parseDouble(text1);
            secnum = Double.parseDouble(text2);
            result = firnum + secnum;
            res.setText(firnum + " + " + secnum + " = " + result);

        } else {
            Toast.makeText(getApplicationContext(), "There is string value", Toast.LENGTH_LONG).show();
        }
    }//End of Sum Function

    //Sub Function
    public void subFunc(View view) {
        text1 = num1.getText().toString();
        text2 = num2.getText().toString();
        digitsOnly1 = TextUtils.isDigitsOnly(text1);
        digitsOnly2 = TextUtils.isDigitsOnly(text2);
        if (digitsOnly1 && digitsOnly2) {
            if (text1.length() == 0)
                text1 = "0";
            if (text2.length() == 0)
                text2 = "0";
            firnum = Double.parseDouble(text1);
            secnum = Double.parseDouble(text2);
            result = firnum - secnum;
            res.setText(firnum + " - " + secnum + " = " + result);

        } else {
            Toast.makeText(getApplicationContext(), "There is string value", Toast.LENGTH_LONG).show();
        }
    }// End of Sub Function

    //Multiplication Function
    public void multFunc(View view) {
        text1 = num1.getText().toString();
        text2 = num2.getText().toString();
        digitsOnly1 = TextUtils.isDigitsOnly(text1);
        digitsOnly2 = TextUtils.isDigitsOnly(text2);
        if (digitsOnly1 && digitsOnly2) {
            if (text1.length() == 0)
                text1 = "0";
            if (text2.length() == 0)
                text2 = "0";

            firnum = Double.parseDouble(text1);
            secnum = Double.parseDouble(text2);
            result = firnum * secnum;
            res.setText(firnum + " X " + secnum + " = " + result);

        } else {
            Toast.makeText(getApplicationContext(), "There is string value", Toast.LENGTH_LONG).show();
        }

    }//End of Multiplication Function

    //Divide Function
    public void divFunc(View view) {
        text1 = num1.getText().toString();
        text2 = num2.getText().toString();
        digitsOnly1 = TextUtils.isDigitsOnly(text1);
        digitsOnly2 = TextUtils.isDigitsOnly(text2);
        if (digitsOnly1 && digitsOnly2) {
            if (text1.length() == 0)
                text1 = "0";
            if (text2.length() == 0)
                text2 = "0";
            firnum = Double.parseDouble(text1);
            secnum = Double.parseDouble(text2);
            if (secnum != 0) {
                result = firnum / secnum;
                res.setText(firnum + " / " + secnum + " = " + result);
            } else
                Toast.makeText(getApplicationContext(), "Can't Divide by Zero .", Toast.LENGTH_LONG).show();
        }
    else
            Toast.makeText(getApplicationContext(),"There is string value",Toast.LENGTH_LONG).show();

}//End of Divide Function

}// End of Main Activity
