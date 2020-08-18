package com.ravi.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    Button add;
    Button sub;
    Button mul;
    Button div;

    TextView ans;

    String takeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent getvalues = getIntent();

        takeString = getvalues.getStringExtra("FirstActivity");


        }

        private void settingUpLogic(){

            add = (Button)findViewById(R.id.btnadd);
            sub = (Button)findViewById(R.id.btnsub);
            mul = (Button)findViewById(R.id.btnmul);
            div = (Button)findViewById(R.id.btndiv);

            ans = (TextView)findViewById(R.id.displayans);

        }


    }
}