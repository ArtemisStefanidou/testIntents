package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle myBundle = getIntent().getExtras();
        if (myBundle != null) {
            Integer firstInt = myBundle.getInt("firstInt");
            Integer secondInt = myBundle.getInt("secondInt");

            Integer sum = firstInt+secondInt;

            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            intent.putExtra("sum",sum);

            startActivity(intent);
        }


    }
}