package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText firstTxt = findViewById(R.id.firstInt);
                Integer firstInt = Integer.parseInt(firstTxt.getText().toString());
                EditText secondTxt = findViewById(R.id.secondInt);
                Integer secondInt = Integer.parseInt(secondTxt.getText().toString());

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("firstInt",firstInt);
                intent.putExtra("secondInt",secondInt);

                startActivity(intent);

            }
        });

        Bundle myBundle = getIntent().getExtras();
        if (myBundle != null) {
            Toast.makeText(MainActivity.this, ""+myBundle.getInt("sum"), Toast.LENGTH_SHORT).show();
        }


    }
}