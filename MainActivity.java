package com.example.myapplication123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private Button btn,btn1; private TextInputEditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        btn1 = (Button) findViewById(R.id.btn1);
        et1 = findViewById(R.id.ed1);
        et2 = findViewById(R.id.ed2);
        fun1();
        fun();
    }
    public void fun1(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle extras = getIntent().getExtras();
                String value1 = extras.getString("Value1");
                String value2 = extras.getString("Value2");
                String s1 = et1.getText().toString();
                String s2 = et2.getText().toString();
                Intent i = new Intent(getApplicationContext(),MainActivity3.class);
                i.putExtra("val1",s1);
                if(s2.equals(value2) || s1.equals(value1)){
                    startActivity(i);}
            }
        });
    }
    public void fun(){
        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(i);
            }
        });
    }
}
