package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MusicMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_map);
        Button toLibrary = (Button) findViewById(R.id.map_library);
        Button toPlaying = (Button) findViewById(R.id.map_playing);

        toLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(MusicMap.this, SearchLibrary.class);
                startActivity(loginIntent);
            }
        });

        toPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(MusicMap.this, Playing.class);
                startActivity(loginIntent);
            }
        });
    }
}
