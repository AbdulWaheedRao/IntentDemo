package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String key_First_Name="Haseeb";
    public static final String key_Second_Name="Ahmed";
    public static final int Second_Activity_Request_Code=1;
    public static Student studentDetail=null;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent intent=new Intent(MainActivity.this,SecondActivity.class);
              intent.putExtra(key_First_Name,"Haseeb");
              intent.putExtra(key_Second_Name,"Ahmed");
              Bundle extra=intent.getExtras();
              extra.putString(key_First_Name,"Haseeb");
              extra.putString(key_Second_Name,"Ahmed");
              studentDetail=new Student(12,"Ali",567667.98);
//               Intent intent=new Intent(Intent.ACTION_DIAL);
//               intent.setData(Uri.parse("tel:03007806751"));
//                if (intent.resolveActivity(getPackageManager()) != null){
//                }
                startActivity(intent);
            }
        });
    }
}