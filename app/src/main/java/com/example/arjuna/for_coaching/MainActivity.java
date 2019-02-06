package com.example.arjuna.for_coaching;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.arjuna.for_coaching.fargment.adminhome;

public class MainActivity extends AppCompatActivity {
RelativeLayout rel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rel=(RelativeLayout) findViewById(R.id.btn_login);
        rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,navigation.class);
                startActivity(intent);
            }
        });
    }
}
