package com.example.mealplanner;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import org.mariuszgromada.math.mxparser.*;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {

    private EditText display;

    private void UpdateText(String ut){
        String ot = display.getText().toString();
        int curPos = display.getSelectionStart();
        String left = ot.substring(0,curPos);
        String right = ot.substring(curPos);
        if(getString(R.string.display).equals(display.getText().toString())){
            display.setText(ut);
            display.setSelection(curPos + 1);
        }
        else {
            display.setText(String.format("%s%s%s", left, ut, right));
            display.setSelection(curPos + 1);
        }
    }

    public void zeroBT(View view){
        UpdateText("0");
    }

    public void oneBT(View view){
        UpdateText("1");
    }

    public void twoBT(View view){
        UpdateText("2");
    }

    public void threeBT(View view){
        UpdateText("3");
    }

    public void fourBT(View view){
        UpdateText("4");
    }

    public void fiveBT(View view){
        UpdateText("5");
    }

    public void sixBT(View view){
        UpdateText("6");
    }

    public void sevenBT(View view){
        UpdateText("7");
    }

    public void eightBT(View view){
        UpdateText("8");
    }

    public void nineBT(View view){
        UpdateText("9");
    }

    public void clearBT(View view){
        display.setText("");
    }

    public void parenthesisBT(View view){
        int cursorPos = display.getSelectionStart();
        int openP = 0;
        int closeP = 0;
        int textL = display.getText().length();
        for(int i = 0; i < cursorPos; i++){
            if(display.getText().toString().substring(i, i + 1).equals("(")){
                openP += 1;
            }
            if(display.getText().toString().substring(i, i + 1).equals("(")){
                closeP += 1;
            }
        }

        if(openP == closeP || display.getText().toString().substring(textL-1, textL).equals("")){
            UpdateText("(");
            display.setSelection(cursorPos + 1);
        }
        else if(closeP < openP && display.getText().toString().substring(textL-1, textL).equals("")) {
            UpdateText(")");
        }
            display.setSelection(cursorPos + 1);


    }

    public void exponentBT(View view){
        UpdateText("^");
    }

    public void divideBT(View view){
        UpdateText("/");
    }

    public void multiplyBT(View view){
        UpdateText("*");
    }

    public void subtractBT(View view){
        UpdateText("-");
    }

    public void addBT(View view){
        UpdateText("+");
    }

    public void equalsBT(View view){
        String user = display.getText().toString();

        user = user.replaceAll("÷", "/");
        user = user.replaceAll("x", "*");

        Expression exp = new Expression(user);

        String result = String.valueOf((exp.calculate()));

        display.setText(result);
        display.setSelection(result.length());

    }

    public void backspaceBT(View view){
        int cursorPos = display.getSelectionStart();
        int textLen = display.getText().length();
        if(cursorPos != 0 && textLen != 0){
            SpannableStringBuilder select = (SpannableStringBuilder)display.getText();
            select.replace(cursorPos - 1, cursorPos, "");
            display.setText(select);
            display.setSelection(cursorPos-1);
        }
    }

    public void plusMinusBT(View view){
        UpdateText("-");
    }

    public void decimalBT(View view){
        UpdateText(".");
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        display = findViewById(R.id.Value);
        display.setShowSoftInputOnFocus(false);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getString(R.string.display).equals(display.getText().toString()));
                display.setText("");
            }
        });
    }


}