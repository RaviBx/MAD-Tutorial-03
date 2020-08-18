package com.ravi.intentsproj;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView number1,number2;

    Button add;
    Button sub;
    Button mul;
    Button div;

    EditText num1;
    EditText num2;
    TextView result;
    float finalres;
    int numb1,numb2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        //getting values from activity 1

        number1 = (TextView)findViewById(R.id.getnum1);
        number2 = (TextView)findViewById(R.id.getnum2);

        number1.setText(getIntent().getStringExtra("NAME1"));
        number2.setText(getIntent().getStringExtra("NAME2"));


        //displaying final answer after calculating
        result =(TextView)findViewById(R.id.displayans);


        //getting activity 1 values to calculate
        num1 = (EditText)findViewById(R.id.getnum1);
        num2 = (EditText)findViewById(R.id.getnum2);


        //implementing operating buttons

        add = (Button)findViewById(R.id.btnadd);
        sub = (Button)findViewById(R.id.btnsub);
        mul = (Button)findViewById(R.id.btnmul);
        div = (Button)findViewById(R.id.btndiv);



        //implementing methods

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                numb1 = Integer.parseInt(num1.getText().toString());
                numb2 = Integer.parseInt(num2.getText().toString());

                finalres = numb1 + numb2;
                result.setText(String.valueOf(finalres));
            }
        });



        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                numb1 = Integer.parseInt(num1.getText().toString());
                numb2 = Integer.parseInt(num2.getText().toString());

                finalres = numb1 - numb2;
                result.setText(String.valueOf(finalres));
            }
        });



        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                numb1 = Integer.parseInt(num1.getText().toString());
                numb2 = Integer.parseInt(num2.getText().toString());

                finalres = numb1 * numb2;
                result.setText(String.valueOf(finalres));
            }
        });



        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                numb1 = Integer.parseInt(num1.getText().toString());
                numb2 = Integer.parseInt(num2.getText().toString());

                finalres = numb1 / numb2;
                result.setText(String.valueOf(finalres));
            }
        });



    }


    }
