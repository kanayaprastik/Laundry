package com.audy.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    EditText EDname, EDaddress, EDEmail, EDNomor;
    Spinner SpJK, spAgama;
    Button btnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        EDname = findViewById(R.id.EDnama);
        EDaddress = findViewById(R.id.EDalamat);
        EDEmail = findViewById(R.id.EDemail);
        EDNomor = findViewById(R.id.EDnomor);
        SpJK = findViewById(R.id.spinnerJK);
        spAgama = findViewById(R.id.spinnerAgama);
        btnsave = findViewById(R.id.btnsimpan);
    }
}