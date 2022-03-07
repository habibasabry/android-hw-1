package com.example.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = findViewById(R.id.Quizes);
        EditText num2 = findViewById(R.id.Final);
        EditText num3 = findViewById(R.id.Homeworks);
        EditText num4 = findViewById(R.id.Midterms);

        Button cal = findViewById(R.id.Calculate);
        Button reset = findViewById(R.id.Raset);

        TextView result = findViewById(R.id.Result);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int Number1 = Integer.parseInt(num1.getText().toString());
                int Number2 = Integer.parseInt(num2.getText().toString());
                int Number3 = Integer.parseInt(num3.getText().toString());
                int Number4 = Integer.parseInt(num4.getText().toString());
                int total = Number1 + Number2 + Number3 + Number4;

                result.setText(total + "");


            }
        });


    }
}