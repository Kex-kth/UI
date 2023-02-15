package com.example.project_kex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.project_kex.activity.LoginActivity;
import com.example.project_kex.activity.RegisterActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnlogin;
    private Button btnregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*login btn activity*/
        btnlogin = findViewById(R.id.btn_login); //get login-btn
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //jump from main to the login
                Intent in = new Intent(MainActivity.this, LoginActivity.class);
                //press login btn do the intent 'in'
                startActivity(in);
            }
        });

        /*register btn activity*/
        btnregister = findViewById(R.id.btn_register); // get register-btn
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //jump from main to the login
                Intent in = new Intent(MainActivity.this, RegisterActivity.class);
                //press login btn do the intent 'in'
                startActivity(in);
            }
        });
    }
}