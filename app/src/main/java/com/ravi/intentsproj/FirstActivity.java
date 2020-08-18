package com.ravi.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button btnok;
    String notifi;
    String sendString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnok = findViewById(R.id.okbtn);



    }


    @Override
    protected void onResume() {
        super.onResume();

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentok = new Intent(FirstActivity.this, SecondActivity.class);
                intentok.putExtra("FirstActivity", sendString);

                startActivity(intentok);

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