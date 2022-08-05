package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView tvoutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent=getIntent();
        String firstName=getIntent().getStringExtra(MainActivity.key_First_Name);
        String secondName=getIntent().getStringExtra(MainActivity.key_Second_Name);
        tvoutput=findViewById(R.id.tvoutput);
//        tvoutput.setText(firstName+" "+secondName);
        tvoutput.setText(MainActivity.studentDetail.toString());
    }
}