package com.example.vasu.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent() ;

        int a = i.getIntExtra("Data" , 0)  ;

        Toast.makeText(this, "" + a, Toast.LENGTH_SHORT).show();

    }
}
