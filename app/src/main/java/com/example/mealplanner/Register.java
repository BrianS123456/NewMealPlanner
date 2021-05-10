package com.example.mealplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mealplanner.ui.login.LoginActivity;
import com.example.mealplanner.ui.login.LoginViewModel;

public class Register extends AppCompatActivity {

    public Button butca;

    public void init(){
        butca = (Button)findViewById(R.id.buttonCA);
        butca.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(Register.this, QuestionPage.class);

                startActivity((act));
            }
        }));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();

    }
}