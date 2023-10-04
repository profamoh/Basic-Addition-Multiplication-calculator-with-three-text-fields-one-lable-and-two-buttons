package com.example.simplecalculatorapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etfirstvalue,etsecondvalue,etthirdvalue;
    Button btnadd,btnmultiply;
    Double num1,num2,num3;
    TextView tvresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etfirstvalue = findViewById(R.id.etfirstvalue);
        etsecondvalue = findViewById(R.id.etsecondvalue);
        etthirdvalue= findViewById(R.id.etthirdvalue);
        btnadd = findViewById(R.id.btnadd);
        btnmultiply = findViewById(R.id.btnmultiply);
        tvresult=findViewById(R.id.tvresult);
        Clicklistener();
    }
    public void Clicklistener(){
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(etfirstvalue.getText().toString());
                num2=Double.parseDouble(etsecondvalue.getText().toString());
                num3=Double.parseDouble(etthirdvalue.getText().toString());
                Double result=num1+num2+num3;
                tvresult.setText(String.valueOf(result));

            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(etfirstvalue.getText().toString());
                num2=Double.parseDouble(etsecondvalue.getText().toString());
                num3=Double.parseDouble(etthirdvalue.getText().toString());
                Double result=num1*num2*num3;
                tvresult.setText(String.valueOf(result));
            }
        });


    }
}

