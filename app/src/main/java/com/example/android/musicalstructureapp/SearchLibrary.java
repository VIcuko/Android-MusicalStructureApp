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
        setContentView(R.layout.activity_search_library);
        Button playSong = (Button) findViewById(R.id.play_song);
        Button buySong = (Button) findViewById(R.id.buy_song);
        Button playingNow = (Button) findViewById(R.id.playing_now);
        Button map = (Button) findViewById(R.id.map);


        playSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(SearchLibrary.this, Playing.class);
                startActivity(loginIntent);
            }
        });

        buySong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(SearchLibrary.this, Payment.class);
                startActivity(loginIntent);
            }
        });

        playingNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(SearchLibrary.this, Playing.class);
                startActivity(loginIntent);
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(SearchLibrary.this, MusicMap.class);
                startActivity(loginIntent);
            }
        });
    }
}
