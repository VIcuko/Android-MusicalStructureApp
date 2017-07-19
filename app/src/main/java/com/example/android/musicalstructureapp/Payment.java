package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        Button toLibrary = (Button) findViewById(R.id.payment_library);
        Button toLibrary2 = (Button) findViewById(R.id.payment_library2);

        toLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(Payment.this, SearchLibrary.class);
                startActivity(loginIntent);
            }
        });

        toLibrary2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(Payment.this, SearchLibrary.class);
                startActivity(loginIntent);
            }
        });

    }
}
