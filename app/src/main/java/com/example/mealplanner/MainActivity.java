package com.example.mealplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mealplanner.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    public Button but1;
    public Button butab;
    public Button buth;
    public Button butcal;

    public void init(){
        but1 = (Button)findViewById(R.id.button1);
        but1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(MainActivity.this, LoginActivity.class);

                startActivity((act));
            }
        }));
    }

    public void init2(){
        butab = (Button)findViewById(R.id.button2);
        butab.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(MainActivity.this, About.class);

                startActivity((act));
            }
        }));
    }

    public void init3(){
        buth = (Button)findViewById(R.id.button3);
        buth.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(MainActivity.this, HelpPage.class);

                startActivity((act));
            }
        }));

    }

    public void init4() {
        butcal = (Button) findViewById(R.id.calbt);
        butcal.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(MainActivity.this, Calculator.class);

                startActivity((act));
            }
        }));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        init2();
        init3();
        init4();
    }
}