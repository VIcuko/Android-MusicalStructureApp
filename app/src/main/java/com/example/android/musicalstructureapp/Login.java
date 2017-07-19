package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.example.android.musicalstructureapp.R.layout.login;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(login);
        Button toLibrary = (Button) findViewById(R.id.login_library);

        toLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(Login.this, SearchLibrary.class);
                startActivity(loginIntent);
            }
        });
    }
}
