package com.example.mealplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mealplanner.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    public Button but1;
    public void initstart(){
        but1 = (Button)findViewById(R.id.button1);
        but1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(MainActivity.this, LoginActivity.class);
            }
        }));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}