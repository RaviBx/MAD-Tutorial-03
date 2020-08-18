package com.ravi.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button btnok;
    String notifi;
    String passValue;

    EditText num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnok = findViewById(R.id.okbtn);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);



    }


    @Override
    protected void onResume() {
        super.onResume();

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String namevalue1 = num1.getText().toString();
                String namevalue2 = num2.getText().toString();

                Intent intentok = new Intent(FirstActivity.this, SecondActivity.class);
                intentok.putExtra("NAME1", namevalue1);
                intentok.putExtra("NAME2", namevalue2);

                startActivity(intentok);

                //implementing toast
                Context context = getApplicationContext();
                CharSequence toastmsg = "You just clicked the OK Button";

                int duration = Toast.LENGTH_SHORT;
                Toast notifytoast = Toast.makeText(context,toastmsg,duration);
                notifytoast.show();

                notifytoast.setGravity(Gravity.TOP | Gravity.LEFT,0, 0);


            }
        });
    }
}