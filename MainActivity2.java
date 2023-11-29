package com.example.myapplication123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2 extends AppCompatActivity {
    private TextInputEditText et1,et2,et3,et4;
    private Button btn12;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn12 = (Button) findViewById(R.id.btn11);
        et1 = findViewById(R.id.ed1);

        et3 = findViewById(R.id.ed3);
        et4 = findViewById(R.id.ed4);
        tv1 = findViewById(R.id.tv1);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = et1.getText().toString();
                String s2 = et3.getText().toString();
                String s3 = et4.getText().toString();
                if(s2.equals(s3)){
                    tv1.setText("Signed up successfully");
                    Intent i = new Intent(getApplicationContext(),MainActivity.class);
                    i.putExtra("Value1",s1);
                    i.putExtra("Value2",s3);
                    startActivity(i);
                }
                else{
                    tv1.setText("Enter Correct password");
                }
            }
        });
    }
}
