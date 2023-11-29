package com.example.myapplication123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private TextView tv1,tv2;
    private Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv1 = findViewById(R.id.tv);
        tv2 = findViewById(R.id.tv2);
        b1 = findViewById(R.id.btn);
        b2 = findViewById(R.id.btn1);
        b3 = findViewById(R.id.btn2);
        b4 = findViewById(R.id.btn3);
        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("val1");
        tv1.setText("Welcome "+value1);
        func();func1();
        func2();
        func3();
    }
    public void func(){
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv2.setText("Thank You for Login");
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
    public void func1(){
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity7.class);
                startActivity(i);
            }
        });
    }

    public void func2(){
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(i);
            }
        });
    }
    public void func3(){
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(i);
            }
        });
    }

}
