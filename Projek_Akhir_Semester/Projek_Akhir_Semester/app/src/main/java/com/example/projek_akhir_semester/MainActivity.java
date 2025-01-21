package com.example.projek_akhir_semester;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    CardView cardView, cardView2, cardView3, cardView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());

        TextView textViewDate = findViewById(R.id.date);
        textViewDate.setText(currentDate);

        imageView = findViewById(R.id.gmbr);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gmbr = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(gmbr);
            }
        });

        cardView2 = findViewById(R.id.bungkusformulir);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bungkusformulir = new Intent(MainActivity.this, FormulirActivity.class) ;
                startActivity(bungkusformulir);
            }
        });

        cardView = findViewById(R.id.bungkuscalculator);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bungkuscalculator = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(bungkuscalculator);
            }
        });

        cardView3 = findViewById(R.id.bungkuskonversi);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bungkuskonversi = new Intent(MainActivity.this, KonversiActivity.class);
                startActivity(bungkuskonversi);
            }
        });

        cardView4 = findViewById(R.id.bungkusprofil);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bungkusprofil = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(bungkusprofil);
            }
        });
    }
}