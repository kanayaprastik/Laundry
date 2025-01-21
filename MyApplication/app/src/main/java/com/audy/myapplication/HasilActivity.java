package com.audy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HasilActivity extends AppCompatActivity {
    Button btnkembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        btnkembali = (Button) findViewById(R.id.btnkembali);

        btnkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnkembali1= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(btnkembali1);
            }
        });
    }
}