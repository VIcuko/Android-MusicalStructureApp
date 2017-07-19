package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SearchLibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        Button toPlaying = (Button) findViewById(R.id.library_playing);
        Button toPayment = (Button) findViewById(R.id.library_payment);
        Button toPlaying2 = (Button) findViewById(R.id.library_playing2);
        Button toMap = (Button) findViewById(R.id.library_map);


        toPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(SearchLibrary.this, Playing.class);
                startActivity(loginIntent);
            }
        });

        toPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(SearchLibrary.this, Payment.class);
                startActivity(loginIntent);
            }
        });

        toPlaying2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(SearchLibrary.this, Playing.class);
                startActivity(loginIntent);
            }
        });

        toMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(SearchLibrary.this, MusicMap.class);
                startActivity(loginIntent);
            }
        });
    }
}
