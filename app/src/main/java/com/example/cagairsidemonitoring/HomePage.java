package com.example.cagairsidemonitoring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    private Button FlightInfo, Start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        FlightInfo = (Button) findViewById(R.id.btnFlightInfo);
        FlightInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (HomePage.this, FlightInfo.class);
                startActivity(intent);

            }
        });

        Start = (Button)findViewById(R.id.btnStart);
        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (HomePage.this, Start.class);
                startActivity(intent);
            }
        });
    }

}
