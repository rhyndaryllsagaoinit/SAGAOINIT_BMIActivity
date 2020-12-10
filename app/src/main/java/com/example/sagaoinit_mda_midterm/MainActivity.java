package com.example.sagaoinit_mda_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //variables

    EditText eNumberOne;
    EditText eNumberTwo;
    EditText eNumberThree;
    Button btnGo;
    TextView Result;
    String name;
    Float num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNumberOne = findViewById(R.id.editNumberOne);
        eNumberTwo = findViewById(R.id.editNumberTwo);
        eNumberThree = findViewById(R.id.editNumberThree);
        Result = findViewById(R.id.txtResult);
        btnGo = findViewById(R.id.btnCalculate);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = eNumberOne.getText().toString().trim();
                num2 = Float.parseFloat(eNumberThree.getText().toString());
                int num1 = Integer.parseInt(eNumberTwo.getText().toString());


                float total = num1 / (num2 * num2);

                eNumberTwo.setText("");
                eNumberThree.setText("");

                Result.setText("Name: " +name +"\nBody Mass Index: " +total);
            }
        });

    }



}