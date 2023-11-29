package com.example.myapplication123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity8 extends AppCompatActivity {
    private TextView tv1,tv2;

    private EditText et1,et2;
    private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        List<String> cnt = Arrays.asList("Angora wool","Mohair","Fur","Cotton");

        final Spinner sp3 = (Spinner) findViewById(R.id.sp3);
        ArrayAdapter aa2 = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_spinner_item,cnt);
        aa2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp3.setAdapter(aa2);
        et1 = (EditText) findViewById(R.id.edit_text);
        et2 = (EditText) findViewById(R.id.text);
        b1 = (Button) findViewById(R.id.btn111);
        tv1 = findViewById(R.id.tv17);
        tv2 = findViewById(R.id.tv10);

        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                String s2 = et1.getText().toString();
                String s3 = et2.getText().toString();
                String s1 = sp3.getSelectedItem().toString();
                int pr= Integer.parseInt(et2.getText().toString());
                int price=pr+30;
                String res = String.valueOf(price);




                Toast.makeText(getApplicationContext(), s1 +" Ordered successfully of Rs:"+res, Toast.LENGTH_LONG).show();




            }
        });
    }
}
